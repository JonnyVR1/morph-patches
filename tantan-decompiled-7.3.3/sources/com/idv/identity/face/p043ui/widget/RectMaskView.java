package com.idv.identity.face.p043ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.lang.ref.WeakReference;
import p153l.dhc0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskView extends AppCompatImageView {

    /* JADX INFO: renamed from: p */
    private static final Xfermode f12977p = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: c */
    private Bitmap f12978c;

    /* JADX INFO: renamed from: d */
    private Paint f12979d;

    /* JADX INFO: renamed from: e */
    private Paint f12980e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Bitmap> f12981f;

    /* JADX INFO: renamed from: g */
    private float f12982g;

    /* JADX INFO: renamed from: h */
    private float f12983h;

    /* JADX INFO: renamed from: i */
    private float f12984i;

    /* JADX INFO: renamed from: j */
    private float f12985j;

    /* JADX INFO: renamed from: k */
    private boolean f12986k;

    /* JADX INFO: renamed from: l */
    private boolean f12987l;

    /* JADX INFO: renamed from: m */
    private int f12988m;

    /* JADX INFO: renamed from: n */
    private int f12989n;

    /* JADX INFO: renamed from: o */
    private int f12990o;

    public RectMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12982g = -1.0f;
        this.f12983h = -1.0f;
        this.f12984i = -1.0f;
        this.f12985j = -1.0f;
        this.f12986k = false;
        this.f12987l = false;
        this.f12988m = -1;
        this.f12989n = 5;
        this.f12990o = 35;
        m18797f(context, attributeSet);
        m18798g();
    }

    /* JADX INFO: renamed from: f */
    private void m18797f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dhc0.f88479y);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12982g = typedArrayObtainStyledAttributes.getDimension(dhc0.f88434B, 0.0f);
            this.f12983h = typedArrayObtainStyledAttributes.getDimension(dhc0.f88436D, 0.0f);
            this.f12984i = typedArrayObtainStyledAttributes.getDimension(dhc0.f88438F, 0.0f);
            this.f12985j = typedArrayObtainStyledAttributes.getDimension(dhc0.f88433A, 0.0f);
            this.f12986k = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88480z, false);
            this.f12987l = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88437E, false);
            this.f12990o = (int) typedArrayObtainStyledAttributes.getDimension(dhc0.f88435C, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m18798g() {
        this.f12979d = new Paint(1);
        this.f12980e = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public Bitmap m18799d() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float width = getWidth();
        float height = getHeight();
        if (this.f12984i < 0.0f) {
            this.f12984i = width;
        }
        if (this.f12985j < 0.0f) {
            this.f12985j = height;
        }
        float f = this.f12982g;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f12986k) {
            f = (width / 2.0f) - (this.f12984i / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.f12982g = f;
        }
        float f2 = (height - width) / 2.0f;
        float f3 = this.f12983h;
        if (f3 > -1.0f) {
            f2 = f3;
        }
        if (this.f12987l) {
            float f4 = (height / 2.0f) - (this.f12985j / 2.0f);
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            this.f12983h = f5;
            f2 = f5;
        }
        float f6 = this.f12984i;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f12985j;
        if (f9 > -1.0f) {
            f8 = f2 + f9;
        }
        RectF rectF = new RectF(f, f2, f7, f8);
        int i = this.f12990o;
        canvas.drawRoundRect(rectF, i, i, paint);
        return bitmapCreateBitmap;
    }

    public int getRectColor() {
        return this.f12988m;
    }

    public float getRectHeigth() {
        return this.f12985j;
    }

    public float getRectLeft() {
        return this.f12982g;
    }

    public int getRectRoundCx() {
        return this.f12990o;
    }

    public float getRectTop() {
        return this.f12983h;
    }

    public float getRectWidth() {
        return this.f12984i;
    }

    public int getStrokeWidth() {
        return this.f12989n;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12981f = null;
        Bitmap bitmap = this.f12978c;
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
            WeakReference<Bitmap> weakReference = this.f12981f;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            float f = 0.0f;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f12978c;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f12978c = m18799d();
                    }
                    this.f12979d.reset();
                    this.f12979d.setFilterBitmap(false);
                    this.f12979d.setXfermode(f12977p);
                    canvas2.drawBitmap(this.f12978c, 0.0f, 0.0f, this.f12979d);
                    this.f12981f = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f12979d.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12979d);
                if (-1 != this.f12988m) {
                    float f2 = this.f12983h;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = this.f12982g;
                    if (f3 >= 0.0f) {
                        f = f3;
                    }
                    RectF rectF = new RectF(f, f2, this.f12984i + f, this.f12985j + f2);
                    this.f12980e.setColor(this.f12988m);
                    this.f12980e.setStrokeWidth(this.f12989n);
                    this.f12980e.setStyle(Paint.Style.STROKE);
                    int i = this.f12990o;
                    canvas.drawRoundRect(rectF, i, i, this.f12980e);
                }
                canvas.restoreToCount(iSaveLayer);
                return;
            }
        } catch (Exception unused2) {
        } catch (Throwable th) {
            canvas.restoreToCount(iSaveLayer);
            throw th;
        }
        canvas.restoreToCount(iSaveLayer);
    }

    public void setRectColor(int i) {
        this.f12988m = i;
    }

    public void setRectHeight(int i) {
        this.f12985j = i;
    }

    public void setRectLeft(int i) {
        this.f12982g = i;
    }

    public void setRectRoundCx(int i) {
        this.f12990o = i;
    }

    public void setRectTop(int i) {
        this.f12983h = i;
    }

    public void setRectWidth(int i) {
        this.f12984i = i;
    }

    public void setStrokeWidth(int i) {
        this.f12989n = i;
    }

    public RectMaskView(Context context) {
        super(context);
        this.f12982g = -1.0f;
        this.f12983h = -1.0f;
        this.f12984i = -1.0f;
        this.f12985j = -1.0f;
        this.f12986k = false;
        this.f12987l = false;
        this.f12988m = -1;
        this.f12989n = 5;
        this.f12990o = 35;
        m18798g();
    }

    public RectMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12982g = -1.0f;
        this.f12983h = -1.0f;
        this.f12984i = -1.0f;
        this.f12985j = -1.0f;
        this.f12986k = false;
        this.f12987l = false;
        this.f12988m = -1;
        this.f12989n = 5;
        this.f12990o = 35;
        m18797f(context, attributeSet);
        m18798g();
    }
}
