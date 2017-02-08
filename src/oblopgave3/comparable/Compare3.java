/*
 */
package oblopgave3.comparable;

/**
 *
 * @author flyberson
 */
public class Compare3 {
    
    
    public static Comparable largest(Comparable com1, Comparable com2, Comparable com3){
        Comparable comlargest;
        if (com1.compareTo(com2)>0){
            System.out.println("compare"+com1.compareTo(com2));
            comlargest=com1;
            System.out.println("First two"+com1+"   "+com2);
        }
        else {comlargest =com2;}
        System.out.println(comlargest);
        if(comlargest.compareTo(com3)<0){
            System.out.println("Second compare  "+comlargest.compareTo(com3));
            comlargest=com3;
        }
                
        return comlargest;
    }
    
}
