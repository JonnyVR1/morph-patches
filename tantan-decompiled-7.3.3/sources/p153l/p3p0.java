package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class p3p0 extends jk2<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> {
    public p3p0(wbg0<LongLinkLiveMessage.VoiceLiveTopEffectMessage, LongLinkLiveMessage.VoiceLiveTopEffectMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveTopEffectMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceLiveTopEffectMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voiceLive.notice.topEffect";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveTopEffectMessage mo95993z(String str, LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        return voiceLiveTopEffectMessage;
    }
}
