package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.xj5;

/* JADX INFO: loaded from: classes13.dex */
public class CommonEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f41668a;

    /* JADX INFO: renamed from: b */
    public TextView f41669b;

    public CommonEmptyView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m64255a(View view) {
        xj5.m211195a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64255a(this);
    }

    public CommonEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommonEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
