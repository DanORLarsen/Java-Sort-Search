public class MyTimerDan {
    private static long startTime;

    public static void start()
    {
        startTime = System.currentTimeMillis();
        System.out.println("Timer start");
    }

    public static void stop()
    {
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime-startTime;

        System.out.println("Time elapsed: " + (endTime - startTime) + " Milis");

    }

}
