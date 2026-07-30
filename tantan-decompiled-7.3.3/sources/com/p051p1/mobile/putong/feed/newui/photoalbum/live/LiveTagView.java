package com.p051p1.mobile.putong.feed.newui.photoalbum.live;

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
    public Paint f42879a;

    /* JADX INFO: renamed from: b */
    public RectF f42880b;

    /* JADX INFO: renamed from: c */
    public int f42881c;

    /* JADX INFO: renamed from: d */
    public int f42882d;

    /* JADX INFO: renamed from: e */
    public int f42883e;

    /* JADX INFO: renamed from: f */
    public int f42884f;

    /* JADX INFO: renamed from: g */
    public int f42885g;

    /* JADX INFO: renamed from: h */
    public int f42886h;

    /* JADX INFO: renamed from: i */
    public int f42887i;

    /* JADX INFO: renamed from: j */
    public int f42888j;

    /* JADX INFO: renamed from: k */
    public int f42889k;

    /* JADX INFO: renamed from: l */
    public int f42890l;

    /* JADX INFO: renamed from: m */
    public int f42891m;

    /* JADX INFO: renamed from: n */
    public float f42892n;

    /* JADX INFO: renamed from: o */
    public float f42893o;

    /* JADX INFO: renamed from: p */
    public float f42894p;

    /* JADX INFO: renamed from: q */
    public boolean f42895q;

    /* JADX INFO: renamed from: r */
    public int f42896r;

    /* JADX INFO: renamed from: s */
    public int f42897s;

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42879a = new Paint();
        this.f42881c = 700;
        this.f42882d = qa00.m175859d(2.0f);
        this.f42883e = qa00.m175859d(4.0f);
        this.f42884f = qa00.m175859d(7.0f);
        this.f42885g = qa00.m175859d(9.0f);
        this.f42886h = qa00.m175859d(12.0f);
        this.f42887i = qa00.m175859d(14.0f);
        this.f42888j = qa00.m175859d(2.0f);
        this.f42889k = qa00.m175859d(9.0f);
        this.f42890l = qa00.m175859d(14.0f);
        this.f42891m = qa00.m175859d(1.0f);
        this.f42896r = Color.parseColor("#ff852a");
        this.f42897s = Color.parseColor("#ff3a00");
        m65981a();
        this.f42880b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m65981a() {
        this.f42879a.setColor(-65536);
        this.f42879a.setAntiAlias(true);
        this.f42879a.setDither(true);
        this.f42879a.setStyle(Paint.Style.FILL);
        this.f42879a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f42896r, this.f42897s, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m65982b() {
        this.f42895q = true;
        int width = getWidth() - qa00.m175859d(4.0f);
        int iM175859d = qa00.m175859d(2.0f);
        this.f42882d = iM175859d;
        int i = width / 6;
        int i2 = iM175859d + i;
        this.f42883e = i2;
        int i3 = width / 4;
        int i4 = i2 + i3;
        this.f42884f = i4;
        int i5 = i4 + i;
        this.f42885g = i5;
        int i6 = i5 + i3;
        this.f42886h = i6;
        this.f42887i = i6 + i;
        this.f42888j = qa00.m175859d(2.0f);
        this.f42889k = (int) ((((getHeight() - qa00.m175859d(4.0f)) * 7.0f) / 12.0f) + qa00.m175859d(2.0f));
        this.f42890l = getHeight() - qa00.m175859d(2.0f);
        this.f42891m = width / 12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f42895q) {
            m65982b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f42881c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f42889k;
        this.f42892n = i2 - ((i2 - this.f42888j) * Math.abs(f));
        int i3 = this.f42888j;
        this.f42893o = i3 + ((this.f42889k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f42889k;
        this.f42894p = i4 - ((i4 - this.f42888j) * Math.abs(f2));
        RectF rectF = this.f42880b;
        rectF.left = this.f42882d;
        rectF.top = this.f42892n;
        rectF.right = this.f42883e;
        rectF.bottom = this.f42890l;
        int i5 = this.f42891m;
        canvas.drawRoundRect(rectF, i5, i5, this.f42879a);
        RectF rectF2 = this.f42880b;
        rectF2.left = this.f42884f;
        rectF2.top = this.f42893o;
        rectF2.right = this.f42885g;
        rectF2.bottom = this.f42890l;
        int i6 = this.f42891m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f42879a);
        RectF rectF3 = this.f42880b;
        rectF3.left = this.f42886h;
        rectF3.top = this.f42894p;
        rectF3.right = this.f42887i;
        rectF3.bottom = this.f42890l;
        int i7 = this.f42891m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f42879a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f42881c = i;
    }

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagView(Context context) {
        this(context, null);
    }
}
