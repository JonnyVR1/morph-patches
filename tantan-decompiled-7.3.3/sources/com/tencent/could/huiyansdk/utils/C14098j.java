package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.manager.C14068e;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.j */
/* JADX INFO: loaded from: classes12.dex */
public class C14098j {

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f58367a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C14098j f58368a = new C14098j();
    }

    public C14098j() {
        m83592a();
    }

    /* JADX INFO: renamed from: a */
    public final void m83592a() {
        this.f58367a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    /* JADX INFO: renamed from: a */
    public void m83593a(Runnable runnable) {
        if (!this.f58367a.isShutdown()) {
            this.f58367a.execute(runnable);
        } else {
            C14068e.a.f58293a.m83520a(2, "ThreadPoolUtil", "thread pool is ready shutdown!");
        }
    }
}
