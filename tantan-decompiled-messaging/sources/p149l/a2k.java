package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;

/* JADX INFO: loaded from: classes13.dex */
public class a2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        String strM147736b = kxd0.m147736b(w2e0Var.m201098f(), "source");
        String strM147736b2 = kxd0.m147736b(w2e0Var.m201098f(), "category");
        String strM147736b3 = kxd0.m147736b(w2e0Var.m201098f(), "open");
        kxd0.m147736b(w2e0Var.m201098f(), "liveId");
        String strM156661O = mwj0.m156661O(rwj0.m181411j(w2e0Var, "liveSchema"));
        String strM181409h = rwj0.m181409h(w2e0Var);
        gkh0.m126627j("[live][schema]", "schema:" + w2e0Var.m201095c() + "path:" + w2e0Var.m201099g());
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(User.ID_TEAM_ACCOUNT).m67604O(strM147736b).m67615y(strM147736b2).m67599J(strM147736b3).m67596G(strM156661O).m67600K(strM181409h).m67606Q(false).m67611u()));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return "live/withOpen".equals(str);
    }
}
