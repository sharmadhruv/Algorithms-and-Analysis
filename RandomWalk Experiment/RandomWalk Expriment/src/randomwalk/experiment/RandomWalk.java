/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomwalk.experiment;

/**
 *
 * @author dhruvsharma
 */
import java.util.Random;

public class RandomWalk {
    // the man is initially is at zero that is origin.
    private int x = 0;
    private int y = 0;

    private final Random random = new Random();

    public void move(int dx, int dy) {
      // Here we added the distance
       x += dx;
       y += dy;
        
    }

    private void randomWalk(int n) {
        for (int i = 0; i < n; i++)
            randomMove();
    }

    private void randomMove() {
                int x= random.nextInt(2);
                int y = random.nextInt(2);

                switch(random.nextInt(4)){
                                            case 0 : move(1,0);
                                        	break;
                                            case 1 : move(0,1);
                                        	break;
                                            case 2: move(-1,0);
                                        	break;
                                            case 3 : move(0,-1);
                                            	break;

    }
    }

    public double distance() {
                            double dist=0;
                            dist=(x*x)+(y*y);
                            dist=Math.sqrt(dist);
                            return dist;

        
    }

    public static void main(String[] args) {
                                            int avg = 0;
                                            int distSum=0;
                                                //int n = Integer.parseInt(args[0]);
                                            RandomWalk walk = new RandomWalk();
                                            for(int n = 5;n<=11;n++){   //
                                            for(int i=0;i<5;i++){
                                            walk.randomWalk(n);

                                            distSum=(int) (distSum+walk.distance());
}
                                            avg=distSum/n;
                                            System.out.println(n + " steps: " + walk.distance());
}

}
}

