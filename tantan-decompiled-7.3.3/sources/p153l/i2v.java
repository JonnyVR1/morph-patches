package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;

/* JADX INFO: loaded from: classes4.dex */
public class i2v extends jk2<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> {
    public i2v(wbg0 wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> mo95510b() {
        return LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.room.anchor.growth";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage mo95993z(String str, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        return voiceAnchorGrowthMessage;
    }
}
