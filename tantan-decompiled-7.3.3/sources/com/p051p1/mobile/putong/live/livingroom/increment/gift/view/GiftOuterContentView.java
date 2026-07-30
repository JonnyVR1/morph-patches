package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftActionTipsView;
import java.util.List;
import p151v.VImage;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bjs;
import p153l.bnl0;
import p153l.civ;
import p153l.cpj;
import p153l.dtj;
import p153l.dvj;
import p153l.eml0;
import p153l.gtj;
import p153l.htd0;
import p153l.hzj;
import p153l.i0k;
import p153l.juj;
import p153l.jyb;
import p153l.l51;
import p153l.obc0;
import p153l.qzj;
import p153l.unj;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftOuterContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VPager f51185d;

    /* JADX INFO: renamed from: e */
    public VImage f51186e;

    /* JADX INFO: renamed from: f */
    public VText f51187f;

    /* JADX INFO: renamed from: g */
    public Group f51188g;

    /* JADX INFO: renamed from: h */
    public PacketGiftActionTipsView f51189h;

    /* JADX INFO: renamed from: i */
    public gtj f51190i;

    /* JADX INFO: renamed from: j */
    public bjs<?> f51191j;

    /* JADX INFO: renamed from: k */
    public GiftDialogIndicator f51192k;

    /* JADX INFO: renamed from: l */
    public int f51193l;

    /* JADX INFO: renamed from: m */
    public int f51194m;

    /* JADX INFO: renamed from: n */
    public hzj f51195n;

    /* JADX INFO: renamed from: o */
    public boolean f51196o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView$a */
    public class C13008a extends eml0 {
        public C13008a() {
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                GiftOuterContentView.this.f51196o = false;
            }
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (GiftOuterContentView.this.f51196o || i2 <= 0) {
                return;
            }
            GiftOuterContentView.this.f51196o = true;
            GiftOuterContentView.this.f51191j.m104735Y4();
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            GiftOuterContentView giftOuterContentView = GiftOuterContentView.this;
            giftOuterContentView.f51194m = giftOuterContentView.f51193l;
            GiftOuterContentView.this.f51193l = i;
            juj.m146987a();
            if (GiftOuterContentView.this.getTabIndex() == GiftOuterContentView.this.f51191j.m104708I4()) {
                GiftOuterContentView.this.m75696G0();
                GiftOuterContentView.this.m75694B0();
                GiftOuterContentView.this.m75697H0();
            }
        }
    }

    public GiftOuterContentView(@NonNull Context context) {
        super(context);
        this.f51193l = 0;
        this.f51194m = -1;
        this.f51196o = false;
    }

    /* JADX INFO: renamed from: D0 */
    private void m75677D0(hzj hzjVar) {
        if (hzjVar.m137894b()) {
            m75679J0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m75678I0(boolean z, boolean z2) {
        bnl0.m105524M(this.f51188g, z);
        bnl0.m105524M(this.f51185d, !z);
        if (z) {
            this.f51187f.setText(z2 ? R$string.f48033d5 : R$string.f48011c5);
            this.f51186e.setImageResource(obc0.f146474r4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private void m75679J0() {
        htd0<civ> htd0Var = htd0.f111524f;
        boolean zM109974r = ((civ) zrv.m221194l(htd0Var)).m109974r();
        if (this.f51190i.getCount() <= 0 || zM109974r) {
            return;
        }
        this.f51189h.m75084f();
        ((civ) zrv.m221194l(htd0Var)).m109950B();
    }

    private GiftDialogGiftsView getGiftDialogGiftsView() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            return null;
        }
        ViewParent parent2 = parent.getParent();
        if (parent2 instanceof GiftDialogGiftsView) {
            return (GiftDialogGiftsView) parent2;
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    private void m75688q0(final Object obj, View view) {
        if (view instanceof GiftInnerContentView) {
            final VRecyclerView recyclerView = ((GiftInnerContentView) view).getRecyclerView();
            if (recyclerView.isComputingLayout()) {
                l51.m152887G(new Runnable() { // from class: l.cvj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f84006a.m75690t0(obj, recyclerView);
                    }
                });
            } else {
                m75690t0(obj, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m75689r0() {
        this.f51185d.m4187d(new C13008a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m75691u0(int i, Object obj) {
        m75688q0(obj, i0k.m137974a(this.f51185d, i));
    }

    /* JADX INFO: renamed from: v0 */
    private void m75692v0(final int i, final Object obj) {
        View viewM137974a = i0k.m137974a(this.f51185d, i);
        if (viewM137974a == null) {
            l51.m152887G(new Runnable() { // from class: l.bvj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78599a.m75691u0(i, obj);
                }
            });
        } else {
            m75688q0(obj, viewM137974a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m75690t0(Object obj, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRangeChanged(0, adapter.getItemCount(), obj);
    }

    /* JADX INFO: renamed from: B0 */
    public void m75694B0() {
        m75678I0(jyb.m147479J(this.f51195n.f112248a), this.f51195n.m137900h());
        m75692v0(this.f51193l, 1);
        int i = this.f51194m;
        if (i == -1) {
            return;
        }
        m75692v0(i, 2);
    }

    /* JADX INFO: renamed from: E0 */
    public void m75695E0(hzj hzjVar) {
        this.f51195n = hzjVar;
        List<dtj> listM111766B = cpj.m111766B(hzjVar);
        this.f51190i.m132240q(listM111766B);
        if (hzjVar.f112251d) {
            this.f51185d.setCurrentItem(cpj.m111804x(listM111766B));
        }
        m75678I0(jyb.m147479J(listM111766B), hzjVar.m137900h());
        m75677D0(hzjVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m75696G0() {
        if (this.f51190i == null) {
            return;
        }
        VPager vPager = this.f51185d;
        this.f51191j.m213811F2().GiftDialogEventGroup.refreshBottomIndicator().mo199273j(new unj(vPager, vPager.getCurrentItem(), this.f51190i.getCount()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: H0 */
    public void m75697H0() {
        String currentPureMode = (!"live".equals(this.f51191j.m213810E2().mo118362A0()) || this.f51191j.m213810E2().mo118373p()) ? "" : zrv.f205799a.m207651V().getCurrentPureMode();
        qzj.m178798o(this.f51195n.m137896d(), this.f51191j.mo78457R2(), this.f51193l, currentPureMode);
        GiftDialogGiftsView giftDialogGiftsView = getGiftDialogGiftsView();
        if (giftDialogGiftsView == null) {
            return;
        }
        if (!giftDialogGiftsView.m75616B0()) {
            qzj.m178790g(this.f51195n.m137896d(), this.f51191j.mo78457R2(), this.f51193l, currentPureMode);
        }
        giftDialogGiftsView.setIgnoreFirstTrackMs(false);
    }

    public BLiveTabEntrance getTabEntrance() {
        return this.f51195n.m137897e();
    }

    public int getTabIndex() {
        hzj hzjVar = this.f51195n;
        if (hzjVar != null) {
            return hzjVar.m137898f();
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75698p0(this);
        m75689r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75698p0(View view) {
        dvj.m118283a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public void m75699s0(GiftDialogIndicator giftDialogIndicator, bjs<?> bjsVar) {
        this.f51192k = giftDialogIndicator;
        this.f51191j = bjsVar;
        if (this.f51190i == null) {
            gtj gtjVar = new gtj(bjsVar);
            this.f51190i = gtjVar;
            this.f51185d.setAdapter(gtjVar);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m75700w0() {
        m75692v0(this.f51193l, 2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m75701y0() {
        m75692v0(this.f51193l, 1);
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51193l = 0;
        this.f51194m = -1;
        this.f51196o = false;
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51193l = 0;
        this.f51194m = -1;
        this.f51196o = false;
    }
}
