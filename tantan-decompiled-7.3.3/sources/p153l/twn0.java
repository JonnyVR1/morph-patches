package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVirtualVoice;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;

/* JADX INFO: loaded from: classes4.dex */
public class twn0 extends jk2<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> {
    public twn0(wbg0<LongLinkVirtualVoice.VoiceRoomDissolve, LongLinkVirtualVoice.VoiceRoomDissolve> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveControlMessage mo95513w(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve, String str2) {
        return new LiveControlMessage(str, "delete_room");
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkVirtualVoice.VoiceRoomDissolve> mo95510b() {
        return LongLinkVirtualVoice.VoiceRoomDissolve.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.dissolve";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkVirtualVoice.VoiceRoomDissolve mo95993z(String str, LongLinkVirtualVoice.VoiceRoomDissolve voiceRoomDissolve) {
        return voiceRoomDissolve;
    }
}
