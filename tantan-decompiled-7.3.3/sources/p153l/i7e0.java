package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.settings.privacy.PrivacySettingAct;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationExecuteAct;
import com.p051p1.mobile.putong.data.Settings;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class i7e0 extends o5e0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m138932e(jl80 jl80Var, String str) {
        jl80Var.dismiss();
        i4g0.m138520r("e_noverify_intention_button2", str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m138933f(String str, jl80 jl80Var) {
        i4g0.m138520r("e_noverify_failed_button2", str);
        jl80Var.dismiss();
        CoreModule.f18264c.f20294B0.m32622r4("cancelVerification");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m138935h(jl80 jl80Var, String str) {
        jl80Var.dismiss();
        i4g0.m138520r("e_noverify_familiar_button2", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m138936i(jl80 jl80Var, String str) {
        jl80Var.dismiss();
        i4g0.m138520r("e_noverify_privacy_button2", str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m138937j(abe0 abe0Var, String str, jl80 jl80Var) {
        abe0Var.m96739b().startActivity(PrivacySettingAct.m56856Z1(abe0Var.m96739b(), "other"));
        i4g0.m138520r("e_noverify_familiar_button1", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m138940m(abe0 abe0Var, String str, jl80 jl80Var) {
        Intent intentM51922q2 = ProfileAct.m51922q2(abe0Var.m96739b(), uqb0.f180396b0.f170324a.userId(), "edit_data_button", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        abe0Var.m96739b().startActivity(intentM51922q2);
        i4g0.m138520r("e_noverify_intention_button1", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m138942o(abe0 abe0Var, String str, jl80 jl80Var) {
        Act act = (Act) bnl0.m105506D(abe0Var.m96739b());
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        StudentVerificationStatus studentVerificationStatus = NullChecker.m82486a(verificationCenterM32615k4) ? verificationCenterM32615k4.ctdidVerificationInfo.status : null;
        if ((TEnum.equals(studentVerificationStatus, "unknown_") || TEnum.equals(studentVerificationStatus, "default") || TEnum.equals(studentVerificationStatus, "rejected") || TEnum.equals(studentVerificationStatus, "normal") || TEnum.equals(studentVerificationStatus, "invalid")) && NullChecker.m82486a(act)) {
            act.startActivity(VerificationExecuteAct.m57198b2(act, "verification_center"));
        }
        i4g0.m138520r("e_noverify_privacy_button1", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m138943p(abe0 abe0Var, String str, jl80 jl80Var) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (verificationCenterM32615k4 == null || !(TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, StudentVerificationStatus.prePending))) {
            nae0.m162083m(bnl0.m105506D(abe0Var.m96739b()), Uri.parse("tantan://verification/avatar"));
        } else {
            r1j0.m179420g("认证审核中，请耐心等待审核通过");
        }
        i4g0.m138520r("e_noverify_failed_button1", str);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static void m138944r(final abe0 abe0Var, String str) {
        final String str2 = "p_noverify_familiar_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_noverify_familiar_popup", g6e.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("noverify_source", str));
        final jl80 jl80VarM146020O = new jl80.C17971a(abe0Var.m96739b()).m146024S(gra.m131778z() ? dbc0.f86991fi : dbc0.f87354qk).m146021P(false).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146018M(false).m146056y0("屏蔽可能认识的人").m146051t0("你可以设置：\n屏蔽通讯录好友\n不被附近的人发现").m146033b0("去屏蔽可能认识的人").m146028W("取消").m146020O();
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.e7e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138937j(abe0Var, str2, jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.f7e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138935h(jl80VarM146020O, str2);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g7e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    @Override // p153l.o5e0
    /* JADX INFO: renamed from: a */
    public void mo95798a(abe0 abe0Var, z20<String, String> z20Var) {
        if (!gra.m131560E2()) {
            r1j0.m179420g("提交成功!");
            return;
        }
        String strReplaceFirst = abe0Var.m96744g().replaceFirst("/", "");
        String str = abe0Var.m96743f().get("source");
        Act act = (Act) bnl0.m105506D(abe0Var.m96739b());
        strReplaceFirst.getClass();
        switch (strReplaceFirst) {
            case "verification":
                m138947t(abe0Var, str);
                return;
            case "contacts":
                Settings settings = CoreModule.f18264c.f20381e0.m116600p9().settings;
                if (settings == null || !settings.hideContacts().booleanValue()) {
                    m138944r(abe0Var, str);
                    return;
                } else {
                    r1j0.m179420g("提交成功!");
                    return;
                }
            case "editprofile":
                if (aw90.m100565T(CoreModule.f18264c.f20381e0.m116600p9())) {
                    r1j0.m179420g("提交成功!");
                    return;
                } else {
                    m138946s(abe0Var, str);
                    return;
                }
            case "leak":
                VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
                StudentVerificationStatus studentVerificationStatus = NullChecker.m82486a(verificationCenterM32615k4) ? verificationCenterM32615k4.ctdidVerificationInfo.status : null;
                if (!TEnum.equals(studentVerificationStatus, "unknown_") && !TEnum.equals(studentVerificationStatus, "default") && !TEnum.equals(studentVerificationStatus, "rejected") && !TEnum.equals(studentVerificationStatus, "normal") && !TEnum.equals(studentVerificationStatus, "invalid")) {
                    r1j0.m179420g("提交成功!");
                    return;
                } else if (NullChecker.m82486a(act)) {
                    m138945q(abe0Var, str);
                    return;
                } else {
                    r1j0.m179420g("提交成功!");
                    return;
                }
            case "toast":
                i4g0.m138492A("e_noverify_theft_toast", act.pageId(), jyb.m147494Y("noverify_source", str));
                break;
        }
        r1j0.m179420g("提交成功!");
    }

    @Override // p153l.o5e0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo95799c(abe0 abe0Var, z20<String, String> z20Var) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m138945q(final abe0 abe0Var, String str) {
        final String str2 = "p_noverify_privacy_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_noverify_privacy_popup", g6e.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("noverify_source", str));
        ImageView imageView = new ImageView(abe0Var.m96739b());
        imageView.setAdjustViewBounds(true);
        imageView.setImageResource(dbc0.f87387rk);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        final jl80 jl80VarM146020O = new jl80.C17971a(abe0Var.m96739b()).m146023R(imageView).m146021P(false).m146018M(false).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146056y0("担心平台隐私泄露？\n去公安部 · 国家平台认证").m146033b0("去国家平台认证").m146028W("取消").m146020O();
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.w6e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138942o(abe0Var, str2, jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.z6e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138936i(jl80VarM146020O, str2);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.a7e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: s */
    public final void m138946s(final abe0 abe0Var, String str) {
        final String str2 = "p_noverify_intention_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_noverify_intention_popup", g6e.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("noverify_source", str));
        final jl80 jl80VarM146020O = new jl80.C17971a(abe0Var.m96739b()).m146024S(gra.m131778z() ? dbc0.f87024gi : dbc0.f87420sk).m146021P(false).m146018M(false).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146056y0("让我们多了解你一点").m146051t0("完善资料后你可以：\n优先推荐给他人，获得更多喜欢\n发出更多喜欢，获得更多配对").m146033b0("去完善资料").m146028W("取消").m146020O();
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.h7e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138940m(abe0Var, str2, jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.x6e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138932e(jl80VarM146020O, str2);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y6e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: t */
    public final void m138947t(final abe0 abe0Var, String str) {
        final String str2 = "p_noverify_failed_popup";
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_noverify_failed_popup", g6e.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("noverify_source", str));
        final jl80 jl80VarM146020O = new jl80.C17971a(abe0Var.m96739b()).m146024S(gra.m131778z() ? dbc0.f87057hi : dbc0.f87453tk).m146021P(false).m146018M(false).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146056y0("提升认证成功率").m146051t0("主头像使用本人清晰正面照，\n选择光线明亮的场景进行面部采集").m146033b0("再试一次").m146028W("取消").m146020O();
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.b7e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138943p(abe0Var, str2, jl80VarM146020O);
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.c7e0
            @Override // java.lang.Runnable
            public final void run() {
                i7e0.m138933f(str2, jl80VarM146020O);
            }
        });
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.d7e0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }
}
