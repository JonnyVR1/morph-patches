package com.tencent.could.huiyansdk.utils;

import com.tencent.could.huiyansdk.manager.C13905e;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.j */
/* JADX INFO: loaded from: classes2.dex */
public class C13935j {

    /* JADX INFO: renamed from: a */
    public ThreadPoolExecutor f57519a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.j$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C13935j f57520a = new C13935j();
    }

    public C13935j() {
        m82409a();
    }

    /* JADX INFO: renamed from: a */
    public final void m82409a() {
        this.f57519a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    /* JADX INFO: renamed from: a */
    public void m82410a(Runnable runnable) {
        if (!this.f57519a.isShutdown()) {
            this.f57519a.execute(runnable);
        } else {
            C13905e.a.f57445a.m82337a(2, "ThreadPoolUtil", "thread pool is ready shutdown!");
        }
    }
}
