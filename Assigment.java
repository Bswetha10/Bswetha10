package seliniumProject;

public class Assigment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 371, b, r, result = 0;
        b = a;
        while (b != 0) {
        	r = b % 10;
        	result += Math.pow(r, 3);
        	b /=10;
        }
        if(result == a)
        	System.out.println(a +"is an armstrong number.");
        else
        	System.out.println(a+"is not an armstrong number");
	}

}
