package p149l;

import android.content.Intent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.apibean.LiveGoAction;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;

/* JADX INFO: loaded from: classes13.dex */
public class k2k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: c */
    public void mo124162c(Act act, LiveGoAction liveGoAction) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        super.mo124162c(act, liveGoAction);
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
        BLiveVoice.new_().f44323id = liveGoAction.getGoData();
        Intent intentM134373f = s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(liveGoAction.getGoData()).m67606Q(true).m67604O(str).m67615y(str2).m67616z(str5).m67613w(str3).m67614x(str4).m67611u());
        if (intentM134373f == null) {
            return;
        }
        act.startActivity(intentM134373f);
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (TextUtils.isEmpty(w2e0Var.m201098f().get("liveId"))) {
            return;
        }
        String strM181411j = rwj0.m181411j(w2e0Var, "anchorId");
        String strM181411j2 = rwj0.m181411j(w2e0Var, "liveId");
        String strM181411j3 = rwj0.m181411j(w2e0Var, "source");
        String strM181411j4 = rwj0.m181411j(w2e0Var, "recallSourceId");
        if (strM181411j4 == null) {
            strM181411j4 = "";
        }
        m144305r(act, strM181411j, strM181411j2, strM181411j3, "", "", strM181411j4, rwj0.m181411j(w2e0Var, "liveMode"));
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: j */
    public boolean mo124163j(int i) {
        return 2 == i || 5 == i;
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return mo99015a("voiceRoom").equals(str);
    }

    /* JADX INFO: renamed from: r */
    public void m144305r(Act act, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8 = TextUtils.isEmpty(str3) ? "default" : str3;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        mwj0.m156659H(str, str2, str6, str3);
        m216069b(act, "voiceSquare", null);
        act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67606Q(true).m67594E(str2).m67604O(str8).m67596G(str5).m67595F(str7).m67616z(str6).m67609T(str4).m67611u()));
    }
}
