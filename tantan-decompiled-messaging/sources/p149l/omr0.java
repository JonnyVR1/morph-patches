package p149l;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzaqj;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class omr0 extends Thread {

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f144678a;

    /* JADX INFO: renamed from: b */
    public final nmr0 f144679b;

    /* JADX INFO: renamed from: c */
    public final fmr0 f144680c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f144681d = false;

    /* JADX INFO: renamed from: e */
    public final lmr0 f144682e;

    public omr0(BlockingQueue blockingQueue, nmr0 nmr0Var, fmr0 fmr0Var, lmr0 lmr0Var) {
        this.f144678a = blockingQueue;
        this.f144679b = nmr0Var;
        this.f144680c = fmr0Var;
        this.f144682e = lmr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m165149a() {
        this.f144681d = true;
        interrupt();
    }

    /* JADX INFO: renamed from: b */
    public final void m165150b() throws InterruptedException {
        dnr0 dnr0Var = (dnr0) this.f144678a.take();
        SystemClock.elapsedRealtime();
        dnr0Var.m112673x(3);
        try {
            try {
                dnr0Var.m112666q("network-queue-take");
                dnr0Var.m112653A();
                TrafficStats.setThreadStatsTag(dnr0Var.m112657b());
                pmr0 pmr0VarMo104509a = this.f144679b.mo104509a(dnr0Var);
                dnr0Var.m112666q("network-http-complete");
                if (pmr0VarMo104509a.f150288e && dnr0Var.m112675z()) {
                    dnr0Var.m112669t("not-modified");
                    dnr0Var.m112671v();
                } else {
                    jnr0 jnr0VarMo112662j = dnr0Var.mo112662j(pmr0VarMo104509a);
                    dnr0Var.m112666q("network-parse-complete");
                    if (jnr0VarMo112662j.f118882b != null) {
                        this.f144680c.mo122198a(dnr0Var.m112663n(), jnr0VarMo112662j.f118882b);
                        dnr0Var.m112666q("network-cache-written");
                    }
                    dnr0Var.m112670u();
                    this.f144682e.m150603b(dnr0Var, jnr0VarMo112662j, null);
                    dnr0Var.m112672w(jnr0VarMo112662j);
                }
            } catch (zzaqj e) {
                SystemClock.elapsedRealtime();
                this.f144682e.m150602a(dnr0Var, e);
                dnr0Var.m112671v();
            } catch (Exception e2) {
                mnr0.m155559c(e2, "Unhandled exception %s", e2.toString());
                zzaqj zzaqjVar = new zzaqj(e2);
                SystemClock.elapsedRealtime();
                this.f144682e.m150602a(dnr0Var, zzaqjVar);
                dnr0Var.m112671v();
            }
        } finally {
            dnr0Var.m112673x(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m165150b();
            } catch (InterruptedException unused) {
                if (this.f144681d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                mnr0.m155558b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
