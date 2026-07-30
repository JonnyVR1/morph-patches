package p003l;

import java.util.concurrent.TimeUnit;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class lg50 implements C1099c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f5296a;

    /* JADX INFO: renamed from: b */
    public final long f5297b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f5298c;

    /* JADX INFO: renamed from: d */
    public final bud0 f5299d;

    /* JADX INFO: renamed from: l.lg50$a */
    public class C0405a implements d30 {

        /* JADX INFO: renamed from: a */
        public long f5300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0 f5301b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bud0.AbstractC0185a f5302c;

        public C0405a(z3g0 z3g0Var, bud0.AbstractC0185a abstractC0185a) {
            this.f5301b = z3g0Var;
            this.f5302c = abstractC0185a;
        }

        @Override // p003l.d30
        public void call() {
            try {
                z3g0 z3g0Var = this.f5301b;
                long j = this.f5300a;
                this.f5300a = 1 + j;
                z3g0Var.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    this.f5302c.unsubscribe();
                } finally {
                    f5f.m3965f(th, this.f5301b);
                }
            }
        }
    }

    public lg50(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        this.f5296a = j;
        this.f5297b = j2;
        this.f5298c = timeUnit;
        this.f5299d = bud0Var;
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super Long> z3g0Var) {
        bud0.AbstractC0185a abstractC0185aCreateWorker = this.f5299d.createWorker();
        z3g0Var.m9240b(abstractC0185aCreateWorker);
        abstractC0185aCreateWorker.m3172d(new C0405a(z3g0Var, abstractC0185aCreateWorker), this.f5296a, this.f5297b, this.f5298c);
    }
}
