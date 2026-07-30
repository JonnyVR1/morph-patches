package p006l;

import android.content.Intent;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.OriginalSMSAct;
import com.p1.mobile.account_core.reponse_data.RiskVerification;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.data.VerifyData;
import com.p1.mobile.putong.data.VerifyReason;
import java.util.Objects;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class c5d0 {

    /* JADX INFO: renamed from: l.c5d0$a */
    public interface InterfaceC0598a {
        /* JADX INFO: renamed from: a */
        void mo13185a(VerifyData verifyData);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m13182a(VerifyData verifyData, InterfaceC0598a interfaceC0598a, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        verifyData.verifyType = "up_link_sms";
        verifyData.code = 0;
        String stringExtra = intent != null ? intent.getStringExtra("extra_result_action") : null;
        if (stringExtra != null) {
            verifyData.action = VerifyReason.get(stringExtra);
        }
        interfaceC0598a.mo13185a(verifyData);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m13183b(Act act, RiskVerification riskVerification, VerifyData verifyData, InterfaceC0598a interfaceC0598a) {
        if (riskVerification != null && riskVerification.required) {
            Objects.toString(verifyData.action);
            m13184c(act, riskVerification, verifyData, interfaceC0598a);
            return true;
        }
        if (riskVerification == null) {
            return false;
        }
        new StringBuilder("required=").append(riskVerification.required);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m13184c(Act act, RiskVerification riskVerification, final VerifyData verifyData, final InterfaceC0598a interfaceC0598a) {
        VerifyReason verifyReason = verifyData.action;
        act.startActivityForResult(OriginalSMSAct.m570Y1(act, riskVerification.upCode, riskVerification.upReceiveNumber, riskVerification.expireSeconds, verifyData.countryCode, verifyData.mobileNumber, verifyReason != null ? verifyReason.toString() : "signup_signin"), new a.a() { // from class: l.b5d0
            /* JADX INFO: renamed from: a */
            public final boolean m12557a(int i, int i2, Intent intent) {
                return c5d0.m13182a(verifyData, interfaceC0598a, i, i2, intent);
            }
        });
    }
}
