package com.p051p1.mobile.putong.core.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.uqb0;
import p153l.vnb;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class HeartView extends View {

    /* JADX INFO: renamed from: a */
    public Bitmap f39407a;

    /* JADX INFO: renamed from: b */
    public Paint f39408b;

    /* JADX INFO: renamed from: c */
    public Rect f39409c;

    /* JADX INFO: renamed from: d */
    public Rect f39410d;

    /* JADX INFO: renamed from: e */
    public Rect f39411e;

    /* JADX INFO: renamed from: f */
    public int f39412f;

    /* JADX INFO: renamed from: g */
    public int f39413g;

    /* JADX INFO: renamed from: h */
    public int f39414h;

    /* JADX INFO: renamed from: i */
    public int f39415i;

    /* JADX INFO: renamed from: j */
    public int f39416j;

    /* JADX INFO: renamed from: k */
    public int f39417k;

    /* JADX INFO: renamed from: l */
    public int f39418l;

    /* JADX INFO: renamed from: m */
    public int f39419m;

    /* JADX INFO: renamed from: n */
    public float f39420n;

    /* JADX INFO: renamed from: o */
    public int f39421o;

    /* JADX INFO: renamed from: p */
    public int f39422p;

    /* JADX INFO: renamed from: q */
    public boolean f39423q;

    public HeartView(Context context) {
        this(context, null);
    }

    private Rect getDstRect() {
        int i = this.f39412f;
        int i2 = this.f39418l;
        int i3 = this.f39413g;
        int i4 = this.f39419m;
        return new Rect(((-i) / 2) + i2, ((-i3) / 2) + i4, (i / 2) + i2, (i3 / 2) + i4);
    }

    /* JADX INFO: renamed from: b */
    public void m60718b() {
        Rect rect = this.f39410d;
        if (rect != null) {
            Rect rect2 = this.f39411e;
            float f = rect2.left;
            float f2 = this.f39420n;
            int i = this.f39421o;
            rect.left = (int) (f - (i * f2));
            double d = rect2.top;
            int i2 = this.f39422p;
            rect.top = (int) (d - (((double) (i2 * f2)) * 0.55d));
            rect.right = (int) (rect2.right + (i * f2));
            rect.bottom = (int) (((double) rect2.bottom) + (((double) (f2 * i2)) * 1.45d));
            invalidate();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m60719c() {
        m60720d("https://auto.tancdn.com/v1/raw/e6813acd-6384-4cf5-b254-fba2dda3419814.webp");
    }

    /* JADX INFO: renamed from: d */
    public void m60720d(String str) {
        if (this.f39423q) {
            return;
        }
        this.f39423q = true;
        uqb0.f180374G.m127108I(str, new y20() { // from class: l.m0l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134321a.m60722f((Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final void m60721e(Bitmap bitmap) {
        Paint paint = new Paint();
        this.f39408b = paint;
        paint.setAntiAlias(true);
        this.f39414h = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f39415i = height;
        this.f39412f = this.f39414h / 3;
        this.f39413g = height / 3;
        double d = vnb.m201959s1() ? 1.4d : 1.2d;
        this.f39421o = (int) ((((double) this.f39414h) * d) - ((double) this.f39412f));
        this.f39422p = (int) ((((double) this.f39415i) * d) - ((double) this.f39413g));
        this.f39409c = new Rect(0, 0, this.f39414h, this.f39415i);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m60722f(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Bitmap bitmapCopy = bitmap.copy(bitmap.getConfig(), false);
        this.f39407a = bitmapCopy;
        m60721e(bitmapCopy);
        postInvalidate();
    }

    public float getSize() {
        return this.f39420n;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f39407a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f39407a.recycle();
        this.f39407a = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap bitmap = this.f39407a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.f39409c, this.f39410d, this.f39408b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f39416j = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f39417k = measuredHeight;
        this.f39418l = this.f39416j >> 1;
        this.f39419m = measuredHeight >> 1;
        if (this.f39410d == null) {
            this.f39410d = getDstRect();
            Rect rect = this.f39410d;
            this.f39411e = new Rect(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    public void setPercent(float f) {
        this.f39420n = f;
        m60718b();
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeartView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
