package person;

import java.util.ArrayList;

public class Person {
    private String first_name;
    private String last_name;
    private ArrayList<String> mobile_number ;
    private String email ;

    public Person(String first_name, String last_name, ArrayList<String> mobile_number, String email) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.mobile_number = mobile_number;
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getP_number() {
        return mobile_number;
    }

    public void setP_number(ArrayList<String> mobile_number) {
        this.mobile_number = mobile_number;
    }

    public String getL_name() {
        return last_name;
    }

    public void setL_name(String l_name) {
        this.last_name = last_name;
    }

    public String getF_name() {
        return first_name;
    }

    public void setF_name(String f_name) {
        this.first_name = f_name;
    }
}




