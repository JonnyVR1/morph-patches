package p153l;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class i460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f112837a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f112838b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f112839c;

    /* JADX INFO: renamed from: l.i460$a */
    public class C17635a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f112840a;

        public C17635a(AtomicBoolean atomicBoolean) {
            this.f112840a = atomicBoolean;
        }

        @Override // p153l.x20
        public void call() {
            this.f112840a.set(true);
        }
    }

    /* JADX INFO: renamed from: l.i460$b */
    public class C17636b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f112842e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f112843f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17636b(gcg0 gcg0Var, AtomicBoolean atomicBoolean, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f112842e = atomicBoolean;
            this.f112843f = gcg0Var2;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            try {
                this.f112843f.onCompleted();
            } finally {
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            try {
                this.f112843f.onError(th);
            } finally {
                unsubscribe();
            }
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f112842e.get()) {
                this.f112843f.onNext(t);
            }
        }
    }

    public i460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f112837a = j;
        this.f112838b = timeUnit;
        this.f112839c = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f112839c.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        abstractC16877aCreateWorker.mo102837c(new C17635a(atomicBoolean), this.f112837a, this.f112838b);
        return new C17636b(gcg0Var, atomicBoolean, gcg0Var);
    }
}
