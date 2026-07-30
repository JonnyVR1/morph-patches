package com.p046p1.mobile.putong.live.external.intl.livesquare.admob;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.a2o;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareFeedBannerAdView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public IntlLiveSquareFeedBannerAdView f45569a;

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m69962a(View view) {
        a2o.m94622a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m69963b(View view) {
        this.f45569a.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        this.f45569a.addView(view, layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69962a(this);
    }

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareFeedBannerAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
