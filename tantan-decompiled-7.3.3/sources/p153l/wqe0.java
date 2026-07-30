package p153l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class wqe0 implements kcg0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C21166a> f190395a = new AtomicReference<>(new C21166a(false, pcg0.m171649b()));

    /* JADX INFO: renamed from: l.wqe0$a */
    public static final class C21166a {

        /* JADX INFO: renamed from: a */
        public final boolean f190396a;

        /* JADX INFO: renamed from: b */
        public final kcg0 f190397b;

        public C21166a(boolean z, kcg0 kcg0Var) {
            this.f190396a = z;
            this.f190397b = kcg0Var;
        }

        /* JADX INFO: renamed from: a */
        public C21166a m207512a(kcg0 kcg0Var) {
            return new C21166a(this.f190396a, kcg0Var);
        }

        /* JADX INFO: renamed from: b */
        public C21166a m207513b() {
            return new C21166a(true, this.f190397b);
        }
    }

    /* JADX INFO: renamed from: a */
    public kcg0 m207510a() {
        return this.f190395a.get().f190397b;
    }

    /* JADX INFO: renamed from: b */
    public void m207511b(kcg0 kcg0Var) {
        C21166a c21166a;
        if (kcg0Var == null) {
            wg3.m206174a("Subscription can not be null");
            return;
        }
        AtomicReference<C21166a> atomicReference = this.f190395a;
        do {
            c21166a = atomicReference.get();
            if (c21166a.f190396a) {
                kcg0Var.unsubscribe();
                return;
            }
        } while (!m31.m156916a(atomicReference, c21166a, c21166a.m207512a(kcg0Var)));
        c21166a.f190397b.unsubscribe();
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f190395a.get().f190396a;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        C21166a c21166a;
        AtomicReference<C21166a> atomicReference = this.f190395a;
        do {
            c21166a = atomicReference.get();
            if (c21166a.f190396a) {
                return;
            }
        } while (!m31.m156916a(atomicReference, c21166a, c21166a.m207513b()));
        c21166a.f190397b.unsubscribe();
    }
}
