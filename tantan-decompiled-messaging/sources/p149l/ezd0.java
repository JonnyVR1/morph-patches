package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.settings.privacy.PrivacySettingAct;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationExecuteAct;
import com.p046p1.mobile.putong.data.Settings;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes9.dex */
public class ezd0 extends kxd0 {
    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m118927e(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.m220396r("e_noverify_intention_button2", str);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m118928f(String str, dd80 dd80Var) {
        zvf0.m220396r("e_noverify_failed_button2", str);
        dd80Var.dismiss();
        CoreModule.f17545c.f19552B0.m31619r4("cancelVerification");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m118930h(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.m220396r("e_noverify_familiar_button2", str);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m118931i(dd80 dd80Var, String str) {
        dd80Var.dismiss();
        zvf0.m220396r("e_noverify_privacy_button2", str);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m118932j(w2e0 w2e0Var, String str, dd80 dd80Var) {
        w2e0Var.m201094b().startActivity(PrivacySettingAct.m55673Y1(w2e0Var.m201094b(), "other"));
        zvf0.m220396r("e_noverify_familiar_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m118935m(w2e0 w2e0Var, String str, dd80 dd80Var) {
        Intent intentM50738p2 = ProfileAct.m50738p2(w2e0Var.m201094b(), qib0.f154713b0.f139230a.userId(), "edit_data_button", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        w2e0Var.m201094b().startActivity(intentM50738p2);
        zvf0.m220396r("e_noverify_intention_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m118937o(w2e0 w2e0Var, String str, dd80 dd80Var) {
        Act act = (Act) xdl0.m208326D(w2e0Var.m201094b());
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        StudentVerificationStatus studentVerificationStatus = NullChecker.m81303a(verificationCenterM31612k4) ? verificationCenterM31612k4.ctdidVerificationInfo.status : null;
        if ((TEnum.equals(studentVerificationStatus, "unknown_") || TEnum.equals(studentVerificationStatus, "default") || TEnum.equals(studentVerificationStatus, "rejected") || TEnum.equals(studentVerificationStatus, "normal") || TEnum.equals(studentVerificationStatus, "invalid")) && NullChecker.m81303a(act)) {
            act.startActivity(VerificationExecuteAct.m56015a2(act, "verification_center"));
        }
        zvf0.m220396r("e_noverify_privacy_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m118938p(w2e0 w2e0Var, String str, dd80 dd80Var) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (verificationCenterM31612k4 == null || !(TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, StudentVerificationStatus.prePending))) {
            j2e0.m139446m(xdl0.m208326D(w2e0Var.m201094b()), Uri.parse("tantan://verification/avatar"));
        } else {
            osi0.m165783g("认证审核中，请耐心等待审核通过");
        }
        zvf0.m220396r("e_noverify_failed_button1", str);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: r */
    public static void m118939r(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_familiar_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_noverify_familiar_popup", s4e.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("noverify_source", str));
        final dd80 dd80VarM110960O = new dd80.C16336a(w2e0Var.m201094b()).m110964S(upa.m194847z() ? x2c0.f190524rh : x2c0.f189237Cj).m110961P(false).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110958M(false).m110996y0("屏蔽可能认识的人").m110991t0("你可以设置：\n屏蔽通讯录好友\n不被附近的人发现").m110973b0("去屏蔽可能认识的人").m110968W("取消").m110960O();
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.azd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118932j(w2e0Var, str2, dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.bzd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118930h(dd80VarM110960O, str2);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.czd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // p149l.kxd0
    /* JADX INFO: renamed from: a */
    public void mo94421a(w2e0 w2e0Var, f30<String, String> f30Var) {
        if (!upa.m194629E2()) {
            osi0.m165783g("提交成功!");
            return;
        }
        String strReplaceFirst = w2e0Var.m201099g().replaceFirst("/", "");
        String str = w2e0Var.m201098f().get("source");
        Act act = (Act) xdl0.m208326D(w2e0Var.m201094b());
        strReplaceFirst.getClass();
        switch (strReplaceFirst) {
            case "verification":
                m118942t(w2e0Var, str);
                return;
            case "contacts":
                Settings settings = CoreModule.f17545c.f19639e0.m169527p9().settings;
                if (settings == null || !settings.hideContacts().booleanValue()) {
                    m118939r(w2e0Var, str);
                    return;
                } else {
                    osi0.m165783g("提交成功!");
                    return;
                }
            case "editprofile":
                if (wn90.m204605T(CoreModule.f17545c.f19639e0.m169527p9())) {
                    osi0.m165783g("提交成功!");
                    return;
                } else {
                    m118941s(w2e0Var, str);
                    return;
                }
            case "leak":
                VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
                StudentVerificationStatus studentVerificationStatus = NullChecker.m81303a(verificationCenterM31612k4) ? verificationCenterM31612k4.ctdidVerificationInfo.status : null;
                if (!TEnum.equals(studentVerificationStatus, "unknown_") && !TEnum.equals(studentVerificationStatus, "default") && !TEnum.equals(studentVerificationStatus, "rejected") && !TEnum.equals(studentVerificationStatus, "normal") && !TEnum.equals(studentVerificationStatus, "invalid")) {
                    osi0.m165783g("提交成功!");
                    return;
                } else if (NullChecker.m81303a(act)) {
                    m118940q(w2e0Var, str);
                    return;
                } else {
                    osi0.m165783g("提交成功!");
                    return;
                }
            case "toast":
                zvf0.m220368A("e_noverify_theft_toast", act.pageId(), vwb.m200311Y("noverify_source", str));
                break;
        }
        osi0.m165783g("提交成功!");
    }

    @Override // p149l.kxd0
    @Nullable
    /* JADX INFO: renamed from: c */
    public Intent mo94422c(w2e0 w2e0Var, f30<String, String> f30Var) {
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m118940q(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_privacy_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_noverify_privacy_popup", s4e.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("noverify_source", str));
        ImageView imageView = new ImageView(w2e0Var.m201094b());
        imageView.setAdjustViewBounds(true);
        imageView.setImageResource(x2c0.f189269Dj);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        final dd80 dd80VarM110960O = new dd80.C16336a(w2e0Var.m201094b()).m110963R(imageView).m110961P(false).m110958M(false).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110996y0("担心平台隐私泄露？\n去公安部 · 国家平台认证").m110973b0("去国家平台认证").m110968W("取消").m110960O();
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.syd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118937o(w2e0Var, str2, dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.vyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118931i(dd80VarM110960O, str2);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.wyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: s */
    public final void m118941s(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_intention_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_noverify_intention_popup", s4e.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("noverify_source", str));
        final dd80 dd80VarM110960O = new dd80.C16336a(w2e0Var.m201094b()).m110964S(upa.m194847z() ? x2c0.f190556sh : x2c0.f189301Ej).m110961P(false).m110958M(false).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110996y0("让我们多了解你一点").m110991t0("完善资料后你可以：\n优先推荐给他人，获得更多喜欢\n发出更多喜欢，获得更多配对").m110973b0("去完善资料").m110968W("取消").m110960O();
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.dzd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118935m(w2e0Var, str2, dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.tyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118927e(dd80VarM110960O, str2);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.uyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: t */
    public final void m118942t(final w2e0 w2e0Var, String str) {
        final String str2 = "p_noverify_failed_popup";
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_noverify_failed_popup", s4e.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("noverify_source", str));
        final dd80 dd80VarM110960O = new dd80.C16336a(w2e0Var.m201094b()).m110964S(upa.m194847z() ? x2c0.f190588th : x2c0.f189333Fj).m110961P(false).m110958M(false).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110996y0("提升认证成功率").m110991t0("主头像使用本人清晰正面照，\n选择光线明亮的场景进行面部采集").m110973b0("再试一次").m110968W("取消").m110960O();
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.xyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118938p(w2e0Var, str2, dd80VarM110960O);
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.yyd0
            @Override // java.lang.Runnable
            public final void run() {
                ezd0.m118928f(str2, dd80VarM110960O);
            }
        });
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zyd0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }
}
