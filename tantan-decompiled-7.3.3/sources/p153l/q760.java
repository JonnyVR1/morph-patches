package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.data.Owner;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class q760 extends yr2 {
    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        if (hzc0Var == null) {
            return jyb.m147507f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = hzc0Var.f112221a;
        if (bLiveAbsData == null || !y6s.m214494b(bLiveAbsData.liveMode)) {
            return hzc0Var.m137883a() ? jyb.m147507f0(bLiveTemplateItem.url) : jyb.m147507f0(new String[0]);
        }
        return TextUtils.equals(hzc0Var.f112231k, Owner.TYPE) ? jyb.m147507f0(bLiveTemplateItem.url) : jyb.m147507f0(new String[0]);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        m217146d(suf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p153l.b7m
    public String getType() {
        return "ownerMedal";
    }
}
