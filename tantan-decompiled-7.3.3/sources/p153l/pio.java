package p153l;

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
import androidx.recyclerview.widget.C0607k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.appbar.AppBarLayout;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlMeetLikersFrag;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeLikersItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetFakeTurboItem;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersItemView;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p051p1.mobile.putong.core.newui.view.RadarRipple;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.sunshine.engine.particle.SceneView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p151v.VText_NoTopPadding;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes11.dex */
public class pio implements iam<uho> {

    /* JADX INFO: renamed from: A */
    public lli f152549A;

    /* JADX INFO: renamed from: C */
    public tgo f152551C;

    /* JADX INFO: renamed from: D */
    public Animator f152552D;

    /* JADX INFO: renamed from: H */
    public List<vli> f152556H;

    /* JADX INFO: renamed from: I */
    public mgo f152557I;

    /* JADX INFO: renamed from: a */
    public VFrame f152558a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f152559b;

    /* JADX INFO: renamed from: c */
    public VNavigationBar f152560c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f152561d;

    /* JADX INFO: renamed from: e */
    public CoordinatorLayout f152562e;

    /* JADX INFO: renamed from: f */
    public AppBarLayout f152563f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f152564g;

    /* JADX INFO: renamed from: h */
    public RecyclerView f152565h;

    /* JADX INFO: renamed from: i */
    public RecyclerView f152566i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f152567j;

    /* JADX INFO: renamed from: k */
    public VImage f152568k;

    /* JADX INFO: renamed from: l */
    public VText f152569l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f152570m;

    /* JADX INFO: renamed from: n */
    public Guideline f152571n;

    /* JADX INFO: renamed from: o */
    public FrameLayout f152572o;

    /* JADX INFO: renamed from: p */
    public RadarRipple f152573p;

    /* JADX INFO: renamed from: q */
    public VDraweeView f152574q;

    /* JADX INFO: renamed from: r */
    public VText_NoTopPadding f152575r;

    /* JADX INFO: renamed from: s */
    public VText_NoTopPadding f152576s;

    /* JADX INFO: renamed from: t */
    public BoostViewContainer f152577t;

    /* JADX INFO: renamed from: u */
    public FrameLayout f152578u;

    /* JADX INFO: renamed from: v */
    public VText_NoTopPadding f152579v;

    /* JADX INFO: renamed from: w */
    public SceneView f152580w;

    /* JADX INFO: renamed from: x */
    public final IntlMeetLikersFrag f152581x;

    /* JADX INFO: renamed from: y */
    public uho f152582y;

    /* JADX INFO: renamed from: z */
    public hgo f152583z;

    /* JADX INFO: renamed from: B */
    public final ft5 f152550B = new ft5();

    /* JADX INFO: renamed from: E */
    public boolean f152553E = false;

    /* JADX INFO: renamed from: F */
    public boolean f152554F = false;

    /* JADX INFO: renamed from: G */
    public int f152555G = 0;

    /* JADX INFO: renamed from: l.pio$a */
    public class C19372a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ GridLayoutManager f152584a;

