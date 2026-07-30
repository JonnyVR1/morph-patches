package p153l;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.TextScale;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AbsPurchaseSectionView;
import com.p051p1.mobile.putong.core.p058ui.purchase.showcase.AnimBorderSectionView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ip0 implements cqe0 {

    /* JADX INFO: renamed from: a */
    public final Act f116232a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f116233b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f116234c;

    /* JADX INFO: renamed from: d */
    public View f116235d;

    /* JADX INFO: renamed from: e */
    public y20<C8928d> f116236e;

    /* JADX INFO: renamed from: f */
    public y20<C8928d> f116237f;

    /* JADX INFO: renamed from: g */
    public List<C8928d> f116238g;

    /* JADX INFO: renamed from: h */
    public C8928d f116239h;

    /* JADX INFO: renamed from: i */
    public AbsPurchaseSectionView f116240i;

    /* JADX INFO: renamed from: j */
    public boolean f116241j = false;

    /* JADX INFO: renamed from: k */
    public boolean f116242k = false;

    /* JADX INFO: renamed from: l */
    public float f116243l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f116244m = -1.0f;

    /* JADX INFO: renamed from: n */
    public eij0 f116245n = new eij0();

    /* JADX INFO: renamed from: o */
    public InterfaceC17765a f116246o;

    /* JADX INFO: renamed from: l.ip0$a */
    public interface InterfaceC17765a {
        /* JADX INFO: renamed from: a */
        void mo108479a(boolean z, boolean z2);
    }

    public ip0(Act act, PurchaseType purchaseType) {
        this.f116232a = act;
        this.f116233b = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m141360g(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).startTransition(1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m141362j(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(bnl0.m105529O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m141365A(C8928d c8928d, List list, View view) {
        if (c8928d.m54713l() && NullChecker.m82486a(this.f116237f)) {
            this.f116237f.call(c8928d);
        }
        if (c8928d.m54713l() || !c8928d.m54707f()) {
            if (NullChecker.m82486a(this.f116246o)) {
                this.f116246o.mo108479a(c8928d.m54713l(), c8928d.m54707f());
                return;
            }
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.gp0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((C8928d) obj).m54723v(false);
            }
        });
        c8928d.m54723v(true);
        c8928d.f35377k = true;
        boolean zM54714m = c8928d.m54714m();
        mo141368D();
        mo141369E(c8928d);
        m141378m(c8928d.m54714m() ^ zM54714m);
    }

    /* JADX INFO: renamed from: B */
    public View m141366B(View view) {
        if (NullChecker.m82486a(view.getParent())) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo141367C(C8928d c8928d);

    /* JADX INFO: renamed from: D */
    public abstract void mo141368D();

    /* JADX INFO: renamed from: F */
    public abstract void mo141370F(AbsPurchaseSectionView absPurchaseSectionView, C8928d c8928d, boolean z);

    /* JADX INFO: renamed from: G */
    public void m141371G(List<C8928d> list) {
        for (int i = 0; i < list.size(); i++) {
            C8928d c8928d = list.get(i);
            pf60<AbsPurchaseSectionView, LinearLayout.LayoutParams> pf60VarM141386u = m141386u(i, list);
            AbsPurchaseSectionView absPurchaseSectionView = pf60VarM141386u.f152156a;
            mo141370F(absPurchaseSectionView, c8928d, c8928d.m54713l());
            LinearLayout.LayoutParams layoutParams = pf60VarM141386u.f152157b;
            if (layoutParams != null) {
                this.f116234c.addView(absPurchaseSectionView, layoutParams);
            }
            if (c8928d.m54713l()) {
                if (!this.f116241j) {
                    m141373I(absPurchaseSectionView);
                    mo141367C(c8928d);
                    this.f116241j = true;
                }
                this.f116239h = c8928d;
                if (NullChecker.m82486a(this.f116236e)) {
                    this.f116236e.call(c8928d);
                }
                mo126110b();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m141372H(InterfaceC17765a interfaceC17765a) {
        this.f116246o = interfaceC17765a;
    }

    /* JADX INFO: renamed from: I */
    public final void m141373I(AbsPurchaseSectionView absPurchaseSectionView) {
        if (absPurchaseSectionView instanceof AnimBorderSectionView) {
            jyb.m147537z(((AnimBorderSectionView) absPurchaseSectionView).getAnimBackgroundList(), new y20() { // from class: l.ep0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip0.m141360g((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m141374J(View view) {
        if (view instanceof AnimBorderSectionView) {
            jyb.m147537z(((AnimBorderSectionView) view).getAnimBackgroundList(), new y20() { // from class: l.hp0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ip0.m141362j((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m141375K() {
        AbsPurchaseSectionView absPurchaseSectionView = null;
        for (int i = 0; i < this.f116238g.size(); i++) {
            AbsPurchaseSectionView absPurchaseSectionView2 = m141386u(i, this.f116238g).f152156a;
            if (absPurchaseSectionView2 instanceof AnimBorderSectionView) {
                boolean zM54713l = this.f116238g.get(i).m54713l();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) absPurchaseSectionView2.getLayoutParams();
                float f = this.f116243l;
                if (f <= 0.0f) {
                    layoutParams.weight = zM54713l ? 1.173f : 1.0f;
                } else {
                    float f2 = this.f116244m;
                    if (f2 <= 0.0f) {
                        if (zM54713l) {
                            f *= 1.173f;
                        }
                        layoutParams.width = (int) f;
                    } else {
                        if (zM54713l) {
                            f = f2;
                        }
                        layoutParams.width = (int) f;
                    }
                }
                absPurchaseSectionView2.setLayoutParams(layoutParams);
                if (zM54713l) {
                    absPurchaseSectionView = absPurchaseSectionView2;
                }
            }
        }
        m141374J(absPurchaseSectionView);
        m141374J(this.f116240i);
        this.f116240i = absPurchaseSectionView;
        m141371G(this.f116238g);
    }

    /* JADX INFO: renamed from: L */
    public void m141376L(C8928d c8928d) {
        m141378m(c8928d.m54714m() ^ c8928d.m54714m());
        mo141368D();
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: a */
    public View mo126108a(ViewGroup viewGroup, boolean z) {
        if (!m141390y()) {
            mo111896d();
            if (NullChecker.m82486a(null)) {
                LinearLayout linearLayout = new LinearLayout(this.f116232a);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, qa00.m175859d(178.0f)));
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.addView(m141366B(m141382q()));
                linearLayout.addView(m141366B(mo141381p()));
                return linearLayout;
            }
        }
        return m141382q();
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: f */
    public void mo141377f(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2, y20<C8928d> y20Var3) {
        this.f116236e = y20Var;
        this.f116238g = list;
        this.f116237f = y20Var3;
        m141379n();
    }

    @Override // p153l.t5m
    /* JADX INFO: renamed from: h */
    public void mo126117h(List<C8928d> list, y20<C8928d> y20Var, y20<Integer> y20Var2) {
        this.f116236e = y20Var;
        this.f116238g = list;
        m141379n();
    }

    /* JADX INFO: renamed from: m */
    public void m141378m(boolean z) {
        m141389x();
        LinearLayout linearLayout = this.f116234c;
        if (z) {
            bnl0.m105546b0(linearLayout, new pcj() { // from class: l.fp0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f100096a.m141391z();
                }
            });
            return;
        }
        zhj0.m219689b(linearLayout);
        zhj0.m219688a(this.f116234c, this.f116245n);
        m141375K();
    }

    /* JADX INFO: renamed from: n */
    public void m141379n() {
        this.f116241j = false;
        int measuredWidth = this.f116234c.getMeasuredWidth();
        if (measuredWidth > 0 && !m141390y() && NullChecker.m82486a(this.f116235d)) {
            this.f116243l = (measuredWidth - qa00.m175859d(36.0f)) / 3.173f;
        }
        this.f116234c.removeAllViews();
        m141371G(this.f116238g);
    }

    /* JADX INFO: renamed from: o */
    public abstract AbsPurchaseSectionView mo141380o(C8928d c8928d, ViewGroup viewGroup);

    /* JADX INFO: renamed from: p */
    public View mo141381p() {
        View view = this.f116235d;
        if (view != null) {
            return view;
        }
        mo111896d();
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public View m141382q() {
        if (this.f116234c == null) {
            this.f116234c = new LinearLayout(this.f116232a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int iMo141383r = qa00.f156320g;
            layoutParams.setMargins(0, 0, 0, qa00.f156319f);
            this.f116234c.setLayoutParams(layoutParams);
            this.f116234c.setClipChildren(false);
            this.f116234c.setClipToPadding(false);
            this.f116234c.setOrientation(0);
            if (mo141383r() != -1) {
                iMo141383r = mo141383r();
            }
            this.f116234c.setPadding(mo141385t(), mo141388w(), mo141387v(), iMo141383r);
        }
        return this.f116234c;
    }

    /* JADX INFO: renamed from: r */
    public int mo141383r() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public int mo141384s() {
        return qa00.f156320g;
    }

    /* JADX INFO: renamed from: t */
    public int mo141385t() {
        return qa00.f156323j;
    }

    /* JADX INFO: renamed from: u */
    public final pf60<AbsPurchaseSectionView, LinearLayout.LayoutParams> m141386u(int i, final List<C8928d> list) {
        if (i < this.f116234c.getChildCount()) {
            return pf60.m172085a((AbsPurchaseSectionView) this.f116234c.getChildAt(i), null);
        }
        final C8928d c8928d = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewMo141380o = mo141380o(c8928d, this.f116234c);
        absPurchaseSectionViewMo141380o.setOnClickListener(new View.OnClickListener() { // from class: l.dp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90017a.m141365A(c8928d, list, view);
            }
        });
        if (list.size() <= 1) {
            return pf60.m172085a(absPurchaseSectionViewMo141380o, new LinearLayout.LayoutParams(-1, -1));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 8388611;
        if (c8928d.m54713l()) {
            this.f116240i = absPurchaseSectionViewMo141380o;
            float f = this.f116243l;
            if (f > 0.0f) {
                float f2 = this.f116244m;
                if (f2 <= 0.0f) {
                    layoutParams.width = (int) (f * 1.173f);
                } else {
                    layoutParams.width = (int) f2;
                }
            } else {
                layoutParams.weight = 1.173f;
            }
        } else {
            float f3 = this.f116243l;
            if (f3 > 0.0f) {
                layoutParams.width = (int) f3;
            } else {
                layoutParams.weight = 1.0f;
            }
        }
        if (i != 0) {
            layoutParams.leftMargin = mo141384s();
        }
        return pf60.m172085a(absPurchaseSectionViewMo141380o, layoutParams);
    }

    /* JADX INFO: renamed from: v */
    public int mo141387v() {
        return qa00.f156323j;
    }

    /* JADX INFO: renamed from: w */
    public int mo141388w() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m141389x() {
        if (this.f116242k) {
            return;
        }
        this.f116242k = true;
        this.f116245n.m120898f(new bs4());
        this.f116245n.m120898f(new TextScale());
        this.f116245n.m120898f(new lri0());
        this.f116245n.setDuration(200L);
    }

    /* JADX INFO: renamed from: y */
    public boolean m141390y() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Boolean m141391z() {
        zhj0.m219689b(this.f116234c);
        zhj0.m219688a(this.f116234c, this.f116245n);
        m141375K();
        return Boolean.TRUE;
    }

    @Override // p153l.t5m
    public void release() {
    }

    /* JADX INFO: renamed from: E */
    public void mo141369E(C8928d c8928d) {
    }
}
