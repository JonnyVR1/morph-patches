package p014rx.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.ig3;
import p003l.c4g0;
import p003l.h4g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class RefCountSubscription implements c4g0 {

    /* JADX INFO: renamed from: c */
    public static final C1187a f11128c = new C1187a(false, 0);

    /* JADX INFO: renamed from: a */
    public final c4g0 f11129a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C1187a> f11130b = new AtomicReference<>(f11128c);

    public static final class InnerSubscription extends AtomicInteger implements c4g0 {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.m9981b();
            }
        }
    }

    /* JADX INFO: renamed from: rx.subscriptions.RefCountSubscription$a */
    public static final class C1187a {

        /* JADX INFO: renamed from: a */
        public final boolean f11131a;

        /* JADX INFO: renamed from: b */
        public final int f11132b;

        public C1187a(boolean z, int i) {
            this.f11131a = z;
            this.f11132b = i;
        }

        /* JADX INFO: renamed from: a */
        public C1187a m9983a() {
            return new C1187a(this.f11131a, this.f11132b + 1);
        }

        /* JADX INFO: renamed from: b */
        public C1187a m9984b() {
            return new C1187a(this.f11131a, this.f11132b - 1);
        }

        /* JADX INFO: renamed from: c */
        public C1187a m9985c() {
            return new C1187a(true, this.f11132b);
        }
    }

    public RefCountSubscription(c4g0 c4g0Var) {
        if (c4g0Var != null) {
            this.f11129a = c4g0Var;
        } else {
            ig3.a("s");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m9980a() {
        C1187a c1187a;
        AtomicReference<C1187a> atomicReference = this.f11130b;
        do {
            c1187a = atomicReference.get();
            if (c1187a.f11131a) {
                return h4g0.m4917d();
            }
        } while (!f31.a(atomicReference, c1187a, c1187a.m9983a()));
        return new InnerSubscription(this);
    }

    /* JADX INFO: renamed from: b */
    public void m9981b() {
        C1187a c1187a;
        C1187a c1187aM9984b;
        AtomicReference<C1187a> atomicReference = this.f11130b;
        do {
            c1187a = atomicReference.get();
            c1187aM9984b = c1187a.m9984b();
        } while (!f31.a(atomicReference, c1187a, c1187aM9984b));
        m9982c(c1187aM9984b);
    }

    /* JADX INFO: renamed from: c */
    public final void m9982c(C1187a c1187a) {
        if (c1187a.f11131a && c1187a.f11132b == 0) {
            this.f11129a.unsubscribe();
        }
    }

    @Override // p003l.c4g0
    public boolean isUnsubscribed() {
        return this.f11130b.get().f11131a;
    }

    @Override // p003l.c4g0
    public void unsubscribe() {
        C1187a c1187a;
        C1187a c1187aM9985c;
        AtomicReference<C1187a> atomicReference = this.f11130b;
        do {
            c1187a = atomicReference.get();
            if (c1187a.f11131a) {
                return;
            } else {
                c1187aM9985c = c1187a.m9985c();
            }
        } while (!f31.a(atomicReference, c1187a, c1187aM9985c));
        m9982c(c1187aM9985c);
    }
}
