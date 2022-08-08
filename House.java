public class House {
    int numberofdoors = 5;
    String address = "Jalan 123, Taman 123, 43200 Cheras";


    public static void main(String[] args) {
        House myhouse = new House();
        System.out.println("My house has" + " " + myhouse.numberofdoors+ " " +"doors");
        System.out.println("My house address is :"+ myhouse.address);
    }

}


