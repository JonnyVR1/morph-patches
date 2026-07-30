package p002l;

import com.tantanapp.common.utils.NullChecker;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pxs implements wtl {

    /* JADX INFO: renamed from: a */
    public oxs f17717a;

    /* JADX INFO: renamed from: b */
    public sxs f17718b;

    /* JADX INFO: renamed from: a */
    public void m20752a(lqi lqiVar) {
        if (!ypv.a.v0()) {
            lqiVar.m17383h(false);
            return;
        }
        this.f17717a = new oxs();
        sxs sxsVar = new sxs();
        this.f17718b = sxsVar;
        this.f17717a.m19883n(sxsVar);
        this.f17718b.m22751i1(this.f17717a);
        this.f17717a.m19892x(lqiVar);
        lqiVar.m17383h(true);
        this.f17717a.m19881G1();
    }

    @Override // p002l.wtl
    public void dismiss() {
        if (NullChecker.a(this.f17717a)) {
            this.f17717a.m19882K0(true, true);
            this.f17717a = null;
            this.f17718b = null;
        }
    }

    @Override // p002l.wtl
    /* JADX INFO: renamed from: p */
    public boolean mo12298p(lqi lqiVar) {
        if (lqiVar == null || lqiVar.m17380e() == null || lqiVar.m17380e().m17234j() == null) {
            return false;
        }
        m20752a(lqiVar);
        return true;
    }

    @Override // p002l.wtl
    /* JADX INFO: renamed from: q */
    public void mo12299q() {
        oxs oxsVar = this.f17717a;
        if (oxsVar != null) {
            oxsVar.m19885q();
            this.f17717a = null;
            this.f17718b = null;
        }
    }
}
