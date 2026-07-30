package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;

/* JADX INFO: loaded from: classes4.dex */
public class h0v extends bk2<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> {
    public h0v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> mo94398b() {
        return LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.room.anchor.growth";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage mo94461z(String str, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        return voiceAnchorGrowthMessage;
    }
}
