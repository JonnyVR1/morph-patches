package p003l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class cw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f2835a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f2836b;

    /* JADX INFO: renamed from: c */
    public final bud0 f2837c;

    /* JADX INFO: renamed from: l.cw50$a */
    public class C0213a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f2838a;

        public C0213a(AtomicBoolean atomicBoolean) {
            this.f2838a = atomicBoolean;
        }

        @Override // p003l.d30
        public void call() {
            this.f2838a.set(true);
        }
    }

    /* JADX INFO: renamed from: l.cw50$b */
    public class C0214b extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f2840e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ z3g0 f2841f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0214b(z3g0 z3g0Var, AtomicBoolean atomicBoolean, z3g0 z3g0Var2) {
            super(z3g0Var);
            this.f2840e = atomicBoolean;
            this.f2841f = z3g0Var2;
        }

        @Override // p003l.m250
        public void onCompleted() {
            try {
                this.f2841f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            try {
                this.f2841f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p003l.m250
        public void onNext(T t) {
            if (this.f2840e.get()) {
                this.f2841f.onNext(t);
            }
        }
    }

    public cw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f2835a = j;
        this.f2836b = timeUnit;
        this.f2837c = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f2837c.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        abstractC0185aCreateWorker.mo2915c(new C0213a(atomicBoolean), this.f2835a, this.f2836b);
        return new C0214b(z3g0Var, atomicBoolean, z3g0Var);
    }
}
