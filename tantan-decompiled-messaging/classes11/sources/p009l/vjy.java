package p009l;

import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.core.ui.verification.national.IntroductionAct;
import com.p1.mobile.putong.data.OMSAction;
import com.p1.mobile.putong.data.OMSDialog;
import com.p1.mobile.putong.data.OMSPreCondition;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.tvf;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vjy extends zuj0 {
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    @Override // p009l.zuj0
    /* JADX INFO: renamed from: c */
    public boolean mo11784c(OMSAction oMSAction) {
        boolean z;
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
        if (((Boolean) CoreModule.c.B0.l4().a).booleanValue()) {
            tvf.e(this.f23916a.f7827a, "dialog", false);
        } else if (((Boolean) CoreModule.c.B0.l4().b).booleanValue()) {
            VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
            if (NullChecker.a(verificationCenterK4) && NullChecker.a(verificationCenterK4.idCard) && TEnum.equals(verificationCenterK4.idCard.status, "invalid")) {
                Act act = this.f23916a.f7827a;
                act.startActivity(VerificationCenterAct.X1(act, false));
            } else {
                this.f23916a.f7827a.startActivity(IntroductionAct.V1(this.f23916a.f7827a, "tantan_verification"));
            }
        }
        if ((!this.f23916a.f7828b.identifier.equals(OmsDialog.p_verification_merge_popup.getIdentifier()) && !this.f23916a.f7828b.identifier.equals(OmsDialog.p_verification_center_policy_popup)) || !((Boolean) CoreModule.c.B0.l4().a).booleanValue()) {
            m25982b();
        }
        return true;
    }

    @Override // p009l.zuj0
    /* JADX INFO: renamed from: d */
    public String mo11785d() {
        return "merge_verification";
    }
}
