public class Java_Class_and_Object_Vehicle {   //create class name Vehicle
    String color = "yellow" ;  //create attributes color
    int numberoftires = 4;  //create attributes numberoftires


    // class - object - attributes
    public static void main(String[] args) {
        Java_Class_and_Object_Vehicle protonsaga = new Java_Class_and_Object_Vehicle();
        Java_Class_and_Object_Vehicle ferrair = new Java_Class_and_Object_Vehicle();
        System.out.println("This car is in"+ protonsaga.color);
        System.out.println("This car has"+ " "+  protonsaga.numberoftires+ " " +"tires");
        System.out.println("Ferrari has"+ " "+ ferrair.numberoftires + " " + "tires too.");
    }

}
