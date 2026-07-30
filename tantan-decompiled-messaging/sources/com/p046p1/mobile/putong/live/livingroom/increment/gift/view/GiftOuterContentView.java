package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

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
import com.p046p1.mobile.putong.live.base.data.BLiveTabEntrance;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftActionTipsView;
import java.util.List;
import p147v.VImage;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.adl0;
import p149l.ahs;
import p149l.axj;
import p149l.bgv;
import p149l.e51;
import p149l.elj;
import p149l.fld0;
import p149l.i3c0;
import p149l.mmj;
import p149l.nqj;
import p149l.nsj;
import p149l.qqj;
import p149l.rwj;
import p149l.sxj;
import p149l.trj;
import p149l.vwb;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes4.dex */
public class GiftOuterContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VPager f50337d;

    /* JADX INFO: renamed from: e */
    public VImage f50338e;

    /* JADX INFO: renamed from: f */
    public VText f50339f;

    /* JADX INFO: renamed from: g */
    public Group f50340g;

    /* JADX INFO: renamed from: h */
    public PacketGiftActionTipsView f50341h;

    /* JADX INFO: renamed from: i */
    public qqj f50342i;

    /* JADX INFO: renamed from: j */
    public ahs<?> f50343j;

    /* JADX INFO: renamed from: k */
    public GiftDialogIndicator f50344k;

    /* JADX INFO: renamed from: l */
    public int f50345l;

    /* JADX INFO: renamed from: m */
    public int f50346m;

    /* JADX INFO: renamed from: n */
    public rwj f50347n;

    /* JADX INFO: renamed from: o */
    public boolean f50348o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView$a */
    public class C12845a extends adl0 {
        public C12845a() {
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                GiftOuterContentView.this.f50348o = false;
            }
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (GiftOuterContentView.this.f50348o || i2 <= 0) {
                return;
            }
            GiftOuterContentView.this.f50348o = true;
            GiftOuterContentView.this.f50343j.m96648Y4();
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            GiftOuterContentView giftOuterContentView = GiftOuterContentView.this;
            giftOuterContentView.f50346m = giftOuterContentView.f50345l;
            GiftOuterContentView.this.f50345l = i;
            trj.m190420a();
            if (GiftOuterContentView.this.getTabIndex() == GiftOuterContentView.this.f50343j.m96621I4()) {
                GiftOuterContentView.this.m74513G0();
                GiftOuterContentView.this.m74511B0();
                GiftOuterContentView.this.m74514H0();
            }
        }
    }

    public GiftOuterContentView(@NonNull Context context) {
        super(context);
        this.f50345l = 0;
        this.f50346m = -1;
        this.f50348o = false;
    }

    /* JADX INFO: renamed from: D0 */
    private void m74494D0(rwj rwjVar) {
        if (rwjVar.m181395b()) {
            m74496J0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m74495I0(boolean z, boolean z2) {
        xdl0.m208344M(this.f50340g, z);
        xdl0.m208344M(this.f50337d, !z);
        if (z) {
            this.f50339f.setText(z2 ? R$string.f47185d5 : R$string.f47163c5);
            this.f50338e.setImageResource(i3c0.f111146r4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private void m74496J0() {
        fld0<bgv> fld0Var = fld0.f98151f;
        boolean zM101738r = ((bgv) ypv.m215673l(fld0Var)).m101738r();
        if (this.f50342i.getCount() <= 0 || zM101738r) {
            return;
        }
        this.f50341h.m73901f();
        ((bgv) ypv.m215673l(fld0Var)).m101714B();
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
    private void m74505q0(final Object obj, View view) {
        if (view instanceof GiftInnerContentView) {
            final VRecyclerView recyclerView = ((GiftInnerContentView) view).getRecyclerView();
            if (recyclerView.isComputingLayout()) {
                e51.m114742G(new Runnable() { // from class: l.msj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f135501a.m74507t0(obj, recyclerView);
                    }
                });
            } else {
                m74507t0(obj, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m74506r0() {
        this.f50337d.m4185d(new C12845a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m74508u0(int i, Object obj) {
        m74505q0(obj, sxj.m186440a(this.f50337d, i));
    }

    /* JADX INFO: renamed from: v0 */
    private void m74509v0(final int i, final Object obj) {
        View viewM186440a = sxj.m186440a(this.f50337d, i);
        if (viewM186440a == null) {
            e51.m114742G(new Runnable() { // from class: l.lsj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f129876a.m74508u0(i, obj);
                }
            });
        } else {
            m74505q0(obj, viewM186440a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m74507t0(Object obj, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRangeChanged(0, adapter.getItemCount(), obj);
    }

    /* JADX INFO: renamed from: B0 */
    public void m74511B0() {
        m74495I0(vwb.m200296J(this.f50347n.f161338a), this.f50347n.m181401h());
        m74509v0(this.f50345l, 1);
        int i = this.f50346m;
        if (i == -1) {
            return;
        }
        m74509v0(i, 2);
    }

    /* JADX INFO: renamed from: E0 */
    public void m74512E0(rwj rwjVar) {
        this.f50347n = rwjVar;
        List<nqj> listM155399B = mmj.m155399B(rwjVar);
        this.f50342i.m175943q(listM155399B);
        if (rwjVar.f161341d) {
            this.f50337d.setCurrentItem(mmj.m155437x(listM155399B));
        }
        m74495I0(vwb.m200296J(listM155399B), rwjVar.m181401h());
        m74494D0(rwjVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m74513G0() {
        if (this.f50342i == null) {
            return;
        }
        VPager vPager = this.f50337d;
        this.f50343j.m206028F2().GiftDialogEventGroup.refreshBottomIndicator().mo172463j(new elj(vPager, vPager.getCurrentItem(), this.f50342i.getCount()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: H0 */
    public void m74514H0() {
        String currentPureMode = (!"live".equals(this.f50343j.m206027E2().mo132054A0()) || this.f50343j.m206027E2().mo97490p()) ? "" : ypv.f199493a.m199329V().getCurrentPureMode();
        axj.m99441o(this.f50347n.m181397d(), this.f50343j.mo77274R2(), this.f50345l, currentPureMode);
        GiftDialogGiftsView giftDialogGiftsView = getGiftDialogGiftsView();
        if (giftDialogGiftsView == null) {
            return;
        }
        if (!giftDialogGiftsView.m74433B0()) {
            axj.m99433g(this.f50347n.m181397d(), this.f50343j.mo77274R2(), this.f50345l, currentPureMode);
        }
        giftDialogGiftsView.setIgnoreFirstTrackMs(false);
    }

    public BLiveTabEntrance getTabEntrance() {
        return this.f50347n.m181398e();
    }

    public int getTabIndex() {
        rwj rwjVar = this.f50347n;
        if (rwjVar != null) {
            return rwjVar.m181399f();
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74515p0(this);
        m74506r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74515p0(View view) {
        nsj.m160781a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public void m74516s0(GiftDialogIndicator giftDialogIndicator, ahs<?> ahsVar) {
        this.f50344k = giftDialogIndicator;
        this.f50343j = ahsVar;
        if (this.f50342i == null) {
            qqj qqjVar = new qqj(ahsVar);
            this.f50342i = qqjVar;
            this.f50337d.setAdapter(qqjVar);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m74517w0() {
        m74509v0(this.f50345l, 2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m74518y0() {
        m74509v0(this.f50345l, 1);
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50345l = 0;
        this.f50346m = -1;
        this.f50348o = false;
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50345l = 0;
        this.f50346m = -1;
        this.f50348o = false;
    }
}
