public class BeerConsumer extends Thread{
    BeerBuffer buf;
    public BeerConsumer(BeerBuffer buffer)
    {
        buf = buffer;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Beer was consumed");
                buf.BEERQUEUE.take();


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
