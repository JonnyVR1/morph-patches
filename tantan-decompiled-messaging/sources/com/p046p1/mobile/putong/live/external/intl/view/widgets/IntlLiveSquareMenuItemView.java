package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.p046p1.mobile.putong.live.base.data.BLiveMenuItem;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.bt0;
import p149l.hxs;
import p149l.m3m;
import p149l.t100;
import p149l.u4o;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareMenuItemView extends RelativeLayout implements m3m {

    /* JADX INFO: renamed from: d */
    public static final int f45824d = t100.f167257f;

    /* JADX INFO: renamed from: e */
    public static final int f45825e = t100.f167259h;

    /* JADX INFO: renamed from: a */
    public VImage f45826a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f45827b;

    /* JADX INFO: renamed from: c */
    public VText f45828c;

    public IntlLiveSquareMenuItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70350a(View view) {
        u4o.m191759a(this, view);
    }

    @Override // p149l.m3m
    /* JADX INFO: renamed from: b */
    public void mo70351b(RecyclerView.AbstractC0566d0 abstractC0566d0, StaggeredGridLayoutManager.C0593c c0593c) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        int iM208412y0 = ((xdl0.m208412y0() - (f45824d * 3)) - (f45825e * 2)) / 4;
        layoutParams.width = iM208412y0;
        layoutParams.height = iM208412y0;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m70352c(BLiveMenuItem bLiveMenuItem, int i) {
        this.f45828c.setText(bLiveMenuItem.name);
        hxs.m133406s("context_square", this.f45827b, bLiveMenuItem.iconUrl);
        bt0.m103743p(this, "alpha", ((long) i) * 45, 50L, new DecelerateInterpolator(), 0.0f, 1.0f).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70350a(this);
    }

    public IntlLiveSquareMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
