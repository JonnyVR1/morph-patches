package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class nit extends jk2<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> {
    public nit(wbg0<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg mo95993z(String str, LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg liveRoomAnnouncementAuditMsg) {
        if (!TextUtils.isEmpty(liveRoomAnnouncementAuditMsg.getMsg())) {
            r1j0.m179420g(liveRoomAnnouncementAuditMsg.getMsg());
        }
        return liveRoomAnnouncementAuditMsg;
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg> mo95510b() {
        return LongLinkLiveMessage.LiveRoomAnnouncementAuditMsg.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.roomAnnouncement.audit";
    }
}
