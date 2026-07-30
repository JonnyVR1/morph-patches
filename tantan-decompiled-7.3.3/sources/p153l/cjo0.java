package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class cjo0 extends jk2<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> {
    public cjo0(wbg0<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveHighQualityTagMessage> mo95510b() {
        return LongLinkLiveMessage.VoiceLiveHighQualityTagMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.highQualityTagStateChange";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveHighQualityTagMessage mo95993z(String str, LongLinkLiveMessage.VoiceLiveHighQualityTagMessage voiceLiveHighQualityTagMessage) {
        return voiceLiveHighQualityTagMessage;
    }
}
