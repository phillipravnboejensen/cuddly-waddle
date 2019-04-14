
public class Alarmclock{

	public static void main(String[] args) {
			String alarmPromptOutput;
			String hourSettingOutput;	
			String userHourOutput;
			String userMinuteOutput;
			String userSecondOutput;
			String postAlarmOutput;
			String editOutput;
			
			alarmPromptOutput = TimeUnit.alarmPrompt();
			hourSettingOutput = TimeUnit.hourSetting();
			
//			Possible way of organizing - instead of methods - usage of case switch w/ argument (Integer method)
//			userHourOutput = TimeUnit.userHour(0);
//			userHourOutput = TimeUnit.userHour(1);
//			userHourOutput = TimeUnit.userHour(2);

			userHourOutput = TimeUnit.userHour();
				System.out.println("Alarm set to " + userHourOutput + " " + hourSettingOutput);
			
			userMinuteOutput = TimeUnit.userMinute();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + " " + hourSettingOutput);
				
			userSecondOutput = TimeUnit.userSecond();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + ":" + userSecondOutput + " " + hourSettingOutput +"\n");

				
				postAlarmOutput = TimeUnit.postAlarm();
				System.out.println(postAlarmOutput);
				
			if(postAlarmOutput != "e") { 
				System.exit(1);
			} else {
		
			editOutput = TimeUnit.editOutput();
			if (editOutput == "1") {
				userHourOutput = TimeUnit.userHour();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + ":" + userSecondOutput + " " + hourSettingOutput +"\n");
				
			}
			if (editOutput == "2") {
				userMinuteOutput = TimeUnit.userMinute();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + ":" + userSecondOutput + " " + hourSettingOutput +"\n");

			}
			if (editOutput == "3") {
				userSecondOutput = TimeUnit.userSecond();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + ":" + userSecondOutput + " " + hourSettingOutput +"\n");

			}
			if (editOutput == "4") {
				hourSettingOutput = TimeUnit.hourSetting();
				System.out.println("Alarm set to " + userHourOutput + ":" + userMinuteOutput + ":" + userSecondOutput + " " + hourSettingOutput +"\n");
			}
			}
	}
}

	
	



