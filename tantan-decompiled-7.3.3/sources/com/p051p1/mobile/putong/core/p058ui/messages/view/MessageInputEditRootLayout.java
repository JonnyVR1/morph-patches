package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class MessageInputEditRootLayout extends LinearLayout {
    public MessageInputEditRootLayout(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(qa00.m175859d(90.0f), Integer.MIN_VALUE));
    }

    public MessageInputEditRootLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageInputEditRootLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
