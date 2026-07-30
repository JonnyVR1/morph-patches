package p149l;

import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.data.OMSDialog;
import com.p046p1.mobile.putong.data.OMSPreCondition;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class dfc0 extends zuj0 {
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        boolean z;
        if (!rwk0.f161351a) {
            m220231b();
            return true;
        }
        OMSDialog oMSDialog = this.f204856a.f54231k.get(oMSAction);
        List<OMSPreCondition> list = oMSDialog.actions.get(0).preCondition;
        boolean zM200296J = vwb.m200296J(list);
        if (vwb.m200296J(list)) {
            z = true;
        } else {
            OMSPreCondition oMSPreCondition = list.get(0);
            if (new q25(this.f204856a, oMSPreCondition.f38795id, oMSPreCondition.type, oMSPreCondition.condition, oMSPreCondition.fail_content).mo162275a()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!zM200296J) {
            Map<String, String> map = oMSDialog.mercury.server;
            HashMap map2 = map == null ? new HashMap() : new HashMap(map);
            map2.put("is_checked", z ? "true" : "false");
            xc50.m208077g(oMSDialog.mercury.f38800id, this.f204856a.f54222b.mercury.f38800id, map2);
        }
        if (!z) {
            return true;
        }
        tvf.m190736n();
        tvf.m190731i(this.f204856a.f54221a, OMSTemplateType.dialog, false, false);
        m220231b();
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "realperson";
    }
}
