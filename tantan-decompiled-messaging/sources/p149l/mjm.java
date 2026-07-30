package p149l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class mjm extends bud0 {
    public static final mjm INSTANCE = new mjm();

    /* JADX INFO: renamed from: l.mjm$b */
    public class C18482b extends bud0.AbstractC15976a implements c4g0 {

        /* JADX INFO: renamed from: a */
        public final u53 f134214a;

        public C18482b() {
            this.f134214a = new u53();
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: b */
        public c4g0 mo99201b(d30 d30Var) {
            d30Var.call();
            return h4g0.m129243d();
        }

        @Override // p149l.bud0.AbstractC15976a
        /* JADX INFO: renamed from: c */
        public c4g0 mo99202c(d30 d30Var, long j, TimeUnit timeUnit) {
            return mo99201b(new mjf0(d30Var, this, mjm.this.now() + timeUnit.toMillis(j)));
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.f134214a.isUnsubscribed();
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.f134214a.unsubscribe();
        }
    }

    @Override // p149l.bud0
    public bud0.AbstractC15976a createWorker() {
        return new C18482b();
    }
}
