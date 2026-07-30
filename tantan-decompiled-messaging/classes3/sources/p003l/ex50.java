package p003l;

import java.util.concurrent.atomic.AtomicReference;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ex50<T, U, R> implements C1099c.c<R, T> {

    /* JADX INFO: renamed from: c */
    public static final Object f3408c = new Object();

    /* JADX INFO: renamed from: a */
    public final x9j<? super T, ? super U, ? extends R> f3409a;

    /* JADX INFO: renamed from: b */
    public final C1099c<? extends U> f3410b;

    /* JADX INFO: renamed from: l.ex50$a */
    public class C0285a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f3411e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f3412f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285a(z3g0 z3g0Var, boolean z, AtomicReference atomicReference, vie0 vie0Var) {
            super(z3g0Var, z);
            this.f3411e = atomicReference;
            this.f3412f = vie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f3412f.onCompleted();
            this.f3412f.unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3412f.onError(th);
            this.f3412f.unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            Object obj = this.f3411e.get();
            if (obj != ex50.f3408c) {
                try {
                    this.f3412f.onNext(ex50.this.f3409a.call(t, obj));
                } catch (Throwable th) {
                    f5f.m3965f(th, this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.ex50$b */
    public class C0286b extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f3414e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f3415f;

        public C0286b(AtomicReference atomicReference, vie0 vie0Var) {
            this.f3414e = atomicReference;
            this.f3415f = vie0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f3414e.get() == ex50.f3408c) {
                this.f3415f.onCompleted();
                this.f3415f.unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f3415f.onError(th);
            this.f3415f.unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(U u) {
            this.f3414e.set(u);
        }
    }

    public ex50(C1099c<? extends U> c1099c, x9j<? super T, ? super U, ? extends R> x9jVar) {
        this.f3410b = c1099c;
        this.f3409a = x9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super R> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var, false);
        z3g0Var.m9240b(vie0Var);
        AtomicReference atomicReference = new AtomicReference(f3408c);
        C0285a c0285a = new C0285a(vie0Var, true, atomicReference, vie0Var);
        C0286b c0286b = new C0286b(atomicReference, vie0Var);
        vie0Var.m9240b(c0285a);
        vie0Var.m9240b(c0286b);
        this.f3410b.unsafeSubscribe(c0286b);
        return c0285a;
    }
}
