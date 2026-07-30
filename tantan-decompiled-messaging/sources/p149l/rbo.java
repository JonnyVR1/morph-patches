package p149l;

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
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapBaseAct;
import com.p046p1.mobile.putong.core.p053ui.map.intl.IntlMapItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class rbo implements s7m<xao> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f158645a;

    /* JADX INFO: renamed from: b */
    public VFrame f158646b;

    /* JADX INFO: renamed from: c */
    public ImageView f158647c;

    /* JADX INFO: renamed from: d */
    public ImageView f158648d;

    /* JADX INFO: renamed from: e */
    public VLinear f158649e;

    /* JADX INFO: renamed from: f */
    public IntlMapItem f158650f;

    /* JADX INFO: renamed from: g */
    public VText f158651g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f158652h;

    /* JADX INFO: renamed from: i */
    public VList f158653i;

    /* JADX INFO: renamed from: j */
    public xao f158654j;

    /* JADX INFO: renamed from: k */
    public IntlMapBaseAct f158655k;

    /* JADX INFO: renamed from: l */
    public SearchView f158656l;

    /* JADX INFO: renamed from: m */
    public MenuItem f158657m;

    /* JADX INFO: renamed from: n */
    public View f158658n;

    /* JADX INFO: renamed from: o */
    public View f158659o;

    /* JADX INFO: renamed from: p */
    public TextView f158660p;

    /* JADX INFO: renamed from: q */
    public pvl.InterfaceC19346b f158661q;

    /* JADX INFO: renamed from: r */
    public pvl.InterfaceC19346b f158662r;

    /* JADX INFO: renamed from: s */
    public pvl f158663s;

    /* JADX INFO: renamed from: t */
    public pvl.InterfaceC19348d f158664t;

    /* JADX INFO: renamed from: u */
    public pvl.InterfaceC19348d f158665u;

    /* JADX INFO: renamed from: v */
    public String f158666v = null;

    /* JADX INFO: renamed from: l.rbo$c */
    public class C19667c implements SearchView.InterfaceC0150m {
        public C19667c() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: a */
        public boolean mo600a(String str) {
            boolean z = false;
            rbo.this.f158657m.setEnabled(false);
            rbo.this.f158659o.setEnabled(false);
            View view = rbo.this.f158658n;
            if (str != null && !str.isEmpty()) {
                z = true;
            }
            xdl0.m208344M(view, z);
            rbo.this.f158654j.f191769k.m132487l(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0150m
        /* JADX INFO: renamed from: b */
        public boolean mo601b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.rbo$d */
    public static class C19668d {
        /* JADX INFO: renamed from: b */
        public static void m178685b(rbo rboVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            rboVar.f158645a = (FrameLayout) viewGroup.getChildAt(0);
            rboVar.f158646b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            rboVar.f158647c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            rboVar.f158648d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            rboVar.f158649e = (VLinear) viewGroup.getChildAt(1);
            rboVar.f158650f = (IntlMapItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            rboVar.f158651g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            rboVar.f158652h = (FrameLayout) viewGroup.getChildAt(2);
            rboVar.f158653i = (VList) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m178686c(rbo rboVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(f6c0.f95312Cd, viewGroup, false);
            m178685b(rboVar, viewInflate);
            return viewInflate;
        }
    }

    public rbo(IntlMapBaseAct intlMapBaseAct) {
        this.f158655k = intlMapBaseAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158655k;
    }

    /* JADX INFO: renamed from: F */
    public View m178643F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19668d.m178686c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlMapBaseAct getAct() {
        return this.f158655k;
    }

    /* JADX INFO: renamed from: H */
    public void m178645H(ytw ytwVar) {
        this.f158650f.m47394a0(ytwVar, -1, -1, true);
    }

    /* JADX INFO: renamed from: I */
    public void m178646I(pvl.InterfaceC19345a interfaceC19345a) {
        this.f158663s.mo35936r1(interfaceC19345a);
    }

    /* JADX INFO: renamed from: J */
    public void m178647J(double d, double d2) {
        if (NullChecker.m81303a(this.f158661q)) {
            this.f158661q.remove();
        }
        this.f158661q = this.f158663s.mo35931d3().mo35945g(false).mo35943e(d, d2).mo35942d(this.f158665u).mo35941c(0.5f, 0.5f).mo35940b();
    }

    /* JADX INFO: renamed from: K */
    public void m178648K() {
        this.f158649e.animate().translationY(t100.m186890d(49.0f)).start();
    }

    /* JADX INFO: renamed from: L */
    public void m178649L(double d, double d2, int i) {
        this.f158663s.mo35927K1(d, d2, i);
    }

    /* JADX INFO: renamed from: M */
    public void m178650M() {
        this.f158647c.animate().translationY(0.0f).alpha(1.0f).start();
    }

    /* JADX INFO: renamed from: N */
    public void m178651N() {
        this.f158647c.animate().translationY((-this.f158647c.getHeight()) / 8).alpha(0.5f).start();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xao xaoVar) {
        this.f158654j = xaoVar;
    }

    /* JADX INFO: renamed from: P */
    public void m178653P() {
        if (NullChecker.m81303a(this.f158663s)) {
            this.f158663s.mo35930b2();
        }
    }

    /* JADX INFO: renamed from: Q */
    public pvl m178654Q() {
        return this.f158663s;
    }

    /* JADX INFO: renamed from: R */
    public void m178655R(boolean z) {
        if (NullChecker.m81303a(this.f158656l)) {
            this.f158655k.hideInput(this.f158656l);
            if (!z) {
                m178680q0(false);
            }
            this.f158656l.clearFocus();
            this.f158658n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m178656S(boolean z) {
        this.f158656l.setIconified(z);
    }

    /* JADX INFO: renamed from: T */
    public void m178657T(View.OnClickListener onClickListener) {
        this.f158651g.setText(R$string.f18671kh);
        this.f158651g.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: U */
    public void m178658U(Menu menu, final int i, boolean z, final d30 d30Var) {
        this.f158655k.getMenuInflater().inflate(h7c0.f106222d, menu);
        MenuItem menuItemFindItem = menu.findItem(u4c0.f174363m8);
        this.f158657m = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f158659o = actionView;
        this.f158660p = (TextView) actionView.findViewById(u4c0.f174380n8);
        this.f158655k.getAppTheme().mo103048j(this.f158660p);
        TextView textView = this.f158660p;
        IntlMapBaseAct intlMapBaseAct = this.f158655k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R$string.f18988v) : intlMapBaseAct.string(R$string.f18377b));
        MenuItem menuItem = this.f158657m;
        IntlMapBaseAct intlMapBaseAct2 = this.f158655k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R$string.f18988v) : intlMapBaseAct2.string(R$string.f18377b)));
        this.f158657m.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.kbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
        if (!z) {
            menu.removeItem(u4c0.f174329k8);
            return;
        }
        this.f158656l = (SearchView) menu.findItem(u4c0.f174329k8).getActionView();
        this.f158655k.getAppTheme().mo103049l(this.f158656l);
        xdl0.m208366b0(this.f158659o, new v9j() { // from class: l.lbo
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f127324a.m178662Y();
            }
        });
        e51.m114774y(new Runnable() { // from class: l.mbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f133046a.m178664a0();
            }
        });
        try {
            mep0.m154303e1((AutoCompleteTextView) this.f158656l.findViewById(s5c0.f162504J), x2c0.f190598tr);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f158658n = (View) declaredField.get(this.f158656l);
        } catch (IllegalAccessException e) {
            CrashHelper.m81296c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m81296c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.m81296c(e3);
        }
        this.f158656l.setOnSearchClickListener(new View.OnClickListener() { // from class: l.nbo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138049a.m178665b0(i, view);
            }
        });
        this.f158656l.setOnQueryTextListener(new C19667c());
        this.f158656l.setOnCloseListener(new SearchView.InterfaceC0149l() { // from class: l.obo
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0149l
            public final boolean onClose() {
                return this.f142967a.m178666c0();
            }
        });
        this.f158656l.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.pbo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                this.f148100a.m178667d0(view, z2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m178659V(List<muw> list) {
        boolean zM200296J = vwb.m200296J(list);
        VList vList = this.f158653i;
        if (zM200296J) {
            vList.setOnTouchListener(null);
        } else {
            vList.setOnTouchListener(new View.OnTouchListener() { // from class: l.jbo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f117202a.m178668e0(view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m178660W(pvl.InterfaceC19346b interfaceC19346b) {
        return interfaceC19346b == this.f158661q;
    }

    /* JADX INFO: renamed from: X */
    public boolean m178661X() {
        SearchView searchView = this.f158656l;
        return (searchView == null || searchView.isIconified()) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m178662Y() {
        this.f158656l.setMaxWidth((xdl0.m208412y0() - t100.m186890d(72.0f)) - Math.max(this.f158659o.getMeasuredWidth(), t100.m186890d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m178663Z(SearchableInfo searchableInfo) {
        SearchView searchView = this.f158656l;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m178664a0() {
        final SearchableInfo searchableInfo = ((SearchManager) getAct().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(getAct().getComponentName());
        e51.m114741F(getAct(), new Runnable() { // from class: l.hbo
            @Override // java.lang.Runnable
            public final void run() {
                this.f106950a.m178663Z(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m178665b0(int i, View view) {
        TextView textView = this.f158660p;
        IntlMapBaseAct intlMapBaseAct = this.f158655k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R$string.f18988v) : intlMapBaseAct.string(R$string.f18377b));
        MenuItem menuItem = this.f158657m;
        IntlMapBaseAct intlMapBaseAct2 = this.f158655k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R$string.f18988v) : intlMapBaseAct2.string(R$string.f18377b)));
        this.f158657m.setEnabled(false);
        this.f158659o.setEnabled(false);
        this.f158656l.requestFocus();
        m178680q0(true);
        this.f158658n.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m178666c0() {
        m178680q0(false);
        xdl0.m208345M0(this.f158653i, false);
        m178683s0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m178667d0(View view, boolean z) {
        if (z) {
            m178680q0(true);
        } else {
            this.f158658n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m178668e0(View view, MotionEvent motionEvent) {
        if (!NullChecker.m81303a(this.f158656l) || !this.f158656l.hasFocus()) {
            return false;
        }
        this.f158656l.clearFocus();
        this.f158658n.setVisibility(8);
        this.f158655k.hideInput(this.f158656l);
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m178669f0(String str) {
        this.f158666v = null;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m178670g0(String str) {
        this.f158656l.onActionViewExpanded();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ boolean m178671h0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m81303a(this.f158656l)) {
            this.f158656l.setIconified(true);
        }
        if (NullChecker.m81303a(this.f158656l)) {
            this.f158656l.setIconified(true);
        }
        m178680q0(false);
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public void m178672i0(String str, boolean z) {
        this.f158656l.setQuery(str, z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m178643F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m178673j0() {
        if (NullChecker.m81303a(this.f158665u)) {
            this.f158665u.recycle();
        }
        if (NullChecker.m81303a(this.f158664t)) {
            this.f158664t.recycle();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m178674k0() {
        if (NullChecker.m81303a(this.f158662r)) {
            this.f158662r.remove();
            this.f158662r = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m178675l0(double d, double d2, boolean z) {
        pvl.InterfaceC19346b interfaceC19346b = this.f158662r;
        if (z) {
            if (NullChecker.m81303a(interfaceC19346b)) {
                this.f158662r.remove();
                this.f158662r = null;
                return;
            }
            return;
        }
        if (NullChecker.m81303a(interfaceC19346b)) {
            this.f158662r.remove();
            this.f158662r = null;
        }
        this.f158662r = this.f158663s.mo35931d3().mo35942d(this.f158664t).mo35941c(0.5f, 0.5f).mo35943e(d, d2).mo35945g(false).mo35940b();
    }

    /* JADX INFO: renamed from: m0 */
    public void m178676m0(evg0 evg0Var) {
        this.f158653i.setAdapter((ListAdapter) evg0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m178677n0(boolean z) {
        VLinear vLinear = this.f158649e;
        if (z) {
            vLinear.animate().translationY(0.0f).setListener(new bt0.C15966j()).start();
        } else {
            vLinear.animate().translationY(t100.m186890d(49.0f)).start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m178678o0(boolean z) {
        xdl0.m208345M0(this.f158648d, z);
    }

    /* JADX INFO: renamed from: p0 */
    public void m178679p0() {
        if (TextUtils.isEmpty(this.f158666v)) {
            jtk jtkVar = new jtk(getAct());
            TextView textView = new TextView(getAct());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R$string.f19107ys);
            textView.getPaint().setFakeBoldText(true);
            jtkVar.m143118j(textView).m143113e(-17664).m143117i(jtk.f119614A | jtk.f119616C).m143121m(t100.m186890d(90.0f)).m143122n(t100.m186890d(5.0f)).m143116h(70).m143114f(t100.m186890d(10.0f)).m143109a(3000L).m143111c(true).m143110b(new jtk.InterfaceC17856a() { // from class: l.gbo
                @Override // p149l.jtk.InterfaceC17856a
                /* JADX INFO: renamed from: a */
                public final void mo125326a(String str) {
                    this.f101903a.m178670g0(str);
                }
            }).m143112d(new jtk.InterfaceC17857b() { // from class: l.ibo
                @Override // p149l.jtk.InterfaceC17857b
                /* JADX INFO: renamed from: a */
                public final void mo135260a(String str) {
                    this.f112374a.m178669f0(str);
                }
            });
            this.f158666v = ptk.m171332h().m171346t(jtkVar, this.f158656l);
            CoreModule.f17545c.f19654j0.f19289b0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m178680q0(boolean z) {
        if (z && this.f158652h.getVisibility() != 0) {
            this.f158652h.setVisibility(0);
            this.f158652h.setAlpha(0.0f);
            this.f158652h.animate().alpha(1.0f).setListener(new C19665a()).start();
            this.f158652h.setOnTouchListener(new View.OnTouchListener() { // from class: l.qbo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f153683a.m178671h0(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f158652h.getVisibility() != 0) {
            return;
        }
        this.f158652h.setAlpha(1.0f);
        this.f158652h.animate().alpha(0.0f).setListener(new C19666b()).start();
        this.f158652h.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: r */
    public void m178681r() {
        pvl pvlVarMo35948d2 = this.f158655k.mo35948d2();
        this.f158663s = pvlVarMo35948d2;
        this.f158664t = pvlVarMo35948d2.mo35929X2(x2c0.f189215Bt);
        this.f158665u = this.f158663s.mo35929X2(x2c0.f189183At);
    }

    /* JADX INFO: renamed from: r0 */
    public void m178682r0(boolean z) {
        xdl0.m208345M0(this.f158653i, z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m178683s0() {
        if (NullChecker.m81303a(this.f158657m) && NullChecker.m81303a(this.f158659o)) {
            xao xaoVar = this.f158654j;
            boolean z = (xaoVar.f191765g || xaoVar.f191763e == null) ? false : true;
            this.f158657m.setEnabled(z);
            this.f158659o.setEnabled(z);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rbo$a */
    public class C19665a implements Animator.AnimatorListener {
        public C19665a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rbo.this.f158652h.setAlpha(0.0f);
            rbo.this.f158652h.setVisibility(4);
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
    public class C19666b implements Animator.AnimatorListener {
        public C19666b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rbo.this.f158652h.setTag(Boolean.FALSE);
            rbo.this.f158652h.setAlpha(1.0f);
            rbo.this.f158652h.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) rbo.this.f158652h.getTag()).booleanValue()) {
                rbo.this.f158652h.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            rbo.this.f158652h.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
