import java.util.Scanner; 
public class GCDUsingEuclidean_Exp1
 { 
    public static void main(String[] args)  
    { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter first number: "); 
        int num1 = scanner.nextInt(); 
        System.out.print("Enter second number: "); 
        int num2 = scanner.nextInt(); 
        int r1 = num1; 
        int r2 = num2; 
        int q, r; 
        while (r2 > 0)  
        { 
            q = r1 / r2;   
            r = r1 - q * r2;   
            r1 = r2; 
            r2 = r; 
        } 
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + r1); 
    } 
}