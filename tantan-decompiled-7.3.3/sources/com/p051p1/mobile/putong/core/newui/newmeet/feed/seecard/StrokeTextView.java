package com.p051p1.mobile.putong.core.newui.newmeet.feed.seecard;

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
import p153l.nhc0;

/* JADX INFO: loaded from: classes11.dex */
public class StrokeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public TextPaint f27028a;

    /* JADX INFO: renamed from: b */
    public float f27029b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f27030c;

    /* JADX INFO: renamed from: d */
    public Rect f27031d;

    /* JADX INFO: renamed from: e */
    public int f27032e;

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27029b = 0.0f;
        this.f27030c = 0;
        this.f27032e = 0;
        m43958i(attributeSet);
        m43957h();
    }

    /* JADX INFO: renamed from: h */
    private void m43957h() {
        if (this.f27028a == null) {
            this.f27028a = new TextPaint();
        }
        if (this.f27031d == null) {
            this.f27031d = new Rect();
        }
        TextPaint paint = getPaint();
        this.f27028a.setTextSize(paint.getTextSize());
        this.f27028a.setTypeface(paint.getTypeface());
        this.f27028a.setFlags(paint.getFlags());
        this.f27028a.setAlpha(paint.getAlpha());
        this.f27028a.setStyle(Paint.Style.STROKE);
        this.f27028a.setColor(this.f27030c);
        this.f27028a.setStrokeWidth(this.f27029b);
    }

    /* JADX INFO: renamed from: i */
    public final void m43958i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nhc0.f141958H);
            this.f27029b = typedArrayObtainStyledAttributes.getDimension(nhc0.f141960J, 0.0f);
            this.f27030c = typedArrayObtainStyledAttributes.getColor(nhc0.f141959I, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        if (!TextUtils.isEmpty(string)) {
            int gravity = getGravity();
            if ((gravity & 3) == 3) {
                canvas.drawText(string, getCompoundPaddingLeft(), getBaseline(), this.f27028a);
            } else if ((gravity & 5) == 5) {
                canvas.drawText(string, (getWidth() - getCompoundPaddingRight()) - getPaint().measureText(string), getBaseline(), this.f27028a);
            } else {
                canvas.drawText(string, getPaddingLeft() + ((((getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft()) - getPaint().measureText(string)) / 2.0f), getBaseline(), this.f27028a);
            }
        }
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        this.f27032e++;
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
        float compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + fMeasureText + this.f27029b;
        float compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom() + f + (this.f27029b / 2.0f);
        if (mode == 1073741824 || mode2 == 1073741824) {
            if (mode == 1073741824 && this.f27032e < 2) {
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
        this.f27032e %= 2;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface, int i) {
        if (i <= 0) {
            getPaint().setFakeBoldText(false);
            getPaint().setTextSkewX(0.0f);
            TextPaint textPaint = this.f27028a;
            if (textPaint != null) {
                textPaint.setFakeBoldText(false);
                this.f27028a.setTextSkewX(0.0f);
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
        TextPaint textPaint2 = this.f27028a;
        if (textPaint2 != null) {
            textPaint2.setFakeBoldText(i3 != 0);
            this.f27028a.setTextSkewX(i4 != 0 ? -0.25f : 0.0f);
        }
    }

    public StrokeTextView(Context context) {
        super(context);
        this.f27029b = 0.0f;
        this.f27030c = 0;
        this.f27032e = 0;
        m43957h();
    }

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27029b = 0.0f;
        this.f27030c = 0;
        this.f27032e = 0;
        m43958i(attributeSet);
        m43957h();
    }

    @Override // android.widget.TextView
    public void setTypeface(@Nullable Typeface typeface) {
        TextPaint textPaint = this.f27028a;
        if (textPaint != null && textPaint.getTypeface() != typeface) {
            this.f27028a.setTypeface(typeface);
        }
        super.setTypeface(typeface);
    }
}
