package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;

/* JADX INFO: loaded from: classes4.dex */
public class v8u extends bk2<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> {
    public v8u(p3g0<LongLinkVirtualVoice.VoiceStreamBizTypeMessage, LongLinkVirtualVoice.VoiceStreamBizTypeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceStreamBizTypeMessage> mo94398b() {
        return LongLinkVirtualVoice.VoiceStreamBizTypeMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voice.live.streamBizType";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceStreamBizTypeMessage mo94461z(String str, LongLinkVirtualVoice.VoiceStreamBizTypeMessage voiceStreamBizTypeMessage) {
        return voiceStreamBizTypeMessage;
    }
}
