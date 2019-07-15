public class Timer {
    long time; //seconds

    void addSeconds(int seconds){
        time+=seconds;
    }

    void addMinutes(int minutes){
        time+=(minutes*60);
    }

    void addHours(int hours){
        time+=((hours*60)*60);
    }

    void step(){
        time++;
    }

    String getTime(){
        int seconds = (int)time%60;
        int minutes = (int)time/60;
        int hours = minutes/60;
        minutes = minutes - (hours*60);

        return hours + ":" + minutes + ":" + seconds;
    }

    long getSeconds(){
        return time;
    }
}
