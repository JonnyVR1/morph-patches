package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.liveroom.voiceTemplateMsg;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import l.rxn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xhh0 extends vp2<voiceTemplateMsg.VoiceTemplateMsg> {
    public xhh0(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str2) {
        LiveUserInfo liveUserInfoM25942z = m25942z(voiceTemplateMsg);
        BLiveTemplate bLiveTemplateM20739f = this.f21259c.m23568d().m20739f(voiceTemplateMsg.getTemplateData().getId());
        LiveMessage.ExtInfo extInfoM12194A = e5t.m12194A(voiceTemplateMsg.getTemplateData(), bLiveTemplateM20739f);
        extInfoM12194A.buttonScene = e5t.m12219x(bLiveTemplateM20739f);
        extInfoM12194A.isSystemReplaceMessage = true;
        return m24090l(null, str, voiceTemplateMsg.getTemplateData().getId(), liveUserInfoM25942z, null, voiceTemplateMsg.getTemplateData(), extInfoM12194A);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<voiceTemplateMsg.VoiceTemplateMsg> mo9244b() {
        return voiceTemplateMsg.VoiceTemplateMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.template.msg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m25942z(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceTemplateMsg.getSenderMask().getUserId(), voiceTemplateMsg.getSenderMask().getName(), rxn0.a(voiceTemplateMsg.getSenderMask()));
        liveUserInfo.isMaskMode = (voiceTemplateMsg.getSenderMask() == null || voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
