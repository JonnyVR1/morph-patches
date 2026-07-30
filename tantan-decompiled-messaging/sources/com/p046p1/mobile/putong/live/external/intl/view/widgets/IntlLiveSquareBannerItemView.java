package com.p046p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.xzn;

/* JADX INFO: loaded from: classes13.dex */
public class IntlLiveSquareBannerItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45819a;

    /* JADX INFO: renamed from: b */
    public VText f45820b;

    /* JADX INFO: renamed from: c */
    public View f45821c;

    public IntlLiveSquareBannerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m70348a(View view) {
        xzn.m212000a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70348a(this);
        this.f45819a.getHierarchy().m112050E(null);
    }

    public IntlLiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
