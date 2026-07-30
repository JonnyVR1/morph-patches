package com.p000p1.mobile.putong.core.newui.home.frag.base;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p1.mobile.putong.core.ui.main.HomeMultiTabSwitcher;
import com.p1.mobile.putong.core.ui.main.TitleSwitcher;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import l.d30;
import l.e30;
import l.e51;
import l.g6a;
import l.hpd0;
import l.j760;
import l.j8w;
import l.k6w;
import l.k8l;
import l.mkd0;
import l.nwi0;
import l.nx0;
import l.o6j0;
import l.ogl0;
import l.roj0;
import l.t100;
import l.u59;
import l.upa;
import l.vwb;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.xjc0;
import l.y9j;
import l.zvf0;
import p009l.bs30;
import p009l.o0x;
import p009l.psl;
import p009l.rvi0;
import p009l.va40;
import rx.c;
import rx.subjects.a;
import v.VFrame;
import v.VOnlineIndicator;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeLayoutFrag extends BaseHomeLayoutFrag implements psl {

    /* JADX INFO: renamed from: C */
    public FrameLayout f1778C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f1779D;

    /* JADX INFO: renamed from: E */
    public HomeTitleBarRootLayout f1780E;

    /* JADX INFO: renamed from: F */
    public VFrame f1781F;

    /* JADX INFO: renamed from: G */
    public VOnlineIndicator f1782G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f1783H;

    /* JADX INFO: renamed from: I */
    public View f1784I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public HomeMultiTabSwitcher f1785J;

    /* JADX INFO: renamed from: K */
    public final e30<Integer> f1786K = new e30() { // from class: l.v7l
        public final void call(Object obj) {
            this.f21476a.m2541X5((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$a */
    public class ViewOnClickListenerC0159a implements View.OnClickListener {
        public ViewOnClickListenerC0159a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xdl0.M(HomeLayoutFrag.this.f1782G, false);
            hpd0 hpd0Var = CoreModule.c.e0.b4;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.c.e0.E1.onNext(bool);
            zvf0.r("e_mode_switching", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$b */
    public class C0160b implements e30<roj0> {
        public C0160b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            HomeLayoutFrag homeLayoutFrag = HomeLayoutFrag.this;
            homeLayoutFrag.m2531L5(homeLayoutFrag.f1775A);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public static PutongFrag m2491C5() {
        return new HomeLayoutFrag();
    }

    /* JADX INFO: renamed from: J5 */
    private void m2492J5() {
        if (g6a.w()) {
            ViewGroup viewGroup = (ViewGroup) this.f1778C.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m2493M5() {
        mo2546f1(NewTanFragTag.TOP_PICKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m2494O5(Bundle bundle) {
        if (upa.e2()) {
            xdl0.E0(this.f1781F, new ViewOnClickListenerC0159a());
            if (CoreModule.c.e0.a8()) {
                m2488d5(null, null, NewTanFragTag.MARRY_MODE);
            }
        }
        if (((Boolean) CoreModule.c.z0.Z.get()).booleanValue()) {
            CoreModule.c.z0.Z.put(Boolean.FALSE);
        }
        if (g6a.z() && CoreModule.c.g2.m3()) {
            CoreModule.c.g2.p3();
            m2488d5(null, null, NewTanFragTag.YOUTH_VIP);
            return;
        }
        if (upa.J3() && CoreModule.c.e0.p9().isPicVerificationVerified()) {
            CharSequence charSequence = (CharSequence) CoreModule.c.e0.R3.get();
            NewTanFragTag newTanFragTag = NewTanFragTag.ALREADY_AUTH;
            if (TextUtils.equals(charSequence, newTanFragTag.getTag())) {
                m2488d5(null, null, newTanFragTag);
                return;
            }
        }
        if (upa.h0().enable && rvi0.m21822c()) {
            m2488d5(null, null, NewTanFragTag.WEBVIEW_CONFIG);
        } else {
            m2488d5(null, null, NewTanFragTag.HOME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m2495P5(Integer num) {
        if (NullChecker.a(this.f1783H)) {
            if (NewTanFragTag.HOME == this.f1775A) {
                xdl0.D0(num.intValue(), new View[]{this.f1783H});
            } else {
                xdl0.D0(xdl0.y0(), new View[]{this.f1783H});
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U5 */
    public /* synthetic */ void m2496U5(roj0 roj0Var) {
        if (NullChecker.a(this.f1785J)) {
            this.f1785J.B(false);
        }
    }

    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ User m2497g5(xaj0 xaj0Var) {
        return (User) xaj0Var.a;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m2500j5(Throwable th) {
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m2501k5(Throwable th) {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m2509s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m2512v5(Throwable th) {
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m2513w5(Throwable th) {
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m2514x5(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public View m2517A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k8l.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m2518B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m2519B5(NewTanFragTag newTanFragTag) {
        if (this.f1775A == NewTanFragTag.UNKNOWN) {
            return;
        }
        if (NewTanFragTag.TOP_PICKS == newTanFragTag && NullChecker.a(this.f1784I)) {
            this.f1784I.setBackground(null);
        }
        if (NewTanFragTag.HOME == newTanFragTag) {
            xdl0.D0(va40.m23332c(), new View[0]);
        } else {
            xdl0.D0(xdl0.y0(), new View[]{this.f1783H});
        }
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: C1 */
    public void mo2520C1(NewTanFragTag newTanFragTag, String str) {
        m2488d5(newTanFragTag, str, NewTanFragTag.HOME);
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> m2521C4() {
        ArrayList arrayListF0 = vwb.f0(new j760[]{vwb.Y("插入每日精选tab", new d30() { // from class: l.x7l
            public final void call() {
                this.f22458a.m2493M5();
            }
        })});
        arrayListF0.addAll(m2479V4().C4());
        return arrayListF0;
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m2522D4(MotionEvent motionEvent, boolean z) {
        return super.D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: D5 */
    public TitleSwitcher m2523D5() {
        return this.f1785J;
    }

    /* JADX INFO: renamed from: E5 */
    public final void m2524E5() {
        if (xdl0.O0(this.f1782G)) {
            o6j0.h("e_mode_switching_red_dot", "p_suggest_users_home_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m2525F5() {
        try {
            if (upa.N3()) {
                NewTanFragTag newTanFragTag = this.f1775A;
                if (newTanFragTag != NewTanFragTag.HOME && newTanFragTag != NewTanFragTag.UNKNOWN) {
                    xdl0.U(this.f1778C, t100.d(56.0f));
                    return;
                }
                xdl0.U(this.f1778C, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G5 */
    public a<NewTanFragTag> m2526G5() {
        return va40.f21502c;
    }

    /* JADX INFO: renamed from: H5 */
    public void m2527H5() {
        nx0 appTheme = act().getAppTheme();
        if (upa.z()) {
            return;
        }
        View view = new View(act());
        this.f1784I = view;
        view.setBackgroundColor(appTheme.d());
        this.f1778C.addView(this.f1784I, new LinearLayout.LayoutParams(-1, 0));
        xdl0.r0(new View[]{this.f1784I});
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: I2 */
    public void mo2528I2(NewTanFragTag newTanFragTag) {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f1785J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.h(newTanFragTag);
    }

    /* JADX INFO: renamed from: I5 */
    public final void m2529I5() {
        final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
        act().duringCreated(j8w.Companion.a().G0(), false).subscribe(mkd0.H(new e30() { // from class: l.a8l
            public final void call(Object obj) {
                this.f9329a.m2532N5(loveBuzzNotifyUserPop, (j760) obj);
            }
        }, new e30() { // from class: l.b8l
            public final void call(Object obj) {
                HomeLayoutFrag.m2500j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public void m2530K5() {
    }

    /* JADX INFO: renamed from: L5 */
    public void m2531L5(NewTanFragTag newTanFragTag) {
        xdl0.M(this.f1781F, upa.e2());
        HomeMultiTabSwitcher homeMultiTabSwitcher = new HomeMultiTabSwitcher(getContext());
        this.f1785J = homeMultiTabSwitcher;
        homeMultiTabSwitcher.e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (nwi0.INSTANCE.f()) {
            layoutParams.width = -1;
        }
        layoutParams.gravity = 19;
        this.f1785J.setTabSelected(newTanFragTag);
        this.f1775A = newTanFragTag;
        this.f1783H.removeAllViews();
        this.f1783H.addView((View) this.f1785J, (ViewGroup.LayoutParams) layoutParams);
        this.f1785J.setOnTabClickListener(this.f1786K);
        this.f1785J.post(new Runnable() { // from class: l.w7l
            @Override // java.lang.Runnable
            public final void run() {
                this.f21936a.m2540W5();
            }
        });
        if (upa.Z2() && !ogl0.A() && !ogl0.B()) {
            xdl0.M(this.f1785J, false);
        }
        if (upa.X2()) {
            boolean zEquals = ((String) CoreModule.c.e0.Z3.get()).equals("marryMode");
            VFrame vFrame = this.f1781F;
            if (!zEquals) {
                xdl0.M(vFrame, false);
                xdl0.V(this.f1783H, t100.h);
            } else {
                xdl0.M(vFrame, true);
                xdl0.M(this.f1785J, true);
                xdl0.V(this.f1783H, 0);
            }
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m2532N5(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, j760 j760Var) {
        k6w.INSTANCE.e(act(), this.f1778C, j760Var, loveBuzzNotifyUserPop);
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: O */
    public LinearLayout mo2533O() {
        return this.f1780E;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m2534Q5(j760 j760Var) {
        m2524E5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m2535R5(NewTanFragTag newTanFragTag) {
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag())) {
            if (NullChecker.a(this.f1785J)) {
                this.f1785J.B(false);
            }
            e51.F(act(), new Runnable() { // from class: l.y7l
                @Override // java.lang.Runnable
                public final void run() {
                    rvi0.m21827h();
                }
            });
            return;
        }
        boolean zM21825f = rvi0.m21825f();
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f1785J;
        if (zM21825f) {
            if (NullChecker.a(homeMultiTabSwitcher)) {
                this.f1785J.B(true);
            }
        } else if (NullChecker.a(homeMultiTabSwitcher)) {
            this.f1785J.B(false);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m2536S5(TabName tabName) {
        return Boolean.valueOf(TextUtils.equals(this.f1775A.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag()));
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: T */
    public NewTanFragTag mo2537T() {
        return this.f1775A;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m2538T5(TabName tabName) {
        if (rvi0.m21823d()) {
            m2544Z5();
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m2539V5(User user) {
        if (((!TextUtils.equals(user.getUserInfoForMarryStatus(), "passed") || ((Boolean) CoreModule.c.e0.b4.get()).booleanValue()) && !o0x.m19576e()) || !xjc0.e(xjc0.a)) {
            xdl0.M(this.f1782G, false);
        } else {
            xdl0.M(this.f1782G, true);
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m2540W5() {
        va40.m23337h(this.f1785J.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m2541X5(Integer num) {
        NewTanFragTag newTanFragTagD = this.f1785J.d(num.intValue());
        m2485b5(newTanFragTagD);
        m2543Y5(newTanFragTagD);
        if (g6a.w()) {
            boolean zEquals = TextUtils.equals(newTanFragTagD.getTag(), NewTanFragTag.HOME.getTag());
            FrameLayout frameLayout = this.f1778C;
            if (zEquals) {
                frameLayout.bringChildToFront(this.f1779D);
            } else {
                frameLayout.bringChildToFront(this.f1780E);
            }
        }
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: Y */
    public Frag mo2542Y() {
        return m2479V4();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m2543Y5(NewTanFragTag newTanFragTag) {
        if (NewTanFragTag.HOME.equals(newTanFragTag)) {
            zvf0.r("e_swipe_nav_tab", "p_suggest_users_home_view");
        } else if (NewTanFragTag.TOP_PICKS.equals(newTanFragTag)) {
            nwi0.INSTANCE.d();
        } else if (NewTanFragTag.PLAY_TOGETHER.equals(newTanFragTag)) {
            zvf0.r("e_suggest_offline_party", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m2544Z5() {
        NewTanFragTag newTanFragTag = this.f1775A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2) {
            return false;
        }
        m2485b5(newTanFragTag2);
        return true;
    }

    public boolean disableAutoPV() {
        return true;
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: e3 */
    public void mo2545e3() {
        if (NullChecker.a(this.f1785J)) {
            this.f1785J.A();
        }
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: f1 */
    public void mo2546f1(NewTanFragTag newTanFragTag) {
        va40.f21505f.add(newTanFragTag);
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f1785J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.h(newTanFragTag);
    }

    /* JADX INFO: renamed from: f4 */
    public void m2547f4() {
        super.f4();
        creates(new e30() { // from class: l.o7l
            public final void call(Object obj) {
                this.f17867a.m2494O5((Bundle) obj);
            }
        });
        act().duringCreated(va40.f21503d).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.h8l
            public final void call(Object obj) {
                this.f13908a.m2495P5((Integer) obj);
            }
        }));
        if (u59.d0()) {
            m2529I5();
        }
        if (upa.h0().enable) {
            duringCreated(m2526G5()).subscribe(mkd0.G(new e30() { // from class: l.i8l
                public final void call(Object obj) {
                    this.f14437a.m2535R5((NewTanFragTag) obj);
                }
            }));
            duringCreated(act().m3895i7().distinctUntilChanged().filter(new w9j() { // from class: l.j8l
                public final Object call(Object obj) {
                    return this.f14987a.m2536S5((TabName) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.p7l
                public final void call(Object obj) {
                    this.f18423a.m2538T5((TabName) obj);
                }
            }, new e30() { // from class: l.q7l
                public final void call(Object obj) {
                    HomeLayoutFrag.m2514x5((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.c.e0.N3).subscribe(mkd0.H(new e30() { // from class: l.r7l
                public final void call(Object obj) {
                    this.f19672a.m2496U5((roj0) obj);
                }
            }, new e30() { // from class: l.s7l
                public final void call(Object obj) {
                    HomeLayoutFrag.m2513w5((Throwable) obj);
                }
            }));
        }
        if (upa.e2()) {
            duringCreated(c.combineLatest(CoreModule.c.e0.o9().distinctUntilChanged(), CoreModule.c.e0.b4.obs().distinctUntilChanged(), CoreModule.c.e0.o4.obs().distinctUntilChanged(), new y9j() { // from class: l.t7l
                /* JADX INFO: renamed from: a */
                public final Object m22465a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((User) obj, (Boolean) obj2, (String) obj3);
                }
            }).map(new w9j() { // from class: l.u7l
                public final Object call(Object obj) {
                    return HomeLayoutFrag.m2497g5((xaj0) obj);
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.z7l
                public final void call(Object obj) {
                    this.f23509a.m2539V5((User) obj);
                }
            }, new e30() { // from class: l.c8l
                public final void call(Object obj) {
                    HomeLayoutFrag.m2509s5((Throwable) obj);
                }
            }));
            duringCreated(mkd0.r(act().m3895i7().distinctUntilChanged(), act().lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.d8l
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var.b == com.p1.mobile.android.app.c.i && TextUtils.equals(((TabName) j760Var.a).name(), TabName.Card.name()));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.e8l
                public final void call(Object obj) {
                    this.f12449a.m2534Q5((j760) obj);
                }
            }, new e30() { // from class: l.f8l
                public final void call(Object obj) {
                    HomeLayoutFrag.m2512v5((Throwable) obj);
                }
            }));
            if (upa.X2()) {
                duringCreated(CoreModule.c.e0.F1).subscribe(mkd0.H(new C0160b(), new e30() { // from class: l.g8l
                    public final void call(Object obj) {
                        HomeLayoutFrag.m2501k5((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag
    /* JADX INFO: renamed from: f5 */
    public void mo2490f5() {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f1785J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.setTabSelected(this.f1775A);
        m2519B5(this.f1775A);
        if (this.f1775A == NewTanFragTag.HOME) {
            CoreModule.c.m0.s6("initiative", "tab", (String) null);
        }
        m2525F5();
    }

    /* JADX INFO: renamed from: g4 */
    public void m2548g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m2492J5();
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM2517A5 = m2517A5(layoutInflater, viewGroup);
        xdl0.g0(new View[]{this.f1780E});
        xdl0.r0(new View[]{this.f1780E});
        m2527H5();
        m2531L5(this.f1775A);
        m2519B5(this.f1775A);
        m2530K5();
        m2525F5();
        return viewM2517A5;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m2549k4() {
        return true;
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: n2 */
    public void mo2550n2(NewTanFragTag newTanFragTag) {
        if (this.f1785J == null) {
            return;
        }
        if (upa.e2() && CoreModule.c.e0.a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        this.f1785J.setTabSelected(newTanFragTag);
    }

    @Override // p009l.psl
    /* JADX INFO: renamed from: o */
    public boolean mo2551o() {
        if (upa.N3() && this.f1775A == NewTanFragTag.HOME && ExpandedCardStyleHelper.m2064o().m2066f()) {
            return true;
        }
        NewTanFragTag newTanFragTag = this.f1775A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2 || newTanFragTag == NewTanFragTag.MARRY_MODE) {
            return false;
        }
        m2485b5(newTanFragTag2);
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return NullChecker.a(m2479V4()) ? m2479V4().pageId() : "p_suggest_users_home_view";
    }
}
