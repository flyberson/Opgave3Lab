/*
 */
package oblopgave3.comparable;
import java.util.Scanner;
/**
 *
 * @author flyberson
 */
public class Comparisons {
    
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 =  sc.next();
        String st3 = sc.next();
        
        System.out.println(Compare3.largest(st1, st2, st3));
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        int int3 = sc.nextInt();
        System.out.println(Compare3.largest(int1, int2, int3));
   
        
    }
    
}
