package p149l;

import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class lg50 implements C22306c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f127949a;

    /* JADX INFO: renamed from: b */
    public final long f127950b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f127951c;

    /* JADX INFO: renamed from: d */
    public final bud0 f127952d;

    /* JADX INFO: renamed from: l.lg50$a */
    public class C18218a implements d30 {

        /* JADX INFO: renamed from: a */
        public long f127953a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ z3g0 f127954b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ bud0.AbstractC15976a f127955c;

        public C18218a(z3g0 z3g0Var, bud0.AbstractC15976a abstractC15976a) {
            this.f127954b = z3g0Var;
            this.f127955c = abstractC15976a;
        }

        @Override // p149l.d30
        public void call() {
            try {
                z3g0 z3g0Var = this.f127954b;
                long j = this.f127953a;
                this.f127953a = 1 + j;
                z3g0Var.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    this.f127955c.unsubscribe();
                } finally {
                    f5f.m119492f(th, this.f127954b);
                }
            }
        }
    }

    public lg50(long j, long j2, TimeUnit timeUnit, bud0 bud0Var) {
        this.f127949a = j;
        this.f127950b = j2;
        this.f127951c = timeUnit;
        this.f127952d = bud0Var;
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super Long> z3g0Var) {
        bud0.AbstractC15976a abstractC15976aCreateWorker = this.f127952d.createWorker();
        z3g0Var.m217046b(abstractC15976aCreateWorker);
        abstractC15976aCreateWorker.m103920d(new C18218a(z3g0Var, abstractC15976aCreateWorker), this.f127949a, this.f127950b, this.f127951c);
    }
}
