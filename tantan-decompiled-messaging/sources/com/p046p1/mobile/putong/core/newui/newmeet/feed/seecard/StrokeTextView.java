package com.p046p1.mobile.putong.core.newui.newmeet.feed.seecard;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.h9c0;

/* JADX INFO: loaded from: classes11.dex */
public class StrokeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public TextPaint f26286a;

    /* JADX INFO: renamed from: b */
    public float f26287b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f26288c;

    /* JADX INFO: renamed from: d */
    public Rect f26289d;

    /* JADX INFO: renamed from: e */
    public int f26290e;

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26287b = 0.0f;
        this.f26288c = 0;
        this.f26290e = 0;
        m42947i(attributeSet);
        m42946h();
    }

    /* JADX INFO: renamed from: h */
    private void m42946h() {
        if (this.f26286a == null) {
            this.f26286a = new TextPaint();
        }
        if (this.f26289d == null) {
            this.f26289d = new Rect();
        }
        TextPaint paint = getPaint();
        this.f26286a.setTextSize(paint.getTextSize());
        this.f26286a.setTypeface(paint.getTypeface());
        this.f26286a.setFlags(paint.getFlags());
        this.f26286a.setAlpha(paint.getAlpha());
        this.f26286a.setStyle(Paint.Style.STROKE);
        this.f26286a.setColor(this.f26288c);
        this.f26286a.setStrokeWidth(this.f26287b);
    }

    /* JADX INFO: renamed from: i */
    public final void m42947i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h9c0.f106541H);
            this.f26287b = typedArrayObtainStyledAttributes.getDimension(h9c0.f106543J, 0.0f);
            this.f26288c = typedArrayObtainStyledAttributes.getColor(h9c0.f106542I, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        if (!TextUtils.isEmpty(string)) {
            int gravity = getGravity();
            if ((gravity & 3) == 3) {
                canvas.drawText(string, getCompoundPaddingLeft(), getBaseline(), this.f26286a);
            } else if ((gravity & 5) == 5) {
                canvas.drawText(string, (getWidth() - getCompoundPaddingRight()) - getPaint().measureText(string), getBaseline(), this.f26286a);
            } else {
                canvas.drawText(string, getPaddingLeft() + ((((getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft()) - getPaint().measureText(string)) / 2.0f), getBaseline(), this.f26286a);
            }
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        this.f26290e++;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        float fMeasureText = getPaint().measureText(getText().toString());
        if (fMeasureText == 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        float f = fontMetrics.descent - fontMetrics.top;
        float compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + fMeasureText + this.f26287b;
        float compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom() + f + (this.f26287b / 2.0f);
        if (mode == 1073741824 || mode2 == 1073741824) {
            if (mode == 1073741824 && this.f26290e < 2) {
                int iMax = (int) Math.max(size, compoundPaddingRight);
                if (iMax != size) {
                    setGravity(17);
                }
                size = iMax;
            }
            if (mode2 == 1073741824) {
                int iMax2 = (int) Math.max(size2, compoundPaddingTop);
                if (iMax2 != size2) {
                    setGravity(17);
                }
                size2 = iMax2;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        } else if (mode == Integer.MIN_VALUE || mode2 == Integer.MIN_VALUE) {
            if (mode == Integer.MIN_VALUE) {
                size = (int) compoundPaddingRight;
                setGravity(17);
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = (int) compoundPaddingTop;
                setGravity(17);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        this.f26290e %= 2;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        if (i <= 0) {
            getPaint().setFakeBoldText(false);
            getPaint().setTextSkewX(0.0f);
            TextPaint textPaint = this.f26286a;
            if (textPaint != null) {
                textPaint.setFakeBoldText(false);
                this.f26286a.setTextSkewX(0.0f);
            }
            setTypeface(typeface);
            return;
        }
        Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
        setTypeface(typefaceDefaultFromStyle);
        int i2 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i;
        int i3 = i2 & 1;
        getPaint().setFakeBoldText(i3 != 0);
        int i4 = i2 & 2;
        getPaint().setTextSkewX(i4 != 0 ? -0.25f : 0.0f);
        TextPaint textPaint2 = this.f26286a;
        if (textPaint2 != null) {
            textPaint2.setFakeBoldText(i3 != 0);
            this.f26286a.setTextSkewX(i4 != 0 ? -0.25f : 0.0f);
        }
    }

    public StrokeTextView(Context context) {
        super(context);
        this.f26287b = 0.0f;
        this.f26288c = 0;
        this.f26290e = 0;
        m42946h();
    }

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26287b = 0.0f;
        this.f26288c = 0;
        this.f26290e = 0;
        m42947i(attributeSet);
        m42946h();
    }

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface) {
        TextPaint textPaint = this.f26286a;
        if (textPaint != null && textPaint.getTypeface() != typeface) {
            this.f26286a.setTypeface(typeface);
        }
        super.setTypeface(typeface);
    }
}
