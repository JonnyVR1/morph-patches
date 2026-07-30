package com.p000p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.List;
import l.hxs;
import l.sxj;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ydt;
import p002l.etj0;
import p002l.ksj0;
import p002l.ptj0;
import p002l.wsj0;
import p002l.xsj0;
import p002l.y660;
import p002l.ysj0;
import v.VDraweeView;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UpgradeGiftPagerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f6283d;

    /* JADX INFO: renamed from: e */
    public View f6284e;

    /* JADX INFO: renamed from: f */
    public TextView f6285f;

    /* JADX INFO: renamed from: g */
    public View f6286g;

    /* JADX INFO: renamed from: h */
    public VPager f6287h;

    /* JADX INFO: renamed from: i */
    public wsj0 f6288i;

    /* JADX INFO: renamed from: j */
    public int f6289j;

    /* JADX INFO: renamed from: k */
    public int f6290k;

    /* JADX INFO: renamed from: l */
    public List<xsj0> f6291l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerView$a */
    public class C0429a extends y660 {
        public C0429a() {
        }

        @Override // p002l.y660
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (UpgradeGiftPagerView.this.f6290k != UpgradeGiftPagerView.this.f6289j) {
                UpgradeGiftPagerView upgradeGiftPagerView = UpgradeGiftPagerView.this;
                upgradeGiftPagerView.f6290k = upgradeGiftPagerView.f6289j;
            }
            UpgradeGiftPagerView.this.f6289j = i;
            UpgradeGiftPagerView.this.m7931s0();
        }
    }

    public UpgradeGiftPagerView(Context context) {
        super(context);
        this.f6289j = 0;
        this.f6290k = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m7927o0(View view) {
        etj0.m12696a(this, view);
    }

    public void onDestroy() {
        int childCount = this.f6287h.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Object childAt = this.f6287h.getChildAt(i);
            if (childAt instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) childAt).onDestroy();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7927o0(this);
        int iY0 = (xdl0.y0() - t100.d(218.0f)) / 2;
        this.f6287h.setPadding(iY0, 0, iY0, 0);
        this.f6287h.d(new C0429a());
        this.f6287h.setPageMargin(-t100.d(30.0f));
        hxs.s("context_livingAct", this.f6283d, ydt.d);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m7928p0(final BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        int iG = vwb.G(this.f6291l, new w9j() { // from class: l.ctj0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLiveUpgradeGiftInfoItem.id, ((xsj0) obj).m26104d().id));
            }
        });
        if (iG >= 0) {
            Object objA = sxj.a(this.f6287h, iG);
            if (objA instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) objA).m7919s0(true);
            } else {
                bLiveUpgradeGiftInfoItem.status = "equipped";
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7929q0(int i) {
        m7933u0(sxj.a(this.f6287h, i), true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m7930r0(int i, boolean z) {
        if (i < 0 || i >= this.f6288i.getCount()) {
            return;
        }
        m7933u0(sxj.a(this.f6287h, i), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m7931s0() {
        m7930r0(this.f6289j, true);
        m7930r0(this.f6290k, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m7932t0(ysj0 ysj0Var) {
        if (this.f6288i == null) {
            this.f6288i = new wsj0();
            this.f6287h.X(true, new ptj0());
            this.f6287h.setAdapter(this.f6288i);
        }
        this.f6285f.setText(ysj0Var.m26916d().storeName);
        this.f6291l = ksj0.m16777d(ysj0Var);
        this.f6287h.setOffscreenPageLimit(2);
        this.f6288i.m18148q(this.f6291l);
        final int iM16779f = ksj0.m16779f(ysj0Var);
        this.f6287h.setCurrentItem(iM16779f);
        this.f6287h.post(new Runnable() { // from class: l.dtj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f9420a.m7929q0(iM16779f);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final void m7933u0(View view, boolean z) {
        if (view instanceof UpgradeGiftPagerItemView) {
            ((UpgradeGiftPagerItemView) view).m7918r0(z);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m7934v0() {
        int iG = vwb.G(this.f6291l, new w9j() { // from class: l.btj0
            public final Object call(Object obj) {
                return Boolean.valueOf(((xsj0) obj).m26106f());
            }
        });
        if (iG >= 0) {
            Object objA = sxj.a(this.f6287h, iG);
            if (objA instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) objA).m7919s0(false);
            } else {
                this.f6291l.get(iG).m26104d().status = "unlocked";
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m7935w0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m7934v0();
        m7928p0(bLiveUpgradeGiftInfoItem);
    }

    public UpgradeGiftPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6289j = 0;
        this.f6290k = -1;
    }
}
