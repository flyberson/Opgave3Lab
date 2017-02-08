/*
 */
package oblopgave3;

/**
 *
 * @author flyberson
 */
public class BiasedCointTest {
    public static void main(String[] args){
        BiasedCoin bs1 = new BiasedCoin();
        BiasedCoin bs2 = new BiasedCoin(0.6);
        BiasedCoin bs3 = new BiasedCoin(0.8);

        int count=0;
        
        for (int i = 0; i < 1000; i++) {
                    bs1.flip();
                    if(bs1.toString().equals("Heads")){
                        count++;
                        
                    }
                    
        }
        
        System.out.println("Number bias 0.5 = "+count);
         count=0;
                for (int i = 0; i < 1000; i++) {
                    bs2.flip();
                    if(bs2.toString().equals("Heads")){
                        count++;
                        
                    }
                    
        }
        System.out.println("Number bias 0.6 = "+count);
        count=0;
                for (int i = 0; i < 1000; i++) {
                    bs3.flip();
                    if(bs3.toString().equals("Heads")){
                        count++;
                        
                    }
                    
        }
        System.out.println("Number bias 0.8 = "+count);
        

    }
    
}
