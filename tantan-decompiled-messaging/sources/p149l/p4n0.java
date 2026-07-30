package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class p4n0 extends bk2<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> {
    public p4n0(p3g0<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage voiceLiveEnterRoomEffectMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage> mo94398b() {
        return LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.enterRoomEffect";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage mo94461z(String str, LongLinkLiveMessage.VoiceLiveEnterRoomEffectMessage voiceLiveEnterRoomEffectMessage) {
        return voiceLiveEnterRoomEffectMessage;
    }
}
