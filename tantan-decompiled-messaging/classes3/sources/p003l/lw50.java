package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class lw50<T> implements C1099c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f5438a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f5439b;

    /* JADX INFO: renamed from: c */
    public final bud0 f5440c;

    /* JADX INFO: renamed from: l.lw50$a */
    public static final class C0411a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f5441e;

        public C0411a(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
            this.f5441e = z3g0Var;
        }

        @Override // p003l.d30
        public void call() {
            onCompleted();
        }

        @Override // p003l.m250
        public void onCompleted() {
            this.f5441e.onCompleted();
            unsubscribe();
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f5441e.onError(th);
            unsubscribe();
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f5441e.onNext(t);
        }
    }

    public lw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f5438a = j;
        this.f5439b = timeUnit;
        this.f5440c = bud0Var;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f5440c.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        C0411a c0411a = new C0411a(new vie0(z3g0Var));
        abstractC0185aCreateWorker.mo2915c(c0411a, this.f5438a, this.f5439b);
        return c0411a;
    }
}
