package p149l;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class hmr0 extends Thread {

    /* JADX INFO: renamed from: g */
    public static final boolean f108465g = mnr0.f134787b;

    /* JADX INFO: renamed from: a */
    public final BlockingQueue f108466a;

    /* JADX INFO: renamed from: b */
    public final BlockingQueue f108467b;

    /* JADX INFO: renamed from: c */
    public final fmr0 f108468c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f108469d = false;

    /* JADX INFO: renamed from: e */
    public final nnr0 f108470e;

    /* JADX INFO: renamed from: f */
    public final lmr0 f108471f;

    public hmr0(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, fmr0 fmr0Var, lmr0 lmr0Var) {
        this.f108466a = blockingQueue;
        this.f108467b = blockingQueue2;
        this.f108468c = fmr0Var;
        this.f108471f = lmr0Var;
        this.f108470e = new nnr0(this, blockingQueue2, lmr0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m131755b() {
        this.f108469d = true;
        interrupt();
    }

    /* JADX INFO: renamed from: c */
    public final void m131756c() throws InterruptedException {
        dnr0 dnr0Var = (dnr0) this.f108466a.take();
        dnr0Var.m112666q("cache-queue-take");
        dnr0Var.m112673x(1);
        try {
            dnr0Var.m112653A();
            emr0 emr0VarZza = this.f108468c.zza(dnr0Var.m112663n());
            if (emr0VarZza == null) {
                dnr0Var.m112666q("cache-miss");
                if (!this.f108470e.m160367c(dnr0Var)) {
                    this.f108467b.put(dnr0Var);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (emr0VarZza.m117225a(jCurrentTimeMillis)) {
                    dnr0Var.m112666q("cache-hit-expired");
                    dnr0Var.m112659g(emr0VarZza);
                    if (!this.f108470e.m160367c(dnr0Var)) {
                        this.f108467b.put(dnr0Var);
                    }
                } else {
                    dnr0Var.m112666q("cache-hit");
                    jnr0 jnr0VarMo112662j = dnr0Var.mo112662j(new pmr0(emr0VarZza.f92236a, emr0VarZza.f92242g));
                    dnr0Var.m112666q("cache-hit-parsed");
                    if (!jnr0VarMo112662j.m142388c()) {
                        dnr0Var.m112666q("cache-parsing-failed");
                        this.f108468c.mo122199b(dnr0Var.m112663n(), true);
                        dnr0Var.m112659g(null);
                        if (!this.f108470e.m160367c(dnr0Var)) {
                            this.f108467b.put(dnr0Var);
                        }
                    } else if (emr0VarZza.f92241f < jCurrentTimeMillis) {
                        dnr0Var.m112666q("cache-hit-refresh-needed");
                        dnr0Var.m112659g(emr0VarZza);
                        jnr0VarMo112662j.f118884d = true;
                        boolean zM160367c = this.f108470e.m160367c(dnr0Var);
                        lmr0 lmr0Var = this.f108471f;
                        if (zM160367c) {
                            lmr0Var.m150603b(dnr0Var, jnr0VarMo112662j, null);
                        } else {
                            lmr0Var.m150603b(dnr0Var, jnr0VarMo112662j, new gmr0(this, dnr0Var));
                        }
                    } else {
                        this.f108471f.m150603b(dnr0Var, jnr0VarMo112662j, null);
                    }
                }
            }
        } finally {
            dnr0Var.m112673x(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f108465g) {
            mnr0.m155560d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f108468c.zzb();
        while (true) {
            try {
                m131756c();
            } catch (InterruptedException unused) {
                if (this.f108469d) {
                    Thread.currentThread().interrupt();
                    return;
                }
                mnr0.m155558b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
