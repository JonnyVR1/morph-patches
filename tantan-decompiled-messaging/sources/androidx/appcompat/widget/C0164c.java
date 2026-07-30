package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$string;
import androidx.appcompat.view.menu.InterfaceC0091g;
import androidx.appcompat.view.menu.MenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import p149l.aac0;
import p149l.ddl0;
import p149l.gbl0;
import p149l.gdl0;
import p149l.khd;
import p149l.n0c0;
import p149l.nu0;
import p149l.qri0;
import p149l.s5c0;
import p149l.t30;
import p149l.w3c0;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0164c implements khd {

    /* JADX INFO: renamed from: a */
    public Toolbar f802a;

    /* JADX INFO: renamed from: b */
    public int f803b;

    /* JADX INFO: renamed from: c */
    public View f804c;

    /* JADX INFO: renamed from: d */
    public View f805d;

    /* JADX INFO: renamed from: e */
    public Drawable f806e;

    /* JADX INFO: renamed from: f */
    public Drawable f807f;

    /* JADX INFO: renamed from: g */
    public Drawable f808g;

    /* JADX INFO: renamed from: h */
    public boolean f809h;

    /* JADX INFO: renamed from: i */
    public CharSequence f810i;

    /* JADX INFO: renamed from: j */
    public CharSequence f811j;

    /* JADX INFO: renamed from: k */
    public CharSequence f812k;

    /* JADX INFO: renamed from: l */
    public Window.Callback f813l;

    /* JADX INFO: renamed from: m */
    public boolean f814m;

    /* JADX INFO: renamed from: n */
    public ActionMenuPresenter f815n;

    /* JADX INFO: renamed from: o */
    public int f816o;

    /* JADX INFO: renamed from: p */
    public int f817p;

    /* JADX INFO: renamed from: q */
    public Drawable f818q;

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$a */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final t30 f819a;

        public a() {
            this.f819a = new t30(C0164c.this.f802a.getContext(), 0, R.id.home, 0, 0, C0164c.this.f810i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0164c c0164c = C0164c.this;
            Window.Callback callback = c0164c.f813l;
            if (callback == null || !c0164c.f814m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f819a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    public class b extends gdl0 {

        /* JADX INFO: renamed from: a */
        public boolean f821a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f822b;

        public b(int i) {
            this.f822b = i;
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationCancel(View view) {
            this.f821a = true;
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationEnd(View view) {
            if (this.f821a) {
                return;
            }
            C0164c.this.f802a.setVisibility(this.f822b);
        }

        @Override // p149l.gdl0, p149l.fdl0
        public void onAnimationStart(View view) {
            C0164c.this.f802a.setVisibility(0);
        }
    }

    public C0164c(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f816o = 0;
        this.f817p = 0;
        this.f802a = toolbar;
        this.f810i = toolbar.getTitle();
        this.f811j = toolbar.getSubtitle();
        this.f809h = this.f810i != null;
        this.f808g = toolbar.getNavigationIcon();
        qri0 qri0VarM175993u = qri0.m175993u(toolbar.getContext(), null, aac0.f68418a, n0c0.f136511c, 0);
        this.f818q = qri0VarM175993u.m176000g(aac0.f68473l);
        if (z) {
            CharSequence charSequenceM176009p = qri0VarM175993u.m176009p(aac0.f68503r);
            if (!TextUtils.isEmpty(charSequenceM176009p)) {
                setTitle(charSequenceM176009p);
            }
            CharSequence charSequenceM176009p2 = qri0VarM175993u.m176009p(aac0.f68493p);
            if (!TextUtils.isEmpty(charSequenceM176009p2)) {
                m648F(charSequenceM176009p2);
            }
            Drawable drawableM176000g = qri0VarM175993u.m176000g(aac0.f68483n);
            if (drawableM176000g != null) {
                m645C(drawableM176000g);
            }
            Drawable drawableM176000g2 = qri0VarM175993u.m176000g(aac0.f68478m);
            if (drawableM176000g2 != null) {
                setIcon(drawableM176000g2);
            }
            if (this.f808g == null && (drawable = this.f818q) != null) {
                mo669q(drawable);
            }
            mo661i(qri0VarM175993u.m176004k(aac0.f68453h, 0));
            int iM176007n = qri0VarM175993u.m176007n(aac0.f68448g, 0);
            if (iM176007n != 0) {
                m643A(LayoutInflater.from(this.f802a.getContext()).inflate(iM176007n, (ViewGroup) this.f802a, false));
                mo661i(this.f803b | 16);
            }
            int iM176006m = qri0VarM175993u.m176006m(aac0.f68463j, 0);
            if (iM176006m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f802a.getLayoutParams();
                layoutParams.height = iM176006m;
                this.f802a.setLayoutParams(layoutParams);
            }
            int iM175998e = qri0VarM175993u.m175998e(aac0.f68443f, -1);
            int iM175998e2 = qri0VarM175993u.m175998e(aac0.f68438e, -1);
            if (iM175998e >= 0 || iM175998e2 >= 0) {
                this.f802a.setContentInsetsRelative(Math.max(iM175998e, 0), Math.max(iM175998e2, 0));
            }
            int iM176007n2 = qri0VarM175993u.m176007n(aac0.f68508s, 0);
            if (iM176007n2 != 0) {
                Toolbar toolbar2 = this.f802a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM176007n2);
            }
            int iM176007n3 = qri0VarM175993u.m176007n(aac0.f68498q, 0);
            if (iM176007n3 != 0) {
                Toolbar toolbar3 = this.f802a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM176007n3);
            }
            int iM176007n4 = qri0VarM175993u.m176007n(aac0.f68488o, 0);
            if (iM176007n4 != 0) {
                this.f802a.setPopupTheme(iM176007n4);
            }
        } else {
            this.f803b = m678z();
        }
        qri0VarM175993u.m176012v();
        m644B(i);
        this.f812k = this.f802a.getNavigationContentDescription();
        this.f802a.setNavigationOnClickListener(new a());
    }

    /* JADX INFO: renamed from: A */
    public void m643A(View view) {
        View view2 = this.f805d;
        if (view2 != null && (this.f803b & 16) != 0) {
            this.f802a.removeView(view2);
        }
        this.f805d = view;
        if (view == null || (this.f803b & 16) == 0) {
            return;
        }
        this.f802a.addView(view);
    }

    /* JADX INFO: renamed from: B */
    public void m644B(int i) {
        if (i == this.f817p) {
            return;
        }
        this.f817p = i;
        if (TextUtils.isEmpty(this.f802a.getNavigationContentDescription())) {
            m646D(this.f817p);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m645C(Drawable drawable) {
        this.f807f = drawable;
        m652J();
    }

    /* JADX INFO: renamed from: D */
    public void m646D(int i) {
        m647E(i == 0 ? null : getContext().getString(i));
    }

    /* JADX INFO: renamed from: E */
    public void m647E(CharSequence charSequence) {
        this.f812k = charSequence;
        m650H();
    }

    /* JADX INFO: renamed from: F */
    public void m648F(CharSequence charSequence) {
        this.f811j = charSequence;
        if ((this.f803b & 8) != 0) {
            this.f802a.setSubtitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m649G(CharSequence charSequence) {
        this.f810i = charSequence;
        if ((this.f803b & 8) != 0) {
            this.f802a.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m650H() {
        if ((this.f803b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f812k);
            Toolbar toolbar = this.f802a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f817p);
            } else {
                toolbar.setNavigationContentDescription(this.f812k);
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m651I() {
        int i = this.f803b & 4;
        Toolbar toolbar = this.f802a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        Drawable drawable = this.f808g;
        if (drawable == null) {
            drawable = this.f818q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: J */
    public final void m652J() {
        Drawable drawable;
        int i = this.f803b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f807f) == null) {
            drawable = this.f806e;
        }
        this.f802a.setLogo(drawable);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: a */
    public boolean mo653a() {
        return this.f802a.canShowOverflowMenu();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: b */
    public boolean mo654b() {
        return this.f802a.showOverflowMenu();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: c */
    public boolean mo655c() {
        return this.f802a.isOverflowMenuShowing();
    }

    @Override // p149l.khd
    public void collapseActionView() {
        this.f802a.collapseActionView();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: d */
    public boolean mo656d() {
        return this.f802a.hideOverflowMenu();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: e */
    public void mo657e(Menu menu, InterfaceC0091g.a aVar) {
        if (this.f815n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f802a.getContext());
            this.f815n = actionMenuPresenter;
            actionMenuPresenter.m399i(s5c0.f162523g);
        }
        this.f815n.setCallback(aVar);
        this.f802a.setMenu((MenuBuilder) menu, this.f815n);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: f */
    public void mo658f() {
        this.f814m = true;
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: g */
    public boolean mo659g() {
        return this.f802a.isOverflowMenuShowPending();
    }

    @Override // p149l.khd
    public Context getContext() {
        return this.f802a.getContext();
    }

    @Override // p149l.khd
    public int getHeight() {
        return this.f802a.getHeight();
    }

    @Override // p149l.khd
    public CharSequence getTitle() {
        return this.f802a.getTitle();
    }

    @Override // p149l.khd
    public int getVisibility() {
        return this.f802a.getVisibility();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: h */
    public boolean mo660h() {
        return this.f802a.hasExpandedActionView();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: i */
    public void mo661i(int i) {
        View view;
        int i2 = this.f803b ^ i;
        this.f803b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m650H();
                }
                m651I();
            }
            if ((i2 & 3) != 0) {
                m652J();
            }
            if ((i2 & 8) != 0) {
                int i3 = i & 8;
                Toolbar toolbar = this.f802a;
                if (i3 != 0) {
                    toolbar.setTitle(this.f810i);
                    this.f802a.setSubtitle(this.f811j);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    this.f802a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f805d) == null) {
                return;
            }
            int i4 = i & 16;
            Toolbar toolbar2 = this.f802a;
            if (i4 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: j */
    public int mo662j() {
        return this.f816o;
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: k */
    public void mo663k() {
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: l */
    public void mo664l(boolean z) {
        this.f802a.setCollapsible(z);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: m */
    public void mo665m() {
        this.f802a.dismissPopupMenus();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: n */
    public void mo666n(int i) {
        this.f802a.setVisibility(i);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: o */
    public int mo667o() {
        return this.f803b;
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: p */
    public void mo668p() {
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: q */
    public void mo669q(Drawable drawable) {
        this.f808g = drawable;
        m651I();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: r */
    public Menu mo670r() {
        return this.f802a.getMenu();
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: s */
    public ddl0 mo671s(int i, long j) {
        return gbl0.m125186c(this.f802a).m111030b(i == 0 ? 1.0f : 0.0f).m111033e(j).m111035g(new b(i));
    }

    @Override // p149l.khd
    public void setBackgroundDrawable(Drawable drawable) {
        gbl0.m125207m0(this.f802a, drawable);
    }

    @Override // p149l.khd
    public void setIcon(int i) {
        setIcon(i != 0 ? nu0.m161424b(getContext(), i) : null);
    }

    @Override // p149l.khd
    public void setTitle(CharSequence charSequence) {
        this.f809h = true;
        m649G(charSequence);
    }

    @Override // p149l.khd
    public void setWindowCallback(Window.Callback callback) {
        this.f813l = callback;
    }

    @Override // p149l.khd
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f809h) {
            return;
        }
        m649G(charSequence);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: t */
    public ViewGroup mo672t() {
        return this.f802a;
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: u */
    public void mo673u(boolean z) {
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: v */
    public void mo674v(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f804c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f802a;
            if (parent == toolbar) {
                toolbar.removeView(this.f804c);
            }
        }
        this.f804c = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.f816o != 2) {
            return;
        }
        this.f802a.addView(scrollingTabContainerView, 0);
        Toolbar.C0159e c0159e = (Toolbar.C0159e) this.f804c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0159e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0159e).height = -2;
        c0159e.f110601a = BadgeDrawable.BOTTOM_START;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: w */
    public void mo675w(int i) {
        m645C(i != 0 ? nu0.m161424b(getContext(), i) : null);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: x */
    public void mo676x(int i) {
        mo669q(i != 0 ? nu0.m161424b(getContext(), i) : null);
    }

    @Override // p149l.khd
    /* JADX INFO: renamed from: y */
    public void mo677y(InterfaceC0091g.a aVar, MenuBuilder.InterfaceC0078a interfaceC0078a) {
        this.f802a.setMenuCallbacks(aVar, interfaceC0078a);
    }

    /* JADX INFO: renamed from: z */
    public final int m678z() {
        if (this.f802a.getNavigationIcon() == null) {
            return 11;
        }
        this.f818q = this.f802a.getNavigationIcon();
        return 15;
    }

    @Override // p149l.khd
    public void setIcon(Drawable drawable) {
        this.f806e = drawable;
        m652J();
    }

    public C0164c(Toolbar toolbar, boolean z) {
        this(toolbar, z, R$string.f101a, w3c0.f184360n);
    }
}
