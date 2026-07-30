package p002l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u14 {

    /* JADX INFO: renamed from: a */
    public ExecutorService f20449a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f20450b;

    /* JADX INFO: renamed from: c */
    public lec0 f20451c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f20452d = new AtomicBoolean(false);

    public u14(lec0 lec0Var) {
        this.f20451c = lec0Var;
    }

    /* JADX INFO: renamed from: c */
    public final ExecutorService m23250c() {
        if (this.f20449a == null) {
            synchronized (this) {
                try {
                    if (this.f20449a == null) {
                        this.f20449a = this.f20451c.m17162r().m26045b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20449a;
    }

    /* JADX INFO: renamed from: d */
    public void m23251d(final rx3 rx3Var) {
        if (this.f20452d.get()) {
            this.f20451c.m17157m().mo26978a("already shutdown");
        } else if (rx3Var instanceof mee0) {
            m23256i().execute(new Runnable() { // from class: l.s14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18751a.m23252e(rx3Var);
                }
            });
        } else if (rx3Var instanceof mfc0) {
            m23250c().execute(new Runnable() { // from class: l.t14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19354a.m23253f(rx3Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m23252e(rx3 rx3Var) {
        try {
            rx3Var.execute();
        } catch (Exception e) {
            m23254g(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m23253f(rx3 rx3Var) {
        try {
            rx3Var.execute();
        } catch (Exception e) {
            m23254g(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m23254g(Throwable th) {
        this.f20451c.m17157m().mo26979b(th);
        if (this.f20452d.get()) {
            return;
        }
        this.f20451c.m17153i().mo9786a(th);
        new tul.C0846h(this.f20451c.m17151g(), this.f20451c.m17149e().mo9148b(), th).m23172a();
    }

    /* JADX INFO: renamed from: h */
    public void m23255h() {
        this.f20452d.set(true);
        ExecutorService executorService = this.f20450b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f20450b.shutdownNow();
        }
        ExecutorService executorService2 = this.f20449a;
        if (executorService2 == null || executorService2.isShutdown()) {
            return;
        }
        this.f20449a.shutdownNow();
    }

    /* JADX INFO: renamed from: i */
    public final ExecutorService m23256i() {
        if (this.f20450b == null) {
            synchronized (this) {
                try {
                    if (this.f20450b == null) {
                        this.f20450b = this.f20451c.m17162r().m26045b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f20450b;
    }
}
