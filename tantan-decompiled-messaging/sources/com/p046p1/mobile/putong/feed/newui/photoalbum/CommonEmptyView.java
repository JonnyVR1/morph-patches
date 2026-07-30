package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.wi5;

/* JADX INFO: loaded from: classes12.dex */
public class CommonEmptyView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f40820a;

    /* JADX INFO: renamed from: b */
    public TextView f40821b;

    public CommonEmptyView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m63072a(View view) {
        wi5.m203282a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63072a(this);
    }

    public CommonEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CommonEmptyView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
