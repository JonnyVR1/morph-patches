package com.p046p1.mobile.putong.core.newui.home.marrymode;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.HomeErrorNetView;
import com.p046p1.mobile.putong.core.p053ui.RadarRipple;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VFrame_Shadow;
import p147v.VFrame_Squared;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.cwf0;
import p149l.d30;
import p149l.g1x;
import p149l.h1x;
import p149l.i0e;
import p149l.j760;
import p149l.l9b;
import p149l.o0x;
import p149l.osi0;
import p149l.roj0;
import p149l.s7m;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.xdl0;
import p149l.xij0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a */
/* JADX INFO: loaded from: classes11.dex */
public class C8030a implements s7m<g1x> {

    /* JADX INFO: renamed from: A */
    public g1x f23273A;

    /* JADX INFO: renamed from: B */
    public Act f23274B;

    /* JADX INFO: renamed from: E */
    public MarrModeProfileCardView f23277E;

    /* JADX INFO: renamed from: F */
    public MarrModeProfileCardView f23278F;

    /* JADX INFO: renamed from: G */
    public Animator f23279G;

    /* JADX INFO: renamed from: a */
    public VLinear f23284a;

    /* JADX INFO: renamed from: b */
    public VFrame f23285b;

    /* JADX INFO: renamed from: c */
    public VFrame f23286c;

    /* JADX INFO: renamed from: d */
    public View f23287d;

    /* JADX INFO: renamed from: e */
    public VFrame f23288e;

    /* JADX INFO: renamed from: f */
    public VImage f23289f;

    /* JADX INFO: renamed from: g */
    public VText f23290g;

    /* JADX INFO: renamed from: h */
    public RelativeLayout f23291h;

    /* JADX INFO: renamed from: i */
    public VFrame_Squared f23292i;

    /* JADX INFO: renamed from: j */
    public RadarRipple f23293j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f23294k;

    /* JADX INFO: renamed from: l */
    public HomeErrorNetView f23295l;

    /* JADX INFO: renamed from: m */
    public VImage f23296m;

    /* JADX INFO: renamed from: n */
    public VText f23297n;

    /* JADX INFO: renamed from: o */
    public VButton f23298o;

    /* JADX INFO: renamed from: p */
    public MarryModeEmptyView f23299p;

    /* JADX INFO: renamed from: q */
    public FrameLayout f23300q;

    /* JADX INFO: renamed from: r */
    public MarrModeProfileCardView f23301r;

    /* JADX INFO: renamed from: s */
    public MarrModeProfileCardView f23302s;

    /* JADX INFO: renamed from: t */
    public VFrame_Shadow f23303t;

    /* JADX INFO: renamed from: u */
    public VLinear f23304u;

    /* JADX INFO: renamed from: v */
    public VText f23305v;

    /* JADX INFO: renamed from: w */
    public VFrame_Shadow f23306w;

    /* JADX INFO: renamed from: x */
    public VLinear f23307x;

    /* JADX INFO: renamed from: y */
    public VText f23308y;

    /* JADX INFO: renamed from: z */
    public MarryModeTabFrag f23309z;

    /* JADX INFO: renamed from: C */
    public boolean f23275C = false;

    /* JADX INFO: renamed from: D */
    public boolean f23276D = false;

    /* JADX INFO: renamed from: H */
    public C22392a<Boolean> f23280H = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: I */
    public List<User> f23281I = new ArrayList();

    /* JADX INFO: renamed from: J */
    public int f23282J = 0;

