package com.p046p1.mobile.putong.core.newui.home.frag.base;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p046p1.mobile.putong.core.p053ui.main.HomeMultiTabSwitcher;
import com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VFrame;
import p147v.VOnlineIndicator;
import p149l.bs30;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.g6a;
import p149l.hpd0;
import p149l.j760;
import p149l.j8w;
import p149l.k6w;
import p149l.k8l;
import p149l.mkd0;
import p149l.nwi0;
import p149l.nx0;
import p149l.o0x;
import p149l.o6j0;
import p149l.ogl0;
import p149l.psl;
import p149l.roj0;
import p149l.rvi0;
import p149l.t100;
import p149l.u59;
import p149l.upa;
import p149l.va40;
import p149l.vwb;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.xjc0;
import p149l.y9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeLayoutFrag extends BaseHomeLayoutFrag implements psl {

    /* JADX INFO: renamed from: C */
    public FrameLayout f23000C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f23001D;

    /* JADX INFO: renamed from: E */
    public HomeTitleBarRootLayout f23002E;

    /* JADX INFO: renamed from: F */
    public VFrame f23003F;

    /* JADX INFO: renamed from: G */
    public VOnlineIndicator f23004G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f23005H;

    /* JADX INFO: renamed from: I */
    public View f23006I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public HomeMultiTabSwitcher f23007J;

    /* JADX INFO: renamed from: K */
    public final e30<Integer> f23008K = new e30() { // from class: l.v7l
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f180395a.m38559X5((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$a */
    public class ViewOnClickListenerC7995a implements View.OnClickListener {
        public ViewOnClickListenerC7995a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            xdl0.m208344M(HomeLayoutFrag.this.f23004G, false);
            hpd0 hpd0Var = CoreModule.f17545c.f19639e0.f149337b4;
            Boolean bool = Boolean.TRUE;
            hpd0Var.put(bool);
            CoreModule.f17545c.f19639e0.f149163E1.onNext(bool);
            zvf0.m220396r("e_mode_switching", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$b */
    public class C7996b implements e30<roj0> {
        public C7996b() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(roj0 roj0Var) {
            HomeLayoutFrag homeLayoutFrag = HomeLayoutFrag.this;
            homeLayoutFrag.m38549L5(homeLayoutFrag.f22997A);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public static PutongFrag m38512C5() {
        return new HomeLayoutFrag();
    }

    /* JADX INFO: renamed from: J5 */
    private void m38513J5() {
        if (g6a.m124574w()) {
            ViewGroup viewGroup = (ViewGroup) this.f23000C.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m38514M5() {
        mo38564f1(NewTanFragTag.TOP_PICKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m38515O5(Bundle bundle) {
        if (upa.m194745e2()) {
            xdl0.m208329E0(this.f23003F, new ViewOnClickListenerC7995a());
            if (CoreModule.f17545c.f19639e0.m169468a8()) {
                m38509d5(null, null, NewTanFragTag.MARRY_MODE);
            }
        }
        if (CoreModule.f17545c.f19702z0.f106533Z.get().booleanValue()) {
            CoreModule.f17545c.f19702z0.f106533Z.put(Boolean.FALSE);
        }
        if (g6a.m124577z() && CoreModule.f17545c.f19647g2.m122580m3()) {
            CoreModule.f17545c.f19647g2.m122583p3();
            m38509d5(null, null, NewTanFragTag.YOUTH_VIP);
            return;
        }
        if (upa.m194655J3() && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
            String str = CoreModule.f17545c.f19639e0.f149257R3.get();
            NewTanFragTag newTanFragTag = NewTanFragTag.ALREADY_AUTH;
            if (TextUtils.equals(str, newTanFragTag.getTag())) {
                m38509d5(null, null, newTanFragTag);
                return;
            }
        }
        if (upa.m194758h0().enable && rvi0.m181292c()) {
            m38509d5(null, null, NewTanFragTag.WEBVIEW_CONFIG);
        } else {
            m38509d5(null, null, NewTanFragTag.HOME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m38516P5(Integer num) {
        if (NullChecker.m81303a(this.f23005H)) {
            if (NewTanFragTag.HOME == this.f22997A) {
                xdl0.m208327D0(num.intValue(), this.f23005H);
            } else {
                xdl0.m208327D0(xdl0.m208412y0(), this.f23005H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U5 */
    public /* synthetic */ void m38517U5(roj0 roj0Var) {
        if (NullChecker.m81303a(this.f23007J)) {
            this.f23007J.m47337B(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ User m38518g5(xaj0 xaj0Var) {
        return (User) xaj0Var.f191751a;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m38521j5(Throwable th) {
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m38522k5(Throwable th) {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m38530s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m38533v5(Throwable th) {
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m38534w5(Throwable th) {
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m38535x5(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public View m38538A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return k8l.m144945b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m38539B5(NewTanFragTag newTanFragTag) {
        if (this.f22997A == NewTanFragTag.UNKNOWN) {
            return;
        }
        if (NewTanFragTag.TOP_PICKS == newTanFragTag && NullChecker.m81303a(this.f23006I)) {
            this.f23006I.setBackground(null);
        }
        if (NewTanFragTag.HOME == newTanFragTag) {
            xdl0.m208327D0(va40.m197621c(), new View[0]);
        } else {
            xdl0.m208327D0(xdl0.m208412y0(), this.f23005H);
        }
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: C1 */
    public void mo38540C1(NewTanFragTag newTanFragTag, String str) {
        m38509d5(newTanFragTag, str, NewTanFragTag.HOME);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(vwb.m200311Y("插入每日精选tab", new d30() { // from class: l.x7l
            @Override // p149l.d30
            public final void call() {
                this.f191368a.m38514M5();
            }
        }));
        arrayListM200324f0.addAll(m38501V4().mo29633C4());
        return arrayListM200324f0;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo29634D4(MotionEvent motionEvent, boolean z) {
        return super.mo29634D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: D5 */
    public TitleSwitcher m38541D5() {
        return this.f23007J;
    }

    /* JADX INFO: renamed from: E5 */
    public final void m38542E5() {
        if (xdl0.m208349O0(this.f23004G)) {
            o6j0.m162864h("e_mode_switching_red_dot", "p_suggest_users_home_view", new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m38543F5() {
        try {
            if (upa.m194675N3()) {
                NewTanFragTag newTanFragTag = this.f22997A;
                if (newTanFragTag != NewTanFragTag.HOME && newTanFragTag != NewTanFragTag.UNKNOWN) {
                    xdl0.m208357U(this.f23000C, t100.m186890d(56.0f));
                    return;
                }
                xdl0.m208357U(this.f23000C, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G5 */
    public C22392a<NewTanFragTag> m38544G5() {
        return va40.f180703c;
    }

    /* JADX INFO: renamed from: H5 */
    public void m38545H5() {
        nx0 appTheme = act().getAppTheme();
        if (upa.m194847z()) {
            return;
        }
        View view = new View(act());
        this.f23006I = view;
        view.setBackgroundColor(appTheme.mo105493d());
        this.f23000C.addView(this.f23006I, new LinearLayout.LayoutParams(-1, 0));
        xdl0.m208398r0(this.f23006I);
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: I2 */
    public void mo38546I2(NewTanFragTag newTanFragTag) {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23007J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.mo47341h(newTanFragTag);
    }

    /* JADX INFO: renamed from: I5 */
    public final void m38547I5() {
        final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
        act().duringCreated((C22306c) j8w.INSTANCE.m140473a().m140422G0(), false).subscribe(mkd0.m154956H(new e30() { // from class: l.a8l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68053a.m38550N5(loveBuzzNotifyUserPop, (j760) obj);
            }
        }, new e30() { // from class: l.b8l
            @Override // p149l.e30
            public final void call(Object obj) {
                HomeLayoutFrag.m38521j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public void m38548K5() {
    }

    /* JADX INFO: renamed from: L5 */
    public void m38549L5(NewTanFragTag newTanFragTag) {
        xdl0.m208344M(this.f23003F, upa.m194745e2());
        HomeMultiTabSwitcher homeMultiTabSwitcher = new HomeMultiTabSwitcher(getContext());
        this.f23007J = homeMultiTabSwitcher;
        homeMultiTabSwitcher.m47366e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (nwi0.INSTANCE.m161873f()) {
            layoutParams.width = -1;
        }
        layoutParams.gravity = 19;
        this.f23007J.setTabSelected(newTanFragTag);
        this.f22997A = newTanFragTag;
        this.f23005H.removeAllViews();
        this.f23005H.addView(this.f23007J, layoutParams);
        this.f23007J.setOnTabClickListener(this.f23008K);
        this.f23007J.post(new Runnable() { // from class: l.w7l
            @Override // java.lang.Runnable
            public final void run() {
                this.f185063a.m38558W5();
            }
        });
        if (upa.m194723Z2() && !ogl0.m164222A() && !ogl0.m164223B()) {
            xdl0.m208344M(this.f23007J, false);
        }
        if (upa.m194715X2()) {
            boolean zEquals = CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode);
            VFrame vFrame = this.f23003F;
            if (!zEquals) {
                xdl0.m208344M(vFrame, false);
                xdl0.m208358V(this.f23005H, t100.f167259h);
            } else {
                xdl0.m208344M(vFrame, true);
                xdl0.m208344M(this.f23007J, true);
                xdl0.m208358V(this.f23005H, 0);
            }
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m38550N5(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, j760 j760Var) {
        k6w.INSTANCE.m144636e(act(), this.f23000C, j760Var, loveBuzzNotifyUserPop);
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: O */
    public LinearLayout mo38551O() {
        return this.f23002E;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m38552Q5(j760 j760Var) {
        m38542E5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m38553R5(NewTanFragTag newTanFragTag) {
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag())) {
            if (NullChecker.m81303a(this.f23007J)) {
                this.f23007J.m47337B(false);
            }
            e51.m114741F(act(), new Runnable() { // from class: l.y7l
                @Override // java.lang.Runnable
                public final void run() {
                    rvi0.m181297h();
                }
            });
            return;
        }
        boolean zM181295f = rvi0.m181295f();
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23007J;
        if (zM181295f) {
            if (NullChecker.m81303a(homeMultiTabSwitcher)) {
                this.f23007J.m47337B(true);
            }
        } else if (NullChecker.m81303a(homeMultiTabSwitcher)) {
            this.f23007J.m47337B(false);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m38554S5(TabName tabName) {
        return Boolean.valueOf(TextUtils.equals(this.f22997A.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag()));
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: T */
    public NewTanFragTag mo38555T() {
        return this.f22997A;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m38556T5(TabName tabName) {
        if (rvi0.m181293d()) {
            m38562Z5();
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m38557V5(User user) {
        if (((!TextUtils.equals(user.getUserInfoForMarryStatus(), "passed") || CoreModule.f17545c.f19639e0.f149337b4.get().booleanValue()) && !o0x.m162196e()) || !xjc0.m209690e(xjc0.f193198a)) {
            xdl0.m208344M(this.f23004G, false);
        } else {
            xdl0.m208344M(this.f23004G, true);
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m38558W5() {
        va40.m197626h(this.f23007J.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m38559X5(Integer num) {
        NewTanFragTag newTanFragTagM47365d = this.f23007J.m47365d(num.intValue());
        m38507b5(newTanFragTagM47365d);
        m38561Y5(newTanFragTagM47365d);
        if (g6a.m124574w()) {
            boolean zEquals = TextUtils.equals(newTanFragTagM47365d.getTag(), NewTanFragTag.HOME.getTag());
            FrameLayout frameLayout = this.f23000C;
            if (zEquals) {
                frameLayout.bringChildToFront(this.f23001D);
            } else {
                frameLayout.bringChildToFront(this.f23002E);
            }
        }
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: Y */
    public Frag mo38560Y() {
        return m38501V4();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m38561Y5(NewTanFragTag newTanFragTag) {
        if (NewTanFragTag.HOME.equals(newTanFragTag)) {
            zvf0.m220396r("e_swipe_nav_tab", "p_suggest_users_home_view");
        } else if (NewTanFragTag.TOP_PICKS.equals(newTanFragTag)) {
            nwi0.INSTANCE.m161871d();
        } else if (NewTanFragTag.PLAY_TOGETHER.equals(newTanFragTag)) {
            zvf0.m220396r("e_suggest_offline_party", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m38562Z5() {
        NewTanFragTag newTanFragTag = this.f22997A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2) {
            return false;
        }
        m38507b5(newTanFragTag2);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: e3 */
    public void mo38563e3() {
        if (NullChecker.m81303a(this.f23007J)) {
            this.f23007J.m47336A();
        }
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: f1 */
    public void mo38564f1(NewTanFragTag newTanFragTag) {
        va40.f180706f.add(newTanFragTag);
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23007J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.mo47341h(newTanFragTag);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.o7l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142513a.m38515O5((Bundle) obj);
            }
        });
        act().duringCreated(va40.f180704d).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.h8l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106452a.m38516P5((Integer) obj);
            }
        }));
        if (u59.m191823d0()) {
            m38547I5();
        }
        if (upa.m194758h0().enable) {
            duringCreated(m38544G5()).subscribe(mkd0.m154955G(new e30() { // from class: l.i8l
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112050a.m38553R5((NewTanFragTag) obj);
                }
            }));
            duringCreated(act().m39819i7().distinctUntilChanged().filter(new w9j() { // from class: l.j8l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f116723a.m38554S5((TabName) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.p7l
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147521a.m38556T5((TabName) obj);
                }
            }, new e30() { // from class: l.q7l
                @Override // p149l.e30
                public final void call(Object obj) {
                    HomeLayoutFrag.m38535x5((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19639e0.f149227N3).subscribe(mkd0.m154956H(new e30() { // from class: l.r7l
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f158047a.m38517U5((roj0) obj);
                }
            }, new e30() { // from class: l.s7l
                @Override // p149l.e30
                public final void call(Object obj) {
                    HomeLayoutFrag.m38534w5((Throwable) obj);
                }
            }));
        }
        if (upa.m194745e2()) {
            duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), CoreModule.f17545c.f19639e0.f149337b4.obs().distinctUntilChanged(), CoreModule.f17545c.f19639e0.f149441o4.obs().distinctUntilChanged(), new y9j() { // from class: l.t7l
                @Override // p149l.y9j
                /* JADX INFO: renamed from: a */
                public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                    return new xaj0((User) obj, (Boolean) obj2, (String) obj3);
                }
            }).map(new w9j() { // from class: l.u7l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return HomeLayoutFrag.m38518g5((xaj0) obj);
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.z7l
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f202040a.m38557V5((User) obj);
                }
            }, new e30() { // from class: l.c8l
                @Override // p149l.e30
                public final void call(Object obj) {
                    HomeLayoutFrag.m38530s5((Throwable) obj);
                }
            }));
            duringCreated(mkd0.m154984r(act().m39819i7().distinctUntilChanged(), act().lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.d8l
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    j760 j760Var = (j760) obj;
                    return Boolean.valueOf(j760Var.f116565b == C4319c.f15548i && TextUtils.equals(((TabName) j760Var.f116564a).name(), TabName.Card.name()));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.e8l
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f89834a.m38552Q5((j760) obj);
                }
            }, new e30() { // from class: l.f8l
                @Override // p149l.e30
                public final void call(Object obj) {
                    HomeLayoutFrag.m38533v5((Throwable) obj);
                }
            }));
            if (upa.m194715X2()) {
                duringCreated(CoreModule.f17545c.f19639e0.f149170F1).subscribe(mkd0.m154956H(new C7996b(), new e30() { // from class: l.g8l
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        HomeLayoutFrag.m38522k5((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag
    /* JADX INFO: renamed from: f5 */
    public void mo38511f5() {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23007J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.setTabSelected(this.f22997A);
        m38539B5(this.f22997A);
        if (this.f22997A == NewTanFragTag.HOME) {
            CoreModule.f17545c.f19663m0.m31143s6("initiative", "tab", null);
        }
        m38543F5();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        m38513J5();
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag, com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM38538A5 = m38538A5(layoutInflater, viewGroup);
        xdl0.m208376g0(this.f23002E);
        xdl0.m208398r0(this.f23002E);
        m38545H5();
        m38549L5(this.f22997A);
        m38539B5(this.f22997A);
        m38548K5();
        m38543F5();
        return viewM38538A5;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: k4 */
    public boolean mo20591k4() {
        return true;
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: n2 */
    public void mo38565n2(NewTanFragTag newTanFragTag) {
        if (this.f23007J == null) {
            return;
        }
        if (upa.m194745e2() && CoreModule.f17545c.f19639e0.m169468a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        this.f23007J.setTabSelected(newTanFragTag);
    }

    @Override // p149l.psl
    /* JADX INFO: renamed from: o */
    public boolean mo38566o() {
        if (upa.m194675N3() && this.f22997A == NewTanFragTag.HOME && ExpandedCardStyleHelper.m38090o().m38092f()) {
            return true;
        }
        NewTanFragTag newTanFragTag = this.f22997A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2 || newTanFragTag == NewTanFragTag.MARRY_MODE) {
            return false;
        }
        m38507b5(newTanFragTag2);
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return NullChecker.m81303a(m38501V4()) ? m38501V4().pageId() : "p_suggest_users_home_view";
    }
}
