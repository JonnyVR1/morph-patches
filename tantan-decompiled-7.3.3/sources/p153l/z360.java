package p153l;

import java.util.concurrent.atomic.AtomicReference;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class z360<T, U> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: b */
    public static final Object f202790b = new Object();

    /* JADX INFO: renamed from: a */
    public final C22421c<U> f202791a;

    /* JADX INFO: renamed from: l.z360$a */
    public class C21753a extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f202792e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f202793f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AtomicReference f202794g;

        public C21753a(AtomicReference atomicReference, are0 are0Var, AtomicReference atomicReference2) {
            this.f202792e = atomicReference;
            this.f202793f = are0Var;
            this.f202794g = atomicReference2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            onNext(null);
            this.f202793f.onCompleted();
            ((kcg0) this.f202794g.get()).unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f202793f.onError(th);
            ((kcg0) this.f202794g.get()).unsubscribe();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.bb50
        public void onNext(U u) {
            AtomicReference atomicReference = this.f202792e;
            Object obj = z360.f202790b;
            Object andSet = atomicReference.getAndSet(obj);
            if (andSet != obj) {
                this.f202793f.onNext(andSet);
            }
        }
    }

    /* JADX INFO: renamed from: l.z360$b */
    public class C21754b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicReference f202796e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f202797f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ gcg0 f202798g;

        public C21754b(AtomicReference atomicReference, are0 are0Var, gcg0 gcg0Var) {
            this.f202796e = atomicReference;
            this.f202797f = are0Var;
            this.f202798g = gcg0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f202798g.onNext(null);
            this.f202797f.onCompleted();
            this.f202798g.unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f202797f.onError(th);
            this.f202798g.unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f202796e.set(t);
        }
    }

    public z360(C22421c<U> c22421c) {
        this.f202791a = c22421c;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var);
        AtomicReference atomicReference = new AtomicReference(f202790b);
        AtomicReference atomicReference2 = new AtomicReference();
        C21753a c21753a = new C21753a(atomicReference, are0Var, atomicReference2);
        C21754b c21754b = new C21754b(atomicReference, are0Var, c21753a);
        atomicReference2.lazySet(c21754b);
        gcg0Var.m129866b(c21754b);
        gcg0Var.m129866b(c21753a);
        this.f202791a.unsafeSubscribe(c21753a);
        return c21754b;
    }
}
