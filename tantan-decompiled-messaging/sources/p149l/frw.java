package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes4.dex */
public class frw extends ir2 {

    /* JADX INFO: renamed from: a */
    public C22392a<ArrayList<String>> f99011a;

    public frw(C22392a<ArrayList<String>> c22392a) {
        this.f99011a = c22392a;
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (crc0Var == null) {
            return vwb.m200324f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = crc0Var.f82197a;
        if (bLiveAbsData != null && x4s.m207012b(bLiveAbsData.liveMode)) {
            return TextUtils.equals(crc0Var.f82207k, "manager") ? vwb.m200324f0(bLiveTemplateItem.url) : vwb.m200324f0(new String[0]);
        }
        if (crc0Var.f82198b != null) {
            ArrayList<String> arrayListM221515e = this.f99011a.m221515e();
            String str = crc0Var.f82198b;
            Objects.requireNonNull(str);
            if (vwb.m200337m(arrayListM221515e, new fkz(str))) {
                return vwb.m200324f0(bLiveTemplateItem.url);
            }
        }
        return vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m137817d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p149l.k4m
    public String getType() {
        return "managerMedal";
    }
}
