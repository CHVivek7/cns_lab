import java.util.Scanner; 
public class MultiplicativeInverse_Exp3 
 { 
    public static void main(String[] args)  
   { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter value for b: "); 
        int b = scanner.nextInt(); 
        System.out.print("Enter value for n (modulus): "); 
        int n = scanner.nextInt(); 
        int r1 = n, r2 = b; 
        int t1 = 0, t2 = 1; 
        int q, r, t; 
        while (r2 > 0)  
        { 
            q = r1 / r2;   
            r = r1 - q * r2;   
            r1 = r2; 
            r2 = r; 
            t = t1 - q * t2; 
            t1 = t2; 
            t2 = t; 
        } 
        if (r1 != 1)  
        { 
            System.out.println("Multiplicative inverse does not exist."); 
            System.exit(0);
        } 
        if (t1 < 0)  
        { 
            t1 += n; 
        } 
        int inverse = t1;
        if (inverse != -1)  
        { 
            System.out.println("Multiplicative Inverse of " + b + " modulo " + n + " is: " + inverse); 
        } 
        scanner.close(); 
    } 
} 
