package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class o4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (mwl.m160558h(act)) {
            return;
        }
        m160564b(act, SchemeKey.liveSquare, null);
        if (mqr.m159590j()) {
            m166024r(act, v5k0.m199898j(abe0Var, "anchorSource"), false);
        } else {
            o1j0.m165649w(R$string.f45736Z);
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("liveAnchor").equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m166024r(Act act, String str, boolean z) {
        if (mqr.m159587g()) {
            wtm.m207899e().m207904j(act);
        } else {
            tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(true).m68746n(str).m68744l(z).m68743k());
        }
    }
}
