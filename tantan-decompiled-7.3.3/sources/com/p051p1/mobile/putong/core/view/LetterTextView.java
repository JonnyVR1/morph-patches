package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p153l.msi0;
import p153l.qa00;

/* JADX INFO: loaded from: classes12.dex */
public class LetterTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public Paint f39426a;

    /* JADX INFO: renamed from: b */
    public Rect f39427b;

    public LetterTextView(Context context) {
        super(context);
        this.f39426a = new Paint();
        this.f39427b = new Rect();
        m60724h();
    }

    /* JADX INFO: renamed from: h */
    private void m60724h() {
        this.f39426a.setAntiAlias(true);
        this.f39426a.setColor(Color.parseColor("#1A9A916A"));
        this.f39426a.setStrokeWidth(qa00.f156314a);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int lineHeight = getLineHeight();
        if (getLineCount() > 1) {
            getLineBounds(getLineCount() - 2, this.f39427b);
            lineHeight = (this.f39427b.bottom - getPaddingTop()) / (getLineCount() - 1);
        }
        int i = height / lineHeight;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f = i2 * lineHeight;
            canvas.drawLine(0.0f, f, width, f, this.f39426a);
        }
        int lineCount = getLineCount();
        if (lineCount > i) {
            while (i < lineCount) {
                i++;
                float f2 = i * lineHeight;
                canvas.drawLine(0.0f, f2, width, f2, this.f39426a);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = qa00.f156339z;
        msi0.m159815m(this, i);
        if (Build.VERSION.SDK_INT <= 28) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            float f = i - fontMetricsInt;
            float f2 = fontMetricsInt;
            setLineSpacing(f, (i - (1.0f * f2)) / f2);
        }
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39426a = new Paint();
        this.f39427b = new Rect();
        m60724h();
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39426a = new Paint();
        this.f39427b = new Rect();
        m60724h();
    }
}
