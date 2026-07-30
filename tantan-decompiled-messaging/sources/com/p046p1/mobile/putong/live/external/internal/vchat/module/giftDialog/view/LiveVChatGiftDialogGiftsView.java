package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p147v.VImage;
import p147v.VPager;
import p149l.adl0;
import p149l.e51;
import p149l.f5c0;
import p149l.h3c0;
import p149l.hvj;
import p149l.ihs;
import p149l.jvj;
import p149l.nmj;
import p149l.rwj;
import p149l.s6c0;
import p149l.sxj;
import p149l.trj;
import p149l.uiu;
import p149l.uju;
import p149l.vwb;
import p149l.wsj;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftDialogGiftsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f45161d;

    /* JADX INFO: renamed from: e */
    public TabLayout f45162e;

    /* JADX INFO: renamed from: f */
    public VPager f45163f;

    /* JADX INFO: renamed from: g */
    public ViewStub f45164g;

    /* JADX INFO: renamed from: h */
    public int f45165h;

    /* JADX INFO: renamed from: i */
    public int f45166i;

    /* JADX INFO: renamed from: j */
    public wsj f45167j;

    /* JADX INFO: renamed from: k */
    public uju<?> f45168k;

    /* JADX INFO: renamed from: l */
    public int f45169l;

    /* JADX INFO: renamed from: m */
    public View f45170m;

    /* JADX INFO: renamed from: n */
    public VImage f45171n;

    /* JADX INFO: renamed from: o */
    public final Set<Integer> f45172o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView$a */
    public class C12515a extends adl0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ uju f45173a;

        public C12515a(uju ujuVar) {
            this.f45173a = ujuVar;
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f45173a.m194089v3();
            }
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = LiveVChatGiftDialogGiftsView.this;
            liveVChatGiftDialogGiftsView.f45166i = liveVChatGiftDialogGiftsView.f45165h;
            LiveVChatGiftDialogGiftsView.this.f45165h = i;
            trj.m190420a();
            LiveVChatGiftDialogGiftsView.this.m69391D0();
            LiveVChatGiftDialogGiftsView.this.setIndicatorPager(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView$b */
    public class C12516b implements TabLayout.OnTabSelectedListener {
        public C12516b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m69411b() {
            LiveVChatGiftDialogGiftsView.this.m69398N0();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m69392E0(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m69392E0(tab);
            LiveVChatGiftDialogGiftsView.this.f45162e.post(new Runnable() { // from class: l.tiu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170614a.m69411b();
                }
            });
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m69397L0(tab, false);
            LiveVChatGiftDialogGiftsView.this.f45172o.remove(Integer.valueOf(LiveVChatGiftDialogGiftsView.this.f45163f.getCurrentItem()));
        }
    }

    public LiveVChatGiftDialogGiftsView(Context context) {
        super(context);
        this.f45165h = 0;
        this.f45166i = -1;
        this.f45172o = new HashSet();
    }

    /* JADX INFO: renamed from: K0 */
    private void m69379K0(boolean z) {
        View view = this.f45170m;
        if (!z) {
            if (NullChecker.m81303a(view)) {
                xdl0.m208344M(this.f45170m, false);
                this.f45171n.setImageResource(0);
                return;
            }
            return;
        }
        if (view == null) {
            View viewInflate = this.f45164g.inflate();
            this.f45170m = viewInflate;
            viewInflate.findViewById(f5c0.f95126o1).setOnClickListener(new View.OnClickListener() { // from class: l.riu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f159595a.m69409z0(view2);
                }
            });
            this.f45171n = (VImage) this.f45170m.findViewById(f5c0.f95097h0);
        }
        xdl0.m208344M(this.f45170m, true);
        this.f45171n.setImageResource(h3c0.f105726z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorPager(int i) {
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewM69404t0 = m69404t0(i);
        if (liveVChatGiftOuterContentViewM69404t0 == null) {
            return;
        }
        liveVChatGiftOuterContentViewM69404t0.m69505G0();
    }

    /* JADX INFO: renamed from: B0 */
    public void m69390B0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m69516y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m69391D0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.m69516y0();
        }
        int i = this.f45166i;
        if (i == -1) {
            return;
        }
        View viewM186440a = sxj.m186440a(this.f45163f, i);
        if (viewM186440a instanceof LiveVChatGiftOuterContentView) {
            ((LiveVChatGiftOuterContentView) viewM186440a).m69515w0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m69392E0(TabLayout.Tab tab) {
        this.f45162e.setSelectedTabIndicatorColor(-1);
        m69397L0(tab, true);
    }

    /* JADX INFO: renamed from: G0 */
    public void m69393G0() {
        e51.m114742G(new Runnable() { // from class: l.siu
            @Override // java.lang.Runnable
            public final void run() {
                this.f164743a.m69408y0();
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m69394H0(jvj jvjVar) {
        m69399O0(jvjVar);
        if (vwb.m200296J(jvjVar.m143509f())) {
            return;
        }
        int currentItem = this.f45163f.getCurrentItem();
        hvj.C17412a c17412aM143508e = jvjVar.m143508e();
        List<rwj> listM160108t = nmj.m160108t(jvjVar.m143509f(), c17412aM143508e.m133183b());
        int iM160104p = nmj.m160104p(jvjVar);
        m69405u0(listM160108t, iM160104p, currentItem, c17412aM143508e.m133183b());
        if (!vwb.m200296J(listM160108t)) {
            xdl0.m208345M0(this.f45163f, true);
            xdl0.m208345M0(this.f45162e, true);
        }
        m69396J0(listM160108t, iM160104p, currentItem, c17412aM143508e.m133183b());
        if (xdl0.m208349O0(this)) {
            m69393G0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m69395I0() {
        this.f45163f.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m69396J0(List<rwj> list, int i, int i2, boolean z) {
        if (z) {
            this.f45163f.setCurrentItem(i2);
            return;
        }
        int iM160103o = nmj.m160103o(list, i);
        this.f45169l = iM160103o;
        this.f45163f.setCurrentItem(iM160103o);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m69397L0(TabLayout.Tab tab, boolean z) {
        GiftTabView giftTabViewM69403s0 = m69403s0(tab);
        if (giftTabViewM69403s0 == null) {
            return;
        }
        giftTabViewM69403s0.setSelect(z);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m69398N0() {
        int currentItem = this.f45163f.getCurrentItem();
        if (this.f45172o.contains(Integer.valueOf(currentItem))) {
            return;
        }
        this.f45172o.add(Integer.valueOf(currentItem));
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewM69404t0 = m69404t0(currentItem);
        if (liveVChatGiftOuterContentViewM69404t0 != null) {
            liveVChatGiftOuterContentViewM69404t0.m69506H0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m69399O0(jvj jvjVar) {
        boolean zM200296J = vwb.m200296J(jvjVar.m143509f());
        hvj.C17412a c17412aM143508e = jvjVar.m143508e();
        if (!zM200296J || !c17412aM143508e.m133182a()) {
            m69379K0(false);
            return;
        }
        if (!c17412aM143508e.m133184c()) {
            m69379K0(true);
            return;
        }
        wsj wsjVar = this.f45167j;
        if (wsjVar == null || wsjVar.getCount() <= 0) {
            m69379K0(true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m69400P0(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        wsj wsjVar = this.f45167j;
        if (wsjVar != null) {
            wsjVar.m205519v(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m69401b() {
        this.f45163f.setCurrentItem(this.f45169l);
        xdl0.m208345M0(this.f45163f, false);
        xdl0.m208345M0(this.f45162e, false);
        this.f45172o.clear();
    }

    @Nullable
    public LiveVChatGiftOuterContentView getCurrentPageView() {
        View viewM186440a = sxj.m186440a(this.f45163f, this.f45163f.getCurrentItem());
        if (viewM186440a instanceof LiveVChatGiftOuterContentView) {
            return (LiveVChatGiftOuterContentView) viewM186440a;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69402r0(this);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m69402r0(View view) {
        uiu.m193960a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public final GiftTabView m69403s0(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (customView != null && (customView instanceof GiftTabView)) {
            return (GiftTabView) customView;
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final LiveVChatGiftOuterContentView m69404t0(int i) {
        int childCount = this.f45163f.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f45163f.getChildAt(i2);
            if (childAt instanceof LiveVChatGiftOuterContentView) {
                LiveVChatGiftOuterContentView liveVChatGiftOuterContentView = (LiveVChatGiftOuterContentView) childAt;
                if (liveVChatGiftOuterContentView.getTabIndex() == i) {
                    return liveVChatGiftOuterContentView;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m69405u0(List<rwj> list, int i, int i2, boolean z) {
        if (this.f45167j == null) {
            wsj wsjVar = new wsj(this.f45168k);
            this.f45167j = wsjVar;
            this.f45163f.setAdapter(wsjVar);
            this.f45162e.setupWithViewPager(this.f45163f);
        }
        this.f45167j.m205518u(list);
        m69406v0(list, i, i2, z);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m69406v0(List<rwj> list, int i, int i2, boolean z) {
        if (!z) {
            i2 = nmj.m160103o(list, i);
        }
        int i3 = 0;
        while (true) {
            int size = list.size();
            TabLayout tabLayout = this.f45162e;
            if (i3 >= size) {
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C12516b());
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i3);
            if (tabAt != null) {
                ((GiftTabView) LayoutInflater.from(this.f45162e.getContext()).inflate(s6c0.f162780o, (ViewGroup) this.f45162e, false)).m74525j0(list.get(i3), tabAt, i2);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m69407w0(uju<?> ujuVar) {
        this.f45168k = ujuVar;
        this.f45163f.m4185d(new C12515a(ujuVar));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m69408y0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m69505G0();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m69409z0(View view) {
        this.f45168k.m194067T3();
    }

    public LiveVChatGiftDialogGiftsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45165h = 0;
        this.f45166i = -1;
        this.f45172o = new HashSet();
    }

    public LiveVChatGiftDialogGiftsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45165h = 0;
        this.f45166i = -1;
        this.f45172o = new HashSet();
    }
}
