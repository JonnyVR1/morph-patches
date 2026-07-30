package p133rx.subscriptions;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p149l.c4g0;
import p149l.f31;
import p149l.h4g0;
import p149l.ig3;

/* JADX INFO: loaded from: classes3.dex */
public final class RefCountSubscription implements c4g0 {

    /* JADX INFO: renamed from: c */
    public static final C22394a f207503c = new C22394a(false, 0);

    /* JADX INFO: renamed from: a */
    public final c4g0 f207504a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<C22394a> f207505b = new AtomicReference<>(f207503c);

    public static final class InnerSubscription extends AtomicInteger implements c4g0 {
        private static final long serialVersionUID = 7005765588239987643L;
        final RefCountSubscription parent;

        public InnerSubscription(RefCountSubscription refCountSubscription) {
            this.parent = refCountSubscription;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return get() != 0;
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            if (compareAndSet(0, 1)) {
                this.parent.m221524b();
            }
        }
    }

    /* JADX INFO: renamed from: rx.subscriptions.RefCountSubscription$a */
    public static final class C22394a {

        /* JADX INFO: renamed from: a */
        public final boolean f207506a;

        /* JADX INFO: renamed from: b */
        public final int f207507b;

        public C22394a(boolean z, int i) {
            this.f207506a = z;
            this.f207507b = i;
        }

        /* JADX INFO: renamed from: a */
        public C22394a m221526a() {
            return new C22394a(this.f207506a, this.f207507b + 1);
        }

        /* JADX INFO: renamed from: b */
        public C22394a m221527b() {
            return new C22394a(this.f207506a, this.f207507b - 1);
        }

        /* JADX INFO: renamed from: c */
        public C22394a m221528c() {
            return new C22394a(true, this.f207507b);
        }
    }

    public RefCountSubscription(c4g0 c4g0Var) {
        if (c4g0Var != null) {
            this.f207504a = c4g0Var;
        } else {
            ig3.m135964a(BLiveStormDanmakuGiftResourceType.f44446s);
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public c4g0 m221523a() {
        C22394a c22394a;
        AtomicReference<C22394a> atomicReference = this.f207505b;
        do {
            c22394a = atomicReference.get();
            if (c22394a.f207506a) {
                return h4g0.m129243d();
            }
        } while (!f31.m119248a(atomicReference, c22394a, c22394a.m221526a()));
        return new InnerSubscription(this);
    }

    /* JADX INFO: renamed from: b */
    public void m221524b() {
        C22394a c22394a;
        C22394a c22394aM221527b;
        AtomicReference<C22394a> atomicReference = this.f207505b;
        do {
            c22394a = atomicReference.get();
            c22394aM221527b = c22394a.m221527b();
        } while (!f31.m119248a(atomicReference, c22394a, c22394aM221527b));
        m221525c(c22394aM221527b);
    }

    /* JADX INFO: renamed from: c */
    public final void m221525c(C22394a c22394a) {
        if (c22394a.f207506a && c22394a.f207507b == 0) {
            this.f207504a.unsubscribe();
        }
    }

    @Override // p149l.c4g0
    public boolean isUnsubscribed() {
        return this.f207505b.get().f207506a;
    }

    @Override // p149l.c4g0
    public void unsubscribe() {
        C22394a c22394a;
        C22394a c22394aM221528c;
        AtomicReference<C22394a> atomicReference = this.f207505b;
        do {
            c22394a = atomicReference.get();
            if (c22394a.f207506a) {
                return;
            } else {
                c22394aM221528c = c22394a.m221528c();
            }
        } while (!f31.m119248a(atomicReference, c22394a, c22394aM221528c));
        m221525c(c22394aM221528c);
    }
}
