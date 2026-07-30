package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class pnn0 extends bk2<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> {
    public pnn0(p3g0<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo99811w(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str2) {
        return new LiveControlMessage(str, "delete_room");
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceRoomDissolve> mo94398b() {
        return LongLinkVirtualVoice.VoiceRoomDissolve.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.dissolve";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceRoomDissolve mo94461z(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve) {
        return voiceRoomDissolve;
    }
}
