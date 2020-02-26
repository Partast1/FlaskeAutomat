import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
//        buffers instances
        Buffer buf = new Buffer();
        SodaBuffer sBuf = new SodaBuffer();
        BeerBuffer bBuf = new BeerBuffer();

//        Creates new instances of Threads with required buffers
        Producer pThread = new Producer(buf);
        Consumer cThread = new Consumer(buf, sBuf, bBuf);
        SodaConsumer sThread = new SodaConsumer(sBuf);
        BeerConsumer bThread = new BeerConsumer(bBuf);

//        instanziating lock
        ReentrantLock lock = new ReentrantLock();

//        Starts Threads
        pThread.start();
        cThread.start();
        sThread.start();
        bThread.start();

        while (true) {

                lock.lock();

                try {
                    pThread.join();
                    Thread.sleep(500);
                } catch (Exception e) {

                }
//                    lock.lock();
                    try {
                        cThread.join();
                        Thread.sleep(600);
                    }
                    catch (Exception e){

                    }
//            lock.lock();
            try {
                sThread.join();
                Thread.sleep(700);

            }
            catch (Exception e){

            }
//            lock.lock();
            try {
                bThread.join();
                Thread.sleep(500);
            }
            catch (Exception e){

            }

        }
    }
}
