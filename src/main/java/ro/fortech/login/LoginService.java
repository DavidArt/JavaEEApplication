package ro.fortech.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if(user.equalsIgnoreCase("David") && password.equals("iggy"))
			return true;
		return false;
	}
}
