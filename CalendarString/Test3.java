import java.util.Calendar;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args)throws Exception {
        //Read from keyboard, runs until the user types empty line
        Scanner sc=new Scanner(System.in);



        while(true) {
            System.out.print("Enter Date(MM/DD/YYYY) : ");
            String s=sc.nextLine();
            if(s.length()==0) {
                break;
            }
            String arr[]=s.split("/");
            int month=Integer.parseInt(arr[0]);
            int date=Integer.parseInt(arr[1]);
            int year=Integer.parseInt(arr[2]);
            String day=dayOfWeek(month,date,year);
            System.out.println("Day of the week is "+day+" ");
        }

//String with day names and calculator method
    }


    public static String dayOfWeek(int month, int day, int year) {
        Calendar cal=Calendar.getInstance();
        cal.set(year, month-1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        String[ ] dayNames = {"", "Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday"};

        return dayNames[dayOfWeek];
    }

}
