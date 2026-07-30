package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.List;
import p147v.VDraweeView;
import p147v.VPager;
import p149l.etj0;
import p149l.hxs;
import p149l.ksj0;
import p149l.ptj0;
import p149l.sxj;
import p149l.t100;
import p149l.vwb;
import p149l.w9j;
import p149l.wsj0;
import p149l.xdl0;
import p149l.xsj0;
import p149l.y660;
import p149l.ydt;
import p149l.ysj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftPagerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f50241d;

    /* JADX INFO: renamed from: e */
    public View f50242e;

    /* JADX INFO: renamed from: f */
    public TextView f50243f;

    /* JADX INFO: renamed from: g */
    public View f50244g;

    /* JADX INFO: renamed from: h */
    public VPager f50245h;

    /* JADX INFO: renamed from: i */
    public wsj0 f50246i;

    /* JADX INFO: renamed from: j */
    public int f50247j;

    /* JADX INFO: renamed from: k */
    public int f50248k;

    /* JADX INFO: renamed from: l */
    public List<xsj0> f50249l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerView$a */
    public class C12840a extends y660 {
        public C12840a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (UpgradeGiftPagerView.this.f50248k != UpgradeGiftPagerView.this.f50247j) {
                UpgradeGiftPagerView upgradeGiftPagerView = UpgradeGiftPagerView.this;
                upgradeGiftPagerView.f50248k = upgradeGiftPagerView.f50247j;
            }
            UpgradeGiftPagerView.this.f50247j = i;
            UpgradeGiftPagerView.this.m74350s0();
        }
    }

    public UpgradeGiftPagerView(Context context) {
        super(context);
        this.f50247j = 0;
        this.f50248k = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m74346o0(View view) {
        etj0.m118126a(this, view);
    }

    public void onDestroy() {
        int childCount = this.f50245h.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f50245h.getChildAt(i);
            if (childAt instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) childAt).onDestroy();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74346o0(this);
        int iM208412y0 = (xdl0.m208412y0() - t100.m186890d(218.0f)) / 2;
        this.f50245h.setPadding(iM208412y0, 0, iM208412y0, 0);
        this.f50245h.m4185d(new C12840a());
        this.f50245h.setPageMargin(-t100.m186890d(30.0f));
        hxs.m133406s("context_livingAct", this.f50241d, ydt.f197614d);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m74347p0(final BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        int iM200293G = vwb.m200293G(this.f50249l, new w9j() { // from class: l.ctj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLiveUpgradeGiftInfoItem.f44466id, ((xsj0) obj).m210777d().f44466id));
            }
        });
        if (iM200293G >= 0) {
            View viewM186440a = sxj.m186440a(this.f50245h, iM200293G);
            if (viewM186440a instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) viewM186440a).m74338s0(true);
            } else {
                bLiveUpgradeGiftInfoItem.status = "equipped";
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m74348q0(int i) {
        m74352u0(sxj.m186440a(this.f50245h, i), true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m74349r0(int i, boolean z) {
        if (i < 0 || i >= this.f50246i.getCount()) {
            return;
        }
        m74352u0(sxj.m186440a(this.f50245h, i), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m74350s0() {
        m74349r0(this.f50247j, true);
        m74349r0(this.f50248k, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m74351t0(ysj0 ysj0Var) {
        if (this.f50246i == null) {
            this.f50246i = new wsj0();
            this.f50245h.mo4180X(true, new ptj0());
            this.f50245h.setAdapter(this.f50246i);
        }
        this.f50243f.setText(ysj0Var.m215913d().storeName);
        this.f50249l = ksj0.m147077d(ysj0Var);
        this.f50245h.setOffscreenPageLimit(2);
        this.f50246i.m156149q(this.f50249l);
        final int iM147079f = ksj0.m147079f(ysj0Var);
        this.f50245h.setCurrentItem(iM147079f);
        this.f50245h.post(new Runnable() { // from class: l.dtj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87847a.m74348q0(iM147079f);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m74352u0(View view, boolean z) {
        if (view instanceof UpgradeGiftPagerItemView) {
            ((UpgradeGiftPagerItemView) view).m74337r0(z);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m74353v0() {
        int iM200293G = vwb.m200293G(this.f50249l, new w9j() { // from class: l.btj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((xsj0) obj).m210779f());
            }
        });
        if (iM200293G >= 0) {
            View viewM186440a = sxj.m186440a(this.f50245h, iM200293G);
            if (viewM186440a instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) viewM186440a).m74338s0(false);
            } else {
                this.f50249l.get(iM200293G).m210777d().status = "unlocked";
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m74354w0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m74353v0();
        m74347p0(bLiveUpgradeGiftInfoItem);
    }

    public UpgradeGiftPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50247j = 0;
        this.f50248k = -1;
    }
}
