package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.IntroductionAct;
import com.p051p1.mobile.putong.core.p058ui.verification.national.NationalIdAuthAct;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class zki0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m220072A(Dialog dialog, Act act, uxj0 uxj0Var) {
        dialog.dismiss();
        CoreDlg.m46164E1(act, "审核中", "你已提交了认证照片，请耐心等待审核结果", dbc0.f87123jk, "好的", null, false, null, null, null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m220073B(Act act) {
        xc20.m210103o(act);
        i4g0.m138520r("e_id_verification_reverify_confirm_re_click", "p_id_verification_fail_guide");
    }

    /* JADX INFO: renamed from: C */
    public static void m220074C(Act act) {
        if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            CoreDlg.m46164E1(act, act.getString(R$string.f19259fs), act.getString(R$string.f19228es), dbc0.f87123jk, act.getString(R$string.f18894Tr), null, false, null, null, null);
        } else {
            hxf.m137587h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m220075D(Context context) {
        context.startActivity(IntroductionAct.m57251X1(context, "tantan_verification"));
    }

    /* JADX INFO: renamed from: E */
    public static void m220076E(Context context) {
        m220077F(context, false);
    }

    /* JADX INFO: renamed from: F */
    public static void m220077F(Context context, boolean z) {
        Intent intentM57255X1 = NationalIdAuthAct.m57255X1(context, "tantan_verification");
        NationalIdAuthAct.m57257Z1(intentM57255X1, z);
        context.startActivity(intentM57255X1);
    }

    /* JADX INFO: renamed from: G */
    public static void m220078G(final Act act, boolean z, boolean z2, Picture picture, final VerificationCenter verificationCenter) {
        final Dialog dialogM21566z = null;
        View viewInflate = act.inflater().inflate(kec0.f126124we, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(adc0.f70266b6);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(adc0.f69984K9);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70155Ua);
        Dialog.C4460e c4460eM21495B = act.dialog().m21558v().m21551r0("*这张照片仅用于认证，其它用户不可见").m21519P(viewInflate, false).m21548q(false).m21495B(false);
        if (z) {
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            dialogM21566z = c4460eM21495B.m21506G0("真实头像认证").m21503F("您只需模仿下面的手势自拍一张即可完成认证。短暂核实后，我们将把您推荐给更多用户。").m21557u0("准备好了").m21542m0("稍后再说").m21566z();
            dialogM21566z.m21473o0(new Runnable() { // from class: l.xji0
                @Override // java.lang.Runnable
                public final void run() {
                    zki0.m220106s(act, dialogM21566z);
                }
            });
            dialogM21566z.m21471m0(new Runnable() { // from class: l.iki0
                @Override // java.lang.Runnable
                public final void run() {
                    dialogM21566z.dismiss();
                }
            });
        }
        if (z2) {
            if (NullChecker.m82486a(picture)) {
                uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(picture.size.width));
            }
            imageView.setVisibility(8);
            linearLayout.setVisibility(0);
            dialogM21566z = c4460eM21495B.m21506G0("确认提交").m21503F("请确认照片与你的头像一致，并做出了和示例相同的手势。审核中照片无法修改。").m21557u0("上传").m21542m0("重拍").m21566z();
            dialogM21566z.m21473o0(new Runnable() { // from class: l.rki0
                @Override // java.lang.Runnable
                public final void run() {
                    zki0.m220103p(dialogM21566z, verificationCenter, act);
                }
            });
            dialogM21566z.m21471m0(new Runnable() { // from class: l.ski0
                @Override // java.lang.Runnable
                public final void run() {
                    zki0.m220101n(dialogM21566z, act);
                }
            });
        }
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m220079H(final Act act, User user, User user2, final zq90 zq90Var) {
        if (user.isIdAndPicBothVerified()) {
            m220086O(act, user.isMe());
            return;
        }
        if (user2.isPicVerificationVerified()) {
            CoreDlg.m46280r1(act);
            return;
        }
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            CoreDlg.m46170G1(act, act.string(R$string.f18924Ur), act.string(R$string.f19567ps), dbc0.f87506v8, act.string(R$string.f19536os), null, false, null, null, null, null, true, false, null, null, !zq90Var.m220958K());
            return;
        }
        hxf.m137593n();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        CoreDlg.m46170G1(act, act.string(R$string.f18924Ur), act.string(R$string.f19567ps), dbc0.f87506v8, act.string(R$string.f19505ns), new x20() { // from class: l.hki0
            @Override // p153l.x20
            public final void call() {
                zki0.m220095h(act, zq90Var);
            }
        }, true, act.string(R$string.f19474ms), new x20() { // from class: l.jki0
            @Override // p153l.x20
            public final void call() {
                i4g0.m138520r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new x20() { // from class: l.kki0
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, null, true, false, null, null, !zq90Var.m220958K());
    }

    /* JADX INFO: renamed from: I */
    public static void m220080I(Context context) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_avatarVerification_profile_cancel_alert", Dialog.class.getName());
        JSONObject jSONObjectM138810b = i6e.m138810b("passive", "alert", "alert_system", "avatar_verification_cancel_button", "profile_show_page", "click");
        try {
            jSONObjectM138810b.put("verification_type", "id_verification");
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0VarM204399c.m152780o(jSONObjectM138810b);
        new Dialog.C4460e(context).m21499D(R$string.f19054Z7).m21555t0(R$string.f18994X7, new Runnable() { // from class: l.dki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220099l();
            }
        }).m21540k0(R$string.f19024Y7).m21525V(new DialogInterface.OnDismissListener() { // from class: l.eki0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z().show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: J */
    public static void m220081J(final Context context, final boolean z, User user) {
        Dialog.C4460e c4460e = new Dialog.C4460e(context);
        View viewInflate = p9r.m171370a(context).inflate(kec0.f125413Fc, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(adc0.f70409je);
        TextView textView2 = (TextView) viewInflate.findViewById(adc0.f70061P1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70042O);
        textView.setText(z ? "TA已完成“探探认证”" : "新功能：探探认证");
        textView2.setText(z ? "完成认证可进一步提高曝光和配对成功率，快去试试吧！" : "邀请您体验新上线的高级认证功能，完成真实头像和身份认证后将获得专属标志，更容易被喜欢");
        uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileMiddle());
        final l4g0 l4g0VarM204399c = z ? w1e.m204399c("p_id_verification_other_guide", Dialog.class.getName()) : w1e.m204399c("p_id_verification_new_function_guide", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"), jyb.m147494Y("tooltips_trigger_module", "card"));
        c4460e.m21558v().m21518O(viewInflate).m21495B(false).m21563x0(context.getResources().getDrawable(dbc0.f87227mp)).m21559v0(z ? "立即认证，让TA看到我" : "去试试", new Runnable() { // from class: l.yki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220102o(z, context);
            }
        }).m21543n0(z ? "稍后再说" : "放弃体验", new Runnable() { // from class: l.yji0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220112y(z);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.zji0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: K */
    public static void m220082K(final Act act) {
        jl80.C17971a c17971a = new jl80.C17971a(act);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_id_verification_fail_guide", Dialog.class.getName());
        c17971a.m146056y0(act.string(R$string.f18784Q7)).m146051t0(act.string(R$string.f18754P7)).m146024S(dbc0.f87156kk).m146034c0(act.string(R$string.f18874T7), new Runnable() { // from class: l.vki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220073B(act);
            }
        }).m146029X(act.string(R$string.f19239f8), new Runnable() { // from class: l.wki0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_id_verification_reverify_cancel_click", "p_id_verification_fail_guide");
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.xki0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        w1e.m204402f(l4g0VarM204399c);
        c17971a.m146049r0();
    }

    /* JADX INFO: renamed from: L */
    public static void m220083L(Act act, x20 x20Var) {
        pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_alert_avatar_verification_upgrade_guide_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: M */
    public static void m220084M(final Act act) {
        String strString;
        int i;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        pf60<Boolean, Boolean> pf60VarM32616l4 = CoreModule.f18264c.f20294B0.m32616l4();
        String strString2 = userM116600p9.isFemale() ? act.string(R$string.f18366Ci) : act.string(R$string.f19147c8);
        if (pf60VarM32616l4.f152156a.booleanValue() && pf60VarM32616l4.f152157b.booleanValue()) {
            strString = userM116600p9.isFemale() ? act.string(R$string.f18397Di) : act.string(R$string.f18428Ei);
        } else if (!pf60VarM32616l4.f152156a.booleanValue() && pf60VarM32616l4.f152157b.booleanValue()) {
            strString = userM116600p9.isFemale() ? act.string(R$string.f18521Hi) : act.string(R$string.f18552Ii);
        } else if (!pf60VarM32616l4.f152156a.booleanValue() || pf60VarM32616l4.f152157b.booleanValue()) {
            strString = "";
        } else {
            strString = userM116600p9.isFemale() ? act.string(R$string.f18459Fi) : act.string(R$string.f18490Gi);
        }
        if (nrb0.m164466b()) {
            strString = "完成头像本人认证，可以设置优先看真实头像用户，找到同样真诚的人。";
        }
        new SpannableStringBuilder();
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_verification_merge_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_self_definition_basic"), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"), jyb.m147494Y("tooltips_trigger_module", "null"), jyb.m147494Y("verification_popup_user_times", CoreModule.f18264c.f20294B0.f20491W.get()));
        Dialog.C4460e c4460eM21555t0 = act.dialog().m21558v().m21506G0(strString2).m21503F(strString).m21511J(true).m21495B(true).m21525V(new DialogInterface.OnDismissListener() { // from class: l.aki0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21555t0(R$string.f18562Is, new Runnable() { // from class: l.bki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220096i(act);
            }
        });
        c4460eM21555t0.m21541l0(R$string.f19116b8, new Runnable() { // from class: l.cki0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138523u("e_verification_merge_popup", "p_verification_merge_popup", jyb.m147494Y("verification_popup_operation", "refuse"));
            }
        });
        c4460eM21555t0.m21523T(c9c0.f80407c2);
        c4460eM21555t0.m21521R(false);
        c4460eM21555t0.m21524U(12);
        if (bnl0.m105588w0() <= 1200) {
            String language = Locale.getDefault().getLanguage();
            if ("ja".equals(language) || "in".equals(language) || "id".equals(language)) {
                i = 10;
            } else if ("en".equals(language)) {
                if (bnl0.m105588w0() <= 1200) {
                    c4460eM21555t0.m21562x(qa00.m175859d(10.0f));
                }
                i = 4;
            } else {
                i = 20;
            }
            c4460eM21555t0.m21533d0(qa00.m175859d(i));
        }
        c4460eM21555t0.m21530a0(act.drawable(dbc0.f87189lk)).m21566z().show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: N */
    public static void m220085N(final Context context) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_id_verification_identify_confirm_guide", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "alert"), jyb.m147494Y("tooltips_type_ui", "alert_system"), jyb.m147494Y("tooltips_trigger_page", "setting_page"), jyb.m147494Y("tooltips_trigger_reason", "tips"), jyb.m147494Y("tooltips_trigger_module", "tantan_certified_recommend_first_button"));
        new Dialog.C4460e(context).m21499D(R$string.f19733v8).m21502E0(R$string.f19795x8).m21540k0(R$string.f19702u8).m21555t0(R$string.f19764w8, new Runnable() { // from class: l.fki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220090c(context);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.gki0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: O */
    public static void m220086O(final Act act, boolean z) {
        int i;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null) {
            return;
        }
        boolean zIsPicVerificationVerified = userM116600p9.isPicVerificationVerified();
        boolean zIsIdCardVerified = userM116600p9.isIdCardVerified();
        if (z) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            return;
        }
        String str = "p_id_verification_icon_explain_guide_unverified";
        if (zIsIdCardVerified && zIsPicVerificationVerified) {
            str = "p_id_verification_icon_explain_guide_verified";
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c(str, Dialog.class.getName());
        jl80.C17971a c17971a = new jl80.C17971a(act);
        if (zIsIdCardVerified) {
            if (zIsPicVerificationVerified) {
                c17971a.m146050s0(R$string.f19301h8, new Object[0]).m146031Z(R$string.f19671t8);
            } else {
                c17971a.m146050s0(R$string.f19270g8, new Object[0]).m146032a0(R$string.f19178d8, new Runnable() { // from class: l.mki0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zki0.m220111x(act);
                    }
                }).m146026U(R$string.f19239f8, new Runnable() { // from class: l.nki0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i4g0.m138520r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
                    }
                });
                i = dbc0.f87506v8;
            }
            c17971a.m146024S(i).m146055x0(R$string.f18724O7, new Object[0]);
            c17971a.m146045n0(new DialogInterface.OnDismissListener() { // from class: l.qki0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    w1e.m204401e(l4g0VarM204399c);
                }
            }).m146049r0();
            w1e.m204402f(l4g0VarM204399c);
        }
        c17971a.m146050s0(R$string.f19301h8, new Object[0]).m146032a0(R$string.f19208e8, new Runnable() { // from class: l.oki0
            @Override // java.lang.Runnable
            public final void run() {
                zki0.m220100m(act);
            }
        }).m146026U(R$string.f19239f8, new Runnable() { // from class: l.pki0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
            }
        });
        i = dbc0.f87538w8;
        c17971a.m146024S(i).m146055x0(R$string.f18724O7, new Object[0]);
        c17971a.m146045n0(new DialogInterface.OnDismissListener() { // from class: l.qki0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: P */
    public static void m220087P(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_identityVerification_fail_popup_verificationCenter.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "invalid")) {
            m220082K(act);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() || TEnum.equals(studentVerificationStatus2, "verified")) {
                pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_identityVerification_succeed_popup_verificationCenter.getIdentifier());
            } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
                pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            } else {
                pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m220088a(final Dialog dialog, Throwable th) {
        dialog.m21474p0("重新上传");
        dialog.m21462X().setClickable(true);
        o1j0.m165651y("上传失败，请重试！");
        dialog.m21472n0("返回");
        dialog.m21462X().setOnClickListener(new View.OnClickListener() { // from class: l.lki0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m220090c(Context context) {
        m220075D(context);
        i4g0.m138520r("e_id_verification_identify_confirm_guide_click", "p_id_verification_identify_confirm_guide");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m220095h(Act act, zq90 zq90Var) {
        i4g0.m138520r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
            CoreDlg.m46170G1(act, act.string(R$string.f19259fs), act.string(R$string.f19228es), dbc0.f87123jk, act.string(R$string.f18894Tr), null, false, null, null, null, null, true, false, null, null, !zq90Var.m220958K());
        } else {
            hxf.m137587h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m220096i(Act act) {
        i4g0.m138523u("e_verification_merge_popup", "p_verification_merge_popup", jyb.m147494Y("verification_popup_operation", BLiveVoiceSingTogehterState.confirm));
        if (CoreModule.f18264c.f20294B0.m32616l4().f152156a.booleanValue()) {
            hxf.m137583d(act, OMSTemplateType.dialog);
            return;
        }
        if (CoreModule.f18264c.f20294B0.m32616l4().f152157b.booleanValue()) {
            VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
            if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard) && TEnum.equals(verificationCenterM32615k4.idCard.status, "invalid")) {
                act.startActivity(VerificationCenterAct.m57174Y1(act, false));
            } else {
                m220075D(act);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m220099l() {
        CoreModule.f18264c.f20327M0.m194842d3("");
        i4g0.m138520r("e_avatarVerification_cancel_confirm_click", "p_avatarVerification_profile_cancel_alert");
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m220100m(Act act) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard) && TEnum.equals(verificationCenterM32615k4.idCard.status, "pending")) {
            m220087P(act, verificationCenterM32615k4.idCard.status, verificationCenterM32615k4.picVerificationInfo.status);
        } else {
            m220075D(act);
        }
        i4g0.m138523u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", jyb.m147494Y("id_verification_button_state", "waiting_verification"));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m220101n(Dialog dialog, Act act) {
        dialog.dismiss();
        l7y.m153158j(act, true, true);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m220102o(boolean z, Context context) {
        if (z) {
            i4g0.m138520r("e_id_verification_other_guide_confirm_click", "p_id_verification_other_guide");
        } else {
            i4g0.m138520r("e_id_verification_new_function_guide_confirm_click", "p_id_verification_new_function_guide");
        }
        m220075D(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m220103p(final Dialog dialog, VerificationCenter verificationCenter, final Act act) {
        dialog.m21474p0("上传中…");
        dialog.m21462X().setClickable(false);
        CoreModule.f18264c.f20294B0.m32619o4(verificationCenter).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.tki0
            @Override // p153l.y20
            public final void call(Object obj) {
                zki0.m220072A(dialog, act, (uxj0) obj);
            }
        }, new y20() { // from class: l.uki0
            @Override // p153l.y20
            public final void call(Object obj) {
                zki0.m220088a(dialog, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m220106s(Act act, Dialog dialog) {
        l7y.m153158j(act, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m220111x(Act act) {
        m220074C(act);
        i4g0.m138523u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", jyb.m147494Y("id_verification_button_state", "waiting_active"));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m220112y(boolean z) {
        if (z) {
            i4g0.m138520r("e_id_verification_other_guide_cancel_click", "p_id_verification_other_guide");
        } else {
            i4g0.m138520r("e_idVerification_newFunction_guide_cancle_click", "p_id_verification_new_function_guide");
        }
    }
}
