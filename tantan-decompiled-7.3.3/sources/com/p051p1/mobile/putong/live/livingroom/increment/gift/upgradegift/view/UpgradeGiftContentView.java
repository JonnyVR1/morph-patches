package com.p051p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import java.util.List;
import p153l.a2k0;
import p153l.bnl0;
import p153l.c2k0;
import p153l.i0k;
import p153l.i1k0;
import p153l.jyb;
import p153l.n1k0;
import p153l.o1k0;
import p153l.p2k0;
import p153l.s1k0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f51047d;

    /* JADX INFO: renamed from: e */
    public View f51048e;

    /* JADX INFO: renamed from: f */
    public TabLayout f51049f;

    /* JADX INFO: renamed from: g */
    public FixedScrollView f51050g;

    /* JADX INFO: renamed from: h */
    public UnScrollVPager f51051h;

    /* JADX INFO: renamed from: i */
    public View f51052i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f51053j;

    /* JADX INFO: renamed from: k */
    public p2k0 f51054k;

    /* JADX INFO: renamed from: l */
    public c2k0 f51055l;

    /* JADX INFO: renamed from: m */
    public o1k0 f51056m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView$a */
    public class C13000a implements o1k0 {
        public C13000a() {
        }

        @Override // p153l.o1k0
        /* JADX INFO: renamed from: a */
        public void mo75492a(String str) {
            UpgradeGiftContentView.this.f51054k.m170373b4(str);
        }

        @Override // p153l.o1k0
        /* JADX INFO: renamed from: b */
        public void mo75493b(a2k0 a2k0Var) {
            if (UpgradeGiftContentView.this.f51054k != null) {
                UpgradeGiftContentView.this.f51054k.m170364S3(a2k0Var);
            }
        }

        @Override // p153l.o1k0
        /* JADX INFO: renamed from: c */
        public String mo75494c() {
            return UpgradeGiftContentView.this.f51054k.m170365T3();
        }
    }

    public UpgradeGiftContentView(@NonNull Context context) {
        super(context);
        this.f51056m = new C13000a();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75487k0(View view) {
        s1k0.m184052a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m75488l0(List<i1k0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TabLayout.Tab tabAt = this.f51049f.getTabAt(i);
            if (tabAt != null) {
                tabAt.setText(list.get(i).f112533b);
            }
        }
        this.f51049f.setSelectedTabIndicatorColor(list.size() > 1 ? -1 : 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m75489m0(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final p2k0 p2k0Var) {
        this.f51054k = p2k0Var;
        this.f51047d.setOnClickListener(new View.OnClickListener() { // from class: l.q1k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2k0Var.m170363R3();
            }
        });
        if (bLiveUpgradeGiftInfo == null || jyb.m147479J(bLiveUpgradeGiftInfo.slotGiftInfos)) {
            bnl0.m105524M(this.f51053j, true);
            return;
        }
        if (this.f51055l == null) {
            c2k0 c2k0Var = new c2k0();
            this.f51055l = c2k0Var;
            this.f51051h.setAdapter(c2k0Var);
            this.f51049f.setupWithViewPager(this.f51051h);
        }
        bnl0.m105524M(this.f51052i, true ^ TextUtils.isEmpty(bLiveUpgradeGiftInfo.rule.entrance));
        this.f51052i.setOnClickListener(new View.OnClickListener() { // from class: l.r1k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                p2k0Var.m170371Z3(bLiveUpgradeGiftInfo.rule.entrance);
            }
        });
        List<i1k0> listM161120e = n1k0.m161120e(bLiveUpgradeGiftInfo, this.f51056m);
        this.f51055l.m170211q(listM161120e);
        m75488l0(listM161120e);
        bnl0.m105524M(this.f51053j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public void m75490n0() {
        bnl0.m105524M(this.f51053j, true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m75491o0(a2k0 a2k0Var) {
        UnScrollVPager unScrollVPager = this.f51051h;
        View viewM137974a = i0k.m137974a(unScrollVPager, unScrollVPager.getCurrentItem());
        if (viewM137974a instanceof UpgradeGiftView) {
            ((UpgradeGiftView) viewM137974a).m75544d(a2k0Var.m95710d());
        }
    }

    public void onDestroy() {
        int childCount = this.f51051h.getChildCount();
        int i = 0;
        if (childCount >= 1) {
            this.f51051h.setCurrentItem(0);
        }
        while (true) {
            UnScrollVPager unScrollVPager = this.f51051h;
            if (i >= childCount) {
                unScrollVPager.removeAllViews();
                this.f51049f.removeAllTabs();
                return;
            } else {
                View childAt = unScrollVPager.getChildAt(i);
                if (childAt instanceof UpgradeGiftView) {
                    ((UpgradeGiftView) childAt).m75542b();
                }
                i++;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75487k0(this);
        this.f51050g.getLayoutParams().height = (int) (bnl0.m105588w0() * 0.7f);
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f51056m = new C13000a();
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51056m = new C13000a();
    }
}
