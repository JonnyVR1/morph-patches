package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageLayout extends VFrame {
    public MessageLayout(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        super/*android.view.View*/.dispatchDraw(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTranslationY(float f) {
        super/*android.view.View*/.setTranslationY(f);
    }

    public MessageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
