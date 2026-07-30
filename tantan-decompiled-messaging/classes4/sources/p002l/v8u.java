package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v8u extends bk2<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> {
    public v8u(p3g0<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceStreamBizTypeMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.live.streamBizType";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceStreamBizTypeMessage mo9251z(String str, LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
        return voiceStreamBizTypeMessage;
    }
}
