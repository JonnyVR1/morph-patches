package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class udu extends bk2<LongLinkVirtualVoice.VoiceLiveGameTypeMessage, LongLinkVirtualVoice.VoiceLiveGameTypeMessage> {
    public udu(p3g0<LongLinkVirtualVoice.VoiceLiveGameTypeMessage, LongLinkVirtualVoice.VoiceLiveGameTypeMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceLiveGameTypeMessage voiceLiveGameTypeMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceLiveGameTypeMessage> mo9244b() {
        return LongLinkVirtualVoice.VoiceLiveGameTypeMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voice.live.gameType";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceLiveGameTypeMessage mo9251z(String str, LongLinkVirtualVoice.VoiceLiveGameTypeMessage voiceLiveGameTypeMessage) {
        return voiceLiveGameTypeMessage;
    }
}
