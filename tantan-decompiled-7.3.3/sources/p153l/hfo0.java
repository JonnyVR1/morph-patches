package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.voicelivecampaign.VoiceNewCampaignPopUp;

/* JADX INFO: loaded from: classes4.dex */
public class hfo0 extends jk2<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> {
    public hfo0(wbg0<VoiceNewCampaignPopUp.VoiceLivePopUp, VoiceNewCampaignPopUp.VoiceLivePopUp> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp, String str) {
        if (TextUtils.isEmpty(voiceLivePopUp.getCampaignId())) {
            return false;
        }
        return TextUtils.isEmpty(voiceLivePopUp.getRoomId()) || m159460r(voiceLivePopUp.getRoomId(), "no_care", "no_care");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceNewCampaignPopUp.VoiceLivePopUp> mo95510b() {
        return VoiceNewCampaignPopUp.VoiceLivePopUp.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.campaign.voicelivePopUp";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceNewCampaignPopUp.VoiceLivePopUp mo95993z(String str, VoiceNewCampaignPopUp.VoiceLivePopUp voiceLivePopUp) {
        return voiceLivePopUp;
    }
}
