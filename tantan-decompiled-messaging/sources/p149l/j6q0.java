package p149l;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class j6q0 extends i30 implements ActionBarOverlayLayout.InterfaceC0100d {

    /* JADX INFO: renamed from: F */
    public static final Interpolator f116493F = new AccelerateInterpolator();

    /* JADX INFO: renamed from: G */
    public static final Interpolator f116494G = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public boolean f116495A;

    /* JADX INFO: renamed from: B */
    public boolean f116496B;

    /* JADX INFO: renamed from: a */
    public Context f116500a;

    /* JADX INFO: renamed from: b */
    public Context f116501b;

    /* JADX INFO: renamed from: c */
    public Activity f116502c;

    /* JADX INFO: renamed from: d */
    public Dialog f116503d;

    /* JADX INFO: renamed from: e */
    public ActionBarOverlayLayout f116504e;

    /* JADX INFO: renamed from: f */
    public ActionBarContainer f116505f;

    /* JADX INFO: renamed from: g */
    public khd f116506g;

    /* JADX INFO: renamed from: h */
    public ActionBarContextView f116507h;

    /* JADX INFO: renamed from: i */
    public View f116508i;

    /* JADX INFO: renamed from: j */
    public ScrollingTabContainerView f116509j;

    /* JADX INFO: renamed from: m */
    public boolean f116512m;

    /* JADX INFO: renamed from: n */
    public C17707d f116513n;

    /* JADX INFO: renamed from: o */
    public u30 f116514o;

    /* JADX INFO: renamed from: p */
    public u30.InterfaceC20342a f116515p;

    /* JADX INFO: renamed from: q */
    public boolean f116516q;

    /* JADX INFO: renamed from: s */
    public boolean f116518s;

    /* JADX INFO: renamed from: v */
    public boolean f116521v;

    /* JADX INFO: renamed from: w */
    public boolean f116522w;

    /* JADX INFO: renamed from: x */
    public boolean f116523x;

    /* JADX INFO: renamed from: z */
    public edl0 f116525z;

    /* JADX INFO: renamed from: k */
    public ArrayList<Object> f116510k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public int f116511l = -1;

    /* JADX INFO: renamed from: r */
    public ArrayList<i30.InterfaceC17466b> f116517r = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public int f116519t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f116520u = true;

    /* JADX INFO: renamed from: y */
    public boolean f116524y = true;

    /* JADX INFO: renamed from: C */
    public final fdl0 f116497C = new C17704a();

    /* JADX INFO: renamed from: D */
    public final fdl0 f116498D = new C17705b();

    /* JADX INFO: renamed from: E */
    public final hdl0 f116499E = new C17706c();

    /* JADX INFO: renamed from: l.j6q0$a */
    public class C17704a extends gdl0 {
        public C17704a() {
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationEnd(View view) {
            View view2;
            j6q0 j6q0Var = j6q0.this;
            if (j6q0Var.f116520u && (view2 = j6q0Var.f116508i) != null) {
                view2.setTranslationY(0.0f);
                j6q0.this.f116505f.setTranslationY(0.0f);
            }
            j6q0.this.f116505f.setVisibility(8);
            j6q0.this.f116505f.setTransitioning(false);
            j6q0 j6q0Var2 = j6q0.this;
            j6q0Var2.f116525z = null;
            j6q0Var2.m140034K();
            ActionBarOverlayLayout actionBarOverlayLayout = j6q0.this.f116504e;
            if (actionBarOverlayLayout != null) {
                gbl0.m125195g0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: l.j6q0$b */
    public class C17705b extends gdl0 {
        public C17705b() {
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationEnd(View view) {
            j6q0 j6q0Var = j6q0.this;
            j6q0Var.f116525z = null;
            j6q0Var.f116505f.requestLayout();
        }
    }

    /* JADX INFO: renamed from: l.j6q0$c */
    public class C17706c implements hdl0 {
        public C17706c() {
        }

        @Override // p149l.hdl0
        /* JADX INFO: renamed from: a */
        public void mo130594a(View view) {
            ((View) j6q0.this.f116505f.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: l.j6q0$d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class C17707d extends u30 implements MenuBuilder.InterfaceC0078a {

        /* JADX INFO: renamed from: c */
        public final Context f116529c;

        /* JADX INFO: renamed from: d */
        public final MenuBuilder f116530d;

        /* JADX INFO: renamed from: e */
        public u30.InterfaceC20342a f116531e;

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f116532f;

        public C17707d(Context context, u30.InterfaceC20342a interfaceC20342a) {
            this.f116529c = context;
            this.f116531e = interfaceC20342a;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.f116530d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: a */
        public void mo108669a() {
            j6q0 j6q0Var = j6q0.this;
            if (j6q0Var.f116513n != this) {
                return;
            }
            if (j6q0.m140032J(j6q0Var.f116521v, j6q0Var.f116522w, false)) {
                this.f116531e.mo349d(this);
            } else {
                j6q0 j6q0Var2 = j6q0.this;
                j6q0Var2.f116514o = this;
                j6q0Var2.f116515p = this.f116531e;
            }
            this.f116531e = null;
            j6q0.this.m140033I(false);
            j6q0.this.f116507h.m457g();
            j6q0.this.f116506g.mo672t().sendAccessibilityEvent(32);
            j6q0 j6q0Var3 = j6q0.this;
            j6q0Var3.f116504e.setHideOnContentScrollEnabled(j6q0Var3.f116496B);
            j6q0.this.f116513n = null;
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: b */
        public View mo108670b() {
            WeakReference<View> weakReference = this.f116532f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: c */
        public Menu mo108671c() {
            return this.f116530d;
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: d */
        public MenuInflater mo108672d() {
            return new yyg0(this.f116529c);
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: e */
        public CharSequence mo108673e() {
            return j6q0.this.f116507h.getSubtitle();
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: g */
        public CharSequence mo108674g() {
            return j6q0.this.f116507h.getTitle();
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: i */
        public void mo108675i() {
            if (j6q0.this.f116513n != this) {
                return;
            }
            this.f116530d.stopDispatchingItemsChanged();
            try {
                this.f116531e.mo348c(this, this.f116530d);
            } finally {
                this.f116530d.startDispatchingItemsChanged();
            }
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: j */
        public boolean mo108676j() {
            return j6q0.this.f116507h.m460j();
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: k */
        public void mo108677k(View view) {
            j6q0.this.f116507h.setCustomView(view);
            this.f116532f = new WeakReference<>(view);
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: l */
        public void mo108678l(int i) {
            mo108679m(j6q0.this.f116500a.getResources().getString(i));
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: m */
        public void mo108679m(CharSequence charSequence) {
            j6q0.this.f116507h.setSubtitle(charSequence);
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: o */
        public void mo108680o(int i) {
            mo108681p(j6q0.this.f116500a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            u30.InterfaceC20342a interfaceC20342a = this.f116531e;
            if (interfaceC20342a != null) {
                return interfaceC20342a.mo346a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0078a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.f116531e == null) {
                return;
            }
            mo108675i();
            j6q0.this.f116507h.m462l();
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: p */
        public void mo108681p(CharSequence charSequence) {
            j6q0.this.f116507h.setTitle(charSequence);
        }

        @Override // p149l.u30
        /* JADX INFO: renamed from: q */
        public void mo108682q(boolean z) {
            super.mo108682q(z);
            j6q0.this.f116507h.setTitleOptional(z);
        }

        /* JADX INFO: renamed from: r */
        public boolean m140049r() {
            this.f116530d.stopDispatchingItemsChanged();
            try {
                return this.f116531e.mo347b(this, this.f116530d);
            } finally {
                this.f116530d.startDispatchingItemsChanged();
            }
        }
    }

    public j6q0(Activity activity, boolean z) {
        this.f116502c = activity;
        View decorView = activity.getWindow().getDecorView();
        m140041R(decorView);
        if (z) {
            return;
        }
        this.f116508i = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m140032J(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: A */
    public void mo134111A(float f) {
        gbl0.m125215q0(this.f116505f, f);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: B */
    public void mo134112B(int i) {
        this.f116506g.mo676x(i);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: C */
    public void mo134113C(Drawable drawable) {
        this.f116506g.mo669q(drawable);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: D */
    public void mo134114D(boolean z) {
        edl0 edl0Var;
        this.f116495A = z;
        if (z || (edl0Var = this.f116525z) == null) {
            return;
        }
        edl0Var.m115812a();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: E */
    public void mo134115E(CharSequence charSequence) {
        this.f116506g.setTitle(charSequence);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: F */
    public void mo134116F(CharSequence charSequence) {
        this.f116506g.setWindowTitle(charSequence);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: G */
    public void mo134117G() {
        if (this.f116521v) {
            this.f116521v = false;
            m140048Y(false);
        }
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: H */
    public u30 mo134118H(u30.InterfaceC20342a interfaceC20342a) {
        C17707d c17707d = this.f116513n;
        if (c17707d != null) {
            c17707d.mo108669a();
        }
        this.f116504e.setHideOnContentScrollEnabled(false);
        this.f116507h.m461k();
        C17707d c17707d2 = new C17707d(this.f116507h.getContext(), interfaceC20342a);
        if (!c17707d2.m140049r()) {
            return null;
        }
        this.f116513n = c17707d2;
        c17707d2.mo108675i();
        this.f116507h.m458h(c17707d2);
        m140033I(true);
        this.f116507h.sendAccessibilityEvent(32);
        return c17707d2;
    }

    /* JADX INFO: renamed from: I */
    public void m140033I(boolean z) {
        ddl0 ddl0VarMo453f;
        ddl0 ddl0VarMo453f2;
        if (z) {
            m140047X();
        } else {
            m140040Q();
        }
        if (!m140046W()) {
            khd khdVar = this.f116506g;
            if (z) {
                khdVar.mo666n(4);
                this.f116507h.setVisibility(0);
                return;
            } else {
                khdVar.mo666n(0);
                this.f116507h.setVisibility(8);
                return;
            }
        }
        khd khdVar2 = this.f116506g;
        if (z) {
            ddl0VarMo453f = khdVar2.mo671s(4, 100L);
            ddl0VarMo453f2 = this.f116507h.mo453f(0, 200L);
        } else {
            ddl0 ddl0VarMo671s = khdVar2.mo671s(0, 200L);
            ddl0VarMo453f = this.f116507h.mo453f(8, 100L);
            ddl0VarMo453f2 = ddl0VarMo671s;
        }
        edl0 edl0Var = new edl0();
        edl0Var.m115815d(ddl0VarMo453f, ddl0VarMo453f2);
        edl0Var.m115819h();
    }

    /* JADX INFO: renamed from: K */
    public void m140034K() {
        u30.InterfaceC20342a interfaceC20342a = this.f116515p;
        if (interfaceC20342a != null) {
            interfaceC20342a.mo349d(this.f116514o);
            this.f116514o = null;
            this.f116515p = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m140035L(boolean z) {
        View view;
        edl0 edl0Var = this.f116525z;
        if (edl0Var != null) {
            edl0Var.m115812a();
        }
        if (this.f116519t != 0 || (!this.f116495A && !z)) {
            this.f116497C.onAnimationEnd(null);
            return;
        }
        this.f116505f.setAlpha(1.0f);
        this.f116505f.setTransitioning(true);
        edl0 edl0Var2 = new edl0();
        float f = -this.f116505f.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.f116505f.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        ddl0 ddl0VarM111040l = gbl0.m125186c(this.f116505f).m111040l(f);
        ddl0VarM111040l.m111038j(this.f116499E);
        edl0Var2.m115814c(ddl0VarM111040l);
        if (this.f116520u && (view = this.f116508i) != null) {
            edl0Var2.m115814c(gbl0.m125186c(view).m111040l(f));
        }
        edl0Var2.m115817f(f116493F);
        edl0Var2.m115816e(250L);
        edl0Var2.m115818g(this.f116497C);
        this.f116525z = edl0Var2;
        edl0Var2.m115819h();
    }

    /* JADX INFO: renamed from: M */
    public void m140036M(boolean z) {
        View view;
        View view2;
        edl0 edl0Var = this.f116525z;
        if (edl0Var != null) {
            edl0Var.m115812a();
        }
        this.f116505f.setVisibility(0);
        if (this.f116519t == 0 && (this.f116495A || z)) {
            this.f116505f.setTranslationY(0.0f);
            float f = -this.f116505f.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.f116505f.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.f116505f.setTranslationY(f);
            edl0 edl0Var2 = new edl0();
            ddl0 ddl0VarM111040l = gbl0.m125186c(this.f116505f).m111040l(0.0f);
            ddl0VarM111040l.m111038j(this.f116499E);
            edl0Var2.m115814c(ddl0VarM111040l);
            if (this.f116520u && (view2 = this.f116508i) != null) {
                view2.setTranslationY(f);
                edl0Var2.m115814c(gbl0.m125186c(this.f116508i).m111040l(0.0f));
            }
            edl0Var2.m115817f(f116494G);
            edl0Var2.m115816e(250L);
            edl0Var2.m115818g(this.f116498D);
            this.f116525z = edl0Var2;
            edl0Var2.m115819h();
        } else {
            this.f116505f.setAlpha(1.0f);
            this.f116505f.setTranslationY(0.0f);
            if (this.f116520u && (view = this.f116508i) != null) {
                view.setTranslationY(0.0f);
            }
            this.f116498D.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f116504e;
        if (actionBarOverlayLayout != null) {
            gbl0.m125195g0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final khd m140037N(View view) {
        if (view instanceof khd) {
            return (khd) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view != 0 ? view.getClass().getSimpleName() : "null"));
    }

    /* JADX INFO: renamed from: O */
    public int m140038O() {
        return this.f116504e.getActionBarHideOffset();
    }

    /* JADX INFO: renamed from: P */
    public int m140039P() {
        return this.f116506g.mo662j();
    }

    /* JADX INFO: renamed from: Q */
    public final void m140040Q() {
        if (this.f116523x) {
            this.f116523x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f116504e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m140048Y(false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m140041R(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(s5c0.f162533q);
        this.f116504e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f116506g = m140037N(view.findViewById(s5c0.f162517a));
        this.f116507h = (ActionBarContextView) view.findViewById(s5c0.f162522f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(s5c0.f162519c);
        this.f116505f = actionBarContainer;
        khd khdVar = this.f116506g;
        if (khdVar == null || this.f116507h == null || actionBarContainer == null) {
            qkq0.m175383a(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.f116500a = khdVar.getContext();
        boolean z = (this.f116506g.mo667o() & 4) != 0;
        if (z) {
            this.f116512m = true;
        }
        l30 l30VarM148325b = l30.m148325b(this.f116500a);
        m140045V(l30VarM148325b.m148326a() || z);
        m140043T(l30VarM148325b.m148331g());
        TypedArray typedArrayObtainStyledAttributes = this.f116500a.obtainStyledAttributes(null, aac0.f68418a, n0c0.f136511c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(aac0.f68468k, false)) {
            m140044U(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(aac0.f68458i, 0);
        if (dimensionPixelSize != 0) {
            mo134111A(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: S */
    public void m140042S(int i, int i2) {
        int iMo667o = this.f116506g.mo667o();
        if ((i2 & 4) != 0) {
            this.f116512m = true;
        }
        this.f116506g.mo661i((i & i2) | ((~i2) & iMo667o));
    }

    /* JADX INFO: renamed from: T */
    public final void m140043T(boolean z) {
        this.f116518s = z;
        if (z) {
            this.f116505f.setTabContainer(null);
            this.f116506g.mo674v(this.f116509j);
        } else {
            this.f116506g.mo674v(null);
            this.f116505f.setTabContainer(this.f116509j);
        }
        boolean z2 = m140039P() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f116509j;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f116504e;
                if (actionBarOverlayLayout != null) {
                    gbl0.m125195g0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f116506g.mo664l(!this.f116518s && z2);
        this.f116504e.setHasNonEmbeddedTabs(!this.f116518s && z2);
    }

    /* JADX INFO: renamed from: U */
    public void m140044U(boolean z) {
        if (z && !this.f116504e.m479q()) {
            qkq0.m175383a("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else {
            this.f116496B = z;
            this.f116504e.setHideOnContentScrollEnabled(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m140045V(boolean z) {
        this.f116506g.mo673u(z);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m140046W() {
        return gbl0.m125171P(this.f116505f);
    }

    /* JADX INFO: renamed from: X */
    public final void m140047X() {
        if (this.f116523x) {
            return;
        }
        this.f116523x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f116504e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m140048Y(false);
    }

    /* JADX INFO: renamed from: Y */
    public final void m140048Y(boolean z) {
        boolean zM140032J = m140032J(this.f116521v, this.f116522w, this.f116523x);
        boolean z2 = this.f116524y;
        if (zM140032J) {
            if (z2) {
                return;
            }
            this.f116524y = true;
            m140036M(z);
            return;
        }
        if (z2) {
            this.f116524y = false;
            m140035L(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    /* JADX INFO: renamed from: a */
    public void mo485a() {
        if (this.f116522w) {
            this.f116522w = false;
            m140048Y(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    /* JADX INFO: renamed from: c */
    public void mo487c() {
        if (this.f116522w) {
            return;
        }
        this.f116522w = true;
        m140048Y(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    /* JADX INFO: renamed from: d */
    public void mo488d() {
        edl0 edl0Var = this.f116525z;
        if (edl0Var != null) {
            edl0Var.m115812a();
            this.f116525z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    /* JADX INFO: renamed from: e */
    public void mo489e(boolean z) {
        this.f116520u = z;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: g */
    public boolean mo134120g() {
        khd khdVar = this.f116506g;
        if (khdVar == null || !khdVar.mo660h()) {
            return false;
        }
        this.f116506g.collapseActionView();
        return true;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: h */
    public void mo134121h(boolean z) {
        if (z == this.f116516q) {
            return;
        }
        this.f116516q = z;
        int size = this.f116517r.size();
        for (int i = 0; i < size; i++) {
            this.f116517r.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: i */
    public int mo134122i() {
        return this.f116506g.mo667o();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: j */
    public float mo134123j() {
        return gbl0.m125220t(this.f116505f);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: k */
    public int mo134124k() {
        return this.f116505f.getHeight();
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: l */
    public Context mo134125l() {
        if (this.f116501b == null) {
            TypedValue typedValue = new TypedValue();
            this.f116500a.getTheme().resolveAttribute(n0c0.f136516h, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f116501b = new ContextThemeWrapper(this.f116500a, i);
            } else {
                this.f116501b = this.f116500a;
            }
        }
        return this.f116501b;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: m */
    public void mo134126m() {
        if (this.f116521v) {
            return;
        }
        this.f116521v = true;
        m140048Y(false);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: o */
    public boolean mo134128o() {
        int iMo134124k = mo134124k();
        if (this.f116524y) {
            return iMo134124k == 0 || m140038O() < iMo134124k;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    public void onWindowVisibilityChanged(int i) {
        this.f116519t = i;
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: p */
    public void mo134129p(Configuration configuration) {
        m140043T(l30.m148325b(this.f116500a).m148331g());
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: r */
    public boolean mo134131r(int i, KeyEvent keyEvent) {
        Menu menuMo108671c;
        C17707d c17707d = this.f116513n;
        if (c17707d == null || (menuMo108671c = c17707d.mo108671c()) == null) {
            return false;
        }
        menuMo108671c.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo108671c.performShortcut(i, keyEvent, 0);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: u */
    public void mo134134u(Drawable drawable) {
        this.f116505f.setPrimaryBackground(drawable);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: v */
    public void mo134135v(boolean z) {
        if (this.f116512m) {
            return;
        }
        mo134136w(z);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: w */
    public void mo134136w(boolean z) {
        m140042S(z ? 4 : 0, 4);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: x */
    public void mo134137x(int i) {
        if ((i & 4) != 0) {
            this.f116512m = true;
        }
        this.f116506g.mo661i(i);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: y */
    public void mo134138y(boolean z) {
        m140042S(z ? 2 : 0, 2);
    }

    @Override // p149l.i30
    /* JADX INFO: renamed from: z */
    public void mo134139z(boolean z) {
        m140042S(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0100d
    /* JADX INFO: renamed from: b */
    public void mo486b() {
    }

    public j6q0(Dialog dialog) {
        this.f116503d = dialog;
        m140041R(dialog.getWindow().getDecorView());
    }
}
