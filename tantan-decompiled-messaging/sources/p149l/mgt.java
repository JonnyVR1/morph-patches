package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class mgt extends bk2<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> {
    public mgt(p3g0<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg mo94461z(String str, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg) {
        if (!TextUtils.isEmpty(liveRoomAnnouncementAuditMsg.getMsg())) {
            osi0.m165783g(liveRoomAnnouncementAuditMsg.getMsg());
        }
        return liveRoomAnnouncementAuditMsg;
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> mo94398b() {
        return LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.roomAnnouncement.audit";
    }
}
