package p153l;

import java.util.concurrent.atomic.AtomicBoolean;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class j460<T, U> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<U> f118263a;

    /* JADX INFO: renamed from: l.j460$a */
    public class C17871a extends gcg0<U> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f118264e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f118265f;

        public C17871a(AtomicBoolean atomicBoolean, are0 are0Var) {
            this.f118264e = atomicBoolean;
            this.f118265f = are0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f118265f.onError(th);
            this.f118265f.unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(U u) {
            this.f118264e.set(true);
            unsubscribe();
        }
    }

    /* JADX INFO: renamed from: l.j460$b */
    public class C17872b extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AtomicBoolean f118267e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ are0 f118268f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C17872b(gcg0 gcg0Var, AtomicBoolean atomicBoolean, are0 are0Var) {
            super(gcg0Var);
            this.f118267e = atomicBoolean;
            this.f118268f = are0Var;
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f118268f.onCompleted();
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f118268f.onError(th);
            unsubscribe();
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            if (this.f118267e.get()) {
                this.f118268f.onNext(t);
            } else {
                m129868e(1L);
            }
        }
    }

    public j460(C22421c<U> c22421c) {
        this.f118263a = c22421c;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        are0 are0Var = new are0(gcg0Var);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        C17871a c17871a = new C17871a(atomicBoolean, are0Var);
        gcg0Var.m129866b(c17871a);
        this.f118263a.unsafeSubscribe(c17871a);
        return new C17872b(gcg0Var, atomicBoolean, are0Var);
    }
}
