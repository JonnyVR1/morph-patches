package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.IntroductionAct;
import com.p051p1.mobile.putong.data.OMSAction;
import com.p051p1.mobile.putong.data.OMSDialog;
import com.p051p1.mobile.putong.data.OMSPreCondition;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ssy extends c4k0 {
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    @Override // p153l.c4k0
    /* JADX INFO: renamed from: c */
    public boolean mo106291c(OMSAction oMSAction) {
        boolean z;
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
        if (CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue()) {
            hxf.m137584e(this.f79710a.f55069a, OMSTemplateType.dialog, false);
        } else if (CoreModule.f18264c.f20294B0.m32616l4().f152157b.booleanValue()) {
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard) && TEnum.equals(verificationCenterM32615k4.idCard.status, "invalid")) {
                Act act = this.f79710a.f55069a;
                act.startActivity(VerificationCenterAct.m57174Y1(act, false));
            } else {
                this.f79710a.f55069a.startActivity(IntroductionAct.m57251X1(this.f79710a.f55069a, "tantan_verification"));
            }
        }
        if ((!this.f79710a.f55070b.identifier.equals(OmsDialog.p_verification_merge_popup.getIdentifier()) && !this.f79710a.f55070b.identifier.equals(OmsDialog.p_verification_center_policy_popup)) || !CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue()) {
            m107886b();
        }
        return true;
    }

    @Override // p153l.c4k0
    /* JADX INFO: renamed from: d */
    public String mo106292d() {
        return "merge_verification";
    }
}
