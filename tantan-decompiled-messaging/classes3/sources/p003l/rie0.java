package p003l;

import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rie0 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C0504a> f6933a = new AtomicReference<>(new C0504a(false, h4g0.m4915b()));

    /* JADX INFO: renamed from: l.rie0$a */
    public static final class C0504a {

        /* JADX INFO: renamed from: a */
        public final boolean f6934a;

        /* JADX INFO: renamed from: b */
        public final c4g0 f6935b;

        public C0504a(boolean z, c4g0 c4g0Var) {
            this.f6934a = z;
            this.f6935b = c4g0Var;
        }

        /* JADX INFO: renamed from: a */
        public C0504a m7261a(c4g0 c4g0Var) {
            return new C0504a(this.f6934a, c4g0Var);
        }

        /* JADX INFO: renamed from: b */
        public C0504a m7262b() {
            return new C0504a(true, this.f6935b);
        }
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m7259a() {
        return this.f6933a.get().f6935b;
    }

    /* JADX INFO: renamed from: b */
    public void m7260b(c4g0 c4g0Var) {
        C0504a c0504a;
        if (c4g0Var == null) {
            ig3.a("Subscription can not be null");
            return;
        }
        AtomicReference<C0504a> atomicReference = this.f6933a;
        do {
            c0504a = atomicReference.get();
            if (c0504a.f6934a) {
                c4g0Var.unsubscribe();
                return;
            }
        } while (!f31.a(atomicReference, c0504a, c0504a.m7261a(c4g0Var)));
        c0504a.f6935b.unsubscribe();
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f6933a.get().f6934a;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        C0504a c0504a;
        AtomicReference<C0504a> atomicReference = this.f6933a;
        do {
            c0504a = atomicReference.get();
            if (c0504a.f6934a) {
                return;
            }
        } while (!f31.a(atomicReference, c0504a, c0504a.m7262b()));
        c0504a.f6935b.unsubscribe();
    }
}
