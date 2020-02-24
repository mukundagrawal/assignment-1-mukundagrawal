package person;

import java.util.ArrayList;

public class Person {
    private String f_name;
    private String l_name;
    private ArrayList<String> p_number ;
    private String email ;

    public Person(String f_name, String l_name, ArrayList<String> p_number, String email) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.p_number = p_number;
        this.email = email;
    }



}
