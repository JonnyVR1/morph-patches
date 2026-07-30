package com.p000p1.mobile.putong.live.livingroom.increment.gift.view;

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
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.packetgift.PacketGiftActionTipsView;
import com.p1.mobile.putong.live.base.data.BLiveTabEntrance;
import java.util.List;
import l.bgv;
import l.e51;
import l.fld0;
import l.sxj;
import l.vwb;
import l.xdl0;
import l.ypv;
import p002l.adl0;
import p002l.ahs;
import p002l.axj;
import p002l.elj;
import p002l.i3c0;
import p002l.mmj;
import p002l.nqj;
import p002l.nsj;
import p002l.qqj;
import p002l.rwj;
import p002l.trj;
import v.VImage;
import v.VPager;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class GiftOuterContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VPager f6379d;

    /* JADX INFO: renamed from: e */
    public VImage f6380e;

    /* JADX INFO: renamed from: f */
    public VText f6381f;

    /* JADX INFO: renamed from: g */
    public Group f6382g;

    /* JADX INFO: renamed from: h */
    public PacketGiftActionTipsView f6383h;

    /* JADX INFO: renamed from: i */
    public qqj f6384i;

    /* JADX INFO: renamed from: j */
    public ahs<?> f6385j;

    /* JADX INFO: renamed from: k */
    public GiftDialogIndicator f6386k;

    /* JADX INFO: renamed from: l */
    public int f6387l;

    /* JADX INFO: renamed from: m */
    public int f6388m;

    /* JADX INFO: renamed from: n */
    public rwj f6389n;

    /* JADX INFO: renamed from: o */
    public boolean f6390o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.view.GiftOuterContentView$a */
    public class C0434a extends adl0 {
        public C0434a() {
        }

        @Override // p002l.adl0
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                GiftOuterContentView.this.f6390o = false;
            }
        }

        @Override // p002l.adl0
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (GiftOuterContentView.this.f6390o || i2 <= 0) {
                return;
            }
            GiftOuterContentView.this.f6390o = true;
            GiftOuterContentView.this.f6385j.m9745Y4();
        }

        @Override // p002l.adl0
        public void onPageSelected(int i) {
            GiftOuterContentView giftOuterContentView = GiftOuterContentView.this;
            giftOuterContentView.f6388m = giftOuterContentView.f6387l;
            GiftOuterContentView.this.f6387l = i;
            trj.m23151a();
            if (GiftOuterContentView.this.getTabIndex() == GiftOuterContentView.this.f6385j.m9717I4()) {
                GiftOuterContentView.this.m8100G0();
                GiftOuterContentView.this.m8098B0();
                GiftOuterContentView.this.m8101H0();
            }
        }
    }

    public GiftOuterContentView(@NonNull Context context) {
        super(context);
        this.f6387l = 0;
        this.f6388m = -1;
        this.f6390o = false;
    }

    /* JADX INFO: renamed from: D0 */
    private void m8081D0(rwj rwjVar) {
        if (rwjVar.m22139b()) {
            m8083J0();
        }
    }

    /* JADX INFO: renamed from: I0 */
    private void m8082I0(boolean z, boolean z2) {
        xdl0.M(this.f6382g, z);
        xdl0.M(this.f6379d, !z);
        if (z) {
            this.f6381f.setText(z2 ? R$string.f3227d5 : R$string.f3205c5);
            this.f6380e.setImageResource(i3c0.f12931r4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    private void m8083J0() {
        fld0 fld0Var = fld0.f;
        boolean zR = ((bgv) ypv.l(fld0Var)).r();
        if (this.f6384i.getCount() <= 0 || zR) {
            return;
        }
        this.f6383h.m7457f();
        ((bgv) ypv.l(fld0Var)).B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private GiftDialogGiftsView getGiftDialogGiftsView() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            return null;
        }
        Object parent2 = parent.getParent();
        if (parent2 instanceof GiftDialogGiftsView) {
            return (GiftDialogGiftsView) parent2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    private void m8092q0(final Object obj, View view) {
        if (view instanceof GiftInnerContentView) {
            final VRecyclerView recyclerView = ((GiftInnerContentView) view).getRecyclerView();
            if (recyclerView.isComputingLayout()) {
                e51.G(new Runnable() { // from class: l.msj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15612a.m8094t0(obj, recyclerView);
                    }
                });
            } else {
                m8094t0(obj, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    private void m8093r0() {
        this.f6379d.d(new C0434a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public /* synthetic */ void m8095u0(int i, Object obj) {
        m8092q0(obj, sxj.a(this.f6379d, i));
    }

    /* JADX INFO: renamed from: v0 */
    private void m8096v0(final int i, final Object obj) {
        View viewA = sxj.a(this.f6379d, i);
        if (viewA == null) {
            e51.G(new Runnable() { // from class: l.lsj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15034a.m8095u0(i, obj);
                }
            });
        } else {
            m8092q0(obj, viewA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public void m8094t0(Object obj, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRangeChanged(0, adapter.getItemCount(), obj);
    }

    /* JADX INFO: renamed from: B0 */
    public void m8098B0() {
        m8082I0(vwb.J(this.f6389n.f18703a), this.f6389n.m22145h());
        m8096v0(this.f6387l, 1);
        int i = this.f6388m;
        if (i == -1) {
            return;
        }
        m8096v0(i, 2);
    }

    /* JADX INFO: renamed from: E0 */
    public void m8099E0(rwj rwjVar) {
        this.f6389n = rwjVar;
        List<nqj> listM18041B = mmj.m18041B(rwjVar);
        this.f6384i.m21508q(listM18041B);
        if (rwjVar.f18706d) {
            this.f6379d.setCurrentItem(mmj.m18079x(listM18041B));
        }
        m8082I0(vwb.J(listM18041B), rwjVar.m22145h());
        m8081D0(rwjVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m8100G0() {
        if (this.f6384i == null) {
            return;
        }
        VPager vPager = this.f6379d;
        this.f6385j.m25548F2().GiftDialogEventGroup.refreshBottomIndicator().j(new elj(vPager, vPager.getCurrentItem(), this.f6384i.getCount()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v7, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: H0 */
    public void m8101H0() {
        String currentPureMode = (!"live".equals(this.f6385j.m25547E2().mo14489A0()) || this.f6385j.m25547E2().mo9893p()) ? "" : ypv.a.V().getCurrentPureMode();
        axj.m10101o(this.f6389n.m22141d(), this.f6385j.mo21430R2(), this.f6387l, currentPureMode);
        GiftDialogGiftsView giftDialogGiftsView = getGiftDialogGiftsView();
        if (giftDialogGiftsView == null) {
            return;
        }
        if (!giftDialogGiftsView.m8017B0()) {
            axj.m10093g(this.f6389n.m22141d(), this.f6385j.mo21430R2(), this.f6387l, currentPureMode);
        }
        giftDialogGiftsView.setIgnoreFirstTrackMs(false);
    }

    public BLiveTabEntrance getTabEntrance() {
        return this.f6389n.m22142e();
    }

    public int getTabIndex() {
        rwj rwjVar = this.f6389n;
        if (rwjVar != null) {
            return rwjVar.m22143f();
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8102p0(this);
        m8093r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m8102p0(View view) {
        nsj.m18976a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public void m8103s0(GiftDialogIndicator giftDialogIndicator, ahs<?> ahsVar) {
        this.f6386k = giftDialogIndicator;
        this.f6385j = ahsVar;
        if (this.f6384i == null) {
            qqj qqjVar = new qqj(ahsVar);
            this.f6384i = qqjVar;
            this.f6379d.setAdapter(qqjVar);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m8104w0() {
        m8096v0(this.f6387l, 2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m8105y0() {
        m8096v0(this.f6387l, 1);
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6387l = 0;
        this.f6388m = -1;
        this.f6390o = false;
    }

    public GiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6387l = 0;
        this.f6388m = -1;
        this.f6390o = false;
    }
}
