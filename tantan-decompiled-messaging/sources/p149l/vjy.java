package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.IntroductionAct;
import com.p046p1.mobile.putong.data.OMSAction;
import com.p046p1.mobile.putong.data.OMSDialog;
import com.p046p1.mobile.putong.data.OMSPreCondition;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vjy extends zuj0 {
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    @Override // p149l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo99645c(OMSAction oMSAction) {
        boolean z;
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
        if (CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue()) {
            tvf.m190727e(this.f204856a.f54221a, OMSTemplateType.dialog, false);
        } else if (CoreModule.f17545c.f19552B0.m31613l4().f116565b.booleanValue()) {
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard) && TEnum.equals(verificationCenterM31612k4.idCard.status, "invalid")) {
                Act act = this.f204856a.f54221a;
                act.startActivity(VerificationCenterAct.m55991X1(act, false));
            } else {
                this.f204856a.f54221a.startActivity(IntroductionAct.m56068V1(this.f204856a.f54221a, "tantan_verification"));
            }
        }
        if ((!this.f204856a.f54222b.identifier.equals(OmsDialog.p_verification_merge_popup.getIdentifier()) && !this.f204856a.f54222b.identifier.equals(OmsDialog.p_verification_center_policy_popup)) || !CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue()) {
            m220231b();
        }
        return true;
    }

    @Override // p149l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo99646d() {
        return "merge_verification";
    }
}
