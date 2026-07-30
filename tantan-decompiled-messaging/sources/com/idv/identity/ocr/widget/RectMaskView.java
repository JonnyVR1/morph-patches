package com.idv.identity.ocr.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import p149l.r1c0;
import p149l.y8c0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskView extends ImageView {

    /* JADX INFO: renamed from: r */
    private static final Xfermode f12651r = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: a */
    private Bitmap f12652a;

    /* JADX INFO: renamed from: b */
    private Paint f12653b;

    /* JADX INFO: renamed from: c */
    private Paint f12654c;

    /* JADX INFO: renamed from: d */
    private WeakReference<Bitmap> f12655d;

    /* JADX INFO: renamed from: e */
    private float f12656e;

    /* JADX INFO: renamed from: f */
    private float f12657f;

    /* JADX INFO: renamed from: g */
    private float f12658g;

    /* JADX INFO: renamed from: h */
    private float f12659h;

    /* JADX INFO: renamed from: i */
    private boolean f12660i;

    /* JADX INFO: renamed from: j */
    private boolean f12661j;

    /* JADX INFO: renamed from: k */
    private int f12662k;

    /* JADX INFO: renamed from: l */
    private int f12663l;

    /* JADX INFO: renamed from: m */
    private int f12664m;

    /* JADX INFO: renamed from: n */
    private boolean f12665n;

    /* JADX INFO: renamed from: o */
    Paint f12666o;

    /* JADX INFO: renamed from: p */
    float[] f12667p;

    /* JADX INFO: renamed from: q */
    float f12668q;

    public RectMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12656e = -1.0f;
        this.f12657f = -1.0f;
        this.f12658g = -1.0f;
        this.f12659h = -1.0f;
        this.f12660i = false;
        this.f12661j = false;
        this.f12662k = -1;
        this.f12663l = 1;
        this.f12664m = 35;
        this.f12665n = false;
        this.f12666o = new Paint();
        this.f12667p = new float[8];
        this.f12668q = 70.0f;
        m18057f(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: b */
    private void m18054b(Canvas canvas, RectF rectF, Paint paint) {
        Path path = new Path();
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        path.moveTo(f + 100.0f, f2 + 150.0f);
        path.lineTo(f3 - 100.0f, f2 + 150.0f);
        path.lineTo(f3, f4);
        path.lineTo(f, f4);
        path.close();
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: c */
    private void m18055c(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawArc(m18060i(rectF), 180.0f, 90.0f, false, paint);
        canvas.drawArc(m18062k(rectF), 270.0f, 90.0f, false, paint);
        canvas.drawArc(m18061j(rectF), 0.0f, 90.0f, false, paint);
        canvas.drawArc(m18059h(rectF), 90.0f, 90.0f, false, paint);
    }

    /* JADX INFO: renamed from: d */
    private void m18056d(Canvas canvas, RectF rectF, Paint paint) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        int i = this.f12664m;
        float f5 = f + i;
        float f6 = f2 + i;
        float f7 = f3 - i;
        float f8 = f4 - i;
        float[] fArr = this.f12667p;
        fArr[0] = f5;
        fArr[1] = f6;
        fArr[2] = f7;
        fArr[3] = f6;
        fArr[4] = f6;
        fArr[5] = f8;
        fArr[6] = f7;
        fArr[7] = f8;
        Log.e("drawSegmentedRoundRect", "startX1:" + f5 + "  startY1:" + f6 + "startX2:" + f7 + " startY2:" + f6 + "startX3:" + f6 + " startY3:" + f8 + "startX4:" + f7 + " startY4:" + f8);
        canvas.drawLine(f5, f2, f5 + this.f12668q, f2, paint);
        canvas.drawLine(f, f6, f, f6 + this.f12668q, paint);
        canvas.drawLine(f7 - this.f12668q, f2, f7, f2, paint);
        canvas.drawLine(f3, f6, f3, f6 + this.f12668q, paint);
        canvas.drawLine(f, f8, f, f8 - this.f12668q, paint);
        canvas.drawLine(f5, f4, f5 + this.f12668q, f4, paint);
        canvas.drawLine(f7 - this.f12668q, f4, f7, f4, paint);
        canvas.drawLine(f3, f8, f3, f8 - this.f12668q, paint);
    }

    /* JADX INFO: renamed from: f */
    private void m18057f(Context context, AttributeSet attributeSet, int i) {
        m18058g(context, attributeSet);
        m18063l();
    }

    /* JADX INFO: renamed from: g */
    private void m18058g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y8c0.f196795a);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12656e = typedArrayObtainStyledAttributes.getDimension(y8c0.f196798d, 0.0f);
            this.f12657f = typedArrayObtainStyledAttributes.getDimension(y8c0.f196799e, 0.0f);
            this.f12658g = typedArrayObtainStyledAttributes.getDimension(y8c0.f196801g, 0.0f);
            this.f12659h = typedArrayObtainStyledAttributes.getDimension(y8c0.f196797c, 0.0f);
            this.f12660i = typedArrayObtainStyledAttributes.getBoolean(y8c0.f196796b, false);
            this.f12661j = typedArrayObtainStyledAttributes.getBoolean(y8c0.f196800f, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    private RectF m18059h(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.bottom;
        int i = this.f12664m;
        return new RectF(f, f2 - (i * 2), (i * 2) + f, f2);
    }

    /* JADX INFO: renamed from: i */
    private RectF m18060i(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        int i = this.f12664m;
        return new RectF(f, f2, (i * 2) + f, (i * 2) + f2);
    }

    /* JADX INFO: renamed from: j */
    private RectF m18061j(RectF rectF) {
        float f = rectF.right;
        int i = this.f12664m;
        float f2 = rectF.bottom;
        return new RectF(f - (i * 2), f2 - (i * 2), f, f2);
    }

    /* JADX INFO: renamed from: k */
    private RectF m18062k(RectF rectF) {
        float f = rectF.right;
        int i = this.f12664m;
        float f2 = rectF.top;
        return new RectF(f - (i * 2), f2, f, (i * 2) + f2);
    }

    /* JADX INFO: renamed from: l */
    private void m18063l() {
        this.f12653b = new Paint(1);
        Paint paint = new Paint(1);
        this.f12654c = paint;
        paint.setColor(getResources().getColor(r1c0.f157270j));
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m18064a() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setAntiAlias(true);
            paint.setColor(-1);
            float width = getWidth();
            float height = getHeight();
            float f = this.f12656e;
            if (f <= -1.0f) {
                f = 0.0f;
            }
            if (this.f12660i) {
                f = (width / 2.0f) - (this.f12658g / 2.0f);
                if (f < 0.0f) {
                    f = 0.0f;
                }
                this.f12656e = f;
            }
            float f2 = (height - width) / 2.0f;
            float f3 = this.f12657f;
            if (f3 > -1.0f) {
                f2 = f3;
            }
            if (this.f12661j) {
                float f4 = (height / 2.0f) - (this.f12659h / 2.0f);
                float f5 = f4 >= 0.0f ? f4 : 0.0f;
                this.f12657f = f5;
                f2 = f5;
            }
            float f6 = this.f12658g;
            float f7 = f6 > -1.0f ? f6 + f : width;
            float f8 = width + f2;
            float f9 = this.f12659h;
            if (f9 > -1.0f) {
                f8 = f2 + f9;
            }
            RectF rectF = new RectF(f, f2, f7, f8);
            int i = this.f12664m;
            canvas.drawRoundRect(rectF, i, i, paint);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public Path m18065e() {
        Path path = new Path();
        float width = getWidth();
        float height = getHeight();
        float f = this.f12656e;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f12660i) {
            f = (width / 2.0f) - (this.f12658g / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.f12656e = f;
        }
        float f2 = (height - width) / 2.0f;
        float f3 = this.f12657f;
        if (f3 > -1.0f) {
            f2 = f3;
        }
        if (this.f12661j) {
            float f4 = (height / 2.0f) - (this.f12659h / 2.0f);
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            this.f12657f = f5;
            f2 = f5;
        }
        float f6 = this.f12658g;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f12659h;
        if (f9 > -1.0f) {
            f8 = f2 + f9;
        }
        float f10 = f2 + 150.0f;
        path.moveTo(f + 100.0f, f10);
        path.lineTo(f7 - 100.0f, f10);
        path.lineTo(f7, f8);
        path.lineTo(f, f8);
        path.close();
        return path;
    }

    public boolean getDrawTrapezoid() {
        return this.f12665n;
    }

    public int getRectColor() {
        return this.f12662k;
    }

    public float getRectHeigth() {
        return this.f12659h;
    }

    public float getRectLeft() {
        return this.f12656e;
    }

    public float[] getRectPoints() {
        return this.f12667p;
    }

    public int getRectRoundCx() {
        return this.f12664m;
    }

    public float getRectTop() {
        return this.f12657f;
    }

    public float getRectWidth() {
        return this.f12658g;
    }

    public int getStrokeWidth() {
        return this.f12663l;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12655d = null;
        Bitmap bitmap = this.f12652a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        super.invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        try {
            WeakReference<Bitmap> weakReference = this.f12655d;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            float f = 0.0f;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    if (bitmapCreateBitmap == null) {
                        return;
                    }
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    this.f12653b.reset();
                    this.f12653b.setFilterBitmap(false);
                    this.f12653b.setXfermode(f12651r);
                    if (this.f12665n) {
                        canvas2.clipPath(m18065e());
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f12653b);
                    } else {
                        Bitmap bitmap = this.f12652a;
                        if (bitmap == null || bitmap.isRecycled()) {
                            this.f12652a = m18064a();
                        }
                        canvas2.drawBitmap(this.f12652a, 0.0f, 0.0f, this.f12653b);
                    }
                    this.f12655d = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f12653b.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12653b);
                float f2 = this.f12657f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = this.f12656e;
                if (f3 >= 0.0f) {
                    f = f3;
                }
                float f4 = this.f12658g;
                float f5 = this.f12659h;
                this.f12653b.clearShadowLayer();
                RectF rectF = new RectF(f, f2, f4 + f, f5 + f2);
                this.f12654c.setColor(this.f12662k);
                this.f12654c.setStrokeWidth(this.f12663l);
                this.f12654c.setStyle(Paint.Style.STROKE);
                this.f12654c.setAntiAlias(true);
                boolean z = this.f12665n;
                Paint paint = this.f12654c;
                if (z) {
                    m18054b(canvas, rectF, paint);
                } else {
                    m18055c(canvas, rectF, paint);
                    m18056d(canvas, rectF, this.f12654c);
                }
            }
        } catch (Exception unused2) {
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public void setDrawTrapezoid(boolean z) {
        this.f12665n = z;
        postInvalidate();
    }

    public void setRectColor(int i) {
        this.f12662k = i;
    }

    public void setRectHeight(int i) {
        this.f12659h = i;
    }

    public void setRectLeft(float f) {
        this.f12656e = f;
    }

    public void setRectRoundCx(int i) {
        this.f12664m = i;
    }

    public void setRectTop(int i) {
        this.f12657f = i;
    }

    public void setRectWidth(int i) {
        this.f12658g = i;
    }

    public void setStrokeWidth(int i) {
        this.f12663l = i;
    }

    public RectMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectMaskView(Context context) {
        this(context, null);
    }
}
