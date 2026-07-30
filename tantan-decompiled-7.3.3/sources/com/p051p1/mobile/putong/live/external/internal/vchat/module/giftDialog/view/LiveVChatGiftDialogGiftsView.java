package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftTabView;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p151v.VImage;
import p151v.VPager;
import p153l.bnl0;
import p153l.dpj;
import p153l.eml0;
import p153l.hzj;
import p153l.i0k;
import p153l.jjs;
import p153l.juj;
import p153l.jyb;
import p153l.l51;
import p153l.ldc0;
import p153l.mvj;
import p153l.nbc0;
import p153l.vku;
import p153l.vlu;
import p153l.xec0;
import p153l.xxj;
import p153l.zxj;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftDialogGiftsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FrameLayout f46009d;

    /* JADX INFO: renamed from: e */
    public TabLayout f46010e;

    /* JADX INFO: renamed from: f */
    public VPager f46011f;

    /* JADX INFO: renamed from: g */
    public ViewStub f46012g;

    /* JADX INFO: renamed from: h */
    public int f46013h;

    /* JADX INFO: renamed from: i */
    public int f46014i;

    /* JADX INFO: renamed from: j */
    public mvj f46015j;

    /* JADX INFO: renamed from: k */
    public vlu<?> f46016k;

    /* JADX INFO: renamed from: l */
    public int f46017l;

    /* JADX INFO: renamed from: m */
    public View f46018m;

    /* JADX INFO: renamed from: n */
    public VImage f46019n;

    /* JADX INFO: renamed from: o */
    public final Set<Integer> f46020o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView$a */
    public class C12678a extends eml0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vlu f46021a;

        public C12678a(vlu vluVar) {
            this.f46021a = vluVar;
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f46021a.m201719v3();
            }
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            LiveVChatGiftDialogGiftsView liveVChatGiftDialogGiftsView = LiveVChatGiftDialogGiftsView.this;
            liveVChatGiftDialogGiftsView.f46014i = liveVChatGiftDialogGiftsView.f46013h;
            LiveVChatGiftDialogGiftsView.this.f46013h = i;
            juj.m146987a();
            LiveVChatGiftDialogGiftsView.this.m70574D0();
            LiveVChatGiftDialogGiftsView.this.setIndicatorPager(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftDialogGiftsView$b */
    public class C12679b implements TabLayout.OnTabSelectedListener {
        public C12679b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m70594b() {
            LiveVChatGiftDialogGiftsView.this.m70581N0();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m70575E0(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m70575E0(tab);
            LiveVChatGiftDialogGiftsView.this.f46010e.post(new Runnable() { // from class: l.uku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179458a.m70594b();
                }
            });
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            LiveVChatGiftDialogGiftsView.this.m70580L0(tab, false);
            LiveVChatGiftDialogGiftsView.this.f46020o.remove(Integer.valueOf(LiveVChatGiftDialogGiftsView.this.f46011f.getCurrentItem()));
        }
    }

    public LiveVChatGiftDialogGiftsView(Context context) {
        super(context);
        this.f46013h = 0;
        this.f46014i = -1;
        this.f46020o = new HashSet();
    }

    /* JADX INFO: renamed from: K0 */
    private void m70562K0(boolean z) {
        View view = this.f46018m;
        if (!z) {
            if (NullChecker.m82486a(view)) {
                bnl0.m105524M(this.f46018m, false);
                this.f46019n.setImageResource(0);
                return;
            }
            return;
        }
        if (view == null) {
            View viewInflate = this.f46012g.inflate();
            this.f46018m = viewInflate;
            viewInflate.findViewById(ldc0.f131583o1).setOnClickListener(new View.OnClickListener() { // from class: l.sku
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f169329a.m70592z0(view2);
                }
            });
            this.f46019n = (VImage) this.f46018m.findViewById(ldc0.f131554h0);
        }
        bnl0.m105524M(this.f46018m, true);
        this.f46019n.setImageResource(nbc0.f141217z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorPager(int i) {
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewM70587t0 = m70587t0(i);
        if (liveVChatGiftOuterContentViewM70587t0 == null) {
            return;
        }
        liveVChatGiftOuterContentViewM70587t0.m70688G0();
    }

    /* JADX INFO: renamed from: B0 */
    public void m70573B0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m70699y0();
    }

    /* JADX INFO: renamed from: D0 */
    public final void m70574D0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.m70699y0();
        }
        int i = this.f46014i;
        if (i == -1) {
            return;
        }
        View viewM137974a = i0k.m137974a(this.f46011f, i);
        if (viewM137974a instanceof LiveVChatGiftOuterContentView) {
            ((LiveVChatGiftOuterContentView) viewM137974a).m70698w0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public final void m70575E0(TabLayout.Tab tab) {
        this.f46010e.setSelectedTabIndicatorColor(-1);
        m70580L0(tab, true);
    }

    /* JADX INFO: renamed from: G0 */
    public void m70576G0() {
        l51.m152887G(new Runnable() { // from class: l.tku
            @Override // java.lang.Runnable
            public final void run() {
                this.f174748a.m70591y0();
            }
        });
    }

    /* JADX INFO: renamed from: H0 */
    public void m70577H0(zxj zxjVar) {
        m70582O0(zxjVar);
        if (jyb.m147479J(zxjVar.m221999f())) {
            return;
        }
        int currentItem = this.f46011f.getCurrentItem();
        xxj.C21473a c21473aM221998e = zxjVar.m221998e();
        List<hzj> listM117400t = dpj.m117400t(zxjVar.m221999f(), c21473aM221998e.m213542b());
        int iM117396p = dpj.m117396p(zxjVar);
        m70588u0(listM117400t, iM117396p, currentItem, c21473aM221998e.m213542b());
        if (!jyb.m147479J(listM117400t)) {
            bnl0.m105525M0(this.f46011f, true);
            bnl0.m105525M0(this.f46010e, true);
        }
        m70579J0(listM117400t, iM117396p, currentItem, c21473aM221998e.m213542b());
        if (bnl0.m105529O0(this)) {
            m70576G0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m70578I0() {
        this.f46011f.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m70579J0(List<hzj> list, int i, int i2, boolean z) {
        if (z) {
            this.f46011f.setCurrentItem(i2);
            return;
        }
        int iM117395o = dpj.m117395o(list, i);
        this.f46017l = iM117395o;
        this.f46011f.setCurrentItem(iM117395o);
    }

    /* JADX INFO: renamed from: L0 */
    public final void m70580L0(TabLayout.Tab tab, boolean z) {
        GiftTabView giftTabViewM70586s0 = m70586s0(tab);
        if (giftTabViewM70586s0 == null) {
            return;
        }
        giftTabViewM70586s0.setSelect(z);
    }

    /* JADX INFO: renamed from: N0 */
    public final void m70581N0() {
        int currentItem = this.f46011f.getCurrentItem();
        if (this.f46020o.contains(Integer.valueOf(currentItem))) {
            return;
        }
        this.f46020o.add(Integer.valueOf(currentItem));
        LiveVChatGiftOuterContentView liveVChatGiftOuterContentViewM70587t0 = m70587t0(currentItem);
        if (liveVChatGiftOuterContentViewM70587t0 != null) {
            liveVChatGiftOuterContentViewM70587t0.m70689H0();
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m70582O0(zxj zxjVar) {
        boolean zM147479J = jyb.m147479J(zxjVar.m221999f());
        xxj.C21473a c21473aM221998e = zxjVar.m221998e();
        if (!zM147479J || !c21473aM221998e.m213541a()) {
            m70562K0(false);
            return;
        }
        if (!c21473aM221998e.m213543c()) {
            m70562K0(true);
            return;
        }
        mvj mvjVar = this.f46015j;
        if (mvjVar == null || mvjVar.getCount() <= 0) {
            m70562K0(true);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public void m70583P0(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        mvj mvjVar = this.f46015j;
        if (mvjVar != null) {
            mvjVar.m160270v(jjsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m70584b() {
        this.f46011f.setCurrentItem(this.f46017l);
        bnl0.m105525M0(this.f46011f, false);
        bnl0.m105525M0(this.f46010e, false);
        this.f46020o.clear();
    }

    @Nullable
    public LiveVChatGiftOuterContentView getCurrentPageView() {
        View viewM137974a = i0k.m137974a(this.f46011f, this.f46011f.getCurrentItem());
        if (viewM137974a instanceof LiveVChatGiftOuterContentView) {
            return (LiveVChatGiftOuterContentView) viewM137974a;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70585r0(this);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m70585r0(View view) {
        vku.m201581a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public final GiftTabView m70586s0(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (customView != null && (customView instanceof GiftTabView)) {
            return (GiftTabView) customView;
        }
        return null;
    }

    /* JADX INFO: renamed from: t0 */
    public final LiveVChatGiftOuterContentView m70587t0(int i) {
        int childCount = this.f46011f.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f46011f.getChildAt(i2);
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
    public final void m70588u0(List<hzj> list, int i, int i2, boolean z) {
        if (this.f46015j == null) {
            mvj mvjVar = new mvj(this.f46016k);
            this.f46015j = mvjVar;
            this.f46011f.setAdapter(mvjVar);
            this.f46010e.setupWithViewPager(this.f46011f);
        }
        this.f46015j.m160269u(list);
        m70589v0(list, i, i2, z);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70589v0(List<hzj> list, int i, int i2, boolean z) {
        if (!z) {
            i2 = dpj.m117395o(list, i);
        }
        int i3 = 0;
        while (true) {
            int size = list.size();
            TabLayout tabLayout = this.f46010e;
            if (i3 >= size) {
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C12679b());
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i3);
            if (tabAt != null) {
                ((GiftTabView) LayoutInflater.from(this.f46010e.getContext()).inflate(xec0.f193894o, (ViewGroup) this.f46010e, false)).m75708j0(list.get(i3), tabAt, i2);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m70590w0(vlu<?> vluVar) {
        this.f46016k = vluVar;
        this.f46011f.m4187d(new C12678a(vluVar));
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m70591y0() {
        LiveVChatGiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m70688G0();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m70592z0(View view) {
        this.f46016k.m201697T3();
    }

    public LiveVChatGiftDialogGiftsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46013h = 0;
        this.f46014i = -1;
        this.f46020o = new HashSet();
    }

    public LiveVChatGiftDialogGiftsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46013h = 0;
        this.f46014i = -1;
        this.f46020o = new HashSet();
    }
}
