package com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view;

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
import p151v.VLinear;
import p151v.VPagerNoPage;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bf60;
import p153l.bnl0;
import p153l.jxd0;
import p153l.mdc0;
import p153l.pv2;
import p153l.uyr;
import p153l.x20;
import p153l.y20;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes4.dex */
public class BeautyFilterView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public OnFlingFrameLayout f49425a;

    /* JADX INFO: renamed from: b */
    public VText f49426b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f49427c;

    /* JADX INFO: renamed from: d */
    public VText f49428d;

    /* JADX INFO: renamed from: e */
    public TextSeekBar f49429e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f49430f;

    /* JADX INFO: renamed from: g */
    public VText f49431g;

    /* JADX INFO: renamed from: h */
    public TextSeekBar f49432h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f49433i;

    /* JADX INFO: renamed from: j */
    public ContrastView f49434j;

    /* JADX INFO: renamed from: k */
    public TabLayout f49435k;

    /* JADX INFO: renamed from: l */
    public VLinear f49436l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f49437m;

    /* JADX INFO: renamed from: n */
    public bf60 f49438n;

    /* JADX INFO: renamed from: o */
    public y20<BeautyTabItem> f49439o;

    /* JADX INFO: renamed from: p */
    public x20 f49440p;

    /* JADX INFO: renamed from: q */
    public final jxd0 f49441q;

    /* JADX INFO: renamed from: r */
    public final jxd0 f49442r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView$a */
    public class C12886a implements ViewPager.InterfaceC0718j {
        public C12886a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            jxd0 jxd0Var;
            boolean z = i == 0;
            BeautyFilterView.this.f49432h.m73425h(false);
            bnl0.m105524M(BeautyFilterView.this.f49436l, z);
            if (NullChecker.m82486a(BeautyFilterView.this.f49439o)) {
                BeautyFilterView.this.f49439o.call(BeautyTabItem.values()[i]);
            }
            if (i == 1) {
                jxd0Var = BeautyFilterView.this.f49441q;
            } else {
                jxd0Var = i == 2 ? BeautyFilterView.this.f49442r : null;
            }
            if (NullChecker.m82486a(jxd0Var)) {
                bnl0.m105524M(BeautyFilterView.this.f49435k.getTabAt(i).getCustomView().findViewById(mdc0.f136113Z4), false);
                jxd0Var.put(Boolean.TRUE);
            }
        }
    }

    public BeautyFilterView(Context context) {
        super(context);
        String strM198699j = uyr.m198699j(zrv.f205799a.m207631D0());
        Boolean bool = Boolean.FALSE;
        this.f49441q = new jxd0(strM198699j, bool);
        this.f49442r = new jxd0(uyr.m198695f(zrv.f205799a.m207631D0()), bool);
    }

    /* JADX INFO: renamed from: e */
    public final void m73394e(View view) {
        pv2.m173918a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73395f(View view) {
        if (NullChecker.m82486a(this.f49440p)) {
            this.f49440p.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m73396g(boolean z, String str) {
        bnl0.m105524M(this.f49426b, z);
        this.f49426b.setText(str);
    }

    public VRecyclerView getBeautyView() {
        return this.f49438n.m103877q();
    }

    public int getCurrentItem() {
        return this.f49437m.getCurrentItem();
    }

    public VRecyclerView getFilterView() {
        return this.f49438n.m103878r();
    }

    public VRecyclerView getMakeUpStyleView() {
        return this.f49438n.m103879s();
    }

    /* JADX INFO: renamed from: h */
    public void m73397h(String str) {
        this.f49431g.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m73398i(BeautyTabItem beautyTabItem, int i) {
        if (this.f49437m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f49432h.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m73399j(BeautyTabItem beautyTabItem, int i) {
        if (this.f49437m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f49429e.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m73400k(boolean z) {
        bnl0.m105524M(this.f49434j, z);
    }

    /* JADX INFO: renamed from: l */
    public void m73401l(boolean z) {
        bnl0.m105524M(this.f49427c, z);
    }

    /* JADX INFO: renamed from: m */
    public void m73402m(boolean z) {
        bnl0.m105524M(this.f49430f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m73403n(boolean z, String str) {
        bnl0.m105524M(this.f49426b, z);
        this.f49426b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73394e(this);
        bf60 bf60Var = new bf60(getContext());
        this.f49438n = bf60Var;
        this.f49437m.setAdapter(bf60Var);
        this.f49437m.m4187d(new C12886a());
        this.f49432h.setMax(100);
        m73398i(BeautyTabItem.BEAUTY, 50);
        bnl0.m105509E0(this.f49436l, new View.OnClickListener() { // from class: l.ov2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149228a.m73395f(view);
            }
        });
        this.f49435k.setupWithViewPager(this.f49437m);
        for (int i = 0; i < this.f49435k.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f49435k.getTabAt(i);
            View viewInflate = View.inflate(getContext(), yec0.f199029c, null);
            VText vText = (VText) viewInflate.findViewById(mdc0.f136334w7);
            boolean z = true;
            if (i != 1 ? i != 2 || this.f49442r.get().booleanValue() : this.f49441q.get().booleanValue()) {
                z = false;
            }
            bnl0.m105524M(viewInflate.findViewById(mdc0.f136113Z4), z);
            vText.setText(this.f49438n.getPageTitle(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewInflate);
            }
        }
    }

    public void setOnContrastListener(ContrastView.InterfaceC12888b interfaceC12888b) {
        this.f49434j.setOnContrastListener(interfaceC12888b);
    }

    public void setOnEmptyFlingListener(OnFlingFrameLayout.InterfaceC12890b interfaceC12890b) {
        this.f49425a.setOnFlingListener(interfaceC12890b);
    }

    public void setOnPageChangeAction(y20<BeautyTabItem> y20Var) {
        this.f49439o = y20Var;
    }

    public void setOnResetAction(x20 x20Var) {
        this.f49440p = x20Var;
    }

    public void setOnSecondSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f49429e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f49432h.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String strM198699j = uyr.m198699j(zrv.f205799a.m207631D0());
        Boolean bool = Boolean.FALSE;
        this.f49441q = new jxd0(strM198699j, bool);
        this.f49442r = new jxd0(uyr.m198695f(zrv.f205799a.m207631D0()), bool);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strM198699j = uyr.m198699j(zrv.f205799a.m207631D0());
        Boolean bool = Boolean.FALSE;
        this.f49441q = new jxd0(strM198699j, bool);
        this.f49442r = new jxd0(uyr.m198695f(zrv.f205799a.m207631D0()), bool);
    }
}
