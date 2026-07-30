package p149l;

import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;

/* JADX INFO: loaded from: classes4.dex */
public class d95 extends vp2<Template.TemplateData> {
    public d95(und undVar) {
        super(undVar);
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo94401x(String str, Template.TemplateData templateData, String str2) {
        return m199209n(System.currentTimeMillis() + "", templateData.getId(), null, null, templateData);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<Template.TemplateData> mo94398b() {
        return Template.TemplateData.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.client.local.system";
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(Template.TemplateData templateData, String str) {
        return true;
    }
}
