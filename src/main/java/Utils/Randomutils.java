package Utils;
import static Utils.SupplyUtils.*;

public class Randomutils {
    /* Business layer */

    private Randomutils(){}

    public static int getRandomNum(){
        return generateRandomNumber(100,1000);
    }

    public static String getFirstName(){
        return  generateRandomFirstName();
    }

    public static String getLastName(){
        return generateRandomLastName();
    }

    public static String getEmail(){
        return generateRandomEmail();
    }
}
