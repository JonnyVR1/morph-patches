package p149l;

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
import androidx.recyclerview.widget.C0605k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.appbar.AppBarLayout;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p046p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p046p1.mobile.putong.core.newui.view.RadarRipple;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p147v.VText_NoTopPadding;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class pgo implements s7m<ufo> {

    /* JADX INFO: renamed from: A */
    public oii f148753A;

    /* JADX INFO: renamed from: C */
    public teo f148755C;

    /* JADX INFO: renamed from: D */
    public Animator f148756D;

    /* JADX INFO: renamed from: H */
    public List<zii> f148760H;

    /* JADX INFO: renamed from: I */
    public meo f148761I;

    /* JADX INFO: renamed from: a */
    public VFrame f148762a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f148763b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f148764c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f148765d;

    /* JADX INFO: renamed from: e */
    public CoordinatorLayout f148766e;

    /* JADX INFO: renamed from: f */
    public AppBarLayout f148767f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f148768g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f148769h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f148770i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f148771j;

    /* JADX INFO: renamed from: k */
    public VImage f148772k;

    /* JADX INFO: renamed from: l */
    public VText f148773l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f148774m;

    /* JADX INFO: renamed from: n */
    public Guideline f148775n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f148776o;

    /* JADX INFO: renamed from: p */
    public RadarRipple f148777p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f148778q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f148779r;

    /* JADX INFO: renamed from: s */
    public VText_NoTopPadding f148780s;

    /* JADX INFO: renamed from: t */
    public BoostViewContainer f148781t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f148782u;

    /* JADX INFO: renamed from: v */
    public VText_NoTopPadding f148783v;

    /* JADX INFO: renamed from: w */
    public SceneView f148784w;

    /* JADX INFO: renamed from: x */
    public final IntlMeetLikersFrag f148785x;

    /* JADX INFO: renamed from: y */
    public ufo f148786y;

    /* JADX INFO: renamed from: z */
    public heo f148787z;

    /* JADX INFO: renamed from: B */
    public final bs5 f148754B = new bs5();

    /* JADX INFO: renamed from: E */
    public boolean f148757E = false;

    /* JADX INFO: renamed from: F */
    public boolean f148758F = false;

    /* JADX INFO: renamed from: G */
    public int f148759G = 0;

    /* JADX INFO: renamed from: l.pgo$a */
    public class C19205a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f148788a;

        public C19205a(GridLayoutManager gridLayoutManager) {
            this.f148788a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            int itemViewType = pgo.this.f148787z.getItemViewType(i);
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f148788a.m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.pgo$b */
    public class C19206b implements bgo.InterfaceC15856a {
        public C19206b() {
        }

        @Override // p149l.bgo.InterfaceC15856a
        /* JADX INFO: renamed from: a */
        public void mo101674a(View view, User user, boolean z, boolean z2, boolean z3) {
            pgo.this.m168857Q(view, user, z, z3);
        }

        @Override // p149l.bgo.InterfaceC15856a
        /* JADX INFO: renamed from: n */
        public boolean mo101675n() {
            return xma.m210077h4();
        }

        @Override // p149l.bgo.InterfaceC15856a
        /* JADX INFO: renamed from: o */
        public void mo101676o(boolean z) {
            if (pgo.this.f148770i.getAdapter() != null) {
                pgo.this.f148770i.getAdapter().notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: l.pgo$c */
    public class C19207c extends RecyclerView.AbstractC0582t {
        public C19207c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            pgo pgoVar = pgo.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            pgoVar.f148757E = z;
            pgo.this.f148759G = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (pgo.this.f148757E && !pgo.this.f148758F && xma.m210077h4()) {
                pgo.this.f148759G += i2;
                if (pgo.this.f148759G > t100.m186890d(100.0f)) {
                    pgo.this.m168855O();
                }
            }
        }
    }

    public pgo(IntlMeetLikersFrag intlMeetLikersFrag) {
        this.f148785x = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m168819I(List<etl> list) {
        if (vwb.m200296J(list)) {
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
    private void m168820U() {
        if (m168850J().m39381R4()) {
            return;
        }
        this.f148764c.setLeftIconAsBack(this.f148785x.act());
        this.f148764c.setLeftIconResource(b3c0.f73010b);
        this.f148764c.setRightIconClip(false);
        View viewM168844B = m168844B(LayoutInflater.from(this.f148785x.act()), this.f148764c.getRightIconContainer());
        m168890z(viewM168844B);
        this.f148764c.m223589z(viewM168844B);
        xdl0.m208329E0(this.f148763b.getBoostButton(), new View.OnClickListener() { // from class: l.dgo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86146a.m168868d0(view);
            }
        });
        xdl0.m208344M(this.f148764c, true);
        xdl0.m208344M(this.f148762a, false);
    }

    /* JADX INFO: renamed from: X */
    private void m168821X() {
        this.f148787z = new heo(this.f148786y);
        this.f148770i.addItemDecoration(new abk(t100.f167259h, 2));
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f148770i.getLayoutManager();
        if (gridLayoutManager != null) {
            gridLayoutManager.m3326v(new C19205a(gridLayoutManager));
        }
        this.f148770i.setAdapter(this.f148787z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m168824c(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    private void m168835p0() {
        meo meoVar = this.f148761I;
        if (meoVar != null) {
            meoVar.m154288o();
        }
    }

    /* JADX INFO: renamed from: A */
    public View m168843A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qgo.m174445b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m168844B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rgo.m179179b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C */
    public final void m168845C() {
        if (!ura.m195053e().m195057d().mo33735Oq()) {
            xdl0.m208374f0(this.f148770i, t100.f167261j);
        }
        xdl0.m208360X(this.f148768g, m168850J().m39381R4() ? t100.f167261j : t100.f167258g);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f148785x.act();
    }

    /* JADX INFO: renamed from: E */
    public void m168846E() {
        if (this.f148761I != null) {
            return;
        }
        meo meoVar = new meo(this.f148785x);
        this.f148761I = meoVar;
        meoVar.m154280g(this.f148765d);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ufo ufoVar) {
        this.f148786y = ufoVar;
    }

    /* JADX INFO: renamed from: G */
    public void m168848G(boolean z) {
        this.f148755C.m188554t(z, this.f148785x.act().pageId());
    }

    /* JADX INFO: renamed from: H */
    public void m168849H() {
        this.f148755C.m188542h();
    }

    /* JADX INFO: renamed from: J */
    public IntlMeetLikersFrag m168850J() {
        return this.f148785x;
    }

    /* JADX INFO: renamed from: K */
    public heo m168851K() {
        return this.f148787z;
    }

    /* JADX INFO: renamed from: L */
    public final void m168852L(IntlMeetFakeTurboItem intlMeetFakeTurboItem) {
        this.f148787z.notifyDataSetChanged();
        intlMeetFakeTurboItem.m39401l0(this.f148785x.act());
    }

    /* JADX INFO: renamed from: M */
    public final void m168853M(User user, boolean z) {
        m168886v0(user);
        if (ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214579r(user.f56011id, z, ygo.m214738a(user.f56011id) ? "superlike_tag" : null, ygo.m214740c(user));
        } else {
            yfo.m214579r(user.f56011id, z, null, null);
        }
        this.f148787z.notifyDataSetChanged();
        boolean zM173360h3 = CoreModule.f17545c.f19672p0.m173360h3();
        ufo ufoVar = this.f148786y;
        if (zM173360h3) {
            ufoVar.m193438R0("p_intl_meet_view,e_intl_meet_see_users,click", null);
        } else {
            ufoVar.m193439S0("p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m168854N(User user, boolean z, boolean z2) {
        if (ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214579r(user.f56011id, z, ygo.m214738a(user.f56011id) ? "superlike_tag" : null, ygo.m214740c(user));
        } else {
            yfo.m214579r(user.f56011id, z, null, null);
        }
        this.f148786y.m193426E(user, z, z2);
    }

    /* JADX INFO: renamed from: O */
    public final void m168855O() {
        this.f148758F = true;
        e51.m114741F(this.f148785x.act(), new Runnable() { // from class: l.ngo
            @Override // java.lang.Runnable
            public final void run() {
                this.f138891a.m168864Z();
            }
        });
        yfo.m214576o();
        boolean zM173360h3 = CoreModule.f17545c.f19672p0.m173360h3();
        ufo ufoVar = this.f148786y;
        if (zM173360h3) {
            ufoVar.m193438R0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new e30() { // from class: l.ogo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143886a.m168865a0((Boolean) obj);
                }
            });
        } else {
            ufoVar.m193440U0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new d30() { // from class: l.ego
                @Override // p149l.d30
                public final void call() {
                    this.f90966a.m168884t0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m168856P() {
        if (xdl0.m208349O0(this.f148781t)) {
            yfo.m214565d(true, !CoreModule.m29935P().m94651a().mo33573qt());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m168857Q(View view, User user, boolean z, boolean z2) {
        if ((view instanceof IntlMeetLikersItemView) && NullChecker.m81303a(user)) {
            m168854N(user, z, z2);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            m168852L((IntlMeetFakeTurboItem) view);
        } else if (view instanceof IntlMeetFakeLikersItem) {
            m168853M(user, z);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m168858R() {
        this.f148755C = new teo(this, this.f148785x.act(), this.f148781t, this.f148763b, this.f148783v, this.f148782u, this.f148784w, this.f148766e, (ViewGroup) this.f148770i.getRootView(), this.f148762a);
        this.f148781t.setFromCallback(new v9j() { // from class: l.mgo
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f133708a.m168866b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m168859S() {
        boolean zMo33735Oq = ura.m195053e().m195057d().mo33735Oq();
        FrameLayout frameLayout = this.f148768g;
        if (!zMo33735Oq) {
            xdl0.m208344M(frameLayout, false);
            return;
        }
        xdl0.m208344M(frameLayout, true);
        if (this.f148760H == null) {
            this.f148760H = wii.m203321a();
        }
        oii oiiVar = new oii();
        this.f148753A = oiiVar;
        oiiVar.m164517I(this.f148760H);
        this.f148753A.m164518J(new oii.InterfaceC18942a() { // from class: l.ggo
            @Override // p149l.oii.InterfaceC18942a
            /* JADX INFO: renamed from: a */
            public final void mo125997a(zii ziiVar, int i) {
                this.f102528a.m168867c0(ziiVar, i);
            }
        });
        this.f148769h.setAdapter(this.f148753A);
        yfo.m214566e(true, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m168860T() {
        new C0605k(new bgo(new C19206b())).m3750g(this.f148770i);
    }

    /* JADX INFO: renamed from: V */
    public final void m168861V() {
        this.f148780s.setText(this.f148785x.act().getString(R$string.f20647g1));
        boolean zM173360h3 = CoreModule.f17545c.f19672p0.m173360h3();
        VText_NoTopPadding vText_NoTopPadding = this.f148780s;
        if (!zM173360h3) {
            vText_NoTopPadding.setBackgroundResource(b3c0.f72925P);
            xdl0.m208329E0(this.f148780s, new View.OnClickListener() { // from class: l.igo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f113138a.m168870f0(view);
                }
            });
        } else {
            vText_NoTopPadding.setBackgroundResource(b3c0.f72932Q);
            this.f148780s.setTextColor(Color.parseColor(Constants.BLACK));
            xdl0.m208329E0(this.f148780s, new View.OnClickListener() { // from class: l.hgo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f107611a.m168869e0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m168862W() {
        qib0.f154691G.m102331L0(this.f148778q, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted());
        this.f148777p.setRadarColor(App.f15369e.getColor(z0c0.f200976d));
        Animator animatorM164039b = oey.m164039b(this.f148777p, this.f148778q);
        this.f148756D = animatorM164039b;
        animatorM164039b.start();
    }

    /* JADX INFO: renamed from: Y */
    public final void m168863Y() {
        this.f148770i.addOnScrollListener(new C19207c());
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m168864Z() {
        this.f148770i.stopScroll();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m168865a0(Boolean bool) {
        m168884t0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ String m168866b0() {
        if (m168850J().m39381R4()) {
            return "p_intl_meet_view,e_boost_button,click";
        }
        return "tabMessage".equals((getAct() == null || getAct().getIntent() == null) ? null : getAct().getIntent().getStringExtra("from")) ? "p_intl_message_plm,e_boost_button,click" : "p_intl_plm,e_boost_button,click";
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m168867c0(zii ziiVar, int i) {
        yfo.m214566e(false, ziiVar.f203330a);
        if (i == 0 || !xma.m210077h4()) {
            if (TextUtils.equals(this.f148786y.m193451u0(), ziiVar.f203330a)) {
                return;
            }
            m168875k0(i);
        } else {
            boolean zM173360h3 = CoreModule.f17545c.f19672p0.m173360h3();
            ufo ufoVar = this.f148786y;
            if (zM173360h3) {
                ufoVar.m193438R0(m168850J().m39381R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click", null);
            } else {
                ufoVar.m193439S0(m168850J().m39381R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m168868d0(View view) {
        yfo.m214570i(this.f148785x.act().pageId());
        ura.m195053e().m195057d().mo33695Hb(this.f148785x.act(), false, "p_intl_plm,e_intl_plm_turbo_button,click", null);
    }

    @Override // p149l.s7m
    public void destroy() {
        Runnable runnable;
        meo meoVar = this.f148761I;
        if (meoVar != null) {
            meoVar.m154282i();
            this.f148761I = null;
        }
        mkd0.m154992z(this.f148754B);
        m168889y0();
        teo teoVar = this.f148755C;
        if (teoVar == null || (runnable = teoVar.f169871k) == null) {
            return;
        }
        e51.m114745J(runnable);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m168869e0(View view) {
        yfo.m214578q();
        this.f148786y.m193438R0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click", null);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m168870f0(View view) {
        yfo.m214578q();
        this.f148786y.m193439S0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m168871g0() {
        this.f148787z.m130676R();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m168872h0(int i, View view) {
        if (NullChecker.m81303a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            userNew_.f56011id = "intlSeeListAd";
            this.f148787z.m130668J(new kco(userNew_), i, view);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m168873i0() {
        this.f148770i.smoothScrollToPosition(0);
        this.f148758F = false;
        this.f148759G = 0;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m168843A(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m168874j0(ArrayList<etl> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        final int i = arrayList.get(0) instanceof afo ? 5 : 3;
        if (NullChecker.m81303a(this.f148787z.f107381f)) {
            arrayList.add(i, this.f148787z.f107381f);
            return;
        }
        C22306c<View> c22306cMo33625x8 = CoreModule.f17554l.m94651a().mo33625x8(this.f148785x.act(), new d30() { // from class: l.jgo
            @Override // p149l.d30
            public final void call() {
                this.f117812a.m168871g0();
            }
        });
        if (NullChecker.m81303a(c22306cMo33625x8)) {
            this.f148754B.m103655a(c22306cMo33625x8.subscribe(mkd0.m154956H(new e30() { // from class: l.kgo
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123047a.m168872h0(i, (View) obj);
                }
            }, new e30() { // from class: l.lgo
                @Override // p149l.e30
                public final void call(Object obj) {
                    pgo.m168824c((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m168875k0(int i) {
        this.f148753A.m164519K(i);
        this.f148786y.m193436P0(this.f148760H.get(i).f203330a);
    }

    /* JADX INFO: renamed from: m0 */
    public void m168877m0() {
        meo meoVar = this.f148761I;
        if (meoVar != null) {
            meoVar.m154286m();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m168878n0(boolean z) {
        if (z) {
            m168885u0();
        } else {
            m168879o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m168879o0() {
        Animator animator = this.f148756D;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f148756D.pause();
    }

    /* JADX INFO: renamed from: q0 */
    public void m168880q0(List<etl> list, boolean z) {
        m168889y0();
        heo heoVar = this.f148787z;
        if (heoVar != null) {
            boolean zM130678T = heoVar.m130678T(list, z);
            if (z && zM130678T) {
                this.f148770i.scrollToPosition(0);
                this.f148767f.setExpanded(true, true);
            }
        }
        boolean zM168819I = m168819I(list);
        if (vwb.m200296J(list)) {
            m168887w0(false);
            AppBarLayout appBarLayout = this.f148767f;
            if (appBarLayout != null) {
                appBarLayout.setExpanded(true, true);
            }
            meo meoVar = this.f148761I;
            if (meoVar != null) {
                meoVar.m154289p(false);
            }
            boolean zMo33735Oq = ura.m195053e().m195057d().mo33735Oq();
            LinearLayout linearLayout = this.f148771j;
            if (zMo33735Oq) {
                xdl0.m208344M(linearLayout, false);
                xdl0.m208344M(this.f148774m, true);
                m168862W();
            } else {
                xdl0.m208344M(linearLayout, true);
                xdl0.m208344M(this.f148774m, false);
            }
            yfo.m214574m();
        } else {
            meo meoVar2 = this.f148761I;
            if (meoVar2 != null) {
                meoVar2.m154289p(zM168819I);
            }
            xdl0.m208344M(this.f148771j, false);
            xdl0.m208344M(this.f148774m, false);
            m168887w0(true);
        }
        m168835p0();
    }

    /* JADX INFO: renamed from: r */
    public void m168881r() {
        m168820U();
        m168859S();
        m168821X();
        if (!IntlCountryCodeController.m28126v()) {
            m168860T();
        }
        m168863Y();
        m168861V();
        m168858R();
        m168845C();
        m168846E();
    }

    /* JADX INFO: renamed from: r0 */
    public void m168882r0(boolean z) {
        xdl0.m208344M(this.f148780s, !z);
        teo teoVar = this.f148755C;
        if (teoVar != null) {
            if (z) {
                teoVar.m188545k();
            } else {
                teoVar.m188541g(false);
                this.f148755C.m188544j();
            }
            this.f148755C.m188556v(z);
            this.f148755C.m188555u(z);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m168883s0(int i) {
        String string;
        if (i <= 0) {
            string = App.f15369e.getString(R$string.f20624Y0);
        } else {
            string = App.f15369e.getString(R$string.f20622X0, i > 99 ? "99+" : String.valueOf(i));
        }
        this.f148764c.setTitle(string);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m168884t0() {
        e51.m114741F(this.f148785x.act(), new Runnable() { // from class: l.fgo
            @Override // java.lang.Runnable
            public final void run() {
                this.f97390a.m168873i0();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m168885u0() {
        Animator animator = this.f148756D;
        if (animator != null && animator.isPaused() && this.f148774m.getVisibility() == 0) {
            this.f148756D.resume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m168886v0(User user) {
        if (ura.m195053e().m195057d().mo33735Oq()) {
            yfo.m214573l(ygo.m214738a(user.f56011id) ? "superlike_tag" : null, ygo.m214740c(user));
        } else {
            yfo.m214573l(null, null);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m168887w0(boolean z) {
        FrameLayout frameLayout = this.f148768g;
        if (frameLayout == null) {
            return;
        }
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) frameLayout.getLayoutParams();
        if (z) {
            layoutParams.setScrollFlags(17);
        } else {
            layoutParams.setScrollFlags(0);
        }
        this.f148768g.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: x0 */
    public void m168888x0(int i) {
        this.f148755C.m188553s(i);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m168889y0() {
        Animator animator = this.f148756D;
        if (animator != null) {
            animator.cancel();
            this.f148756D = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m168890z(View view) {
        rgo.m179178a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m168876l0(Boolean bool) {
    }
}
