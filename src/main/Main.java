package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println("1.Register");
		System.out.println("2.Login");
		int x;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		x=Integer.parseInt(br.readLine());
		
		RegisterPojo registerpojo=new RegisterPojo();
		RegisterDAO registerdao=new RegisterDAO();
		
		LoginPojo loginpojo=new LoginPojo();
		LoginDAO logindao=new LoginDAO();
		
		switch(x)
		{
		case 1:
			System.out.println("enter first name");
		String firstname=br.readLine();
		System.out.println("enter last name");
		String lastname=br.readLine();
		System.out.println("enter username name");
		String username=br.readLine();
		System.out.println("enter password name");
		String password=br.readLine();
		System.out.println("enter email");
		String email=br.readLine();
		
		registerpojo.setFirstname(firstname);
		registerpojo.setLastname(lastname);
		registerpojo.setUsername(username);
		registerpojo.setPassword(password);
		registerpojo.setEmail(email);
		
		registerdao.addUser(registerpojo);
		break;
		case 2:
			System.out.println("enter first name");
			String name=br.readLine();
			System.out.println("enter last name");
			String pass=br.readLine();
			loginpojo.setUsername(name);
			loginpojo.setPassword(pass);
			
			if(logindao.validate(loginpojo)==true)
			{
				Luck luck=new Luck();
				luck.display();
			}
			else
				System.out.println("IncorrectPassword");
			break;
		}
			

	}

}
