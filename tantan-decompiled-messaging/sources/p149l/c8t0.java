package p149l;

import com.p046p1.mobile.putong.core.data.GuideBoostMode;

/* JADX INFO: loaded from: classes6.dex */
public final class c8t0 extends o7t0 {
    public c8t0(v5t0 v5t0Var) {
        super(v5t0Var);
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: u */
    public final boolean mo105822u(String str) {
        String strM134085g = i2t0.m134085g(str);
        v5t0 v5t0Var = (v5t0) this.f142543c.get();
        if (v5t0Var != null && strM134085g != null) {
            v5t0Var.mo13687g(strM134085g, this);
        }
        x2t0.m206869g("VideoStreamNoopCache is doing nothing.");
        m163063h(str, strM134085g, GuideBoostMode.noop, "Noop cache is a noop.");
        return false;
    }

    @Override // p149l.o7t0
    /* JADX INFO: renamed from: g */
    public final void mo105821g() {
    }
}
