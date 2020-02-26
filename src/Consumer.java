import java.util.Random;

public class Consumer extends Thread {
    Buffer buf;
SodaBuffer sodaBuf;
BeerBuffer beerBuf;
    public Consumer(Buffer buffer, SodaBuffer sBuffer, BeerBuffer bBuffer)
    {
        buf = buffer;
        sodaBuf = sBuffer;
        beerBuf = bBuffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Drink drink = buf.QUEUE.take();
                if (drink instanceof Soda) {
                    System.out.println("Soda was pulled");
                    if (sodaBuf.SODAQUEUE.size() <= 5 ) {
                        sodaBuf.SODAQUEUE.add(drink);
                    }
                } else if (drink instanceof Beer) {
                    System.out.println("Beer was pulled");
                    if (beerBuf.BEERQUEUE.size() <= 5 ) {
                        beerBuf.BEERQUEUE.add(drink);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
