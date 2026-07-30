package com.p051p1.mobile.putong.live.external.intl.view.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.x1o;

/* JADX INFO: loaded from: classes9.dex */
public class IntlLiveSquareBannerItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f46667a;

    /* JADX INFO: renamed from: b */
    public VText f46668b;

    /* JADX INFO: renamed from: c */
    public View f46669c;

    public IntlLiveSquareBannerItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m71531a(View view) {
        x1o.m209101a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71531a(this);
        this.f46667a.getHierarchy().m207042E(null);
    }

    public IntlLiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlLiveSquareBannerItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
