package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.voiceTemplateMsg;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class eqh0 extends mq2<voiceTemplateMsg.VoiceTemplateMsg> {
    public eqh0(zod zodVar) {
        super(zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str2) {
        LiveUserInfo liveUserInfoM121923z = m121923z(voiceTemplateMsg);
        BLiveTemplate bLiveTemplateM157079f = this.f137993c.m220736d().m157079f(voiceTemplateMsg.getTemplateData().getId());
        LiveMessage.ExtInfo extInfoM124479A = f7t.m124479A(voiceTemplateMsg.getTemplateData(), bLiveTemplateM157079f);
        extInfoM124479A.buttonScene = f7t.m124504x(bLiveTemplateM157079f);
        extInfoM124479A.isSystemReplaceMessage = true;
        return m159455l(null, str, voiceTemplateMsg.getTemplateData().getId(), liveUserInfoM121923z, null, voiceTemplateMsg.getTemplateData(), extInfoM124479A);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<voiceTemplateMsg.VoiceTemplateMsg> mo95510b() {
        return voiceTemplateMsg.VoiceTemplateMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.template.msg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m121923z(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceTemplateMsg.getSenderMask().getUserId(), voiceTemplateMsg.getSenderMask().getName(), v6o0.m200134a(voiceTemplateMsg.getSenderMask()));
        liveUserInfo.isMaskMode = (voiceTemplateMsg.getSenderMask() == null || voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
