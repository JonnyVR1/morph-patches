package p002l;

import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rvo0 extends bk2<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> {
    public rvo0(p3g0<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.VoiceRoomAnnouncementUpdate> mo9244b() {
        return LongLinkLiveMessage.VoiceRoomAnnouncementUpdate.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.updateAnnouncement";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.VoiceRoomAnnouncementUpdate mo9251z(String str, LongLinkLiveMessage.VoiceRoomAnnouncementUpdate voiceRoomAnnouncementUpdate) {
        return voiceRoomAnnouncementUpdate;
    }
}
