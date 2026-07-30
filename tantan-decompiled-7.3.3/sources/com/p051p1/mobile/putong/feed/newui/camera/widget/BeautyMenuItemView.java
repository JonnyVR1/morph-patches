package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import p153l.k9c0;
import p153l.xv2;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class BeautyMenuItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextView f40374a;

    /* JADX INFO: renamed from: b */
    public View f40375b;

    public BeautyMenuItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m62594a(View view) {
        xv2.m213209a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62594a(this);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        this.f40375b.setVisibility(z ? 0 : 8);
        this.f40374a.setTextColor(z ? getResources().getColor(k9c0.f124521n) : RoundedDrawable.DEFAULT_BORDER_COLOR);
    }

    public void setText(String str) {
        this.f40374a.setText(str);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautyMenuItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
