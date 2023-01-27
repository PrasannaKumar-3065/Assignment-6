package pk;
import java.util.*;
import java.util.logging.*;

/*"1. Design a class for a simple database connection pool. The class should have the following features:
    - A private constructor to prevent the class from being instantiated directly.
    - A static method that returns an instance of the class (following the singleton pattern).
    - A method that returns a new connection to the database.
    - A method that closes all open connections and releases them back to the pool.
2. Design a class for a basic point in 2D space. The class should have the following features:
    - Instance variables for the x and y coordinates of the point.
    - A constructor that allows the user to create a point with given x and y coordinates.
    - An equals method that returns true if the given object is a point with the same x and y coordinates, and false otherwise.
    - A clone method that creates and returns a new point with the same x and y coordinates as the original point.
3. Design a class for a basic credit card. The class should have the following features:
    - Instance variables for the cardholder's name, card number, and expiration date.
    - A constructor that allows the user to create a credit card with a given name, card number, and expiration date.
    - An equals method that returns true if the given object is a credit card with the same card number, and false otherwise.
    - A clone method that creates and returns a new credit card with the same name, card number, and expiration date as the original credit card."*/
class credit implements Cloneable{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    String holdername;
    int number;
    String date;
    credit(String holdername, int number, String date){
        this.holdername = holdername;
        this.number = number;
        this.date = date;
    }
    void check(int number){
        if(number == this.number){
            LOGGER.info("Same card number");
        }
        else{
            LOGGER.info("Different card number");
        }
    }
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class App 
{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter Name: ");
        String holdername = sc.next();
        LOGGER.info("Enter card number: ");
        int number  = sc.nextInt();
        LOGGER.info("Enter Expiration: ");
        String date = sc.next();
        credit c = new credit(holdername, number, date);
        credit c1 = (credit)c.clone();
        String s = "New Credit Card Details :\nHoldername: "+c1.holdername+"\nCard number : "+c1.number+"\nExpiration Date: "+c1.date;
        int n = 1;
        LOGGER.info(s);
        do{
            LOGGER.info("1.Edit new Card 2.Edit old Card 3.Check old vs new 4.Exit");
            int m = sc.nextInt();
            if(m == 1){
                LOGGER.info("Enter Name: ");
                c1.holdername = sc.next();
                LOGGER.info("Enter card number: ");
                c1.number  = sc.nextInt();
                LOGGER.info("Enter Expiration: ");
                c1.date = sc.next();
                s = "Updated Credit Card Details :\nHoldername: "+c1.holdername+"\nCard number : "+c1.number+"\nExpiration Date: "+c1.date;
                LOGGER.info(s);
            }
            else if(m == 2){
                LOGGER.info("Enter Name: ");
                c.holdername = sc.next();
                LOGGER.info("Enter card number: ");
                c.number  = sc.nextInt();
                LOGGER.info("Enter Expiration: ");
                c.date = sc.next();
                s = "Updated Credit Card Details :\nHoldername: "+c.holdername+"\nCard number : "+c.number+"\nExpiration Date: "+c.date;
                LOGGER.info(s);
            }
            else if(m == 3){
                c.check(c1.number);
            }
            else{
                n=0;
            }
        }while(n == 1);

    }
}
