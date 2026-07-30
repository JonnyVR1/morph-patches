package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p151v.VImage;
import p151v.VPager;
import p153l.bjs;
import p153l.bnl0;
import p153l.cpj;
import p153l.eml0;
import p153l.eoj;
import p153l.hzj;
import p153l.i0k;
import p153l.jjs;
import p153l.juj;
import p153l.jyb;
import p153l.l51;
import p153l.mdc0;
import p153l.mqj;
import p153l.nvj;
import p153l.obc0;
import p153l.xxj;
import p153l.yrj;
import p153l.zxj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogGiftsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f51139d;

    /* JADX INFO: renamed from: e */
    public View f51140e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51141f;

    /* JADX INFO: renamed from: g */
    public TabLayout f51142g;

    /* JADX INFO: renamed from: h */
    public GiftTabEntranceView f51143h;

    /* JADX INFO: renamed from: i */
    public VPager f51144i;

    /* JADX INFO: renamed from: j */
    public ViewStub f51145j;

    /* JADX INFO: renamed from: k */
    public int f51146k;

    /* JADX INFO: renamed from: l */
    public int f51147l;

    /* JADX INFO: renamed from: m */
    public nvj f51148m;

    /* JADX INFO: renamed from: n */
    public bjs<?> f51149n;

    /* JADX INFO: renamed from: o */
    public eoj f51150o;

    /* JADX INFO: renamed from: p */
    public int f51151p;

    /* JADX INFO: renamed from: q */
    public final Set<Integer> f51152q;

    /* JADX INFO: renamed from: r */
    public boolean f51153r;

    /* JADX INFO: renamed from: s */
    public boolean f51154s;

    /* JADX INFO: renamed from: t */
    public View f51155t;

    /* JADX INFO: renamed from: u */
    public VImage f51156u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$a */
    public class C13005a extends eml0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bjs f51157a;

        public C13005a(bjs bjsVar) {
            this.f51157a = bjsVar;
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f51157a.m104735Y4();
            }
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            GiftDialogGiftsView giftDialogGiftsView = GiftDialogGiftsView.this;
            giftDialogGiftsView.f51147l = giftDialogGiftsView.f51146k;
            GiftDialogGiftsView.this.f51146k = i;
            juj.m146987a();
            GiftDialogGiftsView.this.m75621K0(this.f51157a);
            GiftDialogGiftsView.this.setIndicatorPager(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$b */
    public class C13006b implements TabLayout.OnTabSelectedListener {
        public C13006b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m75636b() {
            GiftDialogGiftsView.this.m75629Y0();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m75596N0(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m75596N0(tab);
            GiftDialogGiftsView.this.f51142g.post(new Runnable() { // from class: l.lqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133226a.m75636b();
                }
            });
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m75599X0(tab, false);
            GiftDialogGiftsView.this.f51152q.remove(Integer.valueOf(GiftDialogGiftsView.this.f51144i.getCurrentItem()));
        }
    }

    public GiftDialogGiftsView(Context context) {
        super(context);
        this.f51146k = 0;
        this.f51147l = -1;
        this.f51152q = new HashSet();
        this.f51154s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m75594E0(View view) {
        this.f51150o.mo70552e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m75595G0(View view) {
        this.f51150o.mo70552e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public void m75596N0(TabLayout.Tab tab) {
        this.f51142g.setSelectedTabIndicatorColor(-1);
        m75599X0(tab, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m75597T0(List<hzj> list, int i, int i2, boolean z) {
        if (z) {
            if (!this.f51153r && this.f51149n != null && list.size() > i2) {
                this.f51149n.m104716M5(i2, list.get(i2));
            }
            this.f51144i.setCurrentItem(i2);
            return;
        }
        this.f51151p = cpj.m111805y(list, i);
        if (!this.f51153r && this.f51149n != null) {
            int size = list.size();
            int i3 = this.f51151p;
            if (size > i3) {
                this.f51149n.m104716M5(i3, list.get(i3));
            }
        }
        this.f51144i.setCurrentItem(this.f51151p);
    }

    /* JADX INFO: renamed from: U0 */
    private void m75598U0(boolean z) {
        if (!z) {
            if (z || !NullChecker.m82486a(this.f51155t)) {
                return;
            }
            bnl0.m105524M(this.f51155t, false);
            this.f51156u.setImageResource(0);
            return;
        }
        if (this.f51155t == null) {
            View viewInflate = this.f51145j.inflate();
            this.f51155t = viewInflate;
            viewInflate.findViewById(mdc0.f136123a5).setOnClickListener(new View.OnClickListener() { // from class: l.fqj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f100299a.m75619I0(view);
                }
            });
            this.f51156u = (VImage) this.f51155t.findViewById(mdc0.f136283r1);
        }
        bnl0.m105524M(this.f51155t, true);
        this.f51156u.setImageResource(obc0.f146448p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m75599X0(TabLayout.Tab tab, boolean z) {
        GiftTabView giftTabViewM75613u0 = m75613u0(tab);
        if (giftTabViewM75613u0 == null) {
            return;
        }
        giftTabViewM75613u0.setSelect(z);
    }

    /* JADX INFO: renamed from: Z0 */
    private void m75600Z0(zxj zxjVar) {
        boolean zM147479J = jyb.m147479J(zxjVar.m221999f());
        xxj.C21473a c21473aM221998e = zxjVar.m221998e();
        if (!zM147479J || !c21473aM221998e.m213541a()) {
            m75598U0(false);
            return;
        }
        if (!c21473aM221998e.m213543c()) {
            m75598U0(true);
            return;
        }
        nvj nvjVar = this.f51148m;
        if (nvjVar == null || nvjVar.getCount() <= 0) {
            m75598U0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorPager(int i) {
        GiftOuterContentView giftOuterContentViewM75633v0 = m75633v0(i);
        if (giftOuterContentViewM75633v0 == null) {
            return;
        }
        giftOuterContentViewM75633v0.m75696G0();
    }

    /* JADX INFO: renamed from: u0 */
    private GiftTabView m75613u0(TabLayout.Tab tab) {
        View customView;
        if (tab == null || (customView = tab.getCustomView()) == null || !(customView instanceof GiftTabView)) {
            return null;
        }
        return (GiftTabView) customView;
    }

    /* JADX INFO: renamed from: w0 */
    private void m75614w0(List<hzj> list, int i, int i2, boolean z) {
        if (this.f51148m == null) {
            nvj nvjVar = new nvj(this.f51149n);
            this.f51148m = nvjVar;
            this.f51144i.setAdapter(nvjVar);
            this.f51142g.setupWithViewPager(this.f51144i);
        }
        this.f51148m.m164878v(list);
        m75615y0(list, i, i2, z);
    }

    /* JADX INFO: renamed from: y0 */
    private void m75615y0(List<hzj> list, int i, int i2, boolean z) {
        if (!z) {
            i2 = cpj.m111805y(list, i);
        }
        int i3 = 0;
        while (true) {
            int size = list.size();
            TabLayout tabLayout = this.f51142g;
            if (i3 >= size) {
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C13006b());
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i3);
            if (tabAt != null) {
                yrj.m217169c(this.f51142g).m75708j0(list.get(i3), tabAt, i2);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m75616B0() {
        return this.f51154s;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m75617D0(bjs bjsVar, View view) {
        this.f51143h.m75703i0(bjsVar);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m75618H0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m75696G0();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m75619I0(View view) {
        this.f51149n.m104728T5(false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m75620J0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m75701y0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m75621K0(bjs<?> bjsVar) {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.m75701y0();
            m75624P0(currentPageView.getTabEntrance());
        }
        nvj nvjVar = this.f51148m;
        if (nvjVar != null && !this.f51153r) {
            int i = this.f51146k;
            bjsVar.m104716M5(i, nvjVar.m164877u(i));
        }
        int i2 = this.f51147l;
        if (i2 == -1) {
            return;
        }
        View viewM137974a = i0k.m137974a(this.f51144i, i2);
        if (viewM137974a instanceof GiftOuterContentView) {
            ((GiftOuterContentView) viewM137974a).m75700w0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m75622L0() {
        l51.m152887G(new Runnable() { // from class: l.kqj
            @Override // java.lang.Runnable
            public final void run() {
                this.f128229a.m75620J0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m75623O0() {
        l51.m152887G(new Runnable() { // from class: l.gqj
            @Override // java.lang.Runnable
            public final void run() {
                this.f105685a.m75618H0();
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m75624P0(BLiveTabEntrance bLiveTabEntrance) {
        this.f51143h.m75704j0(bLiveTabEntrance);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m75625Q0(List<hzj> list) {
        int currentItem = this.f51144i.getCurrentItem();
        if (currentItem >= list.size()) {
            return;
        }
        this.f51143h.m75704j0(list.get(currentItem).m137897e());
    }

    /* JADX INFO: renamed from: R0 */
    public void m75626R0(zxj zxjVar) {
        m75600Z0(zxjVar);
        if (jyb.m147479J(zxjVar.m221999f())) {
            return;
        }
        int currentItem = this.f51144i.getCurrentItem();
        xxj.C21473a c21473aM221998e = zxjVar.m221998e();
        List<hzj> listM111770F = cpj.m111770F(zxjVar.m221999f(), c21473aM221998e.m213542b());
        int iM111806z = cpj.m111806z(zxjVar);
        m75614w0(listM111770F, iM111806z, currentItem, c21473aM221998e.m213542b());
        if (!jyb.m147479J(listM111770F)) {
            bnl0.m105525M0(this.f51144i, true);
            bnl0.m105525M0(this.f51142g, true);
        }
        m75597T0(listM111770F, iM111806z, currentItem, c21473aM221998e.m213542b());
        m75625Q0(zxjVar.m221999f());
        if (bnl0.m105529O0(this)) {
            m75623O0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m75627S0() {
        this.f51144i.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m75628V0(boolean z) {
        this.f51143h.m75705k0(z);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m75629Y0() {
        int currentItem = this.f51144i.getCurrentItem();
        if (this.f51152q.contains(Integer.valueOf(currentItem))) {
            return;
        }
        this.f51152q.add(Integer.valueOf(currentItem));
        GiftOuterContentView giftOuterContentViewM75633v0 = m75633v0(currentItem);
        boolean z = (!this.f51153r && bnl0.m105529O0(this)) || (this.f51153r && bnl0.m105529O0(this));
        if (giftOuterContentViewM75633v0 == null || !z) {
            return;
        }
        giftOuterContentViewM75633v0.m75697H0();
    }

    /* JADX INFO: renamed from: a1 */
    public void m75630a1(jjs jjsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        nvj nvjVar = this.f51148m;
        if (nvjVar != null) {
            nvjVar.m164879w(jjsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75631b() {
        this.f51144i.setCurrentItem(this.f51151p);
        bnl0.m105525M0(this.f51144i, false);
        bnl0.m105525M0(this.f51142g, false);
        this.f51152q.clear();
        this.f51154s = true;
    }

    @Nullable
    public GiftOuterContentView getCurrentPageView() {
        View viewM137974a = i0k.m137974a(this.f51144i, this.f51144i.getCurrentItem());
        if (viewM137974a instanceof GiftOuterContentView) {
            return (GiftOuterContentView) viewM137974a;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75632t0(this);
    }

    public void setIgnoreFirstTrackMs(boolean z) {
        this.f51154s = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m75632t0(View view) {
        mqj.m159514a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final GiftOuterContentView m75633v0(int i) {
        int childCount = this.f51144i.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f51144i.getChildAt(i2);
            if (childAt instanceof GiftOuterContentView) {
                GiftOuterContentView giftOuterContentView = (GiftOuterContentView) childAt;
                if (giftOuterContentView.getTabIndex() == i) {
                    return giftOuterContentView;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: z0 */
    public void m75634z0(final bjs<?> bjsVar, eoj eojVar, boolean z) {
        this.f51149n = bjsVar;
        this.f51150o = eojVar;
        this.f51153r = z;
        this.f51144i.m4187d(new C13005a(bjsVar));
        this.f51143h.setOnClickListener(new View.OnClickListener() { // from class: l.hqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111131a.m75617D0(bjsVar, view);
            }
        });
        this.f51139d.setOnClickListener(new View.OnClickListener() { // from class: l.iqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116419a.m75594E0(view);
            }
        });
        this.f51140e.setOnClickListener(new View.OnClickListener() { // from class: l.jqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122224a.m75595G0(view);
            }
        });
        bnl0.m105524M(this.f51139d, z);
        bnl0.m105524M(this.f51140e, z);
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51146k = 0;
        this.f51147l = -1;
        this.f51152q = new HashSet();
        this.f51154s = true;
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51146k = 0;
        this.f51147l = -1;
        this.f51152q = new HashSet();
        this.f51154s = true;
    }
}
