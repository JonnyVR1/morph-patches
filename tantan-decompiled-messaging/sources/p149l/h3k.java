package p149l;

import com.p046p1.mobile.android.app.Act;

/* JADX INFO: loaded from: classes13.dex */
public class h3k extends aul {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if ("live/onTeenModeEnable".equals(str)) {
            pgi0.m168730l().m168745r(rwj0.m181406e(w2e0Var, "enable"));
        } else if ("live/verifyTeenModePassword".equals(str)) {
            pgi0.m168730l().m168743p(rwj0.m181406e(w2e0Var, "verified"), rwj0.m181407f(w2e0Var, "scenes"));
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/onTeenModeEnable".equals(str) || "live/verifyTeenModePassword".equals(str);
    }
}
