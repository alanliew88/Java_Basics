import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class Vehicle {   //create class name Vehicle
    String color = "yellow" ;  //create attributes color
    int numberoftires = 4;  //create attributes numberoftires


    // class - object - attributes
    public static void main(String[] args) {
        Vehicle protonsaga = new Vehicle();
        Vehicle ferrair = new Vehicle();
        System.out.println("This car is in"+ protonsaga.color);
        System.out.println("This car has"+ " "+  protonsaga.numberoftires+ " " +"tires");
        System.out.println("Ferrari has"+ " "+ ferrair.numberoftires + " " + "tires too.");
    }

}
