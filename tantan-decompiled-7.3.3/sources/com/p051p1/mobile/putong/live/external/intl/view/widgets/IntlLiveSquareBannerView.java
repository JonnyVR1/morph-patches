package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.base.view.RatioLayout;
import p153l.y1o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareBannerView extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public LoopViewPager f46670a;

    /* JADX INFO: renamed from: b */
    public LoopViewPagerIndicator f46671b;

    public IntlLiveSquareBannerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m71532b(View view) {
        y1o.m213957a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71532b(this);
    }

    public IntlLiveSquareBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
