import java.util.Scanner;

public class Thread_Submission extends Thread {
	
	@Override
	public void run() {
		System.out.println("스레드 실행 시작");
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("스레드 종료");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("아무키나 입력 >> ");
		scanner.nextLine();
		scanner.close();
		Thread_Submission thread1 = new Thread_Submission();
		thread1.start();

	}

}
