import java.util.Random;

public class Producer extends Thread {

    Buffer buf;
    Random rnd = new Random();
    public Producer(Buffer buffer)
    {
        buf = buffer;
    }

//    Produces either Soda or Beer depening on random
    @Override
    public void run() {
        while (true) {
            if (buf.QUEUE.size() <= 5 ){
            int drinkDecider = rnd.nextInt(2);
            if (drinkDecider == 0) {
                Drink soda = new Soda();
                buf.QUEUE.add(soda);
                System.out.println("Soda added to QUEUE");
            } else {
                Drink beer = new Beer();
                buf.QUEUE.add(beer);
                System.out.println("Beer added to QUEUE");
            }
        }
    }

    }
}
