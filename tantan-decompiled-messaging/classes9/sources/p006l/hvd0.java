package p006l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.f30;
import l.ic50;
import l.lsi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hvd0 extends kxd0 {
    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        StudentVerificationStatus studentVerificationStatus;
        if (w2e0Var.m26156b() instanceof Act) {
            Act act = (Act) w2e0Var.m26156b();
            VerificationCenter verificationCenterM3548q4 = CoreModule.f1534c.f3541B0.m3548q4();
            StudentVerificationStatus studentVerificationStatus2 = null;
            if (verificationCenterM3548q4 != null) {
                PicVerificationInfo picVerificationInfo = verificationCenterM3548q4.picVerificationInfo;
                StudentVerificationStatus studentVerificationStatus3 = picVerificationInfo != null ? picVerificationInfo.status : null;
                IdCardVerificationInfo idCardVerificationInfo = verificationCenterM3548q4.idCard;
                studentVerificationStatus = idCardVerificationInfo != null ? idCardVerificationInfo.status : null;
                studentVerificationStatus2 = studentVerificationStatus3;
            } else {
                studentVerificationStatus = null;
            }
            if ("identify".equals(w2e0Var.m26161g().replaceFirst("/", ""))) {
                m16388e(act, studentVerificationStatus, studentVerificationStatus2);
            } else {
                m16389f(act, studentVerificationStatus2);
            }
        }
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m16388e(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                lsi0.y("认证审核中，请稍后再试");
                return;
            } else {
                qp4.m22311n(act);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus2, "verified")) {
            lsi0.y("已认证成功");
        } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
            lsi0.y("认证审核中，请稍后再试");
        } else {
            if (rwk0.m23354m(act, 1, "verification_center")) {
                return;
            }
            ic50.j().f().s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m16389f(Act act, StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            lsi0.y("认证审核中，请稍后再试");
        } else if (TEnum.equals(studentVerificationStatus, "verified")) {
            lsi0.y("已认证成功");
        } else {
            qp4.m22312o(act);
        }
    }
}
