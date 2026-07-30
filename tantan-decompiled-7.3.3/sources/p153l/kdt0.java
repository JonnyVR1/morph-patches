package p153l;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class kdt0 {

    /* JADX INFO: renamed from: a */
    public final tct0 f125276a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f125277b;

    public kdt0() {
        tct0 tct0Var = new tct0();
        this.f125276a = tct0Var;
        this.f125277b = new AtomicInteger(0);
        pvw0.m173991r(tct0Var, new yct0(this), oct0.f146738f);
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public final int m149266a() {
        return this.f125277b.get();
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void m149267c() {
        this.f125276a.m190495c(new Exception());
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final void m149268d(Object obj) {
        this.f125276a.m190494b(obj);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final void m149269e(xct0 xct0Var, vct0 vct0Var) {
        pvw0.m173991r(this.f125276a, new jdt0(this, xct0Var, vct0Var), oct0.f146738f);
    }
}
