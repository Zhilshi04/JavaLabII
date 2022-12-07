
import java.util.Scanner;
public class PersonalIncomeTax{
    public static void taxCount(int result){
        int sa,tax,xi;
        float a;
        if(result <= 150000){
            xi = 0;
            a = result;
            sa = 0;
            tax = 0;
        }
        else if(result >150000 && result <= 300000){
            xi = 150000;
            a = (result-xi)*(5f/100f);
            sa = 0;
            tax = 5;
        }
        else if(result >300000 && result <= 500000){
            tax = 10;
            xi = 300000;
            a = (result-xi)*(10f/100f);
            sa = 7500;
        }
        else if(result >500000 && result <= 750000){
            tax = 15;
            xi = 500000;
            a = (result-xi)*(15f/100f);
            sa = 27500;
        }
        else if(result >750000 && result <= 1000000){
            tax = 20;
            xi = 750000;
            a = (result-xi)*(20f/100f);
            sa = 65000;
        }
        else if(result >1000000 && result <= 2000000){
            tax = 25;
            xi = 1000000;
            a = (result-xi)*(25f/100f);
            sa = 115000;
        }
        else if(result >2000000 && result <= 5000000){
            tax = 30;
            xi = 2000000;
            a = (result-xi)*(30f/100f);
            sa = 365000;
        }
        else{
            tax = 35;
            sa = 1265000;
            xi = 5000000;
            a = (result-xi)*(35f/100f);
        }
        System.out.println("Tax is " + tax + "%");
        if(tax == 0){
            System.out.println("Your Tax = Free Tax");
        }
        else{
            if(sa == 0){
                System.out.println("Cal Tax " + result + " - " + xi + " = " + (result-xi) + " * " + tax + "%" + " = " + (int)a);
                System.out.println("Your Tax" + " = " + (int)a + "BTH");
            }
            else{
                System.out.println("Step 2");
                System.out.println("Cal Tax " + result + " - " + xi + " = " + (result-xi) + " * " + tax + "%" + " = " + (int)a);
                System.out.println("Step 1");
                System.out.println("Cal Tax " + 5 + " * " + tax + "%" + " = " + sa + "Your tax" + " = " + ((int)a+sa));
            }
        }
    }
    public static void main(String[] args) {
        int result;
        Scanner sc_salay = new Scanner(System.in);
        Scanner sc_cyear = new Scanner(System.in);
        Scanner sc_taxd = new Scanner(System.in);
        Scanner sc_incost = new Scanner(System.in);
        Scanner sc_str = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        int salay = sc_salay.nextInt();
        System.out.print("Enter Year cost : ");
        int costYear = sc_cyear.nextInt();
        System.out.print("Enter Tax : ");
        int taxDeuction = sc_taxd.nextInt();
        System.out.print("You have other income? ");
        String check = sc_str.next();
        char income = check.charAt(0);
        int salayYear = salay*12;
        
        if(income == 'Y'){
            int incomeCost = sc_incost.nextInt();
            result = salayYear-costYear-taxDeuction+incomeCost;
            System.out.println("Income : (" + salay + "x12) - " + costYear + " - " + taxDeuction + " - "  +incomeCost + " = " + result  );      
            taxCount(result);
        }
        else if(income == 'N'){
            result = (salayYear-costYear)-taxDeuction;
            System.out.println("Income : (" + salay + "x12) - " + costYear + " - " + taxDeuction + " = " + result  );
            taxCount(result);
        }
    }
}
