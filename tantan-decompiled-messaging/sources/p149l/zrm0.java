package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class zrm0 extends bk2<LongLinkLiveMessage.VoiceCallMessage, cmn0> {
    public zrm0(p3g0<cmn0, cmn0> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceCallMessage voiceCallMessage, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.VoiceCallMessage voiceCallMessage, String str2) {
        LongLinkLiveMessage.VoiceCall call = voiceCallMessage.getCall();
        LiveMessage.ExtInfo extInfo = new LiveMessage.ExtInfo();
        extInfo.callInviteId = call.getInviteId();
        extInfo.applyCallId = call.getId();
        extInfo.isVoiceCallApplyMessage = voiceCallMessage.getType() == 2;
        if (voiceCallMessage.getTemplateData() == null || voiceCallMessage.getTemplateData().getId() == 0 || voiceCallMessage.getType() == 0 || voiceCallMessage.getType() == 14) {
            return super.mo94401x(str, voiceCallMessage, str2);
        }
        return m199210o(str, voiceCallMessage.getTemplateData().getId(), LongLinkLiveMessage.UserInfo.newBuilder().setName(call.getUserName()).setId(call.getUserId()).build(), null, voiceCallMessage.getTemplateData(), extInfo);
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public cmn0 mo94461z(String str, LongLinkLiveMessage.VoiceCallMessage voiceCallMessage) {
        return new cmn0(voiceCallMessage.getCall(), voiceCallMessage.getType());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceCallMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceCallMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.call";
    }
}
