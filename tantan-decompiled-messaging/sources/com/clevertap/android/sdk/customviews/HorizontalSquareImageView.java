package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class HorizontalSquareImageView extends ImageView {
    public HorizontalSquareImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(measuredHeight, measuredHeight);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
