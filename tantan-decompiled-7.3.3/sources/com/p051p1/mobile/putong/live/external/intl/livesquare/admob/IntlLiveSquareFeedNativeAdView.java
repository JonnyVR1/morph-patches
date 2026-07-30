package com.p051p1.mobile.putong.live.external.intl.livesquare.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.o4o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareFeedNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveSquareFeedNativeAdView f46418a;

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71147a(View view) {
        o4o.m166079a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m71148b(View view) {
        this.f46418a.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f46418a.addView(view, layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71147a(this);
    }

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
