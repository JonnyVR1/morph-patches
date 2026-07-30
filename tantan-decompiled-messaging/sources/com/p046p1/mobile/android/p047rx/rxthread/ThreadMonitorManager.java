package com.p046p1.mobile.android.p047rx.rxthread;

import java.util.concurrent.Executors;
import p133rx.schedulers.Schedulers;
import p149l.bud0;
import p149l.ejd0;
import p149l.hph0;
import p149l.jfd0;
import p149l.o4m;

/* JADX INFO: loaded from: classes8.dex */
public class ThreadMonitorManager {

    /* JADX INFO: renamed from: c */
    public boolean f15633c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f15634d;

    /* JADX INFO: renamed from: e */
    public o4m f15635e;

    /* JADX INFO: renamed from: f */
    public boolean f15636f;

    /* JADX INFO: renamed from: a */
    public long f15631a = 500;

    /* JADX INFO: renamed from: b */
    public long f15632b = 15;

    /* JADX INFO: renamed from: g */
    public bud0 f15637g = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    public static class DisCardException extends Exception {
        public DisCardException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.rx.rxthread.ThreadMonitorManager$a */
    public static class C4343a {
        private static final ThreadMonitorManager INSTANCE = new ThreadMonitorManager();
    }

    /* JADX INFO: renamed from: b */
    public static ThreadMonitorManager m20802b() {
        return C4343a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public o4m m20803a() {
        o4m o4mVar = this.f15635e;
        if (o4mVar != null) {
            return o4mVar;
        }
        jfd0.m141176a("需要setIOThreadPool");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public long m20804c() {
        return this.f15631a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m20805d() {
        return this.f15633c;
    }

    /* JADX INFO: renamed from: e */
    public final void m20806e() {
        if (this.f15636f) {
            return;
        }
        this.f15636f = true;
        ejd0.m116801r(hph0.m132340n(m20803a()));
    }

    /* JADX INFO: renamed from: f */
    public ThreadMonitorManager m20807f(o4m o4mVar) {
        this.f15635e = o4mVar;
        m20806e();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ThreadMonitorManager m20808g(boolean z) {
        this.f15633c = z;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m20809h(boolean z) {
        this.f15634d = z;
    }

    /* JADX INFO: renamed from: i */
    public ThreadMonitorManager m20810i(long j) {
        this.f15631a = j;
        return this;
    }
}
