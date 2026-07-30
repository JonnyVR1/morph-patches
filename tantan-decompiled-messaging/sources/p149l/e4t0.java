package p149l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class e4t0 {

    /* JADX INFO: renamed from: a */
    public final n3t0 f89319a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f89320b;

    public e4t0() {
        n3t0 n3t0Var = new n3t0();
        this.f89319a = n3t0Var;
        this.f89320b = new AtomicInteger(0);
        jmw0.m142245r(n3t0Var, new s3t0(this), i3t0.f111377f);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final int m114705a() {
        return this.f89320b.get();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void m114706c() {
        this.f89319a.m157775c(new Exception());
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m114707d(Object obj) {
        this.f89319a.m157774b(obj);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m114708e(r3t0 r3t0Var, p3t0 p3t0Var) {
        jmw0.m142245r(this.f89319a, new d4t0(this, r3t0Var, p3t0Var), i3t0.f111377f);
    }
}
