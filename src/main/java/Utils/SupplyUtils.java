package Utils;

import com.github.javafaker.Faker;

public class SupplyUtils {
   /*Supply layer*/

    private SupplyUtils(){}

    public static int generateRandomNumber(int start, int end){
        return new Faker().number().numberBetween(start,end);
    }

    public static String generateRandomFirstName(){
        return new Faker().name().firstName();
    }

    public static String generateRandomLastName(){
        return new Faker().name().lastName();
    }

    public static String generateRandomEmail(){
        return new Faker().name()+"@example.com";
    }
}
