import java.util.Scanner;
public class PersonalIncomeTax{
    public static void taxCount(int result){
        int n = result;
        int[] taxs = new int[7];
        int[] nums = new int[7];
        float sunTax = 0;
        int i = 0;
        n-=150000;
        if(n>0){
            taxs[i] = 5;
            if(n-150000 > 0){
                nums[i] = 150000;
                sunTax += 150000*(5f/100);
                n-=150000;
            }
            else{
                sunTax += n*(5f/100);
                n-=150000;
            }
            i++;
        }
        if(n>0){
            taxs[i] = 10;
            if(n-150000 > 0){
                nums[i] = 150000;
                sunTax += 150000*(10f/100);
                n-=150000;
            }
            else{
                sunTax += n*(10f/100);
                n-=150000;
            }
            i++;
        }
        if(n>0){
            taxs[i] = 15;
            if(n-200000 > 0){
                nums[i] = 200000;
                sunTax += 200000*(15f/100);
                n-=200000;
            }
            else{
                sunTax += n*(15f/100);
                n-=200000;
            }
            i++;
        }
        if(n>0){
            taxs[i] = 20;
            if(n-250000 > 0){
                nums[i] = 250000;
                sunTax += 250000*(20f/100);
                n-=250000;
            }
            else{
                sunTax += n*(20f/100);
                n-=250000;
            }
            i++;
        }
        if(n>0){
            taxs[i] = 25;
            if(n-1000000 > 0){ 
                nums[i] = 1000000;
                sunTax += 1000000*(25f/100);
                n-=1000000;
            }
            else{
                sunTax += n*(25f/100);
                n-=1000000;
            }
            i++;
        }
        if(n>0){
            taxs[i] = 30;
            if(n-3000000 > 0){
                nums[i] = 3000000;
                sunTax += 3000000*(30f/100);
                n-=3000000;
            }
            else{
                sunTax += n*(30f/100);
                n-=3000000;
            }
            i++;
        }
        if(n > 0){
            taxs[i] = 35;
            if(n-5000000 > 0){
                nums[i] = 5000000;
                sunTax += 5000000*(35f/100);
                n-=5000000;
            }
            else{
                sunTax += n*(35f/100);
                n-=5000000;
            }
            i++;
        }

        System.out.println("Tax :" + sunTax + " BAHT.");
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
            // System.out.println("Income : (" + salay + "x12) - " + costYear + " - " + taxDeuction + " - "  +incomeCost + " = " + (int)result  );  
            System.out.printf("Income : (%d x 12) - %d - %d - %d = %d\n",salay,costYear,taxDeuction,incomeCost,result);    
            taxCount(result);
        }
        else if(income == 'N'){
            result = (salayYear-costYear)-taxDeuction;
            // System.out.println("Income : (" + salay + "x12) - " + costYear + " - " + taxDeuction + " = " + result  );
            System.out.printf("Income : (%d x 12) - %d - %d = %d\n",salay,costYear,taxDeuction,result);    
            taxCount(result);
        }
    }
}
