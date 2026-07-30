package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import p153l.ohc0;

/* JADX INFO: loaded from: classes3.dex */
public class FixedAudioTextView extends View {

    /* JADX INFO: renamed from: a */
    public final int f31558a;

    /* JADX INFO: renamed from: b */
    public CharSequence f31559b;

    /* JADX INFO: renamed from: c */
    public int f31560c;

    /* JADX INFO: renamed from: d */
    public int f31561d;

    /* JADX INFO: renamed from: e */
    public Paint f31562e;

    /* JADX INFO: renamed from: f */
    public Rect f31563f;

    public FixedAudioTextView(Context context) {
        super(context);
        int color = Color.parseColor("#8a000000");
        this.f31558a = color;
        this.f31559b = "";
        this.f31560c = color;
        this.f31561d = 14;
        this.f31562e = new Paint();
        this.f31563f = new Rect();
        m49077a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m49077a(Context context, AttributeSet attributeSet) {
        if (NullChecker.m82486a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ohc0.f147403k);
            this.f31559b = typedArrayObtainStyledAttributes.getText(ohc0.f147405l);
            this.f31560c = typedArrayObtainStyledAttributes.getColor(ohc0.f147407m, this.f31558a);
            this.f31561d = typedArrayObtainStyledAttributes.getDimensionPixelSize(ohc0.f147409n, 14);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f31562e.setAntiAlias(true);
        this.f31562e.setColor(this.f31560c);
        this.f31562e.setTextSize(this.f31561d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f31559b)) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f31562e.getTextBounds(this.f31559b.toString(), 0, this.f31559b.length(), this.f31563f);
        Rect rect = this.f31563f;
        canvas.drawText(this.f31559b.toString(), (measuredWidth - (rect.right - rect.left)) / 2, ((measuredHeight - this.f31562e.descent()) - this.f31562e.ascent()) / 2.0f, this.f31562e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f31559b)) {
            super.onMeasure(i, i2);
            return;
        }
        this.f31563f.setEmpty();
        this.f31562e.getTextBounds(this.f31559b.toString(), 0, this.f31559b.length(), this.f31563f);
        Rect rect = this.f31563f;
        int i3 = rect.right - rect.left;
        int i4 = rect.bottom - rect.top;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if ((mode != 0 && mode != Integer.MIN_VALUE) || size <= i3) {
            i3 = size;
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 0 || mode2 == Integer.MIN_VALUE) {
            if (size2 <= i4) {
                i4 = size;
            }
            size2 = i4;
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setText(int i) {
        if (i <= 0) {
            setText("");
        } else {
            setText(getResources().getText(i));
        }
    }

    public void setTextColor(int i) {
        if (i == this.f31560c) {
            return;
        }
        this.f31560c = i;
        this.f31562e.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        if (i == this.f31561d) {
            return;
        }
        this.f31561d = i;
        this.f31562e.setTextSize(i);
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f31559b.equals(charSequence)) {
            return;
        }
        this.f31559b = charSequence;
        invalidate();
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = Color.parseColor("#8a000000");
        this.f31558a = color;
        this.f31559b = "";
        this.f31560c = color;
        this.f31561d = 14;
        this.f31562e = new Paint();
        this.f31563f = new Rect();
        m49077a(context, attributeSet);
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color = Color.parseColor("#8a000000");
        this.f31558a = color;
        this.f31559b = "";
        this.f31560c = color;
        this.f31561d = 14;
        this.f31562e = new Paint();
        this.f31563f = new Rect();
        m49077a(context, attributeSet);
    }
}
