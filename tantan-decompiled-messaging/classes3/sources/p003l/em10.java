package p003l;

import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class em10 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C0277a> f3334a = new AtomicReference<>(new C0277a(false, h4g0.m4915b()));

    /* JADX INFO: renamed from: l.em10$a */
    public static final class C0277a {

        /* JADX INFO: renamed from: a */
        public final boolean f3335a;

        /* JADX INFO: renamed from: b */
        public final c4g0 f3336b;

        public C0277a(boolean z, c4g0 c4g0Var) {
            this.f3335a = z;
            this.f3336b = c4g0Var;
        }

        /* JADX INFO: renamed from: a */
        public C0277a m3902a(c4g0 c4g0Var) {
            return new C0277a(this.f3335a, c4g0Var);
        }

        /* JADX INFO: renamed from: b */
        public C0277a m3903b() {
            return new C0277a(true, this.f3336b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3901a(c4g0 c4g0Var) {
        C0277a c0277a;
        if (c4g0Var == null) {
            ig3.a("Subscription can not be null");
            return;
        }
        AtomicReference<C0277a> atomicReference = this.f3334a;
        do {
            c0277a = atomicReference.get();
            if (c0277a.f3335a) {
                c4g0Var.unsubscribe();
                return;
            }
        } while (!f31.a(atomicReference, c0277a, c0277a.m3902a(c4g0Var)));
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f3334a.get().f3335a;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        C0277a c0277a;
        AtomicReference<C0277a> atomicReference = this.f3334a;
        do {
            c0277a = atomicReference.get();
            if (c0277a.f3335a) {
                return;
            }
        } while (!f31.a(atomicReference, c0277a, c0277a.m3903b()));
        c0277a.f3336b.unsubscribe();
    }
}
