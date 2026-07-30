package p149l;

/* JADX INFO: loaded from: classes4.dex */
public class e9t implements wtl {

    /* JADX INFO: renamed from: a */
    public d9t f90129a;

    /* JADX INFO: renamed from: a */
    public static boolean m115380a() {
        return ypv.f199493a.m199323P(ypv.f199497e) && ypv.m215672k().m195714Q6();
    }

    @Override // p149l.wtl
    public void dismiss() {
        d9t d9tVar = this.f90129a;
        if (d9tVar != null) {
            d9tVar.m110484r();
        }
    }

    @Override // p149l.wtl
    /* JADX INFO: renamed from: p */
    public boolean mo115381p(lqi lqiVar) {
        if (!m115380a() || !ypv.f199493a.m199377v0() || !rqi.m180453d().m180455b(ypv.f199497e)) {
            return false;
        }
        this.f90129a = new d9t();
        g9t g9tVar = new g9t();
        this.f90129a.m110480n(g9tVar);
        g9tVar.mo21065i1(this.f90129a);
        return this.f90129a.m110482p(lqiVar);
    }

    @Override // p149l.wtl
    /* JADX INFO: renamed from: q */
    public void mo115382q() {
        d9t d9tVar = this.f90129a;
        if (d9tVar != null) {
            d9tVar.m110483q();
        }
    }
}
