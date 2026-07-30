package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import l.mji0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class LetterTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public Paint f2520a;

    /* JADX INFO: renamed from: b */
    public Rect f2521b;

    public LetterTextView(Context context) {
        super(context);
        this.f2520a = new Paint();
        this.f2521b = new Rect();
        m4949h();
    }

    /* JADX INFO: renamed from: h */
    private void m4949h() {
        this.f2520a.setAntiAlias(true);
        this.f2520a.setColor(Color.parseColor("#1A9A916A"));
        this.f2520a.setStrokeWidth(t100.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        int height = getHeight();
        int width = getWidth();
        int lineHeight = getLineHeight();
        if (getLineCount() > 1) {
            getLineBounds(getLineCount() - 2, this.f2521b);
            lineHeight = (this.f2521b.bottom - getPaddingTop()) / (getLineCount() - 1);
        }
        int i = height / lineHeight;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f = i2 * lineHeight;
            canvas.drawLine(0.0f, f, width, f, this.f2520a);
        }
        int lineCount = getLineCount();
        if (lineCount > i) {
            while (i < lineCount) {
                i++;
                float f2 = i * lineHeight;
                canvas.drawLine(0.0f, f2, width, f2, this.f2520a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        int i = t100.z;
        mji0.m(this, i);
        if (Build.VERSION.SDK_INT <= 28) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            float f = i - fontMetricsInt;
            float f2 = fontMetricsInt;
            setLineSpacing(f, (i - (1.0f * f2)) / f2);
        }
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2520a = new Paint();
        this.f2521b = new Rect();
        m4949h();
    }

    public LetterTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2520a = new Paint();
        this.f2521b = new Rect();
        m4949h();
    }
}
