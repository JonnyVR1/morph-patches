package p006l;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.TextScale;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AbsPurchaseSectionView;
import com.p000p1.mobile.putong.core.p004ui.purchase.showcase.AnimBorderSectionView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.a9j0;
import l.cr4;
import l.e30;
import l.j760;
import l.t100;
import l.v8j0;
import l.v9j;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public abstract class mp0 implements xhe0 {

    /* JADX INFO: renamed from: a */
    public final Act f17158a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f17159b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f17160c;

    /* JADX INFO: renamed from: d */
    public View f17161d;

    /* JADX INFO: renamed from: e */
    public e30<d> f17162e;

    /* JADX INFO: renamed from: f */
    public e30<d> f17163f;

    /* JADX INFO: renamed from: g */
    public List<d> f17164g;

    /* JADX INFO: renamed from: h */
    public d f17165h;

    /* JADX INFO: renamed from: i */
    public AbsPurchaseSectionView f17166i;

    /* JADX INFO: renamed from: j */
    public boolean f17167j = false;

    /* JADX INFO: renamed from: k */
    public boolean f17168k = false;

    /* JADX INFO: renamed from: l */
    public float f17169l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f17170m = -1.0f;

    /* JADX INFO: renamed from: n */
    public a9j0 f17171n = new a9j0();

    /* JADX INFO: renamed from: o */
    public InterfaceC1028a f17172o;

    /* JADX INFO: renamed from: l.mp0$a */
    public interface InterfaceC1028a {
        /* JADX INFO: renamed from: a */
        void mo19497a(boolean z, boolean z2);
    }

    public mp0(Act act, PurchaseType purchaseType) {
        this.f17158a = act;
        this.f17159b = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m19477g(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).startTransition(1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m19479j(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(xdl0.O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m19482A(d dVar, List list, View view) {
        if (dVar.l() && NullChecker.a(this.f17163f)) {
            this.f17163f.call(dVar);
        }
        if (dVar.l() || !dVar.f()) {
            if (NullChecker.a(this.f17172o)) {
                this.f17172o.mo19497a(dVar.l(), dVar.f());
                return;
            }
            return;
        }
        vwb.z(list, new e30() { // from class: l.kp0
            public final void call(Object obj) {
                ((d) obj).v(false);
            }
        });
        dVar.v(true);
        dVar.k = true;
        boolean zM = dVar.m();
        mo16595D();
        mo16596E(dVar);
        m19490m(dVar.m() ^ zM);
    }

    /* JADX INFO: renamed from: B */
    public View m19483B(View view) {
        if (NullChecker.a(view.getParent())) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo16594C(d dVar);

    /* JADX INFO: renamed from: D */
    public abstract void mo16595D();

    /* JADX INFO: renamed from: F */
    public abstract void mo16597F(AbsPurchaseSectionView absPurchaseSectionView, d dVar, boolean z);

    /* JADX INFO: renamed from: G */
    public void m19484G(List<d> list) {
        for (int i = 0; i < list.size(); i++) {
            d dVar = list.get(i);
            j760<AbsPurchaseSectionView, LinearLayout.LayoutParams> j760VarM19493u = m19493u(i, list);
            AbsPurchaseSectionView absPurchaseSectionView = (AbsPurchaseSectionView) j760VarM19493u.a;
            mo16597F(absPurchaseSectionView, dVar, dVar.l());
            Object obj = j760VarM19493u.b;
            if (obj != null) {
                this.f17160c.addView(absPurchaseSectionView, (ViewGroup.LayoutParams) obj);
            }
            if (dVar.l()) {
                if (!this.f17167j) {
                    m19486I(absPurchaseSectionView);
                    mo16594C(dVar);
                    this.f17167j = true;
                }
                this.f17165h = dVar;
                if (NullChecker.a(this.f17162e)) {
                    this.f17162e.call(dVar);
                }
                mo13099b();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m19485H(InterfaceC1028a interfaceC1028a) {
        this.f17172o = interfaceC1028a;
    }

    /* JADX INFO: renamed from: I */
    public final void m19486I(AbsPurchaseSectionView absPurchaseSectionView) {
        if (absPurchaseSectionView instanceof AnimBorderSectionView) {
            vwb.z(((AnimBorderSectionView) absPurchaseSectionView).getAnimBackgroundList(), new e30() { // from class: l.ip0
                public final void call(Object obj) {
                    mp0.m19477g((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m19487J(View view) {
        if (view instanceof AnimBorderSectionView) {
            vwb.z(((AnimBorderSectionView) view).getAnimBackgroundList(), new e30() { // from class: l.lp0
                public final void call(Object obj) {
                    mp0.m19479j((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m19488K() {
        AbsPurchaseSectionView absPurchaseSectionView = null;
        for (int i = 0; i < this.f17164g.size(); i++) {
            AbsPurchaseSectionView absPurchaseSectionView2 = (AbsPurchaseSectionView) m19493u(i, this.f17164g).a;
            if (absPurchaseSectionView2 instanceof AnimBorderSectionView) {
                boolean zL = this.f17164g.get(i).l();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) absPurchaseSectionView2.getLayoutParams();
                float f = this.f17169l;
                if (f <= 0.0f) {
                    layoutParams.weight = zL ? 1.173f : 1.0f;
                } else {
                    float f2 = this.f17170m;
                    if (f2 <= 0.0f) {
                        if (zL) {
                            f *= 1.173f;
                        }
                        layoutParams.width = (int) f;
                    } else {
                        if (zL) {
                            f = f2;
                        }
                        layoutParams.width = (int) f;
                    }
                }
                absPurchaseSectionView2.setLayoutParams(layoutParams);
                if (zL) {
                    absPurchaseSectionView = absPurchaseSectionView2;
                }
            }
        }
        m19487J(absPurchaseSectionView);
        m19487J(this.f17166i);
        this.f17166i = absPurchaseSectionView;
        m19484G(this.f17164g);
    }

    /* JADX INFO: renamed from: L */
    public void m19489L(d dVar) {
        m19490m(dVar.m() ^ dVar.m());
        mo16595D();
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: a */
    public View mo13098a(ViewGroup viewGroup, boolean z) {
        if (!m19495y()) {
            mo16608d();
            if (NullChecker.a((Object) null)) {
                LinearLayout linearLayout = new LinearLayout(this.f17158a);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.d(178.0f)));
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.addView(m19483B(m19492q()));
                linearLayout.addView(m19483B(mo16614p()));
                return linearLayout;
            }
        }
        return m19492q();
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: f */
    public void mo13102f(List<d> list, e30<d> e30Var, e30<Integer> e30Var2, e30<d> e30Var3) {
        this.f17162e = e30Var;
        this.f17164g = list;
        this.f17163f = e30Var3;
        m19491n();
    }

    @Override // p006l.c3m
    /* JADX INFO: renamed from: h */
    public void mo13103h(List<d> list, e30<d> e30Var, e30<Integer> e30Var2) {
        this.f17162e = e30Var;
        this.f17164g = list;
        m19491n();
    }

    /* JADX INFO: renamed from: m */
    public void m19490m(boolean z) {
        m19494x();
        LinearLayout linearLayout = this.f17160c;
        if (z) {
            xdl0.b0(linearLayout, new v9j() { // from class: l.jp0
                public final Object call() {
                    return this.f15310a.m19496z();
                }
            });
            return;
        }
        v8j0.b(linearLayout);
        v8j0.a(this.f17160c, this.f17171n);
        m19488K();
    }

    /* JADX INFO: renamed from: n */
    public void m19491n() {
        this.f17167j = false;
        int measuredWidth = this.f17160c.getMeasuredWidth();
        if (measuredWidth > 0 && !m19495y() && NullChecker.a(this.f17161d)) {
            this.f17169l = (measuredWidth - t100.d(36.0f)) / 3.173f;
        }
        this.f17160c.removeAllViews();
        m19484G(this.f17164g);
    }

    /* JADX INFO: renamed from: o */
    public abstract AbsPurchaseSectionView mo16613o(d dVar, ViewGroup viewGroup);

    /* JADX INFO: renamed from: p */
    public View mo16614p() {
        View view = this.f17161d;
        if (view != null) {
            return view;
        }
        mo16608d();
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public View m19492q() {
        if (this.f17160c == null) {
            this.f17160c = new LinearLayout(this.f17158a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int iMo16615r = t100.g;
            layoutParams.setMargins(0, 0, 0, t100.f);
            this.f17160c.setLayoutParams(layoutParams);
            this.f17160c.setClipChildren(false);
            this.f17160c.setClipToPadding(false);
            this.f17160c.setOrientation(0);
            if (mo16615r() != -1) {
                iMo16615r = mo16615r();
            }
            this.f17160c.setPadding(mo16617t(), mo16619w(), mo16618v(), iMo16615r);
        }
        return this.f17160c;
    }

    /* JADX INFO: renamed from: r */
    public int mo16615r() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public int mo16616s() {
        return t100.g;
    }

    /* JADX INFO: renamed from: t */
    public int mo16617t() {
        return t100.j;
    }

    /* JADX INFO: renamed from: u */
    public final j760<AbsPurchaseSectionView, LinearLayout.LayoutParams> m19493u(int i, final List<d> list) {
        if (i < this.f17160c.getChildCount()) {
            return j760.a((AbsPurchaseSectionView) this.f17160c.getChildAt(i), (Object) null);
        }
        final d dVar = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewMo16613o = mo16613o(dVar, this.f17160c);
        absPurchaseSectionViewMo16613o.setOnClickListener(new View.OnClickListener() { // from class: l.hp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13994a.m19482A(dVar, list, view);
            }
        });
        if (list.size() <= 1) {
            return j760.a(absPurchaseSectionViewMo16613o, new LinearLayout.LayoutParams(-1, -1));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 8388611;
        if (dVar.l()) {
            this.f17166i = absPurchaseSectionViewMo16613o;
            float f = this.f17169l;
            if (f > 0.0f) {
                float f2 = this.f17170m;
                if (f2 <= 0.0f) {
                    layoutParams.width = (int) (f * 1.173f);
                } else {
                    layoutParams.width = (int) f2;
                }
            } else {
                layoutParams.weight = 1.173f;
            }
        } else {
            float f3 = this.f17169l;
            if (f3 > 0.0f) {
                layoutParams.width = (int) f3;
            } else {
                layoutParams.weight = 1.0f;
            }
        }
        if (i != 0) {
            layoutParams.leftMargin = mo16616s();
        }
        return j760.a(absPurchaseSectionViewMo16613o, layoutParams);
    }

    /* JADX INFO: renamed from: v */
    public int mo16618v() {
        return t100.j;
    }

    /* JADX INFO: renamed from: w */
    public int mo16619w() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m19494x() {
        if (this.f17168k) {
            return;
        }
        this.f17168k = true;
        this.f17171n.f(new cr4());
        this.f17171n.f(new TextScale());
        this.f17171n.f(new lii0());
        this.f17171n.r(200L);
    }

    /* JADX INFO: renamed from: y */
    public boolean m19495y() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Boolean m19496z() {
        v8j0.b(this.f17160c);
        v8j0.a(this.f17160c, this.f17171n);
        m19488K();
        return Boolean.TRUE;
    }

    @Override // p006l.c3m
    public void release() {
    }

    /* JADX INFO: renamed from: E */
    public void mo16596E(d dVar) {
    }
}
