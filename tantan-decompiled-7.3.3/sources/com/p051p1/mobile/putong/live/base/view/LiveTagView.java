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
public class LiveTagView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f45573a;

    /* JADX INFO: renamed from: b */
    public RectF f45574b;

    /* JADX INFO: renamed from: c */
    public int f45575c;

    /* JADX INFO: renamed from: d */
    public int f45576d;

    /* JADX INFO: renamed from: e */
    public int f45577e;

    /* JADX INFO: renamed from: f */
    public int f45578f;

    /* JADX INFO: renamed from: g */
    public int f45579g;

    /* JADX INFO: renamed from: h */
    public int f45580h;

    /* JADX INFO: renamed from: i */
    public int f45581i;

    /* JADX INFO: renamed from: j */
    public int f45582j;

    /* JADX INFO: renamed from: k */
    public int f45583k;

    /* JADX INFO: renamed from: l */
    public int f45584l;

    /* JADX INFO: renamed from: m */
    public int f45585m;

    /* JADX INFO: renamed from: n */
    public float f45586n;

    /* JADX INFO: renamed from: o */
    public float f45587o;

    /* JADX INFO: renamed from: p */
    public float f45588p;

    /* JADX INFO: renamed from: q */
    public boolean f45589q;

    /* JADX INFO: renamed from: r */
    public int f45590r;

    /* JADX INFO: renamed from: s */
    public int f45591s;

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45573a = new Paint();
        this.f45575c = 700;
        this.f45576d = qa00.m175859d(2.0f);
        this.f45577e = qa00.m175859d(4.0f);
        this.f45578f = qa00.m175859d(7.0f);
        this.f45579g = qa00.m175859d(9.0f);
        this.f45580h = qa00.m175859d(12.0f);
        this.f45581i = qa00.m175859d(14.0f);
        this.f45582j = qa00.m175859d(2.0f);
        this.f45583k = qa00.m175859d(9.0f);
        this.f45584l = qa00.m175859d(14.0f);
        this.f45585m = qa00.m175859d(1.0f);
        this.f45590r = Color.parseColor("#ff852a");
        this.f45591s = Color.parseColor("#ff3a00");
        m69959a();
        this.f45574b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m69959a() {
        this.f45573a.setColor(-65536);
        this.f45573a.setAntiAlias(true);
        this.f45573a.setDither(true);
        this.f45573a.setStyle(Paint.Style.FILL);
        this.f45573a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f45590r, this.f45591s, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m69960b() {
        this.f45589q = true;
        int width = getWidth() - qa00.m175859d(4.0f);
        int iM175859d = qa00.m175859d(2.0f);
        this.f45576d = iM175859d;
        int i = width / 6;
        int i2 = iM175859d + i;
        this.f45577e = i2;
        int i3 = width / 4;
        int i4 = i2 + i3;
        this.f45578f = i4;
        int i5 = i4 + i;
        this.f45579g = i5;
        int i6 = i5 + i3;
        this.f45580h = i6;
        this.f45581i = i6 + i;
        this.f45582j = qa00.m175859d(2.0f);
        this.f45583k = (int) ((((getHeight() - qa00.m175859d(4.0f)) * 7.0f) / 12.0f) + qa00.m175859d(2.0f));
        this.f45584l = getHeight() - qa00.m175859d(2.0f);
        this.f45585m = width / 12;
        m69959a();
    }

    /* JADX INFO: renamed from: c */
    public void m69961c(int i, int i2) {
        this.f45590r = i;
        this.f45591s = i2;
        m69959a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f45589q) {
            m69960b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f45575c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f45583k;
        this.f45586n = i2 - ((i2 - this.f45582j) * Math.abs(f));
        int i3 = this.f45582j;
        this.f45587o = i3 + ((this.f45583k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f45583k;
        this.f45588p = i4 - ((i4 - this.f45582j) * Math.abs(f2));
        RectF rectF = this.f45574b;
        rectF.left = this.f45576d;
        rectF.top = this.f45586n;
        rectF.right = this.f45577e;
        rectF.bottom = this.f45584l;
        int i5 = this.f45585m;
        canvas.drawRoundRect(rectF, i5, i5, this.f45573a);
        RectF rectF2 = this.f45574b;
        rectF2.left = this.f45578f;
        rectF2.top = this.f45587o;
        rectF2.right = this.f45579g;
        rectF2.bottom = this.f45584l;
        int i6 = this.f45585m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f45573a);
        RectF rectF3 = this.f45574b;
        rectF3.left = this.f45580h;
        rectF3.top = this.f45588p;
        rectF3.right = this.f45581i;
        rectF3.bottom = this.f45584l;
        int i7 = this.f45585m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f45573a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f45575c = i;
    }

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagView(Context context) {
        this(context, null);
    }
}
