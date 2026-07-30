package com.p046p1.mobile.putong.live.base.view;

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
import p149l.t100;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTagView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f44725a;

    /* JADX INFO: renamed from: b */
    public RectF f44726b;

    /* JADX INFO: renamed from: c */
    public int f44727c;

    /* JADX INFO: renamed from: d */
    public int f44728d;

    /* JADX INFO: renamed from: e */
    public int f44729e;

    /* JADX INFO: renamed from: f */
    public int f44730f;

    /* JADX INFO: renamed from: g */
    public int f44731g;

    /* JADX INFO: renamed from: h */
    public int f44732h;

    /* JADX INFO: renamed from: i */
    public int f44733i;

    /* JADX INFO: renamed from: j */
    public int f44734j;

    /* JADX INFO: renamed from: k */
    public int f44735k;

    /* JADX INFO: renamed from: l */
    public int f44736l;

    /* JADX INFO: renamed from: m */
    public int f44737m;

    /* JADX INFO: renamed from: n */
    public float f44738n;

    /* JADX INFO: renamed from: o */
    public float f44739o;

    /* JADX INFO: renamed from: p */
    public float f44740p;

    /* JADX INFO: renamed from: q */
    public boolean f44741q;

    /* JADX INFO: renamed from: r */
    public int f44742r;

    /* JADX INFO: renamed from: s */
    public int f44743s;

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44725a = new Paint();
        this.f44727c = 700;
        this.f44728d = t100.m186890d(2.0f);
        this.f44729e = t100.m186890d(4.0f);
        this.f44730f = t100.m186890d(7.0f);
        this.f44731g = t100.m186890d(9.0f);
        this.f44732h = t100.m186890d(12.0f);
        this.f44733i = t100.m186890d(14.0f);
        this.f44734j = t100.m186890d(2.0f);
        this.f44735k = t100.m186890d(9.0f);
        this.f44736l = t100.m186890d(14.0f);
        this.f44737m = t100.m186890d(1.0f);
        this.f44742r = Color.parseColor("#ff852a");
        this.f44743s = Color.parseColor("#ff3a00");
        m68776a();
        this.f44726b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m68776a() {
        this.f44725a.setColor(-65536);
        this.f44725a.setAntiAlias(true);
        this.f44725a.setDither(true);
        this.f44725a.setStyle(Paint.Style.FILL);
        this.f44725a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f44742r, this.f44743s, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m68777b() {
        this.f44741q = true;
        int width = getWidth() - t100.m186890d(4.0f);
        int iM186890d = t100.m186890d(2.0f);
        this.f44728d = iM186890d;
        int i = width / 6;
        int i2 = iM186890d + i;
        this.f44729e = i2;
        int i3 = width / 4;
        int i4 = i2 + i3;
        this.f44730f = i4;
        int i5 = i4 + i;
        this.f44731g = i5;
        int i6 = i5 + i3;
        this.f44732h = i6;
        this.f44733i = i6 + i;
        this.f44734j = t100.m186890d(2.0f);
        this.f44735k = (int) ((((getHeight() - t100.m186890d(4.0f)) * 7.0f) / 12.0f) + t100.m186890d(2.0f));
        this.f44736l = getHeight() - t100.m186890d(2.0f);
        this.f44737m = width / 12;
        m68776a();
    }

    /* JADX INFO: renamed from: c */
    public void m68778c(int i, int i2) {
        this.f44742r = i;
        this.f44743s = i2;
        m68776a();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f44741q) {
            m68777b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f44727c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f44735k;
        this.f44738n = i2 - ((i2 - this.f44734j) * Math.abs(f));
        int i3 = this.f44734j;
        this.f44739o = i3 + ((this.f44735k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f44735k;
        this.f44740p = i4 - ((i4 - this.f44734j) * Math.abs(f2));
        RectF rectF = this.f44726b;
        rectF.left = this.f44728d;
        rectF.top = this.f44738n;
        rectF.right = this.f44729e;
        rectF.bottom = this.f44736l;
        int i5 = this.f44737m;
        canvas.drawRoundRect(rectF, i5, i5, this.f44725a);
        RectF rectF2 = this.f44726b;
        rectF2.left = this.f44730f;
        rectF2.top = this.f44739o;
        rectF2.right = this.f44731g;
        rectF2.bottom = this.f44736l;
        int i6 = this.f44737m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f44725a);
        RectF rectF3 = this.f44726b;
        rectF3.left = this.f44732h;
        rectF3.top = this.f44740p;
        rectF3.right = this.f44733i;
        rectF3.bottom = this.f44736l;
        int i7 = this.f44737m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f44725a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f44727c = i;
    }

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagView(Context context) {
        this(context, null);
    }
}
