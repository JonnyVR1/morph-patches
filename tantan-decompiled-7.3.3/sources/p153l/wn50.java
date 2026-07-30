package p153l;

import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes3.dex */
public final class wn50<T> implements C22421c.a<T> {

    /* JADX INFO: renamed from: a */
    public final ax5<? extends T> f189853a;

    /* JADX INFO: renamed from: b */
    public final int f189854b;

    /* JADX INFO: renamed from: c */
    public final y20<? super kcg0> f189855c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f189856d;

    public wn50(ax5<? extends T> ax5Var, int i, y20<? super kcg0> y20Var) {
        if (i <= 0) {
            wg3.m206174a("numberOfSubscribers > 0 required");
            throw null;
        }
        this.f189853a = ax5Var;
        this.f189854b = i;
        this.f189855c = y20Var;
        this.f189856d = new AtomicInteger();
    }

    @Override // p153l.y20
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(gcg0<? super T> gcg0Var) {
        this.f189853a.unsafeSubscribe(icg0.m139436c(gcg0Var));
        if (this.f189856d.incrementAndGet() == this.f189854b) {
            this.f189853a.mo100759c(this.f189855c);
        }
    }
}
