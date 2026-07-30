package p149l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class hvd0 extends kxd0 {
    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        StudentVerificationStatus studentVerificationStatus;
        if (w2e0Var.m201094b() instanceof Act) {
            Act act = (Act) w2e0Var.m201094b();
            VerificationCenter verificationCenterM31618q4 = CoreModule.f17545c.f19552B0.m31618q4();
            StudentVerificationStatus studentVerificationStatus2 = null;
            if (verificationCenterM31618q4 != null) {
                PicVerificationInfo picVerificationInfo = verificationCenterM31618q4.picVerificationInfo;
                StudentVerificationStatus studentVerificationStatus3 = picVerificationInfo != null ? picVerificationInfo.status : null;
                IdCardVerificationInfo idCardVerificationInfo = verificationCenterM31618q4.idCard;
                studentVerificationStatus = idCardVerificationInfo != null ? idCardVerificationInfo.status : null;
                studentVerificationStatus2 = studentVerificationStatus3;
            } else {
                studentVerificationStatus = null;
            }
            if ("identify".equals(w2e0Var.m201099g().replaceFirst("/", ""))) {
                m133161e(act, studentVerificationStatus, studentVerificationStatus2);
            } else {
                m133162f(act, studentVerificationStatus2);
            }
        }
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m133161e(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                lsi0.m151595y("认证审核中，请稍后再试");
                return;
            } else {
                qp4.m175808n(act);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus2, "verified")) {
            lsi0.m151595y("已认证成功");
        } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
            lsi0.m151595y("认证审核中，请稍后再试");
        } else {
            if (rwk0.m181430m(act, 1, "verification_center")) {
                return;
            }
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m133162f(Act act, StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            lsi0.m151595y("认证审核中，请稍后再试");
        } else if (TEnum.equals(studentVerificationStatus, "verified")) {
            lsi0.m151595y("已认证成功");
        } else {
            qp4.m175809o(act);
        }
    }
}
