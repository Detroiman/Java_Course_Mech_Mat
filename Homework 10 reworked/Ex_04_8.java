import java.util.concurrent.Semaphore;
import java.util.Date;
import java.util.ArrayList;


public class Ex_04_8 {
    public static void main(String[] args)
    {
        int num_rooms = 5;
        int num_clients = 20;
        int t1 = 5;
        int t2 = 10;
        int length = 0;
        Semaphore lock = new Semaphore(num_rooms, true);
        ArrayList<Double> list_of_time = new ArrayList<>();
        ArrayList<Integer> list_length = new ArrayList<>();
        Thread[] ths = new Thread[num_clients];
        for (int i = 0; i < num_clients; i++)
        {
            long moovedTime = (long)
                    Math.floor((Math.random() * (t1 - 1) + 1) * 1000);
            long stayTime = (long)
                    Math.floor((Math.random() * (t2 - 1) + 1) * 1000);
            Client c = new Client(moovedTime, stayTime, i, lock, list_of_time, list_length, length);
            ths[i] = new Thread(c, "Client " + i);
            System.out.printf("Client %d arrives at %.3f " + "and lives in  room for %.3f\n", i, (double) moovedTime / 1000, (double) stayTime / 1000);
            ths[i].start();
        }
        try
        {
            for (int i = 0; i < num_clients; i++) {ths[i].join();}
        }
        catch (InterruptedException e) { System.err.println(e); }
        finally
        {
            double sum1 = 0.0;
            for(int i = 0; i < list_of_time.size(); i++)
            {
                sum1 += list_of_time.get(i);
            }
            System.out.println("Waiting time: " + sum1 / list_of_time.size());
            double sum2 = 0.0;
            for(int i = 0; i < list_length.size(); i++)
            {
                sum2 += list_length.get(i);
            }
            System.out.println("Queue length: " + sum2 / list_length.size());
        }
    }

}

class Client implements Runnable
{
    long moovedTime;
    long stayTime;
    int index;
    ArrayList list_of_time;
    ArrayList list_length;
    Semaphore lock;
    int length = 0;
    Client(long moovedTime, long stayTime, int index, Semaphore lock, ArrayList list_of_time, ArrayList list_length, int length)
    {
        this.moovedTime = moovedTime;
        this.stayTime = stayTime;
        this.index = index;
        this.lock = lock;
        this.list_of_time = list_of_time;
        this.list_length = list_length;
        this.length = length;
    }
    public void run()
    {
        try
        {
            Thread.sleep(moovedTime);
            System.out.println("Client " + index + " has moved to hotel");
            long start = (new Date()).getTime();
            length += 1;
            list_length.add(length);
            lock.acquire();
            double waiting_time = (((double) (new Date()).getTime() - start) / 1000);
            list_of_time.add(waiting_time);
            length -= 1;
            if (waiting_time == 0.0) {list_length.remove(list_length.size() - 1);}
            else {list_length.add(length);}
            System.out.println("Client " + index + " waited for: " + waiting_time + " seconds");
            System.out.println("Client " + index + " moved into the room");
            Thread.sleep(stayTime);
            System.out.println("Client " + index + " get out from the room");
            lock.release();
        }
        catch (InterruptedException e) {}
    }
}