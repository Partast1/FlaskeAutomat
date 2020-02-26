import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Buffer {
    final BlockingQueue<Drink> QUEUE = new ArrayBlockingQueue<Drink>(6);
}
