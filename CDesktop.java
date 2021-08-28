package week3Assig;

public class CDesktop extends Computer {
	public void desktopSize() {
		System.out.println("36cm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Computer*******");
		Computer c = new Computer();
		c.computerModel();
		System.out.println("*******Desktop********");
		CDesktop D = new CDesktop();
		D.computerModel();
		D.desktopSize();
	}

}
