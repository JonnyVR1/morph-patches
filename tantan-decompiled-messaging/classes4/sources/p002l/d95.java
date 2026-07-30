package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.template.Template;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d95 extends vp2<Template.TemplateData> {
    public d95(und undVar) {
        super(undVar);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public LiveMessage mo9247x(String str, Template.TemplateData templateData, String str2) {
        return m24092n(System.currentTimeMillis() + "", templateData.getId(), null, null, templateData);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<Template.TemplateData> mo9244b() {
        return Template.TemplateData.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.client.local.system";
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(Template.TemplateData templateData, String str) {
        return true;
    }
}
