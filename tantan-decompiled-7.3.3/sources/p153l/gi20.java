package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class gi20 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        return (bLiveTemplateItem.index <= 0 || jyb.m147479J(templateData.getFieldsList()) || bLiveTemplateItem.index > templateData.getFieldsList().size() || TextUtils.isEmpty(templateData.getFields(bLiveTemplateItem.index + (-1)))) ? jyb.m147507f0(new String[0]) : jyb.m147507f0(templateData.getFields(bLiveTemplateItem.index - 1));
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        m217146d(suf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p153l.b7m
    public String getType() {
        return "image";
    }
}
