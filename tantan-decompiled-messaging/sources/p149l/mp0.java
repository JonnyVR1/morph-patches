package p149l;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.internal.TextScale;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AbsPurchaseSectionView;
import com.p046p1.mobile.putong.core.p053ui.purchase.showcase.AnimBorderSectionView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class mp0 implements xhe0 {

    /* JADX INFO: renamed from: a */
    public final Act f134966a;

    /* JADX INFO: renamed from: b */
    public final PurchaseType f134967b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f134968c;

    /* JADX INFO: renamed from: d */
    public View f134969d;

    /* JADX INFO: renamed from: e */
    public e30<C8765d> f134970e;

    /* JADX INFO: renamed from: f */
    public e30<C8765d> f134971f;

    /* JADX INFO: renamed from: g */
    public List<C8765d> f134972g;

    /* JADX INFO: renamed from: h */
    public C8765d f134973h;

    /* JADX INFO: renamed from: i */
    public AbsPurchaseSectionView f134974i;

    /* JADX INFO: renamed from: j */
    public boolean f134975j = false;

    /* JADX INFO: renamed from: k */
    public boolean f134976k = false;

    /* JADX INFO: renamed from: l */
    public float f134977l = 0.0f;

    /* JADX INFO: renamed from: m */
    public float f134978m = -1.0f;

    /* JADX INFO: renamed from: n */
    public a9j0 f134979n = new a9j0();

    /* JADX INFO: renamed from: o */
    public InterfaceC18522a f134980o;

    /* JADX INFO: renamed from: l.mp0$a */
    public interface InterfaceC18522a {
        /* JADX INFO: renamed from: a */
        void mo106044a(boolean z, boolean z2);
    }

    public mp0(Act act, PurchaseType purchaseType) {
        this.f134966a = act;
        this.f134967b = purchaseType;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m155730g(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).startTransition(1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m155732j(View view) {
        if (view.getBackground() instanceof TransitionDrawable) {
            ((TransitionDrawable) view.getBackground()).reverseTransition(xdl0.m208349O0(view) ? 200 : 0);
        }
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m155735A(C8765d c8765d, List list, View view) {
        if (c8765d.m53530l() && NullChecker.m81303a(this.f134971f)) {
            this.f134971f.call(c8765d);
        }
        if (c8765d.m53530l() || !c8765d.m53524f()) {
            if (NullChecker.m81303a(this.f134980o)) {
                this.f134980o.mo106044a(c8765d.m53530l(), c8765d.m53524f());
                return;
            }
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.kp0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((C8765d) obj).m53540v(false);
            }
        });
        c8765d.m53540v(true);
        c8765d.f34529k = true;
        boolean zM53531m = c8765d.m53531m();
        mo135400D();
        mo135401E(c8765d);
        m155743m(c8765d.m53531m() ^ zM53531m);
    }

    /* JADX INFO: renamed from: B */
    public View m155736B(View view) {
        if (NullChecker.m81303a(view.getParent())) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        return view;
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo135399C(C8765d c8765d);

    /* JADX INFO: renamed from: D */
    public abstract void mo135400D();

    /* JADX INFO: renamed from: F */
    public abstract void mo135402F(AbsPurchaseSectionView absPurchaseSectionView, C8765d c8765d, boolean z);

    /* JADX INFO: renamed from: G */
    public void m155737G(List<C8765d> list) {
        for (int i = 0; i < list.size(); i++) {
            C8765d c8765d = list.get(i);
            j760<AbsPurchaseSectionView, LinearLayout.LayoutParams> j760VarM155746u = m155746u(i, list);
            AbsPurchaseSectionView absPurchaseSectionView = j760VarM155746u.f116564a;
            mo135402F(absPurchaseSectionView, c8765d, c8765d.m53530l());
            LinearLayout.LayoutParams layoutParams = j760VarM155746u.f116565b;
            if (layoutParams != null) {
                this.f134968c.addView(absPurchaseSectionView, layoutParams);
            }
            if (c8765d.m53530l()) {
                if (!this.f134975j) {
                    m155739I(absPurchaseSectionView);
                    mo135399C(c8765d);
                    this.f134975j = true;
                }
                this.f134973h = c8765d;
                if (NullChecker.m81303a(this.f134970e)) {
                    this.f134970e.call(c8765d);
                }
                mo105093b();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m155738H(InterfaceC18522a interfaceC18522a) {
        this.f134980o = interfaceC18522a;
    }

    /* JADX INFO: renamed from: I */
    public final void m155739I(AbsPurchaseSectionView absPurchaseSectionView) {
        if (absPurchaseSectionView instanceof AnimBorderSectionView) {
            vwb.m200354z(((AnimBorderSectionView) absPurchaseSectionView).getAnimBackgroundList(), new e30() { // from class: l.ip0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mp0.m155730g((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m155740J(View view) {
        if (view instanceof AnimBorderSectionView) {
            vwb.m200354z(((AnimBorderSectionView) view).getAnimBackgroundList(), new e30() { // from class: l.lp0
                @Override // p149l.e30
                public final void call(Object obj) {
                    mp0.m155732j((View) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m155741K() {
        AbsPurchaseSectionView absPurchaseSectionView = null;
        for (int i = 0; i < this.f134972g.size(); i++) {
            AbsPurchaseSectionView absPurchaseSectionView2 = m155746u(i, this.f134972g).f116564a;
            if (absPurchaseSectionView2 instanceof AnimBorderSectionView) {
                boolean zM53530l = this.f134972g.get(i).m53530l();
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) absPurchaseSectionView2.getLayoutParams();
                float f = this.f134977l;
                if (f <= 0.0f) {
                    layoutParams.weight = zM53530l ? 1.173f : 1.0f;
                } else {
                    float f2 = this.f134978m;
                    if (f2 <= 0.0f) {
                        if (zM53530l) {
                            f *= 1.173f;
                        }
                        layoutParams.width = (int) f;
                    } else {
                        if (zM53530l) {
                            f = f2;
                        }
                        layoutParams.width = (int) f;
                    }
                }
                absPurchaseSectionView2.setLayoutParams(layoutParams);
                if (zM53530l) {
                    absPurchaseSectionView = absPurchaseSectionView2;
                }
            }
        }
        m155740J(absPurchaseSectionView);
        m155740J(this.f134974i);
        this.f134974i = absPurchaseSectionView;
        m155737G(this.f134972g);
    }

    /* JADX INFO: renamed from: L */
    public void m155742L(C8765d c8765d) {
        m155743m(c8765d.m53531m() ^ c8765d.m53531m());
        mo135400D();
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: a */
    public View mo105092a(ViewGroup viewGroup, boolean z) {
        if (!m155748y()) {
            mo135413d();
            if (NullChecker.m81303a(null)) {
                LinearLayout linearLayout = new LinearLayout(this.f134966a);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.m186890d(178.0f)));
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.addView(m155736B(m155745q()));
                linearLayout.addView(m155736B(mo135419p()));
                return linearLayout;
            }
        }
        return m155745q();
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: f */
    public void mo105096f(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2, e30<C8765d> e30Var3) {
        this.f134970e = e30Var;
        this.f134972g = list;
        this.f134971f = e30Var3;
        m155744n();
    }

    @Override // p149l.c3m
    /* JADX INFO: renamed from: h */
    public void mo105097h(List<C8765d> list, e30<C8765d> e30Var, e30<Integer> e30Var2) {
        this.f134970e = e30Var;
        this.f134972g = list;
        m155744n();
    }

    /* JADX INFO: renamed from: m */
    public void m155743m(boolean z) {
        m155747x();
        LinearLayout linearLayout = this.f134968c;
        if (z) {
            xdl0.m208366b0(linearLayout, new v9j() { // from class: l.jp0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f119030a.m155749z();
                }
            });
            return;
        }
        v8j0.m197459b(linearLayout);
        v8j0.m197458a(this.f134968c, this.f134979n);
        m155741K();
    }

    /* JADX INFO: renamed from: n */
    public void m155744n() {
        this.f134975j = false;
        int measuredWidth = this.f134968c.getMeasuredWidth();
        if (measuredWidth > 0 && !m155748y() && NullChecker.m81303a(this.f134969d)) {
            this.f134977l = (measuredWidth - t100.m186890d(36.0f)) / 3.173f;
        }
        this.f134968c.removeAllViews();
        m155737G(this.f134972g);
    }

    /* JADX INFO: renamed from: o */
    public abstract AbsPurchaseSectionView mo135418o(C8765d c8765d, ViewGroup viewGroup);

    /* JADX INFO: renamed from: p */
    public View mo135419p() {
        View view = this.f134969d;
        if (view != null) {
            return view;
        }
        mo135413d();
        throw null;
    }

    /* JADX INFO: renamed from: q */
    public View m155745q() {
        if (this.f134968c == null) {
            this.f134968c = new LinearLayout(this.f134966a);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            int iMo135420r = t100.f167258g;
            layoutParams.setMargins(0, 0, 0, t100.f167257f);
            this.f134968c.setLayoutParams(layoutParams);
            this.f134968c.setClipChildren(false);
            this.f134968c.setClipToPadding(false);
            this.f134968c.setOrientation(0);
            if (mo135420r() != -1) {
                iMo135420r = mo135420r();
            }
            this.f134968c.setPadding(mo135422t(), mo135424w(), mo135423v(), iMo135420r);
        }
        return this.f134968c;
    }

    /* JADX INFO: renamed from: r */
    public int mo135420r() {
        return -1;
    }

    /* JADX INFO: renamed from: s */
    public int mo135421s() {
        return t100.f167258g;
    }

    /* JADX INFO: renamed from: t */
    public int mo135422t() {
        return t100.f167261j;
    }

    /* JADX INFO: renamed from: u */
    public final j760<AbsPurchaseSectionView, LinearLayout.LayoutParams> m155746u(int i, final List<C8765d> list) {
        if (i < this.f134968c.getChildCount()) {
            return j760.m140076a((AbsPurchaseSectionView) this.f134968c.getChildAt(i), null);
        }
        final C8765d c8765d = list.get(i);
        AbsPurchaseSectionView absPurchaseSectionViewMo135418o = mo135418o(c8765d, this.f134968c);
        absPurchaseSectionViewMo135418o.setOnClickListener(new View.OnClickListener() { // from class: l.hp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108880a.m155735A(c8765d, list, view);
            }
        });
        if (list.size() <= 1) {
            return j760.m140076a(absPurchaseSectionViewMo135418o, new LinearLayout.LayoutParams(-1, -1));
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.gravity = 8388611;
        if (c8765d.m53530l()) {
            this.f134974i = absPurchaseSectionViewMo135418o;
            float f = this.f134977l;
            if (f > 0.0f) {
                float f2 = this.f134978m;
                if (f2 <= 0.0f) {
                    layoutParams.width = (int) (f * 1.173f);
                } else {
                    layoutParams.width = (int) f2;
                }
            } else {
                layoutParams.weight = 1.173f;
            }
        } else {
            float f3 = this.f134977l;
            if (f3 > 0.0f) {
                layoutParams.width = (int) f3;
            } else {
                layoutParams.weight = 1.0f;
            }
        }
        if (i != 0) {
            layoutParams.leftMargin = mo135421s();
        }
        return j760.m140076a(absPurchaseSectionViewMo135418o, layoutParams);
    }

    /* JADX INFO: renamed from: v */
    public int mo135423v() {
        return t100.f167261j;
    }

    /* JADX INFO: renamed from: w */
    public int mo135424w() {
        return 0;
    }

    /* JADX INFO: renamed from: x */
    public final void m155747x() {
        if (this.f134976k) {
            return;
        }
        this.f134976k = true;
        this.f134979n.m95430f(new cr4());
        this.f134979n.m95430f(new TextScale());
        this.f134979n.m95430f(new lii0());
        this.f134979n.setDuration(200L);
    }

    /* JADX INFO: renamed from: y */
    public boolean m155748y() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Boolean m155749z() {
        v8j0.m197459b(this.f134968c);
        v8j0.m197458a(this.f134968c, this.f134979n);
        m155741K();
        return Boolean.TRUE;
    }

    @Override // p149l.c3m
    public void release() {
    }

    /* JADX INFO: renamed from: E */
    public void mo135401E(C8765d c8765d) {
    }
}
