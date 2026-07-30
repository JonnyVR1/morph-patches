package p149l;

import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes3.dex */
public final class qf50<T> implements C22306c.a<T> {

    /* JADX INFO: renamed from: a */
    public final vv5<? extends T> f154085a;

    /* JADX INFO: renamed from: b */
    public final int f154086b;

    /* JADX INFO: renamed from: c */
    public final e30<? super c4g0> f154087c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f154088d;

    public qf50(vv5<? extends T> vv5Var, int i, e30<? super c4g0> e30Var) {
        if (i <= 0) {
            ig3.m135964a("numberOfSubscribers > 0 required");
            throw null;
        }
        this.f154085a = vv5Var;
        this.f154086b = i;
        this.f154087c = e30Var;
        this.f154088d = new AtomicInteger();
    }

    @Override // p149l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        this.f154085a.unsafeSubscribe(a4g0.m94919c(z3g0Var));
        if (this.f154088d.incrementAndGet() == this.f154086b) {
            this.f154085a.mo200174c(this.f154087c);
        }
    }
}
