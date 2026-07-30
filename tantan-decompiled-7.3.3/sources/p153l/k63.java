package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class k63 implements kcg0 {

    /* JADX INFO: renamed from: b */
    public static final x20 f124151b = new C18109a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<x20> f124152a;

    public k63() {
        this.f124152a = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    public static k63 m148510a() {
        return new k63();
    }

    /* JADX INFO: renamed from: b */
    public static k63 m148511b(x20 x20Var) {
        return new k63(x20Var);
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f124152a.get() == f124151b;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        x20 andSet;
        x20 x20Var = this.f124152a.get();
        x20 x20Var2 = f124151b;
        if (x20Var == x20Var2 || (andSet = this.f124152a.getAndSet(x20Var2)) == null || andSet == x20Var2) {
            return;
        }
        andSet.call();
    }

    public k63(x20 x20Var) {
        this.f124152a = new AtomicReference<>(x20Var);
    }

    /* JADX INFO: renamed from: l.k63$a */
    public static class C18109a implements x20 {
        @Override // p153l.x20
        public void call() {
        }
    }
}
