package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdCardVerificationInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;

/* JADX INFO: loaded from: classes12.dex */
public class pq4 {

    /* JADX INFO: renamed from: l.pq4$a */
    public class C19418a extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f153627a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f153628b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f153629c;

        public C19418a(Act act, Runnable runnable, boolean z) {
            this.f153627a = act;
            this.f153628b = runnable;
            this.f153629c = z;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m173310a(Runnable runnable, Act act, boolean z, bm5 bm5Var, View view) {
            if (runnable == null) {
                hxf.m137588i(act, OMSTemplateType.dialog, true, z);
            } else {
                runnable.run();
            }
            bm5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final bm5 bm5Var = new bm5(this.f153627a, 1);
            final Runnable runnable = this.f153628b;
            final Act act = this.f153627a;
            final boolean z = this.f153629c;
            bm5Var.m104999D(new View.OnClickListener() { // from class: l.oq4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    pq4.C19418a.m173310a(runnable, act, z, bm5Var, view2);
                }
            });
            bm5Var.show();
            ((TextView) view).setHighlightColor(this.f153627a.getResources().getColor(c9c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: l.pq4$b */
    public class C19419b extends ClickableSpan {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f153630a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f153631b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f153632c;

        public C19419b(Act act, String str, String str2) {
            this.f153630a = act;
            this.f153631b = str;
            this.f153632c = str2;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m173311a(Act act, String str, String str2, bm5 bm5Var, View view) {
            hxf.m137581b(act, str, TextUtils.equals(str, "verification_center"), str2);
            bm5Var.dismiss();
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            final bm5 bm5Var = new bm5(this.f153630a, 1);
            final Act act = this.f153630a;
            final String str = this.f153631b;
            final String str2 = this.f153632c;
            bm5Var.m104999D(new View.OnClickListener() { // from class: l.qq4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    pq4.C19419b.m173311a(act, str, str2, bm5Var, view2);
                }
            });
            bm5Var.show();
            ((TextView) view).setHighlightColor(this.f153630a.getResources().getColor(c9c0.transparent_background));
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(@NonNull TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m173295c(x20 x20Var) {
        i4g0.m138520r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m173296d(Act act, String str, String str2) {
        hxf.m137581b(act, str, TextUtils.equals(str, "verification_center"), str2);
        i4g0.m138520r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m173299g(Runnable runnable, Act act, boolean z) {
        if (runnable != null) {
            runnable.run();
        }
        hxf.m137588i(act, OMSTemplateType.dialog, true, z);
        i4g0.m138520r("e_verification_center_policy_popup_agree", "p_verification_center_policy_popup");
    }

    /* JADX INFO: renamed from: i */
    public static void m173301i(Act act) {
        m173302j(act, false, null);
    }

    /* JADX INFO: renamed from: j */
    public static void m173302j(final Act act, final boolean z, final Runnable runnable) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C19418a(act, runnable, z), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_verification_center_policy_popup", Dialog.class.getName());
        new jl80.C17971a(act).m146056y0("温馨提示").m146051t0(spannableStringBuilder).m146053v0(LinkMovementMethod.getInstance()).m146034c0("同意并继续", new Runnable() { // from class: l.kq4
            @Override // java.lang.Runnable
            public final void run() {
                pq4.m173299g(runnable, act, z);
            }
        }).m146029X("不同意", new Runnable() { // from class: l.lq4
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138520r("e_verification_center_policy_popup_disagree", "p_verification_center_policy_popup");
            }
        }).m146021P(false).m146018M(true).m146046o0(new DialogInterface.OnShowListener() { // from class: l.mq4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.nq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: k */
    public static void m173303k(@NonNull Act act, @NonNull String str) {
        m173304l(act, str, null);
    }

    /* JADX INFO: renamed from: l */
    public static void m173304l(@NonNull Act act, @NonNull String str, String str2) {
        m173305m(act, str, str2, null);
    }

    /* JADX INFO: renamed from: m */
    public static void m173305m(@NonNull final Act act, @NonNull final String str, final String str2, final x20 x20Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("我同意腾讯、阿里、火山采集我的面部信息并与头像对比，详见");
        spannableStringBuilder.append((CharSequence) "《真实头像认证协议》");
        spannableStringBuilder.setSpan(new C19419b(act, str, str2), 28, 38, 33);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE7E1D")), 28, 38, 33);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_verification_center_policy_popup", Dialog.class.getName());
        new jl80.C17971a(act).m146056y0("温馨提示").m146051t0(spannableStringBuilder).m146053v0(LinkMovementMethod.getInstance()).m146034c0("同意并继续", new Runnable() { // from class: l.gq4
            @Override // java.lang.Runnable
            public final void run() {
                pq4.m173296d(act, str, str2);
            }
        }).m146029X("不同意", new Runnable() { // from class: l.hq4
            @Override // java.lang.Runnable
            public final void run() {
                pq4.m173295c(x20Var);
            }
        }).m146021P(false).m146018M(true).m146046o0(new DialogInterface.OnShowListener() { // from class: l.iq4
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.jq4
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: n */
    public static void m173306n(Act act) {
        StudentVerificationStatus studentVerificationStatus;
        VerificationCenter verificationCenterM32621q4 = CoreModule.f18264c.f20294B0.m32621q4();
        StudentVerificationStatus studentVerificationStatus2 = null;
        if (verificationCenterM32621q4 != null) {
            studentVerificationStatus = verificationCenterM32621q4.picVerificationInfo.status;
            IdCardVerificationInfo idCardVerificationInfo = verificationCenterM32621q4.idCard;
            if (idCardVerificationInfo != null) {
                studentVerificationStatus2 = idCardVerificationInfo.status;
            }
        } else {
            studentVerificationStatus = null;
        }
        if (!TEnum.equals(studentVerificationStatus2, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "pending") || TEnum.equals(studentVerificationStatus2, "invalid")) {
                zki0.m220087P(act, studentVerificationStatus2, studentVerificationStatus);
                return;
            } else {
                zki0.m220077F(act, false);
                return;
            }
        }
        if (TEnum.equals(studentVerificationStatus, "verified") || TEnum.equals(studentVerificationStatus, "pending")) {
            zki0.m220087P(act, studentVerificationStatus2, studentVerificationStatus);
        } else {
            if (x5l0.m209400m(act, 1, "verification_center")) {
                return;
            }
            zki0.m220087P(act, studentVerificationStatus2, studentVerificationStatus);
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m173307o(@NonNull Act act) {
        VerificationCenter verificationCenterM32621q4 = CoreModule.f18264c.f20294B0.m32621q4();
        StudentVerificationStatus studentVerificationStatus = verificationCenterM32621q4 != null ? verificationCenterM32621q4.picVerificationInfo.status : null;
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_avatar_verification_succeed_verification_center.getIdentifier());
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            m173308p(act);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_avatar_verification_review_verification_center.getIdentifier());
        } else {
            m173309q(act);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m173308p(Act act) {
        if (x5l0.m209400m(act, 1, "verification_center")) {
            return;
        }
        pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_avatarVerification_fail_popup_verificationCenter.getIdentifier());
    }

    /* JADX INFO: renamed from: q */
    public static void m173309q(Act act) {
        if (x5l0.m209400m(act, 1, "verification_center")) {
            return;
        }
        m173301i(act);
    }
}
