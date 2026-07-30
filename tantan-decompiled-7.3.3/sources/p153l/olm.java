package p153l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class olm extends f2e0 {
    public static final olm INSTANCE = new olm();

    /* JADX INFO: renamed from: l.olm$b */
    public class C19162b extends f2e0.AbstractC16877a implements kcg0 {

        /* JADX INFO: renamed from: a */
        public final k63 f147851a;

        public C19162b() {
            this.f147851a = new k63();
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: b */
        public kcg0 mo102836b(x20 x20Var) {
            x20Var.call();
            return pcg0.m171651d();
        }

        @Override // p153l.f2e0.AbstractC16877a
        /* JADX INFO: renamed from: c */
        public kcg0 mo102837c(x20 x20Var, long j, TimeUnit timeUnit) {
            return mo102836b(new vrf0(x20Var, this, olm.this.now() + timeUnit.toMillis(j)));
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.f147851a.isUnsubscribed();
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.f147851a.unsubscribe();
        }
    }

    @Override // p153l.f2e0
    public f2e0.AbstractC16877a createWorker() {
        return new C19162b();
    }
}
