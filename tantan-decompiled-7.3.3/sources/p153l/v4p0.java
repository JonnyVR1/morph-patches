package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class v4p0 extends jk2<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> {
    public v4p0(wbg0<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate, String str) {
        return true;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> mo95510b() {
        return LongLinkLiveMessage.VoiceRoomAnnouncementUpdate.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.updateAnnouncement";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceRoomAnnouncementUpdate mo95993z(String str, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        return voiceRoomAnnouncementUpdate;
    }
}
