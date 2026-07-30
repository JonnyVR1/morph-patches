package p003l;

import java.util.concurrent.atomic.AtomicReference;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class tv50<T, U> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f7796b = new Object();

    /* JADX INFO: renamed from: a */
    public final C1099c<U> f7797a;

    /* JADX INFO: renamed from: l.tv50$a */
    public class C0570a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f7798e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f7799f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f7800g;

        public C0570a(AtomicReference atomicReference, vie0 vie0Var, AtomicReference atomicReference2) {
            this.f7798e = atomicReference;
            this.f7799f = vie0Var;
            this.f7800g = atomicReference2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            onNext(null);
            this.f7799f.onCompleted();
            ((c4g0) this.f7800g.get()).unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7799f.onError(th);
            ((c4g0) this.f7800g.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p003l.m250
        public void onNext(U u) {
            AtomicReference atomicReference = this.f7798e;
            Object obj = tv50.f7796b;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                this.f7799f.onNext(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: l.tv50$b */
    public class C0571b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f7802e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f7803f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f7804g;

        public C0571b(AtomicReference atomicReference, vie0 vie0Var, z3g0 z3g0Var) {
            this.f7802e = atomicReference;
            this.f7803f = vie0Var;
            this.f7804g = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f7804g.onNext(null);
            this.f7803f.onCompleted();
            this.f7804g.unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f7803f.onError(th);
            this.f7804g.unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f7802e.set(t);
        }
    }

    public tv50(C1099c<U> c1099c) {
        this.f7797a = c1099c;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        AtomicReference atomicReference = new AtomicReference(f7796b);
        AtomicReference atomicReference2 = new AtomicReference();
        C0570a c0570a = new C0570a(atomicReference, vie0Var, atomicReference2);
        C0571b c0571b = new C0571b(atomicReference, vie0Var, c0570a);
        atomicReference2.lazySet(c0571b);
        z3g0Var.m9240b(c0571b);
        z3g0Var.m9240b(c0570a);
        this.f7797a.unsafeSubscribe(c0570a);
        return c0571b;
    }
}
