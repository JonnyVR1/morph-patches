package p153l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p051p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import p151v.VButton;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ocd0 implements iam<lcd0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f146687a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f146688b;

    /* JADX INFO: renamed from: c */
    public RightNiceNumberView f146689c;

    /* JADX INFO: renamed from: d */
    public VButton f146690d;

    /* JADX INFO: renamed from: e */
    public VText f146691e;

    /* JADX INFO: renamed from: f */
    public final Act f146692f;

    /* JADX INFO: renamed from: g */
    public lcd0 f146693g;

    /* JADX INFO: renamed from: h */
    public kr40 f146694h;

    /* JADX INFO: renamed from: i */
    public final dcd0 f146695i = new C19096a();

    /* JADX INFO: renamed from: l.ocd0$a */
    public class C19096a extends dcd0 {
        public C19096a() {
        }

        @Override // p153l.dcd0, p153l.ccd0
        /* JADX INFO: renamed from: a */
        public boolean mo71861a() {
            return ocd0.this.f146694h != null && ocd0.this.f146694h.m150980e();
        }

        @Override // p153l.dcd0
        /* JADX INFO: renamed from: c */
        public void mo115271c(int i) {
            ocd0.this.m167154n(i);
        }

        @Override // p153l.dcd0
        /* JADX INFO: renamed from: d */
        public void mo115272d() {
            boolean zMo71861a = mo71861a();
            ocd0 ocd0Var = ocd0.this;
            if (zMo71861a) {
                ocd0Var.f146693g.m153676q0();
            } else {
                ocd0Var.m167160w();
            }
        }
    }

    public ocd0(Act act) {
        this.f146692f = act;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f146687a.getContext();
    }

    /* JADX INFO: renamed from: f */
    public View m167148f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pcd0.m171642b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lcd0 lcd0Var) {
        this.f146693g = lcd0Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m167148f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m167150j(String str) {
        kr40 kr40Var = this.f146694h;
        if (kr40Var != null) {
            kr40Var.m150981f();
            this.f146691e.setText(m167151k(this.f146694h.m150977b()));
            this.f146689c.m71857o0(str);
        }
        m167158u(false);
    }

    /* JADX INFO: renamed from: k */
    public SpannableStringBuilder m167151k(int i) {
        return vuf0.m202788a(getContext(), xau.m209910t(R$string.f45750g0)).m202791c(n3d0.m161277a(m9c0.f135381f)).m202789a(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m202791c(n3d0.m161277a(m9c0.f135391p)).m202789a(xau.m209910t(R$string.f45748f0)).m202791c(n3d0.m161277a(m9c0.f135381f)).m202790b();
    }

    /* JADX INFO: renamed from: l */
    public void m167152l(UserRightType userRightType) {
        this.f146688b.setLeftIconAsBack(this.f146692f);
        this.f146688b.setTitle(userRightType.getManageTitle(getContext()));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m167153m(kr40 kr40Var, View view) {
        if (!kr40Var.m150980e()) {
            m167160w();
        } else if (kr40Var.m150976a()) {
            this.f146693g.m153669i0(this.f146689c.getSelectNumber(), this.f146689c.m71858p0());
        } else {
            o1j0.m165649w(R$string.f45756j0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m167154n(int i) {
        if (i == 2) {
            this.f146690d.setText(R$string.f45757k);
        } else if (i == 3) {
            this.f146690d.setText(R$string.f45744d0);
        }
        this.f146690d.setBackgroundResource(nbc0.f141184o);
        this.f146690d.setTextColor(n3d0.m161277a(m9c0.f135400y));
    }

    /* JADX INFO: renamed from: p */
    public final void m167155p(BLiveNiceNumberDetail bLiveNiceNumberDetail) {
        m167158u(true);
        boolean z = bLiveNiceNumberDetail.qualified;
        VText vText = this.f146691e;
        if (z) {
            vText.setText(m167151k(bLiveNiceNumberDetail.remainTimes));
        } else {
            vText.setText(R$string.f45752h0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m167156q(BLiveNiceNumberDetail bLiveNiceNumberDetail) {
        this.f146689c.m71859q0(bLiveNiceNumberDetail, this.f146695i);
    }

    /* JADX INFO: renamed from: s */
    public void m167157s(BLiveNiceNumberList bLiveNiceNumberList, boolean z) {
        this.f146689c.m71860r0(bLiveNiceNumberList, z);
        if (z) {
            m167158u(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m167158u(boolean z) {
        if (z) {
            this.f146690d.setText(xau.m209910t(R$string.f45757k));
        }
        this.f146690d.setBackgroundResource(nbc0.f141163h);
        this.f146690d.setTextColor(n3d0.m161277a(m9c0.f135382g));
    }

    /* JADX INFO: renamed from: v */
    public void m167159v(final kr40 kr40Var) {
        this.f146694h = kr40Var;
        if (kr40Var.getNiceNumberDetail() != null) {
            m167156q(kr40Var.getNiceNumberDetail());
            m167155p(kr40Var.getNiceNumberDetail());
        }
        if (kr40Var.getNiceNumberList() != null) {
            m167157s(kr40Var.getNiceNumberList(), false);
        }
        bnl0.m105509E0(this.f146690d, new View.OnClickListener() { // from class: l.ncd0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141335a.m167153m(kr40Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m167160w() {
        o1j0.m165649w(R$string.f45754i0);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
