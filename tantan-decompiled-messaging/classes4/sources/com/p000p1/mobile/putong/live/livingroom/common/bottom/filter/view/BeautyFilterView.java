package com.p000p1.mobile.putong.live.livingroom.common.bottom.filter.view;

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
import l.d30;
import l.e30;
import l.hpd0;
import l.twr;
import l.xdl0;
import l.ypv;
import p002l.g5c0;
import p002l.t6c0;
import p002l.v660;
import p002l.zu2;
import v.VLinear;
import v.VPagerNoPage;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class BeautyFilterView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public OnFlingFrameLayout f4619a;

    /* JADX INFO: renamed from: b */
    public VText f4620b;

    /* JADX INFO: renamed from: c */
    public RelativeLayout f4621c;

    /* JADX INFO: renamed from: d */
    public VText f4622d;

    /* JADX INFO: renamed from: e */
    public TextSeekBar f4623e;

    /* JADX INFO: renamed from: f */
    public RelativeLayout f4624f;

    /* JADX INFO: renamed from: g */
    public VText f4625g;

    /* JADX INFO: renamed from: h */
    public TextSeekBar f4626h;

    /* JADX INFO: renamed from: i */
    public FrameLayout f4627i;

    /* JADX INFO: renamed from: j */
    public ContrastView f4628j;

    /* JADX INFO: renamed from: k */
    public TabLayout f4629k;

    /* JADX INFO: renamed from: l */
    public VLinear f4630l;

    /* JADX INFO: renamed from: m */
    public VPagerNoPage f4631m;

    /* JADX INFO: renamed from: n */
    public v660 f4632n;

    /* JADX INFO: renamed from: o */
    public e30<BeautyTabItem> f4633o;

    /* JADX INFO: renamed from: p */
    public d30 f4634p;

    /* JADX INFO: renamed from: q */
    public final hpd0 f4635q;

    /* JADX INFO: renamed from: r */
    public final hpd0 f4636r;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.bottom.filter.view.BeautyFilterView$a */
    public class C0312a implements ViewPager.j {
        public C0312a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            hpd0 hpd0Var;
            boolean z = i == 0;
            BeautyFilterView.this.f4626h.m5715h(false);
            xdl0.M(BeautyFilterView.this.f4630l, z);
            if (NullChecker.a(BeautyFilterView.this.f4633o)) {
                BeautyFilterView.this.f4633o.call(BeautyTabItem.values()[i]);
            }
            if (i == 1) {
                hpd0Var = BeautyFilterView.this.f4635q;
            } else {
                hpd0Var = i == 2 ? BeautyFilterView.this.f4636r : null;
            }
            if (NullChecker.a(hpd0Var)) {
                xdl0.M(BeautyFilterView.this.f4629k.getTabAt(i).getCustomView().findViewById(g5c0.f11018Z4), false);
                hpd0Var.put(Boolean.TRUE);
            }
        }
    }

    public BeautyFilterView(Context context) {
        super(context);
        String strJ = twr.j(ypv.a.D0());
        Boolean bool = Boolean.FALSE;
        this.f4635q = new hpd0(strJ, bool);
        this.f4636r = new hpd0(twr.f(ypv.a.D0()), bool);
    }

    /* JADX INFO: renamed from: e */
    public final void m5684e(View view) {
        zu2.m27529a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m5685f(View view) {
        if (NullChecker.a(this.f4634p)) {
            this.f4634p.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m5686g(boolean z, String str) {
        xdl0.M(this.f4620b, z);
        this.f4620b.setText(str);
    }

    public VRecyclerView getBeautyView() {
        return this.f4632n.m23787q();
    }

    public int getCurrentItem() {
        return this.f4631m.getCurrentItem();
    }

    public VRecyclerView getFilterView() {
        return this.f4632n.m23788r();
    }

    public VRecyclerView getMakeUpStyleView() {
        return this.f4632n.m23789s();
    }

    /* JADX INFO: renamed from: h */
    public void m5687h(String str) {
        this.f4625g.setText(str);
    }

    /* JADX INFO: renamed from: i */
    public void m5688i(BeautyTabItem beautyTabItem, int i) {
        if (this.f4631m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f4626h.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m5689j(BeautyTabItem beautyTabItem, int i) {
        if (this.f4631m.getCurrentItem() == beautyTabItem.getIndex()) {
            this.f4623e.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m5690k(boolean z) {
        xdl0.M(this.f4628j, z);
    }

    /* JADX INFO: renamed from: l */
    public void m5691l(boolean z) {
        xdl0.M(this.f4621c, z);
    }

    /* JADX INFO: renamed from: m */
    public void m5692m(boolean z) {
        xdl0.M(this.f4624f, z);
    }

    /* JADX INFO: renamed from: n */
    public void m5693n(boolean z, String str) {
        xdl0.M(this.f4620b, z);
        this.f4620b.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m5684e(this);
        v660 v660Var = new v660(getContext());
        this.f4632n = v660Var;
        this.f4631m.setAdapter(v660Var);
        this.f4631m.d(new C0312a());
        this.f4626h.setMax(100);
        m5688i(BeautyTabItem.BEAUTY, 50);
        xdl0.E0(this.f4630l, new View.OnClickListener() { // from class: l.yu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23101a.m5685f(view);
            }
        });
        this.f4629k.setupWithViewPager(this.f4631m);
        for (int i = 0; i < this.f4629k.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f4629k.getTabAt(i);
            View viewInflate = View.inflate(getContext(), t6c0.f19793c, null);
            VText vTextFindViewById = viewInflate.findViewById(g5c0.f11239w7);
            boolean z = true;
            if (i != 1 ? i != 2 || ((Boolean) this.f4636r.get()).booleanValue() : ((Boolean) this.f4635q.get()).booleanValue()) {
                z = false;
            }
            xdl0.M(viewInflate.findViewById(g5c0.f11018Z4), z);
            vTextFindViewById.setText(this.f4632n.getPageTitle(i));
            if (tabAt != null) {
                tabAt.setCustomView(viewInflate);
            }
        }
    }

    public void setOnContrastListener(ContrastView.InterfaceC0314b interfaceC0314b) {
        this.f4628j.setOnContrastListener(interfaceC0314b);
    }

    public void setOnEmptyFlingListener(OnFlingFrameLayout.InterfaceC0316b interfaceC0316b) {
        this.f4619a.setOnFlingListener(interfaceC0316b);
    }

    public void setOnPageChangeAction(e30<BeautyTabItem> e30Var) {
        this.f4633o = e30Var;
    }

    public void setOnResetAction(d30 d30Var) {
        this.f4634p = d30Var;
    }

    public void setOnSecondSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f4623e.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f4626h.setOnSeekBarChangeListener(onSeekBarChangeListener);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String strJ = twr.j(ypv.a.D0());
        Boolean bool = Boolean.FALSE;
        this.f4635q = new hpd0(strJ, bool);
        this.f4636r = new hpd0(twr.f(ypv.a.D0()), bool);
    }

    public BeautyFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String strJ = twr.j(ypv.a.D0());
        Boolean bool = Boolean.FALSE;
        this.f4635q = new hpd0(strJ, bool);
        this.f4636r = new hpd0(twr.f(ypv.a.D0()), bool);
    }
}
