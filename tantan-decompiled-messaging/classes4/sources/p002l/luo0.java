package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class luo0 extends bk2<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> {
    public luo0(p3g0<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveTopEffectMessage> mo9244b() {
        return LongLinkLiveMessage.VoiceLiveTopEffectMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voiceLive.notice.topEffect";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveTopEffectMessage mo9251z(String str, LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        return voiceLiveTopEffectMessage;
    }
}
