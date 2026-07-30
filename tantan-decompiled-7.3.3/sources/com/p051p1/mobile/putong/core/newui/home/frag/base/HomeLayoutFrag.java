package com.p051p1.mobile.putong.core.newui.home.frag.base;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.android.statistic.AutoSpeedFrameLayout;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.pop.LoveBuzzNotifyUserPop;
import com.p051p1.mobile.putong.core.p058ui.main.HomeMultiTabSwitcher;
import com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VFrame;
import p151v.VOnlineIndicator;
import p153l.abl;
import p153l.bkj0;
import p153l.bnl0;
import p153l.cvl;
import p153l.d79;
import p153l.esc0;
import p153l.gra;
import p153l.haw;
import p153l.i4g0;
import p153l.i8w;
import p153l.jj40;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.n3x;
import p153l.p040;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.r5j0;
import p153l.s7a;
import p153l.scj;
import p153l.sfj0;
import p153l.spl0;
import p153l.ux0;
import p153l.uxj0;
import p153l.v4j0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeLayoutFrag extends BaseHomeLayoutFrag implements cvl {

    /* JADX INFO: renamed from: C */
    public FrameLayout f23742C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f23743D;

    /* JADX INFO: renamed from: E */
    public HomeTitleBarRootLayout f23744E;

    /* JADX INFO: renamed from: F */
    public VFrame f23745F;

    /* JADX INFO: renamed from: G */
    public VOnlineIndicator f23746G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f23747H;

    /* JADX INFO: renamed from: I */
    public View f23748I;

    /* JADX INFO: renamed from: J */
    @Nullable
    public HomeMultiTabSwitcher f23749J;

    /* JADX INFO: renamed from: K */
    public final y20<Integer> f23750K = new y20() { // from class: l.lal
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f130708a.m39562X5((Integer) obj);
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$a */
    public class ViewOnClickListenerC8146a implements View.OnClickListener {
        public ViewOnClickListenerC8146a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            bnl0.m105524M(HomeLayoutFrag.this.f23746G, false);
            jxd0 jxd0Var = CoreModule.f18264c.f20381e0.f89194b4;
            Boolean bool = Boolean.TRUE;
            jxd0Var.put(bool);
            CoreModule.f18264c.f20381e0.f89020E1.onNext(bool);
            i4g0.m138520r("e_mode_switching", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag$b */
    public class C8147b implements y20<uxj0> {
        public C8147b() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(uxj0 uxj0Var) {
            HomeLayoutFrag homeLayoutFrag = HomeLayoutFrag.this;
            homeLayoutFrag.m39552L5(homeLayoutFrag.f23739A);
        }
    }

    /* JADX INFO: renamed from: C5 */
    public static PutongFrag m39515C5() {
        return new HomeLayoutFrag();
    }

    /* JADX INFO: renamed from: J5 */
    private void m39516J5() {
        if (s7a.m184994w()) {
            ViewGroup viewGroup = (ViewGroup) this.f23742C.getParent();
            if (viewGroup instanceof AutoSpeedFrameLayout) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M5 */
    public /* synthetic */ void m39517M5() {
        mo39567f1(NewTanFragTag.TOP_PICKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O5 */
    public /* synthetic */ void m39518O5(Bundle bundle) {
        if (gra.m131676e2()) {
            bnl0.m105509E0(this.f23745F, new ViewOnClickListenerC8146a());
            if (CoreModule.f18264c.f20381e0.m116541a8()) {
                m39512d5(null, null, NewTanFragTag.MARRY_MODE);
            }
        }
        if (CoreModule.f18264c.f20444z0.f178198Z.get().booleanValue()) {
            CoreModule.f18264c.f20444z0.f178198Z.put(Boolean.FALSE);
        }
        if (s7a.m184997z() && CoreModule.f18264c.f20389g2.m192270m3()) {
            CoreModule.f18264c.f20389g2.m192273p3();
            m39512d5(null, null, NewTanFragTag.YOUTH_VIP);
            return;
        }
        if (gra.m131586J3() && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
            String str = CoreModule.f18264c.f20381e0.f89114R3.get();
            NewTanFragTag newTanFragTag = NewTanFragTag.ALREADY_AUTH;
            if (TextUtils.equals(str, newTanFragTag.getTag())) {
                m39512d5(null, null, newTanFragTag);
                return;
            }
        }
        if (gra.m131689h0().enable && v4j0.m199705c()) {
            m39512d5(null, null, NewTanFragTag.WEBVIEW_CONFIG);
        } else {
            m39512d5(null, null, NewTanFragTag.HOME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P5 */
    public /* synthetic */ void m39519P5(Integer num) {
        if (NullChecker.m82486a(this.f23747H)) {
            if (NewTanFragTag.HOME == this.f23739A) {
                bnl0.m105507D0(num.intValue(), this.f23747H);
            } else {
                bnl0.m105507D0(bnl0.m105592y0(), this.f23747H);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U5 */
    public /* synthetic */ void m39520U5(uxj0 uxj0Var) {
        if (NullChecker.m82486a(this.f23749J)) {
            this.f23749J.m48520B(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g5 */
    public static /* synthetic */ User m39521g5(bkj0 bkj0Var) {
        return (User) bkj0Var.f77081a;
    }

    /* JADX INFO: renamed from: j5 */
    public static /* synthetic */ void m39524j5(Throwable th) {
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m39525k5(Throwable th) {
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m39533s5(Throwable th) {
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m39536v5(Throwable th) {
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ void m39537w5(Throwable th) {
    }

    /* JADX INFO: renamed from: x5 */
    public static /* synthetic */ void m39538x5(Throwable th) {
    }

    /* JADX INFO: renamed from: A5 */
    public View m39541A5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return abl.m96772b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return false;
    }

    /* JADX INFO: renamed from: B5 */
    public void m39542B5(NewTanFragTag newTanFragTag) {
        if (this.f23739A == NewTanFragTag.UNKNOWN) {
            return;
        }
        if (NewTanFragTag.TOP_PICKS == newTanFragTag && NullChecker.m82486a(this.f23748I)) {
            this.f23748I.setBackground(null);
        }
        if (NewTanFragTag.HOME == newTanFragTag) {
            bnl0.m105507D0(jj40.m145000c(), new View[0]);
        } else {
            bnl0.m105507D0(bnl0.m105592y0(), this.f23747H);
        }
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: C1 */
    public void mo39543C1(NewTanFragTag newTanFragTag, String str) {
        m39512d5(newTanFragTag, str, NewTanFragTag.HOME);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(jyb.m147494Y("插入每日精选tab", new x20() { // from class: l.nal
            @Override // p153l.x20
            public final void call() {
                this.f141026a.m39517M5();
            }
        }));
        arrayListM147507f0.addAll(m39504V4().mo30631C4());
        return arrayListM147507f0;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: D4 */
    public boolean mo30632D4(MotionEvent motionEvent, boolean z) {
        return super.mo30632D4(motionEvent, z);
    }

    /* JADX INFO: renamed from: D5 */
    public TitleSwitcher m39544D5() {
        return this.f23749J;
    }

    /* JADX INFO: renamed from: E5 */
    public final void m39545E5() {
        if (bnl0.m105529O0(this.f23746G)) {
            sfj0.m185601h("e_mode_switching_red_dot", "p_suggest_users_home_view", new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: F5 */
    public final void m39546F5() {
        try {
            if (gra.m131606N3()) {
                NewTanFragTag newTanFragTag = this.f23739A;
                if (newTanFragTag != NewTanFragTag.HOME && newTanFragTag != NewTanFragTag.UNKNOWN) {
                    bnl0.m105537U(this.f23742C, qa00.m175859d(56.0f));
                    return;
                }
                bnl0.m105537U(this.f23742C, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: G5 */
    public C22507a<NewTanFragTag> m39547G5() {
        return jj40.f121140c;
    }

    /* JADX INFO: renamed from: H5 */
    public void m39548H5() {
        ux0 appTheme = act().getAppTheme();
        if (gra.m131778z()) {
            return;
        }
        View view = new View(act());
        this.f23748I = view;
        view.setBackgroundColor(appTheme.mo134824d());
        this.f23742C.addView(this.f23748I, new LinearLayout.LayoutParams(-1, 0));
        bnl0.m105578r0(this.f23748I);
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: I2 */
    public void mo39549I2(NewTanFragTag newTanFragTag) {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23749J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.mo48524h(newTanFragTag);
    }

    /* JADX INFO: renamed from: I5 */
    public final void m39550I5() {
        final LoveBuzzNotifyUserPop loveBuzzNotifyUserPop = new LoveBuzzNotifyUserPop(act());
        act().duringCreated((C22421c) haw.INSTANCE.m134320a().m134269G0(), false).subscribe(psd0.m173597H(new y20() { // from class: l.qal
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156394a.m39553N5(loveBuzzNotifyUserPop, (pf60) obj);
            }
        }, new y20() { // from class: l.ral
            @Override // p153l.y20
            public final void call(Object obj) {
                HomeLayoutFrag.m39524j5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public void m39551K5() {
    }

    /* JADX INFO: renamed from: L5 */
    public void m39552L5(NewTanFragTag newTanFragTag) {
        bnl0.m105524M(this.f23745F, gra.m131676e2());
        HomeMultiTabSwitcher homeMultiTabSwitcher = new HomeMultiTabSwitcher(getContext());
        this.f23749J = homeMultiTabSwitcher;
        homeMultiTabSwitcher.m48549e();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (r5j0.INSTANCE.m179869f()) {
            layoutParams.width = -1;
        }
        layoutParams.gravity = 19;
        this.f23749J.setTabSelected(newTanFragTag);
        this.f23739A = newTanFragTag;
        this.f23747H.removeAllViews();
        this.f23747H.addView(this.f23749J, layoutParams);
        this.f23749J.setOnTabClickListener(this.f23750K);
        this.f23749J.post(new Runnable() { // from class: l.mal
            @Override // java.lang.Runnable
            public final void run() {
                this.f135559a.m39561W5();
            }
        });
        if (gra.m131654Z2() && !spl0.m187349A() && !spl0.m187350B()) {
            bnl0.m105524M(this.f23749J, false);
        }
        if (gra.m131646X2()) {
            boolean zEquals = CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode);
            VFrame vFrame = this.f23745F;
            if (!zEquals) {
                bnl0.m105524M(vFrame, false);
                bnl0.m105538V(this.f23747H, qa00.f156321h);
            } else {
                bnl0.m105524M(vFrame, true);
                bnl0.m105524M(this.f23749J, true);
                bnl0.m105538V(this.f23747H, 0);
            }
        }
    }

    /* JADX INFO: renamed from: N5 */
    public final /* synthetic */ void m39553N5(LoveBuzzNotifyUserPop loveBuzzNotifyUserPop, pf60 pf60Var) {
        i8w.INSTANCE.m139033e(act(), this.f23742C, pf60Var, loveBuzzNotifyUserPop);
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: O */
    public LinearLayout mo39554O() {
        return this.f23744E;
    }

    /* JADX INFO: renamed from: Q5 */
    public final /* synthetic */ void m39555Q5(pf60 pf60Var) {
        m39545E5();
    }

    /* JADX INFO: renamed from: R5 */
    public final /* synthetic */ void m39556R5(NewTanFragTag newTanFragTag) {
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag())) {
            if (NullChecker.m82486a(this.f23749J)) {
                this.f23749J.m48520B(false);
            }
            l51.m152886F(act(), new Runnable() { // from class: l.oal
                @Override // java.lang.Runnable
                public final void run() {
                    v4j0.m199710h();
                }
            });
            return;
        }
        boolean zM199708f = v4j0.m199708f();
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23749J;
        if (zM199708f) {
            if (NullChecker.m82486a(homeMultiTabSwitcher)) {
                this.f23749J.m48520B(true);
            }
        } else if (NullChecker.m82486a(homeMultiTabSwitcher)) {
            this.f23749J.m48520B(false);
        }
    }

    /* JADX INFO: renamed from: S5 */
    public final /* synthetic */ Boolean m39557S5(TabName tabName) {
        return Boolean.valueOf(TextUtils.equals(this.f23739A.getTag(), NewTanFragTag.WEBVIEW_CONFIG.getTag()));
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: T */
    public NewTanFragTag mo39558T() {
        return this.f23739A;
    }

    /* JADX INFO: renamed from: T5 */
    public final /* synthetic */ void m39559T5(TabName tabName) {
        if (v4j0.m199706d()) {
            m39565Z5();
        }
    }

    /* JADX INFO: renamed from: V5 */
    public final /* synthetic */ void m39560V5(User user) {
        if (((!TextUtils.equals(user.getUserInfoForMarryStatus(), "passed") || CoreModule.f18264c.f20381e0.f89194b4.get().booleanValue()) && !n3x.m161364e()) || !esc0.m122318e(esc0.f95585a)) {
            bnl0.m105524M(this.f23746G, false);
        } else {
            bnl0.m105524M(this.f23746G, true);
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final /* synthetic */ void m39561W5() {
        jj40.m145005h(this.f23749J.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: X5 */
    public final /* synthetic */ void m39562X5(Integer num) {
        NewTanFragTag newTanFragTagM48548d = this.f23749J.m48548d(num.intValue());
        m39510b5(newTanFragTagM48548d);
        m39564Y5(newTanFragTagM48548d);
        if (s7a.m184994w()) {
            boolean zEquals = TextUtils.equals(newTanFragTagM48548d.getTag(), NewTanFragTag.HOME.getTag());
            FrameLayout frameLayout = this.f23742C;
            if (zEquals) {
                frameLayout.bringChildToFront(this.f23743D);
            } else {
                frameLayout.bringChildToFront(this.f23744E);
            }
        }
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: Y */
    public Frag mo39563Y() {
        return m39504V4();
    }

    /* JADX INFO: renamed from: Y5 */
    public void m39564Y5(NewTanFragTag newTanFragTag) {
        if (NewTanFragTag.HOME.equals(newTanFragTag)) {
            i4g0.m138520r("e_swipe_nav_tab", "p_suggest_users_home_view");
        } else if (NewTanFragTag.TOP_PICKS.equals(newTanFragTag)) {
            r5j0.INSTANCE.m179867d();
        } else if (NewTanFragTag.PLAY_TOGETHER.equals(newTanFragTag)) {
            i4g0.m138520r("e_suggest_offline_party", "p_suggest_users_home_view");
        }
    }

    /* JADX INFO: renamed from: Z5 */
    public boolean m39565Z5() {
        NewTanFragTag newTanFragTag = this.f23739A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2) {
            return false;
        }
        m39510b5(newTanFragTag2);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: e3 */
    public void mo39566e3() {
        if (NullChecker.m82486a(this.f23749J)) {
            this.f23749J.m48519A();
        }
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: f1 */
    public void mo39567f1(NewTanFragTag newTanFragTag) {
        jj40.f121143f.add(newTanFragTag);
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23749J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.mo48524h(newTanFragTag);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.eal
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92790a.m39518O5((Bundle) obj);
            }
        });
        act().duringCreated(jj40.f121141d).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.xal
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193047a.m39519P5((Integer) obj);
            }
        }));
        if (d79.m114675e0()) {
            m39550I5();
        }
        if (gra.m131689h0().enable) {
            duringCreated(m39547G5()).subscribe(psd0.m173596G(new y20() { // from class: l.yal
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f198222a.m39556R5((NewTanFragTag) obj);
                }
            }));
            duringCreated(act().m40829o7().distinctUntilChanged().filter(new qcj() { // from class: l.zal
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f203583a.m39557S5((TabName) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.fal
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97989a.m39559T5((TabName) obj);
                }
            }, new y20() { // from class: l.gal
                @Override // p153l.y20
                public final void call(Object obj) {
                    HomeLayoutFrag.m39538x5((Throwable) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20381e0.f89084N3).subscribe(psd0.m173597H(new y20() { // from class: l.hal
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f108506a.m39520U5((uxj0) obj);
                }
            }, new y20() { // from class: l.ial
                @Override // p153l.y20
                public final void call(Object obj) {
                    HomeLayoutFrag.m39537w5((Throwable) obj);
                }
            }));
        }
        if (gra.m131676e2()) {
            duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), CoreModule.f18264c.f20381e0.f89194b4.obs().distinctUntilChanged(), CoreModule.f18264c.f20381e0.f89298o4.obs().distinctUntilChanged(), new scj() { // from class: l.jal
                @Override // p153l.scj
                /* JADX INFO: renamed from: a */
                public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                    return new bkj0((User) obj, (Boolean) obj2, (String) obj3);
                }
            }).map(new qcj() { // from class: l.kal
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return HomeLayoutFrag.m39521g5((bkj0) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.pal
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f151289a.m39560V5((User) obj);
                }
            }, new y20() { // from class: l.sal
                @Override // p153l.y20
                public final void call(Object obj) {
                    HomeLayoutFrag.m39533s5((Throwable) obj);
                }
            }));
            duringCreated(psd0.m173625r(act().m40829o7().distinctUntilChanged(), act().lifecycle().distinctUntilChanged(), new p040()).filter(new qcj() { // from class: l.tal
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    pf60 pf60Var = (pf60) obj;
                    return Boolean.valueOf(pf60Var.f152157b == C4470c.f16267i && TextUtils.equals(((TabName) pf60Var.f152156a).name(), TabName.Card.name()));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.ual
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178218a.m39555Q5((pf60) obj);
                }
            }, new y20() { // from class: l.val
                @Override // p153l.y20
                public final void call(Object obj) {
                    HomeLayoutFrag.m39536v5((Throwable) obj);
                }
            }));
            if (gra.m131646X2()) {
                duringCreated(CoreModule.f18264c.f20381e0.f89027F1).subscribe(psd0.m173597H(new C8147b(), new y20() { // from class: l.wal
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        HomeLayoutFrag.m39525k5((Throwable) obj);
                    }
                }));
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag
    /* JADX INFO: renamed from: f5 */
    public void mo39514f5() {
        HomeMultiTabSwitcher homeMultiTabSwitcher = this.f23749J;
        if (homeMultiTabSwitcher == null) {
            return;
        }
        homeMultiTabSwitcher.setTabSelected(this.f23739A);
        m39542B5(this.f23739A);
        if (this.f23739A == NewTanFragTag.HOME) {
            CoreModule.f18264c.f20405m0.m32146s6("initiative", "tab", null);
        }
        m39546F5();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        m39516J5();
    }

    @Override // com.p051p1.mobile.putong.core.newui.home.frag.base.BaseHomeLayoutFrag, com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM39541A5 = m39541A5(layoutInflater, viewGroup);
        bnl0.m105556g0(this.f23744E);
        bnl0.m105578r0(this.f23744E);
        m39548H5();
        m39552L5(this.f23739A);
        m39542B5(this.f23739A);
        m39551K5();
        m39546F5();
        return viewM39541A5;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: k4 */
    public boolean mo21590k4() {
        return true;
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: n2 */
    public void mo39568n2(NewTanFragTag newTanFragTag) {
        if (this.f23749J == null) {
            return;
        }
        if (gra.m131676e2() && CoreModule.f18264c.f20381e0.m116541a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        this.f23749J.setTabSelected(newTanFragTag);
    }

    @Override // p153l.cvl
    /* JADX INFO: renamed from: o */
    public boolean mo39569o() {
        if (gra.m131606N3() && this.f23739A == NewTanFragTag.HOME && ExpandedCardStyleHelper.m39093o().m39095f()) {
            return true;
        }
        NewTanFragTag newTanFragTag = this.f23739A;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.HOME;
        if (newTanFragTag == newTanFragTag2 || newTanFragTag == NewTanFragTag.MARRY_MODE) {
            return false;
        }
        m39510b5(newTanFragTag2);
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return NullChecker.m82486a(m39504V4()) ? m39504V4().pageId() : "p_suggest_users_home_view";
    }
}
