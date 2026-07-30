package p153l;

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
public class ofq0 extends c30 implements ActionBarOverlayLayout.InterfaceC0101d {

    /* JADX INFO: renamed from: F */
    public static final Interpolator f147096F = new AccelerateInterpolator();

    /* JADX INFO: renamed from: G */
    public static final Interpolator f147097G = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public boolean f147098A;

    /* JADX INFO: renamed from: B */
    public boolean f147099B;

    /* JADX INFO: renamed from: a */
    public Context f147103a;

    /* JADX INFO: renamed from: b */
    public Context f147104b;

    /* JADX INFO: renamed from: c */
    public Activity f147105c;

    /* JADX INFO: renamed from: d */
    public Dialog f147106d;

    /* JADX INFO: renamed from: e */
    public ActionBarOverlayLayout f147107e;

    /* JADX INFO: renamed from: f */
    public ActionBarContainer f147108f;

    /* JADX INFO: renamed from: g */
    public qid f147109g;

    /* JADX INFO: renamed from: h */
    public ActionBarContextView f147110h;

    /* JADX INFO: renamed from: i */
    public View f147111i;

    /* JADX INFO: renamed from: j */
    public ScrollingTabContainerView f147112j;

    /* JADX INFO: renamed from: m */
    public boolean f147115m;

    /* JADX INFO: renamed from: n */
    public C19123d f147116n;

    /* JADX INFO: renamed from: o */
    public o30 f147117o;

    /* JADX INFO: renamed from: p */
    public o30.InterfaceC19018a f147118p;

    /* JADX INFO: renamed from: q */
    public boolean f147119q;

    /* JADX INFO: renamed from: s */
    public boolean f147121s;

    /* JADX INFO: renamed from: v */
    public boolean f147124v;

    /* JADX INFO: renamed from: w */
    public boolean f147125w;

    /* JADX INFO: renamed from: x */
    public boolean f147126x;

    /* JADX INFO: renamed from: z */
    public iml0 f147128z;

    /* JADX INFO: renamed from: k */
    public ArrayList<Object> f147113k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public int f147114l = -1;

    /* JADX INFO: renamed from: r */
    public ArrayList<c30.InterfaceC16170b> f147120r = new ArrayList<>();

    /* JADX INFO: renamed from: t */
    public int f147122t = 0;

    /* JADX INFO: renamed from: u */
    public boolean f147123u = true;

    /* JADX INFO: renamed from: y */
    public boolean f147127y = true;

    /* JADX INFO: renamed from: C */
    public final jml0 f147100C = new C19120a();

    /* JADX INFO: renamed from: D */
    public final jml0 f147101D = new C19121b();

    /* JADX INFO: renamed from: E */
    public final lml0 f147102E = new C19122c();

