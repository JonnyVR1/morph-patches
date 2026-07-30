package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ijo0 extends bk2<LongLinkVirtualVoice.VoiceSettleInviteMessage, LongLinkVirtualVoice.VoiceSettleInviteMessage> {
    public ijo0(p3g0<LongLinkVirtualVoice.VoiceSettleInviteMessage, LongLinkVirtualVoice.VoiceSettleInviteMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceSettleInviteMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceSettleInviteMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.trick.settle.invite";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceSettleInviteMessage mo9251z(String str, LongLinkVirtualVoice.VoiceSettleInviteMessage voiceSettleInviteMessage) {
        return voiceSettleInviteMessage;
    }
}
