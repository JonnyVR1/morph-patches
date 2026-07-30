package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;

/* JADX INFO: loaded from: classes9.dex */
public class s4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        String strM166119b = o5e0.m166119b(abe0Var.m96743f(), "source");
        String strM166119b2 = o5e0.m166119b(abe0Var.m96743f(), "category");
        String strM166119b3 = o5e0.m166119b(abe0Var.m96743f(), "open");
        o5e0.m166119b(abe0Var.m96743f(), "liveId");
        String strM175373O = q5k0.m175373O(v5k0.m199898j(abe0Var, "liveSchema"));
        String strM199896h = v5k0.m199896h(abe0Var);
        nsh0.m164608j("[live][schema]", "schema:" + abe0Var.m96740c() + "path:" + abe0Var.m96744g());
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(User.ID_TEAM_ACCOUNT).m68787O(strM166119b).m68798y(strM166119b2).m68782J(strM166119b3).m68779G(strM175373O).m68783K(strM199896h).m68789Q(false).m68794u()));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return "live/withOpen".equals(str);
    }
}
