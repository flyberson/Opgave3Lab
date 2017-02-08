/*
 */
package oblopgave3.randomwalks;

/**
 *
 * @author flyberson
 */
public class Collisions {
    
    private int max=100000;
    private int edge;
    private int x;
    private int y;
    private int counter=0;
    private static int counter2=0;
    
        RandomWalk col1 = new RandomWalk(max,2000000,-3,0);
        RandomWalk col2 = new RandomWalk(max,2000000,3,0);
        

    public Collisions() {

    }
    
    public static boolean samePosition(RandomWalk p1,RandomWalk p2){
        if(p1.getX()==p2.getX()&&  p1.getY()==p2.getY()){
              System.out.println("Colission at X = "+p1.getX()+"  "+p2.getX()+
                      "\nColission at Y = "+p1.getY()+"   "+p2.getY());
              counter2++;
              return true;
          }
        return false;
        
    }
    
    public void start(){
        for (int i = 0; i < max; i++) {
         col1.takeStep();
         col2.takeStep();
//          if(col1.getX()==col2.getX()&&  col1.getY()==col2.getY()){
//              System.out.println("Colission at X = "+col1.getX()+"  "+col2.getX()+
//                      "\nColission at Y = "+col1.getY()+"   "+col2.getY());
//              counter++;
//          }
samePosition(col1, col2);
            
        }
        System.out.println(counter2);

    }
    
}
