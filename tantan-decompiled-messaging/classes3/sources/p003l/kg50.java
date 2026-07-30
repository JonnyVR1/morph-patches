package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class kg50 implements C1099c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f4920a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f4921b;

    /* JADX INFO: renamed from: c */
    public final bud0 f4922c;

    /* JADX INFO: renamed from: l.kg50$a */
    public class C0378a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f4923a;

        public C0378a(z3g0 z3g0Var) {
            this.f4923a = z3g0Var;
        }

        @Override // p003l.d30
        public void call() {
            try {
                this.f4923a.onNext(0L);
                this.f4923a.onCompleted();
            } catch (Throwable th) {
                f5f.m3965f(th, this.f4923a);
            }
        }
    }

    public kg50(long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f4920a = j;
        this.f4921b = timeUnit;
        this.f4922c = bud0Var;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super Long> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f4922c.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        abstractC0185aCreateWorker.mo2915c(new C0378a(z3g0Var), this.f4920a, this.f4921b);
    }
}
