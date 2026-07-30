package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.base.view.RatioLayout;
import p149l.yzn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareBannerView extends RatioLayout {

    /* JADX INFO: renamed from: a */
    public LoopViewPager f45822a;

    /* JADX INFO: renamed from: b */
    public LoopViewPagerIndicator f45823b;

    public IntlLiveSquareBannerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m70349b(View view) {
        yzn.m216685a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70349b(this);
    }

    public IntlLiveSquareBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareBannerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
