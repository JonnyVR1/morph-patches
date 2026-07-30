package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.voiceTemplateMsg;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;

/* JADX INFO: loaded from: classes4.dex */
public class xhh0 extends vp2<voiceTemplateMsg.VoiceTemplateMsg> {
    public xhh0(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg, String str2) {
        LiveUserInfo liveUserInfoM208798z = m208798z(voiceTemplateMsg);
        BLiveTemplate bLiveTemplateM171773f = this.f182445c.m194417d().m171773f(voiceTemplateMsg.getTemplateData().getId());
        LiveMessage.ExtInfo extInfoM114895A = e5t.m114895A(voiceTemplateMsg.getTemplateData(), bLiveTemplateM171773f);
        extInfoM114895A.buttonScene = e5t.m114920x(bLiveTemplateM171773f);
        extInfoM114895A.isSystemReplaceMessage = true;
        return m199207l(null, str, voiceTemplateMsg.getTemplateData().getId(), liveUserInfoM208798z, null, voiceTemplateMsg.getTemplateData(), extInfoM114895A);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<voiceTemplateMsg.VoiceTemplateMsg> mo94398b() {
        return voiceTemplateMsg.VoiceTemplateMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.template.msg";
    }

    /* JADX INFO: renamed from: z */
    public final LiveUserInfo m208798z(voiceTemplateMsg.VoiceTemplateMsg voiceTemplateMsg) {
        LiveUserInfo liveUserInfo = new LiveUserInfo(voiceTemplateMsg.getSenderMask().getUserId(), voiceTemplateMsg.getSenderMask().getName(), rxn0.m181617a(voiceTemplateMsg.getSenderMask()));
        liveUserInfo.isMaskMode = (voiceTemplateMsg.getSenderMask() == null || voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition() == null || TextUtils.isEmpty(voiceTemplateMsg.getSenderMask().getVoiceMaskModeAddition().getColor())) ? false : true;
        return liveUserInfo;
    }
}
