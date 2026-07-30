package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fbv extends bk2<LongLinkLiveMessage.VoiceSettleGuideMessage, LongLinkLiveMessage.VoiceSettleGuideMessage> {
    public fbv(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceSettleGuideMessage> mo9244b() {
        return LongLinkLiveMessage.VoiceSettleGuideMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.trick.settle.guide";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceSettleGuideMessage mo9251z(String str, LongLinkLiveMessage.VoiceSettleGuideMessage voiceSettleGuideMessage) {
        return voiceSettleGuideMessage;
    }
}
