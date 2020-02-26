import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Buffer buf = new Buffer();
        SodaBuffer sBuf = new SodaBuffer();
        BeerBuffer bBuf = new BeerBuffer();

//        Creates new instances of Threads with buffer
        Producer pThread = new Producer(buf);
        Consumer cThread = new Consumer(buf, sBuf, bBuf);
        SodaConsumer sThread = new SodaConsumer(sBuf);
        BeerConsumer bThread = new BeerConsumer(bBuf);

        ReentrantLock lock = new ReentrantLock();
        pThread.start();
        cThread.start();
        sThread.start();
        bThread.start();
//        Starts Threads
        while (true) {

                lock.lock();

                try {
                    pThread.join();
                    Thread.sleep(500);
                } catch (Exception e) {

                }
                    lock.lock();
                    try {
                        cThread.join();
                        Thread.sleep(600);
                    }
                    catch (Exception e){

                    }
            lock.lock();
            try {
                sThread.join();
                Thread.sleep(700);
                System.out.println("Soda Thread!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
            catch (Exception e){

            }
            lock.lock();
            try {
                bThread.join();
                Thread.sleep(500);
            }
            catch (Exception e){

            }

//            }

//            try
//            {
//                pThread.join();
//            }
//            catch (Exception e)
//            {
//                System.out.println("Exception has " +
//                        "been caught" + e);
//            }
//            try
//            {
//                cThread.join();
//            }
//            catch (Exception e)
//            {
//                System.out.println("Exception has " +
//                        "been caught" + e);
//            }
        }
//        Makes sure Thread finishes





    }
}
