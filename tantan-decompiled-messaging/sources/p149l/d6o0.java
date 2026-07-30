package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;

/* JADX INFO: loaded from: classes4.dex */
public class d6o0 extends bk2<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> {
    public d6o0(p3g0<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp, String str) {
        if (TextUtils.isEmpty(voiceLivePopUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(voiceLivePopUp.getRoomId()) || m199212r(voiceLivePopUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceNewCampaignPopUp.VoiceLivePopUp> mo94398b() {
        return VoiceNewCampaignPopUp.VoiceLivePopUp.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.campaign.voicelivePopUp";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNewCampaignPopUp.VoiceLivePopUp mo94461z(String str, VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        return voiceLivePopUp;
    }
}
