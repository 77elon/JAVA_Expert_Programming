import java.io.*;
import java.util.*;

public class TextSearch 
{
	private static void Input_HashMap(HashMap<String, String> SavePoint)
	{
		InputStreamReader Text = null;
		try
		{
			Text = new InputStreamReader(new FileInputStream("C:\\Temp\\phone.txt"), "UTF-8");
			Scanner scanner = new Scanner(Text);
			while (scanner.hasNextLine()) //How to Save?
			{
				String Name, Num;

				Name = scanner.next();
				Num = scanner.nextLine();
				SavePoint.put(Name, Num);

				//System.out.println(Name + Num); //Status Check
			}
			/*while((c = Text.read()) != -1) //Check
			{
				System.out.print((char)c);
			}*/
			Text.close();
			scanner.close();
			System.out.println("총 " + SavePoint.size() +"개의 전화번호부가 입력되었습니다.");
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	private static void Check_HashMap(HashMap<String, String> SavePoint)
	{
		Scanner Input1 = new Scanner(System.in); //Pause
		while(true)
		{
			System.out.print("이름 >> ");
			String Name = null;
			Name = Input1.next();

			String result = SavePoint.get(Name);
			if(Name.equals("그만"))
			{
				System.out.println("프로그램을 종료합니다.");
				Input1.close();
				break;
			}
			else if(result == null)
			{
				System.out.println("다시 입력해주세요!");
			}
			else
			{
				System.out.println(result);
			}
		}
	}
	
	public static void main(String[] args)
	{
		HashMap<String, String> SavePoint = new HashMap<String, String> ();
		Input_HashMap(SavePoint);
		Check_HashMap(SavePoint);
	}
}
