package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p007l.e1c0;
import p007l.hv2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class BeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f987a;

    /* JADX INFO: renamed from: b */
    public View f988b;

    public BeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m2360a(View view) {
        hv2.m10731a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2360a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f988b.setVisibility(z ? 0 : 8);
        this.f987a.setTextColor(z ? getResources().getColor(e1c0.f7154n) : -16777216);
    }

    public void setText(String str) {
        this.f987a.setText(str);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
