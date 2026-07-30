package com.p046p1.mobile.putong.live.external.internal.live.square.home.submodule.skin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p149l.a2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
@SuppressLint({"ViewConstructor"})
public class ToolBarSkinView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f45021a;

    /* JADX INFO: renamed from: b */
    public View f45022b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f45023c;

    public ToolBarSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m69151a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m69151a(Context context) {
        this.f45021a = new View(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(a2c0.f67249b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, xdl0.m208331F0());
        layoutParams.gravity = 48;
        addView(this.f45021a, layoutParams);
        this.f45022b = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, dimensionPixelSize);
        layoutParams2.gravity = 80;
        addView(this.f45022b, layoutParams2);
        this.f45023c = new VDraweeView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, xdl0.f192403e);
        layoutParams3.gravity = 80;
        addView(this.f45023c, layoutParams3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f45022b.setBackgroundColor(i);
        this.f45021a.setBackgroundColor(i);
        this.f45023c.setBackgroundColor(i);
    }

    public ToolBarSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolBarSkinView(@NonNull Context context) {
        this(context, null);
    }
}
