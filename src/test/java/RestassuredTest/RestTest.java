package RestassuredTest;

import Patterns.Employee;
import Utils.Uri;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import static com.utils.Apiutils.*;
import static Utils.Randomutils.*;

public class RestTest {

    @Test(priority = 0)
    public void getTest(){
        Response response = apiUtils().contentType(ContentType.JSON)
                .when().get(Uri.EMPLOYEES.getValue());

        response.prettyPrint();


    }

    @Test(priority = 1)
    public void postTest(){
        Employee emp = Employee.builder().setId(getRandomNum()).setFirst_name(getFirstName()).setLast_name(getLastName())
                .setEmail(getEmail()).perform();

        Response response = apiUtils().contentType(ContentType.JSON).body(emp)
                .when().post(Uri.EMPLOYEES.getValue());

        response.prettyPrint();


    }
}
