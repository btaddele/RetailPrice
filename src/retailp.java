import java.util.Scanner;

public class retailp {
    public static void main(String args[]) {
        String cont;
        double cost, retail;
        double rate = 2.5;
        boolean boo = false;

        Scanner keybd = new Scanner(System.in);

        do {
            System.out.print("wholesale price? ");
            cost = keybd.nextDouble();
            keybd.nextLine();
            retail = cost * rate;
            System.out.println("Retail price = " + retail);
            System.out.println("Is there a shipment today? (Yes/No)");
            cont = keybd.nextLine();
            if(cont.equalsIgnoreCase("no")){
                boo = true;
            }
        }while (boo==false);
        System.out.println("Ok thanks have a nice day!!!");
    }
}
