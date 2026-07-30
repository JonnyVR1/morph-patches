package com.p046p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveUpgradeGiftInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.UnScrollVPager;
import java.util.List;
import p149l.fsj0;
import p149l.ksj0;
import p149l.lsj0;
import p149l.mtj0;
import p149l.psj0;
import p149l.sxj;
import p149l.vwb;
import p149l.xdl0;
import p149l.xsj0;
import p149l.zsj0;

/* JADX INFO: loaded from: classes4.dex */
public class UpgradeGiftContentView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f50199d;

    /* JADX INFO: renamed from: e */
    public View f50200e;

    /* JADX INFO: renamed from: f */
    public TabLayout f50201f;

    /* JADX INFO: renamed from: g */
    public FixedScrollView f50202g;

    /* JADX INFO: renamed from: h */
    public UnScrollVPager f50203h;

    /* JADX INFO: renamed from: i */
    public View f50204i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f50205j;

    /* JADX INFO: renamed from: k */
    public mtj0 f50206k;

    /* JADX INFO: renamed from: l */
    public zsj0 f50207l;

    /* JADX INFO: renamed from: m */
    public lsj0 f50208m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.gift.upgradegift.view.UpgradeGiftContentView$a */
    public class C12837a implements lsj0 {
        public C12837a() {
        }

        @Override // p149l.lsj0
        /* JADX INFO: renamed from: a */
        public void mo74309a(String str) {
            UpgradeGiftContentView.this.f50206k.m156252b4(str);
        }

        @Override // p149l.lsj0
        /* JADX INFO: renamed from: b */
        public void mo74310b(xsj0 xsj0Var) {
            if (UpgradeGiftContentView.this.f50206k != null) {
                UpgradeGiftContentView.this.f50206k.m156243S3(xsj0Var);
            }
        }

        @Override // p149l.lsj0
        /* JADX INFO: renamed from: c */
        public String mo74311c() {
            return UpgradeGiftContentView.this.f50206k.m156244T3();
        }
    }

    public UpgradeGiftContentView(@NonNull Context context) {
        super(context);
        this.f50208m = new C12837a();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74304k0(View view) {
        psj0.m171157a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74305l0(List<fsj0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TabLayout.Tab tabAt = this.f50201f.getTabAt(i);
            if (tabAt != null) {
                tabAt.setText(list.get(i).f99084b);
            }
        }
        this.f50201f.setSelectedTabIndicatorColor(list.size() > 1 ? -1 : 0);
    }

    /* JADX INFO: renamed from: m0 */
    public void m74306m0(final BLiveUpgradeGiftInfo bLiveUpgradeGiftInfo, final mtj0 mtj0Var) {
        this.f50206k = mtj0Var;
        this.f50199d.setOnClickListener(new View.OnClickListener() { // from class: l.nsj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtj0Var.m156242R3();
            }
        });
        if (bLiveUpgradeGiftInfo == null || vwb.m200296J(bLiveUpgradeGiftInfo.slotGiftInfos)) {
            xdl0.m208344M(this.f50205j, true);
            return;
        }
        if (this.f50207l == null) {
            zsj0 zsj0Var = new zsj0();
            this.f50207l = zsj0Var;
            this.f50203h.setAdapter(zsj0Var);
            this.f50201f.setupWithViewPager(this.f50203h);
        }
        xdl0.m208344M(this.f50204i, true ^ TextUtils.isEmpty(bLiveUpgradeGiftInfo.rule.entrance));
        this.f50204i.setOnClickListener(new View.OnClickListener() { // from class: l.osj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mtj0Var.m156250Z3(bLiveUpgradeGiftInfo.rule.entrance);
            }
        });
        List<fsj0> listM147078e = ksj0.m147078e(bLiveUpgradeGiftInfo, this.f50208m);
        this.f50207l.m156149q(listM147078e);
        m74305l0(listM147078e);
        xdl0.m208344M(this.f50205j, false);
    }

    /* JADX INFO: renamed from: n0 */
    public void m74307n0() {
        xdl0.m208344M(this.f50205j, true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m74308o0(xsj0 xsj0Var) {
        UnScrollVPager unScrollVPager = this.f50203h;
        View viewM186440a = sxj.m186440a(unScrollVPager, unScrollVPager.getCurrentItem());
        if (viewM186440a instanceof UpgradeGiftView) {
            ((UpgradeGiftView) viewM186440a).m74361d(xsj0Var.m210777d());
        }
    }

    public void onDestroy() {
        int childCount = this.f50203h.getChildCount();
        int i = 0;
        if (childCount >= 1) {
            this.f50203h.setCurrentItem(0);
        }
        while (true) {
            UnScrollVPager unScrollVPager = this.f50203h;
            if (i >= childCount) {
                unScrollVPager.removeAllViews();
                this.f50201f.removeAllTabs();
                return;
            } else {
                View childAt = unScrollVPager.getChildAt(i);
                if (childAt instanceof UpgradeGiftView) {
                    ((UpgradeGiftView) childAt).m74359b();
                }
                i++;
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74304k0(this);
        this.f50202g.getLayoutParams().height = (int) (xdl0.m208408w0() * 0.7f);
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50208m = new C12837a();
    }

    public UpgradeGiftContentView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50208m = new C12837a();
    }
}
