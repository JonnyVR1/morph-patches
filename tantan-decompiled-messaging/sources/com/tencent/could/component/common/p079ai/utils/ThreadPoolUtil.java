package com.tencent.could.component.common.p079ai.utils;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadPoolUtil {

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f57333a;

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.utils.ThreadPoolUtil$a */
    public static final class C13867a {

        /* JADX INFO: renamed from: a */
        public static final ThreadPoolUtil f57334a = new ThreadPoolUtil();
    }

    public ThreadPoolUtil() {
        m82209a();
    }

    public static ThreadPoolUtil getInstance() {
        return C13867a.f57334a;
    }

    /* JADX INFO: renamed from: a */
    public final void m82209a() {
        this.f57333a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void addWork(Runnable runnable) {
        if (this.f57333a.isShutdown()) {
            Log.e("ThreadPoolUtil", "Thread Pool is ready shutdown!");
        } else {
            this.f57333a.execute(runnable);
        }
    }

    public void showDown() {
        if (this.f57333a.isShutdown()) {
            return;
        }
        this.f57333a.shutdown();
    }

    public void waitThreadTime() {
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            Log.e("ThreadPoolUtil", "Want wait thread in main thread!");
            return;
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            Log.e("ThreadPoolUtil", "InterruptedException in sleep thread!");
        }
    }
}
