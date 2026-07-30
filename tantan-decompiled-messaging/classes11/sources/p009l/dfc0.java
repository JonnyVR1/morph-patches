package p009l;

import com.p1.mobile.putong.data.OMSAction;
import com.p1.mobile.putong.data.OMSDialog;
import com.p1.mobile.putong.data.OMSPreCondition;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.rwk0;
import l.tvf;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dfc0 extends zuj0 {
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        boolean z;
        if (!rwk0.a) {
            m25982b();
            return true;
        }
        OMSDialog oMSDialog = this.f23916a.f7837k.get(oMSAction);
        List list = ((OMSAction) oMSDialog.actions.get(0)).preCondition;
        boolean zJ = vwb.J(list);
        if (vwb.J(list)) {
            z = true;
        } else {
            OMSPreCondition oMSPreCondition = (OMSPreCondition) list.get(0);
            if (new q25(this.f23916a, oMSPreCondition.id, oMSPreCondition.type, oMSPreCondition.condition, oMSPreCondition.fail_content).mo19604a()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!zJ) {
            Map map = oMSDialog.mercury.server;
            HashMap map2 = map == null ? new HashMap() : new HashMap(map);
            map2.put("is_checked", z ? "true" : "false");
            xc50.m24773g(oMSDialog.mercury.id, this.f23916a.f7828b.mercury.id, map2);
        }
        if (!z) {
            return true;
        }
        tvf.n();
        tvf.i(this.f23916a.f7827a, "dialog", false, false);
        m25982b();
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "realperson";
    }
}
