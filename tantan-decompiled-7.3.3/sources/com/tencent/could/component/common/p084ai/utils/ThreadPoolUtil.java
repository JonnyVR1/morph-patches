package com.tencent.could.component.common.p084ai.utils;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class ThreadPoolUtil {

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f58181a;

    /* JADX INFO: renamed from: com.tencent.could.component.common.ai.utils.ThreadPoolUtil$a */
    public static final class C14030a {

        /* JADX INFO: renamed from: a */
        public static final ThreadPoolUtil f58182a = new ThreadPoolUtil();
    }

    public ThreadPoolUtil() {
        m83392a();
    }

    public static ThreadPoolUtil getInstance() {
        return C14030a.f58182a;
    }

    /* JADX INFO: renamed from: a */
    public final void m83392a() {
        this.f58181a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void addWork(Runnable runnable) {
        if (this.f58181a.isShutdown()) {
            Log.e("ThreadPoolUtil", "Thread Pool is ready shutdown!");
        } else {
            this.f58181a.execute(runnable);
        }
    }

    public void showDown() {
        if (this.f58181a.isShutdown()) {
            return;
        }
        this.f58181a.shutdown();
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
