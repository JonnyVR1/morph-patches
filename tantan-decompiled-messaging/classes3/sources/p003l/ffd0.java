package p003l;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.HashSet;
import l.ig3;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ffd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final RectF f3578a = new RectF();

    /* JADX INFO: renamed from: b */
    public final RectF f3579b = new RectF();

    /* JADX INFO: renamed from: c */
    public final RectF f3580c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f3581d;

    /* JADX INFO: renamed from: e */
    public final Paint f3582e;

    /* JADX INFO: renamed from: f */
    public final int f3583f;

    /* JADX INFO: renamed from: g */
    public final int f3584g;

    /* JADX INFO: renamed from: h */
    public final RectF f3585h;

    /* JADX INFO: renamed from: i */
    public final Paint f3586i;

    /* JADX INFO: renamed from: j */
    public final Matrix f3587j;

    /* JADX INFO: renamed from: k */
    public final RectF f3588k;

    /* JADX INFO: renamed from: l */
    public Shader.TileMode f3589l;

    /* JADX INFO: renamed from: m */
    public Shader.TileMode f3590m;

    /* JADX INFO: renamed from: n */
    public boolean f3591n;

    /* JADX INFO: renamed from: o */
    public float f3592o;

    /* JADX INFO: renamed from: p */
    public final boolean[] f3593p;

    /* JADX INFO: renamed from: q */
    public boolean f3594q;

    /* JADX INFO: renamed from: r */
    public float f3595r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f3596s;

    /* JADX INFO: renamed from: t */
    public ImageView.ScaleType f3597t;

    /* JADX INFO: renamed from: l.ffd0$a */
    public static /* synthetic */ class C0289a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3598a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f3598a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3598a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3598a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3598a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3598a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3598a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3598a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ffd0(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f3580c = rectF;
        this.f3585h = new RectF();
        this.f3587j = new Matrix();
        this.f3588k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f3589l = tileMode;
        this.f3590m = tileMode;
        this.f3591n = true;
        this.f3592o = 0.0f;
        this.f3593p = new boolean[]{true, true, true, true};
        this.f3594q = false;
        this.f3595r = 0.0f;
        this.f3596s = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f3597t = ImageView.ScaleType.FIT_CENTER;
        this.f3581d = bitmap;
        int width = bitmap.getWidth();
        this.f3583f = width;
        int height = bitmap.getHeight();
        this.f3584g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f3582e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f3586i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f3596s.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        paint2.setStrokeWidth(this.f3595r);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4336a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4337b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m4338c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ffd0 m4339d(Bitmap bitmap) {
        if (bitmap != null) {
            return new ffd0(bitmap);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m4340e(Drawable drawable) {
        if (drawable == null || (drawable instanceof ffd0)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapM4338c = m4338c(drawable);
            return bitmapM4338c != null ? new ffd0(bitmapM4338c) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m4340e(layerDrawable.getDrawable(i)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f3591n) {
            BitmapShader bitmapShader = new BitmapShader(this.f3581d, this.f3589l, this.f3590m);
            Shader.TileMode tileMode = this.f3589l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f3590m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f3587j);
            }
            this.f3582e.setShader(bitmapShader);
            this.f3591n = false;
        }
        if (this.f3594q) {
            float f = this.f3595r;
            RectF rectF = this.f3579b;
            if (f <= 0.0f) {
                canvas.drawOval(rectF, this.f3582e);
                return;
            } else {
                canvas.drawOval(rectF, this.f3582e);
                canvas.drawOval(this.f3585h, this.f3586i);
                return;
            }
        }
        if (!m4337b(this.f3593p)) {
            canvas.drawRect(this.f3579b, this.f3582e);
            if (this.f3595r > 0.0f) {
                canvas.drawRect(this.f3585h, this.f3586i);
                return;
            }
            return;
        }
        float f2 = this.f3592o;
        float f3 = this.f3595r;
        RectF rectF2 = this.f3579b;
        if (f3 <= 0.0f) {
            canvas.drawRoundRect(rectF2, f2, f2, this.f3582e);
            m4341f(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.f3582e);
            canvas.drawRoundRect(this.f3585h, f2, f2, this.f3586i);
            m4341f(canvas);
            m4342g(canvas);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m4341f(Canvas canvas) {
        if (m4336a(this.f3593p) || this.f3592o == 0.0f) {
            return;
        }
        RectF rectF = this.f3579b;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.f3579b.height() + f2;
        float f3 = this.f3592o;
        if (!this.f3593p[0]) {
            this.f3588k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f3588k, this.f3582e);
        }
        if (!this.f3593p[1]) {
            this.f3588k.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.f3588k, this.f3582e);
        }
        if (!this.f3593p[2]) {
            this.f3588k.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.f3588k, this.f3582e);
        }
        if (this.f3593p[3]) {
            return;
        }
        this.f3588k.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.f3588k, this.f3582e);
    }

    /* JADX INFO: renamed from: g */
    public final void m4342g(Canvas canvas) {
        float f;
        float f2;
        if (m4336a(this.f3593p) || this.f3592o == 0.0f) {
            return;
        }
        RectF rectF = this.f3579b;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = f4 + this.f3579b.height();
        float f5 = this.f3592o;
        float f6 = this.f3595r / 2.0f;
        if (this.f3593p[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.f3586i);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.f3586i);
        }
        if (!this.f3593p[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.f3586i);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.f3586i);
            fWidth = fWidth;
        }
        if (this.f3593p[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.f3586i);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.f3586i);
            f2 = fHeight;
        }
        if (this.f3593p[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.f3586i);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.f3586i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3582e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f3582e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3584g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3583f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public ffd0 m4343h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3596s = colorStateList;
        this.f3586i.setColor(colorStateList.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public ffd0 m4344i(float f) {
        this.f3595r = f;
        this.f3586i.setStrokeWidth(f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f3596s.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public ffd0 m4345j(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            ig3.a("Multiple nonzero corner radii not yet supported.");
            return null;
        }
        if (hashSet.isEmpty()) {
            this.f3592o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                efd0.m3826a("Invalid radius value: ", fFloatValue);
                return null;
            }
            this.f3592o = fFloatValue;
        }
        boolean[] zArr = this.f3593p;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public ffd0 m4346k(boolean z) {
        this.f3594q = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ffd0 m4347l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f3597t != scaleType) {
            this.f3597t = scaleType;
            m4350o();
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public ffd0 m4348m(Shader.TileMode tileMode) {
        if (this.f3589l != tileMode) {
            this.f3589l = tileMode;
            this.f3591n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ffd0 m4349n(Shader.TileMode tileMode) {
        if (this.f3590m != tileMode) {
            this.f3590m = tileMode;
            this.f3591n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m4350o() {
        float fWidth;
        float fHeight;
        int i = C0289a.f3598a[this.f3597t.ordinal()];
        if (i == 1) {
            this.f3585h.set(this.f3578a);
            RectF rectF = this.f3585h;
            float f = this.f3595r;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f3587j.reset();
            this.f3587j.setTranslate((int) (((this.f3585h.width() - this.f3583f) * 0.5f) + 0.5f), (int) (((this.f3585h.height() - this.f3584g) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.f3585h.set(this.f3578a);
            RectF rectF2 = this.f3585h;
            float f2 = this.f3595r;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f3587j.reset();
            float fHeight2 = this.f3583f * this.f3585h.height();
            float fWidth2 = this.f3585h.width() * this.f3584g;
            RectF rectF3 = this.f3585h;
            float fWidth3 = 0.0f;
            if (fHeight2 > fWidth2) {
                fWidth = rectF3.height() / this.f3584g;
                fWidth3 = (this.f3585h.width() - (this.f3583f * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF3.width() / this.f3583f;
                fHeight = (this.f3585h.height() - (this.f3584g * fWidth)) * 0.5f;
            }
            this.f3587j.setScale(fWidth, fWidth);
            Matrix matrix = this.f3587j;
            float f3 = this.f3595r;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.f3587j.reset();
            float fMin = (((float) this.f3583f) > this.f3578a.width() || ((float) this.f3584g) > this.f3578a.height()) ? Math.min(this.f3578a.width() / this.f3583f, this.f3578a.height() / this.f3584g) : 1.0f;
            float fWidth4 = (int) (((this.f3578a.width() - (this.f3583f * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.f3578a.height() - (this.f3584g * fMin)) * 0.5f) + 0.5f);
            this.f3587j.setScale(fMin, fMin);
            this.f3587j.postTranslate(fWidth4, fHeight3);
            this.f3585h.set(this.f3580c);
            this.f3587j.mapRect(this.f3585h);
            RectF rectF4 = this.f3585h;
            float f4 = this.f3595r;
            rectF4.inset(f4 / 2.0f, f4 / 2.0f);
            this.f3587j.setRectToRect(this.f3580c, this.f3585h, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f3585h.set(this.f3580c);
            this.f3587j.setRectToRect(this.f3580c, this.f3578a, Matrix.ScaleToFit.END);
            this.f3587j.mapRect(this.f3585h);
            RectF rectF5 = this.f3585h;
            float f5 = this.f3595r;
            rectF5.inset(f5 / 2.0f, f5 / 2.0f);
            this.f3587j.setRectToRect(this.f3580c, this.f3585h, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.f3585h;
            if (i != 7) {
                rectF6.set(this.f3580c);
                this.f3587j.setRectToRect(this.f3580c, this.f3578a, Matrix.ScaleToFit.CENTER);
                this.f3587j.mapRect(this.f3585h);
                RectF rectF7 = this.f3585h;
                float f6 = this.f3595r;
                rectF7.inset(f6 / 2.0f, f6 / 2.0f);
                this.f3587j.setRectToRect(this.f3580c, this.f3585h, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.f3578a);
                RectF rectF8 = this.f3585h;
                float f7 = this.f3595r;
                rectF8.inset(f7 / 2.0f, f7 / 2.0f);
                this.f3587j.reset();
                this.f3587j.setRectToRect(this.f3580c, this.f3585h, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.f3585h.set(this.f3580c);
            this.f3587j.setRectToRect(this.f3580c, this.f3578a, Matrix.ScaleToFit.START);
            this.f3587j.mapRect(this.f3585h);
            RectF rectF9 = this.f3585h;
            float f8 = this.f3595r;
            rectF9.inset(f8 / 2.0f, f8 / 2.0f);
            this.f3587j.setRectToRect(this.f3580c, this.f3585h, Matrix.ScaleToFit.FILL);
        }
        this.f3579b.set(this.f3585h);
        this.f3591n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f3578a.set(rect);
        m4350o();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f3596s.getColorForState(iArr, 0);
        if (this.f3586i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f3586i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f3582e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3582e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f3582e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f3582e.setFilterBitmap(z);
        invalidateSelf();
    }
}
