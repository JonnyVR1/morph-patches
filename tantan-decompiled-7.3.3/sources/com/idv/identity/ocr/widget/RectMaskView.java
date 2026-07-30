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
import p153l.ehc0;
import p153l.y9c0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskView extends ImageView {

    /* JADX INFO: renamed from: r */
    private static final Xfermode f13392r = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: a */
    private Bitmap f13393a;

    /* JADX INFO: renamed from: b */
    private Paint f13394b;

    /* JADX INFO: renamed from: c */
    private Paint f13395c;

    /* JADX INFO: renamed from: d */
    private WeakReference<Bitmap> f13396d;

    /* JADX INFO: renamed from: e */
    private float f13397e;

    /* JADX INFO: renamed from: f */
    private float f13398f;

    /* JADX INFO: renamed from: g */
    private float f13399g;

    /* JADX INFO: renamed from: h */
    private float f13400h;

    /* JADX INFO: renamed from: i */
    private boolean f13401i;

    /* JADX INFO: renamed from: j */
    private boolean f13402j;

    /* JADX INFO: renamed from: k */
    private int f13403k;

    /* JADX INFO: renamed from: l */
    private int f13404l;

    /* JADX INFO: renamed from: m */
    private int f13405m;

    /* JADX INFO: renamed from: n */
    private boolean f13406n;

    /* JADX INFO: renamed from: o */
    Paint f13407o;

    /* JADX INFO: renamed from: p */
    float[] f13408p;

    /* JADX INFO: renamed from: q */
    float f13409q;

    public RectMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13397e = -1.0f;
        this.f13398f = -1.0f;
        this.f13399g = -1.0f;
        this.f13400h = -1.0f;
        this.f13401i = false;
        this.f13402j = false;
        this.f13403k = -1;
        this.f13404l = 1;
        this.f13405m = 35;
        this.f13406n = false;
        this.f13407o = new Paint();
        this.f13408p = new float[8];
        this.f13409q = 70.0f;
        m19134f(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: b */
    private void m19131b(Canvas canvas, RectF rectF, Paint paint) {
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
    private void m19132c(Canvas canvas, RectF rectF, Paint paint) {
        canvas.drawArc(m19137i(rectF), 180.0f, 90.0f, false, paint);
        canvas.drawArc(m19139k(rectF), 270.0f, 90.0f, false, paint);
        canvas.drawArc(m19138j(rectF), 0.0f, 90.0f, false, paint);
        canvas.drawArc(m19136h(rectF), 90.0f, 90.0f, false, paint);
    }

    /* JADX INFO: renamed from: d */
    private void m19133d(Canvas canvas, RectF rectF, Paint paint) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        int i = this.f13405m;
        float f5 = f + i;
        float f6 = f2 + i;
        float f7 = f3 - i;
        float f8 = f4 - i;
        float[] fArr = this.f13408p;
        fArr[0] = f5;
        fArr[1] = f6;
        fArr[2] = f7;
        fArr[3] = f6;
        fArr[4] = f6;
        fArr[5] = f8;
        fArr[6] = f7;
        fArr[7] = f8;
        Log.e("drawSegmentedRoundRect", "startX1:" + f5 + "  startY1:" + f6 + "startX2:" + f7 + " startY2:" + f6 + "startX3:" + f6 + " startY3:" + f8 + "startX4:" + f7 + " startY4:" + f8);
        canvas.drawLine(f5, f2, f5 + this.f13409q, f2, paint);
        canvas.drawLine(f, f6, f, f6 + this.f13409q, paint);
        canvas.drawLine(f7 - this.f13409q, f2, f7, f2, paint);
        canvas.drawLine(f3, f6, f3, f6 + this.f13409q, paint);
        canvas.drawLine(f, f8, f, f8 - this.f13409q, paint);
        canvas.drawLine(f5, f4, f5 + this.f13409q, f4, paint);
        canvas.drawLine(f7 - this.f13409q, f4, f7, f4, paint);
        canvas.drawLine(f3, f8, f3, f8 - this.f13409q, paint);
    }

    /* JADX INFO: renamed from: f */
    private void m19134f(Context context, AttributeSet attributeSet, int i) {
        m19135g(context, attributeSet);
        m19140l();
    }

    /* JADX INFO: renamed from: g */
    private void m19135g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ehc0.f94017a);
        if (typedArrayObtainStyledAttributes != null) {
            this.f13397e = typedArrayObtainStyledAttributes.getDimension(ehc0.f94020d, 0.0f);
            this.f13398f = typedArrayObtainStyledAttributes.getDimension(ehc0.f94021e, 0.0f);
            this.f13399g = typedArrayObtainStyledAttributes.getDimension(ehc0.f94023g, 0.0f);
            this.f13400h = typedArrayObtainStyledAttributes.getDimension(ehc0.f94019c, 0.0f);
            this.f13401i = typedArrayObtainStyledAttributes.getBoolean(ehc0.f94018b, false);
            this.f13402j = typedArrayObtainStyledAttributes.getBoolean(ehc0.f94022f, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    private RectF m19136h(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.bottom;
        int i = this.f13405m;
        return new RectF(f, f2 - (i * 2), (i * 2) + f, f2);
    }

    /* JADX INFO: renamed from: i */
    private RectF m19137i(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        int i = this.f13405m;
        return new RectF(f, f2, (i * 2) + f, (i * 2) + f2);
    }

    /* JADX INFO: renamed from: j */
    private RectF m19138j(RectF rectF) {
        float f = rectF.right;
        int i = this.f13405m;
        float f2 = rectF.bottom;
        return new RectF(f - (i * 2), f2 - (i * 2), f, f2);
    }

    /* JADX INFO: renamed from: k */
    private RectF m19139k(RectF rectF) {
        float f = rectF.right;
        int i = this.f13405m;
        float f2 = rectF.top;
        return new RectF(f - (i * 2), f2, f, (i * 2) + f2);
    }

    /* JADX INFO: renamed from: l */
    private void m19140l() {
        this.f13394b = new Paint(1);
        Paint paint = new Paint(1);
        this.f13395c = paint;
        paint.setColor(getResources().getColor(y9c0.f198085j));
    }

    /* JADX INFO: renamed from: a */
    public Bitmap m19141a() {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint(1);
            paint.setAntiAlias(true);
            paint.setColor(-1);
            float width = getWidth();
            float height = getHeight();
            float f = this.f13397e;
            if (f <= -1.0f) {
                f = 0.0f;
            }
            if (this.f13401i) {
                f = (width / 2.0f) - (this.f13399g / 2.0f);
                if (f < 0.0f) {
                    f = 0.0f;
                }
                this.f13397e = f;
            }
            float f2 = (height - width) / 2.0f;
            float f3 = this.f13398f;
            if (f3 > -1.0f) {
                f2 = f3;
            }
            if (this.f13402j) {
                float f4 = (height / 2.0f) - (this.f13400h / 2.0f);
                float f5 = f4 >= 0.0f ? f4 : 0.0f;
                this.f13398f = f5;
                f2 = f5;
            }
            float f6 = this.f13399g;
            float f7 = f6 > -1.0f ? f6 + f : width;
            float f8 = width + f2;
            float f9 = this.f13400h;
            if (f9 > -1.0f) {
                f8 = f2 + f9;
            }
            RectF rectF = new RectF(f, f2, f7, f8);
            int i = this.f13405m;
            canvas.drawRoundRect(rectF, i, i, paint);
            return bitmapCreateBitmap;
        } catch (OutOfMemoryError unused) {
            System.gc();
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public Path m19142e() {
        Path path = new Path();
        float width = getWidth();
        float height = getHeight();
        float f = this.f13397e;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f13401i) {
            f = (width / 2.0f) - (this.f13399g / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.f13397e = f;
        }
        float f2 = (height - width) / 2.0f;
        float f3 = this.f13398f;
        if (f3 > -1.0f) {
            f2 = f3;
        }
        if (this.f13402j) {
            float f4 = (height / 2.0f) - (this.f13400h / 2.0f);
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            this.f13398f = f5;
            f2 = f5;
        }
        float f6 = this.f13399g;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f13400h;
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
        return this.f13406n;
    }

    public int getRectColor() {
        return this.f13403k;
    }

    public float getRectHeigth() {
        return this.f13400h;
    }

    public float getRectLeft() {
        return this.f13397e;
    }

    public float[] getRectPoints() {
        return this.f13408p;
    }

    public int getRectRoundCx() {
        return this.f13405m;
    }

    public float getRectTop() {
        return this.f13398f;
    }

    public float getRectWidth() {
        return this.f13399g;
    }

    public int getStrokeWidth() {
        return this.f13404l;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f13396d = null;
        Bitmap bitmap = this.f13393a;
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
            WeakReference<Bitmap> weakReference = this.f13396d;
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
                    this.f13394b.reset();
                    this.f13394b.setFilterBitmap(false);
                    this.f13394b.setXfermode(f13392r);
                    if (this.f13406n) {
                        canvas2.clipPath(m19142e());
                        canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f13394b);
                    } else {
                        Bitmap bitmap = this.f13393a;
                        if (bitmap == null || bitmap.isRecycled()) {
                            this.f13393a = m19141a();
                        }
                        canvas2.drawBitmap(this.f13393a, 0.0f, 0.0f, this.f13394b);
                    }
                    this.f13396d = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f13394b.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f13394b);
                float f2 = this.f13398f;
                if (f2 < 0.0f) {
                    f2 = 0.0f;
                }
                float f3 = this.f13397e;
                if (f3 >= 0.0f) {
                    f = f3;
                }
                float f4 = this.f13399g;
                float f5 = this.f13400h;
                this.f13394b.clearShadowLayer();
                RectF rectF = new RectF(f, f2, f4 + f, f5 + f2);
                this.f13395c.setColor(this.f13403k);
                this.f13395c.setStrokeWidth(this.f13404l);
                this.f13395c.setStyle(Paint.Style.STROKE);
                this.f13395c.setAntiAlias(true);
                boolean z = this.f13406n;
                Paint paint = this.f13395c;
                if (z) {
                    m19131b(canvas, rectF, paint);
                } else {
                    m19132c(canvas, rectF, paint);
                    m19133d(canvas, rectF, this.f13395c);
                }
            }
        } catch (Exception unused2) {
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public void setDrawTrapezoid(boolean z) {
        this.f13406n = z;
        postInvalidate();
    }

    public void setRectColor(int i) {
        this.f13403k = i;
    }

    public void setRectHeight(int i) {
        this.f13400h = i;
    }

    public void setRectLeft(float f) {
        this.f13397e = f;
    }

    public void setRectRoundCx(int i) {
        this.f13405m = i;
    }

    public void setRectTop(int i) {
        this.f13398f = i;
    }

    public void setRectWidth(int i) {
        this.f13399g = i;
    }

    public void setStrokeWidth(int i) {
        this.f13404l = i;
    }

    public RectMaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RectMaskView(Context context) {
        this(context, null);
    }
}
