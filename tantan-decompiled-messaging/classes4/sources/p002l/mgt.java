package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import l.osi0;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mgt extends bk2<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> {
    public mgt(p3g0<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg mo9251z(String str, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg) {
        if (!TextUtils.isEmpty(liveRoomAnnouncementAuditMsg.getMsg())) {
            osi0.g(liveRoomAnnouncementAuditMsg.getMsg());
        }
        return liveRoomAnnouncementAuditMsg;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> mo9244b() {
        return LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.roomAnnouncement.audit";
    }
}
