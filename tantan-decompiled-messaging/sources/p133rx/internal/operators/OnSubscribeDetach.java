package p133rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.ejd0;
import p149l.f31;
import p149l.kc2;
import p149l.qkq0;
import p149l.rc90;
import p149l.y3g0;
import p149l.z3g0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeDetach<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<T> f207151a;

    public enum TerminatedProducer implements rc90 {
        INSTANCE;

        @Override // p149l.rc90
        public void request(long j) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$a */
    public static final class C22318a<T> implements rc90, c4g0 {

        /* JADX INFO: renamed from: a */
        public final C22319b<T> f207152a;

        public C22318a(C22319b<T> c22319b) {
            this.f207152a = c22319b;
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f207152a.isUnsubscribed();
        }

        @Override // p149l.rc90
        public void request(long j) {
            this.f207152a.m221348g(j);
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f207152a.m221349h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$b */
    public static final class C22319b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final AtomicReference<z3g0<? super T>> f207153e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<rc90> f207154f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public final AtomicLong f207155g = new AtomicLong();

        public C22319b(z3g0<? super T> z3g0Var) {
            this.f207153e = new AtomicReference<>(z3g0Var);
        }

        @Override // p149l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo106696f(rc90 rc90Var) {
            if (f31.m119248a(this.f207154f, null, rc90Var)) {
                rc90Var.request(this.f207155g.getAndSet(0L));
            } else {
                if (this.f207154f.get() == TerminatedProducer.INSTANCE) {
                    return;
                }
                qkq0.m175383a("Producer already set!");
            }
        }

        /* JADX INFO: renamed from: g */
        public void m221348g(long j) {
            if (j < 0) {
                y3g0.m212802a("n >= 0 required but it was ", j);
                return;
            }
            rc90 rc90Var = this.f207154f.get();
            if (rc90Var != null) {
                rc90Var.request(j);
                return;
            }
            kc2.m145336b(this.f207155g, j);
            rc90 rc90Var2 = this.f207154f.get();
            if (rc90Var2 == null || rc90Var2 == TerminatedProducer.INSTANCE) {
                return;
            }
            rc90Var2.request(this.f207155g.getAndSet(0L));
        }

        /* JADX INFO: renamed from: h */
        public void m221349h() {
            this.f207154f.lazySet(TerminatedProducer.INSTANCE);
            this.f207153e.lazySet(null);
            unsubscribe();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f207154f.lazySet(TerminatedProducer.INSTANCE);
            z3g0<? super T> andSet = this.f207153e.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f207154f.lazySet(TerminatedProducer.INSTANCE);
            z3g0<? super T> andSet = this.f207153e.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                ejd0.m116793j(th);
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            z3g0<? super T> z3g0Var = this.f207153e.get();
            if (z3g0Var != null) {
                z3g0Var.onNext(t);
            }
        }
    }

    public OnSubscribeDetach(C22306c<T> c22306c) {
        this.f207151a = c22306c;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C22319b c22319b = new C22319b(z3g0Var);
        C22318a c22318a = new C22318a(c22319b);
        z3g0Var.m217046b(c22318a);
        z3g0Var.mo106696f(c22318a);
        this.f207151a.unsafeSubscribe(c22319b);
    }
}
