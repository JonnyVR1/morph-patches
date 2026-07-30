package p137rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;
import p153l.fcg0;
import p153l.gcg0;
import p153l.hrd0;
import p153l.kcg0;
import p153l.m31;
import p153l.rc2;
import p153l.vk90;
import p153l.wtq0;

/* JADX INFO: loaded from: classes3.dex */
public final class OnSubscribeDetach<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<T> f208073a;

    public enum TerminatedProducer implements vk90 {
        INSTANCE;

        @Override // p153l.vk90
        public void request(long j) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$a */
    public static final class C22433a<T> implements vk90, kcg0 {

        /* JADX INFO: renamed from: a */
        public final C22434b<T> f208074a;

        public C22433a(C22434b<T> c22434b) {
            this.f208074a = c22434b;
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f208074a.isUnsubscribed();
        }

        @Override // p153l.vk90
        public void request(long j) {
            this.f208074a.m222594g(j);
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f208074a.m222595h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$b */
    public static final class C22434b<T> extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final AtomicReference<gcg0<? super T>> f208075e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<vk90> f208076f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public final AtomicLong f208077g = new AtomicLong();

        public C22434b(gcg0<? super T> gcg0Var) {
            this.f208075e = new AtomicReference<>(gcg0Var);
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: f */
        public void mo95773f(vk90 vk90Var) {
            if (m31.m156916a(this.f208076f, null, vk90Var)) {
                vk90Var.request(this.f208077g.getAndSet(0L));
            } else {
                if (this.f208076f.get() == TerminatedProducer.INSTANCE) {
                    return;
                }
                wtq0.m207906a("Producer already set!");
            }
        }

        /* JADX INFO: renamed from: g */
        public void m222594g(long j) {
            if (j < 0) {
                fcg0.m125008a("n >= 0 required but it was ", j);
                return;
            }
            vk90 vk90Var = this.f208076f.get();
            if (vk90Var != null) {
                vk90Var.request(j);
                return;
            }
            rc2.m180770b(this.f208077g, j);
            vk90 vk90Var2 = this.f208076f.get();
            if (vk90Var2 == null || vk90Var2 == TerminatedProducer.INSTANCE) {
                return;
            }
            vk90Var2.request(this.f208077g.getAndSet(0L));
        }

        /* JADX INFO: renamed from: h */
        public void m222595h() {
            this.f208076f.lazySet(TerminatedProducer.INSTANCE);
            this.f208075e.lazySet(null);
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f208076f.lazySet(TerminatedProducer.INSTANCE);
            gcg0<? super T> andSet = this.f208075e.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f208076f.lazySet(TerminatedProducer.INSTANCE);
            gcg0<? super T> andSet = this.f208075e.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                hrd0.m136792j(th);
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            gcg0<? super T> gcg0Var = this.f208075e.get();
            if (gcg0Var != null) {
                gcg0Var.onNext(t);
            }
        }
    }

    public OnSubscribeDetach(C22421c<T> c22421c) {
        this.f208073a = c22421c;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        C22434b c22434b = new C22434b(gcg0Var);
        C22433a c22433a = new C22433a(c22434b);
        gcg0Var.m129866b(c22433a);
        gcg0Var.mo95773f(c22433a);
        this.f208073a.unsafeSubscribe(c22434b);
    }
}
