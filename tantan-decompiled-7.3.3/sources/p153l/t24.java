package p153l;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class t24 {

    /* JADX INFO: renamed from: a */
    public ExecutorService f171713a;

    /* JADX INFO: renamed from: b */
    public ExecutorService f171714b;

    /* JADX INFO: renamed from: c */
    public smc0 f171715c;

    /* JADX INFO: renamed from: d */
    public AtomicBoolean f171716d = new AtomicBoolean(false);

    public t24(smc0 smc0Var) {
        this.f171715c = smc0Var;
    }

    /* JADX INFO: renamed from: c */
    public final ExecutorService m188944c() {
        if (this.f171713a == null) {
            synchronized (this) {
                try {
                    if (this.f171713a == null) {
                        this.f171713a = this.f171715c.m186800r().m221992b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f171713a;
    }

    /* JADX INFO: renamed from: d */
    public void m188945d(final qy3 qy3Var) {
        if (this.f171716d.get()) {
            this.f171715c.m186795m().mo204126a("already shutdown");
        } else if (qy3Var instanceof rme0) {
            m188950i().execute(new Runnable() { // from class: l.r24
                @Override // java.lang.Runnable
                public final void run() {
                    this.f160912a.m188946e(qy3Var);
                }
            });
        } else if (qy3Var instanceof tnc0) {
            m188944c().execute(new Runnable() { // from class: l.s24
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165859a.m188947f(qy3Var);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m188946e(qy3 qy3Var) {
        try {
            qy3Var.execute();
        } catch (Exception e) {
            m188948g(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m188947f(qy3 qy3Var) {
        try {
            qy3Var.execute();
        } catch (Exception e) {
            m188948g(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m188948g(Throwable th) {
        this.f171715c.m186795m().mo204127b(th);
        if (this.f171716d.get()) {
            return;
        }
        this.f171715c.m186791i().mo135096a(th);
        new gxl.C17342h(this.f171715c.m186789g(), this.f171715c.m186787e().mo76696b(), th).m132876a();
    }

    /* JADX INFO: renamed from: h */
    public void m188949h() {
        this.f171716d.set(true);
        ExecutorService executorService = this.f171714b;
        if (executorService != null && !executorService.isShutdown()) {
            this.f171714b.shutdownNow();
        }
        ExecutorService executorService2 = this.f171713a;
        if (executorService2 == null || executorService2.isShutdown()) {
            return;
        }
        this.f171713a.shutdownNow();
    }

    /* JADX INFO: renamed from: i */
    public final ExecutorService m188950i() {
        if (this.f171714b == null) {
            synchronized (this) {
                try {
                    if (this.f171714b == null) {
                        this.f171714b = this.f171715c.m186800r().m221992b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f171714b;
    }
}
