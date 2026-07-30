package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class n4p0 extends jk2<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> {
    public n4p0(wbg0<LongLinkLiveMessage.AnnouncementAudit, LongLinkLiveMessage.AnnouncementAudit> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str) {
        return true;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo113619x(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit, String str2) {
        return announcementAudit.getTemplateData().getId() <= 0 ? super.mo113619x(str, announcementAudit, str2) : m159457n(str, announcementAudit.getTemplateData().getId(), null, null, Template.TemplateData.newBuilder().setId(announcementAudit.getTemplateData().getId()).addAllFields(announcementAudit.getTemplateData().getFieldsList()).build());
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkLiveMessage.AnnouncementAudit> mo95510b() {
        return LongLinkLiveMessage.AnnouncementAudit.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.voiceRoom.announcementAudit";
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public LongLinkLiveMessage.AnnouncementAudit mo95993z(String str, LongLinkLiveMessage.AnnouncementAudit announcementAudit) {
        return announcementAudit;
    }
}
