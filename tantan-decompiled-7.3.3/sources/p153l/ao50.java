package p153l;

import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class ao50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final C22421c<? extends T> f72419a;

    /* JADX INFO: renamed from: b */
    public final long f72420b;

    /* JADX INFO: renamed from: c */
    public final TimeUnit f72421c;

    /* JADX INFO: renamed from: d */
    public final f2e0 f72422d;

    /* JADX INFO: renamed from: l.ao50$a */
    public class C15752a implements x20 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ gcg0 f72423a;

        public C15752a(gcg0 gcg0Var) {
            this.f72423a = gcg0Var;
        }

        @Override // p153l.x20
        public void call() {
            if (this.f72423a.isUnsubscribed()) {
                return;
            }
            ao50.this.f72419a.unsafeSubscribe(icg0.m139436c(this.f72423a));
        }
    }

    public ao50(C22421c<? extends T> c22421c, long j, TimeUnit timeUnit, f2e0 f2e0Var) {
        this.f72419a = c22421c;
        this.f72420b = j;
        this.f72421c = timeUnit;
        this.f72422d = f2e0Var;
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        f2e0.AbstractC16877a abstractC16877aCreateWorker = this.f72422d.createWorker();
        gcg0Var.m129866b(abstractC16877aCreateWorker);
        abstractC16877aCreateWorker.mo102837c(new C15752a(gcg0Var), this.f72420b, this.f72421c);
    }
}
