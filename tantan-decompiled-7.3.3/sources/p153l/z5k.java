package p153l;

import com.p051p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes9.dex */
public class z5k extends owl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if ("live/onTeenModeEnable".equals(str)) {
            ppi0.m173207l().m173222r(v5k0.m199893e(abe0Var, "enable"));
        } else if ("live/verifyTeenModePassword".equals(str)) {
            ppi0.m173207l().m173220p(v5k0.m199893e(abe0Var, "verified"), v5k0.m199894f(abe0Var, "scenes"));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/onTeenModeEnable".equals(str) || "live/verifyTeenModePassword".equals(str);
    }
}
