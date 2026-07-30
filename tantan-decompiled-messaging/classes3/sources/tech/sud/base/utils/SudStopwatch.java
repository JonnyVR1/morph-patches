package tech.sud.base.utils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudStopwatch {
    private long elapsedTime;
    private boolean isRunning;
    private long startTime;

    public long getElapsedTimeInMillis() {
        return this.elapsedTime;
    }

    public void reset() {
        this.isRunning = false;
        this.startTime = 0L;
        this.elapsedTime = 0L;
    }

    public void start() {
        if (this.isRunning) {
            return;
        }
        this.isRunning = true;
        this.startTime = System.nanoTime() / 1000000;
    }

    public void stop() {
        if (this.isRunning) {
            this.isRunning = false;
            long jNanoTime = System.nanoTime() / 1000000;
            this.elapsedTime = (jNanoTime - this.startTime) + this.elapsedTime;
        }
    }
}
