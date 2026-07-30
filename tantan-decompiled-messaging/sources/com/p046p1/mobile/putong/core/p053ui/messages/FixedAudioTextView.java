package com.p046p1.mobile.putong.core.p053ui.messages;

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
import p149l.i9c0;

/* JADX INFO: loaded from: classes3.dex */
public class FixedAudioTextView extends View {

    /* JADX INFO: renamed from: a */
    public final int f30710a;

    /* JADX INFO: renamed from: b */
    public CharSequence f30711b;

    /* JADX INFO: renamed from: c */
    public int f30712c;

    /* JADX INFO: renamed from: d */
    public int f30713d;

    /* JADX INFO: renamed from: e */
    public Paint f30714e;

    /* JADX INFO: renamed from: f */
    public Rect f30715f;

    public FixedAudioTextView(Context context) {
        super(context);
        int color = Color.parseColor("#8a000000");
        this.f30710a = color;
        this.f30711b = "";
        this.f30712c = color;
        this.f30713d = 14;
        this.f30714e = new Paint();
        this.f30715f = new Rect();
        m47894a(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m47894a(Context context, AttributeSet attributeSet) {
        if (NullChecker.m81303a(attributeSet)) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i9c0.f112178k);
            this.f30711b = typedArrayObtainStyledAttributes.getText(i9c0.f112180l);
            this.f30712c = typedArrayObtainStyledAttributes.getColor(i9c0.f112182m, this.f30710a);
            this.f30713d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i9c0.f112184n, 14);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f30714e.setAntiAlias(true);
        this.f30714e.setColor(this.f30712c);
        this.f30714e.setTextSize(this.f30713d);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (TextUtils.isEmpty(this.f30711b)) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f30714e.getTextBounds(this.f30711b.toString(), 0, this.f30711b.length(), this.f30715f);
        Rect rect = this.f30715f;
        canvas.drawText(this.f30711b.toString(), (measuredWidth - (rect.right - rect.left)) / 2, ((measuredHeight - this.f30714e.descent()) - this.f30714e.ascent()) / 2.0f, this.f30714e);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f30711b)) {
            super.onMeasure(i, i2);
            return;
        }
        this.f30715f.setEmpty();
        this.f30714e.getTextBounds(this.f30711b.toString(), 0, this.f30711b.length(), this.f30715f);
        Rect rect = this.f30715f;
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
        if (i == this.f30712c) {
            return;
        }
        this.f30712c = i;
        this.f30714e.setColor(i);
        invalidate();
    }

    public void setTextSize(int i) {
        if (i == this.f30713d) {
            return;
        }
        this.f30713d = i;
        this.f30714e.setTextSize(i);
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.f30711b.equals(charSequence)) {
            return;
        }
        this.f30711b = charSequence;
        invalidate();
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int color = Color.parseColor("#8a000000");
        this.f30710a = color;
        this.f30711b = "";
        this.f30712c = color;
        this.f30713d = 14;
        this.f30714e = new Paint();
        this.f30715f = new Rect();
        m47894a(context, attributeSet);
    }

    public FixedAudioTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color = Color.parseColor("#8a000000");
        this.f30710a = color;
        this.f30711b = "";
        this.f30712c = color;
        this.f30713d = 14;
        this.f30714e = new Paint();
        this.f30715f = new Rect();
        m47894a(context, attributeSet);
    }
}
