package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class qo50 implements C22421c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f158702a;

    /* JADX INFO: renamed from: b */
    public final TimeUnit f158703b;

    /* JADX INFO: renamed from: c */
    public final f2e0 f158704c;

    /* JADX INFO: renamed from: l.qo50$a */
    public class C19613a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f158705a;

        public C19613a(gcg0 gcg0Var) {
            this.f158705a = gcg0Var;
        }

        @Override // p153l.x20
        public void call() {
            try {
                this.f158705a.onNext(0L);
                this.f158705a.onCompleted();
            } catch (Throwable th) {
                j6f.m143664f(th, this.f158705a);
            }
        }
    }

    public qo50(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f158702a = j;
        this.f158703b = timeUnit;
        this.f158704c = f2e0Var;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super Long> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f158704c.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        abstractC16877aCreateWorker.mo102837c(new C19613a(gcg0Var), this.f158702a, this.f158703b);
    }
}
