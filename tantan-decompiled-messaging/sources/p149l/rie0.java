package p149l;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class rie0 implements c4g0 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<C19708a> f159547a = new AtomicReference<>(new C19708a(false, h4g0.m129241b()));

    /* JADX INFO: renamed from: l.rie0$a */
    public static final class C19708a {

        /* JADX INFO: renamed from: a */
        public final boolean f159548a;

        /* JADX INFO: renamed from: b */
        public final c4g0 f159549b;

        public C19708a(boolean z, c4g0 c4g0Var) {
            this.f159548a = z;
            this.f159549b = c4g0Var;
        }

        /* JADX INFO: renamed from: a */
        public C19708a m179505a(c4g0 c4g0Var) {
            return new C19708a(this.f159548a, c4g0Var);
        }

        /* JADX INFO: renamed from: b */
        public C19708a m179506b() {
            return new C19708a(true, this.f159549b);
        }
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m179503a() {
        return this.f159547a.get().f159549b;
    }

    /* JADX INFO: renamed from: b */
    public void m179504b(c4g0 c4g0Var) {
        C19708a c19708a;
        if (c4g0Var == null) {
            ig3.m135964a("Subscription can not be null");
            return;
        }
        AtomicReference<C19708a> atomicReference = this.f159547a;
        do {
            c19708a = atomicReference.get();
            if (c19708a.f159548a) {
                c4g0Var.unsubscribe();
                return;
            }
        } while (!f31.m119248a(atomicReference, c19708a, c19708a.m179505a(c4g0Var)));
        c19708a.f159549b.unsubscribe();
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f159547a.get().f159548a;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        C19708a c19708a;
        AtomicReference<C19708a> atomicReference = this.f159547a;
        do {
            c19708a = atomicReference.get();
            if (c19708a.f159548a) {
                return;
            }
        } while (!f31.m119248a(atomicReference, c19708a, c19708a.m179506b()));
        c19708a.f159549b.unsubscribe();
    }
}
