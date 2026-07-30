package com.idv.identity.face.p036ui.widget;

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
import p149l.x8c0;

/* JADX INFO: loaded from: classes7.dex */
public class RectMaskView extends AppCompatImageView {

    /* JADX INFO: renamed from: p */
    private static final Xfermode f12236p = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: c */
    private Bitmap f12237c;

    /* JADX INFO: renamed from: d */
    private Paint f12238d;

    /* JADX INFO: renamed from: e */
    private Paint f12239e;

    /* JADX INFO: renamed from: f */
    private WeakReference<Bitmap> f12240f;

    /* JADX INFO: renamed from: g */
    private float f12241g;

    /* JADX INFO: renamed from: h */
    private float f12242h;

    /* JADX INFO: renamed from: i */
    private float f12243i;

    /* JADX INFO: renamed from: j */
    private float f12244j;

    /* JADX INFO: renamed from: k */
    private boolean f12245k;

    /* JADX INFO: renamed from: l */
    private boolean f12246l;

    /* JADX INFO: renamed from: m */
    private int f12247m;

    /* JADX INFO: renamed from: n */
    private int f12248n;

    /* JADX INFO: renamed from: o */
    private int f12249o;

    public RectMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12241g = -1.0f;
        this.f12242h = -1.0f;
        this.f12243i = -1.0f;
        this.f12244j = -1.0f;
        this.f12245k = false;
        this.f12246l = false;
        this.f12247m = -1;
        this.f12248n = 5;
        this.f12249o = 35;
        m17720f(context, attributeSet);
        m17721g();
    }

    /* JADX INFO: renamed from: f */
    private void m17720f(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x8c0.f191503y);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12241g = typedArrayObtainStyledAttributes.getDimension(x8c0.f191458B, 0.0f);
            this.f12242h = typedArrayObtainStyledAttributes.getDimension(x8c0.f191460D, 0.0f);
            this.f12243i = typedArrayObtainStyledAttributes.getDimension(x8c0.f191462F, 0.0f);
            this.f12244j = typedArrayObtainStyledAttributes.getDimension(x8c0.f191457A, 0.0f);
            this.f12245k = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191504z, false);
            this.f12246l = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191461E, false);
            this.f12249o = (int) typedArrayObtainStyledAttributes.getDimension(x8c0.f191459C, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: g */
    private void m17721g() {
        this.f12238d = new Paint(1);
        this.f12239e = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public Bitmap m17722d() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setAntiAlias(true);
        paint.setColor(-1);
        float width = getWidth();
        float height = getHeight();
        if (this.f12243i < 0.0f) {
            this.f12243i = width;
        }
        if (this.f12244j < 0.0f) {
            this.f12244j = height;
        }
        float f = this.f12241g;
        if (f <= -1.0f) {
            f = 0.0f;
        }
        if (this.f12245k) {
            f = (width / 2.0f) - (this.f12243i / 2.0f);
            if (f < 0.0f) {
                f = 0.0f;
            }
            this.f12241g = f;
        }
        float f2 = (height - width) / 2.0f;
        float f3 = this.f12242h;
        if (f3 > -1.0f) {
            f2 = f3;
        }
        if (this.f12246l) {
            float f4 = (height / 2.0f) - (this.f12244j / 2.0f);
            float f5 = f4 >= 0.0f ? f4 : 0.0f;
            this.f12242h = f5;
            f2 = f5;
        }
        float f6 = this.f12243i;
        float f7 = f6 > -1.0f ? f6 + f : width;
        float f8 = width + f2;
        float f9 = this.f12244j;
        if (f9 > -1.0f) {
            f8 = f2 + f9;
        }
        RectF rectF = new RectF(f, f2, f7, f8);
        int i = this.f12249o;
        canvas.drawRoundRect(rectF, i, i, paint);
        return bitmapCreateBitmap;
    }

    public int getRectColor() {
        return this.f12247m;
    }

    public float getRectHeigth() {
        return this.f12244j;
    }

    public float getRectLeft() {
        return this.f12241g;
    }

    public int getRectRoundCx() {
        return this.f12249o;
    }

    public float getRectTop() {
        return this.f12242h;
    }

    public float getRectWidth() {
        return this.f12243i;
    }

    public int getStrokeWidth() {
        return this.f12248n;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12240f = null;
        Bitmap bitmap = this.f12237c;
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
            WeakReference<Bitmap> weakReference = this.f12240f;
            Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
            float f = 0.0f;
            if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                try {
                    bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, getWidth(), getHeight());
                    drawable.draw(canvas2);
                    Bitmap bitmap = this.f12237c;
                    if (bitmap == null || bitmap.isRecycled()) {
                        this.f12237c = m17722d();
                    }
                    this.f12238d.reset();
                    this.f12238d.setFilterBitmap(false);
                    this.f12238d.setXfermode(f12236p);
                    canvas2.drawBitmap(this.f12237c, 0.0f, 0.0f, this.f12238d);
                    this.f12240f = new WeakReference<>(bitmapCreateBitmap);
                } catch (OutOfMemoryError unused) {
                    System.gc();
                    canvas.restoreToCount(iSaveLayer);
                    return;
                }
            }
            if (bitmapCreateBitmap != null) {
                this.f12238d.setXfermode(null);
                canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12238d);
                if (-1 != this.f12247m) {
                    float f2 = this.f12242h;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    float f3 = this.f12241g;
                    if (f3 >= 0.0f) {
                        f = f3;
                    }
                    RectF rectF = new RectF(f, f2, this.f12243i + f, this.f12244j + f2);
                    this.f12239e.setColor(this.f12247m);
                    this.f12239e.setStrokeWidth(this.f12248n);
                    this.f12239e.setStyle(Paint.Style.STROKE);
                    int i = this.f12249o;
                    canvas.drawRoundRect(rectF, i, i, this.f12239e);
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
        this.f12247m = i;
    }

    public void setRectHeight(int i) {
        this.f12244j = i;
    }

    public void setRectLeft(int i) {
        this.f12241g = i;
    }

    public void setRectRoundCx(int i) {
        this.f12249o = i;
    }

    public void setRectTop(int i) {
        this.f12242h = i;
    }

    public void setRectWidth(int i) {
        this.f12243i = i;
    }

    public void setStrokeWidth(int i) {
        this.f12248n = i;
    }

    public RectMaskView(Context context) {
        super(context);
        this.f12241g = -1.0f;
        this.f12242h = -1.0f;
        this.f12243i = -1.0f;
        this.f12244j = -1.0f;
        this.f12245k = false;
        this.f12246l = false;
        this.f12247m = -1;
        this.f12248n = 5;
        this.f12249o = 35;
        m17721g();
    }

    public RectMaskView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12241g = -1.0f;
        this.f12242h = -1.0f;
        this.f12243i = -1.0f;
        this.f12244j = -1.0f;
        this.f12245k = false;
        this.f12246l = false;
        this.f12247m = -1;
        this.f12248n = 5;
        this.f12249o = 35;
        m17720f(context, attributeSet);
        m17721g();
    }
}
