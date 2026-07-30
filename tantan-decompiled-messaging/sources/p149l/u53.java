package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u53 implements c4g0 {

    /* JADX INFO: renamed from: b */
    public static final d30 f174648b = new C20358a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<d30> f174649a;

    public u53() {
        this.f174649a = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    public static u53 m191790a() {
        return new u53();
    }

    /* JADX INFO: renamed from: b */
    public static u53 m191791b(d30 d30Var) {
        return new u53(d30Var);
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f174649a.get() == f174648b;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        d30 andSet;
        d30 d30Var = this.f174649a.get();
        d30 d30Var2 = f174648b;
        if (d30Var == d30Var2 || (andSet = this.f174649a.getAndSet(d30Var2)) == null || andSet == d30Var2) {
            return;
        }
        andSet.call();
    }

    public u53(d30 d30Var) {
        this.f174649a = new AtomicReference<>(d30Var);
    }

    /* JADX INFO: renamed from: l.u53$a */
    public static class C20358a implements d30 {
        @Override // p149l.d30
        public void call() {
        }
    }
}
