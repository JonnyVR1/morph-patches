package com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.skin;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.hac0;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"ViewConstructor"})
public class ToolBarSkinView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public View f45869a;

    /* JADX INFO: renamed from: b */
    public View f45870b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f45871c;

    public ToolBarSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m70334a(context);
    }

    /* JADX INFO: renamed from: a */
    public void m70334a(Context context) {
        this.f45869a = new View(context);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hac0.f108490b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, bnl0.m105511F0());
        layoutParams.gravity = 48;
        addView(this.f45869a, layoutParams);
        this.f45870b = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, dimensionPixelSize);
        layoutParams2.gravity = 80;
        addView(this.f45870b, layoutParams2);
        this.f45871c = new VDraweeView(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, bnl0.f77544e);
        layoutParams3.gravity = 80;
        addView(this.f45871c, layoutParams3);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f45870b.setBackgroundColor(i);
        this.f45869a.setBackgroundColor(i);
        this.f45871c.setBackgroundColor(i);
    }

    public ToolBarSkinView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ToolBarSkinView(@NonNull Context context) {
        this(context, null);
    }
}
