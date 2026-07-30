package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class v460<T> implements C22421c.c<T, T> {

    /* JADX INFO: renamed from: a */
    public final long f182332a;

    /* JADX INFO: renamed from: b */
    public final f2e0 f182333b;

    /* JADX INFO: renamed from: l.v460$a */
    public class C20752a extends gcg0<T> {

        /* JADX INFO: renamed from: e */
        public long f182334e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ gcg0 f182335f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20752a(gcg0 gcg0Var, gcg0 gcg0Var2) {
            super(gcg0Var);
            this.f182335f = gcg0Var2;
        }

        @Override // p153l.gcg0
        /* JADX INFO: renamed from: d */
        public void mo95884d() {
            m129868e(Long.MAX_VALUE);
        }

        @Override // p153l.bb50
        public void onCompleted() {
            this.f182335f.onCompleted();
        }

        @Override // p153l.bb50
        public void onError(Throwable th) {
            this.f182335f.onError(th);
        }

        @Override // p153l.bb50
        public void onNext(T t) {
            long jNow = v460.this.f182333b.now();
            long j = this.f182334e;
            if (j == 0 || jNow - j >= v460.this.f182332a) {
                this.f182334e = jNow;
                this.f182335f.onNext(t);
            }
        }
    }

    public v460(long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f182332a = timeUnit.toMillis(j);
        this.f182333b = f2e0Var;
    }

    @Override // p153l.qcj
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gcg0<? super T> call(gcg0<? super T> gcg0Var) {
        return new C20752a(gcg0Var, gcg0Var);
    }
}
