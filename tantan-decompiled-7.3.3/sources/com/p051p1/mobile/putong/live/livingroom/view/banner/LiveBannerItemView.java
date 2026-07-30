package com.p051p1.mobile.putong.live.livingroom.view.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p153l.cxr;

/* JADX INFO: loaded from: classes5.dex */
public class LiveBannerItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f52952a;

    public LiveBannerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m77847a(View view) {
        cxr.m113052a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77847a(this);
    }

    public LiveBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
