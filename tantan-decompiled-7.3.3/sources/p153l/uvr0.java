package p153l;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class uvr0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f181161a;

    /* JADX INFO: renamed from: b */
    public final tvr0 f181162b;

    /* JADX INFO: renamed from: c */
    public final lvr0 f181163c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f181164d = false;

    /* JADX INFO: renamed from: e */
    public final rvr0 f181165e;

    public uvr0(BlockingQueue blockingQueue, tvr0 tvr0Var, lvr0 lvr0Var, rvr0 rvr0Var) {
        this.f181161a = blockingQueue;
        this.f181162b = tvr0Var;
        this.f181163c = lvr0Var;
        this.f181165e = rvr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m198305a() {
        this.f181164d = true;
        interrupt();
    }

    /* JADX INFO: renamed from: b */
    public final void m198306b() throws InterruptedException {
        jwr0 jwr0Var = (jwr0) this.f181161a.take();
        SystemClock.elapsedRealtime();
        jwr0Var.m147211x(3);
        try {
            try {
                jwr0Var.m147204q("network-queue-take");
                jwr0Var.m147191A();
                TrafficStats.setThreadStatsTag(jwr0Var.m147195b());
                vvr0 vvr0VarMo122393a = this.f181162b.mo122393a(jwr0Var);
                jwr0Var.m147204q("network-http-complete");
                if (vvr0VarMo122393a.f185983e && jwr0Var.m147213z()) {
                    jwr0Var.m147207t("not-modified");
                    jwr0Var.m147209v();
                } else {
                    pwr0 pwr0VarMo147200j = jwr0Var.mo147200j(vvr0VarMo122393a);
                    jwr0Var.m147204q("network-parse-complete");
                    if (pwr0VarMo147200j.f154434b != null) {
                        this.f181163c.mo113062a(jwr0Var.m147201n(), pwr0VarMo147200j.f154434b);
                        jwr0Var.m147204q("network-cache-written");
                    }
                    jwr0Var.m147208u();
                    this.f181165e.m183311b(jwr0Var, pwr0VarMo147200j, null);
                    jwr0Var.m147210w(pwr0VarMo147200j);
                }
            } catch (zzaqj e) {
                SystemClock.elapsedRealtime();
                this.f181165e.m183310a(jwr0Var, e);
                jwr0Var.m147209v();
            } catch (Exception e2) {
                swr0.m188359c(e2, "Unhandled exception %s", e2.toString());
                zzaqj zzaqjVar = new zzaqj(e2);
                SystemClock.elapsedRealtime();
                this.f181165e.m183310a(jwr0Var, zzaqjVar);
                jwr0Var.m147209v();
            }
        } finally {
            jwr0Var.m147211x(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m198306b();
            } catch (InterruptedException unused) {
                if (this.f181164d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                swr0.m188358b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
