package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.verification.CertificationCenterFrag;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class hr4 implements iam<cr4> {

    /* JADX INFO: renamed from: A */
    public ConstraintLayout f111223A;

    /* JADX INFO: renamed from: B */
    public VImage f111224B;

    /* JADX INFO: renamed from: C */
    public VText_Bold f111225C;

    /* JADX INFO: renamed from: D */
    public VText f111226D;

    /* JADX INFO: renamed from: E */
    public VImage f111227E;

    /* JADX INFO: renamed from: F */
    public VText f111228F;

    /* JADX INFO: renamed from: G */
    public ConstraintLayout f111229G;

    /* JADX INFO: renamed from: H */
    public VImage f111230H;

    /* JADX INFO: renamed from: I */
    public VText_Bold f111231I;

    /* JADX INFO: renamed from: J */
    public VText f111232J;

    /* JADX INFO: renamed from: K */
    public VImage f111233K;

    /* JADX INFO: renamed from: L */
    public VText f111234L;

    /* JADX INFO: renamed from: M */
    public ConstraintLayout f111235M;

    /* JADX INFO: renamed from: N */
    public VImage f111236N;

    /* JADX INFO: renamed from: O */
    public VText_Bold f111237O;

    /* JADX INFO: renamed from: P */
    public VText f111238P;

    /* JADX INFO: renamed from: Q */
    public VImage f111239Q;

    /* JADX INFO: renamed from: R */
    public VText f111240R;

    /* JADX INFO: renamed from: S */
    public CertificationCenterFrag f111241S;

    /* JADX INFO: renamed from: T */
    public cr4 f111242T;

    /* JADX INFO: renamed from: a */
    public VNavigationBar f111243a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f111244b;

    /* JADX INFO: renamed from: c */
    public VImage f111245c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f111246d;

    /* JADX INFO: renamed from: e */
    public VText f111247e;

    /* JADX INFO: renamed from: f */
    public VImage f111248f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f111249g;

    /* JADX INFO: renamed from: h */
    public VText f111250h;

    /* JADX INFO: renamed from: i */
    public VImage f111251i;

    /* JADX INFO: renamed from: j */
    public ConstraintLayout f111252j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f111253k;

    /* JADX INFO: renamed from: l */
    public VImage f111254l;

    /* JADX INFO: renamed from: m */
    public TextView f111255m;

    /* JADX INFO: renamed from: n */
    public VImage f111256n;

    /* JADX INFO: renamed from: o */
    public VImage f111257o;

    /* JADX INFO: renamed from: p */
    public VLinear f111258p;

    /* JADX INFO: renamed from: q */
    public VLinear f111259q;

    /* JADX INFO: renamed from: r */
    public VFrame f111260r;

    /* JADX INFO: renamed from: s */
    public VImage f111261s;

    /* JADX INFO: renamed from: t */
    public VText f111262t;

    /* JADX INFO: renamed from: u */
    public VFrame f111263u;

    /* JADX INFO: renamed from: v */
    public VImage f111264v;

    /* JADX INFO: renamed from: w */
    public VText f111265w;

    /* JADX INFO: renamed from: x */
    public VFrame f111266x;

    /* JADX INFO: renamed from: y */
    public VText f111267y;

    /* JADX INFO: renamed from: z */
    public VText_Bold f111268z;

    public hr4(CertificationCenterFrag certificationCenterFrag) {
        this.f111241S = certificationCenterFrag;
    }

    /* JADX INFO: renamed from: i */
    private void m136747i() {
        this.f111243a.setLeftIconAsBack(getAct());
        this.f111243a.setTitle(getAct().string(R$string.f18654Lr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m136748j(View view) {
        this.f111242T.m112036i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m136749k(View view) {
        this.f111242T.m112038k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m136750l(View view) {
        this.f111242T.m112039l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m136751m(View view) {
        this.f111242T.m112037j0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f111241S.getContext();
    }

    /* JADX INFO: renamed from: e */
    public View m136752e(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ir4.m141766b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cr4 cr4Var) {
        this.f111242T = cr4Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m136752e(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n */
    public void m136754n(StudentVerificationStatus studentVerificationStatus) {
        Drawable drawableM192702b = tu0.m192702b(getContext(), dbc0.f87102j);
        Drawable drawableM192702b2 = tu0.m192702b(getContext(), dbc0.f87071i);
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f111268z.setText("认证成功");
            this.f111268z.setTextColor(Color.parseColor("#FF2BCCFF"));
            this.f111268z.setBackgroundDrawable(drawableM192702b2);
        } else if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f111268z.setText("认证失败，重新认证");
            this.f111268z.setTextColor(Color.parseColor("#FFFFFF"));
            this.f111268z.setBackgroundDrawable(drawableM192702b);
        } else {
            boolean zEquals = TEnum.equals(studentVerificationStatus, "pending");
            VText_Bold vText_Bold = this.f111268z;
            if (zEquals) {
                vText_Bold.setText("审核中...");
                this.f111268z.setTextColor(Color.parseColor("#66FFFFFF"));
                this.f111268z.setBackgroundDrawable(drawableM192702b);
            } else {
                vText_Bold.setText("立即认证，获得特权");
                this.f111268z.setTextColor(Color.parseColor("#FFFFFFFF"));
                this.f111268z.setBackgroundDrawable(drawableM192702b);
            }
        }
        m136759u(studentVerificationStatus);
    }

    /* JADX INFO: renamed from: p */
    public void m136755p(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f111240R.setText("已认证");
                this.f111240R.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f111239Q, false);
                bnl0.m105524M(this.f111240R, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f111240R;
            if (zEquals) {
                vText.setText("审核中");
                this.f111240R.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f111239Q, false);
                bnl0.m105524M(this.f111240R, true);
                return;
            }
            vText.setText("待激活");
            this.f111240R.setTextColor(Color.parseColor("#FE7E1D"));
            bnl0.m105524M(this.f111239Q, false);
            bnl0.m105524M(this.f111240R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f111240R.setText("审核中");
            this.f111240R.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111239Q, false);
            bnl0.m105524M(this.f111240R, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f111240R.setText("认证失败");
            this.f111240R.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111239Q, false);
            bnl0.m105524M(this.f111240R, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f111239Q, true);
            bnl0.m105524M(this.f111240R, false);
        } else {
            this.f111240R.setText("已失效");
            this.f111240R.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111239Q, false);
            bnl0.m105524M(this.f111240R, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m136756q(StudentVerificationStatus studentVerificationStatus, StudentVerificationStatus studentVerificationStatus2) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            if (TEnum.equals(studentVerificationStatus2, "verified")) {
                this.f111228F.setText("已认证");
                this.f111228F.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f111227E, false);
                bnl0.m105524M(this.f111228F, true);
                return;
            }
            boolean zEquals = TEnum.equals(studentVerificationStatus2, "pending");
            VText vText = this.f111228F;
            if (zEquals) {
                vText.setText("审核中");
                this.f111228F.setTextColor(Color.parseColor("#66000000"));
                bnl0.m105524M(this.f111227E, false);
                bnl0.m105524M(this.f111228F, true);
                return;
            }
            vText.setText("待激活");
            this.f111228F.setTextColor(Color.parseColor("#FE7E1D"));
            bnl0.m105524M(this.f111227E, false);
            bnl0.m105524M(this.f111228F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f111228F.setText("认证失败");
            this.f111228F.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111227E, false);
            bnl0.m105524M(this.f111228F, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f111228F.setText("审核中");
            this.f111228F.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111227E, false);
            bnl0.m105524M(this.f111228F, true);
            return;
        }
        if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f111227E, true);
            bnl0.m105524M(this.f111228F, false);
        } else {
            this.f111228F.setText("已失效");
            this.f111228F.setTextColor(Color.parseColor("#66000000"));
            bnl0.m105524M(this.f111227E, false);
            bnl0.m105524M(this.f111228F, true);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m136757r() {
        m136747i();
        bnl0.m105509E0(this.f111244b, new View.OnClickListener() { // from class: l.dr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90358a.m136748j(view);
            }
        });
        bnl0.m105509E0(this.f111223A, new View.OnClickListener() { // from class: l.er4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95443a.m136749k(view);
            }
        });
        bnl0.m105509E0(this.f111229G, new View.OnClickListener() { // from class: l.fr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100395a.m136750l(view);
            }
        });
        bnl0.m105509E0(this.f111235M, new View.OnClickListener() { // from class: l.gr4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106001a.m136751m(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m136758s(StudentVerificationStatus studentVerificationStatus) {
        if (TEnum.equals(studentVerificationStatus, "verified")) {
            this.f111234L.setText("已认证");
            bnl0.m105524M(this.f111233K, false);
            bnl0.m105524M(this.f111234L, true);
            return;
        }
        if (TEnum.equals(studentVerificationStatus, "rejected")) {
            this.f111234L.setText("认证失败");
            bnl0.m105524M(this.f111233K, false);
            bnl0.m105524M(this.f111234L, true);
        } else if (TEnum.equals(studentVerificationStatus, "pending")) {
            this.f111234L.setText("审核中");
            bnl0.m105524M(this.f111233K, false);
            bnl0.m105524M(this.f111234L, true);
        } else if (!TEnum.equals(studentVerificationStatus, "invalid")) {
            bnl0.m105524M(this.f111233K, true);
            bnl0.m105524M(this.f111234L, false);
        } else {
            this.f111234L.setText("已失效");
            bnl0.m105524M(this.f111233K, false);
            bnl0.m105524M(this.f111234L, true);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m136759u(StudentVerificationStatus studentVerificationStatus) {
        bnl0.m105524M(this.f111249g, true);
        this.f111248f.setBackgroundResource(dbc0.f87534w4);
        bnl0.m105524M(this.f111258p, false);
        bnl0.m105524M(this.f111253k, true);
        bnl0.m105524M(this.f111250h, false);
        this.f111251i.setImageResource(dbc0.f86557S4);
        uqb0.f180374G.m127115L0(this.f111249g, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileMiddle().formatted());
    }

    /* JADX INFO: renamed from: v */
    public void m136760v(boolean z) {
        bnl0.m105524M(this.f111229G, z);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
