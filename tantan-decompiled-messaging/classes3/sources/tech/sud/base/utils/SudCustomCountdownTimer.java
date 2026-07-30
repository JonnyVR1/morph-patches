package tech.sud.base.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class SudCustomCountdownTimer {
    private static int MSG = 1;
    private boolean isRunning;
    private long mCountdownInterval;
    private final Handler mHandler;
    private long mStopTimeInFuture;
    private int mTotalCount;

    public SudCustomCountdownTimer(int i, long j) {
        this.isRunning = false;
        this.mHandler = new Handler(Looper.getMainLooper()) { // from class: tech.sud.base.utils.SudCustomCountdownTimer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                super.handleMessage(message);
                synchronized (SudCustomCountdownTimer.this) {
                    try {
                        SudCustomCountdownTimer sudCustomCountdownTimer = SudCustomCountdownTimer.this;
                        if (sudCustomCountdownTimer.isRunning) {
                            int i2 = sudCustomCountdownTimer.mTotalCount - 1;
                            sudCustomCountdownTimer.mTotalCount = i2;
                            if (i2 <= 0) {
                                sudCustomCountdownTimer.isRunning = false;
                                sudCustomCountdownTimer.onFinish();
                            } else {
                                long j2 = sudCustomCountdownTimer.mCountdownInterval;
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                SudCustomCountdownTimer sudCustomCountdownTimer2 = SudCustomCountdownTimer.this;
                                long j3 = sudCustomCountdownTimer2.mTotalCount;
                                long j4 = sudCustomCountdownTimer2.mCountdownInterval;
                                long j5 = sudCustomCountdownTimer2.mStopTimeInFuture;
                                if (((j3 * j4) + jElapsedRealtime) - j5 > 1000) {
                                    long j6 = j5 - jElapsedRealtime;
                                    sudCustomCountdownTimer2.mTotalCount = (int) (j6 / j4);
                                    j2 += j6 % j4;
                                }
                                sudCustomCountdownTimer2.onTick(sudCustomCountdownTimer2.mTotalCount);
                                sendMessageDelayed(obtainMessage(SudCustomCountdownTimer.MSG), j2);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
        this.mTotalCount = i;
        this.mCountdownInterval = j;
    }

    public synchronized void cancel() {
        this.isRunning = false;
        this.mHandler.removeMessages(MSG);
    }

    public int getCurrentCount() {
        return this.mTotalCount;
    }

    public boolean isRunning() {
        return this.isRunning;
    }

    public abstract void onFinish();

    public abstract void onTick(int i);

    public synchronized SudCustomCountdownTimer start() {
        this.isRunning = true;
        if (this.mTotalCount > 0 && this.mCountdownInterval > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            int i = this.mTotalCount;
            this.mStopTimeInFuture = (((long) i) * this.mCountdownInterval) + jElapsedRealtime;
            onTick(i);
            this.mHandler.removeMessages(MSG);
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(MSG), this.mCountdownInterval);
            return this;
        }
        onFinish();
        return this;
    }

    public SudCustomCountdownTimer(int i) {
        this(i, 1000L);
    }
}
