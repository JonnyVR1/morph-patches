package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class y920 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        return (bLiveTemplateItem.index <= 0 || vwb.J(templateData.getFieldsList()) || bLiveTemplateItem.index > templateData.getFieldsList().size() || TextUtils.isEmpty(templateData.getFields(bLiveTemplateItem.index + (-1)))) ? vwb.f0(new String[0]) : vwb.f0(new String[]{templateData.getFields(bLiveTemplateItem.index - 1)});
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "image";
    }
}
