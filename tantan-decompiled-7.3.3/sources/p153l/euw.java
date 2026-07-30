package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes4.dex */
public class euw extends yr2 {

    /* JADX INFO: renamed from: a */
    public C22507a<ArrayList<String>> f95970a;

    public euw(C22507a<ArrayList<String>> c22507a) {
        this.f95970a = c22507a;
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: b */
    public List<String> mo107422b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, hzc0 hzc0Var) {
        if (hzc0Var == null) {
            return jyb.m147507f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = hzc0Var.f112221a;
        if (bLiveAbsData != null && y6s.m214494b(bLiveAbsData.liveMode)) {
            return TextUtils.equals(hzc0Var.f112231k, "manager") ? jyb.m147507f0(bLiveTemplateItem.url) : jyb.m147507f0(new String[0]);
        }
        if (hzc0Var.f112222b != null) {
            ArrayList<String> arrayListM222761e = this.f95970a.m222761e();
            String str = hzc0Var.f112222b;
            Objects.requireNonNull(str);
            if (jyb.m147520m(arrayListM222761e, new ctz(str))) {
                return jyb.m147507f0(bLiveTemplateItem.url);
            }
        }
        return jyb.m147507f0(new String[0]);
    }

    @Override // p153l.yr2
    /* JADX INFO: renamed from: f */
    public void mo107423f(suf0 suf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, hzc0 hzc0Var) {
        m217146d(suf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p153l.b7m
    public String getType() {
        return "managerMedal";
    }
}
