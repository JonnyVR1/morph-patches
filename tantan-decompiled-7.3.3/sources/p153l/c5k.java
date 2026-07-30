package p153l;

import android.content.Intent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes9.dex */
public class c5k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: c */
    public void mo108063c(Act act, LiveGoAction liveGoAction) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo108063c(act, liveGoAction);
        if (liveGoAction.getGoExtra() != null) {
            str = liveGoAction.getGoExtra().get("source");
            str2 = liveGoAction.getGoExtra().get("category");
            str3 = liveGoAction.getGoExtra().get("roomBackgroundPicType");
            str4 = liveGoAction.getGoExtra().get("roomBackgroundImageUrl");
            str5 = liveGoAction.getGoExtra().get("sourceUserId");
        } else {
            str = "swipe-page";
            str2 = "";
            str3 = "";
            str4 = str3;
            str5 = str4;
        }
        BLiveVoice.new_().f45171id = liveGoAction.getGoData();
        Intent intentM143704f = tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(liveGoAction.getGoData()).m68789Q(true).m68787O(str).m68798y(str2).m68799z(str5).m68796w(str3).m68797x(str4).m68794u());
        if (intentM143704f == null) {
            return;
        }
        act.startActivity(intentM143704f);
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (TextUtils.isEmpty(abe0Var.m96743f().get("liveId"))) {
            return;
        }
        String strM199898j = v5k0.m199898j(abe0Var, "anchorId");
        String strM199898j2 = v5k0.m199898j(abe0Var, "liveId");
        String strM199898j3 = v5k0.m199898j(abe0Var, "source");
        String strM199898j4 = v5k0.m199898j(abe0Var, "recallSourceId");
        if (strM199898j4 == null) {
            strM199898j4 = "";
        }
        m108065r(act, strM199898j, strM199898j2, strM199898j3, "", "", strM199898j4, v5k0.m199898j(abe0Var, "liveMode"));
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: j */
    public boolean mo108064j(int i) {
        return 2 == i || 5 == i;
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return mo160563a("voiceRoom").equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m108065r(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = TextUtils.isEmpty(str3) ? "default" : str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        q5k0.m175371H(str, str2, str6, str3);
        m160564b(act, "voiceSquare", null);
        act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68789Q(true).m68777E(str2).m68787O(str8).m68779G(str5).m68778F(str7).m68799z(str6).m68792T(str4).m68794u()));
    }
}
