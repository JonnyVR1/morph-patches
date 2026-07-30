package p153l;

import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceChangeRoomBg;

/* JADX INFO: loaded from: classes4.dex */
public class pvn0 extends jk2<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> {
    public pvn0(wbg0<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage> mo95510b() {
        return VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "voicelive.room.backgroundPicUpdate";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage mo95993z(String str, VoiceChangeRoomBg.VoiceRoomBgPicUpdateMessage voiceRoomBgPicUpdateMessage) {
        return voiceRoomBgPicUpdateMessage;
    }
}
