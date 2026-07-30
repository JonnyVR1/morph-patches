package p149l;

import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class euf0 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return crc0Var.f82200d.hasStarlightHierarchy() ? vwb.m200324f0(crc0Var.f82200d.getStarlightHierarchy().getImageUrl()) : vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m137817d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p149l.k4m
    public String getType() {
        return "starlightHierarchy";
    }
}