    /* JADX INFO: renamed from: l.ofq0$a */
    public class C19120a extends kml0 {
        public C19120a() {
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationEnd(View view) {
            View view2;
            ofq0 ofq0Var = ofq0.this;
            if (ofq0Var.f147123u && (view2 = ofq0Var.f147111i) != null) {
                view2.setTranslationY(0.0f);
                ofq0.this.f147108f.setTranslationY(0.0f);
            }
            ofq0.this.f147108f.setVisibility(8);
            ofq0.this.f147108f.setTransitioning(false);
            ofq0 ofq0Var2 = ofq0.this;
            ofq0Var2.f147128z = null;
            ofq0Var2.m167475K();
            ActionBarOverlayLayout actionBarOverlayLayout = ofq0.this.f147107e;
            if (actionBarOverlayLayout != null) {
                kkl0.m150158g0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: l.ofq0$b */
    public class C19121b extends kml0 {
        public C19121b() {
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationEnd(View view) {
            ofq0 ofq0Var = ofq0.this;
            ofq0Var.f147128z = null;
            ofq0Var.f147108f.requestLayout();
        }
    }

    /* JADX INFO: renamed from: l.ofq0$c */
    public class C19122c implements lml0 {
        public C19122c() {
        }

        @Override // p153l.lml0
        /* JADX INFO: renamed from: a */
        public void mo154876a(View view) {
            ((View) ofq0.this.f147108f.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: l.ofq0$d */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class C19123d extends o30 implements MenuBuilder.InterfaceC0079a {

        /* JADX INFO: renamed from: c */
        public final Context f147132c;

        /* JADX INFO: renamed from: d */
        public final MenuBuilder f147133d;

        /* JADX INFO: renamed from: e */
        public o30.InterfaceC19018a f147134e;

        /* JADX INFO: renamed from: f */
        public WeakReference<View> f147135f;

        public C19123d(Context context, o30.InterfaceC19018a interfaceC19018a) {
            this.f147132c = context;
            this.f147134e = interfaceC19018a;
            MenuBuilder defaultShowAsAction = new MenuBuilder(context).setDefaultShowAsAction(1);
            this.f147133d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: a */
        public void mo152473a() {
            ofq0 ofq0Var = ofq0.this;
            if (ofq0Var.f147116n != this) {
                return;
            }
            if (ofq0.m167473J(ofq0Var.f147124v, ofq0Var.f147125w, false)) {
                this.f147134e.mo350d(this);
            } else {
                ofq0 ofq0Var2 = ofq0.this;
                ofq0Var2.f147117o = this;
                ofq0Var2.f147118p = this.f147134e;
            }
            this.f147134e = null;
            ofq0.this.m167474I(false);
            ofq0.this.f147110h.m458g();
            ofq0.this.f147109g.mo673t().sendAccessibilityEvent(32);
            ofq0 ofq0Var3 = ofq0.this;
            ofq0Var3.f147107e.setHideOnContentScrollEnabled(ofq0Var3.f147099B);
            ofq0.this.f147116n = null;
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: b */
        public View mo152474b() {
            WeakReference<View> weakReference = this.f147135f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: c */
        public Menu mo152475c() {
            return this.f147133d;
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: d */
        public MenuInflater mo152476d() {
            return new g7h0(this.f147132c);
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: e */
        public CharSequence mo152477e() {
            return ofq0.this.f147110h.getSubtitle();
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: g */
        public CharSequence mo152478g() {
            return ofq0.this.f147110h.getTitle();
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: i */
        public void mo152479i() {
            if (ofq0.this.f147116n != this) {
                return;
            }
            this.f147133d.stopDispatchingItemsChanged();
            try {
                this.f147134e.mo349c(this, this.f147133d);
            } finally {
                this.f147133d.startDispatchingItemsChanged();
            }
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: j */
        public boolean mo152480j() {
            return ofq0.this.f147110h.m461j();
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: k */
        public void mo152481k(View view) {
            ofq0.this.f147110h.setCustomView(view);
            this.f147135f = new WeakReference<>(view);
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: l */
        public void mo152482l(int i) {
            mo152483m(ofq0.this.f147103a.getResources().getString(i));
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: m */
        public void mo152483m(CharSequence charSequence) {
            ofq0.this.f147110h.setSubtitle(charSequence);
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: o */
        public void mo152484o(int i) {
            mo152485p(ofq0.this.f147103a.getResources().getString(i));
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            o30.InterfaceC19018a interfaceC19018a = this.f147134e;
            if (interfaceC19018a != null) {
                return interfaceC19018a.mo347a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.InterfaceC0079a
        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.f147134e == null) {
                return;
            }
            mo152479i();
            ofq0.this.f147110h.m463l();
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: p */
        public void mo152485p(CharSequence charSequence) {
            ofq0.this.f147110h.setTitle(charSequence);
        }

        @Override // p153l.o30
        /* JADX INFO: renamed from: q */
        public void mo152486q(boolean z) {
            super.mo152486q(z);
            ofq0.this.f147110h.setTitleOptional(z);
        }

        /* JADX INFO: renamed from: r */
        public boolean m167490r() {
            this.f147133d.stopDispatchingItemsChanged();
            try {
                return this.f147134e.mo348b(this, this.f147133d);
            } finally {
                this.f147133d.startDispatchingItemsChanged();
            }
        }
    }

    public ofq0(Activity activity, boolean z) {
        this.f147105c = activity;
        View decorView = activity.getWindow().getDecorView();
        m167482R(decorView);
        if (z) {
            return;
        }
        this.f147111i = decorView.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: J */
    public static boolean m167473J(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: A */
    public void mo102168A(float f) {
        kkl0.m150178q0(this.f147108f, f);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: B */
    public void mo102169B(int i) {
        this.f147109g.mo677x(i);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: C */
    public void mo102170C(Drawable drawable) {
        this.f147109g.mo670q(drawable);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: D */
    public void mo102171D(boolean z) {
        iml0 iml0Var;
        this.f147098A = z;
        if (z || (iml0Var = this.f147128z) == null) {
            return;
        }
        iml0Var.m140937a();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: E */
    public void mo102172E(CharSequence charSequence) {
        this.f147109g.setTitle(charSequence);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: F */
    public void mo102173F(CharSequence charSequence) {
        this.f147109g.setWindowTitle(charSequence);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: G */
    public void mo102174G() {
        if (this.f147124v) {
            this.f147124v = false;
            m167489Y(false);
        }
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: H */
    public o30 mo107733H(o30.InterfaceC19018a interfaceC19018a) {
        C19123d c19123d = this.f147116n;
        if (c19123d != null) {
            c19123d.mo152473a();
        }
        this.f147107e.setHideOnContentScrollEnabled(false);
        this.f147110h.m462k();
        C19123d c19123d2 = new C19123d(this.f147110h.getContext(), interfaceC19018a);
        if (!c19123d2.m167490r()) {
            return null;
        }
        this.f147116n = c19123d2;
        c19123d2.mo152479i();
        this.f147110h.m459h(c19123d2);
        m167474I(true);
        this.f147110h.sendAccessibilityEvent(32);
        return c19123d2;
    }

    /* JADX INFO: renamed from: I */
    public void m167474I(boolean z) {
        hml0 hml0VarMo454f;
        hml0 hml0VarMo454f2;
        if (z) {
            m167488X();
        } else {
            m167481Q();
        }
        if (!m167487W()) {
            qid qidVar = this.f147109g;
            if (z) {
                qidVar.mo667n(4);
                this.f147110h.setVisibility(0);
                return;
            } else {
                qidVar.mo667n(0);
                this.f147110h.setVisibility(8);
                return;
            }
        }
        qid qidVar2 = this.f147109g;
        if (z) {
            hml0VarMo454f = qidVar2.mo672s(4, 100L);
            hml0VarMo454f2 = this.f147110h.mo454f(0, 200L);
        } else {
            hml0 hml0VarMo672s = qidVar2.mo672s(0, 200L);
            hml0VarMo454f = this.f147110h.mo454f(8, 100L);
            hml0VarMo454f2 = hml0VarMo672s;
        }
        iml0 iml0Var = new iml0();
        iml0Var.m140940d(hml0VarMo454f, hml0VarMo454f2);
        iml0Var.m140944h();
    }

    /* JADX INFO: renamed from: K */
    public void m167475K() {
        o30.InterfaceC19018a interfaceC19018a = this.f147118p;
        if (interfaceC19018a != null) {
            interfaceC19018a.mo350d(this.f147117o);
            this.f147117o = null;
            this.f147118p = null;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m167476L(boolean z) {
        View view;
        iml0 iml0Var = this.f147128z;
        if (iml0Var != null) {
            iml0Var.m140937a();
        }
        if (this.f147122t != 0 || (!this.f147098A && !z)) {
            this.f147100C.onAnimationEnd(null);
            return;
        }
        this.f147108f.setAlpha(1.0f);
        this.f147108f.setTransitioning(true);
        iml0 iml0Var2 = new iml0();
        float f = -this.f147108f.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.f147108f.getLocationInWindow(iArr);
            f -= iArr[1];
        }
        hml0 hml0VarM135949l = kkl0.m150149c(this.f147108f).m135949l(f);
        hml0VarM135949l.m135947j(this.f147102E);
        iml0Var2.m140939c(hml0VarM135949l);
        if (this.f147123u && (view = this.f147111i) != null) {
            iml0Var2.m140939c(kkl0.m150149c(view).m135949l(f));
        }
        iml0Var2.m140942f(f147096F);
        iml0Var2.m140941e(250L);
        iml0Var2.m140943g(this.f147100C);
        this.f147128z = iml0Var2;
        iml0Var2.m140944h();
    }

    /* JADX INFO: renamed from: M */
    public void m167477M(boolean z) {
        View view;
        View view2;
        iml0 iml0Var = this.f147128z;
        if (iml0Var != null) {
            iml0Var.m140937a();
        }
        this.f147108f.setVisibility(0);
        if (this.f147122t == 0 && (this.f147098A || z)) {
            this.f147108f.setTranslationY(0.0f);
            float f = -this.f147108f.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.f147108f.getLocationInWindow(iArr);
                f -= iArr[1];
            }
            this.f147108f.setTranslationY(f);
            iml0 iml0Var2 = new iml0();
            hml0 hml0VarM135949l = kkl0.m150149c(this.f147108f).m135949l(0.0f);
            hml0VarM135949l.m135947j(this.f147102E);
            iml0Var2.m140939c(hml0VarM135949l);
            if (this.f147123u && (view2 = this.f147111i) != null) {
                view2.setTranslationY(f);
                iml0Var2.m140939c(kkl0.m150149c(this.f147111i).m135949l(0.0f));
            }
            iml0Var2.m140942f(f147097G);
            iml0Var2.m140941e(250L);
            iml0Var2.m140943g(this.f147101D);
            this.f147128z = iml0Var2;
            iml0Var2.m140944h();
        } else {
            this.f147108f.setAlpha(1.0f);
            this.f147108f.setTranslationY(0.0f);
            if (this.f147123u && (view = this.f147111i) != null) {
                view.setTranslationY(0.0f);
            }
            this.f147101D.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f147107e;
        if (actionBarOverlayLayout != null) {
            kkl0.m150158g0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final qid m167478N(View view) {
        if (view instanceof qid) {
            return (qid) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of ".concat(view != 0 ? view.getClass().getSimpleName() : "null"));
    }

    /* JADX INFO: renamed from: O */
    public int m167479O() {
        return this.f147107e.getActionBarHideOffset();
    }

    /* JADX INFO: renamed from: P */
    public int m167480P() {
        return this.f147109g.mo663j();
    }

    /* JADX INFO: renamed from: Q */
    public final void m167481Q() {
        if (this.f147126x) {
            this.f147126x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f147107e;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m167489Y(false);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m167482R(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(xdc0.f193572q);
        this.f147107e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f147109g = m167478N(view.findViewById(xdc0.f193556a));
        this.f147110h = (ActionBarContextView) view.findViewById(xdc0.f193561f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(xdc0.f193558c);
        this.f147108f = actionBarContainer;
        qid qidVar = this.f147109g;
        if (qidVar == null || this.f147110h == null || actionBarContainer == null) {
            wtq0.m207906a(getClass().getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.f147103a = qidVar.getContext();
        boolean z = (this.f147109g.mo668o() & 4) != 0;
        if (z) {
            this.f147115m = true;
        }
        f30 f30VarM123689b = f30.m123689b(this.f147103a);
        m167486V(f30VarM123689b.m123690a() || z);
        m167484T(f30VarM123689b.m123695g());
        TypedArray typedArrayObtainStyledAttributes = this.f147103a.obtainStyledAttributes(null, gic0.f104344a, s8c0.f166783c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(gic0.f104394k, false)) {
            m167485U(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(gic0.f104384i, 0);
        if (dimensionPixelSize != 0) {
            mo102168A(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: S */
    public void m167483S(int i, int i2) {
        int iMo668o = this.f147109g.mo668o();
        if ((i2 & 4) != 0) {
            this.f147115m = true;
        }
        this.f147109g.mo662i((i & i2) | ((~i2) & iMo668o));
    }

    /* JADX INFO: renamed from: T */
    public final void m167484T(boolean z) {
        this.f147121s = z;
        if (z) {
            this.f147108f.setTabContainer(null);
            this.f147109g.mo675v(this.f147112j);
        } else {
            this.f147109g.mo675v(null);
            this.f147108f.setTabContainer(this.f147112j);
        }
        boolean z2 = m167480P() == 2;
        ScrollingTabContainerView scrollingTabContainerView = this.f147112j;
        if (scrollingTabContainerView != null) {
            if (z2) {
                scrollingTabContainerView.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f147107e;
                if (actionBarOverlayLayout != null) {
                    kkl0.m150158g0(actionBarOverlayLayout);
                }
            } else {
                scrollingTabContainerView.setVisibility(8);
            }
        }
        this.f147109g.mo665l(!this.f147121s && z2);
        this.f147107e.setHasNonEmbeddedTabs(!this.f147121s && z2);
    }

    /* JADX INFO: renamed from: U */
    public void m167485U(boolean z) {
        if (z && !this.f147107e.m480q()) {
            wtq0.m207906a("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        } else {
            this.f147099B = z;
            this.f147107e.setHideOnContentScrollEnabled(z);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m167486V(boolean z) {
        this.f147109g.mo674u(z);
    }

    /* JADX INFO: renamed from: W */
    public final boolean m167487W() {
        return kkl0.m150134P(this.f147108f);
    }

    /* JADX INFO: renamed from: X */
    public final void m167488X() {
        if (this.f147126x) {
            return;
        }
        this.f147126x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f147107e;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m167489Y(false);
    }

    /* JADX INFO: renamed from: Y */
    public final void m167489Y(boolean z) {
        boolean zM167473J = m167473J(this.f147124v, this.f147125w, this.f147126x);
        boolean z2 = this.f147127y;
        if (zM167473J) {
            if (z2) {
                return;
            }
            this.f147127y = true;
            m167477M(z);
            return;
        }
        if (z2) {
            this.f147127y = false;
            m167476L(z);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    /* JADX INFO: renamed from: a */
    public void mo486a() {
        if (this.f147125w) {
            this.f147125w = false;
            m167489Y(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    /* JADX INFO: renamed from: c */
    public void mo488c() {
        if (this.f147125w) {
            return;
        }
        this.f147125w = true;
        m167489Y(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    /* JADX INFO: renamed from: d */
    public void mo489d() {
        iml0 iml0Var = this.f147128z;
        if (iml0Var != null) {
            iml0Var.m140937a();
            this.f147128z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    /* JADX INFO: renamed from: e */
    public void mo490e(boolean z) {
        this.f147123u = z;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: g */
    public boolean mo102180g() {
        qid qidVar = this.f147109g;
        if (qidVar == null || !qidVar.mo661h()) {
            return false;
        }
        this.f147109g.collapseActionView();
        return true;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: h */
    public void mo102181h(boolean z) {
        if (z == this.f147119q) {
            return;
        }
        this.f147119q = z;
        int size = this.f147120r.size();
        for (int i = 0; i < size; i++) {
            this.f147120r.get(i).onMenuVisibilityChanged(z);
        }
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: i */
    public int mo102182i() {
        return this.f147109g.mo668o();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: j */
    public float mo102183j() {
        return kkl0.m150183t(this.f147108f);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: k */
    public int mo102184k() {
        return this.f147108f.getHeight();
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: l */
    public Context mo102185l() {
        if (this.f147104b == null) {
            TypedValue typedValue = new TypedValue();
            this.f147103a.getTheme().resolveAttribute(s8c0.f166788h, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f147104b = new ContextThemeWrapper(this.f147103a, i);
            } else {
                this.f147104b = this.f147103a;
            }
        }
        return this.f147104b;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: m */
    public void mo102186m() {
        if (this.f147124v) {
            return;
        }
        this.f147124v = true;
        m167489Y(false);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: o */
    public boolean mo102188o() {
        int iMo102184k = mo102184k();
        if (this.f147127y) {
            return iMo102184k == 0 || m167479O() < iMo102184k;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    public void onWindowVisibilityChanged(int i) {
        this.f147122t = i;
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: p */
    public void mo102189p(Configuration configuration) {
        m167484T(f30.m123689b(this.f147103a).m123695g());
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: r */
    public boolean mo102191r(int i, KeyEvent keyEvent) {
        Menu menuMo152475c;
        C19123d c19123d = this.f147116n;
        if (c19123d == null || (menuMo152475c = c19123d.mo152475c()) == null) {
            return false;
        }
        menuMo152475c.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuMo152475c.performShortcut(i, keyEvent, 0);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: u */
    public void mo102194u(Drawable drawable) {
        this.f147108f.setPrimaryBackground(drawable);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: v */
    public void mo102195v(boolean z) {
        if (this.f147115m) {
            return;
        }
        mo102196w(z);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: w */
    public void mo102196w(boolean z) {
        m167483S(z ? 4 : 0, 4);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: x */
    public void mo102197x(int i) {
        if ((i & 4) != 0) {
            this.f147115m = true;
        }
        this.f147109g.mo662i(i);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: y */
    public void mo102198y(boolean z) {
        m167483S(z ? 2 : 0, 2);
    }

    @Override // p153l.c30
    /* JADX INFO: renamed from: z */
    public void mo102199z(boolean z) {
        m167483S(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.InterfaceC0101d
    /* JADX INFO: renamed from: b */
    public void mo487b() {
    }

    public ofq0(Dialog dialog) {
        this.f147106d = dialog;
        m167482R(dialog.getWindow().getDecorView());
    }
}
