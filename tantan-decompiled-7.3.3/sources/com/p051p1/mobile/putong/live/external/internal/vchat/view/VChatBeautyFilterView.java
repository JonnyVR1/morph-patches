package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p151v.VPagerNoPage;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;
import p153l.bf60;
import p153l.bnl0;
import p153l.jxd0;
import p153l.mbs;
import p153l.mdc0;
import p153l.nuk0;
import p153l.uyr;
import p153l.x20;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes9.dex */
public class VChatBeautyFilterView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public OnFlingFrameLayout f46317a;

    /* JADX INFO: renamed from: b */
    public VText f46318b;

    /* JADX INFO: renamed from: c */
    public VRelative f46319c;

    /* JADX INFO: renamed from: d */
    public VText f46320d;

    /* JADX INFO: renamed from: e */
    public TextSeekBar f46321e;

    /* JADX INFO: renamed from: f */
    public VRelative f46322f;

    /* JADX INFO: renamed from: g */
    public VText f46323g;

    /* JADX INFO: renamed from: h */
    public TextSeekBar f46324h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f46325i;

    /* JADX INFO: renamed from: j */
    public ContrastView f46326j;

    /* JADX INFO: renamed from: k */
    public TabLayout f46327k;

    /* JADX INFO: renamed from: l */
    public VLinear f46328l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f46329m;

    /* JADX INFO: renamed from: n */
    public bf60 f46330n;

    /* JADX INFO: renamed from: o */
    public y20<BeautyTabItem> f46331o;

    /* JADX INFO: renamed from: p */
    public x20 f46332p;

    /* JADX INFO: renamed from: q */
    public final jxd0 f46333q;

    /* JADX INFO: renamed from: r */
    public final jxd0 f46334r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView$a */
    public class C12698a implements ViewPager.InterfaceC0718j {
        public C12698a() {
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
            VChatBeautyFilterView.this.f46324h.m73425h(false);
            bnl0.m105524M(VChatBeautyFilterView.this.f46328l, z);
            if (NullChecker.m82486a(VChatBeautyFilterView.this.f46331o)) {
                VChatBeautyFilterView.this.f46331o.call(BeautyTabItem.values()[i]);
            }
            if (i == 1) {
                jxd0Var = VChatBeautyFilterView.this.f46333q;
            } else {
                jxd0Var = i == 2 ? VChatBeautyFilterView.this.f46334r : null;
            }
            if (NullChecker.m82486a(jxd0Var)) {
                bnl0.m105524M(VChatBeautyFilterView.this.f46327k.getTabAt(i).getCustomView().findViewById(mdc0.f136113Z4), false);
                jxd0Var.put(Boolean.TRUE);
            }
        }
    }

    public VChatBeautyFilterView(Context context) {
        super(context);
        String strM198709t = uyr.m198709t(mbs.m157870o0());
        Boolean bool = Boolean.FALSE;
        this.f46333q = new jxd0(strM198709t, bool);
        this.f46334r = new jxd0(uyr.m198705p(mbs.m157870o0()), bool);
    }

    /* JADX INFO: renamed from: e */
    public final void m71010e(View view) {
        nuk0.m164810a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m71011f(View view) {
        if (NullChecker.m82486a(this.f46332p)) {
            this.f46332p.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m71012g(boolean z, String str) {
        bnl0.m105524M(this.f46318b, z);
        this.f46318b.setText(str);
    }

    public VRecyclerView getBeautyView() {
        return this.f46330n.m103877q();
    }

    public int getCurrentItem() {
        return this.f46329m.getCurrentItem();
    }

    public VRecyclerView getFilterView() {
        return this.f46330n.m103878r();
    }

    public VRecyclerView getMakeUpStyleView() {
        return this.f46330n.m103879s();
    }

    /* JADX INFO: renamed from: h */
    public void m71013h(String str) {
        this.f46323g.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m71014i(BeautyTabItem beautyTabItem, int i) {
        if (this.f46329m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f46324h.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m71015j(BeautyTabItem beautyTabItem, int i) {
        if (this.f46329m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f46321e.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m71016k(boolean z) {
        bnl0.m105524M(this.f46326j, z);
    }

    /* JADX INFO: renamed from: l */
    public void m71017l(boolean z) {
        bnl0.m105524M(this.f46319c, z);
    }

    /* JADX INFO: renamed from: m */
    public void m71018m(boolean z) {
        bnl0.m105524M(this.f46322f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m71019n(boolean z, String str) {
        bnl0.m105524M(this.f46318b, z);
        this.f46318b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71010e(this);
        bf60 bf60Var = new bf60(getContext());
        this.f46330n = bf60Var;
        this.f46329m.setAdapter(bf60Var);
        this.f46329m.m4187d(new C12698a());
        this.f46324h.setMax(100);
        m71014i(BeautyTabItem.BEAUTY, 50);
        bnl0.m105509E0(this.f46328l, new View.OnClickListener() { // from class: l.muk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138823a.m71011f(view);
            }
        });
        this.f46327k.setupWithViewPager(this.f46329m);
        for (int i = 0; i < this.f46327k.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f46327k.getTabAt(i);
            View viewInflate = View.inflate(getContext(), yec0.f199029c, null);
            VText vText = (VText) viewInflate.findViewById(mdc0.f136334w7);
            boolean z = true;
            if (i != 1 ? i != 2 || this.f46334r.get().booleanValue() : this.f46333q.get().booleanValue()) {
                z = false;
            }
            bnl0.m105524M(viewInflate.findViewById(mdc0.f136113Z4), z);
            vText.setText(this.f46330n.getPageTitle(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewInflate);
            }
        }
    }

    public void setOnContrastListener(ContrastView.InterfaceC12888b interfaceC12888b) {
        this.f46326j.setOnContrastListener(interfaceC12888b);
    }

    public void setOnEmptyFlingListener(OnFlingFrameLayout.InterfaceC12890b interfaceC12890b) {
        this.f46317a.setOnFlingListener(interfaceC12890b);
    }

    public void setOnPageChangeAction(y20<BeautyTabItem> y20Var) {
        this.f46331o = y20Var;
    }

    public void setOnResetAction(x20 x20Var) {
        this.f46332p = x20Var;
    }

    public void setOnSecondSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f46321e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f46324h.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public VChatBeautyFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String strM198709t = uyr.m198709t(mbs.m157870o0());
        Boolean bool = Boolean.FALSE;
        this.f46333q = new jxd0(strM198709t, bool);
        this.f46334r = new jxd0(uyr.m198705p(mbs.m157870o0()), bool);
    }

    public VChatBeautyFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strM198709t = uyr.m198709t(mbs.m157870o0());
        Boolean bool = Boolean.FALSE;
        this.f46333q = new jxd0(strM198709t, bool);
        this.f46334r = new jxd0(uyr.m198705p(mbs.m157870o0()), bool);
    }
}
