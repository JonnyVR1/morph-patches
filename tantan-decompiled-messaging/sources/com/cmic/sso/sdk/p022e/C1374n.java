package com.cmic.sso.sdk.p022e;

import android.content.Context;
import com.cmic.sso.sdk.C1316a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.n */
/* JADX INFO: loaded from: classes.dex */
public class C1374n {

    /* JADX INFO: renamed from: a */
    private static final ExecutorService f5718a = new ThreadPoolExecutor(0, 30, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: a */
    public static void m7299a(a aVar) {
        try {
            f5718a.execute(aVar);
        } catch (Exception e) {
            aVar.f5719a.uncaughtException(Thread.currentThread(), e);
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.n$a */
    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Thread.UncaughtExceptionHandler f5719a;

        public a() {
            this.f5719a = new Thread.UncaughtExceptionHandler() { // from class: com.cmic.sso.sdk.e.n.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    th.printStackTrace();
                }
            };
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo7029a();

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.f5719a);
            mo7029a();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }

        public a(final Context context, final C1316a c1316a) {
            this.f5719a = new Thread.UncaughtExceptionHandler() { // from class: com.cmic.sso.sdk.e.n.a.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    c1316a.m6956a().f5667a.add(th);
                    AuthnHelper.getInstance(context).callBackResult("200025", "发生未知错误", c1316a, null);
                }
            };
        }
    }
}
