import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int age,tripType;
        double km;
        double perkm= 0.10; //Price per distance.
        double price = 0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the age : " );
        age = input.nextInt();

        System.out.print("Enter the tripType (1-for oneway, 2-return trip ): " );
        tripType =input.nextInt();

        System.out.print("Enter the distance in kilometers  : ");
        km = input.nextDouble();

        if (km >=0 && (tripType ==1 || tripType ==2) && (age >=0 && age <=121)){



        if (tripType == 1){
            price = km * perkm;
        } else if (tripType ==2 ){
            price = 2 * km * perkm * 0.8 ;
        }  else  {
            System.out.println("You entered incorrect data ! ");
        }
          // Apply discount based on age.

        if (age < 12){
            price *= 0.5;
        } else if (age > 12  && age<24){
            price *= 0.90;
        } else if (age > 65) {
            price *= 0.70;
        }
        System.out.println("Total price " + price);
        } else {
            System.out.println("İnvalid volue ");
        }
    }
}