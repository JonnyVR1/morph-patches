package com.p000p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import l.e30;
import l.qib0;
import p003l.hmb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class HeartView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f2501a;

    /* JADX INFO: renamed from: b */
    public Paint f2502b;

    /* JADX INFO: renamed from: c */
    public Rect f2503c;

    /* JADX INFO: renamed from: d */
    public Rect f2504d;

    /* JADX INFO: renamed from: e */
    public Rect f2505e;

    /* JADX INFO: renamed from: f */
    public int f2506f;

    /* JADX INFO: renamed from: g */
    public int f2507g;

    /* JADX INFO: renamed from: h */
    public int f2508h;

    /* JADX INFO: renamed from: i */
    public int f2509i;

    /* JADX INFO: renamed from: j */
    public int f2510j;

    /* JADX INFO: renamed from: k */
    public int f2511k;

    /* JADX INFO: renamed from: l */
    public int f2512l;

    /* JADX INFO: renamed from: m */
    public int f2513m;

    /* JADX INFO: renamed from: n */
    public float f2514n;

    /* JADX INFO: renamed from: o */
    public int f2515o;

    /* JADX INFO: renamed from: p */
    public int f2516p;

    /* JADX INFO: renamed from: q */
    public boolean f2517q;

    public HeartView(Context context) {
        this(context, null);
    }

    private Rect getDstRect() {
        int i = this.f2506f;
        int i2 = this.f2512l;
        int i3 = this.f2507g;
        int i4 = this.f2513m;
        return new Rect(((-i) / 2) + i2, ((-i3) / 2) + i4, (i / 2) + i2, (i3 / 2) + i4);
    }

    /* JADX INFO: renamed from: b */
    public void m4943b() {
        Rect rect = this.f2504d;
        if (rect != null) {
            Rect rect2 = this.f2505e;
            float f = rect2.left;
            float f2 = this.f2514n;
            int i = this.f2515o;
            rect.left = (int) (f - (i * f2));
            double d = rect2.top;
            int i2 = this.f2516p;
            rect.top = (int) (d - (((double) (i2 * f2)) * 0.55d));
            rect.right = (int) (rect2.right + (i * f2));
            rect.bottom = (int) (((double) rect2.bottom) + (((double) (f2 * i2)) * 1.45d));
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4944c() {
        m4945d("https://auto.tancdn.com/v1/raw/e6813acd-6384-4cf5-b254-fba2dda3419814.webp");
    }

    /* JADX INFO: renamed from: d */
    public void m4945d(String str) {
        if (this.f2517q) {
            return;
        }
        this.f2517q = true;
        qib0.G.I(str, new e30() { // from class: l.wxk
            public final void call(Object obj) {
                this.f8271a.m4947f((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m4946e(Bitmap bitmap) {
        Paint paint = new Paint();
        this.f2502b = paint;
        paint.setAntiAlias(true);
        this.f2508h = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f2509i = height;
        this.f2506f = this.f2508h / 3;
        this.f2507g = height / 3;
        double d = hmb.m7033s1() ? 1.4d : 1.2d;
        this.f2515o = (int) ((((double) this.f2508h) * d) - ((double) this.f2506f));
        this.f2516p = (int) ((((double) this.f2509i) * d) - ((double) this.f2507g));
        this.f2503c = new Rect(0, 0, this.f2508h, this.f2509i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m4947f(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        this.f2501a = bitmapCopy;
        m4946e(bitmapCopy);
        postInvalidate();
    }

    public float getSize() {
        return this.f2514n;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f2501a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f2501a.recycle();
        this.f2501a = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f2501a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f2503c, this.f2504d, this.f2502b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2510j = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f2511k = measuredHeight;
        this.f2512l = this.f2510j >> 1;
        this.f2513m = measuredHeight >> 1;
        if (this.f2504d == null) {
            this.f2504d = getDstRect();
            Rect rect = this.f2504d;
            this.f2505e = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setPercent(float f) {
        this.f2514n = f;
        m4943b();
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
