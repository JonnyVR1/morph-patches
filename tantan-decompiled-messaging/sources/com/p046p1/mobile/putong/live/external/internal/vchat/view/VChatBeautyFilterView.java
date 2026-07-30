package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyTabItem;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.ContrastView;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.OnFlingFrameLayout;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.filter.view.TextSeekBar;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p147v.VPagerNoPage;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.g5c0;
import p149l.hlk0;
import p149l.hpd0;
import p149l.l9s;
import p149l.t6c0;
import p149l.twr;
import p149l.v660;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class VChatBeautyFilterView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public OnFlingFrameLayout f45469a;

    /* JADX INFO: renamed from: b */
    public VText f45470b;

    /* JADX INFO: renamed from: c */
    public VRelative f45471c;

    /* JADX INFO: renamed from: d */
    public VText f45472d;

    /* JADX INFO: renamed from: e */
    public TextSeekBar f45473e;

    /* JADX INFO: renamed from: f */
    public VRelative f45474f;

    /* JADX INFO: renamed from: g */
    public VText f45475g;

    /* JADX INFO: renamed from: h */
    public TextSeekBar f45476h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f45477i;

    /* JADX INFO: renamed from: j */
    public ContrastView f45478j;

    /* JADX INFO: renamed from: k */
    public TabLayout f45479k;

    /* JADX INFO: renamed from: l */
    public VLinear f45480l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f45481m;

    /* JADX INFO: renamed from: n */
    public v660 f45482n;

    /* JADX INFO: renamed from: o */
    public e30<BeautyTabItem> f45483o;

    /* JADX INFO: renamed from: p */
    public d30 f45484p;

    /* JADX INFO: renamed from: q */
    public final hpd0 f45485q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f45486r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.view.VChatBeautyFilterView$a */
    public class C12535a implements ViewPager.InterfaceC0716j {
        public C12535a() {
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
            VChatBeautyFilterView.this.f45476h.m72242h(false);
            xdl0.m208344M(VChatBeautyFilterView.this.f45480l, z);
            if (NullChecker.m81303a(VChatBeautyFilterView.this.f45483o)) {
                VChatBeautyFilterView.this.f45483o.call(BeautyTabItem.values()[i]);
            }
            if (i == 1) {
                hpd0Var = VChatBeautyFilterView.this.f45485q;
            } else {
                hpd0Var = i == 2 ? VChatBeautyFilterView.this.f45486r : null;
            }
            if (NullChecker.m81303a(hpd0Var)) {
                xdl0.m208344M(VChatBeautyFilterView.this.f45479k.getTabAt(i).getCustomView().findViewById(g5c0.f100868Z4), false);
                hpd0Var.put(Boolean.TRUE);
            }
        }
    }

    public VChatBeautyFilterView(Context context) {
        super(context);
        String strM190903t = twr.m190903t(l9s.m149093o0());
        Boolean bool = Boolean.FALSE;
        this.f45485q = new hpd0(strM190903t, bool);
        this.f45486r = new hpd0(twr.m190899p(l9s.m149093o0()), bool);
    }

    /* JADX INFO: renamed from: e */
    public final void m69827e(View view) {
        hlk0.m131676a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m69828f(View view) {
        if (NullChecker.m81303a(this.f45484p)) {
            this.f45484p.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m69829g(boolean z, String str) {
        xdl0.m208344M(this.f45470b, z);
        this.f45470b.setText(str);
    }

    public VRecyclerView getBeautyView() {
        return this.f45482n.m197197q();
    }

    public int getCurrentItem() {
        return this.f45481m.getCurrentItem();
    }

    public VRecyclerView getFilterView() {
        return this.f45482n.m197198r();
    }

    public VRecyclerView getMakeUpStyleView() {
        return this.f45482n.m197199s();
    }

    /* JADX INFO: renamed from: h */
    public void m69830h(String str) {
        this.f45475g.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m69831i(BeautyTabItem beautyTabItem, int i) {
        if (this.f45481m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f45476h.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m69832j(BeautyTabItem beautyTabItem, int i) {
        if (this.f45481m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f45473e.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m69833k(boolean z) {
        xdl0.m208344M(this.f45478j, z);
    }

    /* JADX INFO: renamed from: l */
    public void m69834l(boolean z) {
        xdl0.m208344M(this.f45471c, z);
    }

    /* JADX INFO: renamed from: m */
    public void m69835m(boolean z) {
        xdl0.m208344M(this.f45474f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m69836n(boolean z, String str) {
        xdl0.m208344M(this.f45470b, z);
        this.f45470b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69827e(this);
        v660 v660Var = new v660(getContext());
        this.f45482n = v660Var;
        this.f45481m.setAdapter(v660Var);
        this.f45481m.m4185d(new C12535a());
        this.f45476h.setMax(100);
        m69831i(BeautyTabItem.BEAUTY, 50);
        xdl0.m208329E0(this.f45480l, new View.OnClickListener() { // from class: l.glk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103335a.m69828f(view);
            }
        });
        this.f45479k.setupWithViewPager(this.f45481m);
        for (int i = 0; i < this.f45479k.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f45479k.getTabAt(i);
            View viewInflate = View.inflate(getContext(), t6c0.f168297c, null);
            VText vText = (VText) viewInflate.findViewById(g5c0.f101089w7);
            boolean z = true;
            if (i != 1 ? i != 2 || this.f45486r.get().booleanValue() : this.f45485q.get().booleanValue()) {
                z = false;
            }
            xdl0.m208344M(viewInflate.findViewById(g5c0.f100868Z4), z);
            vText.setText(this.f45482n.getPageTitle(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewInflate);
            }
        }
    }

    public void setOnContrastListener(ContrastView.InterfaceC12725b interfaceC12725b) {
        this.f45478j.setOnContrastListener(interfaceC12725b);
    }

    public void setOnEmptyFlingListener(OnFlingFrameLayout.InterfaceC12727b interfaceC12727b) {
        this.f45469a.setOnFlingListener(interfaceC12727b);
    }

    public void setOnPageChangeAction(e30<BeautyTabItem> e30Var) {
        this.f45483o = e30Var;
    }

    public void setOnResetAction(d30 d30Var) {
        this.f45484p = d30Var;
    }

    public void setOnSecondSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f45473e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f45476h.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public VChatBeautyFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String strM190903t = twr.m190903t(l9s.m149093o0());
        Boolean bool = Boolean.FALSE;
        this.f45485q = new hpd0(strM190903t, bool);
        this.f45486r = new hpd0(twr.m190899p(l9s.m149093o0()), bool);
    }

    public VChatBeautyFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strM190903t = twr.m190903t(l9s.m149093o0());
        Boolean bool = Boolean.FALSE;
        this.f45485q = new hpd0(strM190903t, bool);
        this.f45486r = new hpd0(twr.m190899p(l9s.m149093o0()), bool);
    }
}
