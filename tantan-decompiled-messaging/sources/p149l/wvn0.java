package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class wvn0 extends bk2<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> {
    public wvn0(p3g0<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceSettleMessage> mo94398b() {
        return LongLinkVirtualVoice.VoiceSettleMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.trick.settle";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceSettleMessage mo94461z(String str, LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        return voiceSettleMessage;
    }
}
