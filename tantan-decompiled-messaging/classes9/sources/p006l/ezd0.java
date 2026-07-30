package p006l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.privacy.PrivacySettingAct;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationExecuteAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.Settings;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.dd80;
import l.f30;
import l.i0e;
import l.j760;
import l.osi0;
import l.s4e;
import l.vwb;
import l.wn90;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ezd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14964e(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.r("e_noverify_intention_button2", str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m14965f(String str, dd80 dd80Var) {
        zvf0.r("e_noverify_failed_button2", str);
        dd80Var.dismiss();
        CoreModule.f1534c.f3541B0.m3549r4("cancelVerification");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m14967h(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.r("e_noverify_familiar_button2", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m14968i(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.r("e_noverify_privacy_button2", str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m14969j(w2e0 w2e0Var, String str, dd80 dd80Var) {
        w2e0Var.m26156b().startActivity(PrivacySettingAct.m9070Y1(w2e0Var.m26156b(), "other"));
        zvf0.r("e_noverify_familiar_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m14972m(w2e0 w2e0Var, String str, dd80 dd80Var) {
        Intent intentP2 = ProfileAct.p2(w2e0Var.m26156b(), qib0.f19804b0.f17706a.userId(), "edit_data_button", false, true);
        intentP2.putExtra("preview_type", 0);
        w2e0Var.m26156b().startActivity(intentP2);
        zvf0.r("e_noverify_intention_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m14974o(w2e0 w2e0Var, String str, dd80 dd80Var) {
        Act actD = xdl0.D(w2e0Var.m26156b());
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        StudentVerificationStatus studentVerificationStatus = NullChecker.a(verificationCenterM3542k4) ? verificationCenterM3542k4.ctdidVerificationInfo.status : null;
        if ((TEnum.equals(studentVerificationStatus, "unknown_") || TEnum.equals(studentVerificationStatus, CameraSticker.CATEGORY_DEFAULT_FILTER) || TEnum.equals(studentVerificationStatus, "rejected") || TEnum.equals(studentVerificationStatus, "normal") || TEnum.equals(studentVerificationStatus, "invalid")) && NullChecker.a(actD)) {
            actD.startActivity(VerificationExecuteAct.m9438a2(actD, "verification_center"));
        }
        zvf0.r("e_noverify_privacy_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m14975p(w2e0 w2e0Var, String str, dd80 dd80Var) {
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        if (verificationCenterM3542k4 == null || !(TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "prePending"))) {
            j2e0.m17248m(xdl0.D(w2e0Var.m26156b()), Uri.parse("tantan://verification/avatar"));
        } else {
            osi0.g("认证审核中，请耐心等待审核通过");
        }
        zvf0.r("e_noverify_failed_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static void m14976r(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_familiar_popup";
        final cwf0 cwf0VarC = i0e.c("p_noverify_familiar_popup", s4e.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("noverify_source", str)});
        final dd80 dd80VarO = new dd80.a(w2e0Var.m26156b()).S(upa.m25545z() ? x2c0.f27060rh : x2c0.f25773Cj).P(false).d0(upa.m25545z() ? x2c0.f26191Q : -1).M(false).y0("屏蔽可能认识的人").t0("你可以设置：\n屏蔽通讯录好友\n不被附近的人发现").b0("去屏蔽可能认识的人").W("取消").O();
        dd80VarO.W(new Runnable() { // from class: l.azd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14969j(w2e0Var, str2, dd80VarO);
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.bzd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14967h(dd80VarO, str2);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.czd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }

    @Override // p006l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo11681a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!upa.m25327E2()) {
            osi0.g("提交成功!");
            return;
        }
        String strReplaceFirst = w2e0Var.m26161g().replaceFirst("/", "");
        String str = w2e0Var.m26160f().get("source");
        Act actD = xdl0.D(w2e0Var.m26156b());
        strReplaceFirst.getClass();
        switch (strReplaceFirst) {
            case "verification":
                m14979t(w2e0Var, str);
                return;
            case "contacts":
                Settings settings = CoreModule.f1534c.f3628e0.m21490p9().settings;
                if (settings == null || !settings.hideContacts().booleanValue()) {
                    m14976r(w2e0Var, str);
                    return;
                } else {
                    osi0.g("提交成功!");
                    return;
                }
            case "editprofile":
                if (wn90.T(CoreModule.f1534c.f3628e0.m21490p9())) {
                    osi0.g("提交成功!");
                    return;
                } else {
                    m14978s(w2e0Var, str);
                    return;
                }
            case "leak":
                VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
                StudentVerificationStatus studentVerificationStatus = NullChecker.a(verificationCenterM3542k4) ? verificationCenterM3542k4.ctdidVerificationInfo.status : null;
                if (!TEnum.equals(studentVerificationStatus, "unknown_") && !TEnum.equals(studentVerificationStatus, CameraSticker.CATEGORY_DEFAULT_FILTER) && !TEnum.equals(studentVerificationStatus, "rejected") && !TEnum.equals(studentVerificationStatus, "normal") && !TEnum.equals(studentVerificationStatus, "invalid")) {
                    osi0.g("提交成功!");
                    return;
                } else if (NullChecker.a(actD)) {
                    m14977q(w2e0Var, str);
                    return;
                } else {
                    osi0.g("提交成功!");
                    return;
                }
            case "toast":
                zvf0.A("e_noverify_theft_toast", actD.pageId(), new j760[]{vwb.Y("noverify_source", str)});
                break;
        }
        osi0.g("提交成功!");
    }

    @Override // p006l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo11682c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m14977q(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_privacy_popup";
        final cwf0 cwf0VarC = i0e.c("p_noverify_privacy_popup", s4e.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("noverify_source", str)});
        ImageView imageView = new ImageView(w2e0Var.m26156b());
        imageView.setAdjustViewBounds(true);
        imageView.setImageResource(x2c0.f25805Dj);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        final dd80 dd80VarO = new dd80.a(w2e0Var.m26156b()).R(imageView).P(false).M(false).d0(upa.m25545z() ? x2c0.f26191Q : -1).y0("担心平台隐私泄露？\n去公安部 · 国家平台认证").b0("去国家平台认证").W("取消").O();
        dd80VarO.W(new Runnable() { // from class: l.syd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14974o(w2e0Var, str2, dd80VarO);
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.vyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14968i(dd80VarO, str2);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: s */
    public final void m14978s(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_intention_popup";
        final cwf0 cwf0VarC = i0e.c("p_noverify_intention_popup", s4e.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("noverify_source", str)});
        final dd80 dd80VarO = new dd80.a(w2e0Var.m26156b()).S(upa.m25545z() ? x2c0.f27092sh : x2c0.f25837Ej).P(false).M(false).d0(upa.m25545z() ? x2c0.f26191Q : -1).y0("让我们多了解你一点").t0("完善资料后你可以：\n优先推荐给他人，获得更多喜欢\n发出更多喜欢，获得更多配对").b0("去完善资料").W("取消").O();
        dd80VarO.W(new Runnable() { // from class: l.dzd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14972m(w2e0Var, str2, dd80VarO);
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.tyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14964e(dd80VarO, str2);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: t */
    public final void m14979t(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_failed_popup";
        final cwf0 cwf0VarC = i0e.c("p_noverify_failed_popup", s4e.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("noverify_source", str)});
        final dd80 dd80VarO = new dd80.a(w2e0Var.m26156b()).S(upa.m25545z() ? x2c0.f27124th : x2c0.f25869Fj).P(false).M(false).d0(upa.m25545z() ? x2c0.f26191Q : -1).y0("提升认证成功率").t0("主头像使用本人清晰正面照，\n选择光线明亮的场景进行面部采集").b0("再试一次").W("取消").O();
        dd80VarO.W(new Runnable() { // from class: l.xyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14975p(w2e0Var, str2, dd80VarO);
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.yyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m14965f(str2, dd80VarO);
            }
        });
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }
}
