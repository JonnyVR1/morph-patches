package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.external.page.rights.manage.LiveRightAct;

/* JADX INFO: loaded from: classes13.dex */
public class y1k extends ztl {
    @Override // p149l.ytl
    /* JADX INFO: renamed from: e */
    public void mo94601e(Act act, String str, w2e0 w2e0Var) {
        super.mo94601e(act, str, w2e0Var);
        if (SchemeKey.liveRight.equals(str)) {
            if (TextUtils.isEmpty(rwj0.m181411j(w2e0Var, "liveId"))) {
                act.startActivity(LiveRightAct.m70651V1(w2e0Var.m201094b(), rwj0.m181411j(w2e0Var, "liveId"), rwj0.m181411j(w2e0Var, "roomId"), rwj0.m181411j(w2e0Var, "anchor_name"), rwj0.m181411j(w2e0Var, "anchor_id"), rwj0.m181411j(w2e0Var, "live_mode"), "live"));
            } else {
                LiveRightAct.m70652X1(act);
            }
        }
        if (SchemeKey.voiceRight.equals(str)) {
            LiveRightAct.m70653Y1(act, "", "", "", "", BLiveAbsData.VOICE_LIVE, "");
        }
    }

    @Override // p149l.ytl
    /* JADX INFO: renamed from: l */
    public boolean mo94602l(String str) {
        return SchemeKey.liveRight.equals(str) || SchemeKey.voiceRight.equals(str);
    }
}
