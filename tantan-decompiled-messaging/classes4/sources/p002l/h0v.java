package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkAnchorGrowthMsg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h0v extends bk2<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> {
    public h0v(p3g0 p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage> mo9244b() {
        return LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.room.anchor.growth";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage mo9251z(String str, LongLinkAnchorGrowthMsg.VoiceAnchorGrowthMessage voiceAnchorGrowthMessage) {
        return voiceAnchorGrowthMessage;
    }
}
