package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class a5o0 extends jk2<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> {
    public a5o0(wbg0<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceSettleMessage> mo95510b() {
        return LongLinkVirtualVoice.VoiceSettleMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.trick.settle";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceSettleMessage mo95993z(String str, LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        return voiceSettleMessage;
    }
}
