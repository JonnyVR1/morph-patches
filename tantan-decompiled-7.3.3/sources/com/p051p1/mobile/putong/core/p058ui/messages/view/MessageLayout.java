package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class MessageLayout extends VFrame {
    public MessageLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    public MessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
