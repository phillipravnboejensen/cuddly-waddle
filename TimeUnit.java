import java.util.InputMismatchException;
import java.text.DecimalFormat;
import java.util.Scanner;


public class TimeUnit{

	
	
// Method for alarmPrompt
public static String alarmPrompt() {
	boolean alarmPrompt = true;
	Scanner in = new Scanner(System.in);
	System.out.println("Would you like to set a new alarm?\nIf yes - type 'yes'\nIf no - type 'no'");
	String userString;
	String fail;
	fail = "invalid input";
	
	while(alarmPrompt){
	userString = in.nextLine();
	if (userString.equals("yes")) {
	return(userString);
	}
	if (userString.equals("no")) {
		System.out.println("Fine...");
		System.exit(1);
}
	else {
		System.out.println("You did not enter a valid response!\n"
	+ "You have to enter yes or no...");
	continue;
}
}
	return(fail);

	
}

// Method for hourSetting
public static String hourSetting() {
	boolean hourSettingBoolean = true;
	Scanner in = new Scanner(System.in);
	System.out.println("Would you like it set in AM or PM? \n For AM, write AM \n For PM, write PM");
	String fail = "invalid input";
	String hourSettingString;
	
	while (hourSettingBoolean) {
	hourSettingString = in.nextLine();
	if (hourSettingString.equals("AM")|| hourSettingString.equals("am")||hourSettingString.equals("Am")||hourSettingString.equals("aM") ){
	System.out.println("Your alarm has been set to AM");
	hourSettingString = "AM";
	return(hourSettingString);
}
	else if (hourSettingString.equals("PM")|| hourSettingString.equals("pm")||hourSettingString.equals("Pm")||hourSettingString.equals("pM")){
		System.out.println("Your alarm has been set to PM");
		hourSettingString = "PM";
	return(hourSettingString);
}
	else {
	System.out.println("You did not enter a valid response!\n"
			+ "You have to select either AM or PM...");
	continue;
}
}
	return(fail);

}

// New method for userHour
public static String userHour() {
	Scanner in = new Scanner(System.in);
		String fail;
		int userHour;
		boolean tryAgain = true;
		System.out.println("Write the hour of the alarm:");
		while(tryAgain) {
		try {userHour = in.nextInt(); 

			if (userHour >= 10 && userHour <= 12){
			return(userHour + "");
			}
			else if (userHour < 10) {
			return("0" + userHour);
			}
			else {
				System.out.println("Please enter an integer between 0 and 12 ");
				continue;	
			}
			}
			catch (InputMismatchException e1) {
				System.out.println("Please enter an integer");
				System.out.println("Try again");
				in.next();
			}
		}
		fail = 0 +"";
		return(fail);
	}

// New method for userMinute
public static String userMinute() {
	Scanner in = new Scanner(System.in);
	String fail;
	int userMinute;
	boolean tryAgain = true;
		System.out.println("Write the minute of the alarm:");
	while(tryAgain) {
		try {userMinute = in.nextInt(); 

		if (userMinute >= 10 && userMinute <= 59){
			return(userMinute + "");
		}
		else if(userMinute < 10) {
			return("0" + userMinute);
		}
		else {
			System.out.println("Please enter an integer between 0 and 59");
			continue;
		}
		}
		catch (InputMismatchException e1) {
			System.out.println("Please enter an integer");
			System.out.println("Try again");
			in.next();
		}
	}
	fail = 0 + "";
	return(fail);
}

//New method for userSecond
public static String userSecond() {
	Scanner in = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("00");	
	String fail;
	int userSecond;
	boolean tryAgain = true;
		System.out.println("Write the second of the alarm:");
	while(tryAgain) {
		try {userSecond = in.nextInt(); 

		if (userSecond >= 10 && userSecond <= 59){
			return(userSecond + "");
		}
		else if(userSecond < 10) {
			return("0" + userSecond);
		}
		else {
			System.out.println("Please enter an integer between 0 and 59");
			continue;
		}
		}
		catch (InputMismatchException e1) {
			System.out.println("Please enter an integer");
			System.out.println("Try again");
			in.next();
		}
	}
	fail = 0 +"";
	return(fail);
}

//New Method for Post-Alarm
public static String postAlarm() {
	Scanner in = new Scanner(System.in);
	boolean tryAgain = false;
//	do {
//		System.out.println("To confirm alarm, press 'y'\nTo cancel alarm, press"
//				+ "'c'\nTo edit, press 'e'");
//		char userResponse = in.next().charAt(0);
//	switch(userResponse) {
//	case 'y':
//		userResponse = 'y';
//		String confirm = "Alarm confirmed";
//		return(confirm);
//	
//	case 'c':
//		userResponse = 'c';
//		String cancel = "Alarm cancelled";
//		return(cancel);	
//	
//	case 'e':
//		userResponse = 'e';
//		String edit = "What would you like to edit?";
//		return(edit);
//	
//	default:
//		System.out.println("Invalid input.. Please try again");
//		break;
//	}	
//	tryAgain = true;}
//	
//	while (tryAgain);
//	return("Invalid input");
	while (tryAgain == false){
	System.out.println("To confirm alarm, press 'y'\nTo cancel alarm, press"
				+ "'c'\nTo edit, press 'e'");
	String userResponse = in.nextLine();
		switch(userResponse) {
			case "y":
			userResponse = "y";
				String confirm = "Alarm confirmed";
				return(confirm);
	
			case "c":
			userResponse = "c";
				String cancel = "Alarm cancelled";
				return(cancel);	
	
			case "e":
			userResponse = "e";
				return(userResponse);
	
			default:
				System.out.println("Invalid input.. Please try again");
				break;
		
		}
	}
	return("Invalid input.. Please try again");
}

//New Method for edit
public static String editOutput() {
	Scanner in = new Scanner(System.in);
	boolean tryAgain = false;
	while (tryAgain == false)	
	 {
		System.out.println("Press 1 to edit the hour\nPress 2 to edit the minute\nPrees 3 to edit the second\nPress 4 to change between AM or PM");
		String userResponse = in.nextLine();
	switch(userResponse) {
	case "1":
		userResponse = "1";
		return(userResponse);
	
	case "2":
		userResponse = "2";
		return(userResponse);	
	
	case "3":
		userResponse = "3";
		return(userResponse);
	
	case "4":
		userResponse = "4";
		return(userResponse);
	
	default:
		System.out.println("Invalid input.. Please try again");
		break;
	}}
	{
	return("Invalid input");
	}
	 
}
}