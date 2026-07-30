package p153l;

import com.google.common.cache.LongAddables;

/* JADX INFO: renamed from: l.x6 */
/* JADX INFO: loaded from: classes7.dex */
public final class C21256x6 implements InterfaceC21523y6 {

    /* JADX INFO: renamed from: a */
    public final g1w f192545a = LongAddables.m15611a();

    /* JADX INFO: renamed from: b */
    public final g1w f192546b = LongAddables.m15611a();

    /* JADX INFO: renamed from: c */
    public final g1w f192547c = LongAddables.m15611a();

    /* JADX INFO: renamed from: d */
    public final g1w f192548d = LongAddables.m15611a();

    /* JADX INFO: renamed from: e */
    public final g1w f192549e = LongAddables.m15611a();

    /* JADX INFO: renamed from: f */
    public final g1w f192550f = LongAddables.m15611a();

    /* JADX INFO: renamed from: h */
    public static long m209436h(long j) {
        if (j >= 0) {
            return j;
        }
        return Long.MAX_VALUE;
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: a */
    public void mo15533a(int i) {
        this.f192545a.add(i);
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: b */
    public void mo15534b() {
        this.f192550f.increment();
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: c */
    public void mo15535c(long j) {
        this.f192547c.increment();
        this.f192549e.add(j);
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: d */
    public void mo15536d(int i) {
        this.f192546b.add(i);
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: e */
    public void mo15537e(long j) {
        this.f192548d.increment();
        this.f192549e.add(j);
    }

    @Override // p153l.InterfaceC21523y6
    /* JADX INFO: renamed from: f */
    public hy3 mo15538f() {
        return new hy3(m209436h(this.f192545a.sum()), m209436h(this.f192546b.sum()), m209436h(this.f192547c.sum()), m209436h(this.f192548d.sum()), m209436h(this.f192549e.sum()), m209436h(this.f192550f.sum()));
    }

    /* JADX INFO: renamed from: g */
    public void m209437g(InterfaceC21523y6 interfaceC21523y6) {
        hy3 hy3VarMo15538f = interfaceC21523y6.mo15538f();
        this.f192545a.add(hy3VarMo15538f.m137707b());
        this.f192546b.add(hy3VarMo15538f.m137710e());
        this.f192547c.add(hy3VarMo15538f.m137709d());
        this.f192548d.add(hy3VarMo15538f.m137708c());
        this.f192549e.add(hy3VarMo15538f.m137711f());
        this.f192550f.add(hy3VarMo15538f.m137706a());
    }
}
