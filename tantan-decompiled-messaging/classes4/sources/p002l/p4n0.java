package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class p4n0 extends bk2<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> {
    public p4n0(p3g0<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage voiceLiveEnterRoomEffectMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> mo9244b() {
        return LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.enterRoomEffect";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage mo9251z(String str, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage voiceLiveEnterRoomEffectMessage) {
        return voiceLiveEnterRoomEffectMessage;
    }
}
