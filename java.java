import java.util.Calendar;


public class java{
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());

        cal.add(Calendar.DATE,1000);
        System.out.println(cal.getTime());
    }
}