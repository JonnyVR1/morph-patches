package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class d1n0 extends jk2<LongLinkLiveMessage.VoiceCallMessage, gvn0> {
    public d1n0(wbg0<gvn0, gvn0> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceCallMessage voiceCallMessage, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.VoiceCallMessage voiceCallMessage, String str2) {
        LongLinkLiveMessage.VoiceCall call = voiceCallMessage.getCall();
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.callInviteId = call.getInviteId();
        extInfo.applyCallId = call.getId();
        extInfo.isVoiceCallApplyMessage = voiceCallMessage.getType() == 2;
        if (voiceCallMessage.getTemplateData() == null || voiceCallMessage.getTemplateData().getId() == 0 || voiceCallMessage.getType() == 0 || voiceCallMessage.getType() == 14) {
            return super.mo113619x(str, voiceCallMessage, str2);
        }
        return m159458o(str, voiceCallMessage.getTemplateData().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(call.getUserName()).setId(call.getUserId()).build(), null, voiceCallMessage.getTemplateData(), extInfo);
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public gvn0 mo95993z(String str, LongLinkLiveMessage.VoiceCallMessage voiceCallMessage) {
        return new gvn0(voiceCallMessage.getCall(), voiceCallMessage.getType());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceCallMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceCallMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.call";
    }
}
