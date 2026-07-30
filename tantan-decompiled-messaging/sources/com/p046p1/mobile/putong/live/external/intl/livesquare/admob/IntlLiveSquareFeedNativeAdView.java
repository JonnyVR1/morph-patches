package com.p046p1.mobile.putong.live.external.intl.livesquare.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.o2o;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareFeedNativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveSquareFeedNativeAdView f45570a;

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m69964a(View view) {
        o2o.m162317a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m69965b(View view) {
        this.f45570a.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.f45570a.addView(view, layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69964a(this);
    }

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareFeedNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
