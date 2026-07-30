package p149l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class u14 {

    /* JADX INFO: renamed from: a */
    public ExecutorService f172967a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f172968b;

    /* JADX INFO: renamed from: c */
    public lec0 f172969c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f172970d = new AtomicBoolean(false);

    public u14(lec0 lec0Var) {
        this.f172969c = lec0Var;
    }

    /* JADX INFO: renamed from: c */
    public final ExecutorService m191406c() {
        if (this.f172967a == null) {
            synchronized (this) {
                try {
                    if (this.f172967a == null) {
                        this.f172967a = this.f172969c.m149504r().m210430b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f172967a;
    }

    /* JADX INFO: renamed from: d */
    public void m191407d(final rx3 rx3Var) {
        if (this.f172970d.get()) {
            this.f172969c.m149499m().mo216485a("already shutdown");
        } else if (rx3Var instanceof mee0) {
            m191412i().execute(new Runnable() { // from class: l.s14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161860a.m191408e(rx3Var);
                }
            });
        } else if (rx3Var instanceof mfc0) {
            m191406c().execute(new Runnable() { // from class: l.t14
                @Override // java.lang.Runnable
                public final void run() {
                    this.f167284a.m191409f(rx3Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m191408e(rx3 rx3Var) {
        try {
            rx3Var.execute();
        } catch (Exception e) {
            m191410g(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m191409f(rx3 rx3Var) {
        try {
            rx3Var.execute();
        } catch (Exception e) {
            m191410g(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m191410g(Throwable th) {
        this.f172969c.m149499m().mo216486b(th);
        if (this.f172970d.get()) {
            return;
        }
        this.f172969c.m149495i().mo96775a(th);
        new tul.C20289h(this.f172969c.m149493g(), this.f172969c.m149491e().mo75513b(), th).m190706a();
    }

    /* JADX INFO: renamed from: h */
    public void m191411h() {
        this.f172970d.set(true);
        ExecutorService executorService = this.f172968b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f172968b.shutdownNow();
        }
        ExecutorService executorService2 = this.f172967a;
        if (executorService2 == null || executorService2.isShutdown()) {
            return;
        }
        this.f172967a.shutdownNow();
    }

    /* JADX INFO: renamed from: i */
    public final ExecutorService m191412i() {
        if (this.f172968b == null) {
            synchronized (this) {
                try {
                    if (this.f172968b == null) {
                        this.f172968b = this.f172969c.m149504r().m210430b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f172968b;
    }
}
