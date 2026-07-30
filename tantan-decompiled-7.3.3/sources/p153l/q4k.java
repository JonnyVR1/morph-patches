package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;

/* JADX INFO: loaded from: classes9.dex */
public class q4k extends nwl {
    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (SchemeKey.liveRight.equals(str)) {
            if (TextUtils.isEmpty(v5k0.m199898j(abe0Var, "liveId"))) {
                act.startActivity(LiveRightAct.m71834X1(abe0Var.m96739b(), v5k0.m199898j(abe0Var, "liveId"), v5k0.m199898j(abe0Var, "roomId"), v5k0.m199898j(abe0Var, "anchor_name"), v5k0.m199898j(abe0Var, "anchor_id"), v5k0.m199898j(abe0Var, "live_mode"), "live"));
            } else {
                LiveRightAct.m71835Y1(act);
            }
        }
        if (SchemeKey.voiceRight.equals(str)) {
            LiveRightAct.m71836Z1(act, "", "", "", "", BLiveAbsData.VOICE_LIVE, "");
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.liveRight.equals(str) || SchemeKey.voiceRight.equals(str);
    }
}
