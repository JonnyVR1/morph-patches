package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.t100;
import l.xsi0;
import p006l.c9c0;
import p006l.u0c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountRecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f886h = t100.d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f887i = t100.d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f888j = t100.d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f889k = t100.d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f890a;

    /* JADX INFO: renamed from: b */
    public RectF f891b;

    /* JADX INFO: renamed from: c */
    public Paint f892c;

    /* JADX INFO: renamed from: d */
    public int f893d;

    /* JADX INFO: renamed from: e */
    public long f894e;

    /* JADX INFO: renamed from: f */
    public float f895f;

    /* JADX INFO: renamed from: g */
    public int f896g;

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f893d = 1;
        this.f896g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f9514K, i, 0);
        this.f890a = typedArrayObtainStyledAttributes.getBoolean(c9c0.f9515L, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m1012a(Canvas canvas) {
        this.f892c.setStyle(Paint.Style.STROKE);
        int i = this.f896g;
        Paint paint = this.f892c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f892c.setStrokeWidth(t100.d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f887i, this.f892c);
    }

    /* JADX INFO: renamed from: b */
    public final void m1013b(Canvas canvas) {
        float fH = xsi0.h() - this.f894e;
        float f = fH / 300.0f;
        this.f895f = f;
        if (f > 1.0f) {
            this.f895f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f892c.setStyle(Paint.Style.FILL);
        this.f892c.setColor(getResources().getColor(u0c0.f22403j));
        int i = f888j;
        int i2 = f886h;
        float f2 = i + ((i2 - i) * (1.0f - this.f895f));
        RectF rectF = this.f891b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fD = t100.d(8.0f) + ((i2 - t100.d(8.0f)) * (1.0f - this.f895f));
        canvas.drawRoundRect(this.f891b, fD, fD, this.f892c);
        this.f892c.setStyle(Paint.Style.STROKE);
        this.f892c.setColor(Color.parseColor("#4cff3a00"));
        this.f892c.setStrokeWidth(t100.d(8.0f));
        if (fH < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f889k * 0.9f, this.f892c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fH - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f889k, this.f892c);
        }
        if (this.f893d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1014c(Canvas canvas) {
        boolean z;
        float fH = (xsi0.h() - this.f894e) / 300.0f;
        if (fH > 1.0f) {
            this.f895f = 0.0f;
            z = false;
            fH = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fH) * this.f895f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f892c.setStyle(Paint.Style.FILL);
        this.f892c.setColor(getResources().getColor(u0c0.f22403j));
        int i = f888j;
        int i2 = f886h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f891b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fD = t100.d(8.0f) + ((i2 - t100.d(8.0f)) * f2);
        canvas.drawRoundRect(this.f891b, fD, fD, this.f892c);
        this.f892c.setStyle(Paint.Style.STROKE);
        this.f892c.setColor(Color.parseColor("#4cff3a00"));
        this.f892c.setStrokeWidth(t100.d(6.0f));
        int i3 = f889k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f887i + t100.d(2.0f)) - i3) * f2), this.f892c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f891b == null) {
            this.f891b = new RectF();
        }
        if (this.f892c == null) {
            this.f892c = new Paint(1);
        }
        int i = this.f893d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m1013b(canvas);
        } else if (this.f890a) {
            m1012a(canvas);
        } else {
            m1014c(canvas);
        }
    }

    public void setState(int i) {
        this.f893d = i;
        this.f894e = xsi0.h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f896g = i;
        invalidate();
    }

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountRecordButton(Context context) {
        super(context);
        this.f893d = 1;
        this.f896g = 1;
    }
}
