package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class o7s {

    /* JADX INFO: renamed from: a */
    public final rh2 f142536a;

    /* JADX INFO: renamed from: b */
    public final hs4 f142537b;

    /* JADX INFO: renamed from: c */
    public boolean f142538c = true;

    public o7s(rh2 rh2Var, hs4 hs4Var) {
        this.f142536a = rh2Var;
        this.f142537b = hs4Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: b */
    public void m163043b(final d30 d30Var) {
        rh2 rh2Var = this.f142536a;
        rh2Var.duringCreated(zfv.m218568h1(false, rh2Var.m206027E2().m132140j0())).subscribe(ffw.m121197h(new e30() { // from class: l.n7s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137550a.m163046e(d30Var, obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c */
    public void m163044c(String str) {
        this.f142536a.m179320r4(str);
    }

    /* JADX INFO: renamed from: d */
    public boolean m163045d() {
        return this.f142538c;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m163046e(d30 d30Var, Object obj) {
        this.f142538c = false;
        d30Var.call();
        this.f142537b.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: f */
    public void m163047f(boolean z) {
        if (this.f142538c != z) {
            this.f142538c = z;
            this.f142537b.notifyDataSetChanged();
        }
    }
}
