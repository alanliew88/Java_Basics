import com.sun.tools.javac.Main;

import java.sql.SQLOutput;

public class Vehicle {   //create class name Vehicle
    String color = "yellow" ;  //create attributes color
    int numberoftires = 4;  //create attributes numberoftires


    // class - object - attributes
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        System.out.println("This car is in"+ car.color);
        System.out.println("This car has"+ car.numberoftires +"tires");
    }


}
