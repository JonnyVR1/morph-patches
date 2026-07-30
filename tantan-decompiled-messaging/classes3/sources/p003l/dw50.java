package p003l;

import java.util.concurrent.atomic.AtomicBoolean;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class dw50<T, U> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<U> f3127a;

    /* JADX INFO: renamed from: l.dw50$a */
    public class C0248a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f3128e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f3129f;

        public C0248a(AtomicBoolean atomicBoolean, vie0 vie0Var) {
            this.f3128e = atomicBoolean;
            this.f3129f = vie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3129f.onError(th);
            this.f3129f.unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(U u) {
            this.f3128e.set(true);
            unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.dw50$b */
    public class C0249b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f3131e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f3132f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0249b(z3g0 z3g0Var, AtomicBoolean atomicBoolean, vie0 vie0Var) {
            super(z3g0Var);
            this.f3131e = atomicBoolean;
            this.f3132f = vie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3132f.onCompleted();
            unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3132f.onError(th);
            unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f3131e.get()) {
                this.f3132f.onNext(t);
            } else {
                m9242e(1L);
            }
        }
    }

    public dw50(C1099c<U> c1099c) {
        this.f3127a = c1099c;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C0248a c0248a = new C0248a(atomicBoolean, vie0Var);
        z3g0Var.m9240b(c0248a);
        this.f3127a.unsafeSubscribe(c0248a);
        return new C0249b(z3g0Var, atomicBoolean, vie0Var);
    }
}
