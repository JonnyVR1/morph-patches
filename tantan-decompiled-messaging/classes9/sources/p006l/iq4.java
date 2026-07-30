package p006l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.p004ui.verification.CertificationCenterFrag;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.jq4;
import l.nu0;
import l.s7m;
import l.xdl0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class iq4 implements s7m<dq4> {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f14629A;

    /* JADX INFO: renamed from: B */
    public VImage f14630B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f14631C;

    /* JADX INFO: renamed from: D */
    public VText f14632D;

    /* JADX INFO: renamed from: E */
    public VImage f14633E;

    /* JADX INFO: renamed from: F */
    public VText f14634F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f14635G;

    /* JADX INFO: renamed from: H */
    public VImage f14636H;

    /* JADX INFO: renamed from: I */
    public VText_Bold f14637I;

    /* JADX INFO: renamed from: J */
    public VText f14638J;

    /* JADX INFO: renamed from: K */
    public VImage f14639K;

    /* JADX INFO: renamed from: L */
    public VText f14640L;

    /* JADX INFO: renamed from: M */
    public ConstraintLayout f14641M;

    /* JADX INFO: renamed from: N */
    public VImage f14642N;

    /* JADX INFO: renamed from: O */
    public VText_Bold f14643O;

    /* JADX INFO: renamed from: P */
    public VText f14644P;

    /* JADX INFO: renamed from: Q */
    public VImage f14645Q;

    /* JADX INFO: renamed from: R */
    public VText f14646R;

    /* JADX INFO: renamed from: S */
    public CertificationCenterFrag f14647S;

    /* JADX INFO: renamed from: T */
    public dq4 f14648T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f14649a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f14650b;

    /* JADX INFO: renamed from: c */
    public VImage f14651c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f14652d;

    /* JADX INFO: renamed from: e */
    public VText f14653e;

    /* JADX INFO: renamed from: f */
    public VImage f14654f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f14655g;

    /* JADX INFO: renamed from: h */
    public VText f14656h;

    /* JADX INFO: renamed from: i */
    public VImage f14657i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f14658j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f14659k;

    /* JADX INFO: renamed from: l */
    public VImage f14660l;

    /* JADX INFO: renamed from: m */
    public TextView f14661m;

    /* JADX INFO: renamed from: n */
    public VImage f14662n;

    /* JADX INFO: renamed from: o */
    public VImage f14663o;

    /* JADX INFO: renamed from: p */
    public VLinear f14664p;

    /* JADX INFO: renamed from: q */
    public VLinear f14665q;

    /* JADX INFO: renamed from: r */
    public VFrame f14666r;

    /* JADX INFO: renamed from: s */
    public VImage f14667s;

    /* JADX INFO: renamed from: t */
    public VText f14668t;

    /* JADX INFO: renamed from: u */
    public VFrame f14669u;

    /* JADX INFO: renamed from: v */
    public VImage f14670v;

    /* JADX INFO: renamed from: w */
    public VText f14671w;

    /* JADX INFO: renamed from: x */
    public VFrame f14672x;

    /* JADX INFO: renamed from: y */
    public VText f14673y;

    /* JADX INFO: renamed from: z */
    public VText_Bold f14674z;

    public iq4(CertificationCenterFrag certificationCenterFrag) {
        this.f14647S = certificationCenterFrag;
    }

    /* JADX INFO: renamed from: i */
    private void m16802i() {
        this.f14649a.setLeftIconAsBack(act());
        this.f14649a.setTitle(act().string(R$string.f2825pr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m16803j(View view) {
        this.f14648T.m14182i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m16804k(View view) {
        this.f14648T.m14184k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m16805l(View view) {
        this.f14648T.m14185l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m16806m(View view) {
        this.f14648T.m14183j0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16807C0() {
        return this.f14647S.getContext();
    }

    /* JADX INFO: renamed from: e */
    public View m16808e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jq4.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m16810i1(dq4 dq4Var) {
        this.f14648T = dq4Var;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16808e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m16811n(StudentVerificationStatus studentVerificationStatus) {
        Drawable drawableB = nu0.b(m16807C0(), x2c0.f26756i);
        Drawable drawableB2 = nu0.b(m16807C0(), x2c0.f26724h);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f14674z.setText("认证成功");
            this.f14674z.setTextColor(Color.parseColor("#FF2BCCFF"));
            this.f14674z.setBackgroundDrawable(drawableB2);
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f14674z.setText("认证失败，重新认证");
            this.f14674z.setTextColor(Color.parseColor("#FFFFFF"));
            this.f14674z.setBackgroundDrawable(drawableB);
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText_Bold vText_Bold = this.f14674z;
            if (zEquals) {
                vText_Bold.setText("审核中...");
                this.f14674z.setTextColor(Color.parseColor("#66FFFFFF"));
                this.f14674z.setBackgroundDrawable(drawableB);
            } else {
                vText_Bold.setText("立即认证，获得特权");
                this.f14674z.setTextColor(Color.parseColor("#FFFFFFFF"));
                this.f14674z.setBackgroundDrawable(drawableB);
            }
        }
        m16816u(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: p */
    public void m16812p(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f14646R.setText("已认证");
                this.f14646R.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f14645Q, false);
                xdl0.M(this.f14646R, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f14646R;
            if (zEquals) {
                vText.setText("审核中");
                this.f14646R.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f14645Q, false);
                xdl0.M(this.f14646R, true);
                return;
            }
            vText.setText("待激活");
            this.f14646R.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.M(this.f14645Q, false);
            xdl0.M(this.f14646R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f14646R.setText("审核中");
            this.f14646R.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14645Q, false);
            xdl0.M(this.f14646R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f14646R.setText("认证失败");
            this.f14646R.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14645Q, false);
            xdl0.M(this.f14646R, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f14645Q, true);
            xdl0.M(this.f14646R, false);
        } else {
            this.f14646R.setText("已失效");
            this.f14646R.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14645Q, false);
            xdl0.M(this.f14646R, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16813q(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f14634F.setText("已认证");
                this.f14634F.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f14633E, false);
                xdl0.M(this.f14634F, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f14634F;
            if (zEquals) {
                vText.setText("审核中");
                this.f14634F.setTextColor(Color.parseColor("#66000000"));
                xdl0.M(this.f14633E, false);
                xdl0.M(this.f14634F, true);
                return;
            }
            vText.setText("待激活");
            this.f14634F.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.M(this.f14633E, false);
            xdl0.M(this.f14634F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f14634F.setText("认证失败");
            this.f14634F.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14633E, false);
            xdl0.M(this.f14634F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f14634F.setText("审核中");
            this.f14634F.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14633E, false);
            xdl0.M(this.f14634F, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f14633E, true);
            xdl0.M(this.f14634F, false);
        } else {
            this.f14634F.setText("已失效");
            this.f14634F.setTextColor(Color.parseColor("#66000000"));
            xdl0.M(this.f14633E, false);
            xdl0.M(this.f14634F, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m16814r() {
        m16802i();
        xdl0.E0(this.f14650b, new View.OnClickListener() { // from class: l.eq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11395a.m16803j(view);
            }
        });
        xdl0.E0(this.f14629A, new View.OnClickListener() { // from class: l.fq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12850a.m16804k(view);
            }
        });
        xdl0.E0(this.f14635G, new View.OnClickListener() { // from class: l.gq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13435a.m16805l(view);
            }
        });
        xdl0.E0(this.f14641M, new View.OnClickListener() { // from class: l.hq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14013a.m16806m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m16815s(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f14640L.setText("已认证");
            xdl0.M(this.f14639K, false);
            xdl0.M(this.f14640L, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f14640L.setText("认证失败");
            xdl0.M(this.f14639K, false);
            xdl0.M(this.f14640L, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f14640L.setText("审核中");
            xdl0.M(this.f14639K, false);
            xdl0.M(this.f14640L, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.M(this.f14639K, true);
            xdl0.M(this.f14640L, false);
        } else {
            this.f14640L.setText("已失效");
            xdl0.M(this.f14639K, false);
            xdl0.M(this.f14640L, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m16816u(StudentVerificationStatus studentVerificationStatus) {
        xdl0.M(this.f14655g, true);
        this.f14654f.setBackgroundResource(x2c0.f27175v4);
        xdl0.M(this.f14664p, false);
        xdl0.M(this.f14659k, true);
        xdl0.M(this.f14656h, false);
        this.f14657i.setImageResource(x2c0.f26227R4);
        qib0.f19782G.m12744L0(this.f14655g, CoreModule.f1534c.f3628e0.m21490p9().fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: v */
    public void m16817v(boolean z) {
        xdl0.M(this.f14635G, z);
    }

    public void destroy() {
    }
}
