import java.util.Scanner;
public class Person{
    public static void taxCount(int result){
        float sunTax = 0;
        int i = 0;
        result-=150000;
        if(result>0){
            i++;
            if(result-150000 > 0){
                System.out.println("Tax is 5%");
                sunTax += 150000*(5f/100);
                result-=150000;
            }
            else{
                System.out.println("Tax is 5%");
                sunTax += result*(5f/100);
                result-=150000;
            }
        }
        if(result>0){
            i++;
            if(result-150000 > 0){
                System.out.println("Tax is 10%");
                sunTax += 150000*(10f/100);
                result-=150000;
            }
            else{
                System.out.println("Tax is 10%");
                sunTax += result*(10f/100);
                result-=150000;
            }
        }
        if(result>0){
            i++;
            if(result-200000 > 0){
                System.out.println("Tax is 15%");
                sunTax += 200000*(15f/100);
                result-=200000;
            }
            else{
                System.out.println("Tax is 15%");
                sunTax += result*(15f/100);
                result-=200000;
            }
        }
        if(result>0){
            i++;
            if(result-250000 > 0){
                System.out.println("Tax is 20%");
                sunTax += 250000*(20f/100);
                result-=250000;
            }
            else{
                System.out.println("Tax is 20%");
                sunTax += result*(20f/100);
                result-=250000;
            }
        }
        if(result>0){
            i++;
            if(result-1000000 > 0){
                System.out.println("Tax is 25%");
                sunTax += 1000000*(25f/100);
                result-=1000000;
            }
            else{
                System.out.println("Tax is 25%");
                sunTax += result*(25f/100);
                result-=1000000;
            }
        }
        if(result>0){
            i++;
            if(result-3000000 > 0){
                System.out.println("Tax is 30%");
                sunTax += 3000000*(30f/100);
                result-=3000000;
            }
            else{
                System.out.println("Tax is 30%");
                sunTax += result*(30f/100);
                result-=3000000;
            }
        }
        if(result > 0){
            i++;
            if(result-5000000 > 0){
                System.out.println("Tax is 35%");
                sunTax += 5000000*(35f/100);
                result-=5000000;
            }
            else{
                System.out.println("Tax is 35%");
                sunTax += result*(35f/100);
                result-=5000000;
            }
        }
        System.out.println(sunTax);
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
            System.out.println("Input other income : ");
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