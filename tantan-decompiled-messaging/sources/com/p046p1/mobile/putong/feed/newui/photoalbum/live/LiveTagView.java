package com.p046p1.mobile.putong.feed.newui.photoalbum.live;

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

/* JADX INFO: loaded from: classes12.dex */
public class LiveTagView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f42031a;

    /* JADX INFO: renamed from: b */
    public RectF f42032b;

    /* JADX INFO: renamed from: c */
    public int f42033c;

    /* JADX INFO: renamed from: d */
    public int f42034d;

    /* JADX INFO: renamed from: e */
    public int f42035e;

    /* JADX INFO: renamed from: f */
    public int f42036f;

    /* JADX INFO: renamed from: g */
    public int f42037g;

    /* JADX INFO: renamed from: h */
    public int f42038h;

    /* JADX INFO: renamed from: i */
    public int f42039i;

    /* JADX INFO: renamed from: j */
    public int f42040j;

    /* JADX INFO: renamed from: k */
    public int f42041k;

    /* JADX INFO: renamed from: l */
    public int f42042l;

    /* JADX INFO: renamed from: m */
    public int f42043m;

    /* JADX INFO: renamed from: n */
    public float f42044n;

    /* JADX INFO: renamed from: o */
    public float f42045o;

    /* JADX INFO: renamed from: p */
    public float f42046p;

    /* JADX INFO: renamed from: q */
    public boolean f42047q;

    /* JADX INFO: renamed from: r */
    public int f42048r;

    /* JADX INFO: renamed from: s */
    public int f42049s;

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42031a = new Paint();
        this.f42033c = 700;
        this.f42034d = t100.m186890d(2.0f);
        this.f42035e = t100.m186890d(4.0f);
        this.f42036f = t100.m186890d(7.0f);
        this.f42037g = t100.m186890d(9.0f);
        this.f42038h = t100.m186890d(12.0f);
        this.f42039i = t100.m186890d(14.0f);
        this.f42040j = t100.m186890d(2.0f);
        this.f42041k = t100.m186890d(9.0f);
        this.f42042l = t100.m186890d(14.0f);
        this.f42043m = t100.m186890d(1.0f);
        this.f42048r = Color.parseColor("#ff852a");
        this.f42049s = Color.parseColor("#ff3a00");
        m64798a();
        this.f42032b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m64798a() {
        this.f42031a.setColor(-65536);
        this.f42031a.setAntiAlias(true);
        this.f42031a.setDither(true);
        this.f42031a.setStyle(Paint.Style.FILL);
        this.f42031a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f42048r, this.f42049s, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m64799b() {
        this.f42047q = true;
        int width = getWidth() - t100.m186890d(4.0f);
        int iM186890d = t100.m186890d(2.0f);
        this.f42034d = iM186890d;
        int i = width / 6;
        int i2 = iM186890d + i;
        this.f42035e = i2;
        int i3 = width / 4;
        int i4 = i2 + i3;
        this.f42036f = i4;
        int i5 = i4 + i;
        this.f42037g = i5;
        int i6 = i5 + i3;
        this.f42038h = i6;
        this.f42039i = i6 + i;
        this.f42040j = t100.m186890d(2.0f);
        this.f42041k = (int) ((((getHeight() - t100.m186890d(4.0f)) * 7.0f) / 12.0f) + t100.m186890d(2.0f));
        this.f42042l = getHeight() - t100.m186890d(2.0f);
        this.f42043m = width / 12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f42047q) {
            m64799b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f42033c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f42041k;
        this.f42044n = i2 - ((i2 - this.f42040j) * Math.abs(f));
        int i3 = this.f42040j;
        this.f42045o = i3 + ((this.f42041k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f42041k;
        this.f42046p = i4 - ((i4 - this.f42040j) * Math.abs(f2));
        RectF rectF = this.f42032b;
        rectF.left = this.f42034d;
        rectF.top = this.f42044n;
        rectF.right = this.f42035e;
        rectF.bottom = this.f42042l;
        int i5 = this.f42043m;
        canvas.drawRoundRect(rectF, i5, i5, this.f42031a);
        RectF rectF2 = this.f42032b;
        rectF2.left = this.f42036f;
        rectF2.top = this.f42045o;
        rectF2.right = this.f42037g;
        rectF2.bottom = this.f42042l;
        int i6 = this.f42043m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f42031a);
        RectF rectF3 = this.f42032b;
        rectF3.left = this.f42038h;
        rectF3.top = this.f42046p;
        rectF3.right = this.f42039i;
        rectF3.bottom = this.f42042l;
        int i7 = this.f42043m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f42031a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f42033c = i;
    }

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagView(Context context) {
        this(context, null);
    }
}
