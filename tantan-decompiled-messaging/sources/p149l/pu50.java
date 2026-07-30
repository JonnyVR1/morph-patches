package p149l;

import p133rx.C22306c;
import p133rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class pu50<T> implements C22306c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f151245a;

    /* JADX INFO: renamed from: b */
    public final boolean f151246b;

    /* JADX INFO: renamed from: l.pu50$a */
    public class C19338a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f151247e;

        /* JADX INFO: renamed from: f */
        public boolean f151248f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ SingleDelayedProducer f151249g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ z3g0 f151250h;

        public C19338a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f151249g = singleDelayedProducer;
            this.f151250h = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f151248f) {
                return;
            }
            this.f151248f = true;
            boolean z = this.f151247e;
            SingleDelayedProducer singleDelayedProducer = this.f151249g;
            if (z) {
                singleDelayedProducer.setValue(Boolean.FALSE);
            } else {
                singleDelayedProducer.setValue(Boolean.valueOf(pu50.this.f151246b));
            }
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f151250h.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            this.f151247e = true;
            try {
                if (!pu50.this.f151245a.call(t).booleanValue() || this.f151248f) {
                    return;
                }
                this.f151248f = true;
                this.f151249g.setValue(Boolean.valueOf(true ^ pu50.this.f151246b));
                unsubscribe();
            } catch (Throwable th) {
                f5f.m119493g(th, this, t);
            }
        }
    }

    public pu50(w9j<? super T, Boolean> w9jVar, boolean z) {
        this.f151245a = w9jVar;
        this.f151246b = z;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Boolean> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C19338a c19338a = new C19338a(singleDelayedProducer, z3g0Var);
        z3g0Var.m217046b(c19338a);
        z3g0Var.mo106696f(singleDelayedProducer);
        return c19338a;
    }
}
