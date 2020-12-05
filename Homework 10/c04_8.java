import java.util.Date;


public class c04_8
{

    public static void main(String[] args)
    {
        int num_room = 15;
        int num_client = 30;
        int t1 = 5;
        int t2 = 20;
        Thread[] ths = new Thread[num_room];
        long start = (new Date()).getTime();
        for (int i = 0; i < num_room; i++)
        {
            long moovedTime = (long)
                    Math.floor((Math.random() * (t2 - 1) + 1) * 1000);
            long stayTime = (long)
                    Math.floor((Math.random() * (t1 - 1) + 1) * 1000);
            Client t = new Client(moovedTime, stayTime, i, start);
            ths[i] = new Thread(t, "Client " + i);
            System.out.printf("Client %d mooved in hotel %.3f " + "and passed the room %.3f\n", i, (double) moovedTime / 1000, (double) stayTime / 1000);
            ths[i].start();
        }
        try
        {
            for (int i = 0; i < num_room; i++)
                ths[i].join();
        }
        catch (InterruptedException e)
        {
            System.err.println(e);
        }
        System.out.println("All clients was in room! ");
        System.out.println("Summary time of staying in hotel is: " + (((double) (new Date()).getTime() - start) / 1000));
    }
}


class Client implements Runnable
{
    long moovedTime;
    long stayTime;
    int index;
    long start;
    public static int getRandomInteger(int maximum, int minimum){ return ((int) (Math.random()*(maximum - minimum))) + minimum; }
    Client(long moovedTime, long stayTime, int index, long start)
    {
        this.moovedTime = moovedTime;
        this.stayTime = stayTime;
        this.index = index;
        this.start = start;
    }
    public void run()
    {
        int r = getRandomInteger(10, 1);
        try
        {
            Thread.sleep(moovedTime);
            System.out.println("Client " + index + " has moved to hotel");
            Thread.sleep(stayTime);

            System.out.println("Client " + index + " moved into the room " + r);
        }
        catch (InterruptedException e) {}
        System.out.println("Client " + index + " in room " + r +  ". Full time of stay in the room: " + (((double) (new Date()).getTime() - start) / 1000) + " seconds");
    }
}