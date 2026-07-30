package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p051p1.mobile.putong.live.base.data.BLiveMenuItem;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.d6m;
import p153l.gt0;
import p153l.izs;
import p153l.qa00;
import p153l.u6o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareMenuItemView extends RelativeLayout implements d6m {

    /* JADX INFO: renamed from: d */
    public static final int f46672d = qa00.f156319f;

    /* JADX INFO: renamed from: e */
    public static final int f46673e = qa00.f156321h;

    /* JADX INFO: renamed from: a */
    public VImage f46674a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f46675b;

    /* JADX INFO: renamed from: c */
    public VText f46676c;

    public IntlLiveSquareMenuItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71533a(View view) {
        u6o.m194720a(this, view);
    }

    @Override // p153l.d6m
    /* JADX INFO: renamed from: b */
    public void mo71534b(RecyclerView.AbstractC0569e0 abstractC0569e0, StaggeredGridLayoutManager.C0595c c0595c) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iM105592y0 = ((bnl0.m105592y0() - (f46672d * 3)) - (f46673e * 2)) / 4;
        layoutParams.width = iM105592y0;
        layoutParams.height = iM105592y0;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m71535c(BLiveMenuItem bLiveMenuItem, int i) {
        this.f46676c.setText(bLiveMenuItem.name);
        izs.m142868s("context_square", this.f46675b, bLiveMenuItem.iconUrl);
        gt0.m132170p(this, "alpha", ((long) i) * 45, 50L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71533a(this);
    }

    public IntlLiveSquareMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
