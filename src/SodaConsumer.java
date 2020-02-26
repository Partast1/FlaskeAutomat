public class SodaConsumer extends Thread {
    SodaBuffer buf;
    public SodaConsumer(SodaBuffer buffer)
    {
        buf = buffer;
    }
    @Override
    public void run() {
            while (true) {
                try {
                    System.out.println("Soda was consumed");
                    buf.SODAQUEUE.take();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
    }
}
