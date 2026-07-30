package p149l;

import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class pxs implements wtl {

    /* JADX INFO: renamed from: a */
    public oxs f151725a;

    /* JADX INFO: renamed from: b */
    public sxs f151726b;

    /* JADX INFO: renamed from: a */
    public void m171953a(lqi lqiVar) {
        if (!ypv.f199493a.m199377v0()) {
            lqiVar.m151027h(false);
            return;
        }
        this.f151725a = new oxs();
        sxs sxsVar = new sxs();
        this.f151726b = sxsVar;
        this.f151725a.m166585n(sxsVar);
        this.f151726b.mo21065i1(this.f151725a);
        this.f151725a.m166594x(lqiVar);
        lqiVar.m151027h(true);
        this.f151725a.m166583G1();
    }

    @Override // p149l.wtl
    public void dismiss() {
        if (NullChecker.m81303a(this.f151725a)) {
            this.f151725a.m166584K0(true, true);
            this.f151725a = null;
            this.f151726b = null;
        }
    }

    @Override // p149l.wtl
    /* JADX INFO: renamed from: p */
    public boolean mo115381p(lqi lqiVar) {
        if (lqiVar == null || lqiVar.m151024e() == null || lqiVar.m151024e().mo149813j() == null) {
            return false;
        }
        m171953a(lqiVar);
        return true;
    }

    @Override // p149l.wtl
    /* JADX INFO: renamed from: q */
    public void mo115382q() {
        oxs oxsVar = this.f151725a;
        if (oxsVar != null) {
            oxsVar.m166587q();
            this.f151725a = null;
            this.f151726b = null;
        }
    }
}
