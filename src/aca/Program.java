package aca;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
static	String username="";
static	String password="";
static List<String> telnumbers=new ArrayList();
public static void main(String[] args)
{
	
	checkcommand();
	}
public static void checkcommand()
{
	String command;
	System.out.println(">> Please write down one of this commands \"Sign In\" or \"Sign Up\".");
	Scanner scan = new Scanner(System.in);
	
	command=scan.nextLine();
	switch(command)
	{
	case "Sign In":
		
		signInCommands(3);
		break;
	case "Sign Up":
		System.out.println("You where exite in your acaount");
		signUpCommands();break;
	case "help":
		System.out.println("help page");
	break;
	case "Sign Out":
		username="";
		password="";
		telnumbers=new ArrayList();
	break;
	default: System.out.println("Invalid command");
	}
	 checkcommand();
	}
public static void signUpCommands()
{
	Scanner scan = new Scanner(System.in);
	System.out.println(">> Please provide your username:");
	System.out.print("<<");
	username=scan.nextLine();
	System.out.println(">> Please provide your password:");
	System.out.print("<<");
	password=scan.nextLine();
	System.out.println(">> You have successfully created user. Please write down one of this commands \"Sign In\" or \"Sign Up\".");
	}
public static void signInCommands(int n)
{
	n--;
	if(n!=0)
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println(">> Please provide your username:");
		System.out.print("<<");
		String usname=scan.nextLine();
		System.out.println(">> Please provide your password:");
		System.out.print("<<");
		String pword=scan.nextLine();
		if(usname.equals(username) && pword.equals(pword))
		{
			System.out.println(">>You are successfully logged in \n >>Now you can write down one of this commands \"Add Tel. Numb\" or \"Show Tel. Numbers\"'");
			String command;
			boolean a=true;
			
			
			while(a){
				
				command=scan.nextLine();
				switch(command){
				case "Add Tel. Numb":
					String tellnumb;
					System.out.println(">> Please provide your telephone number");
					System.out.print("<<");
					tellnumb=scan.nextLine();
					telnumbers.add(tellnumb);
					System.out.println(">>You have successfully added your number. If you want to add one more please write \"Add Tel. Numb\". If you want to see your numbers list please write \"Show Tel. Numbers\"'");
					break;
				case "Show Tel. Numbers":
					System.out.println(telnumbers);
					default:System.out.println("Invalid command");
					a=false;
					
				}	
			}
		}
		else
		{
			System.out.println(">>Your username or password is incorrect please try again");	
			signInCommands(n);
			
		}
	}
	}

}
