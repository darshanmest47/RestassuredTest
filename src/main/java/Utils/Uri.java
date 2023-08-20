package Utils;

public enum Uri {

    URI("http://localhost:3000"),
    EMPLOYEES("/employees");

     String value ="";

    Uri(String s) {
        value =s;
    }


    public  String getValue(){
        return value;
    }


}
