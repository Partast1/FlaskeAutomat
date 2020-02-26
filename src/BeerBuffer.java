import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BeerBuffer {
    final BlockingQueue<Drink> BEERQUEUE = new ArrayBlockingQueue<Drink>(6);
}
