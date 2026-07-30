package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tdu extends bk2<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> {
    public tdu(p3g0<LongLinkVirtualVoice.VoiceGameMessage, LongLinkVirtualVoice.VoiceGameMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceGameMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceGameMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.trick.game";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceGameMessage mo9251z(String str, LongLinkVirtualVoice.VoiceGameMessage voiceGameMessage) {
        return voiceGameMessage;
    }
}
