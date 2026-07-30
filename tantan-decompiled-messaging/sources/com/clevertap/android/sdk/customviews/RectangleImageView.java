package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class RectangleImageView extends ImageView {
    public RectangleImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), Math.round(getMeasuredWidth() * 0.5625f));
    }

    public RectangleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RectangleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
