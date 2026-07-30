package com.p000p1.mobile.putong.feed.newui.photoalbum.live;

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
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LiveTagView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f3492a;

    /* JADX INFO: renamed from: b */
    public RectF f3493b;

    /* JADX INFO: renamed from: c */
    public int f3494c;

    /* JADX INFO: renamed from: d */
    public int f3495d;

    /* JADX INFO: renamed from: e */
    public int f3496e;

    /* JADX INFO: renamed from: f */
    public int f3497f;

    /* JADX INFO: renamed from: g */
    public int f3498g;

    /* JADX INFO: renamed from: h */
    public int f3499h;

    /* JADX INFO: renamed from: i */
    public int f3500i;

    /* JADX INFO: renamed from: j */
    public int f3501j;

    /* JADX INFO: renamed from: k */
    public int f3502k;

    /* JADX INFO: renamed from: l */
    public int f3503l;

    /* JADX INFO: renamed from: m */
    public int f3504m;

    /* JADX INFO: renamed from: n */
    public float f3505n;

    /* JADX INFO: renamed from: o */
    public float f3506o;

    /* JADX INFO: renamed from: p */
    public float f3507p;

    /* JADX INFO: renamed from: q */
    public boolean f3508q;

    /* JADX INFO: renamed from: r */
    public int f3509r;

    /* JADX INFO: renamed from: s */
    public int f3510s;

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3492a = new Paint();
        this.f3494c = 700;
        this.f3495d = t100.d(2.0f);
        this.f3496e = t100.d(4.0f);
        this.f3497f = t100.d(7.0f);
        this.f3498g = t100.d(9.0f);
        this.f3499h = t100.d(12.0f);
        this.f3500i = t100.d(14.0f);
        this.f3501j = t100.d(2.0f);
        this.f3502k = t100.d(9.0f);
        this.f3503l = t100.d(14.0f);
        this.f3504m = t100.d(1.0f);
        this.f3509r = Color.parseColor("#ff852a");
        this.f3510s = Color.parseColor("#ff3a00");
        m5895a();
        this.f3493b = new RectF();
    }

    /* JADX INFO: renamed from: a */
    public final void m5895a() {
        this.f3492a.setColor(-65536);
        this.f3492a.setAntiAlias(true);
        this.f3492a.setDither(true);
        this.f3492a.setStyle(Paint.Style.FILL);
        this.f3492a.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getHeight(), this.f3509r, this.f3510s, Shader.TileMode.CLAMP));
    }

    /* JADX INFO: renamed from: b */
    public final void m5896b() {
        this.f3508q = true;
        int width = getWidth() - t100.d(4.0f);
        int iD = t100.d(2.0f);
        this.f3495d = iD;
        int i = width / 6;
        int i2 = iD + i;
        this.f3496e = i2;
        int i3 = width / 4;
        int i4 = i2 + i3;
        this.f3497f = i4;
        int i5 = i4 + i;
        this.f3498g = i5;
        int i6 = i5 + i3;
        this.f3499h = i6;
        this.f3500i = i6 + i;
        this.f3501j = t100.d(2.0f);
        this.f3502k = (int) ((((getHeight() - t100.d(4.0f)) * 7.0f) / 12.0f) + t100.d(2.0f));
        this.f3503l = getHeight() - t100.d(2.0f);
        this.f3504m = width / 12;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() != 0 && !this.f3508q) {
            m5896b();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = this.f3494c;
        float f = (((jCurrentTimeMillis % ((long) i)) / i) - 0.5f) * 2.0f;
        int i2 = this.f3502k;
        this.f3505n = i2 - ((i2 - this.f3501j) * Math.abs(f));
        int i3 = this.f3501j;
        this.f3506o = i3 + ((this.f3502k - i3) * Math.abs(f));
        float f2 = f + 0.5f;
        if (f2 > 1.0f) {
            f2 -= 2.0f;
        }
        int i4 = this.f3502k;
        this.f3507p = i4 - ((i4 - this.f3501j) * Math.abs(f2));
        RectF rectF = this.f3493b;
        rectF.left = this.f3495d;
        rectF.top = this.f3505n;
        rectF.right = this.f3496e;
        rectF.bottom = this.f3503l;
        int i5 = this.f3504m;
        canvas.drawRoundRect(rectF, i5, i5, this.f3492a);
        RectF rectF2 = this.f3493b;
        rectF2.left = this.f3497f;
        rectF2.top = this.f3506o;
        rectF2.right = this.f3498g;
        rectF2.bottom = this.f3503l;
        int i6 = this.f3504m;
        canvas.drawRoundRect(rectF2, i6, i6, this.f3492a);
        RectF rectF3 = this.f3493b;
        rectF3.left = this.f3499h;
        rectF3.top = this.f3507p;
        rectF3.right = this.f3500i;
        rectF3.bottom = this.f3503l;
        int i7 = this.f3504m;
        canvas.drawRoundRect(rectF3, i7, i7, this.f3492a);
        postInvalidate();
    }

    public void setLoopTime(int i) {
        this.f3494c = i;
    }

    public LiveTagView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTagView(Context context) {
        this(context, null);
    }
}
