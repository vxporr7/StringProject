import java.sql.SQLOutput;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        boolean tandf = true && false;
        boolean torf = true || false;
        System.out.println("True and false is " + tandf);
        System.out.println("True or False is " + torf);
        boolean complex = (5>8) || (3<9);
        System.out.println("The output of complex boolean is " + complex);
        char t = 't';
        String myString = "This is IT1090";
        String titleString = "Computer Programming";
        System.out.println("My string is " + myString);
        String lower = myString.toLowerCase();
        System.out.println("Lower case string is "+ lower);

        String complexString ="Name: "+myString +"\n"+"Title: "+titleString;
        System.out.println(complexString);

    }
}