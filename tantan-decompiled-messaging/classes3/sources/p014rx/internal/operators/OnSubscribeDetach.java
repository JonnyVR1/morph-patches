package p014rx.internal.operators;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import l.f31;
import l.qkq0;
import p003l.c4g0;
import p003l.ejd0;
import p003l.kc2;
import p003l.rc90;
import p003l.y3g0;
import p003l.z3g0;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class OnSubscribeDetach<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<T> f10776a;

    public enum TerminatedProducer implements rc90 {
        INSTANCE;

        @Override // p003l.rc90
        public void request(long j) {
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$a */
    public static final class C1111a<T> implements rc90, c4g0 {

        /* JADX INFO: renamed from: a */
        public final C1112b<T> f10777a;

        public C1111a(C1112b<T> c1112b) {
            this.f10777a = c1112b;
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f10777a.isUnsubscribed();
        }

        @Override // p003l.rc90
        public void request(long j) {
            this.f10777a.m9805g(j);
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f10777a.m9806h();
        }
    }

    /* JADX INFO: renamed from: rx.internal.operators.OnSubscribeDetach$b */
    public static final class C1112b<T> extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final AtomicReference<z3g0<? super T>> f10778e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<rc90> f10779f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public final AtomicLong f10780g = new AtomicLong();

        public C1112b(z3g0<? super T> z3g0Var) {
            this.f10778e = new AtomicReference<>(z3g0Var);
        }

        @Override // p003l.z3g0
        /* JADX INFO: renamed from: f */
        public void mo3257f(rc90 rc90Var) {
            if (f31.a(this.f10779f, (Object) null, rc90Var)) {
                rc90Var.request(this.f10780g.getAndSet(0L));
            } else {
                if (this.f10779f.get() == TerminatedProducer.INSTANCE) {
                    return;
                }
                qkq0.a("Producer already set!");
            }
        }

        /* JADX INFO: renamed from: g */
        public void m9805g(long j) {
            if (j < 0) {
                y3g0.m8887a("n >= 0 required but it was ", j);
                return;
            }
            rc90 rc90Var = this.f10779f.get();
            if (rc90Var != null) {
                rc90Var.request(j);
                return;
            }
            kc2.m5640b(this.f10780g, j);
            rc90 rc90Var2 = this.f10779f.get();
            if (rc90Var2 == null || rc90Var2 == TerminatedProducer.INSTANCE) {
                return;
            }
            rc90Var2.request(this.f10780g.getAndSet(0L));
        }

        /* JADX INFO: renamed from: h */
        public void m9806h() {
            this.f10779f.lazySet(TerminatedProducer.INSTANCE);
            this.f10778e.lazySet(null);
            unsubscribe();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f10779f.lazySet(TerminatedProducer.INSTANCE);
            z3g0<? super T> andSet = this.f10778e.getAndSet(null);
            if (andSet != null) {
                andSet.onCompleted();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f10779f.lazySet(TerminatedProducer.INSTANCE);
            z3g0<? super T> andSet = this.f10778e.getAndSet(null);
            if (andSet != null) {
                andSet.onError(th);
            } else {
                ejd0.m3864j(th);
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            z3g0<? super T> z3g0Var = this.f10778e.get();
            if (z3g0Var != null) {
                z3g0Var.onNext(t);
            }
        }
    }

    public OnSubscribeDetach(C1099c<T> c1099c) {
        this.f10776a = c1099c;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        C1112b c1112b = new C1112b(z3g0Var);
        C1111a c1111a = new C1111a(c1112b);
        z3g0Var.m9240b(c1111a);
        z3g0Var.mo3257f(c1111a);
        this.f10776a.unsafeSubscribe(c1112b);
    }
}
