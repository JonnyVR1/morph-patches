package p153l;

import android.content.Intent;
import com.p051p1.mobile.account_core.reponse_data.RiskVerification;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.OriginalSMSAct;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class fdd0 {

    /* JADX INFO: renamed from: l.fdd0$a */
    public interface InterfaceC16952a {
        /* JADX INFO: renamed from: a */
        void mo114913a(VerifyData verifyData);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m125083a(VerifyData verifyData, InterfaceC16952a interfaceC16952a, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        verifyData.verifyType = "up_link_sms";
        verifyData.code = 0;
        String stringExtra = intent != null ? intent.getStringExtra("extra_result_action") : null;
        if (stringExtra != null) {
            verifyData.action = VerifyReason.get(stringExtra);
        }
        interfaceC16952a.mo114913a(verifyData);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m125084b(Act act, RiskVerification riskVerification, VerifyData verifyData, InterfaceC16952a interfaceC16952a) {
        if (riskVerification != null && riskVerification.required) {
            Objects.toString(verifyData.action);
            m125085c(act, riskVerification, verifyData, interfaceC16952a);
            return true;
        }
        if (riskVerification == null) {
            return false;
        }
        new StringBuilder("required=").append(riskVerification.required);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m125085c(Act act, RiskVerification riskVerification, final VerifyData verifyData, final InterfaceC16952a interfaceC16952a) {
        VerifyReason verifyReason = verifyData.action;
        act.startActivityForResult(OriginalSMSAct.m29670Z1(act, riskVerification.upCode, riskVerification.upReceiveNumber, riskVerification.expireSeconds, verifyData.countryCode, verifyData.mobileNumber, verifyReason != null ? verifyReason.toString() : VerifyReason.signup_signin), new C4468a.a() { // from class: l.edd0
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return fdd0.m125083a(verifyData, interfaceC16952a, i, i2, intent);
            }
        });
    }
}
