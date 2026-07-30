package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p147v.VImage;
import p147v.VPager;
import p149l.adl0;
import p149l.ahs;
import p149l.e51;
import p149l.g5c0;
import p149l.hvj;
import p149l.i3c0;
import p149l.ihs;
import p149l.ipj;
import p149l.jvj;
import p149l.mmj;
import p149l.olj;
import p149l.rwj;
import p149l.sxj;
import p149l.trj;
import p149l.vwb;
import p149l.wnj;
import p149l.xdl0;
import p149l.xsj;

/* JADX INFO: loaded from: classes4.dex */
public class GiftDialogGiftsView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public ImageView f50291d;

    /* JADX INFO: renamed from: e */
    public View f50292e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f50293f;

    /* JADX INFO: renamed from: g */
    public TabLayout f50294g;

    /* JADX INFO: renamed from: h */
    public GiftTabEntranceView f50295h;

    /* JADX INFO: renamed from: i */
    public VPager f50296i;

    /* JADX INFO: renamed from: j */
    public ViewStub f50297j;

    /* JADX INFO: renamed from: k */
    public int f50298k;

    /* JADX INFO: renamed from: l */
    public int f50299l;

    /* JADX INFO: renamed from: m */
    public xsj f50300m;

    /* JADX INFO: renamed from: n */
    public ahs<?> f50301n;

    /* JADX INFO: renamed from: o */
    public olj f50302o;

    /* JADX INFO: renamed from: p */
    public int f50303p;

    /* JADX INFO: renamed from: q */
    public final Set<Integer> f50304q;

    /* JADX INFO: renamed from: r */
    public boolean f50305r;

    /* JADX INFO: renamed from: s */
    public boolean f50306s;

    /* JADX INFO: renamed from: t */
    public View f50307t;

    /* JADX INFO: renamed from: u */
    public VImage f50308u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$a */
    public class C12842a extends adl0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ahs f50309a;

        public C12842a(ahs ahsVar) {
            this.f50309a = ahsVar;
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                this.f50309a.m96648Y4();
            }
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            GiftDialogGiftsView giftDialogGiftsView = GiftDialogGiftsView.this;
            giftDialogGiftsView.f50299l = giftDialogGiftsView.f50298k;
            GiftDialogGiftsView.this.f50298k = i;
            trj.m190420a();
            GiftDialogGiftsView.this.m74438K0(this.f50309a);
            GiftDialogGiftsView.this.setIndicatorPager(i);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogGiftsView$b */
    public class C12843b implements TabLayout.OnTabSelectedListener {
        public C12843b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public /* synthetic */ void m74453b() {
            GiftDialogGiftsView.this.m74446Y0();
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m74413N0(tab);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m74413N0(tab);
            GiftDialogGiftsView.this.f50294g.post(new Runnable() { // from class: l.vnj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182254a.m74453b();
                }
            });
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            GiftDialogGiftsView.this.m74416X0(tab, false);
            GiftDialogGiftsView.this.f50304q.remove(Integer.valueOf(GiftDialogGiftsView.this.f50296i.getCurrentItem()));
        }
    }

    public GiftDialogGiftsView(Context context) {
        super(context);
        this.f50298k = 0;
        this.f50299l = -1;
        this.f50304q = new HashSet();
        this.f50306s = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public /* synthetic */ void m74411E0(View view) {
        this.f50302o.mo69369e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public /* synthetic */ void m74412G0(View view) {
        this.f50302o.mo69369e0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N0 */
    public void m74413N0(TabLayout.Tab tab) {
        this.f50294g.setSelectedTabIndicatorColor(-1);
        m74416X0(tab, true);
    }

    /* JADX INFO: renamed from: T0 */
    private void m74414T0(List<rwj> list, int i, int i2, boolean z) {
        if (z) {
            if (!this.f50305r && this.f50301n != null && list.size() > i2) {
                this.f50301n.m96629M5(i2, list.get(i2));
            }
            this.f50296i.setCurrentItem(i2);
            return;
        }
        this.f50303p = mmj.m155438y(list, i);
        if (!this.f50305r && this.f50301n != null) {
            int size = list.size();
            int i3 = this.f50303p;
            if (size > i3) {
                this.f50301n.m96629M5(i3, list.get(i3));
            }
        }
        this.f50296i.setCurrentItem(this.f50303p);
    }

    /* JADX INFO: renamed from: U0 */
    private void m74415U0(boolean z) {
        if (!z) {
            if (z || !NullChecker.m81303a(this.f50307t)) {
                return;
            }
            xdl0.m208344M(this.f50307t, false);
            this.f50308u.setImageResource(0);
            return;
        }
        if (this.f50307t == null) {
            View viewInflate = this.f50297j.inflate();
            this.f50307t = viewInflate;
            viewInflate.findViewById(g5c0.f100878a5).setOnClickListener(new View.OnClickListener() { // from class: l.pnj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f150397a.m74436I0(view);
                }
            });
            this.f50308u = (VImage) this.f50307t.findViewById(g5c0.f101038r1);
        }
        xdl0.m208344M(this.f50307t, true);
        this.f50308u.setImageResource(i3c0.f111120p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public void m74416X0(TabLayout.Tab tab, boolean z) {
        GiftTabView giftTabViewM74430u0 = m74430u0(tab);
        if (giftTabViewM74430u0 == null) {
            return;
        }
        giftTabViewM74430u0.setSelect(z);
    }

    /* JADX INFO: renamed from: Z0 */
    private void m74417Z0(jvj jvjVar) {
        boolean zM200296J = vwb.m200296J(jvjVar.m143509f());
        hvj.C17412a c17412aM143508e = jvjVar.m143508e();
        if (!zM200296J || !c17412aM143508e.m133182a()) {
            m74415U0(false);
            return;
        }
        if (!c17412aM143508e.m133184c()) {
            m74415U0(true);
            return;
        }
        xsj xsjVar = this.f50300m;
        if (xsjVar == null || xsjVar.getCount() <= 0) {
            m74415U0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIndicatorPager(int i) {
        GiftOuterContentView giftOuterContentViewM74450v0 = m74450v0(i);
        if (giftOuterContentViewM74450v0 == null) {
            return;
        }
        giftOuterContentViewM74450v0.m74513G0();
    }

    /* JADX INFO: renamed from: u0 */
    private GiftTabView m74430u0(TabLayout.Tab tab) {
        View customView;
        if (tab == null || (customView = tab.getCustomView()) == null || !(customView instanceof GiftTabView)) {
            return null;
        }
        return (GiftTabView) customView;
    }

    /* JADX INFO: renamed from: w0 */
    private void m74431w0(List<rwj> list, int i, int i2, boolean z) {
        if (this.f50300m == null) {
            xsj xsjVar = new xsj(this.f50301n);
            this.f50300m = xsjVar;
            this.f50296i.setAdapter(xsjVar);
            this.f50294g.setupWithViewPager(this.f50296i);
        }
        this.f50300m.m210775v(list);
        m74432y0(list, i, i2, z);
    }

    /* JADX INFO: renamed from: y0 */
    private void m74432y0(List<rwj> list, int i, int i2, boolean z) {
        if (!z) {
            i2 = mmj.m155438y(list, i);
        }
        int i3 = 0;
        while (true) {
            int size = list.size();
            TabLayout tabLayout = this.f50294g;
            if (i3 >= size) {
                tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C12843b());
                return;
            }
            TabLayout.Tab tabAt = tabLayout.getTabAt(i3);
            if (tabAt != null) {
                ipj.m137488c(this.f50294g).m74525j0(list.get(i3), tabAt, i2);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public boolean m74433B0() {
        return this.f50306s;
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m74434D0(ahs ahsVar, View view) {
        this.f50295h.m74520i0(ahsVar);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m74435H0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m74513G0();
    }

    /* JADX INFO: renamed from: I0 */
    public final /* synthetic */ void m74436I0(View view) {
        this.f50301n.m96641T5(false);
    }

    /* JADX INFO: renamed from: J0 */
    public void m74437J0() {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView == null) {
            return;
        }
        currentPageView.m74518y0();
    }

    /* JADX INFO: renamed from: K0 */
    public final void m74438K0(ahs<?> ahsVar) {
        GiftOuterContentView currentPageView = getCurrentPageView();
        if (currentPageView != null) {
            currentPageView.m74518y0();
            m74441P0(currentPageView.getTabEntrance());
        }
        xsj xsjVar = this.f50300m;
        if (xsjVar != null && !this.f50305r) {
            int i = this.f50298k;
            ahsVar.m96629M5(i, xsjVar.m210774u(i));
        }
        int i2 = this.f50299l;
        if (i2 == -1) {
            return;
        }
        View viewM186440a = sxj.m186440a(this.f50296i, i2);
        if (viewM186440a instanceof GiftOuterContentView) {
            ((GiftOuterContentView) viewM186440a).m74517w0();
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m74439L0() {
        e51.m114742G(new Runnable() { // from class: l.unj
            @Override // java.lang.Runnable
            public final void run() {
                this.f177366a.m74437J0();
            }
        });
    }

    /* JADX INFO: renamed from: O0 */
    public void m74440O0() {
        e51.m114742G(new Runnable() { // from class: l.qnj
            @Override // java.lang.Runnable
            public final void run() {
                this.f155477a.m74435H0();
            }
        });
    }

    /* JADX INFO: renamed from: P0 */
    public void m74441P0(BLiveTabEntrance bLiveTabEntrance) {
        this.f50295h.m74521j0(bLiveTabEntrance);
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m74442Q0(List<rwj> list) {
        int currentItem = this.f50296i.getCurrentItem();
        if (currentItem >= list.size()) {
            return;
        }
        this.f50295h.m74521j0(list.get(currentItem).m181398e());
    }

    /* JADX INFO: renamed from: R0 */
    public void m74443R0(jvj jvjVar) {
        m74417Z0(jvjVar);
        if (vwb.m200296J(jvjVar.m143509f())) {
            return;
        }
        int currentItem = this.f50296i.getCurrentItem();
        hvj.C17412a c17412aM143508e = jvjVar.m143508e();
        List<rwj> listM155403F = mmj.m155403F(jvjVar.m143509f(), c17412aM143508e.m133183b());
        int iM155439z = mmj.m155439z(jvjVar);
        m74431w0(listM155403F, iM155439z, currentItem, c17412aM143508e.m133183b());
        if (!vwb.m200296J(listM155403F)) {
            xdl0.m208345M0(this.f50296i, true);
            xdl0.m208345M0(this.f50294g, true);
        }
        m74414T0(listM155403F, iM155439z, currentItem, c17412aM143508e.m133183b());
        m74442Q0(jvjVar.m143509f());
        if (xdl0.m208349O0(this)) {
            m74440O0();
        }
    }

    /* JADX INFO: renamed from: S0 */
    public void m74444S0() {
        this.f50296i.setCurrentItem(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m74445V0(boolean z) {
        this.f50295h.m74522k0(z);
    }

    /* JADX INFO: renamed from: Y0 */
    public void m74446Y0() {
        int currentItem = this.f50296i.getCurrentItem();
        if (this.f50304q.contains(Integer.valueOf(currentItem))) {
            return;
        }
        this.f50304q.add(Integer.valueOf(currentItem));
        GiftOuterContentView giftOuterContentViewM74450v0 = m74450v0(currentItem);
        boolean z = (!this.f50305r && xdl0.m208349O0(this)) || (this.f50305r && xdl0.m208349O0(this));
        if (giftOuterContentViewM74450v0 == null || !z) {
            return;
        }
        giftOuterContentViewM74450v0.m74514H0();
    }

    /* JADX INFO: renamed from: a1 */
    public void m74447a1(ihs ihsVar, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        xsj xsjVar = this.f50300m;
        if (xsjVar != null) {
            xsjVar.m210776w(ihsVar, bLiveGivenGiftBrief);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m74448b() {
        this.f50296i.setCurrentItem(this.f50303p);
        xdl0.m208345M0(this.f50296i, false);
        xdl0.m208345M0(this.f50294g, false);
        this.f50304q.clear();
        this.f50306s = true;
    }

    @Nullable
    public GiftOuterContentView getCurrentPageView() {
        View viewM186440a = sxj.m186440a(this.f50296i, this.f50296i.getCurrentItem());
        if (viewM186440a instanceof GiftOuterContentView) {
            return (GiftOuterContentView) viewM186440a;
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74449t0(this);
    }

    public void setIgnoreFirstTrackMs(boolean z) {
        this.f50306s = z;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m74449t0(View view) {
        wnj.m204746a(this, view);
    }

    /* JADX INFO: renamed from: v0 */
    public final GiftOuterContentView m74450v0(int i) {
        int childCount = this.f50296i.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f50296i.getChildAt(i2);
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
    public void m74451z0(final ahs<?> ahsVar, olj oljVar, boolean z) {
        this.f50301n = ahsVar;
        this.f50302o = oljVar;
        this.f50305r = z;
        this.f50296i.m4185d(new C12842a(ahsVar));
        this.f50295h.setOnClickListener(new View.OnClickListener() { // from class: l.rnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160270a.m74434D0(ahsVar, view);
            }
        });
        this.f50291d.setOnClickListener(new View.OnClickListener() { // from class: l.snj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165459a.m74411E0(view);
            }
        });
        this.f50292e.setOnClickListener(new View.OnClickListener() { // from class: l.tnj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171247a.m74412G0(view);
            }
        });
        xdl0.m208344M(this.f50291d, z);
        xdl0.m208344M(this.f50292e, z);
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50298k = 0;
        this.f50299l = -1;
        this.f50304q = new HashSet();
        this.f50306s = true;
    }

    public GiftDialogGiftsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50298k = 0;
        this.f50299l = -1;
        this.f50304q = new HashSet();
        this.f50306s = true;
    }
}
