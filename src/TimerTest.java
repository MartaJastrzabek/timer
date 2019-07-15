public class TimerTest {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.step();
        timer.step();
        String time = timer.getTime();
        System.out.println("Zmierzony czas: " + time);
        System.out.println();

        timer.addSeconds(500);
        System.out.println("Added 500 seconds.");
        time = timer.getTime();
        long seconds = timer.getSeconds();
        System.out.println("Seconds: " + seconds + " s.");
        System.out.println("Zmierzony czas: " + time);
        System.out.println();

        timer.addMinutes(5);
        System.out.println("Added 5 minutes.");
        time = timer.getTime();
        seconds = timer.getSeconds();
        System.out.println("Seconds: " + seconds + " s.");
        System.out.println("Zmierzony czas: " + time);
        System.out.println();

        timer.addHours(1);
        System.out.println("Added 1 hour.");
        time = timer.getTime();
        seconds = timer.getSeconds();
        System.out.println("Seconds: " + seconds + " s.");
        System.out.println("Zmierzony czas: " + time);
        System.out.println();


    }
}
