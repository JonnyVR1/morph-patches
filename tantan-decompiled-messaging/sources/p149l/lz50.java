package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.data.Owner;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lz50 extends ir2 {
    @Override // p149l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo103901b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (crc0Var == null) {
            return vwb.m200324f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = crc0Var.f82197a;
        if (bLiveAbsData == null || !x4s.m207012b(bLiveAbsData.liveMode)) {
            return crc0Var.m108353a() ? vwb.m200324f0(bLiveTemplateItem.url) : vwb.m200324f0(new String[0]);
        }
        return TextUtils.equals(crc0Var.f82207k, Owner.TYPE) ? vwb.m200324f0(bLiveTemplateItem.url) : vwb.m200324f0(new String[0]);
    }

    @Override // p149l.ir2
    /* JADX INFO: renamed from: f */
    public void mo103903f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m137817d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p149l.k4m
    public String getType() {
        return "ownerMedal";
    }
}