        public C19372a(GridLayoutManager gridLayoutManager) {
            this.f152584a = gridLayoutManager;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            int itemViewType = pio.this.f152583z.getItemViewType(i);
            if (itemViewType == 1 || itemViewType == 2) {
                return this.f152584a.m3318m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: l.pio$b */
    public class C19373b implements bio.InterfaceC16017a {
        public C19373b() {
        }

        @Override // p153l.bio.InterfaceC16017a
        /* JADX INFO: renamed from: a */
        public void mo104493a(View view, User user, boolean z, boolean z2, boolean z3) {
            pio.this.m172427Q(view, user, z, z3);
        }

        @Override // p153l.bio.InterfaceC16017a
        /* JADX INFO: renamed from: n */
        public boolean mo104494n() {
            return joa.m146392i4();
        }

        @Override // p153l.bio.InterfaceC16017a
        /* JADX INFO: renamed from: o */
        public void mo104495o(boolean z) {
            if (pio.this.f152566i.getAdapter() != null) {
                pio.this.f152566i.getAdapter().notifyDataSetChanged();
            }
        }
    }

    /* JADX INFO: renamed from: l.pio$c */
    public class C19374c extends RecyclerView.AbstractC0584t {
        public C19374c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            pio pioVar = pio.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            pioVar.f152553E = z;
            pio.this.f152555G = 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            if (pio.this.f152553E && !pio.this.f152554F && joa.m146392i4()) {
                pio.this.f152555G += i2;
                if (pio.this.f152555G > qa00.m175859d(100.0f)) {
                    pio.this.m172425O();
                }
            }
        }
    }

    public pio(IntlMeetLikersFrag intlMeetLikersFrag) {
        this.f152581x = intlMeetLikersFrag;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m172389I(List<svl> list) {
        if (jyb.m147479J(list)) {
            return false;
        }
        for (svl svlVar : list) {
            if ((svlVar instanceof cio) || (svlVar instanceof oeo) || (svlVar instanceof aho)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    private void m172390U() {
        if (m172420J().m40384R4()) {
            return;
        }
        this.f152560c.setLeftIconAsBack(this.f152581x.act());
        this.f152560c.setLeftIconResource(gbc0.f103261b);
        this.f152560c.setRightIconClip(false);
        View viewM172414B = m172414B(LayoutInflater.from(this.f152581x.act()), this.f152560c.getRightIconContainer());
        m172460z(viewM172414B);
        this.f152560c.m224835z(viewM172414B);
        bnl0.m105509E0(this.f152559b.getBoostButton(), new View.OnClickListener() { // from class: l.dio
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f88696a.m172438d0(view);
            }
        });
        bnl0.m105524M(this.f152560c, true);
        bnl0.m105524M(this.f152558a, false);
    }

    /* JADX INFO: renamed from: X */
    private void m172391X() {
        this.f152583z = new hgo(this.f152582y);
        this.f152566i.addItemDecoration(new qdk(qa00.f156321h, 2));
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.f152566i.getLayoutManager();
        if (gridLayoutManager != null) {
            gridLayoutManager.m3327v(new C19372a(gridLayoutManager));
        }
        this.f152566i.setAdapter(this.f152583z);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m172394c(Throwable th) {
    }

    /* JADX INFO: renamed from: p0 */
    private void m172405p0() {
        mgo mgoVar = this.f152557I;
        if (mgoVar != null) {
            mgoVar.m158372o();
        }
    }

    /* JADX INFO: renamed from: A */
    public View m172413A(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qio.m176755b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B */
    public View m172414B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rio.m181600b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: C */
    public final void m172415C() {
        if (!gta.m132210e().m132214d().mo34738Oq()) {
            bnl0.m105554f0(this.f152566i, qa00.f156323j);
        }
        bnl0.m105540X(this.f152564g, m172420J().m40384R4() ? qa00.f156323j : qa00.f156320g);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f152581x.act();
    }

    /* JADX INFO: renamed from: E */
    public void m172416E() {
        if (this.f152557I != null) {
            return;
        }
        mgo mgoVar = new mgo(this.f152581x);
        this.f152557I = mgoVar;
        mgoVar.m158364g(this.f152561d);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(uho uhoVar) {
        this.f152582y = uhoVar;
    }

    /* JADX INFO: renamed from: G */
    public void m172418G(boolean z) {
        this.f152551C.m191063t(z, this.f152581x.act().pageId());
    }

    /* JADX INFO: renamed from: H */
    public void m172419H() {
        this.f152551C.m191051h();
    }

    /* JADX INFO: renamed from: J */
    public IntlMeetLikersFrag m172420J() {
        return this.f152581x;
    }

    /* JADX INFO: renamed from: K */
    public hgo m172421K() {
        return this.f152583z;
    }

    /* JADX INFO: renamed from: L */
    public final void m172422L(IntlMeetFakeTurboItem intlMeetFakeTurboItem) {
        this.f152583z.notifyDataSetChanged();
        intlMeetFakeTurboItem.m40404l0(this.f152581x.act());
    }

    /* JADX INFO: renamed from: M */
    public final void m172423M(User user, boolean z) {
        m172456v0(user);
        if (gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215991r(user.f56859id, z, yio.m216341a(user.f56859id) ? "superlike_tag" : null, yio.m216343c(user));
        } else {
            yho.m215991r(user.f56859id, z, null, null);
        }
        this.f152583z.notifyDataSetChanged();
        boolean zM219063h3 = CoreModule.f18264c.f20414p0.m219063h3();
        uho uhoVar = this.f152582y;
        if (zM219063h3) {
            uhoVar.m196107S0("p_intl_meet_view,e_intl_meet_see_users,click", null);
        } else {
            uhoVar.m196108U0("p_intl_meet_view,e_intl_meet_see_users,click");
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m172424N(User user, boolean z, boolean z2) {
        if (gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215991r(user.f56859id, z, yio.m216341a(user.f56859id) ? "superlike_tag" : null, yio.m216343c(user));
        } else {
            yho.m215991r(user.f56859id, z, null, null);
        }
        this.f152582y.m196094E(user, z, z2);
    }

    /* JADX INFO: renamed from: O */
    public final void m172425O() {
        this.f152554F = true;
        l51.m152886F(this.f152581x.act(), new Runnable() { // from class: l.nio
            @Override // java.lang.Runnable
            public final void run() {
                this.f142143a.m172434Z();
            }
        });
        yho.m215988o();
        boolean zM219063h3 = CoreModule.f18264c.f20414p0.m219063h3();
        uho uhoVar = this.f152582y;
        if (zM219063h3) {
            uhoVar.m196107S0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new y20() { // from class: l.oio
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f147558a.m172435a0((Boolean) obj);
                }
            });
        } else {
            uhoVar.m196109V0("p_intl_meet_view,e_intl_meet_view_swipe_bottom,click", new x20() { // from class: l.eio
                @Override // p153l.x20
                public final void call() {
                    this.f94185a.m172454t0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m172426P() {
        if (bnl0.m105529O0(this.f152577t)) {
            yho.m215977d(true, !CoreModule.m30933P().m143405a().mo34576qt());
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m172427Q(View view, User user, boolean z, boolean z2) {
        if ((view instanceof IntlMeetLikersItemView) && NullChecker.m82486a(user)) {
            m172424N(user, z, z2);
        } else if (view instanceof IntlMeetFakeTurboItem) {
            m172422L((IntlMeetFakeTurboItem) view);
        } else if (view instanceof IntlMeetFakeLikersItem) {
            m172423M(user, z);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m172428R() {
        this.f152551C = new tgo(this, this.f152581x.act(), this.f152577t, this.f152559b, this.f152579v, this.f152578u, this.f152580w, this.f152562e, (ViewGroup) this.f152566i.getRootView(), this.f152558a);
        this.f152577t.setFromCallback(new pcj() { // from class: l.mio
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f137004a.m172436b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final void m172429S() {
        boolean zMo34738Oq = gta.m132210e().m132214d().mo34738Oq();
        FrameLayout frameLayout = this.f152564g;
        if (!zMo34738Oq) {
            bnl0.m105524M(frameLayout, false);
            return;
        }
        bnl0.m105524M(frameLayout, true);
        if (this.f152556H == null) {
            this.f152556H = tli.m191640a();
        }
        lli lliVar = new lli();
        this.f152549A = lliVar;
        lliVar.m154729I(this.f152556H);
        this.f152549A.m154730J(new lli.InterfaceC18410a() { // from class: l.gio
            @Override // p153l.lli.InterfaceC18410a
            /* JADX INFO: renamed from: a */
            public final void mo130338a(vli vliVar, int i) {
                this.f104510a.m172437c0(vliVar, i);
            }
        });
        this.f152565h.setAdapter(this.f152549A);
        yho.m215978e(true, null);
    }

    /* JADX INFO: renamed from: T */
    public final void m172430T() {
        new C0607k(new bio(new C19373b())).m3751g(this.f152566i);
    }

    /* JADX INFO: renamed from: V */
    public final void m172431V() {
        this.f152576s.setText(this.f152581x.act().getString(R$string.f21389g1));
        boolean zM219063h3 = CoreModule.f18264c.f20414p0.m219063h3();
        VText_NoTopPadding vText_NoTopPadding = this.f152576s;
        if (!zM219063h3) {
            vText_NoTopPadding.setBackgroundResource(gbc0.f103176P);
            bnl0.m105509E0(this.f152576s, new View.OnClickListener() { // from class: l.iio
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f115111a.m172440f0(view);
                }
            });
        } else {
            vText_NoTopPadding.setBackgroundResource(gbc0.f103183Q);
            this.f152576s.setTextColor(Color.parseColor(Constants.BLACK));
            bnl0.m105509E0(this.f152576s, new View.OnClickListener() { // from class: l.hio
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f110041a.m172439e0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m172432W() {
        uqb0.f180374G.m127115L0(this.f152574q, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted());
        this.f152573p.setRadarColor(App.f16088e.getColor(f9c0.f97859d));
        Animator animatorM155033b = lny.m155033b(this.f152573p, this.f152574q);
        this.f152552D = animatorM155033b;
        animatorM155033b.start();
    }

    /* JADX INFO: renamed from: Y */
    public final void m172433Y() {
        this.f152566i.addOnScrollListener(new C19374c());
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m172434Z() {
        this.f152566i.stopScroll();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m172435a0(Boolean bool) {
        m172454t0();
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ String m172436b0() {
        if (m172420J().m40384R4()) {
            return "p_intl_meet_view,e_boost_button,click";
        }
        return "tabMessage".equals((getAct() == null || getAct().getIntent() == null) ? null : getAct().getIntent().getStringExtra("from")) ? "p_intl_message_plm,e_boost_button,click" : "p_intl_plm,e_boost_button,click";
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m172437c0(vli vliVar, int i) {
        yho.m215978e(false, vliVar.f184587a);
        if (i == 0 || !joa.m146392i4()) {
            if (TextUtils.equals(this.f152582y.m196121x0(), vliVar.f184587a)) {
                return;
            }
            m172445k0(i);
        } else {
            boolean zM219063h3 = CoreModule.f18264c.f20414p0.m219063h3();
            uho uhoVar = this.f152582y;
            if (zM219063h3) {
                uhoVar.m196107S0(m172420J().m40384R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click", null);
            } else {
                uhoVar.m196108U0(m172420J().m40384R4() ? "p_intl_meet_view,e_intl_see_filter_click,click" : "p_intl_plm,e_intl_see_filter_click,click");
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m172438d0(View view) {
        yho.m215982i(this.f152581x.act().pageId());
        gta.m132210e().m132214d().mo34698Hb(this.f152581x.act(), false, "p_intl_plm,e_intl_plm_turbo_button,click", null);
    }

    @Override // p153l.iam
    public void destroy() {
        Runnable runnable;
        mgo mgoVar = this.f152557I;
        if (mgoVar != null) {
            mgoVar.m158366i();
            this.f152557I = null;
        }
        psd0.m173633z(this.f152550B);
        m172459y0();
        tgo tgoVar = this.f152551C;
        if (tgoVar == null || (runnable = tgoVar.f174116k) == null) {
            return;
        }
        l51.m152890J(runnable);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m172439e0(View view) {
        yho.m215990q();
        this.f152582y.m196107S0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click", null);
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m172440f0(View view) {
        yho.m215990q();
        this.f152582y.m196108U0("p_intl_meet_view,e_intl_meet_see_unlock_btn,click");
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m172441g0() {
        this.f152583z.m134966R();
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m172442h0(int i, View view) {
        if (NullChecker.m82486a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            userNew_.f56859id = "intlSeeListAd";
            this.f152583z.m134958J(new keo(userNew_), i, view);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m172443i0() {
        this.f152566i.smoothScrollToPosition(0);
        this.f152554F = false;
        this.f152555G = 0;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m172413A(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public void m172444j0(ArrayList<svl> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        final int i = arrayList.get(0) instanceof aho ? 5 : 3;
        if (NullChecker.m82486a(this.f152583z.f109423f)) {
            arrayList.add(i, this.f152583z.f109423f);
            return;
        }
        C22421c<View> c22421cMo34628x8 = CoreModule.f18273l.m143405a().mo34628x8(this.f152581x.act(), new x20() { // from class: l.jio
            @Override // p153l.x20
            public final void call() {
                this.f121107a.m172441g0();
            }
        });
        if (NullChecker.m82486a(c22421cMo34628x8)) {
            this.f152550B.m127297a(c22421cMo34628x8.subscribe(psd0.m173597H(new y20() { // from class: l.kio
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f127010a.m172442h0(i, (View) obj);
                }
            }, new y20() { // from class: l.lio
                @Override // p153l.y20
                public final void call(Object obj) {
                    pio.m172394c((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m172445k0(int i) {
        this.f152549A.m154731K(i);
        this.f152582y.m196105Q0(this.f152556H.get(i).f184587a);
    }

    /* JADX INFO: renamed from: m0 */
    public void m172447m0() {
        mgo mgoVar = this.f152557I;
        if (mgoVar != null) {
            mgoVar.m158370m();
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m172448n0(boolean z) {
        if (z) {
            m172455u0();
        } else {
            m172449o0();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m172449o0() {
        Animator animator = this.f152552D;
        if (animator == null || !animator.isRunning()) {
            return;
        }
        this.f152552D.pause();
    }

    /* JADX INFO: renamed from: q0 */
    public void m172450q0(List<svl> list, boolean z) {
        m172459y0();
        hgo hgoVar = this.f152583z;
        if (hgoVar != null) {
            boolean zM134968T = hgoVar.m134968T(list, z);
            if (z && zM134968T) {
                this.f152566i.scrollToPosition(0);
                this.f152563f.setExpanded(true, true);
            }
        }
        boolean zM172389I = m172389I(list);
        if (jyb.m147479J(list)) {
            m172457w0(false);
            AppBarLayout appBarLayout = this.f152563f;
            if (appBarLayout != null) {
                appBarLayout.setExpanded(true, true);
            }
            mgo mgoVar = this.f152557I;
            if (mgoVar != null) {
                mgoVar.m158373p(false);
            }
            boolean zMo34738Oq = gta.m132210e().m132214d().mo34738Oq();
            LinearLayout linearLayout = this.f152567j;
            if (zMo34738Oq) {
                bnl0.m105524M(linearLayout, false);
                bnl0.m105524M(this.f152570m, true);
                m172432W();
            } else {
                bnl0.m105524M(linearLayout, true);
                bnl0.m105524M(this.f152570m, false);
            }
            yho.m215986m();
        } else {
            mgo mgoVar2 = this.f152557I;
            if (mgoVar2 != null) {
                mgoVar2.m158373p(zM172389I);
            }
            bnl0.m105524M(this.f152567j, false);
            bnl0.m105524M(this.f152570m, false);
            m172457w0(true);
        }
        m172405p0();
    }

    /* JADX INFO: renamed from: r */
    public void m172451r() {
        m172390U();
        m172429S();
        m172391X();
        if (!IntlCountryCodeController.m29125v()) {
            m172430T();
        }
        m172433Y();
        m172431V();
        m172428R();
        m172415C();
        m172416E();
    }

    /* JADX INFO: renamed from: r0 */
    public void m172452r0(boolean z) {
        bnl0.m105524M(this.f152576s, !z);
        tgo tgoVar = this.f152551C;
        if (tgoVar != null) {
            if (z) {
                tgoVar.m191054k();
            } else {
                tgoVar.m191050g(false);
                this.f152551C.m191053j();
            }
            this.f152551C.m191065v(z);
            this.f152551C.m191064u(z);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m172453s0(int i) {
        String string;
        if (i <= 0) {
            string = App.f16088e.getString(R$string.f21366Y0);
        } else {
            string = App.f16088e.getString(R$string.f21364X0, i > 99 ? "99+" : String.valueOf(i));
        }
        this.f152560c.setTitle(string);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m172454t0() {
        l51.m152886F(this.f152581x.act(), new Runnable() { // from class: l.fio
            @Override // java.lang.Runnable
            public final void run() {
                this.f99210a.m172443i0();
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m172455u0() {
        Animator animator = this.f152552D;
        if (animator != null && animator.isPaused() && this.f152570m.getVisibility() == 0) {
            this.f152552D.resume();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m172456v0(User user) {
        if (gta.m132210e().m132214d().mo34738Oq()) {
            yho.m215985l(yio.m216341a(user.f56859id) ? "superlike_tag" : null, yio.m216343c(user));
        } else {
            yho.m215985l(null, null);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m172457w0(boolean z) {
        FrameLayout frameLayout = this.f152564g;
        if (frameLayout == null) {
            return;
        }
        AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) frameLayout.getLayoutParams();
        if (z) {
            layoutParams.setScrollFlags(17);
        } else {
            layoutParams.setScrollFlags(0);
        }
        this.f152564g.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: x0 */
    public void m172458x0(int i) {
        this.f152551C.m191062s(i);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m172459y0() {
        Animator animator = this.f152552D;
        if (animator != null) {
            animator.cancel();
            this.f152552D = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m172460z(View view) {
        rio.m181599a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public void m172446l0(Boolean bool) {
    }
}
