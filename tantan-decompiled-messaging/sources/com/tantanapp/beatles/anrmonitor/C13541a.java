package com.tantanapp.beatles.anrmonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p072v2.data.MonitorEvent;
import p149l.C17458i1;
import p149l.C17663j1;
import p149l.nt2;
import p149l.p460;
import p149l.vx00;

/* JADX INFO: renamed from: com.tantanapp.beatles.anrmonitor.a */
/* JADX INFO: loaded from: classes13.dex */
public class C13541a extends Thread {

    /* JADX INFO: renamed from: a */
    public final Handler f55837a;

    /* JADX INFO: renamed from: b */
    public final int f55838b;

    /* JADX INFO: renamed from: c */
    public volatile long f55839c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f55840d;

    /* JADX INFO: renamed from: e */
    public long f55841e;

    /* JADX INFO: renamed from: f */
    public String f55842f;

    /* JADX INFO: renamed from: g */
    public boolean f55843g;

    /* JADX INFO: renamed from: h */
    public boolean f55844h;

    /* JADX INFO: renamed from: i */
    public C17458i1 f55845i;

    /* JADX INFO: renamed from: j */
    public Context f55846j;

    /* JADX INFO: renamed from: k */
    public final Runnable f55847k;

    /* JADX INFO: renamed from: com.tantanapp.beatles.anrmonitor.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13541a.this.f55839c = 0L;
            C13541a.this.f55840d = false;
        }
    }

    public C13541a(int i, C17458i1 c17458i1) {
        this.f55837a = new Handler(Looper.getMainLooper());
        this.f55839c = 0L;
        this.f55840d = false;
        this.f55841e = 0L;
        this.f55842f = null;
        this.f55843g = false;
        this.f55844h = false;
        this.f55847k = new a();
        this.f55838b = i;
        this.f55845i = c17458i1;
    }

    /* JADX INFO: renamed from: c */
    public C13541a m81051c() {
        this.f55842f = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANRMonitor|");
        long j = this.f55838b;
        while (!isInterrupted()) {
            boolean z = this.f55839c == 0;
            this.f55839c += j;
            if (z) {
                this.f55837a.post(this.f55847k);
            }
            try {
                Thread.sleep(j);
                if (this.f55839c != 0 && !this.f55840d) {
                    if (this.f55844h || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.f55841e < 20000) {
                            vx00.m200471a("should not process ANR too Fre in 20000", new Object[0]);
                        } else {
                            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM167368d = p460.m167368d(this.f55846j, 20000L);
                            if (processErrorStateInfoM167368d != null) {
                                nt2.m160831v("[beatles][crash][anr]", "anr detected! found visiable anr , start to process!");
                                this.f55841e = jCurrentTimeMillis;
                                String str = this.f55842f;
                                long j2 = this.f55839c;
                                ANRError aNRErrorNew = str != null ? ANRError.New(j2, this.f55842f, this.f55843g) : ANRError.NewMainOnly(j2);
                                String str2 = processErrorStateInfoM167368d.shortMsg + SignParameters.NEW_LINE + processErrorStateInfoM167368d.longMsg + SignParameters.NEW_LINE;
                                MonitorEvent monitorEventM139215a = C17663j1.m139215a(aNRErrorNew, processErrorStateInfoM167368d.shortMsg, str2);
                                nt2.m160831v("[beatles][crash][anr]", "content:".concat(str2));
                                this.f55845i.m186395j(monitorEventM139215a);
                                j = this.f55838b;
                                this.f55840d = true;
                            } else {
                                vx00.m200471a("process state is unvisiable!", new Object[0]);
                            }
                        }
                    } else {
                        vx00.m200476f("An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))", new Object[0]);
                        this.f55840d = true;
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public C13541a(Context context, int i, C17458i1 c17458i1) {
        this(i, c17458i1);
        this.f55846j = context;
    }
}
