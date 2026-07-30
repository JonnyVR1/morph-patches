package p149l;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberDetail;
import com.p046p1.mobile.putong.live.base.data.BLiveNiceNumberList;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.page.rights.niceNumber.view.RightNiceNumberView;
import p147v.VButton;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class l4d0 implements s7m<i4d0> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f126019a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f126020b;

    /* JADX INFO: renamed from: c */
    public RightNiceNumberView f126021c;

    /* JADX INFO: renamed from: d */
    public VButton f126022d;

    /* JADX INFO: renamed from: e */
    public VText f126023e;

    /* JADX INFO: renamed from: f */
    public final Act f126024f;

    /* JADX INFO: renamed from: g */
    public i4d0 f126025g;

    /* JADX INFO: renamed from: h */
    public wi40 f126026h;

    /* JADX INFO: renamed from: i */
    public final a4d0 f126027i = new C18149a();

    /* JADX INFO: renamed from: l.l4d0$a */
    public class C18149a extends a4d0 {
        public C18149a() {
        }

        @Override // p149l.a4d0, p149l.z3d0
        /* JADX INFO: renamed from: a */
        public boolean mo70678a() {
            return l4d0.this.f126026h != null && l4d0.this.f126026h.m203280e();
        }

        @Override // p149l.a4d0
        /* JADX INFO: renamed from: c */
        public void mo94830c(int i) {
            l4d0.this.m148440n(i);
        }

        @Override // p149l.a4d0
        /* JADX INFO: renamed from: d */
        public void mo94831d() {
            boolean zMo70678a = mo70678a();
            l4d0 l4d0Var = l4d0.this;
            if (zMo70678a) {
                l4d0Var.f126025g.m134337q0();
            } else {
                l4d0Var.m148446w();
            }
        }
    }

    public l4d0(Act act) {
        this.f126024f = act;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f126019a.getContext();
    }

    /* JADX INFO: renamed from: f */
    public View m148434f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4d0.m153016b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(i4d0 i4d0Var) {
        this.f126025g = i4d0Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m148434f(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public void m148436j(String str) {
        wi40 wi40Var = this.f126026h;
        if (wi40Var != null) {
            wi40Var.m203281f();
            this.f126023e.setText(m148437k(this.f126026h.m203277b()));
            this.f126021c.m70674o0(str);
        }
        m148444u(false);
    }

    /* JADX INFO: renamed from: k */
    public SpannableStringBuilder m148437k(int i) {
        return mmf0.m155392a(getContext(), w8u.m202217t(R$string.f44902g0)).m155395c(kvc0.m147352a(g1c0.f100151f)).m155393a(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR).m155395c(kvc0.m147352a(g1c0.f100161p)).m155393a(w8u.m202217t(R$string.f44900f0)).m155395c(kvc0.m147352a(g1c0.f100151f)).m155394b();
    }

    /* JADX INFO: renamed from: l */
    public void m148438l(UserRightType userRightType) {
        this.f126020b.setLeftIconAsBack(this.f126024f);
        this.f126020b.setTitle(userRightType.getManageTitle(getContext()));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m148439m(wi40 wi40Var, View view) {
        if (!wi40Var.m203280e()) {
            m148446w();
        } else if (wi40Var.m203276a()) {
            this.f126025g.m134330i0(this.f126021c.getSelectNumber(), this.f126021c.m70675p0());
        } else {
            lsi0.m151593w(R$string.f44908j0);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m148440n(int i) {
        if (i == 2) {
            this.f126022d.setText(R$string.f44909k);
        } else if (i == 3) {
            this.f126022d.setText(R$string.f44896d0);
        }
        this.f126022d.setBackgroundResource(h3c0.f105693o);
        this.f126022d.setTextColor(kvc0.m147352a(g1c0.f100170y));
    }

    /* JADX INFO: renamed from: p */
    public final void m148441p(BLiveNiceNumberDetail bLiveNiceNumberDetail) {
        m148444u(true);
        boolean z = bLiveNiceNumberDetail.qualified;
        VText vText = this.f126023e;
        if (z) {
            vText.setText(m148437k(bLiveNiceNumberDetail.remainTimes));
        } else {
            vText.setText(R$string.f44904h0);
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m148442q(BLiveNiceNumberDetail bLiveNiceNumberDetail) {
        this.f126021c.m70676q0(bLiveNiceNumberDetail, this.f126027i);
    }

    /* JADX INFO: renamed from: s */
    public void m148443s(BLiveNiceNumberList bLiveNiceNumberList, boolean z) {
        this.f126021c.m70677r0(bLiveNiceNumberList, z);
        if (z) {
            m148444u(false);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m148444u(boolean z) {
        if (z) {
            this.f126022d.setText(w8u.m202217t(R$string.f44909k));
        }
        this.f126022d.setBackgroundResource(h3c0.f105672h);
        this.f126022d.setTextColor(kvc0.m147352a(g1c0.f100152g));
    }

    /* JADX INFO: renamed from: v */
    public void m148445v(final wi40 wi40Var) {
        this.f126026h = wi40Var;
        if (wi40Var.getNiceNumberDetail() != null) {
            m148442q(wi40Var.getNiceNumberDetail());
            m148441p(wi40Var.getNiceNumberDetail());
        }
        if (wi40Var.getNiceNumberList() != null) {
            m148443s(wi40Var.getNiceNumberList(), false);
        }
        xdl0.m208329E0(this.f126022d, new View.OnClickListener() { // from class: l.k4d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f121083a.m148439m(wi40Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m148446w() {
        lsi0.m151593w(R$string.f44906i0);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
