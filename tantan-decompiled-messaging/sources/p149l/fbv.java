package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class fbv extends bk2<LongLinkLiveMessage.VoiceSettleGuideMessage, LongLinkLiveMessage.VoiceSettleGuideMessage> {
    public fbv(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSettleGuideMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceSettleGuideMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.trick.settle.guide";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceSettleGuideMessage mo94461z(String str, LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage) {
        return voiceSettleGuideMessage;
    }
}
