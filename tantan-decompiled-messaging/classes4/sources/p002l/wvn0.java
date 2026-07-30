package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wvn0 extends bk2<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> {
    public wvn0(p3g0<LongLinkVirtualVoice.VoiceSettleMessage, LongLinkVirtualVoice.VoiceSettleMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceSettleMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceSettleMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.trick.settle";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceSettleMessage mo9251z(String str, LongLinkVirtualVoice.VoiceSettleMessage voiceSettleMessage) {
        return voiceSettleMessage;
    }
}
