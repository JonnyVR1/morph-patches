package p153l;

import com.p051p1.mobile.putong.core.data.GuideBoostMode;

/* JADX INFO: loaded from: classes6.dex */
public final class iht0 extends ugt0 {
    public iht0(bft0 bft0Var) {
        super(bft0Var);
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: u */
    public final boolean mo140036u(String str) {
        String strM167038g = obt0.m167038g(str);
        bft0 bft0Var = (bft0) this.f178933c.get();
        if (bft0Var != null && strM167038g != null) {
            bft0Var.mo13741g(strM167038g, this);
        }
        dct0.m115298g("VideoStreamNoopCache is doing nothing.");
        m195942h(str, strM167038g, GuideBoostMode.noop, "Noop cache is a noop.");
        return false;
    }

    @Override // p153l.ugt0
    /* JADX INFO: renamed from: g */
    public final void mo140035g() {
    }
}
