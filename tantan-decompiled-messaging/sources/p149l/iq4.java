package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.verification.CertificationCenterFrag;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class iq4 implements s7m<dq4> {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f114371A;

    /* JADX INFO: renamed from: B */
    public VImage f114372B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f114373C;

    /* JADX INFO: renamed from: D */
    public VText f114374D;

    /* JADX INFO: renamed from: E */
    public VImage f114375E;

    /* JADX INFO: renamed from: F */
    public VText f114376F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f114377G;

    /* JADX INFO: renamed from: H */
    public VImage f114378H;

    /* JADX INFO: renamed from: I */
    public VText_Bold f114379I;

    /* JADX INFO: renamed from: J */
    public VText f114380J;

    /* JADX INFO: renamed from: K */
    public VImage f114381K;

    /* JADX INFO: renamed from: L */
    public VText f114382L;

    /* JADX INFO: renamed from: M */
    public ConstraintLayout f114383M;

    /* JADX INFO: renamed from: N */
    public VImage f114384N;

    /* JADX INFO: renamed from: O */
    public VText_Bold f114385O;

    /* JADX INFO: renamed from: P */
    public VText f114386P;

    /* JADX INFO: renamed from: Q */
    public VImage f114387Q;

    /* JADX INFO: renamed from: R */
    public VText f114388R;

    /* JADX INFO: renamed from: S */
    public CertificationCenterFrag f114389S;

    /* JADX INFO: renamed from: T */
    public dq4 f114390T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f114391a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f114392b;

    /* JADX INFO: renamed from: c */
    public VImage f114393c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f114394d;

    /* JADX INFO: renamed from: e */
    public VText f114395e;

    /* JADX INFO: renamed from: f */
    public VImage f114396f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f114397g;

    /* JADX INFO: renamed from: h */
    public VText f114398h;

    /* JADX INFO: renamed from: i */
    public VImage f114399i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f114400j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f114401k;

    /* JADX INFO: renamed from: l */
    public VImage f114402l;

    /* JADX INFO: renamed from: m */
    public TextView f114403m;

    /* JADX INFO: renamed from: n */
    public VImage f114404n;

    /* JADX INFO: renamed from: o */
    public VImage f114405o;

    /* JADX INFO: renamed from: p */
    public VLinear f114406p;

    /* JADX INFO: renamed from: q */
    public VLinear f114407q;

    /* JADX INFO: renamed from: r */
    public VFrame f114408r;

    /* JADX INFO: renamed from: s */
    public VImage f114409s;

    /* JADX INFO: renamed from: t */
    public VText f114410t;

    /* JADX INFO: renamed from: u */
    public VFrame f114411u;

    /* JADX INFO: renamed from: v */
    public VImage f114412v;

    /* JADX INFO: renamed from: w */
    public VText f114413w;

    /* JADX INFO: renamed from: x */
    public VFrame f114414x;

    /* JADX INFO: renamed from: y */
    public VText f114415y;

    /* JADX INFO: renamed from: z */
    public VText_Bold f114416z;

    public iq4(CertificationCenterFrag certificationCenterFrag) {
        this.f114389S = certificationCenterFrag;
    }

    /* JADX INFO: renamed from: i */
    private void m137614i() {
        this.f114391a.setLeftIconAsBack(getAct());
        this.f114391a.setTitle(getAct().string(R$string.f18836pr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m137615j(View view) {
        this.f114390T.m112988i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m137616k(View view) {
        this.f114390T.m112990k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m137617l(View view) {
        this.f114390T.m112991l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m137618m(View view) {
        this.f114390T.m112989j0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f114389S.getContext();
    }

    /* JADX INFO: renamed from: e */
    public View m137619e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jq4.m142776b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(dq4 dq4Var) {
        this.f114390T = dq4Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m137619e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m137621n(StudentVerificationStatus studentVerificationStatus) {
        Drawable drawableM161424b = nu0.m161424b(getContext(), x2c0.f190220i);
        Drawable drawableM161424b2 = nu0.m161424b(getContext(), x2c0.f190188h);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f114416z.setText("认证成功");
            this.f114416z.setTextColor(Color.parseColor("#FF2BCCFF"));
            this.f114416z.setBackgroundDrawable(drawableM161424b2);
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f114416z.setText("认证失败，重新认证");
            this.f114416z.setTextColor(Color.parseColor("#FFFFFF"));
            this.f114416z.setBackgroundDrawable(drawableM161424b);
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText_Bold vText_Bold = this.f114416z;
            if (zEquals) {
                vText_Bold.setText("审核中...");
                this.f114416z.setTextColor(Color.parseColor("#66FFFFFF"));
                this.f114416z.setBackgroundDrawable(drawableM161424b);
            } else {
                vText_Bold.setText("立即认证，获得特权");
                this.f114416z.setTextColor(Color.parseColor("#FFFFFFFF"));
                this.f114416z.setBackgroundDrawable(drawableM161424b);
            }
        }
        m137626u(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: p */
    public void m137622p(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f114388R.setText("已认证");
                this.f114388R.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f114387Q, false);
                xdl0.m208344M(this.f114388R, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f114388R;
            if (zEquals) {
                vText.setText("审核中");
                this.f114388R.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f114387Q, false);
                xdl0.m208344M(this.f114388R, true);
                return;
            }
            vText.setText("待激活");
            this.f114388R.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.m208344M(this.f114387Q, false);
            xdl0.m208344M(this.f114388R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f114388R.setText("审核中");
            this.f114388R.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114387Q, false);
            xdl0.m208344M(this.f114388R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f114388R.setText("认证失败");
            this.f114388R.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114387Q, false);
            xdl0.m208344M(this.f114388R, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f114387Q, true);
            xdl0.m208344M(this.f114388R, false);
        } else {
            this.f114388R.setText("已失效");
            this.f114388R.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114387Q, false);
            xdl0.m208344M(this.f114388R, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m137623q(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f114376F.setText("已认证");
                this.f114376F.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f114375E, false);
                xdl0.m208344M(this.f114376F, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f114376F;
            if (zEquals) {
                vText.setText("审核中");
                this.f114376F.setTextColor(Color.parseColor("#66000000"));
                xdl0.m208344M(this.f114375E, false);
                xdl0.m208344M(this.f114376F, true);
                return;
            }
            vText.setText("待激活");
            this.f114376F.setTextColor(Color.parseColor("#FE7E1D"));
            xdl0.m208344M(this.f114375E, false);
            xdl0.m208344M(this.f114376F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f114376F.setText("认证失败");
            this.f114376F.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114375E, false);
            xdl0.m208344M(this.f114376F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f114376F.setText("审核中");
            this.f114376F.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114375E, false);
            xdl0.m208344M(this.f114376F, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f114375E, true);
            xdl0.m208344M(this.f114376F, false);
        } else {
            this.f114376F.setText("已失效");
            this.f114376F.setTextColor(Color.parseColor("#66000000"));
            xdl0.m208344M(this.f114375E, false);
            xdl0.m208344M(this.f114376F, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m137624r() {
        m137614i();
        xdl0.m208329E0(this.f114392b, new View.OnClickListener() { // from class: l.eq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92760a.m137615j(view);
            }
        });
        xdl0.m208329E0(this.f114371A, new View.OnClickListener() { // from class: l.fq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98762a.m137616k(view);
            }
        });
        xdl0.m208329E0(this.f114377G, new View.OnClickListener() { // from class: l.gq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103877a.m137617l(view);
            }
        });
        xdl0.m208329E0(this.f114383M, new View.OnClickListener() { // from class: l.hq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109029a.m137618m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m137625s(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f114382L.setText("已认证");
            xdl0.m208344M(this.f114381K, false);
            xdl0.m208344M(this.f114382L, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f114382L.setText("认证失败");
            xdl0.m208344M(this.f114381K, false);
            xdl0.m208344M(this.f114382L, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f114382L.setText("审核中");
            xdl0.m208344M(this.f114381K, false);
            xdl0.m208344M(this.f114382L, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            xdl0.m208344M(this.f114381K, true);
            xdl0.m208344M(this.f114382L, false);
        } else {
            this.f114382L.setText("已失效");
            xdl0.m208344M(this.f114381K, false);
            xdl0.m208344M(this.f114382L, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m137626u(StudentVerificationStatus studentVerificationStatus) {
        xdl0.m208344M(this.f114397g, true);
        this.f114396f.setBackgroundResource(x2c0.f190639v4);
        xdl0.m208344M(this.f114406p, false);
        xdl0.m208344M(this.f114401k, true);
        xdl0.m208344M(this.f114398h, false);
        this.f114399i.setImageResource(x2c0.f189691R4);
        qib0.f154691G.m102331L0(this.f114397g, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: v */
    public void m137627v(boolean z) {
        xdl0.m208344M(this.f114377G, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
