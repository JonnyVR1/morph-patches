package com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p046p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSubTab;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p046p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p046p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p149l.b8c0;
import p149l.c8c0;
import p149l.d30;
import p149l.e16;
import p149l.e30;
import p149l.f1c0;
import p149l.f5c0;
import p149l.ffw;
import p149l.g1c0;
import p149l.gld0;
import p149l.h3c0;
import p149l.hl3;
import p149l.mji0;
import p149l.n3o;
import p149l.ppr;
import p149l.qib0;
import p149l.s2u;
import p149l.s9s;
import p149l.t100;
import p149l.t4o;
import p149l.v7o;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.yb2;
import p149l.zvf0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareMainSubFrag extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public TabLayout f45668A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f45669B;

    /* JADX INFO: renamed from: C */
    public NoSaveStateViewPager f45670C;

    /* JADX INFO: renamed from: D */
    public n3o f45671D;

    /* JADX INFO: renamed from: E */
    public BLiveSkinConfig f45672E;

    /* JADX INFO: renamed from: H */
    public d30 f45675H;

    /* JADX INFO: renamed from: z */
    public FrameLayout f45677z;

    /* JADX INFO: renamed from: F */
    public e30<String> f45673F = null;

    /* JADX INFO: renamed from: G */
    public String f45674G = "";

    /* JADX INFO: renamed from: I */
    public final TabLayout.OnTabSelectedListener f45676I = new C12544a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag$a */
    public class C12544a implements TabLayout.OnTabSelectedListener {
        public C12544a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getCustomView() != null && "square-suggested".equals(tab.getCustomView().getTag())) {
                zvf0.m220396r("e_live_top_tab", "p_audio_explore_recommend");
            }
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            if (textView != null) {
                s2u.m182085q(textView.getTag().toString(), true);
                mji0.m154821o(textView, b8c0.f74088e);
            }
            tab.view.setBackgroundResource(h3c0.f105687m);
            if (IntlLiveSquareMainSubFrag.this.f45672E == null || IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig == null) {
                return;
            }
            if (!TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.selectBgColor)) {
                tab.view.setBackground(yb2.m213876a(Color.parseColor(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.selectBgColor), t100.f167261j, false));
            }
            if (textView == null || TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.selectTextColor)) {
                return;
            }
            textView.setTextColor(Color.parseColor(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.selectTextColor));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(f5c0.f95111k2);
            tab.view.setBackgroundColor(0);
            if (textView != null) {
                s2u.m182085q(textView.getTag().toString(), false);
                mji0.m154821o(textView, b8c0.f74089f);
            }
            if (IntlLiveSquareMainSubFrag.this.f45672E == null || IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig == null) {
                return;
            }
            if (textView != null) {
                textView.setTextColor(!TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.unSelectTextColor) ? Color.parseColor(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.unSelectTextColor) : -1);
            }
            if (TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.unSelectBgColor)) {
                return;
            }
            tab.view.setBackground(yb2.m213876a(Color.parseColor(IntlLiveSquareMainSubFrag.this.f45672E.topTabBarConfig.subTabConfig.unSelectBgColor), t100.f167261j, false));
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m70116B5(String str) {
        FrameLayout frameLayout = this.f45669B;
        if (frameLayout != null) {
            for (int childCount = frameLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.f45669B.getChildAt(childCount) != null && this.f45669B.getChildAt(childCount).getTag() != null && (this.f45669B.getChildAt(childCount).getTag() instanceof String) && TextUtils.equals(str, (String) this.f45669B.getChildAt(childCount).getTag())) {
                    FrameLayout frameLayout2 = this.f45669B;
                    frameLayout2.removeView(frameLayout2.getChildAt(childCount));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public /* synthetic */ void m70117D5(String str) {
        if (this.f45668A.getTabCount() > 0) {
            this.f45673F.call(str);
        } else {
            this.f45674G = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5, reason: merged with bridge method [inline-methods] */
    public void m70139H5(final String str, final boolean z) {
        if (this.f45670C == null || this.f45668A == null) {
            this.f45675H = new d30() { // from class: l.j4o
                @Override // p149l.d30
                public final void call() {
                    this.f116210a.m70139H5(str, z);
                }
            };
            return;
        }
        this.f45675H = null;
        if (z) {
            m70119L5(str);
        } else {
            m70116B5(str);
        }
    }

    /* JADX INFO: renamed from: L5 */
    private void m70119L5(String str) {
        if (this.f45669B != null) {
            int measuredWidth = 0;
            for (int i = 0; i < this.f45668A.getTabCount(); i++) {
                if (this.f45668A.getTabAt(i) != null && this.f45668A.getTabAt(i).getCustomView() != null && this.f45668A.getTabAt(i).getCustomView().getTag() != null && (this.f45668A.getTabAt(i).getCustomView().getTag() instanceof String)) {
                    measuredWidth += this.f45668A.getTabAt(i).getCustomView().getMeasuredWidth();
                    String str2 = (String) this.f45668A.getTabAt(i).getCustomView().getTag();
                    if (measuredWidth > 0 && TextUtils.equals(str, str2)) {
                        ImageView imageView = new ImageView(getContext());
                        imageView.setImageResource(h3c0.f105700q0);
                        int i2 = t100.f167261j;
                        this.f45669B.addView(imageView, new FrameLayout.LayoutParams(i2, i2));
                        xdl0.m208358V(imageView, measuredWidth - t100.f167260i);
                        imageView.setTag(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m70131v5(Throwable th) {
    }

    /* JADX INFO: renamed from: z5 */
    private C22392a<ppr> m70133z5() {
        return ((hl3) s9s.m182763m(gld0.f103313c)).f108309b;
    }

    /* JADX INFO: renamed from: A5 */
    public LiveSquareBaseFrag m70134A5() {
        NoSaveStateViewPager noSaveStateViewPager;
        n3o n3oVar = this.f45671D;
        if (n3oVar == null || (noSaveStateViewPager = this.f45670C) == null) {
            return null;
        }
        return (LiveSquareBaseFrag) n3oVar.getItem(noSaveStateViewPager.getCurrentItem());
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m70135C5(String str) {
        for (int i = 0; i < this.f45668A.getTabCount(); i++) {
            if (this.f45668A.getTabAt(i) != null && this.f45668A.getTabAt(i).getCustomView() != null && this.f45668A.getTabAt(i).getCustomView().getTag() != null && (this.f45668A.getTabAt(i).getCustomView().getTag() instanceof String) && TextUtils.equals(str, (String) this.f45668A.getTabAt(i).getCustomView().getTag())) {
                this.f45670C.m4176T(i, false);
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m70136E5(BLiveSkinConfig bLiveSkinConfig) {
        if (TEnum.equals(qib0.f154719h0, "unknown_")) {
            return;
        }
        m70140I5(bLiveSkinConfig);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m70137F5(ppr pprVar) {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters;
        BLiveSquareDetailCounters bLiveSquareDetailCounters;
        int iM170765g = pprVar.m170765g();
        BLiveActivitySummary bLiveActivitySummaryM170762d = pprVar.m170762d();
        if (bLiveActivitySummaryM170762d == null || iM170765g != 0 || (bLiveActivitySummaryCounters = bLiveActivitySummaryM170762d.counters) == null || (bLiveSquareDetailCounters = bLiveActivitySummaryCounters.squareDetail) == null) {
            m70139H5("square-intlFollowing", false);
        } else {
            m70139H5("square-intlFollowing", bLiveSquareDetailCounters.unreadCount > 0);
        }
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m70138G5(int i, View view) {
        if (i != this.f45670C.getCurrentItem()) {
            this.f45670C.m4176T(i, true);
        } else if (s9s.f163228b.m195650I6()) {
            mo68932Y4();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public void m70140I5(BLiveSkinConfig bLiveSkinConfig) {
        this.f45672E = bLiveSkinConfig;
        if (this.f45668A != null) {
            for (int i = 0; i < this.f45668A.getTabCount(); i++) {
                m70141J5(this.f45668A.getTabAt(i), bLiveSkinConfig);
            }
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m70141J5(TabLayout.Tab tab, BLiveSkinConfig bLiveSkinConfig) {
        View customView;
        int iM114375c;
        BLiveTopBarConfig bLiveTopBarConfig;
        BLiveTopBarConfig bLiveTopBarConfig2;
        BLiveTopBarConfig bLiveTopBarConfig3;
        if (tab == null || (customView = tab.getCustomView()) == null) {
            return;
        }
        TextView textView = (TextView) customView.findViewById(f5c0.f95111k2);
        boolean zIsSelected = tab.isSelected();
        if (zIsSelected) {
            iM114375c = (bLiveSkinConfig == null || (bLiveTopBarConfig3 = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig3.subTabConfig.selectTextColor)) ? e16.m114375c(s9s.f163227a, g1c0.f100170y) : Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.selectTextColor);
        } else {
            iM114375c = (bLiveSkinConfig == null || (bLiveTopBarConfig = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig.subTabConfig.unSelectTextColor)) ? e16.m114375c(s9s.f163227a, g1c0.f100152g) : Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.unSelectTextColor);
        }
        textView.setTextColor(iM114375c);
        if (bLiveSkinConfig == null || (bLiveTopBarConfig2 = bLiveSkinConfig.topTabBarConfig) == null) {
            return;
        }
        if (zIsSelected) {
            if (TextUtils.isEmpty(bLiveTopBarConfig2.subTabConfig.selectBgColor)) {
                return;
            }
            tab.view.setBackground(yb2.m213876a(Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.selectBgColor), t100.f167261j, false));
        } else {
            if (TextUtils.isEmpty(bLiveTopBarConfig2.subTabConfig.unSelectBgColor)) {
                return;
            }
            tab.view.setBackground(yb2.m213876a(Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.unSelectBgColor), t100.f167261j, false));
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo68932Y4() {
        NoSaveStateViewPager noSaveStateViewPager = this.f45670C;
        if (noSaveStateViewPager == null || noSaveStateViewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((n3o) this.f45670C.getAdapter()).getItem(this.f45670C.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo68932Y4();
        }
    }

    @Override // com.p046p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f45673F = new e30() { // from class: l.m4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131311a.m70135C5((String) obj);
            }
        };
        duringCreated(s2u.m182075g()).filter(new w9j() { // from class: l.n4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.o4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141804a.m70117D5((String) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.p4o
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return s9s.f163228b.m121231l(false);
            }
        }, false).filter(new w9j() { // from class: l.q4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLiveSettings bLiveSettings = (BLiveSettings) obj;
                return Boolean.valueOf((bLiveSettings == null || bLiveSettings.liveSkinConfig == null) ? false : true);
            }
        }).map(new w9j() { // from class: l.r4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSettings) obj).liveSkinConfig;
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.s4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162456a.m70136E5((BLiveSkinConfig) obj);
            }
        }));
        duringCreated(m70133z5().asObservable()).subscribe(ffw.m121194e(new e30() { // from class: l.h4o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105862a.m70137F5((ppr) obj);
            }
        }, new e30() { // from class: l.i4o
            @Override // p149l.e30
            public final void call(Object obj) {
                IntlLiveSquareMainSubFrag.m70131v5((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f45668A.addOnTabSelectedListener(this.f45676I);
        this.f45668A.setTabRippleColorResource(f1c0.f94077n);
        this.f45668A.setTabGravity(1);
        this.f45668A.setSelectedTabIndicator(new ColorDrawable(0));
        this.f45668A.setTabMode(0);
        xdl0.m208360X(this.f45670C, t100.m186890d(48.0f));
        List<BLiveSquareSubTab> listM195989y5 = s9s.f163228b.m195989y5();
        if (vwb.m200296J(listM195989y5)) {
            return;
        }
        m70143y5(listM195989y5.size() <= 1);
        ArrayList arrayListM200303Q = vwb.m200303Q(listM195989y5, new w9j() { // from class: l.g4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveSquareSubTab) obj).convertToSquareTab();
            }
        });
        int iM200293G = vwb.m200293G(arrayListM200303Q, new w9j() { // from class: l.k4o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("square-suggested", ((BLiveSquareTab) obj).name));
            }
        });
        n3o n3oVar = new n3o(getChildFragmentManager(), arrayListM200303Q, 0, 0, m70813Z4());
        this.f45671D = n3oVar;
        this.f45670C.setAdapter(n3oVar);
        this.f45668A.setupWithViewPager(this.f45670C);
        if (iM200293G >= 0 && iM200293G < this.f45671D.getCount()) {
            this.f45670C.setCurrentItem(iM200293G);
        }
        for (final int i = 0; i < this.f45668A.getTabCount(); i++) {
            BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) arrayListM200303Q.get(i);
            TabLayout.Tab tabAt = this.f45668A.getTabAt(i);
            if (tabAt != null) {
                View viewM197382a = v7o.m197382a(act(), bLiveSquareTab);
                xdl0.m208329E0(viewM197382a, new View.OnClickListener() { // from class: l.l4o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f126048a.m70138G5(i, view);
                    }
                });
                tabAt.setCustomView(viewM197382a);
                if (viewM197382a.getParent() == null || bLiveSquareTab.title.length() > 2) {
                    xdl0.m208370d0(viewM197382a, t100.m186890d(12.0f));
                    xdl0.m208372e0(viewM197382a, t100.m186890d(12.0f));
                } else {
                    ViewGroup.LayoutParams layoutParams = ((View) viewM197382a.getParent()).getLayoutParams();
                    layoutParams.width = t100.f167228C;
                    ((View) viewM197382a.getParent()).setLayoutParams(layoutParams);
                }
                TextView textView = (TextView) viewM197382a.findViewById(f5c0.f95111k2);
                int i2 = tabAt.isSelected() ? c8c0.f79741f : c8c0.f79742g;
                if (NullChecker.m81303a(textView)) {
                    mji0.m154821o(textView, i2);
                }
            }
        }
        if (!TextUtils.isEmpty(this.f45674G)) {
            this.f45673F.call(this.f45674G);
        }
        d30 d30Var = this.f45675H;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m70142x5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_live_recommend";
    }

    /* JADX INFO: renamed from: x5 */
    public View m70142x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4o.m187221b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m70143y5(boolean z) {
        TabLayout tabLayout = this.f45668A;
        if (z) {
            xdl0.m208344M(tabLayout, false);
            xdl0.m208360X(this.f45670C, 0);
        } else {
            xdl0.m208344M(tabLayout, true);
            xdl0.m208360X(this.f45670C, t100.m186890d(55.0f));
        }
    }
}
