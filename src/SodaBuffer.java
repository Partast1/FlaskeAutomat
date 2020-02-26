import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class SodaBuffer {
    final BlockingQueue<Drink> SODAQUEUE = new ArrayBlockingQueue<Drink>(6);
}
