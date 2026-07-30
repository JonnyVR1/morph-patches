package com.p051p1.mobile.putong.core.util;

import android.R;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.android.p053ui.label.LabelModule;
import com.p051p1.mobile.android.p053ui.label.LabelStyle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.label.CoreLabelTag;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.afc0;
import p153l.bnl0;
import p153l.gta;
import p153l.i4g0;
import p153l.j26;
import p153l.jyb;
import p153l.l4g0;
import p153l.l51;
import p153l.lyh0;
import p153l.odc0;
import p153l.p9r;
import p153l.pej0;
import p153l.pk50;
import p153l.qa00;
import p153l.t8r;
import p153l.tbc0;
import p153l.uqb0;
import p153l.w1e;

/* JADX INFO: loaded from: classes12.dex */
public class CertificationUtil {

    public enum CertificationIconStyle {
        CARD,
        PROFILE,
        BOTTOM_SHEET,
        IM,
        IM_EXP
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m59326b(pej0 pej0Var, View view) {
        i4g0.m138520r("e_verification_explain_close", "p_verification_explain");
        pej0Var.m176562T();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m59327c(Act act, View view) {
        i4g0.m138520r("e_verification_explain_go", "p_verification_explain");
        act.startActivity(CoreModule.m30933P().m143405a().mo34489dn(act, false, BannerLoc.popup));
    }

    /* JADX INFO: renamed from: e */
    public static int m59329e(User user) {
        if (gta.m132210e().m132214d().mo34702I4()) {
            if (user.isIdAndPicBothVerified()) {
                return tbc0.f172887j;
            }
            if (user.isPicVerificationVerified()) {
                return tbc0.f172880c;
            }
            return -1;
        }
        if (gta.m132210e().m132214d().mo34943w()) {
            if (user.isIdAndPicBothVerified()) {
                return tbc0.f172886i;
            }
            if (user.isPicVerificationVerified()) {
                return tbc0.f172879b;
            }
            return -1;
        }
        if (user.isIdAndPicBothVerified()) {
            return tbc0.f172892o;
        }
        if (user.isPicVerificationVerified()) {
            return tbc0.f172885h;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static View m59330f(Act act, User user, CertificationIconStyle certificationIconStyle) {
        return m59331g(act, user, certificationIconStyle, false);
    }

    /* JADX INFO: renamed from: g */
    public static View m59331g(Act act, User user, CertificationIconStyle certificationIconStyle, boolean z) {
        int i;
        int i2;
        int i3;
        if (gta.m132210e().m132214d().mo34702I4() && certificationIconStyle != CertificationIconStyle.BOTTOM_SHEET) {
            LabelStyle labelStyle = LabelStyle.MAX;
            if (certificationIconStyle != CertificationIconStyle.CARD) {
                if (certificationIconStyle == CertificationIconStyle.PROFILE) {
                    labelStyle = LabelStyle.MIDDLE;
                } else if (certificationIconStyle == CertificationIconStyle.IM || certificationIconStyle == CertificationIconStyle.IM_EXP) {
                    labelStyle = LabelStyle.SMALL;
                }
            }
            CommonLabelView commonLabelViewM22076a = CommonLabelView.m22076a(act, labelStyle);
            if (user.isIdAndPicBothVerified()) {
                commonLabelViewM22076a.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                return commonLabelViewM22076a;
            }
            if (user.isPicVerificationVerified()) {
                commonLabelViewM22076a.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                return commonLabelViewM22076a;
            }
            if (!user.isStudentVerified()) {
                return null;
            }
            commonLabelViewM22076a.m22083g(t8r.m189686a().m189688c(LabelModule.CORE, CoreLabelTag.STUDENT));
            return commonLabelViewM22076a;
        }
        VLinear vLinear = (VLinear) p9r.m171370a(act).inflate(afc0.f70895b, (ViewGroup) null, false);
        VImage vImage = (VImage) vLinear.findViewById(odc0.f146878q);
        VText vText = (VText) vLinear.findViewById(odc0.f146882u);
        vText.setTypeface(lyh0.m156283c(3), 1);
        Drawable drawableM143192e = j26.m143192e(act, tbc0.f172894q);
        if (!(drawableM143192e instanceof GradientDrawable)) {
            return null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawableM143192e;
        CertificationIconStyle certificationIconStyle2 = CertificationIconStyle.CARD;
        if (certificationIconStyle == certificationIconStyle2 || certificationIconStyle == CertificationIconStyle.BOTTOM_SHEET) {
            i = tbc0.f172890m;
            i2 = tbc0.f172883f;
            i3 = tbc0.f172897t;
            if (z) {
                i = tbc0.f172891n;
                i2 = tbc0.f172884g;
                i3 = tbc0.f172898u;
            }
            gradientDrawable.setCornerRadius(qa00.m175859d(6.0f));
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            i = tbc0.f172889l;
            i2 = tbc0.f172882e;
            i3 = tbc0.f172896s;
            gradientDrawable.setCornerRadius(qa00.m175859d(6.0f));
        } else {
            if (certificationIconStyle != CertificationIconStyle.IM) {
                return null;
            }
            i = tbc0.f172888k;
            i2 = tbc0.f172881d;
            i3 = tbc0.f172895r;
            gradientDrawable.setCornerRadius(qa00.m175859d(4.0f));
        }
        if (user.isIdAndPicBothVerified()) {
            vImage.setImageResource(i);
            vText.setText("实名·头像本人");
            gradientDrawable.setColor(Color.parseColor("#FFFFBB00"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#FFDF8D"));
                vText.setTextColor(Color.parseColor("#774800"));
            }
        } else if (user.isPicVerificationVerified()) {
            vImage.setImageResource(i2);
            vText.setText("头像本人");
            gradientDrawable.setColor(Color.parseColor("#FF2BCCFF"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#ACEBFF"));
                vText.setTextColor(Color.parseColor("#0C7292"));
            }
        } else {
            if (!user.isStudentVerified()) {
                return null;
            }
            vImage.setImageResource(i3);
            vText.setText("学生");
            gradientDrawable.setColor(Color.parseColor("#FF00DAE3"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#AAFCFF"));
                vText.setTextColor(Color.parseColor("#00858A"));
            }
        }
        vLinear.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vLinear.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        ViewGroup.LayoutParams layoutParams2 = vImage.getLayoutParams();
        if (certificationIconStyle == certificationIconStyle2 || certificationIconStyle == CertificationIconStyle.BOTTOM_SHEET) {
            layoutParams2.width = qa00.m175859d(16.0f);
            layoutParams2.height = qa00.m175859d(16.0f);
            vText.setTextSize(12.0f);
            layoutParams.height = qa00.m175859d(24.0f);
            vLinear.setPadding(qa00.m175859d(6.0f), 0, qa00.m175859d(8.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            layoutParams2.width = qa00.m175859d(12.0f);
            layoutParams2.height = qa00.m175859d(12.0f);
            vText.setTextSize(10.0f);
            layoutParams.height = qa00.m175859d(20.0f);
            vLinear.setPadding(qa00.m175859d(5.0f), 0, qa00.m175859d(6.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.IM) {
            layoutParams2.width = qa00.m175859d(10.0f);
            layoutParams2.height = qa00.m175859d(10.0f);
            vText.setTextSize(9.0f);
            layoutParams.height = qa00.m175859d(14.0f);
            vLinear.setPadding(qa00.m175859d(2.0f), 0, qa00.m175859d(5.0f), 0);
        }
        vLinear.setLayoutParams(layoutParams);
        vImage.setLayoutParams(layoutParams2);
        return vLinear;
    }

    /* JADX INFO: renamed from: h */
    public static int m59332h(User user) {
        return m59333i(user, false);
    }

    /* JADX INFO: renamed from: i */
    public static int m59333i(User user, boolean z) {
        if (user.isIdAndPicBothVerified()) {
            return gta.m132210e().m132214d().mo34702I4() ? tbc0.f172863M : tbc0.f172892o;
        }
        if (user.isPicVerificationVerified()) {
            return gta.m132210e().m132214d().mo34702I4() ? tbc0.f172859I : tbc0.f172885h;
        }
        if (user.isStudentVerified()) {
            return gta.m132210e().m132214d().mo34702I4() ? tbc0.f172867Q : tbc0.f172899v;
        }
        if (z || !user.isMe()) {
            return -1;
        }
        return gta.m132210e().m132214d().mo34702I4() ? tbc0.f172873W : tbc0.f172893p;
    }

    /* JADX INFO: renamed from: j */
    public static void m59334j(@NonNull Act act, @NonNull User user) {
        if (!user.isStudentVerified() || user.isIdCardVerified() || user.isPicVerificationVerified()) {
            if (!user.isMe()) {
                m59335k(act, user);
            } else if (user.isIdCardVerified()) {
                pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            } else if (user.isPicVerificationVerified()) {
                pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m59335k(final Act act, User user) {
        if (act == null || user == null || user.isMe()) {
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_verification_explain", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("receiver_user_id", user.f56859id));
        w1e.m204402f(l4g0VarM204399c);
        final pej0 pej0Var = new pej0(act);
        pej0Var.setCanceledOnTouchOutside(true);
        pej0Var.setContentView(afc0.f70894a);
        pej0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qr4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        final Window window = pej0Var.getWindow();
        if (NullChecker.m82486a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(odc0.f146877p)).setBackgroundResource(tbc0.f172878a0);
            l51.m152887G(new Runnable() { // from class: l.rr4
                @Override // java.lang.Runnable
                public final void run() {
                    window.setWindowAnimations(lgc0.f131950a);
                }
            });
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) pej0Var.findViewById(odc0.f146866e);
        View viewFindViewById = pej0Var.findViewById(odc0.f146868g);
        VDraweeView vDraweeView = (VDraweeView) pej0Var.findViewById(odc0.f146862a);
        VLinear vLinear = (VLinear) pej0Var.findViewById(odc0.f146867f);
        VText vText = (VText) pej0Var.findViewById(odc0.f146883v);
        VText vText2 = (VText) pej0Var.findViewById(odc0.f146880s);
        View viewFindViewById2 = pej0Var.findViewById(odc0.f146864c);
        VText vText3 = (VText) pej0Var.findViewById(odc0.f146865d);
        View viewFindViewById3 = pej0Var.findViewById(odc0.f146863b);
        if (constraintLayout == null || viewFindViewById == null || vDraweeView == null || vLinear == null || vText == null || vText2 == null || viewFindViewById3 == null || viewFindViewById2 == null) {
            return;
        }
        uqb0.f180374G.m127098D(viewFindViewById3, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRRTU9USU0yWVRaRUYzVEhSQllPRktLWVJGR1M3TDE0IiwidyI6NDY4LCJoIjo2ODMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0ODI4MzU3NzI2ODU2Njc3NjMzfQ.webp");
        vText.setTypeface(lyh0.m156283c(3), 1);
        vText3.setTypeface(lyh0.m156283c(3), 1);
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.sr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m59326b(pej0Var, view);
            }
        });
        uqb0.f180374G.m127115L0(vDraweeView, user.m61308fp().profileMiddle().formatted());
        View viewM59330f = m59330f(act, user, CertificationIconStyle.BOTTOM_SHEET);
        if (viewM59330f == null) {
            return;
        }
        vLinear.addView(viewM59330f);
        User userMe_ = CoreModule.m30930K().me_();
        if (user.isIdAndPicBothVerified()) {
            vText.setText(String.format("%s已完成实名和头像认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vText2.setText("头像是用户真实照片，已通过人脸对比");
            bnl0.m105524M(viewFindViewById2, !userMe_.isIdAndPicBothVerified());
        } else {
            if (!user.isPicVerificationVerified()) {
                return;
            }
            vText.setText(String.format("%s已完成头像本人认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vText2.setText("头像是用户真实照片，已通过人脸对比");
            bnl0.m105524M(viewFindViewById2, !userMe_.isPicVerificationVerified());
        }
        bnl0.m105548c0(constraintLayout, qa00.m175859d(bnl0.m105529O0(viewFindViewById2) ? 12.0f : 0.0f));
        bnl0.m105509E0(viewFindViewById2, new View.OnClickListener() { // from class: l.tr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m59327c(act, view);
            }
        });
        i4g0.m138526x("e_verification_explain_go", "p_verification_explain");
        pej0Var.show();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m59336l() {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4)) {
            return TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified");
        }
        return false;
    }
}
