package com.p069ss.bytertc.engine.adapter;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes13.dex */
public class VideoSinkTask extends HandlerThread {
    private Handler mHandler;
    private Object mLock;

    public VideoSinkTask() {
        super("VideoSinkTaskManager", 0);
        this.mLock = new Object();
    }

    public void exit() {
        synchronized (this.mLock) {
            quitSafely();
            this.mHandler = null;
        }
    }

    public void init() {
        synchronized (this.mLock) {
            try {
                try {
                    start();
                    this.mHandler = new Handler(getLooper());
                } catch (OutOfMemoryError unused) {
                    throw new IllegalStateException("videosink task create thread failed as out of memory");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void post(Runnable runnable) {
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.post(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void postDelayed(Runnable runnable, long j) {
        synchronized (this.mLock) {
            try {
                Handler handler = this.mHandler;
                if (handler != null) {
                    handler.postDelayed(runnable, j);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
