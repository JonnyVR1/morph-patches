package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.FakeLikersFrag;
import com.p051p1.mobile.putong.core.p058ui.seepage.likers.IntlFakeTurboItem;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.view.header.PicksHeaderView;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p137rx.C22421c;
import p151v.VButton_FakeShadow;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class z1g implements iam<m1g> {

    /* JADX INFO: renamed from: a */
    public VFrame f202527a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f202528b;

    /* JADX INFO: renamed from: c */
    public VLinear f202529c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f202530d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f202531e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f202532f;

    /* JADX INFO: renamed from: g */
    public VImage f202533g;

    /* JADX INFO: renamed from: h */
    public VText f202534h;

    /* JADX INFO: renamed from: i */
    public VProgressBar f202535i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f202536j;

    /* JADX INFO: renamed from: k */
    public VButton_FakeShadow f202537k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f202538l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f202539m;

    /* JADX INFO: renamed from: n */
    public Guideline f202540n;

    /* JADX INFO: renamed from: o */
    public Guideline f202541o;

    /* JADX INFO: renamed from: p */
    public Guideline f202542p;

    /* JADX INFO: renamed from: q */
    public ImageView f202543q;

    /* JADX INFO: renamed from: r */
    public ImageView f202544r;

    /* JADX INFO: renamed from: s */
    public m1g f202545s;

    /* JADX INFO: renamed from: t */
    public PutongAct f202546t;

    /* JADX INFO: renamed from: u */
    public FakeLikersFrag f202547u;

    /* JADX INFO: renamed from: y */
    public boolean f202551y;

    /* JADX INFO: renamed from: z */
    public C0607k f202552z;

    /* JADX INFO: renamed from: v */
    public boolean f202548v = false;

    /* JADX INFO: renamed from: w */
    public boolean f202549w = false;

    /* JADX INFO: renamed from: x */
    public int f202550x = 0;

    /* JADX INFO: renamed from: A */
    public boolean f202523A = false;

    /* JADX INFO: renamed from: B */
    public kcg0 f202524B = null;

    /* JADX INFO: renamed from: C */
    public boolean f202525C = false;

    /* JADX INFO: renamed from: D */
    public boolean f202526D = false;

    /* JADX INFO: renamed from: l.z1g$a */
    public class C21742a extends GridLayoutManager.AbstractC0554c {
        public C21742a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            if (CoreModule.f18273l.m143405a().mo34532k() && i == 0) {
                return 2;
            }
            return (rs9.m182939h() && i == 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.z1g$b */
    public class C21743b extends RecyclerView.AbstractC0584t {
        public C21743b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m218341f() {
            z1g.this.f202526D = false;
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m218342i() {
            z1g.this.f202526D = false;
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m218343j() {
            z1g.this.f202536j.stopScroll();
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m218344k() {
            z1g.this.f202536j.smoothScrollToPosition(0);
            z1g.this.f202549w = false;
            z1g.this.f202550x = 0;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m218345l() {
            l51.m152886F(z1g.this.f202546t, new Runnable() { // from class: l.e2g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f91760a.m218344k();
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            z1g z1gVar = z1g.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            z1gVar.f202548v = z;
            if (!z1g.this.f202545s.m156666P0()) {
                z1g.this.f202549w = false;
            }
            z1g.this.f202550x = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            boolean zM182939h = rs9.m182939h();
            z1g z1gVar = z1g.this;
            if (zM182939h) {
                if (!z1gVar.f202525C && recyclerView.computeVerticalScrollOffset() > qa00.m175859d(600.0f)) {
                    z1g.this.f202525C = true;
                    z1g.this.f202526D = true;
                    z1g.this.f202545s.m156661I0(new x20() { // from class: l.a2g
                        @Override // p153l.x20
                        public final void call() {
                            this.f67986a.m218341f();
                        }
                    });
                    return;
                } else {
                    if (zrc0.m221154a(recyclerView) && zrc0.m221155b(recyclerView) && !z1g.this.f202526D) {
                        z1g.this.f202545s.m156661I0(new x20() { // from class: l.b2g
                            @Override // p153l.x20
                            public final void call() {
                                this.f74608a.m218342i();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if (!z1gVar.f202548v || z1g.this.f202549w) {
                return;
            }
            z1g.this.f202550x += i2;
            if (!z1g.this.f202545s.m156666P0() || z1g.this.f202550x <= qa00.m175859d(100.0f)) {
                return;
            }
            z1g.this.f202549w = true;
            l51.m152886F(z1g.this.f202546t, new Runnable() { // from class: l.c2g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79475a.m218343j();
                }
            });
            z1g.this.f202545s.m156664N0("p_intl_plm,swipe", new x20() { // from class: l.d2g
                @Override // p153l.x20
                public final void call() {
                    this.f84788a.m218345l();
                }
            });
        }
    }

    public z1g(FakeLikersFrag fakeLikersFrag) {
        this.f202547u = fakeLikersFrag;
        this.f202546t = (PutongAct) fakeLikersFrag.act();
    }

    /* JADX INFO: renamed from: K */
    private void m218290K() {
        sfj0.m185601h("e_boost_button", this.f202546t.pageId(), sfj0.C20032a.m185616i("is_privileged", !CoreModule.m30933P().m143405a().mo34492e2()));
        View viewM218318G = m218318G(LayoutInflater.from(this.f202546t), this.f202530d.getRightIconContainer());
        m218316E(viewM218318G);
        this.f202530d.m224835z(viewM218318G);
        this.f202528b.m44876a(new na3() { // from class: l.u1g
            @Override // p153l.na3
            /* JADX INFO: renamed from: a */
            public final void mo115522a(int i) {
                this.f177000a.m218324N(i);
            }
        });
        this.f202528b.getBoostButton().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.v1g
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f181972a.m218325O(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m218291S(View view) {
        this.f202545s.m156662J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m218292T(View view) {
        this.f202545s.m156662J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m218293U(View view) {
        if (!this.f202545s.m156666P0()) {
            this.f202545s.m156662J0();
        } else {
            i4g0.m138520r("e_intl_plm_button", "p_intl_plm");
            this.f202545s.m156663L0("p_intl_plm,e_intl_plm_button,click");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m218305n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m218308r() {
        this.f202530d.setLeftIconAsBack(this.f202546t);
        this.f202530d.setLeftIconResource(gbc0.f103261b);
        if (CoreModule.f18264c.f20414p0.m219060e3()) {
            this.f202538l.setBackgroundResource(gbc0.f103183Q);
            this.f202538l.setTextColor(Color.parseColor(Constants.BLACK));
            bnl0.m105524M(this.f202538l, true);
            bnl0.m105509E0(this.f202538l, new View.OnClickListener() { // from class: l.n1g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139756a.m218291S(view);
                }
            });
        } else if (this.f202545s.m156666P0()) {
            bnl0.m105524M(this.f202538l, true);
            if (this.f202545s.m156666P0()) {
                bnl0.m105515H0(this.f202538l, getAct().getResources().getString(R$string.f21335K));
            }
            bnl0.m105509E0(this.f202538l, new View.OnClickListener() { // from class: l.r1g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f160822a.m218293U(view);
                }
            });
        } else {
            bnl0.m105524M(this.f202537k, true);
            bnl0.m105509E0(this.f202537k, new View.OnClickListener() { // from class: l.q1g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f155189a.m218292T(view);
                }
            });
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f202546t, 2);
        gridLayoutManager.m3327v(new C21742a());
        this.f202536j.setLayoutManager(gridLayoutManager);
        this.f202536j.setAdapter(this.f202547u.m56143O4());
        this.f202536j.setOnScrollListener(new C21743b());
        this.f202547u.m56143O4().m133166U(new h0g.InterfaceC17363a() { // from class: l.s1g
            @Override // p153l.h0g.InterfaceC17363a
            /* JADX INFO: renamed from: a */
            public final void mo133168a(User user, int i) {
                this.f165788a.m218327Q(user, i);
            }
        });
        C0607k c0607k = new C0607k(new b0g(new b0g.InterfaceC15881a() { // from class: l.t1g
            @Override // p153l.b0g.InterfaceC15881a
            /* JADX INFO: renamed from: a */
            public final void mo101304a(View view, User user, int i, boolean z, int i2) {
                this.f171666a.m218328R(view, user, i, z, i2);
            }
        }));
        this.f202552z = c0607k;
        c0607k.m3751g(this.f202536j);
        if (rs9.m182939h()) {
            bnl0.m105540X(this.f202539m, qa00.f156302O);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202546t;
    }

    /* JADX INFO: renamed from: E */
    public final void m218316E(View view) {
        g2g.m128619a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public View m218317F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2g.m123613b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public View m218318G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g2g.m128620b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(m1g m1gVar) {
        this.f202545s = m1gVar;
    }

    /* JADX INFO: renamed from: I */
    public void m218320I(boolean z) {
        if (z && !bnl0.m105529O0(this.f202528b)) {
            sfj0.m185601h("e_intl_plm_turbo_button", this.f202546t.pageId(), new sfj0.C20032a[0]);
        }
        bnl0.m105591y(this.f202528b, z);
        bnl0.m105524M(this.f202528b, z);
    }

    /* JADX INFO: renamed from: J */
    public PicksHeaderView m218321J() {
        return (PicksHeaderView) this.f202536j.findViewById(ddc0.f87920z);
    }

    /* JADX INFO: renamed from: L */
    public final void m218322L() {
        View viewM218318G = m218318G(LayoutInflater.from(this.f202546t), this.f202530d.getRightIconContainer());
        m218316E(viewM218318G);
        this.f202530d.m224835z(viewM218318G);
        bnl0.m105524M(this.f202528b, false);
        bnl0.m105509E0(this.f202528b.getBoostButton(), new View.OnClickListener() { // from class: l.w1g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186813a.m218326P(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m218323M() {
        this.f202528b.m44882g(true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m218324N(int i) {
        if (i == 2) {
            CoreModule.m30933P().m143405a().mo34334Hc(this.f202546t, new x20() { // from class: l.p1g
                @Override // p153l.x20
                public final void call() {
                    this.f150150a.m218323M();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m218325O(View view) {
        if (CoreModule.f18264c.f20318J0.m156766F3()) {
            return true;
        }
        C4499d.m21895l().m21899k("boost_see_page_guide");
        this.f202528b.m44881f();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m218326P(View view) {
        sfj0.m185596c("e_intl_plm_turbo_button", this.f202546t.pageId(), new sfj0.C20032a[0]);
        gta.m132210e().m132214d().mo34698Hb(this.f202546t, false, "p_intl_plm,e_intl_plm_turbo_button,click", null);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m218327Q(User user, int i) {
        if (!this.f202545s.m156666P0()) {
            this.f202545s.m156660H0(user);
        } else {
            i4g0.m138520r("e_intl_plm_card", "p_intl_plm");
            this.f202545s.m156663L0("p_intl_plm,e_intl_plm_card,click");
        }
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m218328R(View view, User user, int i, boolean z, int i2) {
        this.f202547u.m56143O4().notifyDataSetChanged();
        if (this.f202545s.m156666P0()) {
            if (view instanceof IntlFakeTurboItem) {
                ((IntlFakeTurboItem) view).m56162n0(i2, this.f202546t);
                return;
            } else {
                i4g0.m138520r("e_intl_plm_card", "p_intl_plm");
                this.f202545s.m156663L0("p_intl_plm,e_intl_plm_card,swipe");
                return;
            }
        }
        if (i == 2 || i == 4 || !z) {
            return;
        }
        this.f202545s.m156660H0(user);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m218329V() {
        this.f202547u.m56143O4().m133158L(true);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m218330W(View view) {
        if (NullChecker.m82486a(this.f202547u) && NullChecker.m82486a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            userNew_.f56859id = "intlSeeListAd";
            this.f202547u.m56143O4().m133157K(userNew_, 3, view);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m218331X(List<User> list) {
        if (NullChecker.m82486a(this.f202524B)) {
            if (NullChecker.m82486a(this.f202547u.m56143O4().f107297l)) {
                list.add(3, this.f202547u.m56143O4().f107297l);
            }
        } else {
            C22421c<View> c22421cMo34306Dc = CoreModule.f18273l.m143405a().mo34306Dc(this.f202546t, new x20() { // from class: l.x1g
                @Override // p153l.x20
                public final void call() {
                    this.f192056a.m218329V();
                }
            });
            if (NullChecker.m82486a(c22421cMo34306Dc)) {
                this.f202524B = c22421cMo34306Dc.subscribe(psd0.m173597H(new y20() { // from class: l.y1g
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f197097a.m218330W((View) obj);
                    }
                }, new y20() { // from class: l.o1g
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        z1g.m218305n((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m218332Y(List<User> list) {
        if (!NullChecker.m82486a(list) || list.size() < 4) {
            m218320I(false);
        } else {
            m218320I(true);
            m218331X(list);
        }
        this.f202547u.m56143O4().m133167V(list);
        this.f202547u.m56143O4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Z */
    public void m218333Z(int i) {
        this.f202530d.setTitle(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m218334a0(CharSequence charSequence) {
        this.f202530d.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: b0 */
    public void m218335b0() {
        if (!this.f202551y && !this.f202523A) {
            this.f202551y = true;
            vie0.m201337d(getAct(), this.f202543q, this.f202544r, this.f202539m);
        }
        if (CoreModule.f18273l.m143405a().mo34443X6() || !NullChecker.m82486a(this.f202528b)) {
            return;
        }
        if (CoreModule.m30933P().m143405a().mo34589s8()) {
            CoreModule.f18273l.m143405a().mo34581ri();
        } else {
            this.f202528b.m44879d(this.f202527a);
        }
        CoreMemberModule.m37004F().m187693b().mo36980Qe(getAct(), this.f202528b);
    }

    @Override // p153l.iam
    public void destroy() {
        if (NullChecker.m82486a(this.f202547u)) {
            this.f202547u.m56143O4().m133158L(false);
        }
        if (NullChecker.m82486a(this.f202524B)) {
            psd0.m173633z(this.f202524B);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM218317F = m218317F(layoutInflater, viewGroup);
        m218308r();
        if (!this.f202545s.m156666P0()) {
            m218290K();
            return viewM218317F;
        }
        m218322L();
        bnl0.m105548c0(this.f202536j, qa00.m175859d(90.0f));
        return viewM218317F;
    }
}
