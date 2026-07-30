package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.IntroductionAct;
import com.p046p1.mobile.putong.core.p053ui.verification.national.NationalIdAuthAct;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceSingTogehterState;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes9.dex */
public class zbi0 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m217852A(Dialog dialog, Act act, roj0 roj0Var) {
        dialog.dismiss();
        CoreDlg.m44981E1(act, "审核中", "你已提交了认证照片，请耐心等待审核结果", x2c0.f190654vj, "好的", null, false, null, null, null);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m217853B(Act act) {
        p420.m167349o(act);
        zvf0.m220396r("e_id_verification_reverify_confirm_re_click", "p_id_verification_fail_guide");
    }

    /* JADX INFO: renamed from: C */
    public static void m217854C(Act act) {
        if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            CoreDlg.m44981E1(act, act.getString(R$string.f17864Jr), act.getString(R$string.f17834Ir), x2c0.f190654vj, act.getString(R$string.f19076xr), null, false, null, null, null);
        } else {
            tvf.m190730h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m217855D(Context context) {
        context.startActivity(IntroductionAct.m56068V1(context, "tantan_verification"));
    }

    /* JADX INFO: renamed from: E */
    public static void m217856E(Context context) {
        m217857F(context, false);
    }

    /* JADX INFO: renamed from: F */
    public static void m217857F(Context context, boolean z) {
        Intent intentM56072V1 = NationalIdAuthAct.m56072V1(context, "tantan_verification");
        NationalIdAuthAct.m56074Y1(intentM56072V1, z);
        context.startActivity(intentM56072V1);
    }

    /* JADX INFO: renamed from: G */
    public static void m217858G(final Act act, boolean z, boolean z2, Picture picture, final VerificationCenter verificationCenter) {
        final Dialog dialogM20567z = null;
        View viewInflate = act.inflater().inflate(f6c0.f95951pe, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.f174141Z5);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(u4c0.f173862I9);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174033Sa);
        Dialog.C4309e c4309eM20496B = act.dialog().m20559v().m20552r0("*这张照片仅用于认证，其它用户不可见").m20520P(viewInflate, false).m20549q(false).m20496B(false);
        if (z) {
            imageView.setVisibility(0);
            linearLayout.setVisibility(8);
            dialogM20567z = c4309eM20496B.m20507G0("真实头像认证").m20504F("您只需模仿下面的手势自拍一张即可完成认证。短暂核实后，我们将把您推荐给更多用户。").m20558u0("准备好了").m20543m0("稍后再说").m20567z();
            dialogM20567z.m20474o0(new Runnable() { // from class: l.xai0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m217886s(act, dialogM20567z);
                }
            });
            dialogM20567z.m20472m0(new Runnable() { // from class: l.ibi0
                @Override // java.lang.Runnable
                public final void run() {
                    dialogM20567z.dismiss();
                }
            });
        }
        if (z2) {
            if (NullChecker.m81303a(picture)) {
                qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(picture.size.width));
            }
            imageView.setVisibility(8);
            linearLayout.setVisibility(0);
            dialogM20567z = c4309eM20496B.m20507G0("确认提交").m20504F("请确认照片与你的头像一致，并做出了和示例相同的手势。审核中照片无法修改。").m20558u0("上传").m20543m0("重拍").m20567z();
            dialogM20567z.m20474o0(new Runnable() { // from class: l.rbi0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m217883p(dialogM20567z, verificationCenter, act);
                }
            });
            dialogM20567z.m20472m0(new Runnable() { // from class: l.sbi0
                @Override // java.lang.Runnable
                public final void run() {
                    zbi0.m217881n(dialogM20567z, act);
                }
            });
        }
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: H */
    public static void m217859H(final Act act, User user, User user2, final vi90 vi90Var) {
        if (user.isIdAndPicBothVerified()) {
            m217866O(act, user.isMe());
            return;
        }
        if (user2.isPicVerificationVerified()) {
            CoreDlg.m45097r1(act);
            return;
        }
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            CoreDlg.m44987G1(act, act.string(R$string.f19106yr), act.string(R$string.f18164Tr), x2c0.f190611u8, act.string(R$string.f18134Sr), null, false, null, null, null, null, true, false, null, null, !vi90Var.m198510K());
            return;
        }
        tvf.m190736n();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_icon_explain_guide_Unverified", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        CoreDlg.m44987G1(act, act.string(R$string.f19106yr), act.string(R$string.f18164Tr), x2c0.f190611u8, act.string(R$string.f18104Rr), new d30() { // from class: l.hbi0
            @Override // p149l.d30
            public final void call() {
                zbi0.m217875h(act, vi90Var);
            }
        }, true, act.string(R$string.f18074Qr), new d30() { // from class: l.jbi0
            @Override // p149l.d30
            public final void call() {
                zvf0.m220396r("e_avatarVerification_explain_cancle_click", "p_avatarVerification_icon_explain_guide_Unverified");
            }
        }, new d30() { // from class: l.kbi0
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, null, true, false, null, null, !vi90Var.m198510K());
    }

    /* JADX INFO: renamed from: I */
    public static void m217860I(Context context) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_avatarVerification_profile_cancel_alert", Dialog.class.getName());
        JSONObject jSONObjectM191727b = u4e.m191727b("passive", "alert", "alert_system", "avatar_verification_cancel_button", "profile_show_page", "click");
        try {
            jSONObjectM191727b.put("verification_type", "id_verification");
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0VarM133794c.m109039o(jSONObjectM191727b);
        new Dialog.C4309e(context).m20500D(R$string.f18264X7).m20556t0(R$string.f18204V7, new Runnable() { // from class: l.dbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217879l();
            }
        }).m20541k0(R$string.f18234W7).m20526V(new DialogInterface.OnDismissListener() { // from class: l.ebi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z().show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: J */
    public static void m217861J(final Context context, final boolean z, User user) {
        Dialog.C4309e c4309e = new Dialog.C4309e(context);
        View viewInflate = o7r.m163037a(context).inflate(f6c0.f96102yc, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(u4c0.f174268ge);
        TextView textView2 = (TextView) viewInflate.findViewById(u4c0.f173973P1);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173954O);
        textView.setText(z ? "TA已完成“探探认证”" : "新功能：探探认证");
        textView2.setText(z ? "完成认证可进一步提高曝光和配对成功率，快去试试吧！" : "邀请您体验新上线的高级认证功能，完成真实头像和身份认证后将获得专属标志，更容易被喜欢");
        qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileMiddle());
        final cwf0 cwf0VarM133794c = z ? i0e.m133794c("p_id_verification_other_guide", Dialog.class.getName()) : i0e.m133794c("p_id_verification_new_function_guide", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"), vwb.m200311Y("tooltips_trigger_module", "card"));
        c4309e.m20559v().m20519O(viewInflate).m20496B(false).m20564x0(context.getResources().getDrawable(x2c0.f190755yo)).m20560v0(z ? "立即认证，让TA看到我" : "去试试", new Runnable() { // from class: l.ybi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217882o(z, context);
            }
        }).m20544n0(z ? "稍后再说" : "放弃体验", new Runnable() { // from class: l.yai0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217892y(z);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.zai0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: K */
    public static void m217862K(final Act act) {
        dd80.C16336a c16336a = new dd80.C16336a(act);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_id_verification_fail_guide", Dialog.class.getName());
        c16336a.m110996y0(act.string(R$string.f17994O7)).m110991t0(act.string(R$string.f17964N7)).m110964S(x2c0.f190686wj).m110974c0(act.string(R$string.f18084R7), new Runnable() { // from class: l.vbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217853B(act);
            }
        }).m110969X(act.string(R$string.f18448d8), new Runnable() { // from class: l.wbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_id_verification_reverify_cancel_click", "p_id_verification_fail_guide");
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.xbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        i0e.m133797f(cwf0VarM133794c);
        c16336a.m110989r0();
    }

    /* JADX INFO: renamed from: L */
    public static void m217863L(Act act, d30 d30Var) {
        ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_alert_avatar_verification_upgrade_guide_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: M */
    public static void m217864M(final Act act) {
        String strString;
        int i;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return;
        }
        j760<Boolean, Boolean> j760VarM31613l4 = CoreModule.f17545c.f19552B0.m31613l4();
        String strString2 = userM169527p9.isFemale() ? act.string(R$string.f18581hi) : act.string(R$string.f18355a8);
        if (j760VarM31613l4.f116564a.booleanValue() && j760VarM31613l4.f116565b.booleanValue()) {
            strString = userM169527p9.isFemale() ? act.string(R$string.f18611ii) : act.string(R$string.f18641ji);
        } else if (!j760VarM31613l4.f116564a.booleanValue() && j760VarM31613l4.f116565b.booleanValue()) {
            strString = userM169527p9.isFemale() ? act.string(R$string.f18734mi) : act.string(R$string.f18765ni);
        } else if (!j760VarM31613l4.f116564a.booleanValue() || j760VarM31613l4.f116565b.booleanValue()) {
            strString = "";
        } else {
            strString = userM169527p9.isFemale() ? act.string(R$string.f18672ki) : act.string(R$string.f18703li);
        }
        if (jjb0.m141784b()) {
            strString = "完成头像本人认证，可以设置优先看真实头像用户，找到同样真诚的人。";
        }
        new SpannableStringBuilder();
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_verification_merge_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_self_definition_basic"), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"), vwb.m200311Y("tooltips_trigger_module", "null"), vwb.m200311Y("verification_popup_user_times", CoreModule.f17545c.f19552B0.f19749W.get()));
        Dialog.C4309e c4309eM20556t0 = act.dialog().m20559v().m20507G0(strString2).m20504F(strString).m20512J(true).m20496B(true).m20526V(new DialogInterface.OnDismissListener() { // from class: l.abi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20556t0(R$string.f18744ms, new Runnable() { // from class: l.bbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217876i(act);
            }
        });
        c4309eM20556t0.m20542l0(R$string.f18324Z7, new Runnable() { // from class: l.cbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220399u("e_verification_merge_popup", "p_verification_merge_popup", vwb.m200311Y("verification_popup_operation", "refuse"));
            }
        });
        c4309eM20556t0.m20524T(w0c0.f183834b2);
        c4309eM20556t0.m20522R(false);
        c4309eM20556t0.m20525U(12);
        if (xdl0.m208408w0() <= 1200) {
            String language = Locale.getDefault().getLanguage();
            if ("ja".equals(language) || "in".equals(language) || "id".equals(language)) {
                i = 10;
            } else if ("en".equals(language)) {
                if (xdl0.m208408w0() <= 1200) {
                    c4309eM20556t0.m20563x(t100.m186890d(10.0f));
                }
                i = 4;
            } else {
                i = 20;
            }
            c4309eM20556t0.m20534d0(t100.m186890d(i));
        }
        c4309eM20556t0.m20531a0(act.drawable(x2c0.f190718xj)).m20567z().show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: N */
    public static void m217865N(final Context context) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_id_verification_identify_confirm_guide", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "alert"), vwb.m200311Y("tooltips_type_ui", "alert_system"), vwb.m200311Y("tooltips_trigger_page", "setting_page"), vwb.m200311Y("tooltips_trigger_reason", "tips"), vwb.m200311Y("tooltips_trigger_module", "tantan_certified_recommend_first_button"));
        new Dialog.C4309e(context).m20500D(R$string.f18937t8).m20503E0(R$string.f18997v8).m20541k0(R$string.f18907s8).m20556t0(R$string.f18967u8, new Runnable() { // from class: l.fbi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217870c(context);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.gbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: O */
    public static void m217866O(final Act act, boolean z) {
        int i;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null) {
            return;
        }
        boolean zIsPicVerificationVerified = userM169527p9.isPicVerificationVerified();
        boolean zIsIdCardVerified = userM169527p9.isIdCardVerified();
        if (z) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            return;
        }
        String str = "p_id_verification_icon_explain_guide_unverified";
        if (zIsIdCardVerified && zIsPicVerificationVerified) {
            str = "p_id_verification_icon_explain_guide_verified";
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c(str, Dialog.class.getName());
        dd80.C16336a c16336a = new dd80.C16336a(act);
        if (zIsIdCardVerified) {
            if (zIsPicVerificationVerified) {
                c16336a.m110990s0(R$string.f18509f8, new Object[0]).m110971Z(R$string.f18877r8);
            } else {
                c16336a.m110990s0(R$string.f18478e8, new Object[0]).m110972a0(R$string.f18386b8, new Runnable() { // from class: l.mbi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zbi0.m217891x(act);
                    }
                }).m110966U(R$string.f18448d8, new Runnable() { // from class: l.nbi0
                    @Override // java.lang.Runnable
                    public final void run() {
                        zvf0.m220396r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
                    }
                });
                i = x2c0.f190611u8;
            }
            c16336a.m110964S(i).m110995x0(R$string.f17934M7, new Object[0]);
            c16336a.m110985n0(new DialogInterface.OnDismissListener() { // from class: l.qbi0
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i0e.m133796e(cwf0VarM133794c);
                }
            }).m110989r0();
            i0e.m133797f(cwf0VarM133794c);
        }
        c16336a.m110990s0(R$string.f18509f8, new Object[0]).m110972a0(R$string.f18417c8, new Runnable() { // from class: l.obi0
            @Override // java.lang.Runnable
            public final void run() {
                zbi0.m217880m(act);
            }
        }).m110966U(R$string.f18448d8, new Runnable() { // from class: l.pbi0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_id_verification_explain_cancel_click", "p_id_verification_icon_explain_guide_unverified");
            }
        });
        i = x2c0.f190643v8;
        c16336a.m110964S(i).m110995x0(R$string.f17934M7, new Object[0]);
        c16336a.m110985n0(new DialogInterface.OnDismissListener() { // from class: l.qbi0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: P */
    public static void m217867P(Act act, StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_identityVerification_fail_popup_verificationCenter.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "invalid")) {
            m217862K(act);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() || TEnum.equals(studentVerificationStatus2, "verified")) {
                ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_identityVerification_succeed_popup_verificationCenter.getIdentifier());
            } else if (TEnum.equals(studentVerificationStatus2, "pending")) {
                ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_review_id_popup.getIdentifier());
            } else {
                ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_id_verification_unactivated_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m217868a(final Dialog dialog, Throwable th) {
        dialog.m20475p0("重新上传");
        dialog.m20463X().setClickable(true);
        lsi0.m151595y("上传失败，请重试！");
        dialog.m20473n0("返回");
        dialog.m20463X().setOnClickListener(new View.OnClickListener() { // from class: l.lbi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dialog.dismiss();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m217870c(Context context) {
        m217855D(context);
        zvf0.m220396r("e_id_verification_identify_confirm_guide_click", "p_id_verification_identify_confirm_guide");
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m217875h(Act act, vi90 vi90Var) {
        zvf0.m220396r("e_avatarVerification_explain_click", "p_avatarVerification_icon_explain_guide_Unverified");
        if (TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
            CoreDlg.m44987G1(act, act.string(R$string.f17864Jr), act.string(R$string.f17834Ir), x2c0.f190654vj, act.string(R$string.f19076xr), null, false, null, null, null, null, true, false, null, null, !vi90Var.m198510K());
        } else {
            tvf.m190730h(act, OMSTemplateType.dialog);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m217876i(Act act) {
        zvf0.m220399u("e_verification_merge_popup", "p_verification_merge_popup", vwb.m200311Y("verification_popup_operation", BLiveVoiceSingTogehterState.confirm));
        if (CoreModule.f17545c.f19552B0.m31613l4().f116564a.booleanValue()) {
            tvf.m190726d(act, OMSTemplateType.dialog);
            return;
        }
        if (CoreModule.f17545c.f19552B0.m31613l4().f116565b.booleanValue()) {
            VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
            if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard) && TEnum.equals(verificationCenterM31612k4.idCard.status, "invalid")) {
                act.startActivity(VerificationCenterAct.m55991X1(act, false));
            } else {
                m217855D(act);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m217879l() {
        CoreModule.f17545c.f19585M0.m129480d3("");
        zvf0.m220396r("e_avatarVerification_cancel_confirm_click", "p_avatarVerification_profile_cancel_alert");
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m217880m(Act act) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard) && TEnum.equals(verificationCenterM31612k4.idCard.status, "pending")) {
            m217867P(act, verificationCenterM31612k4.idCard.status, verificationCenterM31612k4.picVerificationInfo.status);
        } else {
            m217855D(act);
        }
        zvf0.m220399u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", vwb.m200311Y("id_verification_button_state", "waiting_verification"));
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m217881n(Dialog dialog, Act act) {
        dialog.dismiss();
        oyx.m166736j(act, true, true);
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m217882o(boolean z, Context context) {
        if (z) {
            zvf0.m220396r("e_id_verification_other_guide_confirm_click", "p_id_verification_other_guide");
        } else {
            zvf0.m220396r("e_id_verification_new_function_guide_confirm_click", "p_id_verification_new_function_guide");
        }
        m217855D(context);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m217883p(final Dialog dialog, VerificationCenter verificationCenter, final Act act) {
        dialog.m20475p0("上传中…");
        dialog.m20463X().setClickable(false);
        CoreModule.f17545c.f19552B0.m31616o4(verificationCenter).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.tbi0
            @Override // p149l.e30
            public final void call(Object obj) {
                zbi0.m217852A(dialog, act, (roj0) obj);
            }
        }, new e30() { // from class: l.ubi0
            @Override // p149l.e30
            public final void call(Object obj) {
                zbi0.m217868a(dialog, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m217886s(Act act, Dialog dialog) {
        oyx.m166736j(act, true, true);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m217891x(Act act) {
        m217854C(act);
        zvf0.m220399u("e_id_verification_explain_confirm_click", "p_id_verification_icon_explain_guide_unverified", vwb.m200311Y("id_verification_button_state", "waiting_active"));
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m217892y(boolean z) {
        if (z) {
            zvf0.m220396r("e_id_verification_other_guide_cancel_click", "p_id_verification_other_guide");
        } else {
            zvf0.m220396r("e_idVerification_newFunction_guide_cancle_click", "p_id_verification_new_function_guide");
        }
    }
}
