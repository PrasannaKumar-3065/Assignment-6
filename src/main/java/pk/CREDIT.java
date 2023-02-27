package pk;
import java.util.logging.*;

class CREDIT{
    private static final Logger LOGGER =  Logger.getLogger("InfoLogging");
    String holdername;
    int number;
    String date;
    CREDIT(String holdername, int number, String date){
        this.holdername = holdername;
        this.number = number;
        this.date = date;
    }
    CREDIT(CREDIT obj)
    {
        holdername=obj.holdername;
        number=obj.number;
        date=obj.date;

    }
    void check(int number){
        if(number == this.number){
            LOGGER.info("Same card number");
        }
        else{
            LOGGER.info("Different card number");
        }
    }
}
