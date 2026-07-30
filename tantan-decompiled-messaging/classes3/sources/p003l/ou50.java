package p003l;

import p014rx.C1099c;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ou50<T> implements C1099c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f6227a;

    /* JADX INFO: renamed from: l.ou50$a */
    public class C0457a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f6228e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SingleDelayedProducer f6229f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f6230g;

        public C0457a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f6229f = singleDelayedProducer;
            this.f6230g = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f6228e) {
                return;
            }
            this.f6228e = true;
            this.f6229f.setValue(Boolean.TRUE);
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f6230g.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            try {
                if (ou50.this.f6227a.call(t).booleanValue() || this.f6228e) {
                    return;
                }
                this.f6228e = true;
                this.f6229f.setValue(Boolean.FALSE);
                unsubscribe();
            } catch (Throwable th) {
                f5f.m3966g(th, this, t);
            }
        }
    }

    public ou50(w9j<? super T, Boolean> w9jVar) {
        this.f6227a = w9jVar;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Boolean> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C0457a c0457a = new C0457a(singleDelayedProducer, z3g0Var);
        z3g0Var.m9240b(c0457a);
        z3g0Var.mo3257f(singleDelayedProducer);
        return c0457a;
    }
}
