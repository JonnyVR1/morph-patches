package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class ro50 implements C22421c.a<Long> {

    /* JADX INFO: renamed from: a */
    public final long f164153a;

    /* JADX INFO: renamed from: b */
    public final long f164154b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f164155c;

    /* JADX INFO: renamed from: d */
    public final f2e0 f164156d;

    /* JADX INFO: renamed from: l.ro50$a */
    public class C19889a implements x20 {

        /* JADX INFO: renamed from: a */
        public long f164157a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ gcg0 f164158b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ f2e0.AbstractC16877a f164159c;

        public C19889a(gcg0 gcg0Var, f2e0.AbstractC16877a abstractC16877a) {
            this.f164158b = gcg0Var;
            this.f164159c = abstractC16877a;
        }

        @Override // p153l.x20
        public void call() {
            try {
                gcg0 gcg0Var = this.f164158b;
                long j = this.f164157a;
                this.f164157a = 1 + j;
                gcg0Var.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    this.f164159c.unsubscribe();
                } finally {
                    j6f.m143664f(th, this.f164158b);
                }
            }
        }
    }

    public ro50(long j, long j2, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f164153a = j;
        this.f164154b = j2;
        this.f164155c = timeUnit;
        this.f164156d = f2e0Var;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super Long> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f164156d.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        abstractC16877aCreateWorker.m123611d(new C19889a(gcg0Var, abstractC16877aCreateWorker), this.f164153a, this.f164154b, this.f164155c);
    }
}
