package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.c9c0;
import p149l.t100;
import p149l.u0c0;
import p149l.xsi0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountRecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f16897h = t100.m186890d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f16898i = t100.m186890d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f16899j = t100.m186890d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f16900k = t100.m186890d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f16901a;

    /* JADX INFO: renamed from: b */
    public RectF f16902b;

    /* JADX INFO: renamed from: c */
    public Paint f16903c;

    /* JADX INFO: renamed from: d */
    public int f16904d;

    /* JADX INFO: renamed from: e */
    public long f16905e;

    /* JADX INFO: renamed from: f */
    public float f16906f;

    /* JADX INFO: renamed from: g */
    public int f16907g;

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16904d = 1;
        this.f16907g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c9c0.f79891K, i, 0);
        this.f16901a = typedArrayObtainStyledAttributes.getBoolean(c9c0.f79892L, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m29106a(Canvas canvas) {
        this.f16903c.setStyle(Paint.Style.STROKE);
        int i = this.f16907g;
        Paint paint = this.f16903c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f16903c.setStrokeWidth(t100.m186890d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f16898i, this.f16903c);
    }

    /* JADX INFO: renamed from: b */
    public final void m29107b(Canvas canvas) {
        float fM210767h = xsi0.m210767h() - this.f16905e;
        float f = fM210767h / 300.0f;
        this.f16906f = f;
        if (f > 1.0f) {
            this.f16906f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f16903c.setStyle(Paint.Style.FILL);
        this.f16903c.setColor(getResources().getColor(u0c0.f172889j));
        int i = f16899j;
        int i2 = f16897h;
        float f2 = i + ((i2 - i) * (1.0f - this.f16906f));
        RectF rectF = this.f16902b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fM186890d = t100.m186890d(8.0f) + ((i2 - t100.m186890d(8.0f)) * (1.0f - this.f16906f));
        canvas.drawRoundRect(this.f16902b, fM186890d, fM186890d, this.f16903c);
        this.f16903c.setStyle(Paint.Style.STROKE);
        this.f16903c.setColor(Color.parseColor("#4cff3a00"));
        this.f16903c.setStrokeWidth(t100.m186890d(8.0f));
        if (fM210767h < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f16900k * 0.9f, this.f16903c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fM210767h - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f16900k, this.f16903c);
        }
        if (this.f16904d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m29108c(Canvas canvas) {
        boolean z;
        float fM210767h = (xsi0.m210767h() - this.f16905e) / 300.0f;
        if (fM210767h > 1.0f) {
            this.f16906f = 0.0f;
            z = false;
            fM210767h = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fM210767h) * this.f16906f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f16903c.setStyle(Paint.Style.FILL);
        this.f16903c.setColor(getResources().getColor(u0c0.f172889j));
        int i = f16899j;
        int i2 = f16897h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f16902b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fM186890d = t100.m186890d(8.0f) + ((i2 - t100.m186890d(8.0f)) * f2);
        canvas.drawRoundRect(this.f16902b, fM186890d, fM186890d, this.f16903c);
        this.f16903c.setStyle(Paint.Style.STROKE);
        this.f16903c.setColor(Color.parseColor("#4cff3a00"));
        this.f16903c.setStrokeWidth(t100.m186890d(6.0f));
        int i3 = f16900k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f16898i + t100.m186890d(2.0f)) - i3) * f2), this.f16903c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16902b == null) {
            this.f16902b = new RectF();
        }
        if (this.f16903c == null) {
            this.f16903c = new Paint(1);
        }
        int i = this.f16904d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m29107b(canvas);
        } else if (this.f16901a) {
            m29106a(canvas);
        } else {
            m29108c(canvas);
        }
    }

    public void setState(int i) {
        this.f16904d = i;
        this.f16905e = xsi0.m210767h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f16907g = i;
        invalidate();
    }

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountRecordButton(Context context) {
        super(context);
        this.f16904d = 1;
        this.f16907g = 1;
    }
}
