package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class luo0 extends bk2<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> {
    public luo0(p3g0<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveTopEffectMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceLiveTopEffectMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voiceLive.notice.topEffect";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveTopEffectMessage mo94461z(String str, LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        return voiceLiveTopEffectMessage;
    }
}
