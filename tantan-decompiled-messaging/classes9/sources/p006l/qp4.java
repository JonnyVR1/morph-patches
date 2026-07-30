package p006l;

import android.content.DialogInterface;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.cwf0;
import l.d30;
import l.dd80;
import l.i0e;
import l.ic50;
import l.yk5;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class qp4 {

    /* JADX INFO: renamed from: l.qp4$a */
    public class C1183a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f19958a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f19959b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f19960c;

        public C1183a(Act act, Runnable runnable, boolean z) {
            this.f19958a = act;
            this.f19959b = runnable;
            this.f19960c = z;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m22315a(Runnable runnable, Act act, boolean z, yk5 yk5Var, View view) {
            if (runnable == null) {
                tvf.m24830i(act, "dialog", true, z);
            } else {
                runnable.run();
            }
            yk5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final yk5 yk5Var = new yk5(this.f19958a, 1);
            final Runnable runnable = this.f19959b;
            final Act act = this.f19958a;
            final boolean z = this.f19960c;
            yk5Var.D(new View.OnClickListener() { // from class: l.pp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qp4.C1183a.m22315a(runnable, act, z, yk5Var, view2);
                }
            });
            yk5Var.show();
            ((TextView) view).setHighlightColor(this.f19958a.getResources().getColor(w0c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.qp4$b */
    public class C1184b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f19961a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f19962b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f19963c;

        public C1184b(Act act, String str, String str2) {
            this.f19961a = act;
            this.f19962b = str;
            this.f19963c = str2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m22316a(Act act, String str, String str2, yk5 yk5Var, View view) {
            tvf.m24823b(act, str, TextUtils.equals(str, "verification_center"), str2);
            yk5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final yk5 yk5Var = new yk5(this.f19961a, 1);
            final Act act = this.f19961a;
            final String str = this.f19962b;
            final String str2 = this.f19963c;
            yk5Var.D(new View.OnClickListener() { // from class: l.rp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qp4.C1184b.m22316a(act, str, str2, yk5Var, view2);
                }
            });
            yk5Var.show();
            ((TextView) view).setHighlightColor(this.f19961a.getResources().getColor(w0c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22300c(d30 d30Var) {
        zvf0.r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m22301d(Act act, String str, String str2) {
        tvf.m24823b(act, str, TextUtils.equals(str, "verification_center"), str2);
        zvf0.r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m22304g(Runnable runnable, Act act, boolean z) {
        if (runnable != null) {
            runnable.run();
        }
        tvf.m24830i(act, "dialog", true, z);
        zvf0.r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: i */
    public static void m22306i(Act act) {
        m22307j(act, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m22307j(final Act act, final boolean z, final Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C1183a(act, runnable, z), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final cwf0 cwf0VarC = i0e.c("p_verification_center_policy_popup", Dialog.class.getName());
        new dd80.a(act).y0("温馨提示").t0(spannableStringBuilder).v0(LinkMovementMethod.getInstance()).c0("同意并继续", new Runnable() { // from class: l.lp4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m22304g(runnable, act, z);
            }
        }).X("不同意", new Runnable() { // from class: l.mp4
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
            }
        }).P(false).M(true).o0(new DialogInterface.OnShowListener() { // from class: l.np4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.op4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: k */
    public static void m22308k(@NonNull Act act, @NonNull String str) {
        m22309l(act, str, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m22309l(@NonNull Act act, @NonNull String str, String str2) {
        m22310m(act, str, str2, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m22310m(@NonNull final Act act, @NonNull final String str, final String str2, final d30 d30Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C1184b(act, str, str2), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final cwf0 cwf0VarC = i0e.c("p_verification_center_policy_popup", Dialog.class.getName());
        new dd80.a(act).y0("温馨提示").t0(spannableStringBuilder).v0(LinkMovementMethod.getInstance()).c0("同意并继续", new Runnable() { // from class: l.hp4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m22301d(act, str, str2);
            }
        }).X("不同意", new Runnable() { // from class: l.ip4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m22300c(d30Var);
            }
        }).P(false).M(true).o0(new DialogInterface.OnShowListener() { // from class: l.jp4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.kp4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: n */
    public static void m22311n(Act act) {
        StudentVerificationStatus studentVerificationStatus;
        VerificationCenter verificationCenterM3548q4 = CoreModule.f1534c.f3541B0.m3548q4();
        StudentVerificationStatus studentVerificationStatus2 = null;
        if (verificationCenterM3548q4 != null) {
            studentVerificationStatus = verificationCenterM3548q4.picVerificationInfo.status;
            IdCardVerificationInfo idCardVerificationInfo = verificationCenterM3548q4.idCard;
            if (idCardVerificationInfo != null) {
                studentVerificationStatus2 = idCardVerificationInfo.status;
            }
        } else {
            studentVerificationStatus = null;
        }
        if (!TEnum.equals(studentVerificationStatus2, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "pending") || TEnum.equals(studentVerificationStatus2, "invalid")) {
                zbi0.m28658P(act, studentVerificationStatus2, studentVerificationStatus);
                return;
            } else {
                zbi0.m28648F(act, false);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "verified") || TEnum.equals(studentVerificationStatus, "pending")) {
            zbi0.m28658P(act, studentVerificationStatus2, studentVerificationStatus);
        } else {
            if (rwk0.m23354m(act, 1, "verification_center")) {
                return;
            }
            zbi0.m28658P(act, studentVerificationStatus2, studentVerificationStatus);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m22312o(@NonNull Act act) {
        VerificationCenter verificationCenterM3548q4 = CoreModule.f1534c.f3541B0.m3548q4();
        StudentVerificationStatus studentVerificationStatus = verificationCenterM3548q4 != null ? verificationCenterM3548q4.picVerificationInfo.status : null;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            ic50.j().f().s0(act, OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m22313p(act);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            ic50.j().f().s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m22314q(act);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m22313p(Act act) {
        if (rwk0.m23354m(act, 1, "verification_center")) {
            return;
        }
        ic50.j().f().s0(act, OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
    }

    /* JADX INFO: renamed from: q */
    public static void m22314q(Act act) {
        if (rwk0.m23354m(act, 1, "verification_center")) {
            return;
        }
        m22306i(act);
    }
}
