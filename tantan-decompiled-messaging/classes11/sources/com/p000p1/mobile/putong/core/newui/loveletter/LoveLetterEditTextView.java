package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import l.mji0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterEditTextView extends AppCompatEditText {

    /* JADX INFO: renamed from: a */
    public Paint f3171a;

    /* JADX INFO: renamed from: b */
    public Rect f3172b;

    public LoveLetterEditTextView(Context context) {
        super(context);
        this.f3171a = new Paint();
        this.f3172b = new Rect();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
        this.f3171a.setAntiAlias(true);
        this.f3171a.setColor(Color.parseColor("#1A9A916A"));
        this.f3171a.setStrokeWidth(2.0f);
        int height = getHeight();
        int width = getWidth();
        int lineHeight = getLineHeight();
        if (getLineCount() > 1) {
            getLineBounds(getLineCount() - 2, this.f3172b);
            lineHeight = (this.f3172b.bottom - getPaddingTop()) / (getLineCount() - 1);
        }
        int i = height / lineHeight;
        int i2 = 0;
        while (i2 < i) {
            i2++;
            float f = i2 * lineHeight;
            canvas.drawLine(0.0f, f, width, f, this.f3171a);
        }
        int lineCount = getLineCount();
        if (lineCount > i) {
            while (i < lineCount) {
                i++;
                float f2 = i * lineHeight;
                canvas.drawLine(0.0f, f2, width, f2, this.f3171a);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setGravity(48);
        int i = t100.z;
        mji0.m(this, i);
        if (Build.VERSION.SDK_INT <= 28) {
            int fontMetricsInt = getPaint().getFontMetricsInt(null);
            float f = i - fontMetricsInt;
            float f2 = fontMetricsInt;
            setLineSpacing(f, (i - (1.0f * f2)) / f2);
        }
    }

    public LoveLetterEditTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3171a = new Paint();
        this.f3172b = new Rect();
    }

    public LoveLetterEditTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3171a = new Paint();
        this.f3172b = new Rect();
    }
}
