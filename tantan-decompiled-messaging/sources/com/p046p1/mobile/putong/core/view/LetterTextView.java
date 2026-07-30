package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.mji0;
import p149l.t100;

/* JADX INFO: loaded from: classes10.dex */
public class LetterTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public Paint f38578a;

    /* JADX INFO: renamed from: b */
    public Rect f38579b;

    public LetterTextView(Context context) {
        super(context);
        this.f38578a = new Paint();
        this.f38579b = new Rect();
        m59540h();
    }

    /* JADX INFO: renamed from: h */
    private void m59540h() {
        this.f38578a.setAntiAlias(true);
        this.f38578a.setColor(Color.parseColor("#1A9A916A"));
        this.f38578a.setStrokeWidth(t100.f167252a);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int lineHeight = getLineHeight();
        if (getLineCount() > 1) {
            getLineBounds(getLineCount() - 2, this.f38579b);
            lineHeight = (this.f38579b.bottom - getPaddingTop()) / (getLineCount() - 1);
        }
        int i = height / lineHeight;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f = i2 * lineHeight;
            canvas.drawLine(0.0f, f, width, f, this.f38578a);
        }
        int lineCount = getLineCount();
        if (lineCount > i) {
            while (i < lineCount) {
                i++;
                float f2 = i * lineHeight;
                canvas.drawLine(0.0f, f2, width, f2, this.f38578a);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = t100.f167277z;
        mji0.m154819m(this, i);
        if (Build.VERSION.SDK_INT <= 28) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            float f = i - fontMetricsInt;
            float f2 = fontMetricsInt;
            setLineSpacing(f, (i - (1.0f * f2)) / f2);
        }
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38578a = new Paint();
        this.f38579b = new Rect();
        m59540h();
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38578a = new Paint();
        this.f38579b = new Rect();
        m59540h();
    }
}
