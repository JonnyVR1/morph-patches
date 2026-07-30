package com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab;

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
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummary;
import com.p051p1.mobile.putong.live.base.data.BLiveActivitySummaryCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSkinConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareDetailCounters;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSubTab;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.base.data.BLiveTopBarConfig;
import com.p051p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p153l.bnl0;
import p153l.dhw;
import p153l.fc2;
import p153l.ggc0;
import p153l.gm3;
import p153l.hgc0;
import p153l.i4g0;
import p153l.itd0;
import p153l.j26;
import p153l.jyb;
import p153l.l9c0;
import p153l.ldc0;
import p153l.m9c0;
import p153l.msi0;
import p153l.n5o;
import p153l.nbc0;
import p153l.pcj;
import p153l.qa00;
import p153l.qcj;
import p153l.qrr;
import p153l.t4u;
import p153l.t6o;
import p153l.tbs;
import p153l.uqb0;
import p153l.v9o;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareMainSubFrag extends LiveSquareBaseFrag {

    /* JADX INFO: renamed from: A */
    public TabLayout f46516A;

    /* JADX INFO: renamed from: B */
    public FrameLayout f46517B;

    /* JADX INFO: renamed from: C */
    public NoSaveStateViewPager f46518C;

    /* JADX INFO: renamed from: D */
    public n5o f46519D;

    /* JADX INFO: renamed from: E */
    public BLiveSkinConfig f46520E;

    /* JADX INFO: renamed from: H */
    public x20 f46523H;

    /* JADX INFO: renamed from: z */
    public FrameLayout f46525z;

    /* JADX INFO: renamed from: F */
    public y20<String> f46521F = null;

    /* JADX INFO: renamed from: G */
    public String f46522G = "";

    /* JADX INFO: renamed from: I */
    public final TabLayout.OnTabSelectedListener f46524I = new C12707a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.livesquare.fragments.mainSubTab.IntlLiveSquareMainSubFrag$a */
    public class C12707a implements TabLayout.OnTabSelectedListener {
        public C12707a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab.getCustomView() != null && "square-suggested".equals(tab.getCustomView().getTag())) {
                i4g0.m138520r("e_live_top_tab", "p_audio_explore_recommend");
            }
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            if (textView != null) {
                t4u.m189328q(textView.getTag().toString(), true);
                msi0.m159817o(textView, ggc0.f104007e);
            }
            tab.view.setBackgroundResource(nbc0.f141178m);
            if (IntlLiveSquareMainSubFrag.this.f46520E == null || IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig == null) {
                return;
            }
            if (!TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.selectBgColor)) {
                tab.view.setBackground(fc2.m124971a(Color.parseColor(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.selectBgColor), qa00.f156323j, false));
            }
            if (textView == null || TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.selectTextColor)) {
                return;
            }
            textView.setTextColor(Color.parseColor(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.selectTextColor));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            TextView textView = (TextView) tab.view.findViewById(ldc0.f131568k2);
            tab.view.setBackgroundColor(0);
            if (textView != null) {
                t4u.m189328q(textView.getTag().toString(), false);
                msi0.m159817o(textView, ggc0.f104008f);
            }
            if (IntlLiveSquareMainSubFrag.this.f46520E == null || IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig == null) {
                return;
            }
            if (textView != null) {
                textView.setTextColor(!TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.unSelectTextColor) ? Color.parseColor(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.unSelectTextColor) : -1);
            }
            if (TextUtils.isEmpty(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.unSelectBgColor)) {
                return;
            }
            tab.view.setBackground(fc2.m124971a(Color.parseColor(IntlLiveSquareMainSubFrag.this.f46520E.topTabBarConfig.subTabConfig.unSelectBgColor), qa00.f156323j, false));
        }
    }

    /* JADX INFO: renamed from: B5 */
    private void m71299B5(String str) {
        FrameLayout frameLayout = this.f46517B;
        if (frameLayout != null) {
            for (int childCount = frameLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                if (this.f46517B.getChildAt(childCount) != null && this.f46517B.getChildAt(childCount).getTag() != null && (this.f46517B.getChildAt(childCount).getTag() instanceof String) && TextUtils.equals(str, (String) this.f46517B.getChildAt(childCount).getTag())) {
                    FrameLayout frameLayout2 = this.f46517B;
                    frameLayout2.removeView(frameLayout2.getChildAt(childCount));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D5 */
    public /* synthetic */ void m71300D5(String str) {
        if (this.f46516A.getTabCount() > 0) {
            this.f46521F.call(str);
        } else {
            this.f46522G = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K5, reason: merged with bridge method [inline-methods] */
    public void m71322H5(final String str, final boolean z) {
        if (this.f46518C == null || this.f46516A == null) {
            this.f46523H = new x20() { // from class: l.j6o
                @Override // p153l.x20
                public final void call() {
                    this.f118574a.m71322H5(str, z);
                }
            };
            return;
        }
        this.f46523H = null;
        if (z) {
            m71302L5(str);
        } else {
            m71299B5(str);
        }
    }

    /* JADX INFO: renamed from: L5 */
    private void m71302L5(String str) {
        if (this.f46517B != null) {
            int measuredWidth = 0;
            for (int i = 0; i < this.f46516A.getTabCount(); i++) {
                if (this.f46516A.getTabAt(i) != null && this.f46516A.getTabAt(i).getCustomView() != null && this.f46516A.getTabAt(i).getCustomView().getTag() != null && (this.f46516A.getTabAt(i).getCustomView().getTag() instanceof String)) {
                    measuredWidth += this.f46516A.getTabAt(i).getCustomView().getMeasuredWidth();
                    String str2 = (String) this.f46516A.getTabAt(i).getCustomView().getTag();
                    if (measuredWidth > 0 && TextUtils.equals(str, str2)) {
                        ImageView imageView = new ImageView(getContext());
                        imageView.setImageResource(nbc0.f141191q0);
                        int i2 = qa00.f156323j;
                        this.f46517B.addView(imageView, new FrameLayout.LayoutParams(i2, i2));
                        bnl0.m105538V(imageView, measuredWidth - qa00.f156322i);
                        imageView.setTag(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v5 */
    public static /* synthetic */ void m71314v5(Throwable th) {
    }

    /* JADX INFO: renamed from: z5 */
    private C22507a<qrr> m71316z5() {
        return ((gm3) tbs.m190077m(itd0.f116821c)).f104912b;
    }

    /* JADX INFO: renamed from: A5 */
    public LiveSquareBaseFrag m71317A5() {
        NoSaveStateViewPager noSaveStateViewPager;
        n5o n5oVar = this.f46519D;
        if (n5oVar == null || (noSaveStateViewPager = this.f46518C) == null) {
            return null;
        }
        return (LiveSquareBaseFrag) n5oVar.getItem(noSaveStateViewPager.getCurrentItem());
    }

    /* JADX INFO: renamed from: C5 */
    public final /* synthetic */ void m71318C5(String str) {
        for (int i = 0; i < this.f46516A.getTabCount(); i++) {
            if (this.f46516A.getTabAt(i) != null && this.f46516A.getTabAt(i).getCustomView() != null && this.f46516A.getTabAt(i).getCustomView().getTag() != null && (this.f46516A.getTabAt(i).getCustomView().getTag() instanceof String) && TextUtils.equals(str, (String) this.f46516A.getTabAt(i).getCustomView().getTag())) {
                this.f46518C.m4178T(i, false);
            }
        }
    }

    /* JADX INFO: renamed from: E5 */
    public final /* synthetic */ void m71319E5(BLiveSkinConfig bLiveSkinConfig) {
        if (TEnum.equals(uqb0.f180402h0, "unknown_")) {
            return;
        }
        m71323I5(bLiveSkinConfig);
    }

    /* JADX INFO: renamed from: F5 */
    public final /* synthetic */ void m71320F5(qrr qrrVar) {
        BLiveActivitySummaryCounters bLiveActivitySummaryCounters;
        BLiveSquareDetailCounters bLiveSquareDetailCounters;
        int iM177601g = qrrVar.m177601g();
        BLiveActivitySummary bLiveActivitySummaryM177598d = qrrVar.m177598d();
        if (bLiveActivitySummaryM177598d == null || iM177601g != 0 || (bLiveActivitySummaryCounters = bLiveActivitySummaryM177598d.counters) == null || (bLiveSquareDetailCounters = bLiveActivitySummaryCounters.squareDetail) == null) {
            m71322H5("square-intlFollowing", false);
        } else {
            m71322H5("square-intlFollowing", bLiveSquareDetailCounters.unreadCount > 0);
        }
    }

    /* JADX INFO: renamed from: G5 */
    public final /* synthetic */ void m71321G5(int i, View view) {
        if (i != this.f46518C.getCurrentItem()) {
            this.f46518C.m4178T(i, true);
        } else if (tbs.f172989b.m203437I6()) {
            mo70115Y4();
        }
    }

    /* JADX INFO: renamed from: I5 */
    public void m71323I5(BLiveSkinConfig bLiveSkinConfig) {
        this.f46520E = bLiveSkinConfig;
        if (this.f46516A != null) {
            for (int i = 0; i < this.f46516A.getTabCount(); i++) {
                m71324J5(this.f46516A.getTabAt(i), bLiveSkinConfig);
            }
        }
    }

    /* JADX INFO: renamed from: J5 */
    public final void m71324J5(TabLayout.Tab tab, BLiveSkinConfig bLiveSkinConfig) {
        View customView;
        int iM143190c;
        BLiveTopBarConfig bLiveTopBarConfig;
        BLiveTopBarConfig bLiveTopBarConfig2;
        BLiveTopBarConfig bLiveTopBarConfig3;
        if (tab == null || (customView = tab.getCustomView()) == null) {
            return;
        }
        TextView textView = (TextView) customView.findViewById(ldc0.f131568k2);
        boolean zIsSelected = tab.isSelected();
        if (zIsSelected) {
            iM143190c = (bLiveSkinConfig == null || (bLiveTopBarConfig3 = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig3.subTabConfig.selectTextColor)) ? j26.m143190c(tbs.f172988a, m9c0.f135400y) : Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.selectTextColor);
        } else {
            iM143190c = (bLiveSkinConfig == null || (bLiveTopBarConfig = bLiveSkinConfig.topTabBarConfig) == null || TextUtils.isEmpty(bLiveTopBarConfig.subTabConfig.unSelectTextColor)) ? j26.m143190c(tbs.f172988a, m9c0.f135382g) : Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.unSelectTextColor);
        }
        textView.setTextColor(iM143190c);
        if (bLiveSkinConfig == null || (bLiveTopBarConfig2 = bLiveSkinConfig.topTabBarConfig) == null) {
            return;
        }
        if (zIsSelected) {
            if (TextUtils.isEmpty(bLiveTopBarConfig2.subTabConfig.selectBgColor)) {
                return;
            }
            tab.view.setBackground(fc2.m124971a(Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.selectBgColor), qa00.f156323j, false));
        } else {
            if (TextUtils.isEmpty(bLiveTopBarConfig2.subTabConfig.unSelectBgColor)) {
                return;
            }
            tab.view.setBackground(fc2.m124971a(Color.parseColor(bLiveSkinConfig.topTabBarConfig.subTabConfig.unSelectBgColor), qa00.f156323j, false));
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag
    /* JADX INFO: renamed from: Y4 */
    public void mo70115Y4() {
        NoSaveStateViewPager noSaveStateViewPager = this.f46518C;
        if (noSaveStateViewPager == null || noSaveStateViewPager.getAdapter() == null) {
            return;
        }
        Fragment item = ((n5o) this.f46518C.getAdapter()).getItem(this.f46518C.getCurrentItem());
        if (item instanceof LiveSquareBaseFrag) {
            ((LiveSquareBaseFrag) item).mo70115Y4();
        }
    }

    @Override // com.p051p1.mobile.putong.live.external.square.fragments.LiveSquareBaseFrag, com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f46521F = new y20() { // from class: l.m6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135018a.m71318C5((String) obj);
            }
        };
        duringCreated(t4u.m189318g()).filter(new qcj() { // from class: l.n6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.o6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145203a.m71300D5((String) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.p6o
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return tbs.f172989b.m159275l(false);
            }
        }, false).filter(new qcj() { // from class: l.q6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLiveSettings bLiveSettings = (BLiveSettings) obj;
                return Boolean.valueOf((bLiveSettings == null || bLiveSettings.liveSkinConfig == null) ? false : true);
            }
        }).map(new qcj() { // from class: l.r6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSettings) obj).liveSkinConfig;
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.s6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166594a.m71319E5((BLiveSkinConfig) obj);
            }
        }));
        duringCreated(m71316z5().asObservable()).subscribe(dhw.m115826e(new y20() { // from class: l.h6o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f108041a.m71320F5((qrr) obj);
            }
        }, new y20() { // from class: l.i6o
            @Override // p153l.y20
            public final void call(Object obj) {
                IntlLiveSquareMainSubFrag.m71314v5((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f46516A.addOnTabSelectedListener(this.f46524I);
        this.f46516A.setTabRippleColorResource(l9c0.f130601n);
        this.f46516A.setTabGravity(1);
        this.f46516A.setSelectedTabIndicator(new ColorDrawable(0));
        this.f46516A.setTabMode(0);
        bnl0.m105540X(this.f46518C, qa00.m175859d(48.0f));
        List<BLiveSquareSubTab> listM203776y5 = tbs.f172989b.m203776y5();
        if (jyb.m147479J(listM203776y5)) {
            return;
        }
        m71326y5(listM203776y5.size() <= 1);
        ArrayList arrayListM147486Q = jyb.m147486Q(listM203776y5, new qcj() { // from class: l.g6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveSquareSubTab) obj).convertToSquareTab();
            }
        });
        int iM147476G = jyb.m147476G(arrayListM147486Q, new qcj() { // from class: l.k6o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals("square-suggested", ((BLiveSquareTab) obj).name));
            }
        });
        n5o n5oVar = new n5o(getChildFragmentManager(), arrayListM147486Q, 0, 0, m71996Z4());
        this.f46519D = n5oVar;
        this.f46518C.setAdapter(n5oVar);
        this.f46516A.setupWithViewPager(this.f46518C);
        if (iM147476G >= 0 && iM147476G < this.f46519D.getCount()) {
            this.f46518C.setCurrentItem(iM147476G);
        }
        for (final int i = 0; i < this.f46516A.getTabCount(); i++) {
            BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) arrayListM147486Q.get(i);
            TabLayout.Tab tabAt = this.f46516A.getTabAt(i);
            if (tabAt != null) {
                View viewM200451a = v9o.m200451a(act(), bLiveSquareTab);
                bnl0.m105509E0(viewM200451a, new View.OnClickListener() { // from class: l.l6o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f130271a.m71321G5(i, view);
                    }
                });
                tabAt.setCustomView(viewM200451a);
                if (viewM200451a.getParent() == null || bLiveSquareTab.title.length() > 2) {
                    bnl0.m105550d0(viewM200451a, qa00.m175859d(12.0f));
                    bnl0.m105552e0(viewM200451a, qa00.m175859d(12.0f));
                } else {
                    ViewGroup.LayoutParams layoutParams = ((View) viewM200451a.getParent()).getLayoutParams();
                    layoutParams.width = qa00.f156290C;
                    ((View) viewM200451a.getParent()).setLayoutParams(layoutParams);
                }
                TextView textView = (TextView) viewM200451a.findViewById(ldc0.f131568k2);
                int i2 = tabAt.isSelected() ? hgc0.f109389f : hgc0.f109390g;
                if (NullChecker.m82486a(textView)) {
                    msi0.m159817o(textView, i2);
                }
            }
        }
        if (!TextUtils.isEmpty(this.f46522G)) {
            this.f46521F.call(this.f46522G);
        }
        x20 x20Var = this.f46523H;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m71325x5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_live_recommend";
    }

    /* JADX INFO: renamed from: x5 */
    public View m71325x5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t6o.m189542b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y5 */
    public final void m71326y5(boolean z) {
        TabLayout tabLayout = this.f46516A;
        if (z) {
            bnl0.m105524M(tabLayout, false);
            bnl0.m105540X(this.f46518C, 0);
        } else {
            bnl0.m105524M(tabLayout, true);
            bnl0.m105540X(this.f46518C, qa00.m175859d(55.0f));
        }
    }
}
