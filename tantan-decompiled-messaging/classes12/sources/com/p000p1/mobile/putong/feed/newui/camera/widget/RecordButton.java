package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import p007l.e1c0;
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class RecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f1262h = t100.d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f1263i = t100.d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f1264j = t100.d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f1265k = t100.d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f1266a;

    /* JADX INFO: renamed from: b */
    public RectF f1267b;

    /* JADX INFO: renamed from: c */
    public Paint f1268c;

    /* JADX INFO: renamed from: d */
    public int f1269d;

    /* JADX INFO: renamed from: e */
    public long f1270e;

    /* JADX INFO: renamed from: f */
    public float f1271f;

    /* JADX INFO: renamed from: g */
    public int f1272g;

    public RecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1269d = 1;
        this.f1272g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9c0.f10321g, i, 0);
        this.f1266a = typedArrayObtainStyledAttributes.getBoolean(m9c0.f10323h, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m2649a(Canvas canvas) {
        this.f1268c.setStyle(Paint.Style.STROKE);
        int i = this.f1272g;
        Paint paint = this.f1268c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f1268c.setStrokeWidth(t100.d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f1263i, this.f1268c);
    }

    /* JADX INFO: renamed from: b */
    public final void m2650b(Canvas canvas) {
        float fH = xsi0.h() - this.f1270e;
        float f = fH / 300.0f;
        this.f1271f = f;
        if (f > 1.0f) {
            this.f1271f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f1268c.setStyle(Paint.Style.FILL);
        this.f1268c.setColor(getResources().getColor(e1c0.f7154n));
        int i = f1264j;
        int i2 = f1262h;
        float f2 = i + ((i2 - i) * (1.0f - this.f1271f));
        RectF rectF = this.f1267b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fD = t100.d(8.0f) + ((i2 - t100.d(8.0f)) * (1.0f - this.f1271f));
        canvas.drawRoundRect(this.f1267b, fD, fD, this.f1268c);
        this.f1268c.setStyle(Paint.Style.STROKE);
        this.f1268c.setColor(Color.parseColor("#4cff3a00"));
        this.f1268c.setStrokeWidth(t100.d(8.0f));
        if (fH < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f1265k * 0.9f, this.f1268c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fH - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f1265k, this.f1268c);
        }
        if (this.f1269d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2651c(Canvas canvas) {
        boolean z;
        float fH = (xsi0.h() - this.f1270e) / 300.0f;
        if (fH > 1.0f) {
            this.f1271f = 0.0f;
            z = false;
            fH = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fH) * this.f1271f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f1268c.setStyle(Paint.Style.FILL);
        this.f1268c.setColor(getResources().getColor(e1c0.f7154n));
        int i = f1264j;
        int i2 = f1262h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f1267b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fD = t100.d(8.0f) + ((i2 - t100.d(8.0f)) * f2);
        canvas.drawRoundRect(this.f1267b, fD, fD, this.f1268c);
        this.f1268c.setStyle(Paint.Style.STROKE);
        this.f1268c.setColor(Color.parseColor("#4cff3a00"));
        this.f1268c.setStrokeWidth(t100.d(6.0f));
        int i3 = f1265k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f1263i + t100.d(2.0f)) - i3) * f2), this.f1268c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1267b == null) {
            this.f1267b = new RectF();
        }
        if (this.f1268c == null) {
            this.f1268c = new Paint(1);
        }
        int i = this.f1269d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m2650b(canvas);
        } else if (this.f1266a) {
            m2649a(canvas);
        } else {
            m2651c(canvas);
        }
    }

    public void setState(int i) {
        this.f1269d = i;
        this.f1270e = xsi0.h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f1272g = i;
        invalidate();
    }

    public RecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecordButton(Context context) {
        super(context);
        this.f1269d = 1;
        this.f1272g = 1;
    }
}
