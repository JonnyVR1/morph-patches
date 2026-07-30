package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class lw50<T> implements C22306c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f130241a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f130242b;

    /* JADX INFO: renamed from: c */
    public final bud0 f130243c;

    /* JADX INFO: renamed from: l.lw50$a */
    public static final class C18330a<T> extends z3g0<T> implements d30 {

        /* JADX INFO: renamed from: e */
        public final z3g0<? super T> f130244e;

        public C18330a(z3g0<? super T> z3g0Var) {
            super(z3g0Var);
            this.f130244e = z3g0Var;
        }

        @Override // p149l.d30
        public void call() {
            onCompleted();
        }

        @Override // p149l.m250
        public void onCompleted() {
            this.f130244e.onCompleted();
            unsubscribe();
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f130244e.onError(th);
            unsubscribe();
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f130244e.onNext(t);
        }
    }

    public lw50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f130241a = j;
        this.f130242b = timeUnit;
        this.f130243c = bud0Var;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f130243c.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        C18330a c18330a = new C18330a(new vie0(z3g0Var));
        abstractC15976aCreateWorker.mo99202c(c18330a, this.f130241a, this.f130242b);
        return c18330a;
    }
}
