package p149l;

import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;

/* JADX INFO: loaded from: classes4.dex */
public class lmn0 extends bk2<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> {
    public lmn0(p3g0<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage, String str) {
        return true;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> mo94398b() {
        return VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "voicelive.room.backgroundPicUpdate";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage mo94461z(String str, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        return voiceRoomBgPicUpdateMessage;
    }
}
