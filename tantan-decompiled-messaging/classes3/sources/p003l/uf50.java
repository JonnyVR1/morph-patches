package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class uf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C1099c<? extends T> f7973a;

    /* JADX INFO: renamed from: b */
    public final long f7974b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f7975c;

    /* JADX INFO: renamed from: d */
    public final bud0 f7976d;

    /* JADX INFO: renamed from: l.uf50$a */
    public class C0575a implements d30 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z3g0 f7977a;

        public C0575a(z3g0 z3g0Var) {
            this.f7977a = z3g0Var;
        }

        @Override // p003l.d30
        public void call() {
            if (this.f7977a.isUnsubscribed()) {
                return;
            }
            uf50.this.f7973a.unsafeSubscribe(a4g0.m2743c(this.f7977a));
        }
    }

    public uf50(C1099c<? extends T> c1099c, long j, TimeUnit timeUnit, bud0 bud0Var) {
        this.f7973a = c1099c;
        this.f7974b = j;
        this.f7975c = timeUnit;
        this.f7976d = bud0Var;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f7976d.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        abstractC0185aCreateWorker.mo2915c(new C0575a(z3g0Var), this.f7974b, this.f7975c);
    }
}
