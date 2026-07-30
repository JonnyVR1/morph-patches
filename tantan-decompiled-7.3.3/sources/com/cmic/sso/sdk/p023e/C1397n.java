package com.cmic.sso.sdk.p023e;

import android.content.Context;
import com.cmic.sso.sdk.C1339a;
import com.cmic.sso.sdk.auth.AuthnHelper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.cmic.sso.sdk.e.n */
/* JADX INFO: loaded from: classes.dex */
public class C1397n {

    /* JADX INFO: renamed from: a */
    private static final ExecutorService f5755a = new ThreadPoolExecutor(0, 30, 60, TimeUnit.SECONDS, new SynchronousQueue());

    /* JADX INFO: renamed from: a */
    public static void m7353a(a aVar) {
        try {
            f5755a.execute(aVar);
        } catch (Exception e) {
            aVar.f5756a.uncaughtException(Thread.currentThread(), e);
        }
    }

    /* JADX INFO: renamed from: com.cmic.sso.sdk.e.n$a */
    public static abstract class a implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Thread.UncaughtExceptionHandler f5756a;

        public a() {
            this.f5756a = new Thread.UncaughtExceptionHandler() { // from class: com.cmic.sso.sdk.e.n.a.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    th.printStackTrace();
                }
            };
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo7083a();

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setUncaughtExceptionHandler(this.f5756a);
            mo7083a();
            Thread.currentThread().setUncaughtExceptionHandler(null);
        }

        public a(final Context context, final C1339a c1339a) {
            this.f5756a = new Thread.UncaughtExceptionHandler() { // from class: com.cmic.sso.sdk.e.n.a.2
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread, Throwable th) {
                    c1339a.m7010a().f5704a.add(th);
                    AuthnHelper.getInstance(context).callBackResult("200025", "发生未知错误", c1339a, null);
                }
            };
        }
    }
}
