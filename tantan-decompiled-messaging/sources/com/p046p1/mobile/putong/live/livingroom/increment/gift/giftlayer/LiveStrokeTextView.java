package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftlayer;

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
    public int f49660a;

    /* JADX INFO: renamed from: b */
    public Paint f49661b;

    /* JADX INFO: renamed from: c */
    public final Rect f49662c;

    /* JADX INFO: renamed from: d */
    public final CornerPathEffect f49663d;

    /* JADX INFO: renamed from: e */
    public int f49664e;

    public LiveStrokeTextView(Context context) {
        super(context);
        this.f49662c = new Rect();
        this.f49663d = new CornerPathEffect(3.0f);
        this.f49664e = 10;
    }

    /* JADX INFO: renamed from: h */
    private void m73629h() {
        Paint paint = new Paint(1);
        this.f49661b = paint;
        paint.setAntiAlias(true);
        this.f49661b.setDither(true);
        this.f49661b.setStyle(Paint.Style.FILL_AND_STROKE);
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
            this.f49661b.setTypeface(typeface);
        }
        this.f49661b.setStrokeWidth(this.f49664e);
        this.f49661b.setColor(this.f49660a);
        this.f49661b.setPathEffect(this.f49663d);
        this.f49661b.setTextSize(getTextSize());
        this.f49661b.getTextBounds(string, 0, string2.length(), this.f49662c);
        float fWidth = this.f49662c.width();
        this.f49662c.height();
        float measuredWidth = (getMeasuredWidth() / 2.0f) - (fWidth / 2.0f);
        getMeasuredHeight();
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f49661b);
        this.f49661b.setColor(getCurrentTextColor());
        this.f49661b.setStrokeWidth(0.0f);
        this.f49661b.setPathEffect(null);
        canvas.drawText(string2, measuredWidth, getBaseline(), this.f49661b);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73629h();
    }

    public void setStrokeColor(int i) {
        this.f49660a = i;
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.f49664e = i;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49662c = new Rect();
        this.f49663d = new CornerPathEffect(3.0f);
        this.f49664e = 10;
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49662c = new Rect();
        this.f49663d = new CornerPathEffect(3.0f);
        this.f49664e = 10;
    }
}
