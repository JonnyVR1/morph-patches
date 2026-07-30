package p002l;

import l.rqi;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e9t implements wtl {

    /* JADX INFO: renamed from: a */
    public d9t f9642a;

    /* JADX INFO: renamed from: a */
    public static boolean m12297a() {
        return ypv.a.P(ypv.e) && ypv.k().Q6();
    }

    @Override // p002l.wtl
    public void dismiss() {
        d9t d9tVar = this.f9642a;
        if (d9tVar != null) {
            d9tVar.m11685r();
        }
    }

    @Override // p002l.wtl
    /* JADX INFO: renamed from: p */
    public boolean mo12298p(lqi lqiVar) {
        if (!m12297a() || !ypv.a.v0() || !rqi.d().b(ypv.e)) {
            return false;
        }
        this.f9642a = new d9t();
        g9t g9tVar = new g9t();
        this.f9642a.m11681n(g9tVar);
        g9tVar.m13668i1(this.f9642a);
        return this.f9642a.m11683p(lqiVar);
    }

    @Override // p002l.wtl
    /* JADX INFO: renamed from: q */
    public void mo12299q() {
        d9t d9tVar = this.f9642a;
        if (d9tVar != null) {
            d9tVar.m11684q();
        }
    }
}
