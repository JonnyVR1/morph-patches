package com.p051p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftDialogIndicator;
import java.util.List;
import p151v.VImage;
import p151v.VPager;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.civ;
import p153l.cnu;
import p153l.dpj;
import p153l.eml0;
import p153l.etj;
import p153l.ftj;
import p153l.htd0;
import p153l.hzj;
import p153l.i0k;
import p153l.juj;
import p153l.jyb;
import p153l.l51;
import p153l.obc0;
import p153l.qzj;
import p153l.unj;
import p153l.vlu;
import p153l.zrv;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatGiftOuterContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VPager f46069d;

    /* JADX INFO: renamed from: e */
    public VImage f46070e;

    /* JADX INFO: renamed from: f */
    public VText f46071f;

    /* JADX INFO: renamed from: g */
    public Group f46072g;

    /* JADX INFO: renamed from: h */
    public ftj f46073h;

    /* JADX INFO: renamed from: i */
    public vlu<?> f46074i;

    /* JADX INFO: renamed from: j */
    public GiftDialogIndicator f46075j;

    /* JADX INFO: renamed from: k */
    public int f46076k;

    /* JADX INFO: renamed from: l */
    public int f46077l;

    /* JADX INFO: renamed from: m */
    public hzj f46078m;

    /* JADX INFO: renamed from: n */
    public boolean f46079n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.giftDialog.view.LiveVChatGiftOuterContentView$a */
    public class C12680a extends eml0 {
        public C12680a() {
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            if (i == 0) {
                LiveVChatGiftOuterContentView.this.f46079n = false;
            }
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
            super.onPageScrolled(i, f, i2);
            if (LiveVChatGiftOuterContentView.this.f46079n || i2 <= 0) {
                return;
            }
            LiveVChatGiftOuterContentView.this.f46079n = true;
            LiveVChatGiftOuterContentView.this.f46074i.m201719v3();
        }

        @Override // p153l.eml0, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            LiveVChatGiftOuterContentView liveVChatGiftOuterContentView = LiveVChatGiftOuterContentView.this;
            liveVChatGiftOuterContentView.f46077l = liveVChatGiftOuterContentView.f46076k;
            LiveVChatGiftOuterContentView.this.f46076k = i;
            juj.m146987a();
            if (LiveVChatGiftOuterContentView.this.getTabIndex() == LiveVChatGiftOuterContentView.this.f46074i.m201710k3()) {
                LiveVChatGiftOuterContentView.this.m70688G0();
                LiveVChatGiftOuterContentView.this.m70685B0();
            }
        }
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context) {
        super(context);
        this.f46076k = 0;
        this.f46077l = -1;
        this.f46079n = false;
    }

    /* JADX INFO: renamed from: r0 */
    private void m70684r0() {
        this.f46069d.m4187d(new C12680a());
    }

    /* JADX INFO: renamed from: B0 */
    public void m70685B0() {
        m70690I0(jyb.m147479J(this.f46078m.f112248a), this.f46078m.m137900h());
        m70697v0(this.f46076k, 1);
        int i = this.f46077l;
        if (i == -1) {
            return;
        }
        m70697v0(i, 2);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m70686D0(hzj hzjVar) {
        if (hzjVar.m137894b()) {
            m70691J0();
        }
    }

    /* JADX INFO: renamed from: E0 */
    public void m70687E0(hzj hzjVar) {
        this.f46078m = hzjVar;
        List<etj> listM117398r = dpj.m117398r(hzjVar);
        this.f46073h.m127323q(listM117398r);
        if (hzjVar.f112251d) {
            this.f46069d.setCurrentItem(dpj.m117394n(listM117398r));
        }
        m70690I0(jyb.m147479J(listM117398r), hzjVar.m137900h());
        m70686D0(hzjVar);
    }

    /* JADX INFO: renamed from: G0 */
    public void m70688G0() {
        if (this.f46073h == null) {
            return;
        }
        VPager vPager = this.f46069d;
        this.f46074i.m97928K2().GiftDialogEventGroup.m70362g().mo199273j(new unj(vPager, vPager.getCurrentItem(), this.f46073h.getCount()));
    }

    /* JADX INFO: renamed from: H0 */
    public void m70689H0() {
        qzj.m178798o(this.f46078m.m137896d(), "p_live_user_video_quickchat_room", this.f46076k, "");
    }

    /* JADX INFO: renamed from: I0 */
    public final void m70690I0(boolean z, boolean z2) {
        bnl0.m105524M(this.f46072g, z);
        bnl0.m105524M(this.f46069d, !z);
        if (z) {
            this.f46071f.setText(z2 ? R$string.f48033d5 : R$string.f48011c5);
            this.f46070e.setImageResource(obc0.f146474r4);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final void m70691J0() {
        htd0<civ> htd0Var = htd0.f111524f;
        boolean zM109974r = ((civ) zrv.m221194l(htd0Var)).m109974r();
        if (this.f46073h.getCount() <= 0 || zM109974r) {
            return;
        }
        ((civ) zrv.m221194l(htd0Var)).m109950B();
    }

    public int getTabIndex() {
        hzj hzjVar = this.f46078m;
        if (hzjVar != null) {
            return hzjVar.m137898f();
        }
        return -1;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70692p0(this);
        m70684r0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m70692p0(View view) {
        cnu.m111541a(this, view);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m70693q0(final Object obj, View view) {
        if (view instanceof LiveVChatGiftInnerContentView) {
            final VRecyclerView recyclerView = ((LiveVChatGiftInnerContentView) view).getRecyclerView();
            if (recyclerView.isComputingLayout()) {
                l51.m152887G(new Runnable() { // from class: l.bnu
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77589a.m70695t0(obj, recyclerView);
                    }
                });
            } else {
                m70695t0(obj, recyclerView);
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m70694s0(GiftDialogIndicator giftDialogIndicator, vlu<?> vluVar) {
        this.f46075j = giftDialogIndicator;
        this.f46074i = vluVar;
        if (this.f46073h == null) {
            ftj ftjVar = new ftj(vluVar);
            this.f46073h = ftjVar;
            this.f46069d.setAdapter(ftjVar);
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m70696u0(int i, Object obj) {
        m70693q0(obj, i0k.m137974a(this.f46069d, i));
    }

    /* JADX INFO: renamed from: v0 */
    public final void m70697v0(final int i, final Object obj) {
        View viewM137974a = i0k.m137974a(this.f46069d, i);
        if (viewM137974a == null) {
            l51.m152887G(new Runnable() { // from class: l.anu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72381a.m70696u0(i, obj);
                }
            });
        } else {
            m70693q0(obj, viewM137974a);
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m70698w0() {
        m70697v0(this.f46076k, 2);
    }

    /* JADX INFO: renamed from: y0 */
    public void m70699y0() {
        m70697v0(this.f46076k, 1);
    }

    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final void m70695t0(Object obj, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyItemRangeChanged(0, adapter.getItemCount(), obj);
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46076k = 0;
        this.f46077l = -1;
        this.f46079n = false;
    }

    public LiveVChatGiftOuterContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46076k = 0;
        this.f46077l = -1;
        this.f46079n = false;
    }
}
