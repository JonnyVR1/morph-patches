package com.p046p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p149l.e30;
import p149l.hmb;
import p149l.qib0;

/* JADX INFO: loaded from: classes10.dex */
public class HeartView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f38559a;

    /* JADX INFO: renamed from: b */
    public Paint f38560b;

    /* JADX INFO: renamed from: c */
    public Rect f38561c;

    /* JADX INFO: renamed from: d */
    public Rect f38562d;

    /* JADX INFO: renamed from: e */
    public Rect f38563e;

    /* JADX INFO: renamed from: f */
    public int f38564f;

    /* JADX INFO: renamed from: g */
    public int f38565g;

    /* JADX INFO: renamed from: h */
    public int f38566h;

    /* JADX INFO: renamed from: i */
    public int f38567i;

    /* JADX INFO: renamed from: j */
    public int f38568j;

    /* JADX INFO: renamed from: k */
    public int f38569k;

    /* JADX INFO: renamed from: l */
    public int f38570l;

    /* JADX INFO: renamed from: m */
    public int f38571m;

    /* JADX INFO: renamed from: n */
    public float f38572n;

    /* JADX INFO: renamed from: o */
    public int f38573o;

    /* JADX INFO: renamed from: p */
    public int f38574p;

    /* JADX INFO: renamed from: q */
    public boolean f38575q;

    public HeartView(Context context) {
        this(context, null);
    }

    private Rect getDstRect() {
        int i = this.f38564f;
        int i2 = this.f38570l;
        int i3 = this.f38565g;
        int i4 = this.f38571m;
        return new Rect(((-i) / 2) + i2, ((-i3) / 2) + i4, (i / 2) + i2, (i3 / 2) + i4);
    }

    /* JADX INFO: renamed from: b */
    public void m59534b() {
        Rect rect = this.f38562d;
        if (rect != null) {
            Rect rect2 = this.f38563e;
            float f = rect2.left;
            float f2 = this.f38572n;
            int i = this.f38573o;
            rect.left = (int) (f - (i * f2));
            double d = rect2.top;
            int i2 = this.f38574p;
            rect.top = (int) (d - (((double) (i2 * f2)) * 0.55d));
            rect.right = (int) (rect2.right + (i * f2));
            rect.bottom = (int) (((double) rect2.bottom) + (((double) (f2 * i2)) * 1.45d));
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m59535c() {
        m59536d("https://auto.tancdn.com/v1/raw/e6813acd-6384-4cf5-b254-fba2dda3419814.webp");
    }

    /* JADX INFO: renamed from: d */
    public void m59536d(String str) {
        if (this.f38575q) {
            return;
        }
        this.f38575q = true;
        qib0.f154691G.m102324I(str, new e30() { // from class: l.wxk
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188490a.m59538f((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m59537e(Bitmap bitmap) {
        Paint paint = new Paint();
        this.f38560b = paint;
        paint.setAntiAlias(true);
        this.f38566h = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f38567i = height;
        this.f38564f = this.f38566h / 3;
        this.f38565g = height / 3;
        double d = hmb.m131714s1() ? 1.4d : 1.2d;
        this.f38573o = (int) ((((double) this.f38566h) * d) - ((double) this.f38564f));
        this.f38574p = (int) ((((double) this.f38567i) * d) - ((double) this.f38565g));
        this.f38561c = new Rect(0, 0, this.f38566h, this.f38567i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m59538f(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        this.f38559a = bitmapCopy;
        m59537e(bitmapCopy);
        postInvalidate();
    }

    public float getSize() {
        return this.f38572n;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f38559a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f38559a.recycle();
        this.f38559a = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f38559a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f38561c, this.f38562d, this.f38560b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f38568j = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f38569k = measuredHeight;
        this.f38570l = this.f38568j >> 1;
        this.f38571m = measuredHeight >> 1;
        if (this.f38562d == null) {
            this.f38562d = getDstRect();
            Rect rect = this.f38562d;
            this.f38563e = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setPercent(float f) {
        this.f38572n = f;
        m59534b();
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
