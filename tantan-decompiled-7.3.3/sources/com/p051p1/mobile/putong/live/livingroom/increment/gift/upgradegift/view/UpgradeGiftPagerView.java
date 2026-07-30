package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfoItem;
import java.util.List;
import p151v.VDraweeView;
import p151v.VPager;
import p153l.a2k0;
import p153l.b2k0;
import p153l.bnl0;
import p153l.ef60;
import p153l.h2k0;
import p153l.i0k;
import p153l.izs;
import p153l.jyb;
import p153l.n1k0;
import p153l.qa00;
import p153l.qcj;
import p153l.s2k0;
import p153l.z1k0;
import p153l.zft;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftPagerView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51089d;

    /* JADX INFO: renamed from: e */
    public View f51090e;

    /* JADX INFO: renamed from: f */
    public TextView f51091f;

    /* JADX INFO: renamed from: g */
    public View f51092g;

    /* JADX INFO: renamed from: h */
    public VPager f51093h;

    /* JADX INFO: renamed from: i */
    public z1k0 f51094i;

    /* JADX INFO: renamed from: j */
    public int f51095j;

    /* JADX INFO: renamed from: k */
    public int f51096k;

    /* JADX INFO: renamed from: l */
    public List<a2k0> f51097l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftPagerView$a */
    public class C13003a extends ef60 {
        public C13003a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (UpgradeGiftPagerView.this.f51096k != UpgradeGiftPagerView.this.f51095j) {
                UpgradeGiftPagerView upgradeGiftPagerView = UpgradeGiftPagerView.this;
                upgradeGiftPagerView.f51096k = upgradeGiftPagerView.f51095j;
            }
            UpgradeGiftPagerView.this.f51095j = i;
            UpgradeGiftPagerView.this.m75533s0();
        }
    }

    public UpgradeGiftPagerView(Context context) {
        super(context);
        this.f51095j = 0;
        this.f51096k = -1;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m75529o0(View view) {
        h2k0.m133393a(this, view);
    }

    public void onDestroy() {
        int childCount = this.f51093h.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f51093h.getChildAt(i);
            if (childAt instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) childAt).onDestroy();
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75529o0(this);
        int iM105592y0 = (bnl0.m105592y0() - qa00.m175859d(218.0f)) / 2;
        this.f51093h.setPadding(iM105592y0, 0, iM105592y0, 0);
        this.f51093h.m4187d(new C13003a());
        this.f51093h.setPageMargin(-qa00.m175859d(30.0f));
        izs.m142868s("context_livingAct", this.f51089d, zft.f204209d);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m75530p0(final BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        int iM147476G = jyb.m147476G(this.f51097l, new qcj() { // from class: l.f2k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(bLiveUpgradeGiftInfoItem.f45314id, ((a2k0) obj).m95710d().f45314id));
            }
        });
        if (iM147476G >= 0) {
            View viewM137974a = i0k.m137974a(this.f51093h, iM147476G);
            if (viewM137974a instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) viewM137974a).m75521s0(true);
            } else {
                bLiveUpgradeGiftInfoItem.status = "equipped";
            }
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m75531q0(int i) {
        m75535u0(i0k.m137974a(this.f51093h, i), true);
    }

    /* JADX INFO: renamed from: r0 */
    public final void m75532r0(int i, boolean z) {
        if (i < 0 || i >= this.f51094i.getCount()) {
            return;
        }
        m75535u0(i0k.m137974a(this.f51093h, i), z);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m75533s0() {
        m75532r0(this.f51095j, true);
        m75532r0(this.f51096k, false);
    }

    /* JADX INFO: renamed from: t0 */
    public void m75534t0(b2k0 b2k0Var) {
        if (this.f51094i == null) {
            this.f51094i = new z1k0();
            this.f51093h.mo4182X(true, new s2k0());
            this.f51093h.setAdapter(this.f51094i);
        }
        this.f51091f.setText(b2k0Var.m102201d().storeName);
        this.f51097l = n1k0.m161119d(b2k0Var);
        this.f51093h.setOffscreenPageLimit(2);
        this.f51094i.m170211q(this.f51097l);
        final int iM161121f = n1k0.m161121f(b2k0Var);
        this.f51093h.setCurrentItem(iM161121f);
        this.f51093h.post(new Runnable() { // from class: l.g2k0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101853a.m75531q0(iM161121f);
            }
        });
    }

    /* JADX INFO: renamed from: u0 */
    public final void m75535u0(View view, boolean z) {
        if (view instanceof UpgradeGiftPagerItemView) {
            ((UpgradeGiftPagerItemView) view).m75520r0(z);
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m75536v0() {
        int iM147476G = jyb.m147476G(this.f51097l, new qcj() { // from class: l.e2k0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((a2k0) obj).m95712f());
            }
        });
        if (iM147476G >= 0) {
            View viewM137974a = i0k.m137974a(this.f51093h, iM147476G);
            if (viewM137974a instanceof UpgradeGiftPagerItemView) {
                ((UpgradeGiftPagerItemView) viewM137974a).m75521s0(false);
            } else {
                this.f51097l.get(iM147476G).m95710d().status = "unlocked";
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public void m75537w0(BLiveUpgradeGiftInfoItem bLiveUpgradeGiftInfoItem) {
        m75536v0();
        m75530p0(bLiveUpgradeGiftInfoItem);
    }

    public UpgradeGiftPagerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51095j = 0;
        this.f51096k = -1;
    }
}
