package p149l;

import android.content.Intent;
import com.p046p1.mobile.account_core.reponse_data.RiskVerification;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.OriginalSMSAct;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class c5d0 {

    /* JADX INFO: renamed from: l.c5d0$a */
    public interface InterfaceC16073a {
        /* JADX INFO: renamed from: a */
        void mo105292a(VerifyData verifyData);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m105289a(VerifyData verifyData, InterfaceC16073a interfaceC16073a, int i, int i2, Intent intent) {
        if (i2 != -1) {
            return false;
        }
        verifyData.verifyType = "up_link_sms";
        verifyData.code = 0;
        String stringExtra = intent != null ? intent.getStringExtra("extra_result_action") : null;
        if (stringExtra != null) {
            verifyData.action = VerifyReason.get(stringExtra);
        }
        interfaceC16073a.mo105292a(verifyData);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m105290b(Act act, RiskVerification riskVerification, VerifyData verifyData, InterfaceC16073a interfaceC16073a) {
        if (riskVerification != null && riskVerification.required) {
            Objects.toString(verifyData.action);
            m105291c(act, riskVerification, verifyData, interfaceC16073a);
            return true;
        }
        if (riskVerification == null) {
            return false;
        }
        new StringBuilder("required=").append(riskVerification.required);
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static void m105291c(Act act, RiskVerification riskVerification, final VerifyData verifyData, final InterfaceC16073a interfaceC16073a) {
        VerifyReason verifyReason = verifyData.action;
        act.startActivityForResult(OriginalSMSAct.m28671Y1(act, riskVerification.upCode, riskVerification.upReceiveNumber, riskVerification.expireSeconds, verifyData.countryCode, verifyData.mobileNumber, verifyReason != null ? verifyReason.toString() : VerifyReason.signup_signin), new C4317a.a() { // from class: l.b5d0
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return c5d0.m105289a(verifyData, interfaceC16073a, i, i2, intent);
            }
        });
    }
}
