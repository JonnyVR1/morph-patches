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
import com.idv.identity.platform.log.RecordService;
import java.lang.ref.WeakReference;
import p149l.x8c0;

/* JADX INFO: loaded from: classes7.dex */
public class CircleHoleView extends AppCompatImageView {

    /* JADX INFO: renamed from: m */
    private static final Xfermode f12187m = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: c */
    private Bitmap f12188c;

    /* JADX INFO: renamed from: d */
    private Paint f12189d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Bitmap> f12190e;

    /* JADX INFO: renamed from: f */
    public float f12191f;

    /* JADX INFO: renamed from: g */
    public float f12192g;

    /* JADX INFO: renamed from: h */
    public float f12193h;

    /* JADX INFO: renamed from: i */
    public float f12194i;

    /* JADX INFO: renamed from: j */
    private boolean f12195j;

    /* JADX INFO: renamed from: k */
    private boolean f12196k;

    /* JADX INFO: renamed from: l */
    private int f12197l;

    public CircleHoleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12191f = -1.0f;
        this.f12192g = -1.0f;
        this.f12193h = -1.0f;
        this.f12194i = -1.0f;
        this.f12195j = false;
        this.f12196k = false;
        this.f12197l = -1;
        m17701g(context, attributeSet);
        m17702h();
    }

    /* JADX INFO: renamed from: g */
    private void m17701g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x8c0.f191479a);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12191f = typedArrayObtainStyledAttributes.getDimension(x8c0.f191482d, 0.0f);
            this.f12192g = typedArrayObtainStyledAttributes.getDimension(x8c0.f191483e, 0.0f);
            this.f12193h = typedArrayObtainStyledAttributes.getDimension(x8c0.f191485g, 0.0f);
            this.f12194i = typedArrayObtainStyledAttributes.getDimension(x8c0.f191481c, 0.0f);
            this.f12195j = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191480b, false);
            this.f12196k = typedArrayObtainStyledAttributes.getBoolean(x8c0.f191484f, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m17702h() {
        this.f12189d = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public void m17703d(int i) {
        this.f12197l = i;
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public Bitmap m17704f() {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(1);
                paint.setAntiAlias(true);
                paint.setColor(-1);
                float width2 = getWidth();
                float height2 = getHeight();
                float f = this.f12191f;
                float f2 = 0.0f;
                if (f <= -1.0f) {
                    f = 0.0f;
                }
                if (this.f12195j) {
                    f = (width2 / 2.0f) - (this.f12193h / 2.0f);
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                }
                float f3 = (height2 - width2) / 2.0f;
                float f4 = this.f12192g;
                if (f4 > -1.0f) {
                    f3 = f4;
                }
                if (this.f12196k) {
                    float f5 = (height2 / 2.0f) - (this.f12194i / 2.0f);
                    if (f5 >= 0.0f) {
                        f2 = f5;
                    }
                } else {
                    f2 = f3;
                }
                float f6 = this.f12193h;
                float f7 = f6 > -1.0f ? f6 + f : width2;
                float f8 = width2 + f2;
                float f9 = this.f12194i;
                if (f9 > -1.0f) {
                    f8 = f2 + f9;
                }
                canvas.drawOval(new RectF(f, f2, f7, f8), paint);
                return bitmapCreateBitmap;
            } catch (OutOfMemoryError e) {
                RecordService.getInstance().recordException(e);
            }
        }
        return null;
    }

    @Override // android.view.View
    public void invalidate() {
        this.f12190e = null;
        Bitmap bitmap = this.f12188c;
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
            try {
                WeakReference<Bitmap> weakReference = this.f12190e;
                Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
                if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, getWidth(), getHeight());
                        drawable.draw(canvas2);
                        Bitmap bitmap = this.f12188c;
                        if (bitmap == null || bitmap.isRecycled()) {
                            this.f12188c = m17704f();
                        }
                        if (this.f12188c == null) {
                            return;
                        }
                        this.f12189d.reset();
                        this.f12189d.setFilterBitmap(false);
                        this.f12189d.setXfermode(f12187m);
                        canvas2.drawColor(this.f12197l);
                        canvas2.drawBitmap(this.f12188c, 0.0f, 0.0f, this.f12189d);
                        this.f12190e = new WeakReference<>(bitmapCreateBitmap);
                    } catch (OutOfMemoryError e) {
                        RecordService.getInstance().recordException(e);
                        System.gc();
                        return;
                    }
                }
                if (bitmapCreateBitmap != null) {
                    this.f12189d.setXfermode(null);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12189d);
                }
            } catch (Exception e2) {
                RecordService.getInstance().recordException(e2);
            }
        } finally {
            canvas.restoreToCount(iSaveLayer);
        }
    }

    public CircleHoleView(Context context) {
        super(context);
        this.f12191f = -1.0f;
        this.f12192g = -1.0f;
        this.f12193h = -1.0f;
        this.f12194i = -1.0f;
        this.f12195j = false;
        this.f12196k = false;
        this.f12197l = -1;
        m17702h();
    }

    public CircleHoleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12191f = -1.0f;
        this.f12192g = -1.0f;
        this.f12193h = -1.0f;
        this.f12194i = -1.0f;
        this.f12195j = false;
        this.f12196k = false;
        this.f12197l = -1;
        m17701g(context, attributeSet);
        m17702h();
    }
}
