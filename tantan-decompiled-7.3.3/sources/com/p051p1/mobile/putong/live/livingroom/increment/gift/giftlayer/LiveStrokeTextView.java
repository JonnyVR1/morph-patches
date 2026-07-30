package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

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

/* JADX INFO: loaded from: classes4.dex */
public class LiveStrokeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public int f50508a;

    /* JADX INFO: renamed from: b */
    public Paint f50509b;

    /* JADX INFO: renamed from: c */
    public final Rect f50510c;

    /* JADX INFO: renamed from: d */
    public final CornerPathEffect f50511d;

    /* JADX INFO: renamed from: e */
    public int f50512e;

    public LiveStrokeTextView(Context context) {
        super(context);
        this.f50510c = new Rect();
        this.f50511d = new CornerPathEffect(3.0f);
        this.f50512e = 10;
    }

    /* JADX INFO: renamed from: h */
    private void m74812h() {
        Paint paint = new Paint(1);
        this.f50509b = paint;
        paint.setAntiAlias(true);
        this.f50509b.setDither(true);
        this.f50509b.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        TextPaint paint = getPaint();
        Typeface typeface = getTypeface();
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        String string2 = TextUtils.ellipsize(string, paint, (getWidth() - getPaddingLeft()) - getPaddingRight(), TextUtils.TruncateAt.END).toString();
        if (typeface != null) {
            this.f50509b.setTypeface(typeface);
        }
        this.f50509b.setStrokeWidth(this.f50512e);
        this.f50509b.setColor(this.f50508a);
        this.f50509b.setPathEffect(this.f50511d);
        this.f50509b.setTextSize(getTextSize());
        this.f50509b.getTextBounds(string, 0, string2.length(), this.f50510c);
        float fWidth = this.f50510c.width();
        this.f50510c.height();
        float measuredWidth = (getMeasuredWidth() / 2.0f) - (fWidth / 2.0f);
        getMeasuredHeight();
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f50509b);
        this.f50509b.setColor(getCurrentTextColor());
        this.f50509b.setStrokeWidth(0.0f);
        this.f50509b.setPathEffect(null);
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f50509b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74812h();
    }

    public void setStrokeColor(int i) {
        this.f50508a = i;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.f50512e = i;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50510c = new Rect();
        this.f50511d = new CornerPathEffect(3.0f);
        this.f50512e = 10;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50510c = new Rect();
        this.f50511d = new CornerPathEffect(3.0f);
        this.f50512e = 10;
    }
}
