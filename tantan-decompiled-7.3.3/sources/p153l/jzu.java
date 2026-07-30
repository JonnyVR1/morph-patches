package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class jzu extends jk2<LongLinkVirtualVoice.VoiceToneMessage, LongLinkVirtualVoice.VoiceToneMessage> {
    public jzu(wbg0<LongLinkVirtualVoice.VoiceToneMessage, LongLinkVirtualVoice.VoiceToneMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceToneMessage> mo95510b() {
        return LongLinkVirtualVoice.VoiceToneMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voice.trick.tone";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceToneMessage mo95993z(String str, LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage) {
        return voiceToneMessage;
    }
}
