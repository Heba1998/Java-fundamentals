import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        System.out.println("Heba's work");
        int dogCounter = 0;
        System.out.println("I own " + dogCounter + " " + pluralize("Dog", dogCounter) + ".");
        int catCounter = 2;
        System.out.println("I own " + catCounter + " " + pluralize("Cat", catCounter) + ".");
        int birdCount = 1;
        System.out.println("I own " + birdCount + " " + pluralize("turtle", birdCount) + ".");
        flipNHeads(8);
        clock();
    }

    public static String pluralize(String word, int count){

        if(count==0 || count >1){
            return word+'s';
        }else{
            return word;
        }

    }

public static void flipNHeads(int randNumOfFlip){
        Random random = new Random();
        int counter = 0;
        for(int i = 1; i<=randNumOfFlip; i++){
            double randomNumber = random.nextDouble();
            if(randomNumber>=0.5){
                System.out.println("heads");
                counter++;
                if(counter==2){
                    randNumOfFlip =i;
                    break;
                }

            }else{
                counter = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took "+randNumOfFlip+" flip to flip "+counter+" head in a row.");
    }
 

      public static void clock () {
        LocalDateTime now = LocalDateTime.now();

        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (now.getSecond() != currentTime.getSecond()) {
                now = currentTime;
                int hour = now.getHour();
                int minute = now.getMinute();
                int second = now.getSecond();
                System.out.println(hour + ":" + minute + ":" + second);
            }
        }
    }
}