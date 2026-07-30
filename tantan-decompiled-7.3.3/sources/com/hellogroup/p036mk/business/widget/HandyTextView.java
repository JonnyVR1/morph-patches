package com.hellogroup.p036mk.business.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class HandyTextView extends TextView {
    public HandyTextView(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Throwable unused) {
            setText("");
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (charSequence == null) {
            charSequence = "";
        }
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
    }

    public HandyTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HandyTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
