package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class ufu extends jk2<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> {
    public ufu(wbg0<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceGameMessage> mo95510b() {
        return LongLinkVirtualVoice.VoiceGameMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.trick.game";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceGameMessage mo95993z(String str, LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage) {
        return voiceGameMessage;
    }
}
