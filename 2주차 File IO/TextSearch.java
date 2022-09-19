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
			System.out.println("�� " + SavePoint.size() +"���� ��ȭ��ȣ�ΰ� �ԷµǾ����ϴ�.");
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
			System.out.print("�̸� >> ");
			String Name = null;
			Name = Input1.next();

			String result = SavePoint.get(Name);
			if(Name.equals("�׸�"))
			{
				System.out.println("���α׷��� �����մϴ�.");
				Input1.close();
				break;
			}
			else if(result == null)
			{
				System.out.println("�ٽ� �Է����ּ���!");
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
