package com.p051p1.mobile.putong.core.newui.home.marrymode;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p051p1.mobile.putong.core.p058ui.RadarRipple;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VFrame_Shadow;
import p151v.VFrame_Squared;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.asj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.f4x;
import p153l.g4x;
import p153l.gra;
import p153l.i4g0;
import p153l.iam;
import p153l.joa;
import p153l.jyb;
import p153l.l4g0;
import p153l.n3x;
import p153l.pf60;
import p153l.qa00;
import p153l.r1j0;
import p153l.uxj0;
import p153l.w1e;
import p153l.x20;
import p153l.yab;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8181a implements iam<f4x> {

    /* JADX INFO: renamed from: A */
    public f4x f24015A;

    /* JADX INFO: renamed from: B */
    public Act f24016B;

    /* JADX INFO: renamed from: E */
    public MarrModeProfileCardView f24019E;

    /* JADX INFO: renamed from: F */
    public MarrModeProfileCardView f24020F;

    /* JADX INFO: renamed from: G */
    public Animator f24021G;

    /* JADX INFO: renamed from: a */
    public VLinear f24026a;

    /* JADX INFO: renamed from: b */
    public VFrame f24027b;

    /* JADX INFO: renamed from: c */
    public VFrame f24028c;

    /* JADX INFO: renamed from: d */
    public View f24029d;

    /* JADX INFO: renamed from: e */
    public VFrame f24030e;

    /* JADX INFO: renamed from: f */
    public VImage f24031f;

    /* JADX INFO: renamed from: g */
    public VText f24032g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f24033h;

    /* JADX INFO: renamed from: i */
    public VFrame_Squared f24034i;

    /* JADX INFO: renamed from: j */
    public RadarRipple f24035j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f24036k;

    /* JADX INFO: renamed from: l */
    public HomeErrorNetView f24037l;

    /* JADX INFO: renamed from: m */
    public VImage f24038m;

    /* JADX INFO: renamed from: n */
    public VText f24039n;

    /* JADX INFO: renamed from: o */
    public VButton f24040o;

    /* JADX INFO: renamed from: p */
    public MarryModeEmptyView f24041p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f24042q;

    /* JADX INFO: renamed from: r */
    public MarrModeProfileCardView f24043r;

    /* JADX INFO: renamed from: s */
    public MarrModeProfileCardView f24044s;

    /* JADX INFO: renamed from: t */
    public VFrame_Shadow f24045t;

    /* JADX INFO: renamed from: u */
    public VLinear f24046u;

    /* JADX INFO: renamed from: v */
    public VText f24047v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f24048w;

    /* JADX INFO: renamed from: x */
    public VLinear f24049x;

    /* JADX INFO: renamed from: y */
    public VText f24050y;

    /* JADX INFO: renamed from: z */
    public MarryModeTabFrag f24051z;

    /* JADX INFO: renamed from: C */
    public boolean f24017C = false;

    /* JADX INFO: renamed from: D */
    public boolean f24018D = false;

    /* JADX INFO: renamed from: H */
    public C22507a<Boolean> f24022H = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: I */
    public List<User> f24023I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public int f24024J = 0;

    /* JADX INFO: renamed from: K */
    public l4g0 f24025K = w1e.m204399c("p_marriage_profile", C8181a.class.getName());

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9.isBanedOrInactivated() || userM116600p9.isFakeUser() || userM116600p9.isJailed() || userM116600p9.isSwipeJailed()) {
                r1j0.m179420g("账号状态异常");
                return;
            }
            C8181a c8181a = C8181a.this;
            if (c8181a.f24017C || c8181a.f24018D) {
                return;
            }
            if (c8181a.f24024J < c8181a.f24023I.size()) {
                C8181a c8181a2 = C8181a.this;
                User user = c8181a2.f24023I.get(c8181a2.f24024J);
                boolean zM124072E0 = C8181a.this.f24015A.m124072E0();
                C8181a c8181a3 = C8181a.this;
                if (zM124072E0) {
                    c8181a3.f24015A.m124082S0();
                    return;
                } else {
                    c8181a3.f24015A.m124073F0(user);
                    i4g0.m138523u("e_marriage_next", "p_marriage_home", new pf60("other_user_id", user.f56859id));
                }
            }
            C8181a.this.m39773A(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b$a */
        public class a implements x20 {
            public a() {
            }

            @Override // p153l.x20
            public void call() {
                C8181a.this.m39773A(true);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (userM116600p9.isBanedOrInactivated() || userM116600p9.isFakeUser() || userM116600p9.isJailed() || userM116600p9.isSwipeJailed()) {
                r1j0.m179420g("账号状态异常");
                return;
            }
            C8181a c8181a = C8181a.this;
            if (c8181a.f24024J < c8181a.f24023I.size()) {
                C8181a c8181a2 = C8181a.this;
                User user = c8181a2.f24023I.get(c8181a2.f24024J);
                if (C8181a.this.f24015A.m124072E0()) {
                    C8181a.this.f24015A.m124082S0();
                } else {
                    i4g0.m138523u("e_marriage_chat", "p_marriage_home", new pf60("other_user_id", user.f56859id));
                    C8181a.this.f24015A.m124080Q0(user, new a());
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
            C8181a.this.f24015A.m124074G0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f24056a;

        public d(String str) {
            this.f24056a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_marriage_event_home_entrance", "p_marriage_home", new pf60("red_dot_state", this.f24056a));
            bnl0.m105524M(C8181a.this.f24029d, false);
            C8181a.this.f24015A.m124075H0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8181a.this.f24015A.m124076I0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$f */
    public class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C8181a c8181a = C8181a.this;
            c8181a.f24017C = false;
            if (c8181a.f24018D) {
                return;
            }
            c8181a.m39777d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C8181a.this.f24017C = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$g */
    public class g implements Animation.AnimationListener {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C8181a c8181a = C8181a.this;
            c8181a.f24018D = false;
            if (c8181a.f24017C) {
                return;
            }
            c8181a.m39777d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C8181a.this.f24018D = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$h */
    public class h implements MarrModeProfileCardView.InterfaceC8178a {
        public h() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC8178a
        /* JADX INFO: renamed from: a */
        public void mo39765a() {
            C8181a.this.f24015A.m124082S0();
        }

        @Override // com.p051p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC8178a
        /* JADX INFO: renamed from: b */
        public boolean mo39766b() {
            return !joa.m146358H3();
        }
    }

    public C8181a(Act act, MarryModeTabFrag marryModeTabFrag) {
        this.f24051z = marryModeTabFrag;
        this.f24016B = act;
    }

    /* JADX INFO: renamed from: A */
    public void m39773A(boolean z) {
        if (bnl0.m105529O0(this.f24020F)) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, z ? 90.0f : -90.0f, 1, 0.5f, 1, 2.0f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setAnimationListener(new f());
            this.f24020F.clearAnimation();
            this.f24020F.startAnimation(rotateAnimation);
            if (this.f24024J + 1 >= this.f24023I.size()) {
                bnl0.m105524M(this.f24045t, false);
                bnl0.m105524M(this.f24048w, false);
            }
        }
        if (bnl0.m105529O0(this.f24019E)) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(1000L);
            scaleAnimation.setAnimationListener(new g());
            this.f24019E.clearAnimation();
            this.f24019E.startAnimation(scaleAnimation);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m39774B(String str) {
        if (!bnl0.m105529O0(this.f24041p) || bnl0.m105529O0(this.f24042q)) {
            return;
        }
        this.f24041p.m39769c(str);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f24016B;
    }

    /* JADX INFO: renamed from: b */
    public View m39775b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g4x.m128913b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(f4x f4xVar) {
        this.f24015A = f4xVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m39777d() {
        w1e.m204401e(this.f24025K);
        this.f24020F.m45512c();
        this.f24019E.bringToFront();
        MarrModeProfileCardView marrModeProfileCardView = this.f24020F;
        this.f24020F = this.f24019E;
        this.f24019E = marrModeProfileCardView;
        n3x.m161355A(this.f24023I.get(this.f24024J).f56859id);
        int i = this.f24024J + 1;
        this.f24024J = i;
        if (i >= this.f24023I.size()) {
            CoreModule.f18264c.f20405m0.f20148e0.onNext(uxj0.f181467a);
            return;
        }
        User user = this.f24023I.get(this.f24024J);
        this.f24015A.m124081R0(user);
        this.f24025K.m152781p(new pf60("other_user_id", user.f56859id), new pf60("is_myself", Boolean.FALSE), new pf60("in_marriage_home", Boolean.TRUE));
        w1e.m204402f(this.f24025K);
        if (this.f24024J + 1 < this.f24023I.size()) {
            User user2 = this.f24023I.get(this.f24024J + 1);
            n3x.m161385z(user2.media(0));
            this.f24019E.setItemData(user2);
        }
        int i2 = this.f24024J;
        int size = this.f24023I.size() - 1;
        MarrModeProfileCardView marrModeProfileCardView2 = this.f24019E;
        if (i2 == size) {
            bnl0.m105524M(marrModeProfileCardView2, false);
        } else {
            bnl0.m105524M(marrModeProfileCardView2, true);
        }
        m39795z();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m39778e() {
        this.f24041p.m39767a();
    }

    /* JADX INFO: renamed from: f */
    public View m39779f() {
        return this.f24042q;
    }

    /* JADX INFO: renamed from: i */
    public RelativeLayout m39780i() {
        return this.f24033h;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM39775b = m39775b(layoutInflater, viewGroup);
        String strM161366g = n3x.m161366g();
        if (!TextUtils.isEmpty(strM161366g)) {
            int iM175859d = qa00.m175859d(20.0f);
            int color = Color.parseColor(strM161366g);
            int color2 = Color.parseColor("#FFFFFF");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color2);
            gradientDrawable.setCornerRadius(iM175859d);
            gradientDrawable.setStroke(2, color);
            this.f24044s.setBackground(gradientDrawable);
            this.f24043r.setBackground(gradientDrawable);
        }
        return viewM39775b;
    }

    /* JADX INFO: renamed from: j */
    public VDraweeView m39781j() {
        return this.f24036k;
    }

    /* JADX INFO: renamed from: k */
    public RadarRipple m39782k() {
        return this.f24035j;
    }

    /* JADX INFO: renamed from: l */
    public final void m39783l(MarrModeProfileCardView marrModeProfileCardView) {
        if (n3x.m161373n()) {
            marrModeProfileCardView.m39763f(new h());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m39784m(boolean z) {
        m39782k().setRadarColor(App.f16088e.getResources().getColor(c9c0.f80342I));
        this.f24021G = asj0.m99933b0(m39782k(), m39781j());
        bnl0.m105525M0(m39780i(), z);
        bnl0.m105525M0(m39779f(), !z);
    }

    /* JADX INFO: renamed from: n */
    public void m39785n() {
        if (this.f24022H.m222761e().booleanValue()) {
            this.f24021G.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m39786p() {
        this.f24021G.cancel();
    }

    /* JADX INFO: renamed from: q */
    public void m39787q(List<User> list) {
        this.f24023I = list;
        Animator animator = this.f24021G;
        if (animator != null) {
            animator.cancel();
        }
        if (jyb.m147479J(this.f24023I)) {
            m39792w();
            return;
        }
        this.f24024J = 0;
        MarrModeProfileCardView marrModeProfileCardView = this.f24044s;
        this.f24020F = marrModeProfileCardView;
        marrModeProfileCardView.bringToFront();
        bnl0.m105524M(this.f24020F, true);
        this.f24019E = this.f24043r;
        bnl0.m105524M(m39780i(), false);
        bnl0.m105524M(this.f24037l, false);
        bnl0.m105524M(this.f24041p, false);
        bnl0.m105524M(this.f24042q, true);
        bnl0.m105524M(this.f24045t, true);
        bnl0.m105524M(this.f24048w, true);
        User user = list.get(0);
        this.f24015A.m124081R0(user);
        m39793x();
        this.f24025K.m152781p(new pf60("other_user_id", user.f56859id), new pf60("is_myself", Boolean.FALSE), new pf60("in_marriage_home", Boolean.TRUE));
        w1e.m204402f(this.f24025K);
        n3x.m161385z(user.media(0));
        this.f24020F.setItemData(user);
        if (list.size() > 1) {
            User user2 = list.get(1);
            n3x.m161385z(user2.media(0));
            this.f24019E.setItemData(user2);
            bnl0.m105524M(this.f24019E, true);
        } else {
            bnl0.m105524M(this.f24019E, false);
        }
        m39795z();
    }

    /* JADX INFO: renamed from: r */
    public void m39788r() {
        String str;
        bnl0.m105542Z(this.f24027b);
        MarrModeProfileCardView marrModeProfileCardView = this.f24044s;
        this.f24020F = marrModeProfileCardView;
        this.f24019E = this.f24043r;
        m39783l(marrModeProfileCardView);
        m39783l(this.f24043r);
        bnl0.m105509E0(this.f24045t, new a());
        bnl0.m105509E0(this.f24048w, new b());
        bnl0.m105509E0(this.f24037l, new c());
        if (gra.m131680f1() == null || !gra.m131680f1().activities) {
            bnl0.m105524M(this.f24028c, false);
        } else {
            bnl0.m105524M(this.f24028c, true);
            boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20381e0.f89305p4.get(), yab.m214864U());
            View view = this.f24029d;
            if (zEquals) {
                bnl0.m105524M(view, false);
                str = BLiveOperationTitleShowType.off;
            } else {
                bnl0.m105524M(view, true);
                str = "on";
            }
            i4g0.m138526x("e_marriage_event_home_entrance", "p_marriage_home");
            bnl0.m105509E0(this.f24028c, new d(str));
        }
        bnl0.m105509E0(this.f24030e, new e());
    }

    /* JADX INFO: renamed from: s */
    public void m39789s() {
        this.f24023I = new ArrayList();
        bnl0.m105524M(this.f24042q, false);
        bnl0.m105524M(this.f24033h, false);
        bnl0.m105524M(this.f24037l, true);
        bnl0.m105524M(this.f24041p, false);
    }

    /* JADX INFO: renamed from: u */
    public void m39790u() {
        this.f24022H.onNext(Boolean.TRUE);
        this.f24023I = new ArrayList();
        bnl0.m105524M(this.f24042q, false);
        bnl0.m105524M(this.f24037l, false);
        bnl0.m105524M(this.f24041p, false);
        bnl0.m105524M(this.f24033h, true);
        m39785n();
    }

    /* JADX INFO: renamed from: v */
    public void m39791v() {
        this.f24023I = new ArrayList();
        bnl0.m105524M(this.f24042q, false);
        bnl0.m105524M(this.f24033h, false);
        bnl0.m105524M(this.f24037l, false);
        bnl0.m105524M(this.f24041p, true);
        m39774B("suggest_empty");
        i4g0.m138526x("e_marriage_recommend_empty", "p_marriage_home");
    }

    /* JADX INFO: renamed from: w */
    public void m39792w() {
        this.f24023I = new ArrayList();
        bnl0.m105524M(this.f24042q, false);
        bnl0.m105524M(this.f24033h, false);
        bnl0.m105524M(this.f24037l, false);
        bnl0.m105524M(this.f24041p, true);
        m39774B("suggest_end");
        i4g0.m138526x("e_marriage_recommend_over", "p_marriage_home");
    }

    /* JADX INFO: renamed from: x */
    public final void m39793x() {
        this.f24050y.setText(gra.m131749t0());
    }

    /* JADX INFO: renamed from: y */
    public void m39794y(int i) {
        VText vText = this.f24032g;
        if (i <= 0) {
            bnl0.m105524M(vText, false);
        } else {
            bnl0.m105524M(vText, true);
            this.f24032g.setText(i < 100 ? String.valueOf(i) : "99+");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m39795z() {
        this.f24020F.m39764g();
    }
}
