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
import com.idv.identity.platform.log.RecordService;
import java.lang.ref.WeakReference;
import p153l.dhc0;

/* JADX INFO: loaded from: classes7.dex */
public class CircleHoleView extends AppCompatImageView {

    /* JADX INFO: renamed from: m */
    private static final Xfermode f12928m = new PorterDuffXfermode(PorterDuff.Mode.XOR);

    /* JADX INFO: renamed from: c */
    private Bitmap f12929c;

    /* JADX INFO: renamed from: d */
    private Paint f12930d;

    /* JADX INFO: renamed from: e */
    private WeakReference<Bitmap> f12931e;

    /* JADX INFO: renamed from: f */
    public float f12932f;

    /* JADX INFO: renamed from: g */
    public float f12933g;

    /* JADX INFO: renamed from: h */
    public float f12934h;

    /* JADX INFO: renamed from: i */
    public float f12935i;

    /* JADX INFO: renamed from: j */
    private boolean f12936j;

    /* JADX INFO: renamed from: k */
    private boolean f12937k;

    /* JADX INFO: renamed from: l */
    private int f12938l;

    public CircleHoleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12932f = -1.0f;
        this.f12933g = -1.0f;
        this.f12934h = -1.0f;
        this.f12935i = -1.0f;
        this.f12936j = false;
        this.f12937k = false;
        this.f12938l = -1;
        m18778g(context, attributeSet);
        m18779h();
    }

    /* JADX INFO: renamed from: g */
    private void m18778g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dhc0.f88455a);
        if (typedArrayObtainStyledAttributes != null) {
            this.f12932f = typedArrayObtainStyledAttributes.getDimension(dhc0.f88458d, 0.0f);
            this.f12933g = typedArrayObtainStyledAttributes.getDimension(dhc0.f88459e, 0.0f);
            this.f12934h = typedArrayObtainStyledAttributes.getDimension(dhc0.f88461g, 0.0f);
            this.f12935i = typedArrayObtainStyledAttributes.getDimension(dhc0.f88457c, 0.0f);
            this.f12936j = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88456b, false);
            this.f12937k = typedArrayObtainStyledAttributes.getBoolean(dhc0.f88460f, false);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    private void m18779h() {
        this.f12930d = new Paint(1);
    }

    /* JADX INFO: renamed from: d */
    public void m18780d(int i) {
        this.f12938l = i;
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public Bitmap m18781f() {
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
                float f = this.f12932f;
                float f2 = 0.0f;
                if (f <= -1.0f) {
                    f = 0.0f;
                }
                if (this.f12936j) {
                    f = (width2 / 2.0f) - (this.f12934h / 2.0f);
                    if (f < 0.0f) {
                        f = 0.0f;
                    }
                }
                float f3 = (height2 - width2) / 2.0f;
                float f4 = this.f12933g;
                if (f4 > -1.0f) {
                    f3 = f4;
                }
                if (this.f12937k) {
                    float f5 = (height2 / 2.0f) - (this.f12935i / 2.0f);
                    if (f5 >= 0.0f) {
                        f2 = f5;
                    }
                } else {
                    f2 = f3;
                }
                float f6 = this.f12934h;
                float f7 = f6 > -1.0f ? f6 + f : width2;
                float f8 = width2 + f2;
                float f9 = this.f12935i;
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
        this.f12931e = null;
        Bitmap bitmap = this.f12929c;
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
                WeakReference<Bitmap> weakReference = this.f12931e;
                Bitmap bitmapCreateBitmap = weakReference != null ? weakReference.get() : null;
                if ((bitmapCreateBitmap == null || bitmapCreateBitmap.isRecycled()) && (drawable = getDrawable()) != null) {
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, getWidth(), getHeight());
                        drawable.draw(canvas2);
                        Bitmap bitmap = this.f12929c;
                        if (bitmap == null || bitmap.isRecycled()) {
                            this.f12929c = m18781f();
                        }
                        if (this.f12929c == null) {
                            return;
                        }
                        this.f12930d.reset();
                        this.f12930d.setFilterBitmap(false);
                        this.f12930d.setXfermode(f12928m);
                        canvas2.drawColor(this.f12938l);
                        canvas2.drawBitmap(this.f12929c, 0.0f, 0.0f, this.f12930d);
                        this.f12931e = new WeakReference<>(bitmapCreateBitmap);
                    } catch (OutOfMemoryError e) {
                        RecordService.getInstance().recordException(e);
                        System.gc();
                        return;
                    }
                }
                if (bitmapCreateBitmap != null) {
                    this.f12930d.setXfermode(null);
                    canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, this.f12930d);
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
        this.f12932f = -1.0f;
        this.f12933g = -1.0f;
        this.f12934h = -1.0f;
        this.f12935i = -1.0f;
        this.f12936j = false;
        this.f12937k = false;
        this.f12938l = -1;
        m18779h();
    }

    public CircleHoleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12932f = -1.0f;
        this.f12933g = -1.0f;
        this.f12934h = -1.0f;
        this.f12935i = -1.0f;
        this.f12936j = false;
        this.f12937k = false;
        this.f12938l = -1;
        m18778g(context, attributeSet);
        m18779h();
    }
}
