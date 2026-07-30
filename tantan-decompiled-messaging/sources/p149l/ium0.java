package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class ium0 extends vd4 {
    public ium0(bsm bsmVar, LiveCampaignView liveCampaignView) {
        super(bsmVar, liveCampaignView);
    }

    @Override // p149l.vd4
    /* JADX INFO: renamed from: C4 */
    public void mo138427C4(BLiveCampaign bLiveCampaign) {
        super.mo138427C4(bLiveCampaign);
        m138431T4(bLiveCampaign.campaignType);
    }

    @Override // p149l.vd4
    /* JADX INFO: renamed from: O4 */
    public void mo138429O4(BLiveCampaign bLiveCampaign) {
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            return;
        }
        m138430S4(bLiveCampaign.campaignType, bLiveCampaign.schema);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: S4 */
    public void m138430S4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("campaign_type", str);
        map.put("roomId", m206027E2().m149818o());
        map.put("user_type", e0o0.m114325l(this));
        map.put(UserBanAppealSwitch.offline, ypv.f199493a.m199368r(str2));
        map.put("device_level", Integer.valueOf(pyd.INSTANCE.m172109a()));
        zvf0.m220397s("e_audio_banner", m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: T4 */
    public void m138431T4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m206027E2().m132146l0().f56011id);
        map.put("live_id", m206027E2().mo149813j().f44323id);
        map.put("roomId", m206027E2().m149818o());
        map.put("user_type", e0o0.m114325l(this));
        map.put("campaign_type", str);
        zvf0.m220403y("e_audio_banner", m206027E2().mo97490p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    @Override // p149l.vd4
    /* JADX INFO: renamed from: k4 */
    public String mo138432k4() {
        return "voice-room";
    }

    @Override // p149l.vd4
    /* JADX INFO: renamed from: D4 */
    public void mo138428D4(boolean z) {
    }
}
