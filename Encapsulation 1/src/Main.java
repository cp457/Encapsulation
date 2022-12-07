import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ////// ");

        System.out.println("");
        house.address = scanner.next();

        System.out.println("Insert your number");
        house.floorNumbers = scanner.nextInt();


        System.out.println("Metti qui i nomi xd");
        house.residentNames = scanner.next().split(",");


        System.out.printf(String.format("The address is %s ", house.getAddress()));
        System.out.printf("The floor number are %d ", house.getFloorNumbers());
        System.out.printf("", Arrays.toString (house.getResidentNames()));








    }




}
