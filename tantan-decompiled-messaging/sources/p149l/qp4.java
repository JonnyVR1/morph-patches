package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes9.dex */
public class qp4 {

    /* JADX INFO: renamed from: l.qp4$a */
    public class C19551a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f155669a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f155670b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f155671c;

        public C19551a(Act act, Runnable runnable, boolean z) {
            this.f155669a = act;
            this.f155670b = runnable;
            this.f155671c = z;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m175812a(Runnable runnable, Act act, boolean z, yk5 yk5Var, View view) {
            if (runnable == null) {
                tvf.m190731i(act, OMSTemplateType.dialog, true, z);
            } else {
                runnable.run();
            }
            yk5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final yk5 yk5Var = new yk5(this.f155669a, 1);
            final Runnable runnable = this.f155670b;
            final Act act = this.f155669a;
            final boolean z = this.f155671c;
            yk5Var.m215118D(new View.OnClickListener() { // from class: l.pp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qp4.C19551a.m175812a(runnable, act, z, yk5Var, view2);
                }
            });
            yk5Var.show();
            ((TextView) view).setHighlightColor(this.f155669a.getResources().getColor(w0c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.qp4$b */
    public class C19552b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f155672a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f155673b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f155674c;

        public C19552b(Act act, String str, String str2) {
            this.f155672a = act;
            this.f155673b = str;
            this.f155674c = str2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m175813a(Act act, String str, String str2, yk5 yk5Var, View view) {
            tvf.m190724b(act, str, TextUtils.equals(str, "verification_center"), str2);
            yk5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final yk5 yk5Var = new yk5(this.f155672a, 1);
            final Act act = this.f155672a;
            final String str = this.f155673b;
            final String str2 = this.f155674c;
            yk5Var.m215118D(new View.OnClickListener() { // from class: l.rp4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    qp4.C19552b.m175813a(act, str, str2, yk5Var, view2);
                }
            });
            yk5Var.show();
            ((TextView) view).setHighlightColor(this.f155672a.getResources().getColor(w0c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m175797c(d30 d30Var) {
        zvf0.m220396r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m175798d(Act act, String str, String str2) {
        tvf.m190724b(act, str, TextUtils.equals(str, "verification_center"), str2);
        zvf0.m220396r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m175801g(Runnable runnable, Act act, boolean z) {
        if (runnable != null) {
            runnable.run();
        }
        tvf.m190731i(act, OMSTemplateType.dialog, true, z);
        zvf0.m220396r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: i */
    public static void m175803i(Act act) {
        m175804j(act, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m175804j(final Act act, final boolean z, final Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C19551a(act, runnable, z), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_verification_center_policy_popup", Dialog.class.getName());
        new dd80.C16336a(act).m110996y0("温馨提示").m110991t0(spannableStringBuilder).m110993v0(LinkMovementMethod.getInstance()).m110974c0("同意并继续", new Runnable() { // from class: l.lp4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m175801g(runnable, act, z);
            }
        }).m110969X("不同意", new Runnable() { // from class: l.mp4
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220396r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
            }
        }).m110961P(false).m110958M(true).m110986o0(new DialogInterface.OnShowListener() { // from class: l.np4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.op4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: k */
    public static void m175805k(@NonNull Act act, @NonNull String str) {
        m175806l(act, str, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m175806l(@NonNull Act act, @NonNull String str, String str2) {
        m175807m(act, str, str2, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m175807m(@NonNull final Act act, @NonNull final String str, final String str2, final d30 d30Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C19552b(act, str, str2), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_verification_center_policy_popup", Dialog.class.getName());
        new dd80.C16336a(act).m110996y0("温馨提示").m110991t0(spannableStringBuilder).m110993v0(LinkMovementMethod.getInstance()).m110974c0("同意并继续", new Runnable() { // from class: l.hp4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m175798d(act, str, str2);
            }
        }).m110969X("不同意", new Runnable() { // from class: l.ip4
            @Override // java.lang.Runnable
            public final void run() {
                qp4.m175797c(d30Var);
            }
        }).m110961P(false).m110958M(true).m110986o0(new DialogInterface.OnShowListener() { // from class: l.jp4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.kp4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: n */
    public static void m175808n(Act act) {
        StudentVerificationStatus studentVerificationStatus;
        VerificationCenter verificationCenterM31618q4 = CoreModule.f17545c.f19552B0.m31618q4();
        StudentVerificationStatus studentVerificationStatus2 = null;
        if (verificationCenterM31618q4 != null) {
            studentVerificationStatus = verificationCenterM31618q4.picVerificationInfo.status;
            IdCardVerificationInfo idCardVerificationInfo = verificationCenterM31618q4.idCard;
            if (idCardVerificationInfo != null) {
                studentVerificationStatus2 = idCardVerificationInfo.status;
            }
        } else {
            studentVerificationStatus = null;
        }
        if (!TEnum.equals(studentVerificationStatus2, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "pending") || TEnum.equals(studentVerificationStatus2, "invalid")) {
                zbi0.m217867P(act, studentVerificationStatus2, studentVerificationStatus);
                return;
            } else {
                zbi0.m217857F(act, false);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "verified") || TEnum.equals(studentVerificationStatus, "pending")) {
            zbi0.m217867P(act, studentVerificationStatus2, studentVerificationStatus);
        } else {
            if (rwk0.m181430m(act, 1, "verification_center")) {
                return;
            }
            zbi0.m217867P(act, studentVerificationStatus2, studentVerificationStatus);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m175809o(@NonNull Act act) {
        VerificationCenter verificationCenterM31618q4 = CoreModule.f17545c.f19552B0.m31618q4();
        StudentVerificationStatus studentVerificationStatus = verificationCenterM31618q4 != null ? verificationCenterM31618q4.picVerificationInfo.status : null;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m175810p(act);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m175811q(act);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m175810p(Act act) {
        if (rwk0.m181430m(act, 1, "verification_center")) {
            return;
        }
        ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
    }

    /* JADX INFO: renamed from: q */
    public static void m175811q(Act act) {
        if (rwk0.m181430m(act, 1, "verification_center")) {
            return;
        }
        m175803i(act);
    }
}
