package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class tdu extends bk2<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> {
    public tdu(p3g0<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceGameMessage> mo94398b() {
        return LongLinkVirtualVoice.VoiceGameMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.trick.game";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceGameMessage mo94461z(String str, LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage) {
        return voiceGameMessage;
    }
}
