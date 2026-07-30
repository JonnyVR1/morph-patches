package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.clevertap.android.sdk.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class CloseImageView extends AppCompatImageView {

    /* JADX INFO: renamed from: c */
    private final int f4880c;

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context) {
        super(context);
        this.f4880c = m5981d(40);
        setId(199272);
    }

    /* JADX INFO: renamed from: d */
    private int m5981d(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    @Override // android.widget.ImageView, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Context context = getContext();
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("ct_close", "drawable", context.getPackageName()), null);
            if (bitmapDecodeResource == null) {
                Logger.m5873v("Unable to find inapp notif close button image");
            } else {
                int i = this.f4880c;
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, i, i, true), 0.0f, 0.0f, new Paint());
            }
        } catch (Throwable th) {
            Logger.m5876v("Error displaying the inapp notif close button image:", th);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.f4880c;
        setMeasuredDimension(i3, i3);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4880c = m5981d(40);
        setId(199272);
    }

    @SuppressLint({"ResourceType"})
    public CloseImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4880c = m5981d(40);
        setId(199272);
    }
}
