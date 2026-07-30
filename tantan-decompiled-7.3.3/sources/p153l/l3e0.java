package p153l;

import android.content.Intent;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class l3e0 extends o5e0 {
    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        StudentVerificationStatus studentVerificationStatus;
        if (abe0Var.m96739b() instanceof Act) {
            Act act = (Act) abe0Var.m96739b();
            VerificationCenter verificationCenterM32621q4 = CoreModule.f18264c.f20294B0.m32621q4();
            StudentVerificationStatus studentVerificationStatus2 = null;
            if (verificationCenterM32621q4 != null) {
                PicVerificationInfo picVerificationInfo = verificationCenterM32621q4.picVerificationInfo;
                StudentVerificationStatus studentVerificationStatus3 = picVerificationInfo != null ? picVerificationInfo.status : null;
                IdCardVerificationInfo idCardVerificationInfo = verificationCenterM32621q4.idCard;
                studentVerificationStatus = idCardVerificationInfo != null ? idCardVerificationInfo.status : null;
                studentVerificationStatus2 = studentVerificationStatus3;
            } else {
                studentVerificationStatus = null;
            }
            if ("identify".equals(abe0Var.m96744g().replaceFirst("/", ""))) {
                m152692e(act, studentVerificationStatus, studentVerificationStatus2);
            } else {
                m152693f(act, studentVerificationStatus2);
            }
        }
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final void m152692e(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (!TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus, "pending")) {
                o1j0.m165651y("认证审核中，请稍后再试");
                return;
            } else {
                pq4.m173306n(act);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus2, "verified")) {
            o1j0.m165651y("已认证成功");
        } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
            o1j0.m165651y("认证审核中，请稍后再试");
        } else {
            if (x5l0.m209400m(act, 1, "verification_center")) {
                return;
            }
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m152693f(Act act, StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            o1j0.m165651y("认证审核中，请稍后再试");
        } else if (TEnum.equals(studentVerificationStatus, "verified")) {
            o1j0.m165651y("已认证成功");
        } else {
            pq4.m173307o(act);
        }
    }
}
