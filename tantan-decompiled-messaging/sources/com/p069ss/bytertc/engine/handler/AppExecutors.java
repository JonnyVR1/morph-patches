package com.p069ss.bytertc.engine.handler;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes13.dex */
public class AppExecutors {
    private static final AppExecutors INSTANCE = new AppExecutors(new MainThreadExecutor());
    private final Executor mMainThread;

    public static class MainThreadExecutor implements Executor {
        private Handler mainThreadHandler;

        private MainThreadExecutor() {
            this.mainThreadHandler = new Handler(Looper.getMainLooper());
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            this.mainThreadHandler.post(runnable);
        }
    }

    private AppExecutors(Executor executor) {
        this.mMainThread = executor;
    }

    public static AppExecutors getInstance() {
        return INSTANCE;
    }

    public Executor mainThread() {
        return this.mMainThread;
    }
}
