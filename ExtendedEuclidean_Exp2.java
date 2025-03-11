import java.util.Scanner; 
public class ExtendedEuclidean_Exp2 
 { 
    public static void main(String[] args)  
    { 
        int r1,r2;
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter value for a: "); 
        int a = scanner.nextInt(); 
        System.out.print("Enter value for b: "); 
        int b = scanner.nextInt(); 
        if(a>b){
            r1=a;
            r2=b;
        }else{
            r2=a;
            r1=b;
        }
        int s1 = 1, s2 = 0, t1 = 0, t2 = 1; 
        int q, r, s, t; 
        while (r2 > 0) 
        { 
            q = r1 / r2;   
            r = r1 - q * r2;   
            r1 = r2; 
            r2 = r; 
            s = s1 - q * s2; 
            s1 = s2; 
            s2 = s; 
            t = t1 - q * t2; 
            t1 = t2; 
            t2 = t; 
        } 
        System.out.println("GCD(" + a + ", " + b + ") = " + r1); 
        System.out.println("Values of s and t:"); 
        System.out.println("s = " + s1); 
        System.out.println("t = " + t1); 
        scanner.close(); 
    } 
} 
