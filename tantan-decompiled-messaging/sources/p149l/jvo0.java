package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class jvo0 extends bk2<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> {
    public jvo0(p3g0<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str) {
        return true;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str2) {
        return announcementAudit.getTemplateData().getId() <= 0 ? super.mo94401x(str, announcementAudit, str2) : m199209n(str, announcementAudit.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(announcementAudit.getTemplateData().getId()).addAllFields(announcementAudit.getTemplateData().getFieldsList()).build());
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AnnouncementAudit> mo94398b() {
        return LongLinkLiveMessage.AnnouncementAudit.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.voiceRoom.announcementAudit";
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.AnnouncementAudit mo94461z(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        return announcementAudit;
    }
}
