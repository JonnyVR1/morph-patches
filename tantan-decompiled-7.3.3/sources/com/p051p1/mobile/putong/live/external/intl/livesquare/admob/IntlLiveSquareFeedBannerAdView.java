package com.p051p1.mobile.putong.live.external.intl.livesquare.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.a4o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareFeedBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveSquareFeedBannerAdView f46417a;

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71145a(View view) {
        a4o.m95987a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m71146b(View view) {
        this.f46417a.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f46417a.addView(view, layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71145a(this);
    }

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
