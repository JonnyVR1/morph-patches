package p149l;

import p133rx.C22306c;
import p133rx.internal.producers.SingleDelayedProducer;

/* JADX INFO: loaded from: classes3.dex */
public final class ou50<T> implements C22306c.c<Boolean, T> {

    /* JADX INFO: renamed from: a */
    public final w9j<? super T, Boolean> f145665a;

    /* JADX INFO: renamed from: l.ou50$a */
    public class C19045a extends z3g0<T> {

        /* JADX INFO: renamed from: e */
        public boolean f145666e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SingleDelayedProducer f145667f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ z3g0 f145668g;

        public C19045a(SingleDelayedProducer singleDelayedProducer, z3g0 z3g0Var) {
            this.f145667f = singleDelayedProducer;
            this.f145668g = z3g0Var;
        }

        @Override // p149l.m250
        public void onCompleted() {
            if (this.f145666e) {
                return;
            }
            this.f145666e = true;
            this.f145667f.setValue(Boolean.TRUE);
        }

        @Override // p149l.m250
        public void onError(Throwable th) {
            this.f145668g.onError(th);
        }

        @Override // p149l.m250
        public void onNext(T t) {
            try {
                if (ou50.this.f145665a.call(t).booleanValue() || this.f145666e) {
                    return;
                }
                this.f145666e = true;
                this.f145667f.setValue(Boolean.FALSE);
                unsubscribe();
            } catch (Throwable th) {
                f5f.m119493g(th, this, t);
            }
        }
    }

    public ou50(w9j<? super T, Boolean> w9jVar) {
        this.f145665a = w9jVar;
    }

    @Override // p149l.w9j
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z3g0<? super T> call(z3g0<? super Boolean> z3g0Var) {
        SingleDelayedProducer singleDelayedProducer = new SingleDelayedProducer(z3g0Var);
        C19045a c19045a = new C19045a(singleDelayedProducer, z3g0Var);
        z3g0Var.m217046b(c19045a);
        z3g0Var.mo106696f(singleDelayedProducer);
        return c19045a;
    }
}
