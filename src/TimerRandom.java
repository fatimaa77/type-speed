public class TimerRandom {
    private TimerRandom timer = new TimerRandom(60);
    TimerRandom(int seconds)
    {

    }

    public TimerRandom getTimer() {
        return timer;
    }

    public void setTimer(TimerRandom timer) {
        this.timer = timer;
    }
}
