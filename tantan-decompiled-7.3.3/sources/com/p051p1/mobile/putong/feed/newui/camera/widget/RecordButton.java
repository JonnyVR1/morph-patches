package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p153l.k9c0;
import p153l.qa00;
import p153l.shc0;

/* JADX INFO: loaded from: classes13.dex */
public class RecordButton extends View {

    /* JADX INFO: renamed from: h */
    public static final int f40649h = qa00.m175859d(30.0f);

    /* JADX INFO: renamed from: i */
    public static final int f40650i = qa00.m175859d(33.0f);

    /* JADX INFO: renamed from: j */
    public static final int f40651j = qa00.m175859d(20.0f);

    /* JADX INFO: renamed from: k */
    public static final int f40652k = qa00.m175859d(57.0f);

    /* JADX INFO: renamed from: a */
    public boolean f40653a;

    /* JADX INFO: renamed from: b */
    public RectF f40654b;

    /* JADX INFO: renamed from: c */
    public Paint f40655c;

    /* JADX INFO: renamed from: d */
    public int f40656d;

    /* JADX INFO: renamed from: e */
    public long f40657e;

    /* JADX INFO: renamed from: f */
    public float f40658f;

    /* JADX INFO: renamed from: g */
    public int f40659g;

    public RecordButton(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40656d = 1;
        this.f40659g = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, shc0.f168652g, i, 0);
        this.f40653a = typedArrayObtainStyledAttributes.getBoolean(shc0.f168654h, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m62881a(Canvas canvas) {
        this.f40655c.setStyle(Paint.Style.STROKE);
        int i = this.f40659g;
        Paint paint = this.f40655c;
        if (i == 2) {
            paint.setColor(Color.parseColor("#383e46"));
        } else {
            paint.setColor(-1);
        }
        this.f40655c.setStrokeWidth(qa00.m175859d(5.0f));
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, f40650i, this.f40655c);
    }

    /* JADX INFO: renamed from: b */
    public final void m62882b(Canvas canvas) {
        float fM95705h = a2j0.m95705h() - this.f40657e;
        float f = fM95705h / 300.0f;
        this.f40658f = f;
        if (f > 1.0f) {
            this.f40658f = 1.0f;
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f40655c.setStyle(Paint.Style.FILL);
        this.f40655c.setColor(getResources().getColor(k9c0.f124521n));
        int i = f40651j;
        int i2 = f40649h;
        float f2 = i + ((i2 - i) * (1.0f - this.f40658f));
        RectF rectF = this.f40654b;
        float f3 = width;
        rectF.left = f3 - f2;
        float f4 = height;
        rectF.top = f4 - f2;
        rectF.right = f3 + f2;
        rectF.bottom = f4 + f2;
        float fM175859d = qa00.m175859d(8.0f) + ((i2 - qa00.m175859d(8.0f)) * (1.0f - this.f40658f));
        canvas.drawRoundRect(this.f40654b, fM175859d, fM175859d, this.f40655c);
        this.f40655c.setStyle(Paint.Style.STROKE);
        this.f40655c.setColor(Color.parseColor("#4cff3a00"));
        this.f40655c.setStrokeWidth(qa00.m175859d(8.0f));
        if (fM95705h < 300.0f) {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, f * f40652k * 0.9f, this.f40655c);
        } else {
            canvas.drawCircle(getWidth() / 2, getWidth() / 2, ((float) ((Math.sin(((double) ((fM95705h - 300.0f) / 3000.0f)) * 3.141592653589793d * 2.0d) * 0.10000002384185791d) + 0.8999999761581421d)) * f40652k, this.f40655c);
        }
        if (this.f40656d == 2) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m62883c(Canvas canvas) {
        boolean z;
        float fM95705h = (a2j0.m95705h() - this.f40657e) / 300.0f;
        if (fM95705h > 1.0f) {
            this.f40658f = 0.0f;
            z = false;
            fM95705h = 1.0f;
        } else {
            z = true;
        }
        float f = (1.0f - fM95705h) * this.f40658f;
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        this.f40655c.setStyle(Paint.Style.FILL);
        this.f40655c.setColor(getResources().getColor(k9c0.f124521n));
        int i = f40651j;
        int i2 = f40649h;
        float f2 = 1.0f - f;
        float f3 = i + ((i2 - i) * f2);
        RectF rectF = this.f40654b;
        float f4 = width;
        rectF.left = f4 - f3;
        float f5 = height;
        rectF.top = f5 - f3;
        rectF.right = f4 + f3;
        rectF.bottom = f5 + f3;
        float fM175859d = qa00.m175859d(8.0f) + ((i2 - qa00.m175859d(8.0f)) * f2);
        canvas.drawRoundRect(this.f40654b, fM175859d, fM175859d, this.f40655c);
        this.f40655c.setStyle(Paint.Style.STROKE);
        this.f40655c.setColor(Color.parseColor("#4cff3a00"));
        this.f40655c.setStrokeWidth(qa00.m175859d(6.0f));
        int i3 = f40652k;
        canvas.drawCircle(getWidth() / 2, getWidth() / 2, i3 + (((f40650i + qa00.m175859d(2.0f)) - i3) * f2), this.f40655c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f40654b == null) {
            this.f40654b = new RectF();
        }
        if (this.f40655c == null) {
            this.f40655c = new Paint(1);
        }
        int i = this.f40656d;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            m62882b(canvas);
        } else if (this.f40653a) {
            m62881a(canvas);
        } else {
            m62883c(canvas);
        }
    }

    public void setState(int i) {
        this.f40656d = i;
        this.f40657e = a2j0.m95705h();
        invalidate();
    }

    public void setThemeType(int i) {
        this.f40659g = i;
        invalidate();
    }

    public RecordButton(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecordButton(Context context) {
        super(context);
        this.f40656d = 1;
        this.f40659g = 1;
    }
}
