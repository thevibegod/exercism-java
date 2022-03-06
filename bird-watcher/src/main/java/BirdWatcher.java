import static java.lang.Math.min;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        if (this.birdsPerDay.length == 0) {
            return 0;
        }
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdCount : this.birdsPerDay) {
            if (birdCount == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0; i < min(numberOfDays, 7); i++) {
            count += this.birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int busy_days = 0;
        for (int birdCount : this.birdsPerDay) {
            if (birdCount >= 5) {
                busy_days++;
            }
        }
        return busy_days;
    }
}
