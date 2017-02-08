/*
 */
package oblopgave3.randomwalks;
import java.util.Scanner;
/**
 *
 * @author flyberson
 */
public class TestWalk {
    public static void main(String[] args){
        
        // Test 1
//        Scanner sc = new Scanner(System.in);
//        RandomWalk walk1 = new RandomWalk(5,10,0,0);
//        RandomWalk walk2 = new RandomWalk(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
//        System.out.println(walk1);
//        System.out.println(walk2);
//        
//        for (int i = 0; i < 5; i++) {
//            walk1.takeStep();
//            walk2.takeStep();
//            
//        }
//       System.out.println(walk1);
//        System.out.println(walk2);


//Test 2

//    RandomWalk walk3 = new RandomWalk(200, 10);
//        System.out.println(walk3);
//        walk3.walk();
//        System.out.println(walk3);


//Test 3
//
//DrunkenWalk drunkw=new DrunkenWalk(200,10,10);
//drunkw.start();
//DrunkenWalk drunkw2=new DrunkenWalk(500,10,10);
//drunkw.start();
//DrunkenWalk drunkw3=new DrunkenWalk(200,50,10);
//drunkw.start();

//Test 4
//
//Collisions col = new Collisions();
//col.start();

//Test 5
       
        RandomWalk walk1 = new RandomWalk(100,100);
        RandomWalk walk2 = new RandomWalk(100,100);

        
        for (int i = 0; i < 100; i++) {
             System.out.println(walk1);
        System.out.println(walk2);
         System.out.println("Walk 1 max distance "+walk1.getMaxdistance());
            System.out.println("Walk 2 max distance "+walk2.getMaxdistance());
            walk1.takeStep();
            walk2.takeStep();
             
           
          
        }
        
       
        }
        
    }

