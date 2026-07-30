package p003l;

import java.util.concurrent.atomic.AtomicInteger;
import l.ig3;
import p014rx.C1099c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class qf50<T> implements C1099c.a<T> {

    /* JADX INFO: renamed from: a */
    public final vv5<? extends T> f6631a;

    /* JADX INFO: renamed from: b */
    public final int f6632b;

    /* JADX INFO: renamed from: c */
    public final e30<? super c4g0> f6633c;

    /* JADX INFO: renamed from: d */
    public final AtomicInteger f6634d;

    public qf50(vv5<? extends T> vv5Var, int i, e30<? super c4g0> e30Var) {
        if (i <= 0) {
            ig3.a("numberOfSubscribers > 0 required");
            throw null;
        }
        this.f6631a = vv5Var;
        this.f6632b = i;
        this.f6633c = e30Var;
        this.f6634d = new AtomicInteger();
    }

    @Override // p003l.e30
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(z3g0<? super T> z3g0Var) {
        this.f6631a.unsafeSubscribe(a4g0.m2743c(z3g0Var));
        if (this.f6634d.incrementAndGet() == this.f6632b) {
            this.f6631a.mo8404c(this.f6633c);
        }
    }
}
