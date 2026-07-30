package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import l.p3g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jvo0 extends bk2<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> {
    public jvo0(p3g0<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str) {
        return true;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str2) {
        return announcementAudit.getTemplateData().getId() <= 0 ? super.mo9247x(str, announcementAudit, str2) : m24092n(str, announcementAudit.getTemplateData().getId(), null, null, (Template.TemplateData) Template.TemplateData.newBuilder().setId(announcementAudit.getTemplateData().getId()).addAllFields(announcementAudit.getTemplateData().getFieldsList()).build());
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AnnouncementAudit> mo9244b() {
        return LongLinkLiveMessage.AnnouncementAudit.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.voiceRoom.announcementAudit";
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.AnnouncementAudit mo9251z(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        return announcementAudit;
    }
}
