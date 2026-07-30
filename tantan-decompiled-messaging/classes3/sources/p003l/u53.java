package p003l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class u53 implements c4g0 {

    /* JADX INFO: renamed from: b */
    public static final d30 f7925b = new C0574a();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<d30> f7926a;

    public u53() {
        this.f7926a = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    public static u53 m8099a() {
        return new u53();
    }

    /* JADX INFO: renamed from: b */
    public static u53 m8100b(d30 d30Var) {
        return new u53(d30Var);
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f7926a.get() == f7925b;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        d30 andSet;
        d30 d30Var = this.f7926a.get();
        d30 d30Var2 = f7925b;
        if (d30Var == d30Var2 || (andSet = this.f7926a.getAndSet(d30Var2)) == null || andSet == d30Var2) {
            return;
        }
        andSet.call();
    }

    public u53(d30 d30Var) {
        this.f7926a = new AtomicReference<>(d30Var);
    }

    /* JADX INFO: renamed from: l.u53$a */
    public static class C0574a implements d30 {
        @Override // p003l.d30
        public void call() {
        }
    }
}
