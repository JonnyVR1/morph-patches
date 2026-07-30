package p153l;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class nvr0 extends Thread {

    /* JADX INFO: renamed from: g */
    public static final boolean f143848g = swr0.f171002b;

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f143849a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f143850b;

    /* JADX INFO: renamed from: c */
    public final lvr0 f143851c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f143852d = false;

    /* JADX INFO: renamed from: e */
    public final twr0 f143853e;

    /* JADX INFO: renamed from: f */
    public final rvr0 f143854f;

    public nvr0(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, lvr0 lvr0Var, rvr0 rvr0Var) {
        this.f143849a = blockingQueue;
        this.f143850b = blockingQueue2;
        this.f143851c = lvr0Var;
        this.f143854f = rvr0Var;
        this.f143853e = new twr0(this, blockingQueue2, rvr0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m164926b() {
        this.f143852d = true;
        interrupt();
    }

    /* JADX INFO: renamed from: c */
    public final void m164927c() throws InterruptedException {
        jwr0 jwr0Var = (jwr0) this.f143849a.take();
        jwr0Var.m147204q("cache-queue-take");
        jwr0Var.m147211x(1);
        try {
            jwr0Var.m147191A();
            kvr0 kvr0VarZza = this.f143851c.zza(jwr0Var.m147201n());
            if (kvr0VarZza == null) {
                jwr0Var.m147204q("cache-miss");
                if (!this.f143853e.m193368c(jwr0Var)) {
                    this.f143850b.put(jwr0Var);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (kvr0VarZza.m151677a(jCurrentTimeMillis)) {
                    jwr0Var.m147204q("cache-hit-expired");
                    jwr0Var.m147197g(kvr0VarZza);
                    if (!this.f143853e.m193368c(jwr0Var)) {
                        this.f143850b.put(jwr0Var);
                    }
                } else {
                    jwr0Var.m147204q("cache-hit");
                    pwr0 pwr0VarMo147200j = jwr0Var.mo147200j(new vvr0(kvr0VarZza.f128986a, kvr0VarZza.f128992g));
                    jwr0Var.m147204q("cache-hit-parsed");
                    if (!pwr0VarMo147200j.m174089c()) {
                        jwr0Var.m147204q("cache-parsing-failed");
                        this.f143851c.mo113063b(jwr0Var.m147201n(), true);
                        jwr0Var.m147197g(null);
                        if (!this.f143853e.m193368c(jwr0Var)) {
                            this.f143850b.put(jwr0Var);
                        }
                    } else if (kvr0VarZza.f128991f < jCurrentTimeMillis) {
                        jwr0Var.m147204q("cache-hit-refresh-needed");
                        jwr0Var.m147197g(kvr0VarZza);
                        pwr0VarMo147200j.f154436d = true;
                        boolean zM193368c = this.f143853e.m193368c(jwr0Var);
                        rvr0 rvr0Var = this.f143854f;
                        if (zM193368c) {
                            rvr0Var.m183311b(jwr0Var, pwr0VarMo147200j, null);
                        } else {
                            rvr0Var.m183311b(jwr0Var, pwr0VarMo147200j, new mvr0(this, jwr0Var));
                        }
                    } else {
                        this.f143854f.m183311b(jwr0Var, pwr0VarMo147200j, null);
                    }
                }
            }
        } finally {
            jwr0Var.m147211x(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f143848g) {
            swr0.m188360d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f143851c.zzb();
        while (true) {
            try {
                m164927c();
            } catch (InterruptedException unused) {
                if (this.f143852d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                swr0.m188358b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
