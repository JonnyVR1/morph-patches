package com.p051p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class LiveMainlandTagView extends View {

    /* JADX INFO: renamed from: r */
    public static final float f45536r = qa00.m175859d(21.0f) * 1.0f;

    /* JADX INFO: renamed from: s */
    public static final float f45537s = qa00.m175859d(15.0f) * 1.0f;

    /* JADX INFO: renamed from: a */
    public final Paint f45538a;

    /* JADX INFO: renamed from: b */
    public final RectF f45539b;

    /* JADX INFO: renamed from: c */
    public int f45540c;

    /* JADX INFO: renamed from: d */
    public int f45541d;

    /* JADX INFO: renamed from: e */
    public int f45542e;

    /* JADX INFO: renamed from: f */
    public int f45543f;

    /* JADX INFO: renamed from: g */
    public int f45544g;

    /* JADX INFO: renamed from: h */
    public int f45545h;

    /* JADX INFO: renamed from: i */
    public int f45546i;

    /* JADX INFO: renamed from: j */
    public int f45547j;

    /* JADX INFO: renamed from: k */
    public int f45548k;

    /* JADX INFO: renamed from: l */
    public int f45549l;

    /* JADX INFO: renamed from: m */
    public int f45550m;

    /* JADX INFO: renamed from: n */
    public boolean f45551n;

    /* JADX INFO: renamed from: o */
    public int f45552o;

    /* JADX INFO: renamed from: p */
    public int f45553p;

    /* JADX INFO: renamed from: q */
    public float f45554q;

    public LiveMainlandTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45538a = new Paint();
        this.f45540c = 700;
        this.f45552o = Color.parseColor("#ff852a");
        this.f45553p = Color.parseColor("#ff3a00");
        this.f45554q = 1.0f;
        m69929a();
        this.f45539b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m69929a() {
        this.f45538a.setColor(-65536);
        this.f45538a.setAntiAlias(true);
        this.f45538a.setDither(true);
        this.f45538a.setStyle(Paint.Style.FILL);
        this.f45538a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f45552o, this.f45553p, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m69930b() {
        this.f45551n = true;
        m69929a();
        this.f45541d = (int) (qa00.m175859d(4.0f) * this.f45554q);
        this.f45542e = (int) (qa00.m175859d(7.0f) * this.f45554q);
        this.f45543f = (int) (qa00.m175859d(9.0f) * this.f45554q);
        this.f45544g = (int) (qa00.m175859d(12.0f) * this.f45554q);
        this.f45545h = (int) (qa00.m175859d(14.0f) * this.f45554q);
        this.f45546i = (int) (qa00.m175859d(17.0f) * this.f45554q);
        this.f45547j = (int) (qa00.m175859d(4.0f) * this.f45554q);
        this.f45548k = (int) (qa00.m175859d(8.0f) * this.f45554q);
        this.f45549l = (int) (qa00.m175859d(11.0f) * this.f45554q);
        this.f45550m = (int) (qa00.m175859d(1.0f) * this.f45554q);
    }

    /* JADX INFO: renamed from: c */
    public void m69931c(int i, int i2) {
        this.f45552o = i;
        this.f45553p = i2;
        m69929a();
    }

    /* JADX INFO: renamed from: d */
    public void m69932d(int i, int i2) {
        this.f45554q = ((i / f45536r) + (i2 / f45537s)) / 2.0f;
        this.f45541d = (int) (qa00.m175859d(4.0f) * this.f45554q);
        this.f45542e = (int) (qa00.m175859d(7.0f) * this.f45554q);
        this.f45543f = (int) (qa00.m175859d(9.0f) * this.f45554q);
        this.f45544g = (int) (qa00.m175859d(12.0f) * this.f45554q);
        this.f45545h = (int) (qa00.m175859d(14.0f) * this.f45554q);
        this.f45546i = (int) (qa00.m175859d(17.0f) * this.f45554q);
        this.f45547j = (int) (qa00.m175859d(4.0f) * this.f45554q);
        this.f45548k = (int) (qa00.m175859d(8.0f) * this.f45554q);
        this.f45549l = (int) (qa00.m175859d(11.0f) * this.f45554q);
        this.f45550m = (int) (qa00.m175859d(1.0f) * this.f45554q);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f45551n) {
            m69930b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f45540c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f45548k;
        float fAbs = i2 - ((i2 - this.f45547j) * Math.abs(f));
        int i3 = this.f45547j;
        float fAbs2 = i3 + ((this.f45548k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f45548k;
        float fAbs3 = i4 - ((i4 - this.f45547j) * Math.abs(f2));
        RectF rectF = this.f45539b;
        rectF.left = this.f45541d;
        rectF.top = fAbs;
        rectF.right = this.f45542e;
        rectF.bottom = this.f45549l;
        int i5 = this.f45550m;
        canvas.drawRoundRect(rectF, i5, i5, this.f45538a);
        RectF rectF2 = this.f45539b;
        rectF2.left = this.f45543f;
        rectF2.top = fAbs2;
        rectF2.right = this.f45544g;
        rectF2.bottom = this.f45549l;
        int i6 = this.f45550m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f45538a);
        RectF rectF3 = this.f45539b;
        rectF3.left = this.f45545h;
        rectF3.top = fAbs3;
        rectF3.right = this.f45546i;
        rectF3.bottom = this.f45549l;
        int i7 = this.f45550m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f45538a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f45540c = i;
    }

    public LiveMainlandTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveMainlandTagView(Context context) {
        this(context, null);
    }
}
