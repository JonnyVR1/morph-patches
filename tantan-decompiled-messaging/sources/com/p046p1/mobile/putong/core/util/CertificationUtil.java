package com.p046p1.mobile.putong.core.util;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.android.p048ui.label.LabelModule;
import com.p046p1.mobile.android.p048ui.label.LabelStyle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.label.CoreLabelTag;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.cwf0;
import p149l.e16;
import p149l.e51;
import p149l.eqh0;
import p149l.i0e;
import p149l.i5c0;
import p149l.ic50;
import p149l.l5j0;
import p149l.n3c0;
import p149l.o7r;
import p149l.qib0;
import p149l.s6r;
import p149l.t100;
import p149l.ura;
import p149l.v6c0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class CertificationUtil {

    public enum CertificationIconStyle {
        CARD,
        PROFILE,
        BOTTOM_SHEET,
        IM,
        IM_EXP
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m58143b(l5j0 l5j0Var, View view) {
        zvf0.m220396r("e_verification_explain_close", "p_verification_explain");
        l5j0Var.m101651T();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58144c(Act act, View view) {
        zvf0.m220396r("e_verification_explain_go", "p_verification_explain");
        act.startActivity(CoreModule.m29935P().m94651a().mo33486dn(act, false, BannerLoc.popup));
    }

    /* JADX INFO: renamed from: e */
    public static int m58146e(User user) {
        if (ura.m195053e().m195057d().mo33699I4()) {
            if (user.isIdAndPicBothVerified()) {
                return n3c0.f136972j;
            }
            if (user.isPicVerificationVerified()) {
                return n3c0.f136965c;
            }
            return -1;
        }
        if (ura.m195053e().m195057d().mo33940w()) {
            if (user.isIdAndPicBothVerified()) {
                return n3c0.f136971i;
            }
            if (user.isPicVerificationVerified()) {
                return n3c0.f136964b;
            }
            return -1;
        }
        if (user.isIdAndPicBothVerified()) {
            return n3c0.f136977o;
        }
        if (user.isPicVerificationVerified()) {
            return n3c0.f136970h;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static View m58147f(Act act, User user, CertificationIconStyle certificationIconStyle) {
        return m58148g(act, user, certificationIconStyle, false);
    }

    /* JADX INFO: renamed from: g */
    public static View m58148g(Act act, User user, CertificationIconStyle certificationIconStyle, boolean z) {
        int i;
        int i2;
        int i3;
        if (ura.m195053e().m195057d().mo33699I4() && certificationIconStyle != CertificationIconStyle.BOTTOM_SHEET) {
            LabelStyle labelStyle = LabelStyle.MAX;
            if (certificationIconStyle != CertificationIconStyle.CARD) {
                if (certificationIconStyle == CertificationIconStyle.PROFILE) {
                    labelStyle = LabelStyle.MIDDLE;
                } else if (certificationIconStyle == CertificationIconStyle.IM || certificationIconStyle == CertificationIconStyle.IM_EXP) {
                    labelStyle = LabelStyle.SMALL;
                }
            }
            CommonLabelView commonLabelViewM21077a = CommonLabelView.m21077a(act, labelStyle);
            if (user.isIdAndPicBothVerified()) {
                commonLabelViewM21077a.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                return commonLabelViewM21077a;
            }
            if (user.isPicVerificationVerified()) {
                commonLabelViewM21077a.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                return commonLabelViewM21077a;
            }
            if (!user.isStudentVerified()) {
                return null;
            }
            commonLabelViewM21077a.m21084g(s6r.m182454a().m182456c(LabelModule.CORE, CoreLabelTag.STUDENT));
            return commonLabelViewM21077a;
        }
        VLinear vLinear = (VLinear) o7r.m163037a(act).inflate(v6c0.f180179b, (ViewGroup) null, false);
        VImage vImage = (VImage) vLinear.findViewById(i5c0.f111556q);
        VText vText = (VText) vLinear.findViewById(i5c0.f111560u);
        vText.setTypeface(eqh0.m117752c(3), 1);
        Drawable drawableM114377e = e16.m114377e(act, n3c0.f136979q);
        if (!(drawableM114377e instanceof GradientDrawable)) {
            return null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawableM114377e;
        CertificationIconStyle certificationIconStyle2 = CertificationIconStyle.CARD;
        if (certificationIconStyle == certificationIconStyle2 || certificationIconStyle == CertificationIconStyle.BOTTOM_SHEET) {
            i = n3c0.f136975m;
            i2 = n3c0.f136968f;
            i3 = n3c0.f136982t;
            if (z) {
                i = n3c0.f136976n;
                i2 = n3c0.f136969g;
                i3 = n3c0.f136983u;
            }
            gradientDrawable.setCornerRadius(t100.m186890d(6.0f));
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            i = n3c0.f136974l;
            i2 = n3c0.f136967e;
            i3 = n3c0.f136981s;
            gradientDrawable.setCornerRadius(t100.m186890d(6.0f));
        } else {
            if (certificationIconStyle != CertificationIconStyle.IM) {
                return null;
            }
            i = n3c0.f136973k;
            i2 = n3c0.f136966d;
            i3 = n3c0.f136980r;
            gradientDrawable.setCornerRadius(t100.m186890d(4.0f));
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
            layoutParams2.width = t100.m186890d(16.0f);
            layoutParams2.height = t100.m186890d(16.0f);
            vText.setTextSize(12.0f);
            layoutParams.height = t100.m186890d(24.0f);
            vLinear.setPadding(t100.m186890d(6.0f), 0, t100.m186890d(8.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            layoutParams2.width = t100.m186890d(12.0f);
            layoutParams2.height = t100.m186890d(12.0f);
            vText.setTextSize(10.0f);
            layoutParams.height = t100.m186890d(20.0f);
            vLinear.setPadding(t100.m186890d(5.0f), 0, t100.m186890d(6.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.IM) {
            layoutParams2.width = t100.m186890d(10.0f);
            layoutParams2.height = t100.m186890d(10.0f);
            vText.setTextSize(9.0f);
            layoutParams.height = t100.m186890d(14.0f);
            vLinear.setPadding(t100.m186890d(2.0f), 0, t100.m186890d(5.0f), 0);
        }
        vLinear.setLayoutParams(layoutParams);
        vImage.setLayoutParams(layoutParams2);
        return vLinear;
    }

    /* JADX INFO: renamed from: h */
    public static int m58149h(User user) {
        return m58150i(user, false);
    }

    /* JADX INFO: renamed from: i */
    public static int m58150i(User user, boolean z) {
        if (user.isIdAndPicBothVerified()) {
            return ura.m195053e().m195057d().mo33699I4() ? n3c0.f136948M : n3c0.f136977o;
        }
        if (user.isPicVerificationVerified()) {
            return ura.m195053e().m195057d().mo33699I4() ? n3c0.f136944I : n3c0.f136970h;
        }
        if (user.isStudentVerified()) {
            return ura.m195053e().m195057d().mo33699I4() ? n3c0.f136952Q : n3c0.f136984v;
        }
        if (z || !user.isMe()) {
            return -1;
        }
        return ura.m195053e().m195057d().mo33699I4() ? n3c0.f136958W : n3c0.f136978p;
    }

    /* JADX INFO: renamed from: j */
    public static void m58151j(@NonNull Act act, @NonNull User user) {
        if (!user.isStudentVerified() || user.isIdCardVerified() || user.isPicVerificationVerified()) {
            if (!user.isMe()) {
                m58152k(act, user);
            } else if (user.isIdCardVerified()) {
                ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            } else if (user.isPicVerificationVerified()) {
                ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m58152k(final Act act, User user) {
        if (act == null || user == null || user.isMe()) {
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_verification_explain", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("receiver_user_id", user.f56011id));
        i0e.m133797f(cwf0VarM133794c);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(v6c0.f180178a);
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        final Window window = l5j0Var.getWindow();
        if (NullChecker.m81303a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.f111555p)).setBackgroundResource(n3c0.f136963a0);
            e51.m114742G(new Runnable() { // from class: l.sq4
                @Override // java.lang.Runnable
                public final void run() {
                    window.setWindowAnimations(g8c0.f101490a);
                }
            });
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) l5j0Var.findViewById(i5c0.f111544e);
        View viewFindViewById = l5j0Var.findViewById(i5c0.f111546g);
        VDraweeView vDraweeView = (VDraweeView) l5j0Var.findViewById(i5c0.f111540a);
        VLinear vLinear = (VLinear) l5j0Var.findViewById(i5c0.f111545f);
        VText vText = (VText) l5j0Var.findViewById(i5c0.f111561v);
        VText vText2 = (VText) l5j0Var.findViewById(i5c0.f111558s);
        View viewFindViewById2 = l5j0Var.findViewById(i5c0.f111542c);
        VText vText3 = (VText) l5j0Var.findViewById(i5c0.f111543d);
        View viewFindViewById3 = l5j0Var.findViewById(i5c0.f111541b);
        if (constraintLayout == null || viewFindViewById == null || vDraweeView == null || vLinear == null || vText == null || vText2 == null || viewFindViewById3 == null || viewFindViewById2 == null) {
            return;
        }
        qib0.f154691G.m102314D(viewFindViewById3, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRRTU9USU0yWVRaRUYzVEhSQllPRktLWVJGR1M3TDE0IiwidyI6NDY4LCJoIjo2ODMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0ODI4MzU3NzI2ODU2Njc3NjMzfQ.webp");
        vText.setTypeface(eqh0.m117752c(3), 1);
        vText3.setTypeface(eqh0.m117752c(3), 1);
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.tq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m58143b(l5j0Var, view);
            }
        });
        qib0.f154691G.m102331L0(vDraweeView, user.m60124fp().profileMiddle().formatted());
        View viewM58147f = m58147f(act, user, CertificationIconStyle.BOTTOM_SHEET);
        if (viewM58147f == null) {
            return;
        }
        vLinear.addView(viewM58147f);
        User userMe_ = CoreModule.m29932K().me_();
        if (user.isIdAndPicBothVerified()) {
            vText.setText(String.format("%s已完成实名和头像认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vText2.setText("头像是用户真实照片，已通过人脸对比");
            xdl0.m208344M(viewFindViewById2, !userMe_.isIdAndPicBothVerified());
        } else {
            if (!user.isPicVerificationVerified()) {
                return;
            }
            vText.setText(String.format("%s已完成头像本人认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vText2.setText("头像是用户真实照片，已通过人脸对比");
            xdl0.m208344M(viewFindViewById2, !userMe_.isPicVerificationVerified());
        }
        xdl0.m208368c0(constraintLayout, t100.m186890d(xdl0.m208349O0(viewFindViewById2) ? 12.0f : 0.0f));
        xdl0.m208329E0(viewFindViewById2, new View.OnClickListener() { // from class: l.uq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m58144c(act, view);
            }
        });
        zvf0.m220402x("e_verification_explain_go", "p_verification_explain");
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m58153l() {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4)) {
            return TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified");
        }
        return false;
    }
}
