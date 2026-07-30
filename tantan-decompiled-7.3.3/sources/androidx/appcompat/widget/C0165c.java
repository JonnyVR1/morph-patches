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
import androidx.appcompat.view.menu.InterfaceC0092g;
import androidx.appcompat.view.menu.MenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import p153l.ccc0;
import p153l.gic0;
import p153l.hml0;
import p153l.kkl0;
import p153l.kml0;
import p153l.n30;
import p153l.qid;
import p153l.s8c0;
import p153l.t0j0;
import p153l.tu0;
import p153l.xdc0;

/* JADX INFO: renamed from: androidx.appcompat.widget.c */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class C0165c implements qid {

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
        public final n30 f819a;

        public a() {
            this.f819a = new n30(C0165c.this.f802a.getContext(), 0, R.id.home, 0, 0, C0165c.this.f810i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0165c c0165c = C0165c.this;
            Window.Callback callback = c0165c.f813l;
            if (callback == null || !c0165c.f814m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f819a);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$b */
    public class b extends kml0 {

        /* JADX INFO: renamed from: a */
        public boolean f821a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f822b;

        public b(int i) {
            this.f822b = i;
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationCancel(View view) {
            this.f821a = true;
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationEnd(View view) {
            if (this.f821a) {
                return;
            }
            C0165c.this.f802a.setVisibility(this.f822b);
        }

        @Override // p153l.kml0, p153l.jml0
        public void onAnimationStart(View view) {
            C0165c.this.f802a.setVisibility(0);
        }
    }

    public C0165c(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f816o = 0;
        this.f817p = 0;
        this.f802a = toolbar;
        this.f810i = toolbar.getTitle();
        this.f811j = toolbar.getSubtitle();
        this.f809h = this.f810i != null;
        this.f808g = toolbar.getNavigationIcon();
        t0j0 t0j0VarM188782u = t0j0.m188782u(toolbar.getContext(), null, gic0.f104344a, s8c0.f166783c, 0);
        this.f818q = t0j0VarM188782u.m188789g(gic0.f104399l);
        if (z) {
            CharSequence charSequenceM188798p = t0j0VarM188782u.m188798p(gic0.f104429r);
            if (!TextUtils.isEmpty(charSequenceM188798p)) {
                setTitle(charSequenceM188798p);
            }
            CharSequence charSequenceM188798p2 = t0j0VarM188782u.m188798p(gic0.f104419p);
            if (!TextUtils.isEmpty(charSequenceM188798p2)) {
                m649F(charSequenceM188798p2);
            }
            Drawable drawableM188789g = t0j0VarM188782u.m188789g(gic0.f104409n);
            if (drawableM188789g != null) {
                m646C(drawableM188789g);
            }
            Drawable drawableM188789g2 = t0j0VarM188782u.m188789g(gic0.f104404m);
            if (drawableM188789g2 != null) {
                setIcon(drawableM188789g2);
            }
            if (this.f808g == null && (drawable = this.f818q) != null) {
                mo670q(drawable);
            }
            mo662i(t0j0VarM188782u.m188793k(gic0.f104379h, 0));
            int iM188796n = t0j0VarM188782u.m188796n(gic0.f104374g, 0);
            if (iM188796n != 0) {
                m644A(LayoutInflater.from(this.f802a.getContext()).inflate(iM188796n, (ViewGroup) this.f802a, false));
                mo662i(this.f803b | 16);
            }
            int iM188795m = t0j0VarM188782u.m188795m(gic0.f104389j, 0);
            if (iM188795m > 0) {
                ViewGroup.LayoutParams layoutParams = this.f802a.getLayoutParams();
                layoutParams.height = iM188795m;
                this.f802a.setLayoutParams(layoutParams);
            }
            int iM188787e = t0j0VarM188782u.m188787e(gic0.f104369f, -1);
            int iM188787e2 = t0j0VarM188782u.m188787e(gic0.f104364e, -1);
            if (iM188787e >= 0 || iM188787e2 >= 0) {
                this.f802a.setContentInsetsRelative(Math.max(iM188787e, 0), Math.max(iM188787e2, 0));
            }
            int iM188796n2 = t0j0VarM188782u.m188796n(gic0.f104434s, 0);
            if (iM188796n2 != 0) {
                Toolbar toolbar2 = this.f802a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), iM188796n2);
            }
            int iM188796n3 = t0j0VarM188782u.m188796n(gic0.f104424q, 0);
            if (iM188796n3 != 0) {
                Toolbar toolbar3 = this.f802a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), iM188796n3);
            }
            int iM188796n4 = t0j0VarM188782u.m188796n(gic0.f104414o, 0);
            if (iM188796n4 != 0) {
                this.f802a.setPopupTheme(iM188796n4);
            }
        } else {
            this.f803b = m679z();
        }
        t0j0VarM188782u.m188801v();
        m645B(i);
        this.f812k = this.f802a.getNavigationContentDescription();
        this.f802a.setNavigationOnClickListener(new a());
    }

    /* JADX INFO: renamed from: A */
    public void m644A(View view) {
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
    public void m645B(int i) {
        if (i == this.f817p) {
            return;
        }
        this.f817p = i;
        if (TextUtils.isEmpty(this.f802a.getNavigationContentDescription())) {
            m647D(this.f817p);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m646C(Drawable drawable) {
        this.f807f = drawable;
        m653J();
    }

    /* JADX INFO: renamed from: D */
    public void m647D(int i) {
        m648E(i == 0 ? null : getContext().getString(i));
    }

    /* JADX INFO: renamed from: E */
    public void m648E(CharSequence charSequence) {
        this.f812k = charSequence;
        m651H();
    }

    /* JADX INFO: renamed from: F */
    public void m649F(CharSequence charSequence) {
        this.f811j = charSequence;
        if ((this.f803b & 8) != 0) {
            this.f802a.setSubtitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m650G(CharSequence charSequence) {
        this.f810i = charSequence;
        if ((this.f803b & 8) != 0) {
            this.f802a.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m651H() {
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
    public final void m652I() {
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
    public final void m653J() {
        Drawable drawable;
        int i = this.f803b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f807f) == null) {
            drawable = this.f806e;
        }
        this.f802a.setLogo(drawable);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: a */
    public boolean mo654a() {
        return this.f802a.canShowOverflowMenu();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: b */
    public boolean mo655b() {
        return this.f802a.showOverflowMenu();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: c */
    public boolean mo656c() {
        return this.f802a.isOverflowMenuShowing();
    }

    @Override // p153l.qid
    public void collapseActionView() {
        this.f802a.collapseActionView();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: d */
    public boolean mo657d() {
        return this.f802a.hideOverflowMenu();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: e */
    public void mo658e(Menu menu, InterfaceC0092g.a aVar) {
        if (this.f815n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f802a.getContext());
            this.f815n = actionMenuPresenter;
            actionMenuPresenter.m400i(xdc0.f193562g);
        }
        this.f815n.setCallback(aVar);
        this.f802a.setMenu((MenuBuilder) menu, this.f815n);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: f */
    public void mo659f() {
        this.f814m = true;
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: g */
    public boolean mo660g() {
        return this.f802a.isOverflowMenuShowPending();
    }

    @Override // p153l.qid
    public Context getContext() {
        return this.f802a.getContext();
    }

    @Override // p153l.qid
    public int getHeight() {
        return this.f802a.getHeight();
    }

    @Override // p153l.qid
    public CharSequence getTitle() {
        return this.f802a.getTitle();
    }

    @Override // p153l.qid
    public int getVisibility() {
        return this.f802a.getVisibility();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: h */
    public boolean mo661h() {
        return this.f802a.hasExpandedActionView();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: i */
    public void mo662i(int i) {
        View view;
        int i2 = this.f803b ^ i;
        this.f803b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m651H();
                }
                m652I();
            }
            if ((i2 & 3) != 0) {
                m653J();
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

    @Override // p153l.qid
    /* JADX INFO: renamed from: j */
    public int mo663j() {
        return this.f816o;
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: k */
    public void mo664k() {
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: l */
    public void mo665l(boolean z) {
        this.f802a.setCollapsible(z);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: m */
    public void mo666m() {
        this.f802a.dismissPopupMenus();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: n */
    public void mo667n(int i) {
        this.f802a.setVisibility(i);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: o */
    public int mo668o() {
        return this.f803b;
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: p */
    public void mo669p() {
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: q */
    public void mo670q(Drawable drawable) {
        this.f808g = drawable;
        m652I();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: r */
    public Menu mo671r() {
        return this.f802a.getMenu();
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: s */
    public hml0 mo672s(int i, long j) {
        return kkl0.m150149c(this.f802a).m135939b(i == 0 ? 1.0f : 0.0f).m135942e(j).m135944g(new b(i));
    }

    @Override // p153l.qid
    public void setBackgroundDrawable(Drawable drawable) {
        kkl0.m150170m0(this.f802a, drawable);
    }

    @Override // p153l.qid
    public void setIcon(int i) {
        setIcon(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    @Override // p153l.qid
    public void setTitle(CharSequence charSequence) {
        this.f809h = true;
        m650G(charSequence);
    }

    @Override // p153l.qid
    public void setWindowCallback(Window.Callback callback) {
        this.f813l = callback;
    }

    @Override // p153l.qid
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f809h) {
            return;
        }
        m650G(charSequence);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: t */
    public ViewGroup mo673t() {
        return this.f802a;
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: u */
    public void mo674u(boolean z) {
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: v */
    public void mo675v(ScrollingTabContainerView scrollingTabContainerView) {
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
        Toolbar.C0160e c0160e = (Toolbar.C0160e) this.f804c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) c0160e).width = -2;
        ((ViewGroup.MarginLayoutParams) c0160e).height = -2;
        c0160e.f79555a = BadgeDrawable.BOTTOM_START;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: w */
    public void mo676w(int i) {
        m646C(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: x */
    public void mo677x(int i) {
        mo670q(i != 0 ? tu0.m192702b(getContext(), i) : null);
    }

    @Override // p153l.qid
    /* JADX INFO: renamed from: y */
    public void mo678y(InterfaceC0092g.a aVar, MenuBuilder.InterfaceC0079a interfaceC0079a) {
        this.f802a.setMenuCallbacks(aVar, interfaceC0079a);
    }

    /* JADX INFO: renamed from: z */
    public final int m679z() {
        if (this.f802a.getNavigationIcon() == null) {
            return 11;
        }
        this.f818q = this.f802a.getNavigationIcon();
        return 15;
    }

    @Override // p153l.qid
    public void setIcon(Drawable drawable) {
        this.f806e = drawable;
        m653J();
    }

    public C0165c(Toolbar toolbar, boolean z) {
        this(toolbar, z, R$string.f101a, ccc0.f80937n);
    }
}
