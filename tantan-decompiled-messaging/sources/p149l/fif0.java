package p149l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class fif0<T> implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final g4g0 f97658a = new g4g0();

    /* JADX INFO: renamed from: a */
    public final void m121509a(c4g0 c4g0Var) {
        this.f97658a.m124367a(c4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo121510b(Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo121511c(T t);

    @Override // p149l.c4g0
    public final boolean isUnsubscribed() {
        return this.f97658a.isUnsubscribed();
    }

    @Override // p149l.c4g0
    public final void unsubscribe() {
        this.f97658a.unsubscribe();
    }
}
