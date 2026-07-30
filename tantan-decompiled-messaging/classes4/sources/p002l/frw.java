package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import l.vwb;
import l.x4s;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class frw extends ir2 {

    /* JADX INFO: renamed from: a */
    public a<ArrayList<String>> f10614a;

    public frw(a<ArrayList<String>> aVar) {
        this.f10614a = aVar;
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (crc0Var == null) {
            return vwb.f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = crc0Var.f8911a;
        if (bLiveAbsData != null && x4s.b(bLiveAbsData.liveMode)) {
            return TextUtils.equals(crc0Var.f8921k, "manager") ? vwb.f0(new String[]{bLiveTemplateItem.url}) : vwb.f0(new String[0]);
        }
        if (crc0Var.f8912b != null) {
            Collection collection = (Collection) this.f10614a.e();
            String str = crc0Var.f8912b;
            Objects.requireNonNull(str);
            if (vwb.m(collection, new fkz(str))) {
                return vwb.f0(new String[]{bLiveTemplateItem.url});
            }
        }
        return vwb.f0(new String[0]);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "managerMedal";
    }
}
