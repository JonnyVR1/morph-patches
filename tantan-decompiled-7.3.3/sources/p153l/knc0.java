package p153l;

import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSPreCondition;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class knc0 extends c4k0 {
    /* JADX WARN: Code duplicated, block: B:11:0x0045  */
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        boolean z;
        if (!x5l0.f192502a) {
            m107886b();
            return true;
        }
        OMSDialog oMSDialog = this.f79710a.f55079k.get(oMSAction);
        List<OMSPreCondition> list = oMSDialog.actions.get(0).preCondition;
        boolean zM147479J = jyb.m147479J(list);
        if (jyb.m147479J(list)) {
            z = true;
        } else {
            OMSPreCondition oMSPreCondition = list.get(0);
            if (new p35(this.f79710a, oMSPreCondition.f39643id, oMSPreCondition.type, oMSPreCondition.condition, oMSPreCondition.fail_content).mo165685a()) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!zM147479J) {
            Map<String, String> map = oMSDialog.mercury.server;
            HashMap map2 = map == null ? new HashMap() : new HashMap(map);
            map2.put("is_checked", z ? "true" : "false");
            el50.m121104g(oMSDialog.mercury.f39648id, this.f79710a.f55070b.mercury.f39648id, map2);
        }
        if (!z) {
            return true;
        }
        hxf.m137593n();
        hxf.m137588i(this.f79710a.f55069a, OMSTemplateType.dialog, false, false);
        m107886b();
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "realperson";
    }
}
