package p153l;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapBaseAct;
import com.p051p1.mobile.putong.core.p058ui.map.intl.IntlMapItem;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import java.util.List;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class rdo implements iam<xco> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f162323a;

    /* JADX INFO: renamed from: b */
    public VFrame f162324b;

    /* JADX INFO: renamed from: c */
    public ImageView f162325c;

    /* JADX INFO: renamed from: d */
    public ImageView f162326d;

    /* JADX INFO: renamed from: e */
    public VLinear f162327e;

    /* JADX INFO: renamed from: f */
    public IntlMapItem f162328f;

    /* JADX INFO: renamed from: g */
    public VText f162329g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f162330h;

    /* JADX INFO: renamed from: i */
    public VList f162331i;

    /* JADX INFO: renamed from: j */
    public xco f162332j;

    /* JADX INFO: renamed from: k */
    public IntlMapBaseAct f162333k;

    /* JADX INFO: renamed from: l */
    public SearchView f162334l;

    /* JADX INFO: renamed from: m */
    public MenuItem f162335m;

    /* JADX INFO: renamed from: n */
    public View f162336n;

    /* JADX INFO: renamed from: o */
    public View f162337o;

    /* JADX INFO: renamed from: p */
    public TextView f162338p;

    /* JADX INFO: renamed from: q */
    public hyl.InterfaceC17600b f162339q;

    /* JADX INFO: renamed from: r */
    public hyl.InterfaceC17600b f162340r;

    /* JADX INFO: renamed from: s */
    public hyl f162341s;

    /* JADX INFO: renamed from: t */
    public hyl.InterfaceC17602d f162342t;

    /* JADX INFO: renamed from: u */
    public hyl.InterfaceC17602d f162343u;

    /* JADX INFO: renamed from: v */
    public String f162344v = null;

    /* JADX INFO: renamed from: l.rdo$c */
    public class C19809c implements SearchView.InterfaceC0151m {
        public C19809c() {
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: a */
        public boolean mo601a(String str) {
            boolean z = false;
            rdo.this.f162335m.setEnabled(false);
            rdo.this.f162337o.setEnabled(false);
            View view = rdo.this.f162336n;
            if (str != null && !str.isEmpty()) {
                z = true;
            }
            bnl0.m105524M(view, z);
            rdo.this.f162332j.f193364k.m137019l(str);
            return true;
        }

        @Override // androidx.appcompat.widget.SearchView.InterfaceC0151m
        /* JADX INFO: renamed from: b */
        public boolean mo602b(String str) {
            return false;
        }
    }

    /* JADX INFO: renamed from: l.rdo$d */
    public static class C19810d {
        /* JADX INFO: renamed from: b */
        public static void m180936b(rdo rdoVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            rdoVar.f162323a = (FrameLayout) viewGroup.getChildAt(0);
            rdoVar.f162324b = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            rdoVar.f162325c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            rdoVar.f162326d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            rdoVar.f162327e = (VLinear) viewGroup.getChildAt(1);
            rdoVar.f162328f = (IntlMapItem) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
            rdoVar.f162329g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
            rdoVar.f162330h = (FrameLayout) viewGroup.getChildAt(2);
            rdoVar.f162331i = (VList) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        }

        /* JADX INFO: renamed from: c */
        public static View m180937c(rdo rdoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(kec0.f125478Jd, viewGroup, false);
            m180936b(rdoVar, viewInflate);
            return viewInflate;
        }
    }

    public rdo(IntlMapBaseAct intlMapBaseAct) {
        this.f162333k = intlMapBaseAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f162333k;
    }

    /* JADX INFO: renamed from: F */
    public View m180894F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19810d.m180937c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public IntlMapBaseAct getAct() {
        return this.f162333k;
    }

    /* JADX INFO: renamed from: H */
    public void m180896H(xww xwwVar) {
        this.f162328f.m48577a0(xwwVar, -1, -1, true);
    }

    /* JADX INFO: renamed from: I */
    public void m180897I(hyl.InterfaceC17599a interfaceC17599a) {
        this.f162341s.mo36939r1(interfaceC17599a);
    }

    /* JADX INFO: renamed from: J */
    public void m180898J(double d, double d2) {
        if (NullChecker.m82486a(this.f162339q)) {
            this.f162339q.remove();
        }
        this.f162339q = this.f162341s.mo36934d3().mo36948g(false).mo36946e(d, d2).mo36945d(this.f162343u).mo36944c(0.5f, 0.5f).mo36943b();
    }

    /* JADX INFO: renamed from: K */
    public void m180899K() {
        this.f162327e.animate().translationY(qa00.m175859d(49.0f)).start();
    }

    /* JADX INFO: renamed from: L */
    public void m180900L(double d, double d2, int i) {
        this.f162341s.mo36930K1(d, d2, i);
    }

    /* JADX INFO: renamed from: M */
    public void m180901M() {
        this.f162325c.animate().translationY(0.0f).alpha(1.0f).start();
    }

    /* JADX INFO: renamed from: N */
    public void m180902N() {
        this.f162325c.animate().translationY((-this.f162325c.getHeight()) / 8).alpha(0.5f).start();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xco xcoVar) {
        this.f162332j = xcoVar;
    }

    /* JADX INFO: renamed from: P */
    public void m180904P() {
        if (NullChecker.m82486a(this.f162341s)) {
            this.f162341s.mo36933b2();
        }
    }

    /* JADX INFO: renamed from: Q */
    public hyl m180905Q() {
        return this.f162341s;
    }

    /* JADX INFO: renamed from: R */
    public void m180906R(boolean z) {
        if (NullChecker.m82486a(this.f162334l)) {
            this.f162333k.hideInput(this.f162334l);
            if (!z) {
                m180931q0(false);
            }
            this.f162334l.clearFocus();
            this.f162336n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: S */
    public void m180907S(boolean z) {
        this.f162334l.setIconified(z);
    }

    /* JADX INFO: renamed from: T */
    public void m180908T(View.OnClickListener onClickListener) {
        this.f162329g.setText(R$string.f18458Fh);
        this.f162329g.setOnClickListener(onClickListener);
    }

    /* JADX INFO: renamed from: U */
    public void m180909U(Menu menu, final int i, boolean z, final x20 x20Var) {
        this.f162333k.getMenuInflater().inflate(lfc0.f131841d, menu);
        MenuItem menuItemFindItem = menu.findItem(adc0.f70488o8);
        this.f162335m = menuItemFindItem;
        View actionView = menuItemFindItem.getActionView();
        this.f162337o = actionView;
        this.f162338p = (TextView) actionView.findViewById(adc0.f70505p8);
        this.f162333k.getAppTheme().mo134830j(this.f162338p);
        TextView textView = this.f162338p;
        IntlMapBaseAct intlMapBaseAct = this.f162333k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R$string.f19724v) : intlMapBaseAct.string(R$string.f19107b));
        MenuItem menuItem = this.f162335m;
        IntlMapBaseAct intlMapBaseAct2 = this.f162333k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R$string.f19724v) : intlMapBaseAct2.string(R$string.f19107b)));
        this.f162335m.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.kdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
        if (!z) {
            menu.removeItem(adc0.f70454m8);
            return;
        }
        this.f162334l = (SearchView) menu.findItem(adc0.f70454m8).getActionView();
        this.f162333k.getAppTheme().mo134832l(this.f162334l);
        bnl0.m105546b0(this.f162337o, new pcj() { // from class: l.ldo
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f131658a.m180913Y();
            }
        });
        l51.m152919y(new Runnable() { // from class: l.mdo
            @Override // java.lang.Runnable
            public final void run() {
                this.f136399a.m180915a0();
            }
        });
        try {
            qnp0.m177262e1((AutoCompleteTextView) this.f162334l.findViewById(xdc0.f193543J), dbc0.f87067hs);
            Field declaredField = SearchView.class.getDeclaredField("mCloseButton");
            declaredField.setAccessible(true);
            this.f162336n = (View) declaredField.get(this.f162334l);
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
        } catch (IllegalArgumentException e2) {
            CrashHelper.m82479c(e2);
        } catch (NoSuchFieldException e3) {
            CrashHelper.m82479c(e3);
        }
        this.f162334l.setOnSearchClickListener(new View.OnClickListener() { // from class: l.ndo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141512a.m180916b0(i, view);
            }
        });
        this.f162334l.setOnQueryTextListener(new C19809c());
        this.f162334l.setOnCloseListener(new SearchView.InterfaceC0150l() { // from class: l.odo
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0150l
            public final boolean onClose() {
                return this.f146934a.m180917c0();
            }
        });
        this.f162334l.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: l.pdo
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                this.f151818a.m180918d0(view, z2);
            }
        });
    }

    /* JADX INFO: renamed from: V */
    public void m180910V(List<lxw> list) {
        boolean zM147479J = jyb.m147479J(list);
        VList vList = this.f162331i;
        if (zM147479J) {
            vList.setOnTouchListener(null);
        } else {
            vList.setOnTouchListener(new View.OnTouchListener() { // from class: l.jdo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f120285a.m180919e0(view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public boolean m180911W(hyl.InterfaceC17600b interfaceC17600b) {
        return interfaceC17600b == this.f162339q;
    }

    /* JADX INFO: renamed from: X */
    public boolean m180912X() {
        SearchView searchView = this.f162334l;
        return (searchView == null || searchView.isIconified()) ? false : true;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ Boolean m180913Y() {
        this.f162334l.setMaxWidth((bnl0.m105592y0() - qa00.m175859d(72.0f)) - Math.max(this.f162337o.getMeasuredWidth(), qa00.m175859d(56.0f)));
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m180914Z(SearchableInfo searchableInfo) {
        SearchView searchView = this.f162334l;
        if (searchView != null) {
            searchView.setSearchableInfo(searchableInfo);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m180915a0() {
        final SearchableInfo searchableInfo = ((SearchManager) getAct().getSystemService(FirebaseAnalytics.Event.SEARCH)).getSearchableInfo(getAct().getComponentName());
        l51.m152886F(getAct(), new Runnable() { // from class: l.hdo
            @Override // java.lang.Runnable
            public final void run() {
                this.f109024a.m180914Z(searchableInfo);
            }
        });
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m180916b0(int i, View view) {
        TextView textView = this.f162338p;
        IntlMapBaseAct intlMapBaseAct = this.f162333k;
        textView.setText(i == 0 ? intlMapBaseAct.string(R$string.f19724v) : intlMapBaseAct.string(R$string.f19107b));
        MenuItem menuItem = this.f162335m;
        IntlMapBaseAct intlMapBaseAct2 = this.f162333k;
        menuItem.setTitle(intlMapBaseAct2.actionItemPadding(i == 0 ? intlMapBaseAct2.string(R$string.f19724v) : intlMapBaseAct2.string(R$string.f19107b)));
        this.f162335m.setEnabled(false);
        this.f162337o.setEnabled(false);
        this.f162334l.requestFocus();
        m180931q0(true);
        this.f162336n.setVisibility(8);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ boolean m180917c0() {
        m180931q0(false);
        bnl0.m105525M0(this.f162331i, false);
        m180934s0();
        return false;
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m180918d0(View view, boolean z) {
        if (z) {
            m180931q0(true);
        } else {
            this.f162336n.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ boolean m180919e0(View view, MotionEvent motionEvent) {
        if (!NullChecker.m82486a(this.f162334l) || !this.f162334l.hasFocus()) {
            return false;
        }
        this.f162334l.clearFocus();
        this.f162336n.setVisibility(8);
        this.f162333k.hideInput(this.f162334l);
        return false;
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m180920f0(String str) {
        this.f162344v = null;
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m180921g0(String str) {
        this.f162334l.onActionViewExpanded();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ boolean m180922h0(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (NullChecker.m82486a(this.f162334l)) {
            this.f162334l.setIconified(true);
        }
        if (NullChecker.m82486a(this.f162334l)) {
            this.f162334l.setIconified(true);
        }
        m180931q0(false);
        return true;
    }

    /* JADX INFO: renamed from: i0 */
    public void m180923i0(String str, boolean z) {
        this.f162334l.setQuery(str, z);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m180894F(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m180924j0() {
        if (NullChecker.m82486a(this.f162343u)) {
            this.f162343u.recycle();
        }
        if (NullChecker.m82486a(this.f162342t)) {
            this.f162342t.recycle();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m180925k0() {
        if (NullChecker.m82486a(this.f162340r)) {
            this.f162340r.remove();
            this.f162340r = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m180926l0(double d, double d2, boolean z) {
        hyl.InterfaceC17600b interfaceC17600b = this.f162340r;
        if (z) {
            if (NullChecker.m82486a(interfaceC17600b)) {
                this.f162340r.remove();
                this.f162340r = null;
                return;
            }
            return;
        }
        if (NullChecker.m82486a(interfaceC17600b)) {
            this.f162340r.remove();
            this.f162340r = null;
        }
        this.f162340r = this.f162341s.mo36934d3().mo36945d(this.f162342t).mo36944c(0.5f, 0.5f).mo36946e(d, d2).mo36948g(false).mo36943b();
    }

    /* JADX INFO: renamed from: m0 */
    public void m180927m0(m3h0 m3h0Var) {
        this.f162331i.setAdapter((ListAdapter) m3h0Var);
    }

    /* JADX INFO: renamed from: n0 */
    public void m180928n0(boolean z) {
        VLinear vLinear = this.f162327e;
        if (z) {
            vLinear.animate().translationY(0.0f).setListener(new gt0.C17308j()).start();
        } else {
            vLinear.animate().translationY(qa00.m175859d(49.0f)).start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m180929o0(boolean z) {
        bnl0.m105525M0(this.f162326d, z);
    }

    /* JADX INFO: renamed from: p0 */
    public void m180930p0() {
        if (TextUtils.isEmpty(this.f162344v)) {
            zvk zvkVar = new zvk(getAct());
            TextView textView = new TextView(getAct());
            textView.setTextColor(-1);
            textView.setTextSize(14.0f);
            textView.setText(R$string.f18925Us);
            textView.getPaint().setFakeBoldText(true);
            zvkVar.m221765j(textView).m221760e(-17664).m221764i(zvk.f206224A | zvk.f206226C).m221768m(qa00.m175859d(90.0f)).m221769n(qa00.m175859d(5.0f)).m221763h(70).m221761f(qa00.m175859d(10.0f)).m221756a(3000L).m221758c(true).m221757b(new zvk.InterfaceC21905a() { // from class: l.gdo
                @Override // p153l.zvk.InterfaceC21905a
                /* JADX INFO: renamed from: a */
                public final void mo102709a(String str) {
                    this.f103728a.m180921g0(str);
                }
            }).m221759d(new zvk.InterfaceC21906b() { // from class: l.ido
                @Override // p153l.zvk.InterfaceC21906b
                /* JADX INFO: renamed from: a */
                public final void mo96261a(String str) {
                    this.f114515a.m180920f0(str);
                }
            });
            this.f162344v = fwk.m127777h().m127791t(zvkVar, this.f162334l);
            CoreModule.f18264c.f20396j0.f20031b0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m180931q0(boolean z) {
        if (z && this.f162330h.getVisibility() != 0) {
            this.f162330h.setVisibility(0);
            this.f162330h.setAlpha(0.0f);
            this.f162330h.animate().alpha(1.0f).setListener(new C19807a()).start();
            this.f162330h.setOnTouchListener(new View.OnTouchListener() { // from class: l.qdo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f156752a.m180922h0(view, motionEvent);
                }
            });
            return;
        }
        if (z || this.f162330h.getVisibility() != 0) {
            return;
        }
        this.f162330h.setAlpha(1.0f);
        this.f162330h.animate().alpha(0.0f).setListener(new C19808b()).start();
        this.f162330h.setOnTouchListener(null);
    }

    /* JADX INFO: renamed from: r */
    public void m180932r() {
        hyl hylVarMo36951e2 = this.f162333k.mo36951e2();
        this.f162341s = hylVarMo36951e2;
        this.f162342t = hylVarMo36951e2.mo36932X2(dbc0.f87331pu);
        this.f162343u = this.f162341s.mo36932X2(dbc0.f87298ou);
    }

    /* JADX INFO: renamed from: r0 */
    public void m180933r0(boolean z) {
        bnl0.m105525M0(this.f162331i, z);
    }

    /* JADX INFO: renamed from: s0 */
    public void m180934s0() {
        if (NullChecker.m82486a(this.f162335m) && NullChecker.m82486a(this.f162337o)) {
            xco xcoVar = this.f162332j;
            boolean z = (xcoVar.f193360g || xcoVar.f193358e == null) ? false : true;
            this.f162335m.setEnabled(z);
            this.f162337o.setEnabled(z);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.rdo$a */
    public class C19807a implements Animator.AnimatorListener {
        public C19807a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rdo.this.f162330h.setAlpha(0.0f);
            rdo.this.f162330h.setVisibility(4);
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

    /* JADX INFO: renamed from: l.rdo$b */
    public class C19808b implements Animator.AnimatorListener {
        public C19808b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            rdo.this.f162330h.setTag(Boolean.FALSE);
            rdo.this.f162330h.setAlpha(1.0f);
            rdo.this.f162330h.setVisibility(0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (((Boolean) rdo.this.f162330h.getTag()).booleanValue()) {
                rdo.this.f162330h.setVisibility(4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            rdo.this.f162330h.setTag(Boolean.TRUE);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }
    }
}
