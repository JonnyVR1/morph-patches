package com.p046p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import java.util.List;
import p147v.VImage;
import p147v.VPager;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.adl0;
import p149l.axj;
import p149l.bgv;
import p149l.blu;
import p149l.e51;
import p149l.elj;
import p149l.fld0;
import p149l.i3c0;
import p149l.nmj;
import p149l.oqj;
import p149l.pqj;
import p149l.rwj;
import p149l.sxj;
import p149l.trj;
import p149l.uju;
import p149l.vwb;
import p149l.xdl0;
import p149l.ypv;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatGiftOuterContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VPager f45221d;

    /* JADX INFO: renamed from: e */
    public VImage f45222e;

    /* JADX INFO: renamed from: f */
    public VText f45223f;

    /* JADX INFO: renamed from: g */
    public Group f45224g;

    /* JADX INFO: renamed from: h */
    public pqj f45225h;

    /* JADX INFO: renamed from: i */
    public uju<?> f45226i;

    /* JADX INFO: renamed from: j */
    public GiftDialogIndicator f45227j;

    /* JADX INFO: renamed from: k */
    public int f45228k;

    /* JADX INFO: renamed from: l */
    public int f45229l;

    /* JADX INFO: renamed from: m */
    public rwj f45230m;

    /* JADX INFO: renamed from: n */
    public boolean f45231n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView$a */
    public class C12517a extends adl0 {
        public C12517a() {
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                LiveVChatGiftOuterContentView.this.f45231n = false;
            }
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (LiveVChatGiftOuterContentView.this.f45231n || i2 <= 0) {
                return;
            }
            LiveVChatGiftOuterContentView.this.f45231n = true;
            LiveVChatGiftOuterContentView.this.f45226i.m194089v3();
        }

        @Override // p149l.adl0, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            LiveVChatGiftOuterContentView liveVChatGiftOuterContentView = LiveVChatGiftOuterContentView.this;
            liveVChatGiftOuterContentView.f45229l = liveVChatGiftOuterContentView.f45228k;
            LiveVChatGiftOuterContentView.this.f45228k = i;
            trj.m190420a();
            if (LiveVChatGiftOuterContentView.this.getTabIndex() == LiveVChatGiftOuterContentView.this.f45226i.m194080k3()) {
                LiveVChatGiftOuterContentView.this.m69505G0();
                LiveVChatGiftOuterContentView.this.m69502B0();
            }
        }
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context) {
        super(context);
        this.f45228k = 0;
        this.f45229l = -1;
        this.f45231n = false;
    }

    /* JADX INFO: renamed from: r0 */
    private void m69501r0() {
        this.f45221d.m4185d(new C12517a());
    }

    /* JADX INFO: renamed from: B0 */
    public void m69502B0() {
        m69507I0(vwb.m200296J(this.f45230m.f161338a), this.f45230m.m181401h());
        m69514v0(this.f45228k, 1);
        int i = this.f45229l;
        if (i == -1) {
            return;
        }
        m69514v0(i, 2);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m69503D0(rwj rwjVar) {
        if (rwjVar.m181395b()) {
            m69508J0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m69504E0(rwj rwjVar) {
        this.f45230m = rwjVar;
        List<oqj> listM160106r = nmj.m160106r(rwjVar);
        this.f45225h.m170924q(listM160106r);
        if (rwjVar.f161341d) {
            this.f45221d.setCurrentItem(nmj.m160102n(listM160106r));
        }
        m69507I0(vwb.m200296J(listM160106r), rwjVar.m181401h());
        m69503D0(rwjVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m69505G0() {
        if (this.f45225h == null) {
            return;
        }
        VPager vPager = this.f45221d;
        this.f45226i.m218411K2().GiftDialogEventGroup.m69179g().mo172463j(new elj(vPager, vPager.getCurrentItem(), this.f45225h.getCount()));
    }

    /* JADX INFO: renamed from: H0 */
    public void m69506H0() {
        axj.m99441o(this.f45230m.m181397d(), "p_live_user_video_quickchat_room", this.f45228k, "");
    }

    /* JADX INFO: renamed from: I0 */
    public final void m69507I0(boolean z, boolean z2) {
        xdl0.m208344M(this.f45224g, z);
        xdl0.m208344M(this.f45221d, !z);
        if (z) {
            this.f45223f.setText(z2 ? R$string.f47185d5 : R$string.f47163c5);
            this.f45222e.setImageResource(i3c0.f111146r4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m69508J0() {
        fld0<bgv> fld0Var = fld0.f98151f;
        boolean zM101738r = ((bgv) ypv.m215673l(fld0Var)).m101738r();
        if (this.f45225h.getCount() <= 0 || zM101738r) {
            return;
        }
        ((bgv) ypv.m215673l(fld0Var)).m101714B();
    }

    public int getTabIndex() {
        rwj rwjVar = this.f45230m;
        if (rwjVar != null) {
            return rwjVar.m181399f();
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69509p0(this);
        m69501r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m69509p0(View view) {
        blu.m102560a(this, view);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m69510q0(final Object obj, View view) {
        if (view instanceof LiveVChatGiftInnerContentView) {
            final VRecyclerView recyclerView = ((LiveVChatGiftInnerContentView) view).getRecyclerView();
            if (recyclerView.isComputingLayout()) {
                e51.m114742G(new Runnable() { // from class: l.alu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f70518a.m69512t0(obj, recyclerView);
                    }
                });
            } else {
                m69512t0(obj, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m69511s0(GiftDialogIndicator giftDialogIndicator, uju<?> ujuVar) {
        this.f45227j = giftDialogIndicator;
        this.f45226i = ujuVar;
        if (this.f45225h == null) {
            pqj pqjVar = new pqj(ujuVar);
            this.f45225h = pqjVar;
            this.f45221d.setAdapter(pqjVar);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m69513u0(int i, Object obj) {
        m69510q0(obj, sxj.m186440a(this.f45221d, i));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m69514v0(final int i, final Object obj) {
        View viewM186440a = sxj.m186440a(this.f45221d, i);
        if (viewM186440a == null) {
            e51.m114742G(new Runnable() { // from class: l.zku
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203566a.m69513u0(i, obj);
                }
            });
        } else {
            m69510q0(obj, viewM186440a);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m69515w0() {
        m69514v0(this.f45228k, 2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m69516y0() {
        m69514v0(this.f45228k, 1);
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final void m69512t0(Object obj, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRangeChanged(0, adapter.getItemCount(), obj);
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45228k = 0;
        this.f45229l = -1;
        this.f45231n = false;
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45228k = 0;
        this.f45229l = -1;
        this.f45231n = false;
    }
}
