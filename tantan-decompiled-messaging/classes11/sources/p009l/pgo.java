package p009l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.google.android.material.appbar.AppBarLayout;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p000p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p000p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p000p1.mobile.putong.core.newui.view.RadarRipple;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.User;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.b3c0;
import l.bs5;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.oey;
import l.qgo;
import l.qib0;
import l.rgo;
import l.s7m;
import l.t100;
import l.ura;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.xma;
import l.z0c0;
import rx.c;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;
import v.VText_NoTopPadding;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pgo implements s7m<ufo> {

    /* JADX INFO: renamed from: A */
    public oii f18539A;

    /* JADX INFO: renamed from: C */
    public teo f18541C;

    /* JADX INFO: renamed from: D */
    public Animator f18542D;

    /* JADX INFO: renamed from: H */
    public List<zii> f18546H;

    /* JADX INFO: renamed from: I */
    public meo f18547I;

    /* JADX INFO: renamed from: a */
    public VFrame f18548a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f18549b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f18550c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f18551d;

    /* JADX INFO: renamed from: e */
    public CoordinatorLayout f18552e;

    /* JADX INFO: renamed from: f */
    public AppBarLayout f18553f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f18554g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f18555h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f18556i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f18557j;

    /* JADX INFO: renamed from: k */
    public VImage f18558k;

    /* JADX INFO: renamed from: l */
    public VText f18559l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f18560m;

    /* JADX INFO: renamed from: n */
    public Guideline f18561n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f18562o;

    /* JADX INFO: renamed from: p */
    public RadarRipple f18563p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f18564q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f18565r;

    /* JADX INFO: renamed from: s */
    public VText_NoTopPadding f18566s;

    /* JADX INFO: renamed from: t */
    public BoostViewContainer f18567t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f18568u;

    /* JADX INFO: renamed from: v */
    public VText_NoTopPadding f18569v;

    /* JADX INFO: renamed from: w */
    public SceneView f18570w;

    /* JADX INFO: renamed from: x */
    public final IntlMeetLikersFrag f18571x;

    /* JADX INFO: renamed from: y */
    public ufo f18572y;

    /* JADX INFO: renamed from: z */
    public heo f18573z;

    /* JADX INFO: renamed from: B */
    public final bs5 f18540B = new bs5();

    /* JADX INFO: renamed from: E */
    public boolean f18543E = false;

    /* JADX INFO: renamed from: F */
    public boolean f18544F = false;

    /* JADX INFO: renamed from: G */
    public int f18545G = 0;

    /* JADX INFO: renamed from: l.pgo$a */
    public class C1107a extends GridLayoutManager.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f18574a;

        public C1107a(GridLayoutManager gridLayoutManager) {
            this.f18574a = gridLayoutManager;
        }

        /* JADX INFO: renamed from: f */
        public int m20260f(int i) {
            int itemViewType = pgo.this.f18573z.getItemViewType(i);
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f18574a.m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.pgo$b */
    public class C1108b implements bgo.InterfaceC0780a {
        public C1108b() {
        }

        @Override // p009l.bgo.InterfaceC0780a
        /* JADX INFO: renamed from: a */
        public void mo11994a(View view, User user, boolean z, boolean z2, boolean z3) {
            pgo.this.m20225Q(view, user, z, z3);
        }

        @Override // p009l.bgo.InterfaceC0780a
        /* JADX INFO: renamed from: n */
        public boolean mo11995n() {
            return xma.h4();
        }

        @Override // p009l.bgo.InterfaceC0780a
        /* JADX INFO: renamed from: o */
        public void mo11996o(boolean z) {
            if (pgo.this.f18556i.getAdapter() != null) {
                pgo.this.f18556i.getAdapter().notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: l.pgo$c */
    public class C1109c extends RecyclerView.t {
        public C1109c() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            pgo pgoVar = pgo.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            pgoVar.f18543E = z;
            pgo.this.f18545G = 0;
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (pgo.this.f18543E && !pgo.this.f18544F && xma.h4()) {
                pgo.this.f18545G += i2;
                if (pgo.this.f18545G > t100.d(100.0f)) {
                    pgo.this.m20223O();
                }
            }
        }
    }

    public pgo(IntlMeetLikersFrag intlMeetLikersFrag) {
        this.f18571x = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m20186I(List<etl> list) {
        if (vwb.J(list)) {
            return false;
        }
        for (etl etlVar : list) {
            if ((etlVar instanceof cgo) || (etlVar instanceof oco) || (etlVar instanceof afo)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    private void m20187U() {
        if (m20218J().m3426R4()) {
            return;
        }
        this.f18550c.setLeftIconAsBack(this.f18571x.act());
        this.f18550c.setLeftIconResource(b3c0.b);
        this.f18550c.setRightIconClip(false);
        View viewM20211B = m20211B(LayoutInflater.from(this.f18571x.act()), this.f18550c.getRightIconContainer());
        m20259z(viewM20211B);
        this.f18550c.z(new View[]{viewM20211B});
        xdl0.E0(this.f18549b.getBoostButton(), new View.OnClickListener() { // from class: l.dgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11832a.m20236d0(view);
            }
        });
        xdl0.M(this.f18550c, true);
        xdl0.M(this.f18548a, false);
    }

    /* JADX INFO: renamed from: X */
    private void m20188X() {
        this.f18573z = new heo(this.f18572y);
        this.f18556i.addItemDecoration(new abk(t100.h, 2));
        GridLayoutManager layoutManager = this.f18556i.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.v(new C1107a(layoutManager));
        }
        this.f18556i.setAdapter(this.f18573z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m20191c(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    private void m20202p0() {
        meo meoVar = this.f18547I;
        if (meoVar != null) {
            meoVar.m18440o();
        }
    }

    /* JADX INFO: renamed from: A */
    public View m20210A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qgo.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m20211B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rgo.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C */
    public final void m20212C() {
        if (!ura.e().d().Oq()) {
            xdl0.f0(this.f18556i, t100.j);
        }
        xdl0.X(this.f18554g, m20218J().m3426R4() ? t100.j : t100.g);
    }

    /* JADX INFO: renamed from: C0 */
    public Context m20213C0() {
        return this.f18571x.act();
    }

    /* JADX INFO: renamed from: E */
    public void m20214E() {
        if (this.f18547I != null) {
            return;
        }
        meo meoVar = new meo(this.f18571x);
        this.f18547I = meoVar;
        meoVar.m18432g(this.f18551d);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m20242i1(ufo ufoVar) {
        this.f18572y = ufoVar;
    }

    /* JADX INFO: renamed from: G */
    public void m20216G(boolean z) {
        this.f18541C.m22507t(z, this.f18571x.act().pageId());
    }

    /* JADX INFO: renamed from: H */
    public void m20217H() {
        this.f18541C.m22495h();
    }

    /* JADX INFO: renamed from: J */
    public IntlMeetLikersFrag m20218J() {
        return this.f18571x;
    }

    /* JADX INFO: renamed from: K */
    public heo m20219K() {
        return this.f18573z;
    }

    /* JADX INFO: renamed from: L */
    public final void m20220L(IntlMeetFakeTurboItem intlMeetFakeTurboItem) {
        this.f18573z.notifyDataSetChanged();
        intlMeetFakeTurboItem.m3448l0(this.f18571x.act());
    }

    /* JADX INFO: renamed from: M */
    public final void m20221M(User user, boolean z) {
        m20255v0(user);
        if (ura.e().d().Oq()) {
            yfo.m25366r(((DbObject) user).id, z, ygo.m25370a(((DbObject) user).id) ? "superlike_tag" : null, ygo.m25372c(user));
        } else {
            yfo.m25366r(((DbObject) user).id, z, null, null);
        }
        this.f18573z.notifyDataSetChanged();
        boolean zH3 = CoreModule.c.p0.h3();
        ufo ufoVar = this.f18572y;
        if (zH3) {
            ufoVar.m22843R0("p_intl_meet_view,e_intl_meet_see_users,click", null);
        } else {
            ufoVar.m22844S0("p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m20222N(User user, boolean z, boolean z2) {
        if (ura.e().d().Oq()) {
            yfo.m25366r(((DbObject) user).id, z, ygo.m25370a(((DbObject) user).id) ? "superlike_tag" : null, ygo.m25372c(user));
        } else {
            yfo.m25366r(((DbObject) user).id, z, null, null);
        }
        this.f18572y.m22831E(user, z, z2);
    }

    /* JADX INFO: renamed from: O */
    public final void m20223O() {
        this.f18544F = true;
        e51.F(this.f18571x.act(), new Runnable() { // from class: l.ngo
            @Override // java.lang.Runnable
            public final void run() {
                this.f17451a.m20232Z();
            }
        });
        yfo.m25363o();
        boolean zH3 = CoreModule.c.p0.h3();
        ufo ufoVar = this.f18572y;
        if (zH3) {
            ufoVar.m22843R0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new e30() { // from class: l.ogo
                public final void call(Object obj) {
                    this.f18033a.m20233a0((Boolean) obj);
                }
            });
        } else {
            ufoVar.m22845U0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new d30() { // from class: l.ego
                public final void call() {
                    this.f12557a.m20253t0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m20224P() {
        if (xdl0.O0(this.f18567t)) {
            yfo.m25352d(true, !CoreModule.P().a().qt());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m20225Q(View view, User user, boolean z, boolean z2) {
        if ((view instanceof IntlMeetLikersItemView) && NullChecker.a(user)) {
            m20222N(user, z, z2);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            m20220L((IntlMeetFakeTurboItem) view);
        } else if (view instanceof IntlMeetFakeLikersItem) {
            m20221M(user, z);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m20226R() {
        this.f18541C = new teo(this, this.f18571x.act(), this.f18567t, this.f18549b, this.f18569v, this.f18568u, this.f18570w, this.f18552e, (ViewGroup) this.f18556i.getRootView(), this.f18548a);
        this.f18567t.setFromCallback(new v9j() { // from class: l.mgo
            public final Object call() {
                return this.f16910a.m20234b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m20227S() {
        boolean zOq = ura.e().d().Oq();
        FrameLayout frameLayout = this.f18554g;
        if (!zOq) {
            xdl0.M(frameLayout, false);
            return;
        }
        xdl0.M(frameLayout, true);
        if (this.f18546H == null) {
            this.f18546H = wii.m24223a();
        }
        oii oiiVar = new oii();
        this.f18539A = oiiVar;
        oiiVar.m19806I(this.f18546H);
        this.f18539A.m19807J(new oii.InterfaceC1079a() { // from class: l.ggo
            @Override // p009l.oii.InterfaceC1079a
            /* JADX INFO: renamed from: a */
            public final void mo14999a(zii ziiVar, int i) {
                this.f13536a.m20235c0(ziiVar, i);
            }
        });
        this.f18555h.setAdapter(this.f18539A);
        yfo.m25353e(true, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m20228T() {
        new k(new bgo(new C1108b())).g(this.f18556i);
    }

    /* JADX INFO: renamed from: V */
    public final void m20229V() {
        this.f18566s.setText(this.f18571x.act().getString(R.string.g1));
        boolean zH3 = CoreModule.c.p0.h3();
        VText_NoTopPadding vText_NoTopPadding = this.f18566s;
        if (!zH3) {
            vText_NoTopPadding.setBackgroundResource(b3c0.P);
            xdl0.E0(this.f18566s, new View.OnClickListener() { // from class: l.igo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14622a.m20238f0(view);
                }
            });
        } else {
            vText_NoTopPadding.setBackgroundResource(b3c0.Q);
            this.f18566s.setTextColor(Color.parseColor("#000000"));
            xdl0.E0(this.f18566s, new View.OnClickListener() { // from class: l.hgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14069a.m20237e0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m20230W() {
        qib0.G.L0(this.f18564q, CoreModule.c.e0.p9().fp().profileSmall().formatted());
        this.f18563p.setRadarColor(App.e.getColor(z0c0.d));
        Animator animatorB = oey.b(this.f18563p, this.f18564q);
        this.f18542D = animatorB;
        animatorB.start();
    }

    /* JADX INFO: renamed from: Y */
    public final void m20231Y() {
        this.f18556i.addOnScrollListener(new C1109c());
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m20232Z() {
        this.f18556i.stopScroll();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m20233a0(Boolean bool) {
        m20253t0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ String m20234b0() {
        if (m20218J().m3426R4()) {
            return "p_intl_meet_view,e_boost_button,click";
        }
        return "tabMessage".equals((act() == null || act().getIntent() == null) ? null : act().getIntent().getStringExtra("from")) ? "p_intl_message_plm,e_boost_button,click" : "p_intl_plm,e_boost_button,click";
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m20235c0(zii ziiVar, int i) {
        yfo.m25353e(false, ziiVar.f23696a);
        if (i == 0 || !xma.h4()) {
            if (TextUtils.equals(this.f18572y.m22858u0(), ziiVar.f23696a)) {
                return;
            }
            m20244k0(i);
        } else {
            boolean zH3 = CoreModule.c.p0.h3();
            ufo ufoVar = this.f18572y;
            if (zH3) {
                ufoVar.m22843R0(m20218J().m3426R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click", null);
            } else {
                ufoVar.m22844S0(m20218J().m3426R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m20236d0(View view) {
        yfo.m25357i(this.f18571x.act().pageId());
        ura.e().d().Hb(this.f18571x.act(), false, "p_intl_plm,e_intl_plm_turbo_button,click", (d30) null);
    }

    public void destroy() {
        Runnable runnable;
        meo meoVar = this.f18547I;
        if (meoVar != null) {
            meoVar.m18434i();
            this.f18547I = null;
        }
        mkd0.z(this.f18540B);
        m20258y0();
        teo teoVar = this.f18541C;
        if (teoVar == null || (runnable = teoVar.f20649k) == null) {
            return;
        }
        e51.J(runnable);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m20237e0(View view) {
        yfo.m25365q();
        this.f18572y.m22843R0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click", null);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m20238f0(View view) {
        yfo.m25365q();
        this.f18572y.m22844S0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m20239g0() {
        this.f18573z.m15600R();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m20240h0(int i, View view) {
        if (NullChecker.a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            ((DbObject) userNew_).id = "intlSeeListAd";
            this.f18573z.m15592J(new kco(userNew_), i, view);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m20241i0() {
        this.f18556i.smoothScrollToPosition(0);
        this.f18544F = false;
        this.f18545G = 0;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m20210A(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m20243j0(ArrayList<etl> arrayList) {
        if (vwb.J(arrayList)) {
            return;
        }
        final int i = arrayList.get(0) instanceof afo ? 5 : 3;
        if (NullChecker.a(this.f18573z.f14023f)) {
            arrayList.add(i, this.f18573z.f14023f);
            return;
        }
        c cVarX8 = CoreModule.l.a().x8(this.f18571x.act(), new d30() { // from class: l.jgo
            public final void call() {
                this.f15116a.m20239g0();
            }
        });
        if (NullChecker.a(cVarX8)) {
            this.f18540B.a(cVarX8.subscribe(mkd0.H(new e30() { // from class: l.kgo
                public final void call(Object obj) {
                    this.f15667a.m20240h0(i, (View) obj);
                }
            }, new e30() { // from class: l.lgo
                public final void call(Object obj) {
                    pgo.m20191c((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m20244k0(int i) {
        this.f18539A.m19808K(i);
        this.f18572y.m22841P0(this.f18546H.get(i).f23696a);
    }

    /* JADX INFO: renamed from: m0 */
    public void m20246m0() {
        meo meoVar = this.f18547I;
        if (meoVar != null) {
            meoVar.m18438m();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m20247n0(boolean z) {
        if (z) {
            m20254u0();
        } else {
            m20248o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m20248o0() {
        Animator animator = this.f18542D;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f18542D.pause();
    }

    /* JADX INFO: renamed from: q0 */
    public void m20249q0(List<etl> list, boolean z) {
        m20258y0();
        heo heoVar = this.f18573z;
        if (heoVar != null) {
            boolean zM15602T = heoVar.m15602T(list, z);
            if (z && zM15602T) {
                this.f18556i.scrollToPosition(0);
                this.f18553f.setExpanded(true, true);
            }
        }
        boolean zM20186I = m20186I(list);
        if (vwb.J(list)) {
            m20256w0(false);
            AppBarLayout appBarLayout = this.f18553f;
            if (appBarLayout != null) {
                appBarLayout.setExpanded(true, true);
            }
            meo meoVar = this.f18547I;
            if (meoVar != null) {
                meoVar.m18441p(false);
            }
            boolean zOq = ura.e().d().Oq();
            LinearLayout linearLayout = this.f18557j;
            if (zOq) {
                xdl0.M(linearLayout, false);
                xdl0.M(this.f18560m, true);
                m20230W();
            } else {
                xdl0.M(linearLayout, true);
                xdl0.M(this.f18560m, false);
            }
            yfo.m25361m();
        } else {
            meo meoVar2 = this.f18547I;
            if (meoVar2 != null) {
                meoVar2.m18441p(zM20186I);
            }
            xdl0.M(this.f18557j, false);
            xdl0.M(this.f18560m, false);
            m20256w0(true);
        }
        m20202p0();
    }

    /* JADX INFO: renamed from: r */
    public void m20250r() {
        m20187U();
        m20227S();
        m20188X();
        if (!IntlCountryCodeController.v()) {
            m20228T();
        }
        m20231Y();
        m20229V();
        m20226R();
        m20212C();
        m20214E();
    }

    /* JADX INFO: renamed from: r0 */
    public void m20251r0(boolean z) {
        xdl0.M(this.f18566s, !z);
        teo teoVar = this.f18541C;
        if (teoVar != null) {
            if (z) {
                teoVar.m22498k();
            } else {
                teoVar.m22494g(false);
                this.f18541C.m22497j();
            }
            this.f18541C.m22509v(z);
            this.f18541C.m22508u(z);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m20252s0(int i) {
        String string;
        if (i <= 0) {
            string = App.e.getString(R.string.Y0);
        } else {
            string = App.e.getString(R.string.X0, i > 99 ? "99+" : String.valueOf(i));
        }
        this.f18550c.setTitle(string);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m20253t0() {
        e51.F(this.f18571x.act(), new Runnable() { // from class: l.fgo
            @Override // java.lang.Runnable
            public final void run() {
                this.f12993a.m20241i0();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m20254u0() {
        Animator animator = this.f18542D;
        if (animator != null && animator.isPaused() && this.f18560m.getVisibility() == 0) {
            this.f18542D.resume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m20255v0(User user) {
        if (ura.e().d().Oq()) {
            yfo.m25360l(ygo.m25370a(((DbObject) user).id) ? "superlike_tag" : null, ygo.m25372c(user));
        } else {
            yfo.m25360l(null, null);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m20256w0(boolean z) {
        FrameLayout frameLayout = this.f18554g;
        if (frameLayout == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = (AppBarLayout.LayoutParams) frameLayout.getLayoutParams();
        if (z) {
            layoutParams.setScrollFlags(17);
        } else {
            layoutParams.setScrollFlags(0);
        }
        this.f18554g.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: x0 */
    public void m20257x0(int i) {
        this.f18541C.m22506s(i);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m20258y0() {
        Animator animator = this.f18542D;
        if (animator != null) {
            animator.cancel();
            this.f18542D = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m20259z(View view) {
        rgo.a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m20245l0(Boolean bool) {
    }
}
