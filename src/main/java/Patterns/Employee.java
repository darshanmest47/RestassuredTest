package Patterns;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@JsonInclude(value= JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder(value={"id","first_name","last_name","email"})
@Builder(setterPrefix = "set",buildMethodName = "perform")
public class Employee {

    private int id;
    private String first_name;
    private String last_name;
    private String email;
}
