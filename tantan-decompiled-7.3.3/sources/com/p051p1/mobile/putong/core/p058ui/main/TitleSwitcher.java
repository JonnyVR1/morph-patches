package com.p051p1.mobile.putong.core.p058ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.p058ui.main.TitleSwitcher;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.adc0;
import p153l.agc0;
import p153l.dbc0;
import p153l.ij40;
import p153l.jj40;
import p153l.kec0;
import p153l.msi0;
import p153l.p9r;
import p153l.r5j0;
import p153l.y0j0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TitleSwitcher extends FrameLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public TabLayout f31208a;

    /* JADX INFO: renamed from: b */
    public y20<Integer> f31209b;

    /* JADX INFO: renamed from: c */
    public Context f31210c;

    /* JADX INFO: renamed from: d */
    public final List<NewTanFragTag> f31211d;

    /* JADX INFO: renamed from: e */
    public NewTanFragTag f31212e;

    public TitleSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31209b = new y20() { // from class: l.x0j0
            @Override // p153l.y20
            public final void call(Object obj) {
                TitleSwitcher.m48545a((Integer) obj);
            }
        };
        this.f31211d = new ArrayList();
        m48550g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48545a(Integer num) {
    }

    /* JADX INFO: renamed from: b */
    public View m48546b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return y0j0.m213879b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m48547c(ij40 ij40Var, int i) {
        View viewInflate;
        NewTanFragTag newTanFragTag = ij40Var.f115172a;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.TOP_PICKS;
        Context context = this.f31210c;
        if (newTanFragTag == newTanFragTag2) {
            viewInflate = p9r.m171370a(context).inflate(kec0.f125809e4, (ViewGroup) null);
            r5j0.INSTANCE.m179873j((VDraweeView) viewInflate.findViewById(adc0.f70259b));
        } else {
            viewInflate = p9r.m171370a(context).inflate(kec0.f125843g4, (ViewGroup) null);
            VText vText = (VText) viewInflate.findViewById(adc0.f69886Ed);
            ImageView imageView = (ImageView) viewInflate.findViewById(adc0.f69903Fd);
            if (ij40Var.f115172a == NewTanFragTag.HOME) {
                vText.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageResource(dbc0.f87080i8);
            } else {
                vText.setText(ij40Var.f115173b);
            }
        }
        viewInflate.setTag(ij40Var.f115172a);
        TabLayout tabLayout = this.f31208a;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, false);
        mo48525i(ij40Var.f115172a);
    }

    /* JADX INFO: renamed from: d */
    public NewTanFragTag m48548d(int i) {
        return this.f31211d.get(i);
    }

    /* JADX INFO: renamed from: e */
    public void m48549e() {
        List<ij40> listM145001d = jj40.m145001d();
        int i = 0;
        if (listM145001d.size() > 1) {
            this.f31208a.setTabMode(0);
        }
        this.f31208a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f31211d.clear();
        int i2 = 0;
        while (i < listM145001d.size()) {
            this.f31211d.add(listM145001d.get(i).f115172a);
            m48547c(listM145001d.get(i), i2);
            i++;
            i2++;
        }
        mo48523f();
    }

    /* JADX INFO: renamed from: f */
    public void mo48523f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m48550g(Context context) {
        this.f31210c = context;
        addView(m48546b(p9r.m171370a(context), this));
        this.f31208a.setSelectedTabIndicatorHeight(0);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: h */
    public void mo48524h(NewTanFragTag newTanFragTag) {
        if (this.f31211d.contains(newTanFragTag)) {
            return;
        }
        this.f31211d.clear();
        this.f31208a.removeAllTabs();
        m48549e();
    }

    /* JADX INFO: renamed from: i */
    public void mo48525i(NewTanFragTag newTanFragTag) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        this.f31209b.call(Integer.valueOf(tab.getPosition()));
        View customView = tab.getCustomView();
        if (customView != null) {
            this.f31212e = (NewTanFragTag) customView.getTag();
            msi0.m159817o((TextView) customView.findViewById(adc0.f69886Ed), agc0.f71108B);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (NullChecker.m82486a(customView)) {
            msi0.m159817o((TextView) customView.findViewById(adc0.f69886Ed), agc0.f71109C);
        }
    }

    public void setOnTabClickListener(y20<Integer> y20Var) {
        this.f31209b = y20Var;
    }

    public void setTabSelected(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f31208a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f31208a.getTabAt(i);
            if (newTanFragTag.equals(tabAt.getCustomView().getTag())) {
                tabAt.select();
            }
        }
    }

    public TitleSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TitleSwitcher(Context context) {
        this(context, null);
    }
}
