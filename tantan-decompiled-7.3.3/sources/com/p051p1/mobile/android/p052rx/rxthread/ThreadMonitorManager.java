package com.p051p1.mobile.android.p052rx.rxthread;

import java.util.concurrent.Executors;
import p137rx.schedulers.Schedulers;
import p153l.e7m;
import p153l.f2e0;
import p153l.hrd0;
import p153l.mnd0;
import p153l.oxh0;

/* JADX INFO: loaded from: classes8.dex */
public class ThreadMonitorManager {

    /* JADX INFO: renamed from: c */
    public boolean f16352c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f16353d;

    /* JADX INFO: renamed from: e */
    public e7m f16354e;

    /* JADX INFO: renamed from: f */
    public boolean f16355f;

    /* JADX INFO: renamed from: a */
    public long f16350a = 500;

    /* JADX INFO: renamed from: b */
    public long f16351b = 15;

    /* JADX INFO: renamed from: g */
    public f2e0 f16356g = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    public static class DisCardException extends Exception {
        public DisCardException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.rx.rxthread.ThreadMonitorManager$a */
    public static class C4494a {
        private static final ThreadMonitorManager INSTANCE = new ThreadMonitorManager();
    }

    /* JADX INFO: renamed from: b */
    public static ThreadMonitorManager m21801b() {
        return C4494a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public e7m m21802a() {
        e7m e7mVar = this.f16354e;
        if (e7mVar != null) {
            return e7mVar;
        }
        mnd0.m159157a("需要setIOThreadPool");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public long m21803c() {
        return this.f16350a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m21804d() {
        return this.f16352c;
    }

    /* JADX INFO: renamed from: e */
    public final void m21805e() {
        if (this.f16355f) {
            return;
        }
        this.f16355f = true;
        hrd0.m136800r(oxh0.m169710n(m21802a()));
    }

    /* JADX INFO: renamed from: f */
    public ThreadMonitorManager m21806f(e7m e7mVar) {
        this.f16354e = e7mVar;
        m21805e();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ThreadMonitorManager m21807g(boolean z) {
        this.f16352c = z;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m21808h(boolean z) {
        this.f16353d = z;
    }

    /* JADX INFO: renamed from: i */
    public ThreadMonitorManager m21809i(long j) {
        this.f16350a = j;
        return this;
    }
}
