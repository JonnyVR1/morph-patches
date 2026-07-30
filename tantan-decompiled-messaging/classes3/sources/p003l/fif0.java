package p003l;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class fif0<T> implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final g4g0 f3630a = new g4g0();

    /* JADX INFO: renamed from: a */
    public final void m4375a(c4g0 c4g0Var) {
        this.f3630a.m4517a(c4g0Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo4376b(Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo4377c(T t);

    @Override // p003l.c4g0
    public final boolean isUnsubscribed() {
        return this.f3630a.isUnsubscribed();
    }

    @Override // p003l.c4g0
    public final void unsubscribe() {
        this.f3630a.unsubscribe();
    }
}
