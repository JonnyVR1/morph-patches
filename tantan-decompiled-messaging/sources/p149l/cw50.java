package p149l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class cw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f82746a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f82747b;

    /* JADX INFO: renamed from: c */
    public final bud0 f82748c;

    /* JADX INFO: renamed from: l.cw50$a */
    public class C16260a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f82749a;

        public C16260a(AtomicBoolean atomicBoolean) {
            this.f82749a = atomicBoolean;
        }

        @Override // p149l.d30
        public void call() {
            this.f82749a.set(true);
        }
    }

    /* JADX INFO: renamed from: l.cw50$b */
    public class C16261b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f82751e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f82752f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16261b(z3g0 z3g0Var, AtomicBoolean atomicBoolean, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f82751e = atomicBoolean;
            this.f82752f = z3g0Var2;
        }

        @Override // p149l.m250
        public void onCompleted() {
            try {
                this.f82752f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            try {
                this.f82752f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p149l.m250
        public void onNext(T t) {
            if (this.f82751e.get()) {
                this.f82752f.onNext(t);
            }
        }
    }

    public cw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f82746a = j;
        this.f82747b = timeUnit;
        this.f82748c = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f82748c.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        abstractC15976aCreateWorker.mo99202c(new C16260a(atomicBoolean), this.f82746a, this.f82747b);
        return new C16261b(z3g0Var, atomicBoolean, z3g0Var);
    }
}
