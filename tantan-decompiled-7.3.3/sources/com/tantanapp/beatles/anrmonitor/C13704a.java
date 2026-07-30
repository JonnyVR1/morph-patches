package com.tantanapp.beatles.anrmonitor;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tantanapp.beatles.p077v2.data.MonitorEvent;
import p153l.C17614i1;
import p153l.C17844j1;
import p153l.du2;
import p153l.f610;
import p153l.vc60;

/* JADX INFO: renamed from: com.tantanapp.beatles.anrmonitor.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13704a extends Thread {

    /* JADX INFO: renamed from: a */
    public final Handler f56685a;

    /* JADX INFO: renamed from: b */
    public final int f56686b;

    /* JADX INFO: renamed from: c */
    public volatile long f56687c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f56688d;

    /* JADX INFO: renamed from: e */
    public long f56689e;

    /* JADX INFO: renamed from: f */
    public String f56690f;

    /* JADX INFO: renamed from: g */
    public boolean f56691g;

    /* JADX INFO: renamed from: h */
    public boolean f56692h;

    /* JADX INFO: renamed from: i */
    public C17614i1 f56693i;

    /* JADX INFO: renamed from: j */
    public Context f56694j;

    /* JADX INFO: renamed from: k */
    public final Runnable f56695k;

    /* JADX INFO: renamed from: com.tantanapp.beatles.anrmonitor.a$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C13704a.this.f56687c = 0L;
            C13704a.this.f56688d = false;
        }
    }

    public C13704a(int i, C17614i1 c17614i1) {
        this.f56685a = new Handler(Looper.getMainLooper());
        this.f56687c = 0L;
        this.f56688d = false;
        this.f56689e = 0L;
        this.f56690f = null;
        this.f56691g = false;
        this.f56692h = false;
        this.f56695k = new a();
        this.f56686b = i;
        this.f56693i = c17614i1;
    }

    /* JADX INFO: renamed from: c */
    public C13704a m82234c() {
        this.f56690f = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANRMonitor|");
        long j = this.f56686b;
        while (!isInterrupted()) {
            boolean z = this.f56687c == 0;
            this.f56687c += j;
            if (z) {
                this.f56685a.post(this.f56695k);
            }
            try {
                Thread.sleep(j);
                if (this.f56687c != 0 && !this.f56688d) {
                    if (this.f56692h || !(Debug.isDebuggerConnected() || Debug.waitingForDebugger())) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - this.f56689e < 20000) {
                            f610.m124263a("should not process ANR too Fre in 20000", new Object[0]);
                        } else {
                            ActivityManager.ProcessErrorStateInfo processErrorStateInfoM200789d = vc60.m200789d(this.f56694j, 20000L);
                            if (processErrorStateInfoM200789d != null) {
                                du2.m118062v("[beatles][crash][anr]", "anr detected! found visiable anr , start to process!");
                                this.f56689e = jCurrentTimeMillis;
                                String str = this.f56690f;
                                long j2 = this.f56687c;
                                ANRError aNRErrorNew = str != null ? ANRError.New(j2, this.f56690f, this.f56691g) : ANRError.NewMainOnly(j2);
                                String str2 = processErrorStateInfoM200789d.shortMsg + SignParameters.NEW_LINE + processErrorStateInfoM200789d.longMsg + SignParameters.NEW_LINE;
                                MonitorEvent monitorEventM143064a = C17844j1.m143064a(aNRErrorNew, processErrorStateInfoM200789d.shortMsg, str2);
                                du2.m118062v("[beatles][crash][anr]", "content:".concat(str2));
                                this.f56693i.m108092j(monitorEventM143064a);
                                j = this.f56686b;
                                this.f56688d = true;
                            } else {
                                f610.m124263a("process state is unvisiable!", new Object[0]);
                            }
                        }
                    } else {
                        f610.m124268f("An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))", new Object[0]);
                        this.f56688d = true;
                    }
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public C13704a(Context context, int i, C17614i1 c17614i1) {
        this(i, c17614i1);
        this.f56694j = context;
    }
}
