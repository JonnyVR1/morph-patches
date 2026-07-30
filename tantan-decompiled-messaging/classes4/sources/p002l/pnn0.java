package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pnn0 extends bk2<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> {
    public pnn0(p3g0<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo10148w(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str2) {
        return new LiveControlMessage(str, "delete_room");
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceRoomDissolve> mo9244b() {
        return LongLinkVirtualVoice.VoiceRoomDissolve.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.dissolve";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceRoomDissolve mo9251z(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve) {
        return voiceRoomDissolve;
    }
}
