package p003l;

import android.animation.Animator;
import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import com.p000p1.mobile.putong.core.p001ui.map.intl.IntlMapBaseAct;
import com.p000p1.mobile.putong.core.p001ui.map.intl.IntlMapItem;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import l.bt0;
import l.e51;
import l.evg0;
import l.f6c0;
import l.h7c0;
import l.jtk;
import l.muw;
import l.ptk;
import l.s5c0;
import l.s7m;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xao;
import l.xdl0;
import l.ytw;
import p028v.VFrame;
import p028v.VLinear;
import p028v.VList;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rbo implements s7m<xao> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f6856a;

    /* JADX INFO: renamed from: b */
    public VFrame f6857b;

    /* JADX INFO: renamed from: c */
    public ImageView f6858c;

    /* JADX INFO: renamed from: d */
    public ImageView f6859d;

    /* JADX INFO: renamed from: e */
    public VLinear f6860e;

    /* JADX INFO: renamed from: f */
    public IntlMapItem f6861f;

    /* JADX INFO: renamed from: g */
    public VText f6862g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f6863h;

    /* JADX INFO: renamed from: i */
    public VList f6864i;

    /* JADX INFO: renamed from: j */
    public xao f6865j;

    /* JADX INFO: renamed from: k */
    public IntlMapBaseAct f6866k;

    /* JADX INFO: renamed from: l */
    public SearchView f6867l;

    /* JADX INFO: renamed from: m */
    public MenuItem f6868m;

    /* JADX INFO: renamed from: n */
    public View f6869n;

    /* JADX INFO: renamed from: o */
    public View f6870o;

    /* JADX INFO: renamed from: p */
    public TextView f6871p;

    /* JADX INFO: renamed from: q */
    public pvl.InterfaceC0482b f6872q;

    /* JADX INFO: renamed from: r */
    public pvl.InterfaceC0482b f6873r;

    /* JADX INFO: renamed from: s */
    public pvl f6874s;

    /* JADX INFO: renamed from: t */
    public pvl.InterfaceC0484d f6875t;

    /* JADX INFO: renamed from: u */
    public pvl.InterfaceC0484d f6876u;

    /* JADX INFO: renamed from: v */
    public String f6877v = null;

    /* JADX INFO: renamed from: l.rbo$c */
    public class C0501c implements SearchView.m {
        public C0501c() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m7249a(String str) {
            boolean z = false;
            rbo.this.f6868m.setEnabled(false);
            rbo.this.f6870o.setEnabled(false);
            View view = rbo.this.f6869n;
            if (str != null && !str.isEmpty()) {
                z = true;
            }
            xdl0.M(view, z);
            rbo.this.f6865j.k.onNext(str);
            return true;
        }

        /* JADX INFO: renamed from: b */
        public boolean m7250b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.rbo$d */
    public static class C0502d {
        /* JADX INFO: renamed from: b */
        public static void m7252b(rbo rboVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            rboVar.f6856a = (FrameLayout) viewGroup.getChildAt(0);
            rboVar.f6857b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            rboVar.f6858c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            rboVar.f6859d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            rboVar.f6860e = (VLinear) viewGroup.getChildAt(1);
            rboVar.f6861f = (IntlMapItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            rboVar.f6862g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            rboVar.f6863h = (FrameLayout) viewGroup.getChildAt(2);
            rboVar.f6864i = (VList) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m7253c(rbo rboVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.Cd, viewGroup, false);
            m7252b(rboVar, viewInflate);
            return viewInflate;
        }
    }

    public rbo(IntlMapBaseAct intlMapBaseAct) {
        this.f6866k = intlMapBaseAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m7206C0() {
        return this.f6866k;
    }

    /* JADX INFO: renamed from: F */
    public View m7207F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0502d.m7253c(this, layoutInflater, viewGroup);
    }

    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlMapBaseAct act() {
        return this.f6866k;
    }

    /* JADX INFO: renamed from: H */
    public void m7209H(ytw ytwVar) {
        this.f6861f.m430a0(ytwVar, -1, -1, true);
    }

    /* JADX INFO: renamed from: I */
    public void m7210I(pvl.InterfaceC0481a interfaceC0481a) {
        this.f6874s.m6934r1(interfaceC0481a);
    }

    /* JADX INFO: renamed from: J */
    public void m7211J(double d, double d2) {
        if (NullChecker.a(this.f6872q)) {
            this.f6872q.remove();
        }
        this.f6872q = this.f6874s.m6933d3().m6946g(false).m6944e(d, d2).m6943d(this.f6876u).m6942c(0.5f, 0.5f).m6941b();
    }

    /* JADX INFO: renamed from: K */
    public void m7212K() {
        this.f6860e.animate().translationY(t100.d(49.0f)).start();
    }

    /* JADX INFO: renamed from: L */
    public void m7213L(double d, double d2, int i) {
        this.f6874s.m6930K1(d, d2, i);
    }

    /* JADX INFO: renamed from: M */
    public void m7214M() {
        this.f6858c.animate().translationY(0.0f).alpha(1.0f).start();
    }

    /* JADX INFO: renamed from: N */
    public void m7215N() {
        this.f6858c.animate().translationY((-this.f6858c.getHeight()) / 8).alpha(0.5f).start();
    }

    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void m7237i1(xao xaoVar) {
        this.f6865j = xaoVar;
    }

    /* JADX INFO: renamed from: P */
    public void m7217P() {
        if (NullChecker.a(this.f6874s)) {
            this.f6874s.m6932b2();
        }
    }

    /* JADX INFO: renamed from: Q */
    public pvl m7218Q() {
        return this.f6874s;
    }

    /* JADX INFO: renamed from: R */
    public void m7219R(boolean z) {
        if (NullChecker.a(this.f6867l)) {
            this.f6866k.hideInput(this.f6867l);
            if (!z) {
                m7245q0(false);
            }
            this.f6867l.clearFocus();
            this.f6869n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m7220S(boolean z) {
        this.f6867l.setIconified(z);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: T */
    public void m7221T(View.OnClickListener onClickListener) {
        this.f6862g.setText(R.string.kh);
        this.f6862g.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: U */
    public void m7222U(Menu menu, final int i, boolean z, final d30 d30Var) {
        this.f6866k.getMenuInflater().inflate(h7c0.d, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.m8);
        this.f6868m = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f6870o = actionView;
        this.f6871p = (TextView) actionView.findViewById(u4c0.n8);
        this.f6866k.getAppTheme().j(this.f6871p);
        TextView textView = this.f6871p;
        IntlMapBaseAct intlMapBaseAct = this.f6866k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R.string.v) : intlMapBaseAct.string(R.string.b));
        MenuItem menuItem = this.f6868m;
        IntlMapBaseAct intlMapBaseAct2 = this.f6866k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R.string.v) : intlMapBaseAct2.string(R.string.b)));
        this.f6868m.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.kbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (!z) {
            menu.removeItem(u4c0.k8);
            return;
        }
        this.f6867l = menu.findItem(u4c0.k8).getActionView();
        this.f6866k.getAppTheme().l(this.f6867l);
        xdl0.b0(this.f6870o, new v9j() { // from class: l.lbo
            @Override // p003l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f5249a.m7226Y();
            }
        });
        e51.y(new Runnable() { // from class: l.mbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f5575a.m7228a0();
            }
        });
        try {
            mep0.m6391e1((AutoCompleteTextView) this.f6867l.findViewById(s5c0.J), x2c0.tr);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f6869n = (View) declaredField.get(this.f6867l);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.c(e3);
        }
        this.f6867l.setOnSearchClickListener(new View.OnClickListener() { // from class: l.nbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5867a.m7229b0(i, view);
            }
        });
        this.f6867l.setOnQueryTextListener(new C0501c());
        this.f6867l.setOnCloseListener(new SearchView.l() { // from class: l.obo
            public final boolean onClose() {
                return this.f6092a.m7230c0();
            }
        });
        this.f6867l.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.pbo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                this.f6355a.m7231d0(view, z2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m7223V(List<muw> list) {
        boolean zJ = vwb.J(list);
        VList vList = this.f6864i;
        if (zJ) {
            vList.setOnTouchListener(null);
        } else {
            vList.setOnTouchListener(new View.OnTouchListener() { // from class: l.jbo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f4610a.m7232e0(view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m7224W(pvl.InterfaceC0482b interfaceC0482b) {
        return interfaceC0482b == this.f6872q;
    }

    /* JADX INFO: renamed from: X */
    public boolean m7225X() {
        SearchView searchView = this.f6867l;
        return (searchView == null || searchView.isIconified()) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m7226Y() {
        this.f6867l.setMaxWidth((xdl0.y0() - t100.d(72.0f)) - Math.max(this.f6870o.getMeasuredWidth(), t100.d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m7227Z(SearchableInfo searchableInfo) {
        SearchView searchView = this.f6867l;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m7228a0() {
        final SearchableInfo searchableInfo = ((SearchManager) act().getSystemService("search")).getSearchableInfo(act().getComponentName());
        e51.F(act(), new Runnable() { // from class: l.hbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f4163a.m7227Z(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m7229b0(int i, View view) {
        TextView textView = this.f6871p;
        IntlMapBaseAct intlMapBaseAct = this.f6866k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R.string.v) : intlMapBaseAct.string(R.string.b));
        MenuItem menuItem = this.f6868m;
        IntlMapBaseAct intlMapBaseAct2 = this.f6866k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R.string.v) : intlMapBaseAct2.string(R.string.b)));
        this.f6868m.setEnabled(false);
        this.f6870o.setEnabled(false);
        this.f6867l.requestFocus();
        m7245q0(true);
        this.f6869n.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m7230c0() {
        m7245q0(false);
        xdl0.M0(this.f6864i, false);
        m7248s0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m7231d0(View view, boolean z) {
        if (z) {
            m7245q0(true);
        } else {
            this.f6869n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m7232e0(View view, MotionEvent motionEvent) {
        if (!NullChecker.a(this.f6867l) || !this.f6867l.hasFocus()) {
            return false;
        }
        this.f6867l.clearFocus();
        this.f6869n.setVisibility(8);
        this.f6866k.hideInput(this.f6867l);
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m7233f0(String str) {
        this.f6877v = null;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m7234g0(String str) {
        this.f6867l.onActionViewExpanded();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ boolean m7235h0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.a(this.f6867l)) {
            this.f6867l.setIconified(true);
        }
        if (NullChecker.a(this.f6867l)) {
            this.f6867l.setIconified(true);
        }
        m7245q0(false);
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public void m7236i0(String str, boolean z) {
        this.f6867l.setQuery(str, z);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m7207F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m7238j0() {
        if (NullChecker.a(this.f6876u)) {
            this.f6876u.recycle();
        }
        if (NullChecker.a(this.f6875t)) {
            this.f6875t.recycle();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m7239k0() {
        if (NullChecker.a(this.f6873r)) {
            this.f6873r.remove();
            this.f6873r = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m7240l0(double d, double d2, boolean z) {
        pvl.InterfaceC0482b interfaceC0482b = this.f6873r;
        if (z) {
            if (NullChecker.a(interfaceC0482b)) {
                this.f6873r.remove();
                this.f6873r = null;
                return;
            }
            return;
        }
        if (NullChecker.a(interfaceC0482b)) {
            this.f6873r.remove();
            this.f6873r = null;
        }
        this.f6873r = this.f6874s.m6933d3().m6943d(this.f6875t).m6942c(0.5f, 0.5f).m6944e(d, d2).m6946g(false).m6941b();
    }

    /* JADX INFO: renamed from: m0 */
    public void m7241m0(evg0 evg0Var) {
        this.f6864i.setAdapter((ListAdapter) evg0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m7242n0(boolean z) {
        VLinear vLinear = this.f6860e;
        if (z) {
            vLinear.animate().translationY(0.0f).setListener(new bt0.j()).start();
        } else {
            vLinear.animate().translationY(t100.d(49.0f)).start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m7243o0(boolean z) {
        xdl0.M0(this.f6859d, z);
    }

    /* JADX INFO: renamed from: p0 */
    public void m7244p0() {
        if (TextUtils.isEmpty(this.f6877v)) {
            jtk jtkVar = new jtk(act());
            TextView textView = new TextView(act());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R.string.ys);
            textView.getPaint().setFakeBoldText(true);
            jtkVar.j(textView).e(new int[]{-17664}).i(jtk.A | jtk.C).m(t100.d(90.0f)).n(t100.d(5.0f)).h(70).f(t100.d(10.0f)).a(3000L).c(true).b(new jtk.a() { // from class: l.gbo
                /* JADX INFO: renamed from: a */
                public final void m4527a(String str) {
                    this.f3843a.m7234g0(str);
                }
            }).d(new jtk.b() { // from class: l.ibo
                /* JADX INFO: renamed from: a */
                public final void m5114a(String str) {
                    this.f4386a.m7233f0(str);
                }
            });
            this.f6877v = ptk.h().t(jtkVar, this.f6867l);
            CoreModule.c.j0.b0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m7245q0(boolean z) {
        if (z && this.f6863h.getVisibility() != 0) {
            this.f6863h.setVisibility(0);
            this.f6863h.setAlpha(0.0f);
            this.f6863h.animate().alpha(1.0f).setListener(new C0499a()).start();
            this.f6863h.setOnTouchListener(new View.OnTouchListener() { // from class: l.qbo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f6621a.m7235h0(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f6863h.getVisibility() != 0) {
            return;
        }
        this.f6863h.setAlpha(1.0f);
        this.f6863h.animate().alpha(0.0f).setListener(new C0500b()).start();
        this.f6863h.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: r */
    public void m7246r() {
        pvl pvlVarM419d2 = this.f6866k.m419d2();
        this.f6874s = pvlVarM419d2;
        this.f6875t = pvlVarM419d2.m6931X2(x2c0.Bt);
        this.f6876u = this.f6874s.m6931X2(x2c0.At);
    }

    /* JADX INFO: renamed from: r0 */
    public void m7247r0(boolean z) {
        xdl0.M0(this.f6864i, z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m7248s0() {
        if (NullChecker.a(this.f6868m) && NullChecker.a(this.f6870o)) {
            xao xaoVar = this.f6865j;
            boolean z = (xaoVar.g || xaoVar.e == null) ? false : true;
            this.f6868m.setEnabled(z);
            this.f6870o.setEnabled(z);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rbo$a */
    public class C0499a implements Animator.AnimatorListener {
        public C0499a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rbo.this.f6863h.setAlpha(0.0f);
            rbo.this.f6863h.setVisibility(4);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: l.rbo$b */
    public class C0500b implements Animator.AnimatorListener {
        public C0500b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rbo.this.f6863h.setTag(Boolean.FALSE);
            rbo.this.f6863h.setAlpha(1.0f);
            rbo.this.f6863h.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) rbo.this.f6863h.getTag()).booleanValue()) {
                rbo.this.f6863h.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            rbo.this.f6863h.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
