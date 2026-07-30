package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStrokeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f5702a;

    /* JADX INFO: renamed from: b */
    public Paint f5703b;

    /* JADX INFO: renamed from: c */
    public final Rect f5704c;

    /* JADX INFO: renamed from: d */
    public final CornerPathEffect f5705d;

    /* JADX INFO: renamed from: e */
    public int f5706e;

    public LiveStrokeTextView(Context context) {
        super(context);
        this.f5704c = new Rect();
        this.f5705d = new CornerPathEffect(3.0f);
        this.f5706e = 10;
    }

    /* JADX INFO: renamed from: h */
    private void m7177h() {
        Paint paint = new Paint(1);
        this.f5703b = paint;
        paint.setAntiAlias(true);
        this.f5703b.setDither(true);
        this.f5703b.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        TextPaint paint = getPaint();
        Typeface typeface = getTypeface();
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        String string2 = TextUtils.ellipsize(string, paint, (getWidth() - getPaddingLeft()) - getPaddingRight(), TextUtils.TruncateAt.END).toString();
        if (typeface != null) {
            this.f5703b.setTypeface(typeface);
        }
        this.f5703b.setStrokeWidth(this.f5706e);
        this.f5703b.setColor(this.f5702a);
        this.f5703b.setPathEffect(this.f5705d);
        this.f5703b.setTextSize(getTextSize());
        this.f5703b.getTextBounds(string, 0, string2.length(), this.f5704c);
        float fWidth = this.f5704c.width();
        this.f5704c.height();
        float measuredWidth = (getMeasuredWidth() / 2.0f) - (fWidth / 2.0f);
        getMeasuredHeight();
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f5703b);
        this.f5703b.setColor(getCurrentTextColor());
        this.f5703b.setStrokeWidth(0.0f);
        this.f5703b.setPathEffect(null);
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f5703b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7177h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setStrokeColor(int i) {
        this.f5702a = i;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.f5706e = i;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5704c = new Rect();
        this.f5705d = new CornerPathEffect(3.0f);
        this.f5706e = 10;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5704c = new Rect();
        this.f5705d = new CornerPathEffect(3.0f);
        this.f5706e = 10;
    }
}
