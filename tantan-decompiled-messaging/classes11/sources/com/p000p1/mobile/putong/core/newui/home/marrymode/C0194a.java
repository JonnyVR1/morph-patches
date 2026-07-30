package com.p000p1.mobile.putong.core.newui.home.marrymode;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.RadarRipple;
import com.p1.mobile.putong.core.ui.asneedloadscroll.AsNeedLoadScrollView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.cwf0;
import l.d30;
import l.h1x;
import l.j760;
import l.l9b;
import l.osi0;
import l.roj0;
import l.s7m;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.xdl0;
import l.xij0;
import l.xma;
import l.zvf0;
import p009l.g1x;
import p009l.i0e;
import p009l.o0x;
import v.VButton;
import v.VDraweeView;
import v.VFrame;
import v.VFrame_Shadow;
import v.VFrame_Squared;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0194a implements s7m<g1x> {

    /* JADX INFO: renamed from: A */
    public g1x f2051A;

    /* JADX INFO: renamed from: B */
    public Act f2052B;

    /* JADX INFO: renamed from: E */
    public MarrModeProfileCardView f2055E;

    /* JADX INFO: renamed from: F */
    public MarrModeProfileCardView f2056F;

    /* JADX INFO: renamed from: G */
    public Animator f2057G;

    /* JADX INFO: renamed from: a */
    public VLinear f2062a;

    /* JADX INFO: renamed from: b */
    public VFrame f2063b;

    /* JADX INFO: renamed from: c */
    public VFrame f2064c;

    /* JADX INFO: renamed from: d */
    public View f2065d;

    /* JADX INFO: renamed from: e */
    public VFrame f2066e;

    /* JADX INFO: renamed from: f */
    public VImage f2067f;

    /* JADX INFO: renamed from: g */
    public VText f2068g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f2069h;

    /* JADX INFO: renamed from: i */
    public VFrame_Squared f2070i;

    /* JADX INFO: renamed from: j */
    public RadarRipple f2071j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f2072k;

    /* JADX INFO: renamed from: l */
    public HomeErrorNetView f2073l;

    /* JADX INFO: renamed from: m */
    public VImage f2074m;

    /* JADX INFO: renamed from: n */
    public VText f2075n;

    /* JADX INFO: renamed from: o */
    public VButton f2076o;

    /* JADX INFO: renamed from: p */
    public MarryModeEmptyView f2077p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f2078q;

    /* JADX INFO: renamed from: r */
    public MarrModeProfileCardView f2079r;

    /* JADX INFO: renamed from: s */
    public MarrModeProfileCardView f2080s;

    /* JADX INFO: renamed from: t */
    public VFrame_Shadow f2081t;

    /* JADX INFO: renamed from: u */
    public VLinear f2082u;

    /* JADX INFO: renamed from: v */
    public VText f2083v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f2084w;

    /* JADX INFO: renamed from: x */
    public VLinear f2085x;

    /* JADX INFO: renamed from: y */
    public VText f2086y;

    /* JADX INFO: renamed from: z */
    public MarryModeTabFrag f2087z;

    /* JADX INFO: renamed from: C */
    public boolean f2053C = false;

    /* JADX INFO: renamed from: D */
    public boolean f2054D = false;

    /* JADX INFO: renamed from: H */
    public rx.subjects.a<Boolean> f2058H = rx.subjects.a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: I */
    public List<User> f2059I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public int f2060J = 0;

    /* JADX INFO: renamed from: K */
    public cwf0 f2061K = i0e.m16062c("p_marriage_profile", C0194a.class.getName());

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userP9 = CoreModule.c.e0.p9();
            if (userP9.isBanedOrInactivated() || userP9.isFakeUser() || userP9.isJailed() || userP9.isSwipeJailed()) {
                osi0.g("账号状态异常");
                return;
            }
            C0194a c0194a = C0194a.this;
            if (c0194a.f2053C || c0194a.f2054D) {
                return;
            }
            if (c0194a.f2060J < c0194a.f2059I.size()) {
                C0194a c0194a2 = C0194a.this;
                User user = c0194a2.f2059I.get(c0194a2.f2060J);
                boolean zM14745E0 = C0194a.this.f2051A.m14745E0();
                C0194a c0194a3 = C0194a.this;
                if (zM14745E0) {
                    c0194a3.f2051A.m14755S0();
                    return;
                } else {
                    c0194a3.f2051A.m14746F0(user);
                    zvf0.u("e_marriage_next", "p_marriage_home", new j760[]{new j760("other_user_id", ((DbObject) user).id)});
                }
            }
            C0194a.this.m2764A(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b$a */
        public class a implements d30 {
            public a() {
            }

            public void call() {
                C0194a.this.m2764A(true);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userP9 = CoreModule.c.e0.p9();
            if (userP9.isBanedOrInactivated() || userP9.isFakeUser() || userP9.isJailed() || userP9.isSwipeJailed()) {
                osi0.g("账号状态异常");
                return;
            }
            C0194a c0194a = C0194a.this;
            if (c0194a.f2060J < c0194a.f2059I.size()) {
                C0194a c0194a2 = C0194a.this;
                User user = c0194a2.f2059I.get(c0194a2.f2060J);
                if (C0194a.this.f2051A.m14745E0()) {
                    C0194a.this.f2051A.m14755S0();
                } else {
                    zvf0.u("e_marriage_chat", "p_marriage_home", new j760[]{new j760("other_user_id", ((DbObject) user).id)});
                    C0194a.this.f2051A.m14753Q0(user, new a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0194a.this.f2051A.m14747G0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2092a;

        public d(String str) {
            this.f2092a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_marriage_event_home_entrance", "p_marriage_home", new j760[]{new j760("red_dot_state", this.f2092a)});
            xdl0.M(C0194a.this.f2065d, false);
            C0194a.this.f2051A.m14748H0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0194a.this.f2051A.m14749I0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$f */
    public class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0194a c0194a = C0194a.this;
            c0194a.f2053C = false;
            if (c0194a.f2054D) {
                return;
            }
            c0194a.m2769d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C0194a.this.f2053C = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$g */
    public class g implements Animation.AnimationListener {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0194a c0194a = C0194a.this;
            c0194a.f2054D = false;
            if (c0194a.f2053C) {
                return;
            }
            c0194a.m2769d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C0194a.this.f2054D = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$h */
    public class h implements MarrModeProfileCardView.InterfaceC0191a {
        public h() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC0191a
        /* JADX INFO: renamed from: a */
        public void mo2751a() {
            C0194a.this.f2051A.m14755S0();
        }

        @Override // com.p000p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC0191a
        /* JADX INFO: renamed from: b */
        public boolean mo2752b() {
            return !xma.G3();
        }
    }

    public C0194a(Act act, MarryModeTabFrag marryModeTabFrag) {
        this.f2087z = marryModeTabFrag;
        this.f2052B = act;
    }

    /* JADX INFO: renamed from: A */
    public void m2764A(boolean z) {
        if (xdl0.O0(this.f2056F)) {
            Animation rotateAnimation = new RotateAnimation(0.0f, z ? 90.0f : -90.0f, 1, 0.5f, 1, 2.0f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setAnimationListener(new f());
            this.f2056F.clearAnimation();
            this.f2056F.startAnimation(rotateAnimation);
            if (this.f2060J + 1 >= this.f2059I.size()) {
                xdl0.M(this.f2081t, false);
                xdl0.M(this.f2084w, false);
            }
        }
        if (xdl0.O0(this.f2055E)) {
            Animation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(1000L);
            scaleAnimation.setAnimationListener(new g());
            this.f2055E.clearAnimation();
            this.f2055E.startAnimation(scaleAnimation);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m2765B(String str) {
        if (!xdl0.O0(this.f2077p) || xdl0.O0(this.f2078q)) {
            return;
        }
        this.f2077p.m2755c(str);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m2766C0() {
        return this.f2052B;
    }

    /* JADX INFO: renamed from: b */
    public View m2767b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h1x.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m2773i1(g1x g1xVar) {
        this.f2051A = g1xVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m2769d() {
        i0e.m16064e(this.f2061K);
        this.f2056F.c();
        this.f2055E.bringToFront();
        MarrModeProfileCardView marrModeProfileCardView = this.f2056F;
        this.f2056F = this.f2055E;
        this.f2055E = marrModeProfileCardView;
        o0x.m19567A(((DbObject) this.f2059I.get(this.f2060J)).id);
        int i = this.f2060J + 1;
        this.f2060J = i;
        if (i >= this.f2059I.size()) {
            CoreModule.c.m0.e0.onNext(roj0.a);
            return;
        }
        User user = this.f2059I.get(this.f2060J);
        this.f2051A.m14754R0(user);
        this.f2061K.p(new j760[]{new j760("other_user_id", ((DbObject) user).id), new j760("is_myself", Boolean.FALSE), new j760("in_marriage_home", Boolean.TRUE)});
        i0e.m16065f(this.f2061K);
        if (this.f2060J + 1 < this.f2059I.size()) {
            User user2 = this.f2059I.get(this.f2060J + 1);
            o0x.m19597z(user2.media(0));
            this.f2055E.setItemData(user2);
        }
        int i2 = this.f2060J;
        int size = this.f2059I.size() - 1;
        AsNeedLoadScrollView asNeedLoadScrollView = this.f2055E;
        if (i2 == size) {
            xdl0.M(asNeedLoadScrollView, false);
        } else {
            xdl0.M(asNeedLoadScrollView, true);
        }
        m2788z();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m2770e() {
        this.f2077p.m2753a();
    }

    /* JADX INFO: renamed from: f */
    public View m2771f() {
        return this.f2078q;
    }

    /* JADX INFO: renamed from: i */
    public RelativeLayout m2772i() {
        return this.f2069h;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2767b = m2767b(layoutInflater, viewGroup);
        String strM19578g = o0x.m19578g();
        if (!TextUtils.isEmpty(strM19578g)) {
            int iD = t100.d(20.0f);
            int color = Color.parseColor(strM19578g);
            int color2 = Color.parseColor("#FFFFFF");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color2);
            gradientDrawable.setCornerRadius(iD);
            gradientDrawable.setStroke(2, color);
            this.f2080s.setBackground(gradientDrawable);
            this.f2079r.setBackground(gradientDrawable);
        }
        return viewM2767b;
    }

    /* JADX INFO: renamed from: j */
    public VDraweeView m2774j() {
        return this.f2072k;
    }

    /* JADX INFO: renamed from: k */
    public RadarRipple m2775k() {
        return this.f2071j;
    }

    /* JADX INFO: renamed from: l */
    public final void m2776l(MarrModeProfileCardView marrModeProfileCardView) {
        if (o0x.m19585n()) {
            marrModeProfileCardView.m2749f(new h());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m2777m(boolean z) {
        m2775k().setRadarColor(App.e.getResources().getColor(w0c0.I));
        this.f2057G = xij0.b0(m2775k(), m2774j());
        xdl0.M0(m2772i(), z);
        xdl0.M0(m2771f(), !z);
    }

    /* JADX INFO: renamed from: n */
    public void m2778n() {
        if (((Boolean) this.f2058H.e()).booleanValue()) {
            this.f2057G.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m2779p() {
        this.f2057G.cancel();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, com.p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView] */
    /* JADX INFO: renamed from: q */
    public void m2780q(List<User> list) {
        this.f2059I = list;
        Animator animator = this.f2057G;
        if (animator != null) {
            animator.cancel();
        }
        if (vwb.J(this.f2059I)) {
            m2785w();
            return;
        }
        this.f2060J = 0;
        ?? r1 = this.f2080s;
        this.f2056F = r1;
        r1.bringToFront();
        xdl0.M(this.f2056F, true);
        this.f2055E = this.f2079r;
        xdl0.M(m2772i(), false);
        xdl0.M(this.f2073l, false);
        xdl0.M(this.f2077p, false);
        xdl0.M(this.f2078q, true);
        xdl0.M(this.f2081t, true);
        xdl0.M(this.f2084w, true);
        User user = list.get(0);
        this.f2051A.m14754R0(user);
        m2786x();
        this.f2061K.p(new j760[]{new j760("other_user_id", ((DbObject) user).id), new j760("is_myself", Boolean.FALSE), new j760("in_marriage_home", Boolean.TRUE)});
        i0e.m16065f(this.f2061K);
        o0x.m19597z(user.media(0));
        this.f2056F.setItemData(user);
        if (list.size() > 1) {
            User user2 = list.get(1);
            o0x.m19597z(user2.media(0));
            this.f2055E.setItemData(user2);
            xdl0.M(this.f2055E, true);
        } else {
            xdl0.M(this.f2055E, false);
        }
        m2788z();
    }

    /* JADX INFO: renamed from: r */
    public void m2781r() {
        String str;
        xdl0.Z(new View[]{this.f2063b});
        MarrModeProfileCardView marrModeProfileCardView = this.f2080s;
        this.f2056F = marrModeProfileCardView;
        this.f2055E = this.f2079r;
        m2776l(marrModeProfileCardView);
        m2776l(this.f2079r);
        xdl0.E0(this.f2081t, new a());
        xdl0.E0(this.f2084w, new b());
        xdl0.E0(this.f2073l, new c());
        if (upa.f1() == null || !upa.f1().activities) {
            xdl0.M(this.f2064c, false);
        } else {
            xdl0.M(this.f2064c, true);
            boolean zEquals = TextUtils.equals((CharSequence) CoreModule.c.e0.p4.get(), l9b.U());
            View view = this.f2065d;
            if (zEquals) {
                xdl0.M(view, false);
                str = "off";
            } else {
                xdl0.M(view, true);
                str = "on";
            }
            zvf0.x("e_marriage_event_home_entrance", "p_marriage_home");
            xdl0.E0(this.f2064c, new d(str));
        }
        xdl0.E0(this.f2066e, new e());
    }

    /* JADX INFO: renamed from: s */
    public void m2782s() {
        this.f2059I = new ArrayList();
        xdl0.M(this.f2078q, false);
        xdl0.M(this.f2069h, false);
        xdl0.M(this.f2073l, true);
        xdl0.M(this.f2077p, false);
    }

    /* JADX INFO: renamed from: u */
    public void m2783u() {
        this.f2058H.onNext(Boolean.TRUE);
        this.f2059I = new ArrayList();
        xdl0.M(this.f2078q, false);
        xdl0.M(this.f2073l, false);
        xdl0.M(this.f2077p, false);
        xdl0.M(this.f2069h, true);
        m2778n();
    }

    /* JADX INFO: renamed from: v */
    public void m2784v() {
        this.f2059I = new ArrayList();
        xdl0.M(this.f2078q, false);
        xdl0.M(this.f2069h, false);
        xdl0.M(this.f2073l, false);
        xdl0.M(this.f2077p, true);
        m2765B("suggest_empty");
        zvf0.x("e_marriage_recommend_empty", "p_marriage_home");
    }

    /* JADX INFO: renamed from: w */
    public void m2785w() {
        this.f2059I = new ArrayList();
        xdl0.M(this.f2078q, false);
        xdl0.M(this.f2069h, false);
        xdl0.M(this.f2073l, false);
        xdl0.M(this.f2077p, true);
        m2765B("suggest_end");
        zvf0.x("e_marriage_recommend_over", "p_marriage_home");
    }

    /* JADX INFO: renamed from: x */
    public final void m2786x() {
        this.f2086y.setText(upa.t0());
    }

    /* JADX INFO: renamed from: y */
    public void m2787y(int i) {
        VText vText = this.f2068g;
        if (i <= 0) {
            xdl0.M(vText, false);
        } else {
            xdl0.M(vText, true);
            this.f2068g.setText(i < 100 ? String.valueOf(i) : "99+");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m2788z() {
        this.f2056F.m2750g();
    }
}
