package p002l;

import android.text.TextUtils;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveTemplateItem;
import java.util.List;
import l.vwb;
import l.x4s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lz50 extends ir2 {
    @Override // p002l.ir2
    /* JADX INFO: renamed from: b */
    public List<String> mo10622b(BLiveTemplateItem bLiveTemplateItem, Template.TemplateData templateData, crc0 crc0Var) {
        if (crc0Var == null) {
            return vwb.f0(new String[0]);
        }
        BLiveAbsData bLiveAbsData = crc0Var.f8911a;
        if (bLiveAbsData == null || !x4s.b(bLiveAbsData.liveMode)) {
            return crc0Var.m11341a() ? vwb.f0(new String[]{bLiveTemplateItem.url}) : vwb.f0(new String[0]);
        }
        return TextUtils.equals(crc0Var.f8921k, "owner") ? vwb.f0(new String[]{bLiveTemplateItem.url}) : vwb.f0(new String[0]);
    }

    @Override // p002l.ir2
    /* JADX INFO: renamed from: f */
    public void mo10624f(jmf0 jmf0Var, BLiveTemplateItem bLiveTemplateItem, List<String> list, crc0 crc0Var) {
        m15310d(jmf0Var, bLiveTemplateItem, list.get(0));
    }

    @Override // p002l.k4m
    public String getType() {
        return "ownerMedal";
    }
}
