package com.p003p1.mobile.android.p004rx.rxthread;

import java.util.concurrent.Executors;
import l.bud0;
import l.ejd0;
import l.jfd0;
import p007l.hph0;
import p007l.o4m;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ThreadMonitorManager {

    /* JADX INFO: renamed from: c */
    public boolean f1332c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f1333d;

    /* JADX INFO: renamed from: e */
    public o4m f1334e;

    /* JADX INFO: renamed from: f */
    public boolean f1335f;

    /* JADX INFO: renamed from: a */
    public long f1330a = 500;

    /* JADX INFO: renamed from: b */
    public long f1331b = 15;

    /* JADX INFO: renamed from: g */
    public bud0 f1336g = Schedulers.from(Executors.newSingleThreadScheduledExecutor());

    public static class DisCardException extends Exception {
        public DisCardException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.android.rx.rxthread.ThreadMonitorManager$a */
    public static class C0255a {
        private static final ThreadMonitorManager INSTANCE = new ThreadMonitorManager();
    }

    /* JADX INFO: renamed from: b */
    public static ThreadMonitorManager m1073b() {
        return C0255a.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public o4m m1074a() {
        o4m o4mVar = this.f1334e;
        if (o4mVar != null) {
            return o4mVar;
        }
        jfd0.a("需要setIOThreadPool");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public long m1075c() {
        return this.f1330a;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1076d() {
        return this.f1332c;
    }

    /* JADX INFO: renamed from: e */
    public final void m1077e() {
        if (this.f1335f) {
            return;
        }
        this.f1335f = true;
        ejd0.r(hph0.m9350n(m1074a()));
    }

    /* JADX INFO: renamed from: f */
    public ThreadMonitorManager m1078f(o4m o4mVar) {
        this.f1334e = o4mVar;
        m1077e();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ThreadMonitorManager m1079g(boolean z) {
        this.f1332c = z;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public void m1080h(boolean z) {
        this.f1333d = z;
    }

    /* JADX INFO: renamed from: i */
    public ThreadMonitorManager m1081i(long j) {
        this.f1330a = j;
        return this;
    }
}
