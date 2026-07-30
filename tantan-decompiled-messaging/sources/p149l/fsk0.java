package p149l;

/* JADX INFO: loaded from: classes.dex */
public abstract class fsk0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    private yrk0<T> f99086a;

    /* JADX INFO: renamed from: a */
    public abstract void m122954a(yrk0<T> yrk0Var);

    /* JADX INFO: renamed from: b */
    public void m122955b(yrk0<T> yrk0Var) {
        this.f99086a = yrk0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f99086a) {
            m122954a(this.f99086a);
        }
    }
}
