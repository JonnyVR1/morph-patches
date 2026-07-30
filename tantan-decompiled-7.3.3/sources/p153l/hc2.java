package p153l;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes11.dex */
final class hc2<T> implements Runnable, dm80<T> {

    /* JADX INFO: renamed from: a */
    private final dr60<T> f108665a = new dr60<>();

    /* JADX INFO: renamed from: b */
    private final v3f.C20734b<T, ?> f108666b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f108667c;

    public hc2(v3f.C20734b<T, ?> c20734b) {
        this.f108666b = c20734b;
    }

    @Override // p153l.dm80
    /* JADX INFO: renamed from: a */
    public void mo116941a(jcg0<T> jcg0Var, T t) {
        cr60<T> cr60Var = new cr60<>(t, jcg0Var);
        synchronized (this) {
            try {
                this.f108665a.m117684a(cr60Var);
                if (!this.f108667c) {
                    this.f108667c = true;
                    this.f108666b.m199265b().execute(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (true) {
            try {
                try {
                    cr60<T> cr60VarM117686c = this.f108665a.m117686c(1000);
                    if (cr60VarM117686c == null) {
                        synchronized (this) {
                            cr60VarM117686c = this.f108665a.m117685b();
                            if (cr60VarM117686c == null) {
                                this.f108667c = false;
                                this.f108667c = false;
                                return;
                            }
                        }
                    }
                    this.f108666b.m199268e(cr60VarM117686c);
                } catch (InterruptedException e) {
                    this.f108666b.m199266c().mo208768b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.f108667c = false;
                    return;
                }
            } catch (Throwable th) {
                this.f108667c = false;
                throw th;
            }
        }
    }
}
