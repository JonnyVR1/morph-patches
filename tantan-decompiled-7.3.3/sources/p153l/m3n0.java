package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
public class m3n0 extends ue4 {
    public m3n0(dum dumVar, LiveCampaignView liveCampaignView) {
        super(dumVar, liveCampaignView);
    }

    @Override // p153l.ue4
    /* JADX INFO: renamed from: C4 */
    public void mo156935C4(BLiveCampaign bLiveCampaign) {
        super.mo156935C4(bLiveCampaign);
        m156939T4(bLiveCampaign.campaignType);
    }

    @Override // p153l.ue4
    /* JADX INFO: renamed from: O4 */
    public void mo156937O4(BLiveCampaign bLiveCampaign) {
        if (TextUtils.isEmpty(bLiveCampaign.schema)) {
            return;
        }
        m156938S4(bLiveCampaign.campaignType, bLiveCampaign.schema);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: S4 */
    public void m156938S4(String str, String str2) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("campaign_type", str);
        map.put("roomId", m213810E2().m202194o());
        map.put("user_type", i9o0.m139140l(this));
        map.put(UserBanAppealSwitch.offline, zrv.f205799a.m207690r(str2));
        map.put("device_level", Integer.valueOf(c0e.INSTANCE.m107408a()));
        i4g0.m138521s("e_audio_banner", m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v6, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: T4 */
    public void m156939T4(String str) {
        HashMap map = new HashMap();
        map.put("anchor_id", m213810E2().m168532l0().f56859id);
        map.put("live_id", m213810E2().mo183435j().f45171id);
        map.put("roomId", m213810E2().m202194o());
        map.put("user_type", i9o0.m139140l(this));
        map.put("campaign_type", str);
        i4g0.m138527y("e_audio_banner", m213810E2().mo118373p() ? "p_anchor_audio_room" : "p_user_audio_room", map);
    }

    @Override // p153l.ue4
    /* JADX INFO: renamed from: k4 */
    public String mo156940k4() {
        return "voice-room";
    }

    @Override // p153l.ue4
    /* JADX INFO: renamed from: D4 */
    public void mo156936D4(boolean z) {
    }
}
