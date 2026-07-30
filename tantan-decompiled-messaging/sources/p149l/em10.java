package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class em10 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C16644a> f92181a = new AtomicReference<>(new C16644a(false, h4g0.m129241b()));

    /* JADX INFO: renamed from: l.em10$a */
    public static final class C16644a {

        /* JADX INFO: renamed from: a */
        public final boolean f92182a;

        /* JADX INFO: renamed from: b */
        public final c4g0 f92183b;

        public C16644a(boolean z, c4g0 c4g0Var) {
            this.f92182a = z;
            this.f92183b = c4g0Var;
        }

        /* JADX INFO: renamed from: a */
        public C16644a m117196a(c4g0 c4g0Var) {
            return new C16644a(this.f92182a, c4g0Var);
        }

        /* JADX INFO: renamed from: b */
        public C16644a m117197b() {
            return new C16644a(true, this.f92183b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m117195a(c4g0 c4g0Var) {
        C16644a c16644a;
        if (c4g0Var == null) {
            ig3.m135964a("Subscription can not be null");
            return;
        }
        AtomicReference<C16644a> atomicReference = this.f92181a;
        do {
            c16644a = atomicReference.get();
            if (c16644a.f92182a) {
                c4g0Var.unsubscribe();
                return;
            }
        } while (!f31.m119248a(atomicReference, c16644a, c16644a.m117196a(c4g0Var)));
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f92181a.get().f92182a;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        C16644a c16644a;
        AtomicReference<C16644a> atomicReference = this.f92181a;
        do {
            c16644a = atomicReference.get();
            if (c16644a.f92182a) {
                return;
            }
        } while (!f31.m119248a(atomicReference, c16644a, c16644a.m117197b()));
        c16644a.f92183b.unsubscribe();
    }
}
