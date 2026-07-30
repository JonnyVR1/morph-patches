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
public class LiveMainlandTagView extends View {

    /* JADX INFO: renamed from: r */
    public static final float f44688r = t100.m186890d(21.0f) * 1.0f;

    /* JADX INFO: renamed from: s */
    public static final float f44689s = t100.m186890d(15.0f) * 1.0f;

    /* JADX INFO: renamed from: a */
    public final Paint f44690a;

    /* JADX INFO: renamed from: b */
    public final RectF f44691b;

    /* JADX INFO: renamed from: c */
    public int f44692c;

    /* JADX INFO: renamed from: d */
    public int f44693d;

    /* JADX INFO: renamed from: e */
    public int f44694e;

    /* JADX INFO: renamed from: f */
    public int f44695f;

    /* JADX INFO: renamed from: g */
    public int f44696g;

    /* JADX INFO: renamed from: h */
    public int f44697h;

    /* JADX INFO: renamed from: i */
    public int f44698i;

    /* JADX INFO: renamed from: j */
    public int f44699j;

    /* JADX INFO: renamed from: k */
    public int f44700k;

    /* JADX INFO: renamed from: l */
    public int f44701l;

    /* JADX INFO: renamed from: m */
    public int f44702m;

    /* JADX INFO: renamed from: n */
    public boolean f44703n;

    /* JADX INFO: renamed from: o */
    public int f44704o;

    /* JADX INFO: renamed from: p */
    public int f44705p;

    /* JADX INFO: renamed from: q */
    public float f44706q;

    public LiveMainlandTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44690a = new Paint();
        this.f44692c = 700;
        this.f44704o = Color.parseColor("#ff852a");
        this.f44705p = Color.parseColor("#ff3a00");
        this.f44706q = 1.0f;
        m68746a();
        this.f44691b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m68746a() {
        this.f44690a.setColor(-65536);
        this.f44690a.setAntiAlias(true);
        this.f44690a.setDither(true);
        this.f44690a.setStyle(Paint.Style.FILL);
        this.f44690a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f44704o, this.f44705p, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m68747b() {
        this.f44703n = true;
        m68746a();
        this.f44693d = (int) (t100.m186890d(4.0f) * this.f44706q);
        this.f44694e = (int) (t100.m186890d(7.0f) * this.f44706q);
        this.f44695f = (int) (t100.m186890d(9.0f) * this.f44706q);
        this.f44696g = (int) (t100.m186890d(12.0f) * this.f44706q);
        this.f44697h = (int) (t100.m186890d(14.0f) * this.f44706q);
        this.f44698i = (int) (t100.m186890d(17.0f) * this.f44706q);
        this.f44699j = (int) (t100.m186890d(4.0f) * this.f44706q);
        this.f44700k = (int) (t100.m186890d(8.0f) * this.f44706q);
        this.f44701l = (int) (t100.m186890d(11.0f) * this.f44706q);
        this.f44702m = (int) (t100.m186890d(1.0f) * this.f44706q);
    }

    /* JADX INFO: renamed from: c */
    public void m68748c(int i, int i2) {
        this.f44704o = i;
        this.f44705p = i2;
        m68746a();
    }

    /* JADX INFO: renamed from: d */
    public void m68749d(int i, int i2) {
        this.f44706q = ((i / f44688r) + (i2 / f44689s)) / 2.0f;
        this.f44693d = (int) (t100.m186890d(4.0f) * this.f44706q);
        this.f44694e = (int) (t100.m186890d(7.0f) * this.f44706q);
        this.f44695f = (int) (t100.m186890d(9.0f) * this.f44706q);
        this.f44696g = (int) (t100.m186890d(12.0f) * this.f44706q);
        this.f44697h = (int) (t100.m186890d(14.0f) * this.f44706q);
        this.f44698i = (int) (t100.m186890d(17.0f) * this.f44706q);
        this.f44699j = (int) (t100.m186890d(4.0f) * this.f44706q);
        this.f44700k = (int) (t100.m186890d(8.0f) * this.f44706q);
        this.f44701l = (int) (t100.m186890d(11.0f) * this.f44706q);
        this.f44702m = (int) (t100.m186890d(1.0f) * this.f44706q);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f44703n) {
            m68747b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f44692c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f44700k;
        float fAbs = i2 - ((i2 - this.f44699j) * Math.abs(f));
        int i3 = this.f44699j;
        float fAbs2 = i3 + ((this.f44700k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f44700k;
        float fAbs3 = i4 - ((i4 - this.f44699j) * Math.abs(f2));
        RectF rectF = this.f44691b;
        rectF.left = this.f44693d;
        rectF.top = fAbs;
        rectF.right = this.f44694e;
        rectF.bottom = this.f44701l;
        int i5 = this.f44702m;
        canvas.drawRoundRect(rectF, i5, i5, this.f44690a);
        RectF rectF2 = this.f44691b;
        rectF2.left = this.f44695f;
        rectF2.top = fAbs2;
        rectF2.right = this.f44696g;
        rectF2.bottom = this.f44701l;
        int i6 = this.f44702m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f44690a);
        RectF rectF3 = this.f44691b;
        rectF3.left = this.f44697h;
        rectF3.top = fAbs3;
        rectF3.right = this.f44698i;
        rectF3.bottom = this.f44701l;
        int i7 = this.f44702m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f44690a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f44692c = i;
    }

    public LiveMainlandTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveMainlandTagView(Context context) {
        this(context, null);
    }
}
