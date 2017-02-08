/*
 */
package oblopgave3.randomwalks;

/**
 *
 * @author flyberson
 */
public class DrunkenWalk {
    private int counter;
    private int max;
    private int edge;
    private int drunks;

    public DrunkenWalk(int max, int edge, int drunks) {
        this.max=max;
        this.edge=edge;
        this.drunks=drunks;
        counter=0;
    }
    
   public void start(){
       for (int i = 0; i < drunks; i++) {
           RandomWalk walk = new RandomWalk(max,edge);
           walk.walk();
           if(walk.moreSteps()==true){
               counter++;
           }
           
       }
       System.out.println("The drunk fell "+counter+" Times");
   }
    
    
}
