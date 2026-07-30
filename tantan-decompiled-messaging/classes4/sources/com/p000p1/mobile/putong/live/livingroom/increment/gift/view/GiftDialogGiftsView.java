package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.e51;
import l.sxj;
import l.vwb;
import l.xdl0;
import p002l.adl0;
import p002l.ahs;
import p002l.g5c0;
import p002l.hvj;
import p002l.i3c0;
import p002l.ihs;
import p002l.ipj;
import p002l.jvj;
import p002l.mmj;
import p002l.olj;
import p002l.rwj;
import p002l.trj;
import p002l.wnj;
import p002l.xsj;
import v.VImage;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftDialogGiftsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f6333d;

    /* JADX INFO: renamed from: e */
    public View f6334e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f6335f;

    /* JADX INFO: renamed from: g */
    public TabLayout f6336g;

    /* JADX INFO: renamed from: h */
    public GiftTabEntranceView f6337h;

    /* JADX INFO: renamed from: i */
    public VPager f6338i;

    /* JADX INFO: renamed from: j */
    public ViewStub f6339j;

    /* JADX INFO: renamed from: k */
    public int f6340k;

    /* JADX INFO: renamed from: l */
    public int f6341l;

    /* JADX INFO: renamed from: m */
    public xsj f6342m;

    /* JADX INFO: renamed from: n */
    public ahs<?> f6343n;

    /* JADX INFO: renamed from: o */
    public olj f6344o;

    /* JADX INFO: renamed from: p */
    public int f6345p;

    /* JADX INFO: renamed from: q */
    public final Set<Integer> f6346q;

    /* JADX INFO: renamed from: r */
    public boolean f6347r;

    /* JADX INFO: renamed from: s */
    public boolean f6348s;

    /* JADX INFO: renamed from: t */
    public View f6349t;

    /* JADX INFO: renamed from: u */
    public VImage f6350u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$a */
    public class C0431a extends adl0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ahs f6351a;

        public C0431a(ahs ahsVar) {
            this.f6351a = ahsVar;
        }

        @Override // p002l.adl0
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f6351a.m9745Y4();
            }
        }

        @Override // p002l.adl0
        public void onPageSelected(int i) {
            GiftDialogGiftsView giftDialogGiftsView = GiftDialogGiftsView.this;
            giftDialogGiftsView.f6341l = giftDialogGiftsView.f6340k;
            GiftDialogGiftsView.this.f6340k = i;
            trj.m23151a();
            GiftDialogGiftsView.this.m8022K0(this.f6351a);
            GiftDialogGiftsView.this.setIndicatorPager(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$b */
    public class C0432b implements TabLayout.OnTabSelectedListener {
        public C0432b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m8037b() {
            GiftDialogGiftsView.this.m8030Y0();
        }

        public void onTabReselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m7997N0(tab);
        }

        public void onTabSelected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m7997N0(tab);
            GiftDialogGiftsView.this.f6336g.post(new Runnable() { // from class: l.vnj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21245a.m8037b();
                }
            });
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m8000X0(tab, false);
            GiftDialogGiftsView.this.f6346q.remove(Integer.valueOf(GiftDialogGiftsView.this.f6338i.getCurrentItem()));
        }
    }

    public GiftDialogGiftsView(Context context) {
        super(context);
        this.f6340k = 0;
        this.f6341l = -1;
        this.f6346q = new HashSet();
        this.f6348s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m7995E0(View view) {
        this.f6344o.mo7981e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m7996G0(View view) {
        this.f6344o.mo7981e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public void m7997N0(TabLayout.Tab tab) {
        this.f6336g.setSelectedTabIndicatorColor(-1);
        m8000X0(tab, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m7998T0(List<rwj> list, int i, int i2, boolean z) {
        if (z) {
            if (!this.f6347r && this.f6343n != null && list.size() > i2) {
                this.f6343n.m9725M5(i2, list.get(i2));
            }
            this.f6338i.setCurrentItem(i2);
            return;
        }
        this.f6345p = mmj.m18080y(list, i);
        if (!this.f6347r && this.f6343n != null) {
            int size = list.size();
            int i3 = this.f6345p;
            if (size > i3) {
                this.f6343n.m9725M5(i3, list.get(i3));
            }
        }
        this.f6338i.setCurrentItem(this.f6345p);
    }

    /* JADX INFO: renamed from: U0 */
    private void m7999U0(boolean z) {
        if (!z) {
            if (z || !NullChecker.a(this.f6349t)) {
                return;
            }
            xdl0.M(this.f6349t, false);
            this.f6350u.setImageResource(0);
            return;
        }
        if (this.f6349t == null) {
            View viewInflate = this.f6339j.inflate();
            this.f6349t = viewInflate;
            viewInflate.findViewById(g5c0.f11028a5).setOnClickListener(new View.OnClickListener() { // from class: l.pnj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17545a.m8020I0(view);
                }
            });
            this.f6350u = this.f6349t.findViewById(g5c0.f11188r1);
        }
        xdl0.M(this.f6349t, true);
        this.f6350u.setImageResource(i3c0.f12905p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m8000X0(TabLayout.Tab tab, boolean z) {
        GiftTabView giftTabViewM8014u0 = m8014u0(tab);
        if (giftTabViewM8014u0 == null) {
            return;
        }
        giftTabViewM8014u0.setSelect(z);
    }

    /* JADX INFO: renamed from: Z0 */
    private void m8001Z0(jvj jvjVar) {
        boolean zJ = vwb.J(jvjVar.m16344f());
        hvj.C0611a c0611aM16343e = jvjVar.m16343e();
        if (!zJ || !c0611aM16343e.m14850a()) {
            m7999U0(false);
            return;
        }
        if (!c0611aM16343e.m14852c()) {
            m7999U0(true);
            return;
        }
        xsj xsjVar = this.f6342m;
        if (xsjVar == null || xsjVar.getCount() <= 0) {
            m7999U0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorPager(int i) {
        GiftOuterContentView giftOuterContentViewM8034v0 = m8034v0(i);
        if (giftOuterContentViewM8034v0 == null) {
            return;
        }
        giftOuterContentViewM8034v0.m8100G0();
    }

    /* JADX INFO: renamed from: u0 */
    private GiftTabView m8014u0(TabLayout.Tab tab) {
        Object customView;
        if (tab == null || (customView = tab.getCustomView()) == null || !(customView instanceof GiftTabView)) {
            return null;
        }
        return (GiftTabView) customView;
    }

    /* JADX INFO: renamed from: w0 */
    private void m8015w0(List<rwj> list, int i, int i2, boolean z) {
        if (this.f6342m == null) {
            xsj xsjVar = new xsj(this.f6343n);
            this.f6342m = xsjVar;
            this.f6338i.setAdapter(xsjVar);
            this.f6336g.setupWithViewPager(this.f6338i);
        }
        this.f6342m.m26102v(list);
        m8016y0(list, i, i2, z);
    }

    /* JADX INFO: renamed from: y0 */
    private void m8016y0(List<rwj> list, int i, int i2, boolean z) {
        if (!z) {
            i2 = mmj.m18080y(list, i);
        }
        int i3 = 0;
        while (true) {
            int size = list.size();
            TabLayout tabLayout = this.f6336g;
            if (i3 >= size) {
                tabLayout.addOnTabSelectedListener(new C0432b());
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i3);
            if (tabAt != null) {
                ipj.m15285c(this.f6336g).m8112j0(list.get(i3), tabAt, i2);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m8017B0() {
        return this.f6348s;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m8018D0(ahs ahsVar, View view) {
        this.f6337h.m8107i0(ahsVar);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m8019H0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m8100G0();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m8020I0(View view) {
        this.f6343n.m9738T5(false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m8021J0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m8105y0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m8022K0(ahs<?> ahsVar) {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.m8105y0();
            m8025P0(currentPageView.getTabEntrance());
        }
        xsj xsjVar = this.f6342m;
        if (xsjVar != null && !this.f6347r) {
            int i = this.f6340k;
            ahsVar.m9725M5(i, xsjVar.m26101u(i));
        }
        int i2 = this.f6341l;
        if (i2 == -1) {
            return;
        }
        Object objA = sxj.a(this.f6338i, i2);
        if (objA instanceof GiftOuterContentView) {
            ((GiftOuterContentView) objA).m8104w0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m8023L0() {
        e51.G(new Runnable() { // from class: l.unj
            @Override // java.lang.Runnable
            public final void run() {
                this.f20732a.m8021J0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m8024O0() {
        e51.G(new Runnable() { // from class: l.qnj
            @Override // java.lang.Runnable
            public final void run() {
                this.f18103a.m8019H0();
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m8025P0(BLiveTabEntrance bLiveTabEntrance) {
        this.f6337h.m8108j0(bLiveTabEntrance);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m8026Q0(List<rwj> list) {
        int currentItem = this.f6338i.getCurrentItem();
        if (currentItem >= list.size()) {
            return;
        }
        this.f6337h.m8108j0(list.get(currentItem).m22142e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public void m8027R0(jvj jvjVar) {
        m8001Z0(jvjVar);
        if (vwb.J(jvjVar.m16344f())) {
            return;
        }
        int currentItem = this.f6338i.getCurrentItem();
        hvj.C0611a c0611aM16343e = jvjVar.m16343e();
        List<rwj> listM18045F = mmj.m18045F(jvjVar.m16344f(), c0611aM16343e.m14851b());
        int iM18081z = mmj.m18081z(jvjVar);
        m8015w0(listM18045F, iM18081z, currentItem, c0611aM16343e.m14851b());
        if (!vwb.J(listM18045F)) {
            xdl0.M0(this.f6338i, true);
            xdl0.M0(this.f6336g, true);
        }
        m7998T0(listM18045F, iM18081z, currentItem, c0611aM16343e.m14851b());
        m8026Q0(jvjVar.m16344f());
        if (xdl0.O0(this)) {
            m8024O0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m8028S0() {
        this.f6338i.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m8029V0(boolean z) {
        this.f6337h.m8109k0(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public void m8030Y0() {
        int currentItem = this.f6338i.getCurrentItem();
        if (this.f6346q.contains(Integer.valueOf(currentItem))) {
            return;
        }
        this.f6346q.add(Integer.valueOf(currentItem));
        GiftOuterContentView giftOuterContentViewM8034v0 = m8034v0(currentItem);
        boolean z = (!this.f6347r && xdl0.O0(this)) || (this.f6347r && xdl0.O0(this));
        if (giftOuterContentViewM8034v0 == null || !z) {
            return;
        }
        giftOuterContentViewM8034v0.m8101H0();
    }

    /* JADX INFO: renamed from: a1 */
    public void m8031a1(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        xsj xsjVar = this.f6342m;
        if (xsjVar != null) {
            xsjVar.m26103w(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m8032b() {
        this.f6338i.setCurrentItem(this.f6345p);
        xdl0.M0(this.f6338i, false);
        xdl0.M0(this.f6336g, false);
        this.f6346q.clear();
        this.f6348s = true;
    }

    @Nullable
    public GiftOuterContentView getCurrentPageView() {
        Object objA = sxj.a(this.f6338i, this.f6338i.getCurrentItem());
        if (objA instanceof GiftOuterContentView) {
            return (GiftOuterContentView) objA;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8033t0(this);
    }

    public void setIgnoreFirstTrackMs(boolean z) {
        this.f6348s = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m8033t0(View view) {
        wnj.m25254a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final GiftOuterContentView m8034v0(int i) {
        int childCount = this.f6338i.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            Object childAt = this.f6338i.getChildAt(i2);
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
    public void m8035z0(final ahs<?> ahsVar, olj oljVar, boolean z) {
        this.f6343n = ahsVar;
        this.f6344o = oljVar;
        this.f6347r = z;
        this.f6338i.d(new C0431a(ahsVar));
        this.f6337h.setOnClickListener(new View.OnClickListener() { // from class: l.rnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18617a.m8018D0(ahsVar, view);
            }
        });
        this.f6333d.setOnClickListener(new View.OnClickListener() { // from class: l.snj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19137a.m7995E0(view);
            }
        });
        this.f6334e.setOnClickListener(new View.OnClickListener() { // from class: l.tnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20313a.m7996G0(view);
            }
        });
        xdl0.M(this.f6333d, z);
        xdl0.M(this.f6334e, z);
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6340k = 0;
        this.f6341l = -1;
        this.f6346q = new HashSet();
        this.f6348s = true;
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6340k = 0;
        this.f6341l = -1;
        this.f6346q = new HashSet();
        this.f6348s = true;
    }
}
