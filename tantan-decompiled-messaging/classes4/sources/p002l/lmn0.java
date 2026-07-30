package p002l;

import com.p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lmn0 extends bk2<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> {
    public lmn0(p3g0<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> mo9244b() {
        return VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "voicelive.room.backgroundPicUpdate";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage mo9251z(String str, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        return voiceRoomBgPicUpdateMessage;
    }
}
