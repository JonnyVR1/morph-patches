package p003l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class mjm extends bud0 {
    public static final mjm INSTANCE = new mjm();

    /* JADX INFO: renamed from: l.mjm$b */
    public class C0429b extends bud0.AbstractC0185a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final u53 f5676a;

        public C0429b() {
            this.f5676a = new u53();
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: b */
        public c4g0 mo2914b(d30 d30Var) {
            d30Var.call();
            return h4g0.m4917d();
        }

        @Override // p003l.bud0.AbstractC0185a
        /* JADX INFO: renamed from: c */
        public c4g0 mo2915c(d30 d30Var, long j, TimeUnit timeUnit) {
            return mo2914b(new mjf0(d30Var, this, mjm.this.now() + timeUnit.toMillis(j)));
        }

        @Override // p003l.c4g0
        public boolean isUnsubscribed() {
            return this.f5676a.isUnsubscribed();
        }

        @Override // p003l.c4g0
        public void unsubscribe() {
            this.f5676a.unsubscribe();
        }
    }

    @Override // p003l.bud0
    public bud0.AbstractC0185a createWorker() {
        return new C0429b();
    }
}
