package myprojects.learningjava.condition;

public class Login_ID_AND_PW {

	public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("nanoyslee") && password.equals("1234")) {
            System.out.println("Your ID and PW is correct");
        } else {
            System.out.println("Your ID and PW is incorrect");
        }
	}
}
