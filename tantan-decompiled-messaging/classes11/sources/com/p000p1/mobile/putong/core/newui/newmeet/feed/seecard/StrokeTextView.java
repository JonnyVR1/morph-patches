package com.p000p1.mobile.putong.core.newui.newmeet.feed.seecard;

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
import l.h9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class StrokeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: a */
    public TextPaint f5064a;

    /* JADX INFO: renamed from: b */
    public float f5065b;

    /* JADX INFO: renamed from: c */
    @ColorInt
    public int f5066c;

    /* JADX INFO: renamed from: d */
    public Rect f5067d;

    /* JADX INFO: renamed from: e */
    public int f5068e;

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5065b = 0.0f;
        this.f5066c = 0;
        this.f5068e = 0;
        m7142i(attributeSet);
        m7141h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    private void m7141h() {
        if (this.f5064a == null) {
            this.f5064a = new TextPaint();
        }
        if (this.f5067d == null) {
            this.f5067d = new Rect();
        }
        TextPaint paint = getPaint();
        this.f5064a.setTextSize(paint.getTextSize());
        this.f5064a.setTypeface(paint.getTypeface());
        this.f5064a.setFlags(paint.getFlags());
        this.f5064a.setAlpha(paint.getAlpha());
        this.f5064a.setStyle(Paint.Style.STROKE);
        this.f5064a.setColor(this.f5066c);
        this.f5064a.setStrokeWidth(this.f5065b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public final void m7142i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h9c0.H);
            this.f5065b = typedArrayObtainStyledAttributes.getDimension(h9c0.J, 0.0f);
            this.f5066c = typedArrayObtainStyledAttributes.getColor(h9c0.I, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        String string = getText().toString();
        if (!TextUtils.isEmpty(string)) {
            int gravity = getGravity();
            if ((gravity & 3) == 3) {
                canvas.drawText(string, getCompoundPaddingLeft(), getBaseline(), this.f5064a);
            } else if ((gravity & 5) == 5) {
                canvas.drawText(string, (getWidth() - getCompoundPaddingRight()) - getPaint().measureText(string), getBaseline(), this.f5064a);
            } else {
                canvas.drawText(string, getPaddingLeft() + ((((getWidth() - getCompoundPaddingRight()) - getCompoundPaddingLeft()) - getPaint().measureText(string)) / 2.0f), getBaseline(), this.f5064a);
            }
        }
        super/*android.view.View*/.onDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        this.f5068e++;
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
        float compoundPaddingRight = getCompoundPaddingRight() + getCompoundPaddingLeft() + fMeasureText + this.f5065b;
        float compoundPaddingTop = getCompoundPaddingTop() + getCompoundPaddingBottom() + f + (this.f5065b / 2.0f);
        if (mode == 1073741824 || mode2 == 1073741824) {
            if (mode == 1073741824 && this.f5068e < 2) {
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
        this.f5068e %= 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(@Nullable Typeface typeface, int i) {
        if (i <= 0) {
            getPaint().setFakeBoldText(false);
            getPaint().setTextSkewX(0.0f);
            TextPaint textPaint = this.f5064a;
            if (textPaint != null) {
                textPaint.setFakeBoldText(false);
                this.f5064a.setTextSkewX(0.0f);
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
        TextPaint textPaint2 = this.f5064a;
        if (textPaint2 != null) {
            textPaint2.setFakeBoldText(i3 != 0);
            this.f5064a.setTextSkewX(i4 != 0 ? -0.25f : 0.0f);
        }
    }

    public StrokeTextView(Context context) {
        super(context);
        this.f5065b = 0.0f;
        this.f5066c = 0;
        this.f5068e = 0;
        m7141h();
    }

    public StrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5065b = 0.0f;
        this.f5066c = 0;
        this.f5068e = 0;
        m7142i(attributeSet);
        m7141h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTypeface(@Nullable Typeface typeface) {
        TextPaint textPaint = this.f5064a;
        if (textPaint != null && textPaint.getTypeface() != typeface) {
            this.f5064a.setTypeface(typeface);
        }
        super/*android.widget.TextView*/.setTypeface(typeface);
    }
}
