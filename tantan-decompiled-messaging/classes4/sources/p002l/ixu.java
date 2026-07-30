package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ixu extends bk2<LongLinkVirtualVoice.VoiceToneMessage, LongLinkVirtualVoice.VoiceToneMessage> {
    public ixu(p3g0<LongLinkVirtualVoice.VoiceToneMessage, LongLinkVirtualVoice.VoiceToneMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceToneMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceToneMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.trick.tone";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceToneMessage mo9251z(String str, LongLinkVirtualVoice.VoiceToneMessage voiceToneMessage) {
        return voiceToneMessage;
    }
}
