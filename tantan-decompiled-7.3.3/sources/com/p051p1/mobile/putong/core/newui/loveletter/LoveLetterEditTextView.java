package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import p153l.msi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEditTextView extends AppCompatEditText {

    /* JADX INFO: renamed from: a */
    public Paint f25135a;

    /* JADX INFO: renamed from: b */
    public Rect f25136b;

    public LoveLetterEditTextView(Context context) {
        super(context);
        this.f25135a = new Paint();
        this.f25136b = new Rect();
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25135a.setAntiAlias(true);
        this.f25135a.setColor(Color.parseColor("#1A9A916A"));
        this.f25135a.setStrokeWidth(2.0f);
        int height = getHeight();
        int width = getWidth();
        int lineHeight = getLineHeight();
        if (getLineCount() > 1) {
            getLineBounds(getLineCount() - 2, this.f25136b);
            lineHeight = (this.f25136b.bottom - getPaddingTop()) / (getLineCount() - 1);
        }
        int i = height / lineHeight;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f = i2 * lineHeight;
            canvas.drawLine(0.0f, f, width, f, this.f25135a);
        }
        int lineCount = getLineCount();
        if (lineCount > i) {
            while (i < lineCount) {
                i++;
                float f2 = i * lineHeight;
                canvas.drawLine(0.0f, f2, width, f2, this.f25135a);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setGravity(48);
        int i = qa00.f156339z;
        msi0.m159815m(this, i);
        if (Build.VERSION.SDK_INT <= 28) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            float f = i - fontMetricsInt;
            float f2 = fontMetricsInt;
            setLineSpacing(f, (i - (1.0f * f2)) / f2);
        }
    }

    public LoveLetterEditTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25135a = new Paint();
        this.f25136b = new Rect();
    }

    public LoveLetterEditTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25135a = new Paint();
        this.f25136b = new Rect();
    }
}
