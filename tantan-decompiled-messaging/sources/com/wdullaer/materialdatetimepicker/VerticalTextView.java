package com.wdullaer.materialdatetimepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.Gravity;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"AppCompatCustomView"})
public class VerticalTextView extends TextView {

    /* JADX INFO: renamed from: a */
    final boolean f61182a;

    public VerticalTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int gravity = getGravity();
        if (!Gravity.isVertical(gravity) || (gravity & 112) != 80) {
            this.f61182a = true;
        } else {
            setGravity((gravity & 7) | 48);
            this.f61182a = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.drawableState = getDrawableState();
        canvas.save();
        if (this.f61182a) {
            canvas.translate(getWidth(), 0.0f);
            canvas.rotate(90.0f);
        } else {
            canvas.translate(0.0f, getHeight());
            canvas.rotate(-90.0f);
        }
        canvas.translate(getCompoundPaddingLeft(), getExtendedPaddingTop());
        getLayout().draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i2, i);
        setMeasuredDimension(getMeasuredHeight(), getMeasuredWidth());
    }
}