    /* JADX INFO: renamed from: K */
    public cwf0 f23283K = i0e.m133794c("p_marriage_profile", C8030a.class.getName());

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$a */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9.isBanedOrInactivated() || userM169527p9.isFakeUser() || userM169527p9.isJailed() || userM169527p9.isSwipeJailed()) {
                osi0.m165783g("账号状态异常");
                return;
            }
            C8030a c8030a = C8030a.this;
            if (c8030a.f23275C || c8030a.f23276D) {
                return;
            }
            if (c8030a.f23282J < c8030a.f23281I.size()) {
                C8030a c8030a2 = C8030a.this;
                User user = c8030a2.f23281I.get(c8030a2.f23282J);
                boolean zM124117E0 = C8030a.this.f23273A.m124117E0();
                C8030a c8030a3 = C8030a.this;
                if (zM124117E0) {
                    c8030a3.f23273A.m124127S0();
                    return;
                } else {
                    c8030a3.f23273A.m124118F0(user);
                    zvf0.m220399u("e_marriage_next", "p_marriage_home", new j760("other_user_id", user.f56011id));
                }
            }
            C8030a.this.m38770A(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b */
    public class b implements View.OnClickListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$b$a */
        public class a implements d30 {
            public a() {
            }

            @Override // p149l.d30
            public void call() {
                C8030a.this.m38770A(true);
            }
        }

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (userM169527p9.isBanedOrInactivated() || userM169527p9.isFakeUser() || userM169527p9.isJailed() || userM169527p9.isSwipeJailed()) {
                osi0.m165783g("账号状态异常");
                return;
            }
            C8030a c8030a = C8030a.this;
            if (c8030a.f23282J < c8030a.f23281I.size()) {
                C8030a c8030a2 = C8030a.this;
                User user = c8030a2.f23281I.get(c8030a2.f23282J);
                if (C8030a.this.f23273A.m124117E0()) {
                    C8030a.this.f23273A.m124127S0();
                } else {
                    zvf0.m220399u("e_marriage_chat", "p_marriage_home", new j760("other_user_id", user.f56011id));
                    C8030a.this.f23273A.m124125Q0(user, new a());
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
            C8030a.this.f23273A.m124119G0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$d */
    public class d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f23314a;

        public d(String str) {
            this.f23314a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_marriage_event_home_entrance", "p_marriage_home", new j760("red_dot_state", this.f23314a));
            xdl0.m208344M(C8030a.this.f23287d, false);
            C8030a.this.f23273A.m124120H0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$e */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C8030a.this.f23273A.m124121I0();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$f */
    public class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C8030a c8030a = C8030a.this;
            c8030a.f23275C = false;
            if (c8030a.f23276D) {
                return;
            }
            c8030a.m38774d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C8030a.this.f23275C = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$g */
    public class g implements Animation.AnimationListener {
        public g() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C8030a c8030a = C8030a.this;
            c8030a.f23276D = false;
            if (c8030a.f23275C) {
                return;
            }
            c8030a.m38774d();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            C8030a.this.f23276D = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.marrymode.a$h */
    public class h implements MarrModeProfileCardView.InterfaceC8027a {
        public h() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC8027a
        /* JADX INFO: renamed from: a */
        public void mo38762a() {
            C8030a.this.f23273A.m124127S0();
        }

        @Override // com.p046p1.mobile.putong.core.newui.home.marrymode.MarrModeProfileCardView.InterfaceC8027a
        /* JADX INFO: renamed from: b */
        public boolean mo38763b() {
            return !xma.m210044G3();
        }
    }

    public C8030a(Act act, MarryModeTabFrag marryModeTabFrag) {
        this.f23309z = marryModeTabFrag;
        this.f23274B = act;
    }

    /* JADX INFO: renamed from: A */
    public void m38770A(boolean z) {
        if (xdl0.m208349O0(this.f23278F)) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, z ? 90.0f : -90.0f, 1, 0.5f, 1, 2.0f);
            rotateAnimation.setDuration(1000L);
            rotateAnimation.setAnimationListener(new f());
            this.f23278F.clearAnimation();
            this.f23278F.startAnimation(rotateAnimation);
            if (this.f23282J + 1 >= this.f23281I.size()) {
                xdl0.m208344M(this.f23303t, false);
                xdl0.m208344M(this.f23306w, false);
            }
        }
        if (xdl0.m208349O0(this.f23277E)) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.9f, 1.0f, 0.9f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(1000L);
            scaleAnimation.setAnimationListener(new g());
            this.f23277E.clearAnimation();
            this.f23277E.startAnimation(scaleAnimation);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m38771B(String str) {
        if (!xdl0.m208349O0(this.f23299p) || xdl0.m208349O0(this.f23300q)) {
            return;
        }
        this.f23299p.m38766c(str);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f23274B;
    }

    /* JADX INFO: renamed from: b */
    public View m38772b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return h1x.m129087b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(g1x g1xVar) {
        this.f23273A = g1xVar;
    }

    /* JADX INFO: renamed from: d */
    public final void m38774d() {
        i0e.m133796e(this.f23283K);
        this.f23278F.m44329c();
        this.f23277E.bringToFront();
        MarrModeProfileCardView marrModeProfileCardView = this.f23278F;
        this.f23278F = this.f23277E;
        this.f23277E = marrModeProfileCardView;
        o0x.m162187A(this.f23281I.get(this.f23282J).f56011id);
        int i = this.f23282J + 1;
        this.f23282J = i;
        if (i >= this.f23281I.size()) {
            CoreModule.f17545c.f19663m0.f19406e0.onNext(roj0.f160388a);
            return;
        }
        User user = this.f23281I.get(this.f23282J);
        this.f23273A.m124126R0(user);
        this.f23283K.m109040p(new j760("other_user_id", user.f56011id), new j760("is_myself", Boolean.FALSE), new j760("in_marriage_home", Boolean.TRUE));
        i0e.m133797f(this.f23283K);
        if (this.f23282J + 1 < this.f23281I.size()) {
            User user2 = this.f23281I.get(this.f23282J + 1);
            o0x.m162217z(user2.media(0));
            this.f23277E.setItemData(user2);
        }
        int i2 = this.f23282J;
        int size = this.f23281I.size() - 1;
        MarrModeProfileCardView marrModeProfileCardView2 = this.f23277E;
        if (i2 == size) {
            xdl0.m208344M(marrModeProfileCardView2, false);
        } else {
            xdl0.m208344M(marrModeProfileCardView2, true);
        }
        m38792z();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m38775e() {
        this.f23299p.m38764a();
    }

    /* JADX INFO: renamed from: f */
    public View m38776f() {
        return this.f23300q;
    }

    /* JADX INFO: renamed from: i */
    public RelativeLayout m38777i() {
        return this.f23291h;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM38772b = m38772b(layoutInflater, viewGroup);
        String strM162198g = o0x.m162198g();
        if (!TextUtils.isEmpty(strM162198g)) {
            int iM186890d = t100.m186890d(20.0f);
            int color = Color.parseColor(strM162198g);
            int color2 = Color.parseColor("#FFFFFF");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(color2);
            gradientDrawable.setCornerRadius(iM186890d);
            gradientDrawable.setStroke(2, color);
            this.f23302s.setBackground(gradientDrawable);
            this.f23301r.setBackground(gradientDrawable);
        }
        return viewM38772b;
    }

    /* JADX INFO: renamed from: j */
    public VDraweeView m38778j() {
        return this.f23294k;
    }

    /* JADX INFO: renamed from: k */
    public RadarRipple m38779k() {
        return this.f23293j;
    }

    /* JADX INFO: renamed from: l */
    public final void m38780l(MarrModeProfileCardView marrModeProfileCardView) {
        if (o0x.m162205n()) {
            marrModeProfileCardView.m38760f(new h());
        }
    }

    /* JADX INFO: renamed from: m */
    public void m38781m(boolean z) {
        m38779k().setRadarColor(App.f15369e.getResources().getColor(w0c0.f183773I));
        this.f23279G = xij0.m209659b0(m38779k(), m38778j());
        xdl0.m208345M0(m38777i(), z);
        xdl0.m208345M0(m38776f(), !z);
    }

    /* JADX INFO: renamed from: n */
    public void m38782n() {
        if (this.f23280H.m221515e().booleanValue()) {
            this.f23279G.start();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m38783p() {
        this.f23279G.cancel();
    }

    /* JADX INFO: renamed from: q */
    public void m38784q(List<User> list) {
        this.f23281I = list;
        Animator animator = this.f23279G;
        if (animator != null) {
            animator.cancel();
        }
        if (vwb.m200296J(this.f23281I)) {
            m38789w();
            return;
        }
        this.f23282J = 0;
        MarrModeProfileCardView marrModeProfileCardView = this.f23302s;
        this.f23278F = marrModeProfileCardView;
        marrModeProfileCardView.bringToFront();
        xdl0.m208344M(this.f23278F, true);
        this.f23277E = this.f23301r;
        xdl0.m208344M(m38777i(), false);
        xdl0.m208344M(this.f23295l, false);
        xdl0.m208344M(this.f23299p, false);
        xdl0.m208344M(this.f23300q, true);
        xdl0.m208344M(this.f23303t, true);
        xdl0.m208344M(this.f23306w, true);
        User user = list.get(0);
        this.f23273A.m124126R0(user);
        m38790x();
        this.f23283K.m109040p(new j760("other_user_id", user.f56011id), new j760("is_myself", Boolean.FALSE), new j760("in_marriage_home", Boolean.TRUE));
        i0e.m133797f(this.f23283K);
        o0x.m162217z(user.media(0));
        this.f23278F.setItemData(user);
        if (list.size() > 1) {
            User user2 = list.get(1);
            o0x.m162217z(user2.media(0));
            this.f23277E.setItemData(user2);
            xdl0.m208344M(this.f23277E, true);
        } else {
            xdl0.m208344M(this.f23277E, false);
        }
        m38792z();
    }

    /* JADX INFO: renamed from: r */
    public void m38785r() {
        String str;
        xdl0.m208362Z(this.f23285b);
        MarrModeProfileCardView marrModeProfileCardView = this.f23302s;
        this.f23278F = marrModeProfileCardView;
        this.f23277E = this.f23301r;
        m38780l(marrModeProfileCardView);
        m38780l(this.f23301r);
        xdl0.m208329E0(this.f23303t, new a());
        xdl0.m208329E0(this.f23306w, new b());
        xdl0.m208329E0(this.f23295l, new c());
        if (upa.m194749f1() == null || !upa.m194749f1().activities) {
            xdl0.m208344M(this.f23286c, false);
        } else {
            xdl0.m208344M(this.f23286c, true);
            boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19639e0.f149448p4.get(), l9b.m149012U());
            View view = this.f23287d;
            if (zEquals) {
                xdl0.m208344M(view, false);
                str = BLiveOperationTitleShowType.off;
            } else {
                xdl0.m208344M(view, true);
                str = "on";
            }
            zvf0.m220402x("e_marriage_event_home_entrance", "p_marriage_home");
            xdl0.m208329E0(this.f23286c, new d(str));
        }
        xdl0.m208329E0(this.f23288e, new e());
    }

    /* JADX INFO: renamed from: s */
    public void m38786s() {
        this.f23281I = new ArrayList();
        xdl0.m208344M(this.f23300q, false);
        xdl0.m208344M(this.f23291h, false);
        xdl0.m208344M(this.f23295l, true);
        xdl0.m208344M(this.f23299p, false);
    }

    /* JADX INFO: renamed from: u */
    public void m38787u() {
        this.f23280H.onNext(Boolean.TRUE);
        this.f23281I = new ArrayList();
        xdl0.m208344M(this.f23300q, false);
        xdl0.m208344M(this.f23295l, false);
        xdl0.m208344M(this.f23299p, false);
        xdl0.m208344M(this.f23291h, true);
        m38782n();
    }

    /* JADX INFO: renamed from: v */
    public void m38788v() {
        this.f23281I = new ArrayList();
        xdl0.m208344M(this.f23300q, false);
        xdl0.m208344M(this.f23291h, false);
        xdl0.m208344M(this.f23295l, false);
        xdl0.m208344M(this.f23299p, true);
        m38771B("suggest_empty");
        zvf0.m220402x("e_marriage_recommend_empty", "p_marriage_home");
    }

    /* JADX INFO: renamed from: w */
    public void m38789w() {
        this.f23281I = new ArrayList();
        xdl0.m208344M(this.f23300q, false);
        xdl0.m208344M(this.f23291h, false);
        xdl0.m208344M(this.f23295l, false);
        xdl0.m208344M(this.f23299p, true);
        m38771B("suggest_end");
        zvf0.m220402x("e_marriage_recommend_over", "p_marriage_home");
    }

    /* JADX INFO: renamed from: x */
    public final void m38790x() {
        this.f23308y.setText(upa.m194818t0());
    }

    /* JADX INFO: renamed from: y */
    public void m38791y(int i) {
        VText vText = this.f23290g;
        if (i <= 0) {
            xdl0.m208344M(vText, false);
        } else {
            xdl0.m208344M(vText, true);
            this.f23290g.setText(i < 100 ? String.valueOf(i) : "99+");
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m38792z() {
        this.f23278F.m38761g();
    }
}
