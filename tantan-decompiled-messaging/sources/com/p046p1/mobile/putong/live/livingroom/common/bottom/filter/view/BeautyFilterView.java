package com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VPagerNoPage;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.g5c0;
import p149l.hpd0;
import p149l.t6c0;
import p149l.twr;
import p149l.v660;
import p149l.xdl0;
import p149l.ypv;
import p149l.zu2;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyFilterView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public OnFlingFrameLayout f48577a;

    /* JADX INFO: renamed from: b */
    public VText f48578b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f48579c;

    /* JADX INFO: renamed from: d */
    public VText f48580d;

    /* JADX INFO: renamed from: e */
    public TextSeekBar f48581e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f48582f;

    /* JADX INFO: renamed from: g */
    public VText f48583g;

    /* JADX INFO: renamed from: h */
    public TextSeekBar f48584h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f48585i;

    /* JADX INFO: renamed from: j */
    public ContrastView f48586j;

    /* JADX INFO: renamed from: k */
    public TabLayout f48587k;

    /* JADX INFO: renamed from: l */
    public VLinear f48588l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f48589m;

    /* JADX INFO: renamed from: n */
    public v660 f48590n;

    /* JADX INFO: renamed from: o */
    public e30<BeautyTabItem> f48591o;

    /* JADX INFO: renamed from: p */
    public d30 f48592p;

    /* JADX INFO: renamed from: q */
    public final hpd0 f48593q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f48594r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView$a */
    public class C12723a implements ViewPager.InterfaceC0716j {
        public C12723a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            hpd0 hpd0Var;
            boolean z = i == 0;
            BeautyFilterView.this.f48584h.m72242h(false);
            xdl0.m208344M(BeautyFilterView.this.f48588l, z);
            if (NullChecker.m81303a(BeautyFilterView.this.f48591o)) {
                BeautyFilterView.this.f48591o.call(BeautyTabItem.values()[i]);
            }
            if (i == 1) {
                hpd0Var = BeautyFilterView.this.f48593q;
            } else {
                hpd0Var = i == 2 ? BeautyFilterView.this.f48594r : null;
            }
            if (NullChecker.m81303a(hpd0Var)) {
                xdl0.m208344M(BeautyFilterView.this.f48587k.getTabAt(i).getCustomView().findViewById(g5c0.f100868Z4), false);
                hpd0Var.put(Boolean.TRUE);
            }
        }
    }

    public BeautyFilterView(Context context) {
        super(context);
        String strM190893j = twr.m190893j(ypv.f199493a.m199309D0());
        Boolean bool = Boolean.FALSE;
        this.f48593q = new hpd0(strM190893j, bool);
        this.f48594r = new hpd0(twr.m190889f(ypv.f199493a.m199309D0()), bool);
    }

    /* JADX INFO: renamed from: e */
    public final void m72211e(View view) {
        zu2.m220194a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m72212f(View view) {
        if (NullChecker.m81303a(this.f48592p)) {
            this.f48592p.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m72213g(boolean z, String str) {
        xdl0.m208344M(this.f48578b, z);
        this.f48578b.setText(str);
    }

    public VRecyclerView getBeautyView() {
        return this.f48590n.m197197q();
    }

    public int getCurrentItem() {
        return this.f48589m.getCurrentItem();
    }

    public VRecyclerView getFilterView() {
        return this.f48590n.m197198r();
    }

    public VRecyclerView getMakeUpStyleView() {
        return this.f48590n.m197199s();
    }

    /* JADX INFO: renamed from: h */
    public void m72214h(String str) {
        this.f48583g.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m72215i(BeautyTabItem beautyTabItem, int i) {
        if (this.f48589m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f48584h.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m72216j(BeautyTabItem beautyTabItem, int i) {
        if (this.f48589m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f48581e.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m72217k(boolean z) {
        xdl0.m208344M(this.f48586j, z);
    }

    /* JADX INFO: renamed from: l */
    public void m72218l(boolean z) {
        xdl0.m208344M(this.f48579c, z);
    }

    /* JADX INFO: renamed from: m */
    public void m72219m(boolean z) {
        xdl0.m208344M(this.f48582f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m72220n(boolean z, String str) {
        xdl0.m208344M(this.f48578b, z);
        this.f48578b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72211e(this);
        v660 v660Var = new v660(getContext());
        this.f48590n = v660Var;
        this.f48589m.setAdapter(v660Var);
        this.f48589m.m4185d(new C12723a());
        this.f48584h.setMax(100);
        m72215i(BeautyTabItem.BEAUTY, 50);
        xdl0.m208329E0(this.f48588l, new View.OnClickListener() { // from class: l.yu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200039a.m72212f(view);
            }
        });
        this.f48587k.setupWithViewPager(this.f48589m);
        for (int i = 0; i < this.f48587k.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f48587k.getTabAt(i);
            View viewInflate = View.inflate(getContext(), t6c0.f168297c, null);
            VText vText = (VText) viewInflate.findViewById(g5c0.f101089w7);
            boolean z = true;
            if (i != 1 ? i != 2 || this.f48594r.get().booleanValue() : this.f48593q.get().booleanValue()) {
                z = false;
            }
            xdl0.m208344M(viewInflate.findViewById(g5c0.f100868Z4), z);
            vText.setText(this.f48590n.getPageTitle(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewInflate);
            }
        }
    }

    public void setOnContrastListener(ContrastView.InterfaceC12725b interfaceC12725b) {
        this.f48586j.setOnContrastListener(interfaceC12725b);
    }

    public void setOnEmptyFlingListener(OnFlingFrameLayout.InterfaceC12727b interfaceC12727b) {
        this.f48577a.setOnFlingListener(interfaceC12727b);
    }

    public void setOnPageChangeAction(e30<BeautyTabItem> e30Var) {
        this.f48591o = e30Var;
    }

    public void setOnResetAction(d30 d30Var) {
        this.f48592p = d30Var;
    }

    public void setOnSecondSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f48581e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f48584h.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String strM190893j = twr.m190893j(ypv.f199493a.m199309D0());
        Boolean bool = Boolean.FALSE;
        this.f48593q = new hpd0(strM190893j, bool);
        this.f48594r = new hpd0(twr.m190889f(ypv.f199493a.m199309D0()), bool);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strM190893j = twr.m190893j(ypv.f199493a.m199309D0());
        Boolean bool = Boolean.FALSE;
        this.f48593q = new hpd0(strM190893j, bool);
        this.f48594r = new hpd0(twr.m190889f(ypv.f199493a.m199309D0()), bool);
    }
}
