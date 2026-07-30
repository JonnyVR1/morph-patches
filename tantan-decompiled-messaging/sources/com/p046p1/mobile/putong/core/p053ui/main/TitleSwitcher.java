package com.p046p1.mobile.putong.core.p053ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.p053ui.main.TitleSwitcher;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.f6c0;
import p149l.mji0;
import p149l.nwi0;
import p149l.o7r;
import p149l.u4c0;
import p149l.ua40;
import p149l.v7c0;
import p149l.va40;
import p149l.vri0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TitleSwitcher extends FrameLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public TabLayout f30360a;

    /* JADX INFO: renamed from: b */
    public e30<Integer> f30361b;

    /* JADX INFO: renamed from: c */
    public Context f30362c;

    /* JADX INFO: renamed from: d */
    public final List<NewTanFragTag> f30363d;

    /* JADX INFO: renamed from: e */
    public NewTanFragTag f30364e;

    public TitleSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30361b = new e30() { // from class: l.uri0
            @Override // p149l.e30
            public final void call(Object obj) {
                TitleSwitcher.m47362a((Integer) obj);
            }
        };
        this.f30363d = new ArrayList();
        m47367g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m47362a(Integer num) {
    }

    /* JADX INFO: renamed from: b */
    public View m47363b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vri0.m199670b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m47364c(ua40 ua40Var, int i) {
        View viewInflate;
        NewTanFragTag newTanFragTag = ua40Var.f175550a;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.TOP_PICKS;
        Context context = this.f30362c;
        if (newTanFragTag == newTanFragTag2) {
            viewInflate = o7r.m163037a(context).inflate(f6c0.f95755e4, (ViewGroup) null);
            nwi0.INSTANCE.m161877j((VDraweeView) viewInflate.findViewById(u4c0.f174168b));
        } else {
            viewInflate = o7r.m163037a(context).inflate(f6c0.f95789g4, (ViewGroup) null);
            VText vText = (VText) viewInflate.findViewById(u4c0.f173764Cd);
            ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.f173781Dd);
            if (ua40Var.f175550a == NewTanFragTag.HOME) {
                vText.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageResource(x2c0.f190197h8);
            } else {
                vText.setText(ua40Var.f175551b);
            }
        }
        viewInflate.setTag(ua40Var.f175550a);
        TabLayout tabLayout = this.f30360a;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, false);
        mo47342i(ua40Var.f175550a);
    }

    /* JADX INFO: renamed from: d */
    public NewTanFragTag m47365d(int i) {
        return this.f30363d.get(i);
    }

    /* JADX INFO: renamed from: e */
    public void m47366e() {
        List<ua40> listM197622d = va40.m197622d();
        int i = 0;
        if (listM197622d.size() > 1) {
            this.f30360a.setTabMode(0);
        }
        this.f30360a.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) this);
        this.f30363d.clear();
        int i2 = 0;
        while (i < listM197622d.size()) {
            this.f30363d.add(listM197622d.get(i).f175550a);
            m47364c(listM197622d.get(i), i2);
            i++;
            i2++;
        }
        mo47340f();
    }

    /* JADX INFO: renamed from: f */
    public void mo47340f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m47367g(Context context) {
        this.f30362c = context;
        addView(m47363b(o7r.m163037a(context), this));
        this.f30360a.setSelectedTabIndicatorHeight(0);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: h */
    public void mo47341h(NewTanFragTag newTanFragTag) {
        if (this.f30363d.contains(newTanFragTag)) {
            return;
        }
        this.f30363d.clear();
        this.f30360a.removeAllTabs();
        m47366e();
    }

    /* JADX INFO: renamed from: i */
    public void mo47342i(NewTanFragTag newTanFragTag) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        this.f30361b.call(Integer.valueOf(tab.getPosition()));
        View customView = tab.getCustomView();
        if (customView != null) {
            this.f30364e = (NewTanFragTag) customView.getTag();
            mji0.m154821o((TextView) customView.findViewById(u4c0.f173764Cd), v7c0.f180347B);
        }
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (NullChecker.m81303a(customView)) {
            mji0.m154821o((TextView) customView.findViewById(u4c0.f173764Cd), v7c0.f180348C);
        }
    }

    public void setOnTabClickListener(e30<Integer> e30Var) {
        this.f30361b = e30Var;
    }

    public void setTabSelected(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f30360a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f30360a.getTabAt(i);
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
