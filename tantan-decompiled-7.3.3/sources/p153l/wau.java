package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class wau extends jk2<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> {
    public wau(wbg0<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> mo95510b() {
        return LongLinkVirtualVoice.VoiceStreamBizTypeMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.live.streamBizType";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceStreamBizTypeMessage mo95993z(String str, LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
        return voiceStreamBizTypeMessage;
    }
}
