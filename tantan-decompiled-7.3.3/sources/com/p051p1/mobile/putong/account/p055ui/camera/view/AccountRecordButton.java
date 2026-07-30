package com.p051p1.mobile.putong.account.p055ui.camera.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.a2j0;
import p153l.a9c0;
import p153l.ihc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class AccountRecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f17616h = qa00.m175859d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f17617i = qa00.m175859d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f17618j = qa00.m175859d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f17619k = qa00.m175859d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f17620a;

    /* JADX INFO: renamed from: b */
    public RectF f17621b;

    /* JADX INFO: renamed from: c */
    public Paint f17622c;

    /* JADX INFO: renamed from: d */
    public int f17623d;

    /* JADX INFO: renamed from: e */
    public long f17624e;

    /* JADX INFO: renamed from: f */
    public float f17625f;

    /* JADX INFO: renamed from: g */
    public int f17626g;

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17623d = 1;
        this.f17626g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ihc0.f114896K, i, 0);
        this.f17620a = typedArrayObtainStyledAttributes.getBoolean(ihc0.f114897L, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m30105a(Canvas canvas) {
        this.f17622c.setStyle(Paint.Style.STROKE);
        int i = this.f17626g;
        Paint paint = this.f17622c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f17622c.setStrokeWidth(qa00.m175859d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f17617i, this.f17622c);
    }

    /* JADX INFO: renamed from: b */
    public final void m30106b(Canvas canvas) {
        float fM95705h = a2j0.m95705h() - this.f17624e;
        float f = fM95705h / 300.0f;
        this.f17625f = f;
        if (f > 1.0f) {
            this.f17625f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f17622c.setStyle(Paint.Style.FILL);
        this.f17622c.setColor(getResources().getColor(a9c0.f69025j));
        int i = f17618j;
        int i2 = f17616h;
        float f2 = i + ((i2 - i) * (1.0f - this.f17625f));
        RectF rectF = this.f17621b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fM175859d = qa00.m175859d(8.0f) + ((i2 - qa00.m175859d(8.0f)) * (1.0f - this.f17625f));
        canvas.drawRoundRect(this.f17621b, fM175859d, fM175859d, this.f17622c);
        this.f17622c.setStyle(Paint.Style.STROKE);
        this.f17622c.setColor(Color.parseColor("#4cff3a00"));
        this.f17622c.setStrokeWidth(qa00.m175859d(8.0f));
        if (fM95705h < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f17619k * 0.9f, this.f17622c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fM95705h - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f17619k, this.f17622c);
        }
        if (this.f17623d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m30107c(Canvas canvas) {
        boolean z;
        float fM95705h = (a2j0.m95705h() - this.f17624e) / 300.0f;
        if (fM95705h > 1.0f) {
            this.f17625f = 0.0f;
            z = false;
            fM95705h = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fM95705h) * this.f17625f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f17622c.setStyle(Paint.Style.FILL);
        this.f17622c.setColor(getResources().getColor(a9c0.f69025j));
        int i = f17618j;
        int i2 = f17616h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f17621b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fM175859d = qa00.m175859d(8.0f) + ((i2 - qa00.m175859d(8.0f)) * f2);
        canvas.drawRoundRect(this.f17621b, fM175859d, fM175859d, this.f17622c);
        this.f17622c.setStyle(Paint.Style.STROKE);
        this.f17622c.setColor(Color.parseColor("#4cff3a00"));
        this.f17622c.setStrokeWidth(qa00.m175859d(6.0f));
        int i3 = f17619k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f17617i + qa00.m175859d(2.0f)) - i3) * f2), this.f17622c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17621b == null) {
            this.f17621b = new RectF();
        }
        if (this.f17622c == null) {
            this.f17622c = new Paint(1);
        }
        int i = this.f17623d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m30106b(canvas);
        } else if (this.f17620a) {
            m30105a(canvas);
        } else {
            m30107c(canvas);
        }
    }

    public void setState(int i) {
        this.f17623d = i;
        this.f17624e = a2j0.m95705h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f17626g = i;
        invalidate();
    }

    public AccountRecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountRecordButton(Context context) {
        super(context);
        this.f17623d = 1;
        this.f17626g = 1;
    }
}
