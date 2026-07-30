package p149l;

import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class dw50<T, U> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22306c<U> f88141a;

    /* JADX INFO: renamed from: l.dw50$a */
    public class C16481a extends z3g0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f88142e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f88143f;

        public C16481a(AtomicBoolean atomicBoolean, vie0 vie0Var) {
            this.f88142e = atomicBoolean;
            this.f88143f = vie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f88143f.onError(th);
            this.f88143f.unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(U u) {
            this.f88142e.set(true);
            unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.dw50$b */
    public class C16482b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f88145e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ vie0 f88146f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16482b(z3g0 z3g0Var, AtomicBoolean atomicBoolean, vie0 vie0Var) {
            super(z3g0Var);
            this.f88145e = atomicBoolean;
            this.f88146f = vie0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f88146f.onCompleted();
            unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f88146f.onError(th);
            unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f88145e.get()) {
                this.f88146f.onNext(t);
            } else {
                m217048e(1L);
            }
        }
    }

    public dw50(C22306c<U> c22306c) {
        this.f88141a = c22306c;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        vie0 vie0Var = new vie0(z3g0Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C16481a c16481a = new C16481a(atomicBoolean, vie0Var);
        z3g0Var.m217046b(c16481a);
        this.f88141a.unsafeSubscribe(c16481a);
        return new C16482b(z3g0Var, atomicBoolean, vie0Var);
    }
}
