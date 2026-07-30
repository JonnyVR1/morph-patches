package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class r460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f161149a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f161150b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f161151c;

    /* JADX INFO: renamed from: l.r460$a */
    public static final class C19758a<T> extends gcg0<T> implements x20 {

        /* JADX INFO: renamed from: e */
        public final gcg0<? super T> f161152e;

        public C19758a(gcg0<? super T> gcg0Var) {
            super(gcg0Var);
            this.f161152e = gcg0Var;
        }

        @Override // p153l.x20
        public void call() {
            onCompleted();
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f161152e.onCompleted();
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f161152e.onError(th);
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            this.f161152e.onNext(t);
        }
    }

    public r460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f161149a = j;
        this.f161150b = timeUnit;
        this.f161151c = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f161151c.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        C19758a c19758a = new C19758a(new are0(gcg0Var));
        abstractC16877aCreateWorker.mo102837c(c19758a, this.f161149a, this.f161150b);
        return c19758a;
    }
}
