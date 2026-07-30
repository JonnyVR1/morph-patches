package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.e1c0;
import p149l.m9c0;
import p149l.t100;
import p149l.xsi0;

/* JADX INFO: loaded from: classes12.dex */
public class RecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f39801h = t100.m186890d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f39802i = t100.m186890d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f39803j = t100.m186890d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f39804k = t100.m186890d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f39805a;

    /* JADX INFO: renamed from: b */
    public RectF f39806b;

    /* JADX INFO: renamed from: c */
    public Paint f39807c;

    /* JADX INFO: renamed from: d */
    public int f39808d;

    /* JADX INFO: renamed from: e */
    public long f39809e;

    /* JADX INFO: renamed from: f */
    public float f39810f;

    /* JADX INFO: renamed from: g */
    public int f39811g;

    public RecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39808d = 1;
        this.f39811g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f132730g, i, 0);
        this.f39805a = typedArrayObtainStyledAttributes.getBoolean(m9c0.f132732h, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m61697a(Canvas canvas) {
        this.f39807c.setStyle(Paint.Style.STROKE);
        int i = this.f39811g;
        Paint paint = this.f39807c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f39807c.setStrokeWidth(t100.m186890d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f39802i, this.f39807c);
    }

    /* JADX INFO: renamed from: b */
    public final void m61698b(Canvas canvas) {
        float fM210767h = xsi0.m210767h() - this.f39809e;
        float f = fM210767h / 300.0f;
        this.f39810f = f;
        if (f > 1.0f) {
            this.f39810f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f39807c.setStyle(Paint.Style.FILL);
        this.f39807c.setColor(getResources().getColor(e1c0.f88798n));
        int i = f39803j;
        int i2 = f39801h;
        float f2 = i + ((i2 - i) * (1.0f - this.f39810f));
        RectF rectF = this.f39806b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fM186890d = t100.m186890d(8.0f) + ((i2 - t100.m186890d(8.0f)) * (1.0f - this.f39810f));
        canvas.drawRoundRect(this.f39806b, fM186890d, fM186890d, this.f39807c);
        this.f39807c.setStyle(Paint.Style.STROKE);
        this.f39807c.setColor(Color.parseColor("#4cff3a00"));
        this.f39807c.setStrokeWidth(t100.m186890d(8.0f));
        if (fM210767h < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f39804k * 0.9f, this.f39807c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fM210767h - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f39804k, this.f39807c);
        }
        if (this.f39808d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m61699c(Canvas canvas) {
        boolean z;
        float fM210767h = (xsi0.m210767h() - this.f39809e) / 300.0f;
        if (fM210767h > 1.0f) {
            this.f39810f = 0.0f;
            z = false;
            fM210767h = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fM210767h) * this.f39810f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f39807c.setStyle(Paint.Style.FILL);
        this.f39807c.setColor(getResources().getColor(e1c0.f88798n));
        int i = f39803j;
        int i2 = f39801h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f39806b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fM186890d = t100.m186890d(8.0f) + ((i2 - t100.m186890d(8.0f)) * f2);
        canvas.drawRoundRect(this.f39806b, fM186890d, fM186890d, this.f39807c);
        this.f39807c.setStyle(Paint.Style.STROKE);
        this.f39807c.setColor(Color.parseColor("#4cff3a00"));
        this.f39807c.setStrokeWidth(t100.m186890d(6.0f));
        int i3 = f39804k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f39802i + t100.m186890d(2.0f)) - i3) * f2), this.f39807c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39806b == null) {
            this.f39806b = new RectF();
        }
        if (this.f39807c == null) {
            this.f39807c = new Paint(1);
        }
        int i = this.f39808d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m61698b(canvas);
        } else if (this.f39805a) {
            m61697a(canvas);
        } else {
            m61699c(canvas);
        }
    }

    public void setState(int i) {
        this.f39808d = i;
        this.f39809e = xsi0.m210767h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f39811g = i;
        invalidate();
    }

    public RecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecordButton(Context context) {
        super(context);
        this.f39808d = 1;
        this.f39811g = 1;
    }
}
