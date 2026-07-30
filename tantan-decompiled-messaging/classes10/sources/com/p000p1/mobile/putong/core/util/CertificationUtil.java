package com.p000p1.mobile.putong.core.util;

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
import com.p000p1.mobile.putong.core.data.VerificationCenter;
import com.p000p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.ui.label.CommonLabelView;
import com.p1.mobile.android.ui.label.LabelModule;
import com.p1.mobile.android.ui.label.LabelStyle;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.label.CoreLabelTag;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.cwf0;
import l.e16;
import l.e51;
import l.eqh0;
import l.g8c0;
import l.i0e;
import l.i5c0;
import l.ic50;
import l.j760;
import l.l5j0;
import l.n3c0;
import l.o7r;
import l.qib0;
import l.s6r;
import l.t100;
import l.ura;
import l.v6c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CertificationUtil {

    public enum CertificationIconStyle {
        CARD,
        PROFILE,
        BOTTOM_SHEET,
        IM,
        IM_EXP
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3551b(l5j0 l5j0Var, View view) {
        zvf0.r("e_verification_explain_close", "p_verification_explain");
        l5j0Var.dismiss();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3552c(Act act, View view) {
        zvf0.r("e_verification_explain_go", "p_verification_explain");
        act.startActivity(CoreModule.P().a().dn(act, false, "popup"));
    }

    /* JADX INFO: renamed from: e */
    public static int m3554e(User user) {
        if (ura.e().d().I4()) {
            if (user.isIdAndPicBothVerified()) {
                return n3c0.j;
            }
            if (user.isPicVerificationVerified()) {
                return n3c0.c;
            }
            return -1;
        }
        if (ura.e().d().w()) {
            if (user.isIdAndPicBothVerified()) {
                return n3c0.i;
            }
            if (user.isPicVerificationVerified()) {
                return n3c0.b;
            }
            return -1;
        }
        if (user.isIdAndPicBothVerified()) {
            return n3c0.o;
        }
        if (user.isPicVerificationVerified()) {
            return n3c0.h;
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static View m3555f(Act act, User user, CertificationIconStyle certificationIconStyle) {
        return m3556g(act, user, certificationIconStyle, false);
    }

    /* JADX INFO: renamed from: g */
    public static View m3556g(Act act, User user, CertificationIconStyle certificationIconStyle, boolean z) {
        int i;
        int i2;
        int i3;
        if (ura.e().d().I4() && certificationIconStyle != CertificationIconStyle.BOTTOM_SHEET) {
            LabelStyle labelStyle = LabelStyle.MAX;
            if (certificationIconStyle != CertificationIconStyle.CARD) {
                if (certificationIconStyle == CertificationIconStyle.PROFILE) {
                    labelStyle = LabelStyle.MIDDLE;
                } else if (certificationIconStyle == CertificationIconStyle.IM || certificationIconStyle == CertificationIconStyle.IM_EXP) {
                    labelStyle = LabelStyle.SMALL;
                }
            }
            CommonLabelView commonLabelViewA = CommonLabelView.a(act, labelStyle);
            if (user.isIdAndPicBothVerified()) {
                commonLabelViewA.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.ID_VERIFIED));
                return commonLabelViewA;
            }
            if (user.isPicVerificationVerified()) {
                commonLabelViewA.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.AVATAR_VERIFIED));
                return commonLabelViewA;
            }
            if (!user.isStudentVerified()) {
                return null;
            }
            commonLabelViewA.g(s6r.a().c(LabelModule.CORE, CoreLabelTag.STUDENT));
            return commonLabelViewA;
        }
        VLinear vLinearInflate = o7r.a(act).inflate(v6c0.b, (ViewGroup) null, false);
        VImage vImageFindViewById = vLinearInflate.findViewById(i5c0.q);
        VText vTextFindViewById = vLinearInflate.findViewById(i5c0.u);
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        Drawable drawableE = e16.e(act, n3c0.q);
        if (!(drawableE instanceof GradientDrawable)) {
            return null;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) drawableE;
        CertificationIconStyle certificationIconStyle2 = CertificationIconStyle.CARD;
        if (certificationIconStyle == certificationIconStyle2 || certificationIconStyle == CertificationIconStyle.BOTTOM_SHEET) {
            i = n3c0.m;
            i2 = n3c0.f;
            i3 = n3c0.t;
            if (z) {
                i = n3c0.n;
                i2 = n3c0.g;
                i3 = n3c0.u;
            }
            gradientDrawable.setCornerRadius(t100.d(6.0f));
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            i = n3c0.l;
            i2 = n3c0.e;
            i3 = n3c0.s;
            gradientDrawable.setCornerRadius(t100.d(6.0f));
        } else {
            if (certificationIconStyle != CertificationIconStyle.IM) {
                return null;
            }
            i = n3c0.k;
            i2 = n3c0.d;
            i3 = n3c0.r;
            gradientDrawable.setCornerRadius(t100.d(4.0f));
        }
        if (user.isIdAndPicBothVerified()) {
            vImageFindViewById.setImageResource(i);
            vTextFindViewById.setText("实名·头像本人");
            gradientDrawable.setColor(Color.parseColor("#FFFFBB00"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#FFDF8D"));
                vTextFindViewById.setTextColor(Color.parseColor("#774800"));
            }
        } else if (user.isPicVerificationVerified()) {
            vImageFindViewById.setImageResource(i2);
            vTextFindViewById.setText("头像本人");
            gradientDrawable.setColor(Color.parseColor("#FF2BCCFF"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#ACEBFF"));
                vTextFindViewById.setTextColor(Color.parseColor("#0C7292"));
            }
        } else {
            if (!user.isStudentVerified()) {
                return null;
            }
            vImageFindViewById.setImageResource(i3);
            vTextFindViewById.setText("学生");
            gradientDrawable.setColor(Color.parseColor("#FF00DAE3"));
            if (z) {
                gradientDrawable.setColor(Color.parseColor("#AAFCFF"));
                vTextFindViewById.setTextColor(Color.parseColor("#00858A"));
            }
        }
        vLinearInflate.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) vLinearInflate.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        ViewGroup.LayoutParams layoutParams2 = vImageFindViewById.getLayoutParams();
        if (certificationIconStyle == certificationIconStyle2 || certificationIconStyle == CertificationIconStyle.BOTTOM_SHEET) {
            layoutParams2.width = t100.d(16.0f);
            layoutParams2.height = t100.d(16.0f);
            vTextFindViewById.setTextSize(12.0f);
            layoutParams.height = t100.d(24.0f);
            vLinearInflate.setPadding(t100.d(6.0f), 0, t100.d(8.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.PROFILE) {
            layoutParams2.width = t100.d(12.0f);
            layoutParams2.height = t100.d(12.0f);
            vTextFindViewById.setTextSize(10.0f);
            layoutParams.height = t100.d(20.0f);
            vLinearInflate.setPadding(t100.d(5.0f), 0, t100.d(6.0f), 0);
        } else if (certificationIconStyle == CertificationIconStyle.IM) {
            layoutParams2.width = t100.d(10.0f);
            layoutParams2.height = t100.d(10.0f);
            vTextFindViewById.setTextSize(9.0f);
            layoutParams.height = t100.d(14.0f);
            vLinearInflate.setPadding(t100.d(2.0f), 0, t100.d(5.0f), 0);
        }
        vLinearInflate.setLayoutParams(layoutParams);
        vImageFindViewById.setLayoutParams(layoutParams2);
        return vLinearInflate;
    }

    /* JADX INFO: renamed from: h */
    public static int m3557h(User user) {
        return m3558i(user, false);
    }

    /* JADX INFO: renamed from: i */
    public static int m3558i(User user, boolean z) {
        if (user.isIdAndPicBothVerified()) {
            return ura.e().d().I4() ? n3c0.M : n3c0.o;
        }
        if (user.isPicVerificationVerified()) {
            return ura.e().d().I4() ? n3c0.I : n3c0.h;
        }
        if (user.isStudentVerified()) {
            return ura.e().d().I4() ? n3c0.Q : n3c0.v;
        }
        if (z || !user.isMe()) {
            return -1;
        }
        return ura.e().d().I4() ? n3c0.W : n3c0.p;
    }

    /* JADX INFO: renamed from: j */
    public static void m3559j(@NonNull Act act, @NonNull User user) {
        if (!user.isStudentVerified() || user.isIdCardVerified() || user.isPicVerificationVerified()) {
            if (!user.isMe()) {
                m3560k(act, user);
            } else if (user.isIdCardVerified()) {
                ic50.j().f().s0(act, OmsDialog.p_verification_canceled_profile_id_popup.getIdentifier());
            } else if (user.isPicVerificationVerified()) {
                ic50.j().f().s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m3560k(final Act act, User user) {
        if (act == null || user == null || user.isMe()) {
            return;
        }
        final cwf0 cwf0VarC = i0e.c("p_verification_explain", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("receiver_user_id", ((DbObject) user).id)});
        i0e.f(cwf0VarC);
        final l5j0 l5j0Var = new l5j0(act);
        l5j0Var.setCanceledOnTouchOutside(true);
        l5j0Var.setContentView(v6c0.a);
        l5j0Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        final Window window = l5j0Var.getWindow();
        if (NullChecker.a(window)) {
            ((FrameLayout) window.findViewById(R.id.content).findViewById(i5c0.p)).setBackgroundResource(n3c0.a0);
            e51.G(new Runnable() { // from class: l.sq4
                @Override // java.lang.Runnable
                public final void run() {
                    window.setWindowAnimations(g8c0.a);
                }
            });
        }
        ConstraintLayout constraintLayoutFindViewById = l5j0Var.findViewById(i5c0.e);
        View viewFindViewById = l5j0Var.findViewById(i5c0.g);
        VDraweeView vDraweeViewFindViewById = l5j0Var.findViewById(i5c0.a);
        VLinear vLinearFindViewById = l5j0Var.findViewById(i5c0.f);
        VText vTextFindViewById = l5j0Var.findViewById(i5c0.v);
        VText vTextFindViewById2 = l5j0Var.findViewById(i5c0.s);
        View viewFindViewById2 = l5j0Var.findViewById(i5c0.c);
        VText vTextFindViewById3 = l5j0Var.findViewById(i5c0.d);
        View viewFindViewById3 = l5j0Var.findViewById(i5c0.b);
        if (constraintLayoutFindViewById == null || viewFindViewById == null || vDraweeViewFindViewById == null || vLinearFindViewById == null || vTextFindViewById == null || vTextFindViewById2 == null || viewFindViewById3 == null || viewFindViewById2 == null) {
            return;
        }
        qib0.G.D(viewFindViewById3, "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjRRTU9USU0yWVRaRUYzVEhSQllPRktLWVJGR1M3TDE0IiwidyI6NDY4LCJoIjo2ODMsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0ODI4MzU3NzI2ODU2Njc3NjMzfQ.webp");
        vTextFindViewById.setTypeface(eqh0.c(3), 1);
        vTextFindViewById3.setTypeface(eqh0.c(3), 1);
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.tq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m3551b(l5j0Var, view);
            }
        });
        qib0.G.L0(vDraweeViewFindViewById, user.fp().profileMiddle().formatted());
        View viewM3555f = m3555f(act, user, CertificationIconStyle.BOTTOM_SHEET);
        if (viewM3555f == null) {
            return;
        }
        vLinearFindViewById.addView(viewM3555f);
        User userMe_ = CoreModule.K().me_();
        if (user.isIdAndPicBothVerified()) {
            vTextFindViewById.setText(String.format("%s已完成实名和头像认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vTextFindViewById2.setText("头像是用户真实照片，已通过人脸对比");
            xdl0.M(viewFindViewById2, !userMe_.isIdAndPicBothVerified());
        } else {
            if (!user.isPicVerificationVerified()) {
                return;
            }
            vTextFindViewById.setText(String.format("%s已完成头像本人认证", TEnum.equals(user.gender, "male") ? "他" : "她"));
            vTextFindViewById2.setText("头像是用户真实照片，已通过人脸对比");
            xdl0.M(viewFindViewById2, !userMe_.isPicVerificationVerified());
        }
        xdl0.c0(constraintLayoutFindViewById, t100.d(xdl0.O0(viewFindViewById2) ? 12.0f : 0.0f));
        xdl0.E0(viewFindViewById2, new View.OnClickListener() { // from class: l.uq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CertificationUtil.m3552c(act, view);
            }
        });
        zvf0.x("e_verification_explain_go", "p_verification_explain");
        l5j0Var.show();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m3561l() {
        VerificationCenter verificationCenterK4 = CoreModule.c.B0.k4();
        if (NullChecker.a(verificationCenterK4)) {
            return TEnum.equals(verificationCenterK4.picVerificationInfo.status, "pending") || TEnum.equals(verificationCenterK4.picVerificationInfo.status, "verified");
        }
        return false;
    }
}
