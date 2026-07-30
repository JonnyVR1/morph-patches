package p003l;

import p014rx.C1099c;
import p014rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class pu50<T> implements C1099c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f6513a;

    /* JADX INFO: renamed from: b */
    public final boolean f6514b;

    /* JADX INFO: renamed from: l.pu50$a */
    public class C0478a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f6515e;

        /* JADX INFO: renamed from: f */
        public boolean f6516f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f6517g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f6518h;

        public C0478a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f6517g = singleDelayedProducer;
            this.f6518h = z3g0Var;
        }

        @Override // p003l.m250
        public void onCompleted() {
            if (this.f6516f) {
                return;
            }
            this.f6516f = true;
            boolean z = this.f6515e;
            SingleDelayedProducer singleDelayedProducer = this.f6517g;
            if (z) {
                singleDelayedProducer.setValue(Boolean.FALSE);
            } else {
                singleDelayedProducer.setValue(Boolean.valueOf(pu50.this.f6514b));
            }
        }

        @Override // p003l.m250
        public void onError(Throwable th) {
            this.f6518h.onError(th);
        }

        @Override // p003l.m250
        public void onNext(T t) {
            this.f6515e = true;
            try {
                if (!pu50.this.f6513a.call(t).booleanValue() || this.f6516f) {
                    return;
                }
                this.f6516f = true;
                this.f6517g.setValue(Boolean.valueOf(true ^ pu50.this.f6514b));
                unsubscribe();
            } catch (Throwable th) {
                f5f.m3966g(th, this, t);
            }
        }
    }

    public pu50(w9j<? super T, Boolean> w9jVar, boolean z) {
        this.f6513a = w9jVar;
        this.f6514b = z;
    }

    @Override // p003l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Boolean> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C0478a c0478a = new C0478a(singleDelayedProducer, z3g0Var);
        z3g0Var.m9240b(c0478a);
        z3g0Var.mo3257f(singleDelayedProducer);
        return c0478a;
    }
}
