/*
 */
package oblopgave3;

/**
 *
 * @author flyberson
 */
public class BiasedCoin {

   private double bias;
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;
   double temp;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public BiasedCoin()
   {
      bias=0.5;
      flip();
   }

    public BiasedCoin(double bias) {
        if(bias>=0||bias <=1){
        this.bias = bias;}
        else {this.bias=0.5;}
        flip();
    }
   

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void flip()
   {
       
      temp =  (Math.random());
       //System.out.println(Math.random() * 2);
      if (temp<bias){
          face=0;
      }
      else {face=1;}
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the coin is heads.
   //-----------------------------------------------------------------
   public boolean isHeads()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}


