package p149l;

import java.util.concurrent.atomic.AtomicReference;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class tv50<T, U> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f172253b = new Object();

    /* JADX INFO: renamed from: a */
    public final C22306c<U> f172254a;

    /* JADX INFO: renamed from: l.tv50$a */
    public class C20293a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f172255e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f172256f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f172257g;

        public C20293a(AtomicReference atomicReference, vie0 vie0Var, AtomicReference atomicReference2) {
            this.f172255e = atomicReference;
            this.f172256f = vie0Var;
            this.f172257g = atomicReference2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            onNext(null);
            this.f172256f.onCompleted();
            ((c4g0) this.f172257g.get()).unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f172256f.onError(th);
            ((c4g0) this.f172257g.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.m250
        public void onNext(U u) {
            AtomicReference atomicReference = this.f172255e;
            Object obj = tv50.f172253b;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                this.f172256f.onNext(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: l.tv50$b */
    public class C20294b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f172259e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f172260f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f172261g;

        public C20294b(AtomicReference atomicReference, vie0 vie0Var, z3g0 z3g0Var) {
            this.f172259e = atomicReference;
            this.f172260f = vie0Var;
            this.f172261g = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f172261g.onNext(null);
            this.f172260f.onCompleted();
            this.f172261g.unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f172260f.onError(th);
            this.f172261g.unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f172259e.set(t);
        }
    }

    public tv50(C22306c<U> c22306c) {
        this.f172254a = c22306c;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        AtomicReference atomicReference = new AtomicReference(f172253b);
        AtomicReference atomicReference2 = new AtomicReference();
        C20293a c20293a = new C20293a(atomicReference, vie0Var, atomicReference2);
        C20294b c20294b = new C20294b(atomicReference, vie0Var, c20293a);
        atomicReference2.lazySet(c20294b);
        z3g0Var.m217046b(c20294b);
        z3g0Var.m217046b(c20293a);
        this.f172254a.unsafeSubscribe(c20293a);
        return c20294b;
    }
}
