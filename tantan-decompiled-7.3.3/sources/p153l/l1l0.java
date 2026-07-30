package p153l;

/* JADX INFO: loaded from: classes.dex */
public abstract class l1l0<T> implements Runnable {

    /* JADX INFO: renamed from: a */
    private e1l0<T> f129702a;

    /* JADX INFO: renamed from: a */
    public abstract void m152505a(e1l0<T> e1l0Var);

    /* JADX INFO: renamed from: b */
    public void m152506b(e1l0<T> e1l0Var) {
        this.f129702a = e1l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f129702a) {
            m152505a(this.f129702a);
        }
    }
}
