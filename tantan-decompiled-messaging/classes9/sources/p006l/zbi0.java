package p006l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.VerificationCenterAct;
import com.p000p1.mobile.putong.core.p004ui.verification.national.IntroductionAct;
import com.p000p1.mobile.putong.core.p004ui.verification.national.NationalIdAuthAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.dlg.CoreDlg;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.i0e;
import l.ic50;
import l.j760;
import l.jo0;
import l.lsi0;
import l.mkd0;
import l.o7r;
import l.oyx;
import l.roj0;
import l.t100;
import l.u4e;
import l.vi90;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class zbi0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m28643A(Dialog dialog, Act act, roj0 roj0Var) {
        dialog.dismiss();
        CoreDlg.E1(act, "审核中", "你已提交了认证照片，请耐心等待审核结果", x2c0.f27190vj, "好的", (d30) null, false, (String) null, (d30) null, (d30) null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m28644B(Act act) {
        p420.m21031o(act);
        zvf0.r("e_id_verification_reverify_confirm_re_click", "p_id_verification_fail_guide");
    }

    /* JADX INFO: renamed from: C */
    public static void m28645C(Act act) {
        if (TEnum.equals(CoreModule.f1534c.f3541B0.m3550s4(), "pending")) {
            CoreDlg.E1(act, act.getString(R$string.f1853Jr), act.getString(R$string.f1823Ir), x2c0.f27190vj, act.getString(R$string.f3065xr), (d30) null, false, (String) null, (d30) null, (d30) null);
        } else {
            tvf.m24829h(act, "dialog");
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m28646D(Context context) {
        context.startActivity(IntroductionAct.m9493V1(context, "tantan_verification"));
    }

    /* JADX INFO: renamed from: E */
    public static void m28647E(Context context) {
        m28648F(context, false);
    }

    /* JADX INFO: renamed from: F */
    public static void m28648F(Context context, boolean z) {
        Intent intentM9497V1 = NationalIdAuthAct.m9497V1(context, "tantan_verification");
        NationalIdAuthAct.m9499Y1(intentM9497V1, z);
        context.startActivity(intentM9497V1);
    }

    /* JADX INFO: renamed from: G */
    public static void m28649G(final Act act, boolean z, boolean z2, Picture picture, final VerificationCenter verificationCenter) {
        final Dialog dialogZ = null;
        View viewInflate = act.inflater().inflate(f6c0.f12365pe, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.f22889Z5);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f22610I9);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f22781Sa);
        Dialog.e eVarB = act.dialog().v().r0("*这张照片仅用于认证，其它用户不可见").P(viewInflate, false).q(false).B(false);
        if (z) {
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            dialogZ = eVarB.G0("真实头像认证").F("您只需模仿下面的手势自拍一张即可完成认证。短暂核实后，我们将把您推荐给更多用户。").u0("准备好了").m0("稍后再说").z();
            dialogZ.o0(new Runnable() { // from class: l.xai0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m28677s(act, dialogZ);
                }
            });
            dialogZ.m0(new Runnable() { // from class: l.ibi0
                @Override // java.lang.Runnable
                public final void run() {
                    dialogZ.dismiss();
                }
            });
        }
        if (z2) {
            if (NullChecker.a(picture)) {
                qib0.f19782G.m12754Q0(simpleDraweeView, picture.calculatedWidth(picture.size.width));
            }
            imageView.setVisibility(8);
            linearLayout.setVisibility(0);
            dialogZ = eVarB.G0("确认提交").F("请确认照片与你的头像一致，并做出了和示例相同的手势。审核中照片无法修改。").u0("上传").m0("重拍").z();
            dialogZ.o0(new Runnable() { // from class: l.rbi0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m28674p(dialogZ, verificationCenter, act);
                }
            });
            dialogZ.m0(new Runnable() { // from class: l.sbi0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m28672n(dialogZ, act);
                }
            });
        }
        dialogZ.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m28650H(final Act act, User user, User user2, final vi90 vi90Var) {
        if (user.isIdAndPicBothVerified()) {
            m28657O(act, user.isMe());
            return;
        }
        if (user2.isPicVerificationVerified()) {
            CoreDlg.r1(act);
            return;
        }
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        if (NullChecker.a(verificationCenterM3542k4) && TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending")) {
            CoreDlg.G1(act, act.string(R$string.f3095yr), act.string(R$string.f2153Tr), x2c0.f27147u8, act.string(R$string.f2123Sr), (d30) null, false, (String) null, (d30) null, (d30) null, (User) null, true, false, (String) null, (d30) null, !vi90Var.K());
            return;
        }
        tvf.m24835n();
        final cwf0 cwf0VarC = i0e.c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.f(cwf0VarC);
        CoreDlg.G1(act, act.string(R$string.f3095yr), act.string(R$string.f2153Tr), x2c0.f27147u8, act.string(R$string.f2093Rr), new d30() { // from class: l.hbi0
            public final void call() {
                zbi0.m28666h(act, vi90Var);
            }
        }, true, act.string(R$string.f2063Qr), new d30() { // from class: l.jbi0
            public final void call() {
                zvf0.r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.kbi0
            public final void call() {
                i0e.e(cwf0VarC);
            }
        }, (User) null, true, false, (String) null, (d30) null, !vi90Var.K());
    }

    /* JADX INFO: renamed from: I */
    public static void m28651I(Context context) {
        final cwf0 cwf0VarC = i0e.c("p_avatarVerification_profile_cancel_alert", Dialog.class.getName());
        JSONObject jSONObjectB = u4e.b("passive", "alert", "alert_system", "avatar_verification_cancel_button", "profile_show_page", "click");
        try {
            jSONObjectB.put("verification_type", "id_verification");
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0VarC.o(jSONObjectB);
        new Dialog.e(context).D(R$string.f2253X7).t0(R$string.f2193V7, new Runnable() { // from class: l.dbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28670l();
            }
        }).k0(R$string.f2223W7).V(new DialogInterface.OnDismissListener() { // from class: l.ebi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z().show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: J */
    public static void m28652J(final Context context, final boolean z, User user) {
        Dialog.e eVar = new Dialog.e(context);
        View viewInflate = o7r.a(context).inflate(f6c0.f12516yc, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f23016ge);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f22721P1);
        SimpleDraweeView simpleDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f22702O);
        textView.setText(z ? "TA已完成“探探认证”" : "新功能：探探认证");
        textView2.setText(z ? "完成认证可进一步提高曝光和配对成功率，快去试试吧！" : "邀请您体验新上线的高级认证功能，完成真实头像和身份认证后将获得专属标志，更容易被喜欢");
        qib0.f19782G.m12754Q0(simpleDraweeView, user.fp().profileMiddle());
        final cwf0 cwf0VarC = z ? i0e.c("p_id_verification_other_guide", Dialog.class.getName()) : i0e.c("p_id_verification_new_function_guide", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "guide"), vwb.Y("tooltips_trigger_module", "card")});
        eVar.v().O(viewInflate).B(false).x0(context.getResources().getDrawable(x2c0.f27291yo)).v0(z ? "立即认证，让TA看到我" : "去试试", new Runnable() { // from class: l.ybi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28673o(z, context);
            }
        }).n0(z ? "稍后再说" : "放弃体验", new Runnable() { // from class: l.yai0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28683y(z);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.zai0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: K */
    public static void m28653K(final Act act) {
        dd80.a aVar = new dd80.a(act);
        final cwf0 cwf0VarC = i0e.c("p_id_verification_fail_guide", Dialog.class.getName());
        aVar.y0(act.string(R$string.f1983O7)).t0(act.string(R$string.f1953N7)).S(x2c0.f27222wj).c0(act.string(R$string.f2073R7), new Runnable() { // from class: l.vbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28644B(act);
            }
        }).X(act.string(R$string.f2437d8), new Runnable() { // from class: l.wbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_id_verification_reverify_cancel_click", "p_id_verification_fail_guide");
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.xbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        i0e.f(cwf0VarC);
        aVar.r0();
    }

    /* JADX INFO: renamed from: L */
    public static void m28654L(Act act, d30 d30Var) {
        ic50.j().f().s0(act, OmsDialog.p_alert_avatar_verification_upgrade_guide_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: M */
    public static void m28655M(final Act act) {
        String strString;
        int i;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 == null) {
            return;
        }
        j760<Boolean, Boolean> j760VarM3543l4 = CoreModule.f1534c.f3541B0.m3543l4();
        String strString2 = userM21490p9.isFemale() ? act.string(R$string.f2570hi) : act.string(R$string.f2344a8);
        if (((Boolean) j760VarM3543l4.a).booleanValue() && ((Boolean) j760VarM3543l4.b).booleanValue()) {
            strString = userM21490p9.isFemale() ? act.string(R$string.f2600ii) : act.string(R$string.f2630ji);
        } else if (!((Boolean) j760VarM3543l4.a).booleanValue() && ((Boolean) j760VarM3543l4.b).booleanValue()) {
            strString = userM21490p9.isFemale() ? act.string(R$string.f2723mi) : act.string(R$string.f2754ni);
        } else if (!((Boolean) j760VarM3543l4.a).booleanValue() || ((Boolean) j760VarM3543l4.b).booleanValue()) {
            strString = "";
        } else {
            strString = userM21490p9.isFemale() ? act.string(R$string.f2661ki) : act.string(R$string.f2692li);
        }
        if (jjb0.m17487b()) {
            strString = "完成头像本人认证，可以设置优先看真实头像用户，找到同样真诚的人。";
        }
        new SpannableStringBuilder();
        final cwf0 cwf0VarC = i0e.c("p_verification_merge_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "guide"), vwb.Y("tooltips_trigger_module", "null"), vwb.Y("verification_popup_user_times", (Integer) CoreModule.f1534c.f3541B0.f3738W.get())});
        Dialog.e eVarT0 = act.dialog().v().G0(strString2).F(strString).J(true).B(true).V(new DialogInterface.OnDismissListener() { // from class: l.abi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).t0(R$string.f2733ms, new Runnable() { // from class: l.bbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28667i(act);
            }
        });
        eVarT0.l0(R$string.f2313Z7, new Runnable() { // from class: l.cbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.u("e_verification_merge_popup", "p_verification_merge_popup", new j760[]{vwb.Y("verification_popup_operation", "refuse")});
            }
        });
        eVarT0.T(w0c0.f24674b2);
        eVarT0.R(false);
        eVarT0.U(12);
        if (xdl0.w0() <= 1200) {
            String language = Locale.getDefault().getLanguage();
            if ("ja".equals(language) || "in".equals(language) || "id".equals(language)) {
                i = 10;
            } else if ("en".equals(language)) {
                if (xdl0.w0() <= 1200) {
                    eVarT0.x(t100.d(10.0f));
                }
                i = 4;
            } else {
                i = 20;
            }
            eVarT0.d0(t100.d(i));
        }
        eVarT0.a0(act.drawable(x2c0.f27254xj)).z().show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: N */
    public static void m28656N(final Context context) {
        final cwf0 cwf0VarC = i0e.c("p_id_verification_identify_confirm_guide", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "alert"), vwb.Y("tooltips_type_ui", "alert_system"), vwb.Y("tooltips_trigger_page", "setting_page"), vwb.Y("tooltips_trigger_reason", "tips"), vwb.Y("tooltips_trigger_module", "tantan_certified_recommend_first_button")});
        new Dialog.e(context).D(R$string.f2926t8).E0(R$string.f2986v8).k0(R$string.f2896s8).t0(R$string.f2956u8, new Runnable() { // from class: l.fbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28661c(context);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.gbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: O */
    public static void m28657O(final Act act, boolean z) {
        int i;
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (userM21490p9 == null) {
            return;
        }
        boolean zIsPicVerificationVerified = userM21490p9.isPicVerificationVerified();
        boolean zIsIdCardVerified = userM21490p9.isIdCardVerified();
        if (z) {
            ic50.j().f().s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            return;
        }
        String str = "p_id_verification_icon_explain_guide_unverified";
        if (zIsIdCardVerified && zIsPicVerificationVerified) {
            str = "p_id_verification_icon_explain_guide_verified";
        }
        final cwf0 cwf0VarC = i0e.c(str, Dialog.class.getName());
        dd80.a aVar = new dd80.a(act);
        if (zIsIdCardVerified) {
            if (zIsPicVerificationVerified) {
                aVar.s0(R$string.f2498f8, new Object[0]).Z(R$string.f2866r8);
            } else {
                aVar.s0(R$string.f2467e8, new Object[0]).a0(R$string.f2375b8, new Runnable() { // from class: l.mbi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zbi0.m28682x(act);
                    }
                }).U(R$string.f2437d8, new Runnable() { // from class: l.nbi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zvf0.r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
                    }
                });
                i = x2c0.f27147u8;
            }
            aVar.S(i).x0(R$string.f1923M7, new Object[0]);
            aVar.n0(new DialogInterface.OnDismissListener() { // from class: l.qbi0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.e(cwf0VarC);
                }
            }).r0();
            i0e.f(cwf0VarC);
        }
        aVar.s0(R$string.f2498f8, new Object[0]).a0(R$string.f2406c8, new Runnable() { // from class: l.obi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m28671m(act);
            }
        }).U(R$string.f2437d8, new Runnable() { // from class: l.pbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
            }
        });
        i = x2c0.f27179v8;
        aVar.S(i).x0(R$string.f1923M7, new Object[0]);
        aVar.n0(new DialogInterface.OnDismissListener() { // from class: l.qbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: P */
    public static void m28658P(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            ic50.j().f().s0(act, OmsDialog.p_identityVerification_fail_popup_verificationCenter.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "invalid")) {
            m28653K(act);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            ic50.j().f().s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (CoreModule.f1534c.f3628e0.m21490p9().isPicVerificationVerified() || TEnum.equals(studentVerificationStatus2, "verified")) {
                ic50.j().f().s0(act, OmsDialog.p_identityVerification_succeed_popup_verificationCenter.getIdentifier());
            } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
                ic50.j().f().s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            } else {
                ic50.j().f().s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m28659a(final Dialog dialog, Throwable th) {
        dialog.p0("重新上传");
        dialog.X().setClickable(true);
        lsi0.y("上传失败，请重试！");
        dialog.n0("返回");
        dialog.X().setOnClickListener(new View.OnClickListener() { // from class: l.lbi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m28661c(Context context) {
        m28646D(context);
        zvf0.r("e_id_verification_identify_confirm_guide_click", "p_id_verification_identify_confirm_guide");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m28666h(Act act, vi90 vi90Var) {
        zvf0.r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f1534c.f3541B0.m3550s4(), "pending")) {
            CoreDlg.G1(act, act.string(R$string.f1853Jr), act.string(R$string.f1823Ir), x2c0.f27190vj, act.string(R$string.f3065xr), (d30) null, false, (String) null, (d30) null, (d30) null, (User) null, true, false, (String) null, (d30) null, !vi90Var.K());
        } else {
            tvf.m24829h(act, "dialog");
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m28667i(Act act) {
        zvf0.u("e_verification_merge_popup", "p_verification_merge_popup", new j760[]{vwb.Y("verification_popup_operation", "confirm")});
        if (((Boolean) CoreModule.f1534c.f3541B0.m3543l4().a).booleanValue()) {
            tvf.m24825d(act, "dialog");
            return;
        }
        if (((Boolean) CoreModule.f1534c.f3541B0.m3543l4().b).booleanValue()) {
            VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
            if (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.idCard) && TEnum.equals(verificationCenterM3542k4.idCard.status, "invalid")) {
                act.startActivity(VerificationCenterAct.m9411X1(act, false));
            } else {
                m28646D(act);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m28670l() {
        CoreModule.f1534c.f3574M0.m16059d3("");
        zvf0.r("e_avatarVerification_cancel_confirm_click", "p_avatarVerification_profile_cancel_alert");
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m28671m(Act act) {
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        if (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.idCard) && TEnum.equals(verificationCenterM3542k4.idCard.status, "pending")) {
            m28658P(act, verificationCenterM3542k4.idCard.status, verificationCenterM3542k4.picVerificationInfo.status);
        } else {
            m28646D(act);
        }
        zvf0.u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", new j760[]{vwb.Y("id_verification_button_state", "waiting_verification")});
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m28672n(Dialog dialog, Act act) {
        dialog.dismiss();
        oyx.j(act, true, true);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m28673o(boolean z, Context context) {
        if (z) {
            zvf0.r("e_id_verification_other_guide_confirm_click", "p_id_verification_other_guide");
        } else {
            zvf0.r("e_id_verification_new_function_guide_confirm_click", "p_id_verification_new_function_guide");
        }
        m28646D(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m28674p(final Dialog dialog, VerificationCenter verificationCenter, final Act act) {
        dialog.p0("上传中…");
        dialog.X().setClickable(false);
        CoreModule.f1534c.f3541B0.m3546o4(verificationCenter).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.tbi0
            public final void call(Object obj) {
                zbi0.m28643A(dialog, act, (roj0) obj);
            }
        }, new e30() { // from class: l.ubi0
            public final void call(Object obj) {
                zbi0.m28659a(dialog, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m28677s(Act act, Dialog dialog) {
        oyx.j(act, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m28682x(Act act) {
        m28645C(act);
        zvf0.u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", new j760[]{vwb.Y("id_verification_button_state", "waiting_active")});
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m28683y(boolean z) {
        if (z) {
            zvf0.r("e_id_verification_other_guide_cancel_click", "p_id_verification_other_guide");
        } else {
            zvf0.r("e_idVerification_newFunction_guide_cancle_click", "p_id_verification_new_function_guide");
        }
    }
}
