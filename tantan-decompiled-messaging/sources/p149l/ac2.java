package p149l;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes13.dex */
final class ac2<T> implements Runnable, wd80<T> {

    /* JADX INFO: renamed from: a */
    private final yi60<T> f68762a = new yi60<>();

    /* JADX INFO: renamed from: b */
    private final q2f.C19395b<T, ?> f68763b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f68764c;

    public ac2(q2f.C19395b<T, ?> c19395b) {
        this.f68763b = c19395b;
    }

    @Override // p149l.wd80
    /* JADX INFO: renamed from: a */
    public void mo95707a(b4g0<T> b4g0Var, T t) {
        xi60<T> xi60Var = new xi60<>(t, b4g0Var);
        synchronized (this) {
            try {
                this.f68762a.m214882a(xi60Var);
                if (!this.f68764c) {
                    this.f68764c = true;
                    this.f68763b.m172455b().execute(this);
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
                    xi60<T> xi60VarM214884c = this.f68762a.m214884c(1000);
                    if (xi60VarM214884c == null) {
                        synchronized (this) {
                            xi60VarM214884c = this.f68762a.m214883b();
                            if (xi60VarM214884c == null) {
                                this.f68764c = false;
                                this.f68764c = false;
                                return;
                            }
                        }
                    }
                    this.f68763b.m172458e(xi60VarM214884c);
                } catch (InterruptedException e) {
                    this.f68763b.m172456c().mo112700b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.f68764c = false;
                    return;
                }
            } catch (Throwable th) {
                this.f68764c = false;
                throw th;
            }
        }
    }
}
