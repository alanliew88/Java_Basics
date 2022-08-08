public class Java_Attribute_Overwrite {
    //final int x = 5; //if use this final , error will appear and value of x will be final and cant modified

    int x =5;

    public static void main(String[] args) {
        Java_Attribute_Overwrite Obj = new Java_Attribute_Overwrite();
        Obj.x  = 25 ; //overwrite the value
        System.out.println("Value of x is :"+ Obj.x);
    }
}
