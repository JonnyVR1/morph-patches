package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p149l.e1c0;
import p149l.hv2;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class BeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f39526a;

    /* JADX INFO: renamed from: b */
    public View f39527b;

    public BeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m61410a(View view) {
        hv2.m133146a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61410a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f39527b.setVisibility(z ? 0 : 8);
        this.f39526a.setTextColor(z ? getResources().getColor(e1c0.f88798n) : RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    public void setText(String str) {
        this.f39526a.setText(str);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
