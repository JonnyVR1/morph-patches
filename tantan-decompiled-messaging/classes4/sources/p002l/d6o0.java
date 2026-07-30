package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d6o0 extends bk2<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> {
    public d6o0(p3g0<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp, String str) {
        if (TextUtils.isEmpty(voiceLivePopUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(voiceLivePopUp.getRoomId()) || m24095r(voiceLivePopUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceNewCampaignPopUp.VoiceLivePopUp> mo9244b() {
        return VoiceNewCampaignPopUp.VoiceLivePopUp.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.campaign.voicelivePopUp";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNewCampaignPopUp.VoiceLivePopUp mo9251z(String str, VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        return voiceLivePopUp;
    }
}
