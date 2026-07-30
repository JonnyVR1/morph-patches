package p137rx.subscriptions;

import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p153l.kcg0;
import p153l.m31;
import p153l.pcg0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public final class RefCountSubscription implements kcg0 {

    /* JADX INFO: renamed from: c */
    public static final C22509a f208425c = new C22509a(false, 0);

    /* JADX INFO: renamed from: a */
    public final kcg0 f208426a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22509a> f208427b = new AtomicReference<>(f208425c);

    public static final class InnerSubscription extends AtomicInteger implements kcg0 {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.m222770b();
            }
        }
    }

    /* JADX INFO: renamed from: rx.subscriptions.RefCountSubscription$a */
    public static final class C22509a {

        /* JADX INFO: renamed from: a */
        public final boolean f208428a;

        /* JADX INFO: renamed from: b */
        public final int f208429b;

        public C22509a(boolean z, int i) {
            this.f208428a = z;
            this.f208429b = i;
        }

        /* JADX INFO: renamed from: a */
        public C22509a m222772a() {
            return new C22509a(this.f208428a, this.f208429b + 1);
        }

        /* JADX INFO: renamed from: b */
        public C22509a m222773b() {
            return new C22509a(this.f208428a, this.f208429b - 1);
        }

        /* JADX INFO: renamed from: c */
        public C22509a m222774c() {
            return new C22509a(true, this.f208429b);
        }
    }

    public RefCountSubscription(kcg0 kcg0Var) {
        if (kcg0Var != null) {
            this.f208426a = kcg0Var;
        } else {
            wg3.m206174a(BLiveStormDanmakuGiftResourceType.f45294s);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public kcg0 m222769a() {
        C22509a c22509a;
        AtomicReference<C22509a> atomicReference = this.f208427b;
        do {
            c22509a = atomicReference.get();
            if (c22509a.f208428a) {
                return pcg0.m171651d();
            }
        } while (!m31.m156916a(atomicReference, c22509a, c22509a.m222772a()));
        return new InnerSubscription(this);
    }

    /* JADX INFO: renamed from: b */
    public void m222770b() {
        C22509a c22509a;
        C22509a c22509aM222773b;
        AtomicReference<C22509a> atomicReference = this.f208427b;
        do {
            c22509a = atomicReference.get();
            c22509aM222773b = c22509a.m222773b();
        } while (!m31.m156916a(atomicReference, c22509a, c22509aM222773b));
        m222771c(c22509aM222773b);
    }

    /* JADX INFO: renamed from: c */
    public final void m222771c(C22509a c22509a) {
        if (c22509a.f208428a && c22509a.f208429b == 0) {
            this.f208426a.unsubscribe();
        }
    }

    @Override // p153l.kcg0
    public boolean isUnsubscribed() {
        return this.f208427b.get().f208428a;
    }

    @Override // p153l.kcg0
    public void unsubscribe() {
        C22509a c22509a;
        C22509a c22509aM222774c;
        AtomicReference<C22509a> atomicReference = this.f208427b;
        do {
            c22509a = atomicReference.get();
            if (c22509a.f208428a) {
                return;
            } else {
                c22509aM222774c = c22509a.m222774c();
            }
        } while (!m31.m156916a(atomicReference, c22509a, c22509aM222774c));
        m222771c(c22509aM222774c);
    }
}
