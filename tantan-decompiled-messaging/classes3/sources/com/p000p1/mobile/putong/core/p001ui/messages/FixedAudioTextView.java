package com.p000p1.mobile.putong.core.p001ui.messages;

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
import l.i9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class FixedAudioTextView extends View {

    /* JADX INFO: renamed from: a */
    public final int f601a;

    /* JADX INFO: renamed from: b */
    public CharSequence f602b;

    /* JADX INFO: renamed from: c */
    public int f603c;

    /* JADX INFO: renamed from: d */
    public int f604d;

    /* JADX INFO: renamed from: e */
    public Paint f605e;

    /* JADX INFO: renamed from: f */
    public Rect f606f;

    public FixedAudioTextView(Context context) {
        super(context);
        int color = Color.parseColor("#8a000000");
        this.f601a = color;
        this.f602b = "";
        this.f603c = color;
        this.f604d = 14;
        this.f605e = new Paint();
        this.f606f = new Rect();
        m967a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m967a(Context context, AttributeSet attributeSet) {
        if (NullChecker.a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.k);
            this.f602b = typedArrayObtainStyledAttributes.getText(i9c0.l);
            this.f603c = typedArrayObtainStyledAttributes.getColor(i9c0.m, this.f601a);
            this.f604d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.n, 14);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f605e.setAntiAlias(true);
        this.f605e.setColor(this.f603c);
        this.f605e.setTextSize(this.f604d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f602b)) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f605e.getTextBounds(this.f602b.toString(), 0, this.f602b.length(), this.f606f);
        Rect rect = this.f606f;
        canvas.drawText(this.f602b.toString(), (measuredWidth - (rect.right - rect.left)) / 2, ((measuredHeight - this.f605e.descent()) - this.f605e.ascent()) / 2.0f, this.f605e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f602b)) {
            super.onMeasure(i, i2);
            return;
        }
        this.f606f.setEmpty();
        this.f605e.getTextBounds(this.f602b.toString(), 0, this.f602b.length(), this.f606f);
        Rect rect = this.f606f;
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
        if (i == this.f603c) {
            return;
        }
        this.f603c = i;
        this.f605e.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        if (i == this.f604d) {
            return;
        }
        this.f604d = i;
        this.f605e.setTextSize(i);
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f602b.equals(charSequence)) {
            return;
        }
        this.f602b = charSequence;
        invalidate();
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = Color.parseColor("#8a000000");
        this.f601a = color;
        this.f602b = "";
        this.f603c = color;
        this.f604d = 14;
        this.f605e = new Paint();
        this.f606f = new Rect();
        m967a(context, attributeSet);
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color = Color.parseColor("#8a000000");
        this.f601a = color;
        this.f602b = "";
        this.f603c = color;
        this.f604d = 14;
        this.f605e = new Paint();
        this.f606f = new Rect();
        m967a(context, attributeSet);
    }
}
