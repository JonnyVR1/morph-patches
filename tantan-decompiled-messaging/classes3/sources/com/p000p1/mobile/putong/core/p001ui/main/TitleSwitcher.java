package com.p000p1.mobile.putong.core.p001ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.main.TitleSwitcher;
import com.p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f6c0;
import l.mji0;
import l.nwi0;
import l.o7r;
import l.u4c0;
import l.ua40;
import l.v7c0;
import l.va40;
import l.vri0;
import l.x2c0;
import p003l.e30;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class TitleSwitcher extends FrameLayout implements TabLayout.OnTabSelectedListener {

    /* JADX INFO: renamed from: a */
    public TabLayout f251a;

    /* JADX INFO: renamed from: b */
    public e30<Integer> f252b;

    /* JADX INFO: renamed from: c */
    public Context f253c;

    /* JADX INFO: renamed from: d */
    public final List<NewTanFragTag> f254d;

    /* JADX INFO: renamed from: e */
    public NewTanFragTag f255e;

    public TitleSwitcher(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f252b = new e30() { // from class: l.uri0
            @Override // p003l.e30
            public final void call(Object obj) {
                TitleSwitcher.m395a((Integer) obj);
            }
        };
        this.f254d = new ArrayList();
        m400g(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m395a(Integer num) {
    }

    /* JADX INFO: renamed from: b */
    public View m396b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vri0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c */
    public final void m397c(ua40 ua40Var, int i) {
        View viewInflate;
        NewTanFragTag newTanFragTag = ua40Var.a;
        NewTanFragTag newTanFragTag2 = NewTanFragTag.TOP_PICKS;
        Context context = this.f253c;
        if (newTanFragTag == newTanFragTag2) {
            viewInflate = o7r.a(context).inflate(f6c0.e4, (ViewGroup) null);
            nwi0.INSTANCE.j((VDraweeView) viewInflate.findViewById(u4c0.b));
        } else {
            viewInflate = o7r.a(context).inflate(f6c0.g4, (ViewGroup) null);
            AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(u4c0.Cd);
            ImageView imageView = (ImageView) viewInflate.findViewById(u4c0.Dd);
            if (ua40Var.a == NewTanFragTag.HOME) {
                appCompatTextView.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setImageResource(x2c0.h8);
            } else {
                appCompatTextView.setText(ua40Var.b);
            }
        }
        viewInflate.setTag(ua40Var.a);
        TabLayout tabLayout = this.f251a;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewInflate), i, false);
        mo375i(ua40Var.a);
    }

    /* JADX INFO: renamed from: d */
    public NewTanFragTag m398d(int i) {
        return this.f254d.get(i);
    }

    /* JADX INFO: renamed from: e */
    public void m399e() {
        List listD = va40.d();
        int i = 0;
        if (listD.size() > 1) {
            this.f251a.setTabMode(0);
        }
        this.f251a.addOnTabSelectedListener(this);
        this.f254d.clear();
        int i2 = 0;
        while (i < listD.size()) {
            this.f254d.add(((ua40) listD.get(i)).a);
            m397c((ua40) listD.get(i), i2);
            i++;
            i2++;
        }
        mo373f();
    }

    /* JADX INFO: renamed from: f */
    public void mo373f() {
    }

    /* JADX INFO: renamed from: g */
    public final void m400g(Context context) {
        this.f253c = context;
        addView(m396b(o7r.a(context), this));
        this.f251a.setSelectedTabIndicatorHeight(0);
        setClipChildren(false);
    }

    /* JADX INFO: renamed from: h */
    public void mo374h(NewTanFragTag newTanFragTag) {
        if (this.f254d.contains(newTanFragTag)) {
            return;
        }
        this.f254d.clear();
        this.f251a.removeAllTabs();
        m399e();
    }

    /* JADX INFO: renamed from: i */
    public void mo375i(NewTanFragTag newTanFragTag) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public void onTabReselected(TabLayout.Tab tab) {
    }

    public void onTabSelected(TabLayout.Tab tab) {
        this.f252b.call(Integer.valueOf(tab.getPosition()));
        View customView = tab.getCustomView();
        if (customView != null) {
            this.f255e = (NewTanFragTag) customView.getTag();
            mji0.o((TextView) customView.findViewById(u4c0.Cd), v7c0.B);
        }
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        View customView = tab.getCustomView();
        if (NullChecker.a(customView)) {
            mji0.o((TextView) customView.findViewById(u4c0.Cd), v7c0.C);
        }
    }

    public void setOnTabClickListener(e30<Integer> e30Var) {
        this.f252b = e30Var;
    }

    public void setTabSelected(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < this.f251a.getTabCount(); i++) {
            TabLayout.Tab tabAt = this.f251a.getTabAt(i);
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
