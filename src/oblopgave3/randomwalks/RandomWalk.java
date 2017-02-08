/*
 */
package oblopgave3.randomwalks;

/**
 *
 * @author flyberson
 */
public class RandomWalk {
    private int x;
    private int y;
    private int max;
    private int stepssofar;
    private int edge;
    private int maxdistance;
    

    public RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
        maxdistance=0;
        x=0;
        y=0;
    }

    public RandomWalk(int x, int y, int max, int edge) {
        this.x = x;
        this.y = y;
        this.max = max;
        this.edge = edge;
        maxdistance=0;
    }

    @Override
    public String toString() {
        return "RandomWalk{" + "x= " + x + ", y= " + y + ", stepssofar= " + stepssofar + '}';
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void takeStep(){
        int direction;
        double temp;
        temp = Math.random();
        
        if(temp >=0 && temp <=0.25){
            direction =0;
            y++;
           
        }
        if(temp >0.25 && temp <=0.50){
            direction =1;
            y--;
           
        }
        if(temp >0.50 && temp <=0.75){
            direction =2;
            x++;
            
        }
        if(temp >0.75 && temp <=1){
            direction =3;
            x--;
      
        }
        stepssofar++;
        
        maxdistance=max(maxdistance,max(x, y));
        
    }

    public int getMaxdistance() {
        return maxdistance;
    }
    
    public boolean moreSteps(){
        if(stepssofar<max){
            return true;
        }
        
        return false;
    }
    
    public boolean inBounds(){
        if( x>edge || y > edge || x<-edge || y < -edge){
        return false;
    }
        return true;}
    
    public void walk(){
        while (inBounds()==true && moreSteps() == true){
            takeStep();
        }
    }
    
    private int max(int max1, int max2){
        int largest;
        
        if (Math.abs(max1)>=Math.abs(max2)){
            largest=Math.abs(max1);
        }
        else{largest=Math.abs(max2);}
        return largest;
    }
    
}
