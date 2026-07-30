package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.external.R$string;

/* JADX INFO: loaded from: classes13.dex */
public class w1k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (ytl.m216064h(act)) {
            return;
        }
        m216069b(act, SchemeKey.liveSquare, null);
        if (lor.m150805j()) {
            m200937r(act, rwj0.m181411j(w2e0Var, "anchorSource"), false);
        } else {
            lsi0.m151593w(R$string.f44888Z);
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a("liveAnchor").equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m200937r(Act act, String str, boolean z) {
        if (lor.m150802g()) {
            urm.m195083e().m195088j(act);
        } else {
            s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(true).m67563n(str).m67561l(z).m67560k());
        }
    }
}
