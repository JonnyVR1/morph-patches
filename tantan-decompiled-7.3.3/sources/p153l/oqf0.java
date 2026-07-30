package p153l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class oqf0<T> implements kcg0 {

    /* JADX INFO: renamed from: a */
    public final ocg0 f148585a = new ocg0();

    /* JADX INFO: renamed from: a */
    public final void m168810a(kcg0 kcg0Var) {
        this.f148585a.m167213a(kcg0Var);
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo168811b(Throwable th);

    /* JADX INFO: renamed from: c */
    public abstract void mo168812c(T t);

    @Override // p153l.kcg0
    public final boolean isUnsubscribed() {
        return this.f148585a.isUnsubscribed();
    }

    @Override // p153l.kcg0
    public final void unsubscribe() {
        this.f148585a.unsubscribe();
    }
}
