package p149l;

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
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class ffd0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final RectF f97225a = new RectF();

    /* JADX INFO: renamed from: b */
    public final RectF f97226b = new RectF();

    /* JADX INFO: renamed from: c */
    public final RectF f97227c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f97228d;

    /* JADX INFO: renamed from: e */
    public final Paint f97229e;

    /* JADX INFO: renamed from: f */
    public final int f97230f;

    /* JADX INFO: renamed from: g */
    public final int f97231g;

    /* JADX INFO: renamed from: h */
    public final RectF f97232h;

    /* JADX INFO: renamed from: i */
    public final Paint f97233i;

    /* JADX INFO: renamed from: j */
    public final Matrix f97234j;

    /* JADX INFO: renamed from: k */
    public final RectF f97235k;

    /* JADX INFO: renamed from: l */
    public Shader.TileMode f97236l;

    /* JADX INFO: renamed from: m */
    public Shader.TileMode f97237m;

    /* JADX INFO: renamed from: n */
    public boolean f97238n;

    /* JADX INFO: renamed from: o */
    public float f97239o;

    /* JADX INFO: renamed from: p */
    public final boolean[] f97240p;

    /* JADX INFO: renamed from: q */
    public boolean f97241q;

    /* JADX INFO: renamed from: r */
    public float f97242r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f97243s;

    /* JADX INFO: renamed from: t */
    public ImageView.ScaleType f97244t;

    /* JADX INFO: renamed from: l.ffd0$a */
    public static /* synthetic */ class C16816a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f97245a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f97245a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f97245a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f97245a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f97245a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f97245a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f97245a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f97245a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ffd0(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f97227c = rectF;
        this.f97232h = new RectF();
        this.f97234j = new Matrix();
        this.f97235k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f97236l = tileMode;
        this.f97237m = tileMode;
        this.f97238n = true;
        this.f97239o = 0.0f;
        this.f97240p = new boolean[]{true, true, true, true};
        this.f97241q = false;
        this.f97242r = 0.0f;
        this.f97243s = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f97244t = ImageView.ScaleType.FIT_CENTER;
        this.f97228d = bitmap;
        int width = bitmap.getWidth();
        this.f97230f = width;
        int height = bitmap.getHeight();
        this.f97231g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f97229e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f97233i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f97243s.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        paint2.setStrokeWidth(this.f97242r);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m121140a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m121141b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m121142c(Drawable drawable) {
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
    public static ffd0 m121143d(Bitmap bitmap) {
        if (bitmap != null) {
            return new ffd0(bitmap);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m121144e(Drawable drawable) {
        if (drawable == null || (drawable instanceof ffd0)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapM121142c = m121142c(drawable);
            return bitmapM121142c != null ? new ffd0(bitmapM121142c) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m121144e(layerDrawable.getDrawable(i)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f97238n) {
            BitmapShader bitmapShader = new BitmapShader(this.f97228d, this.f97236l, this.f97237m);
            Shader.TileMode tileMode = this.f97236l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f97237m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f97234j);
            }
            this.f97229e.setShader(bitmapShader);
            this.f97238n = false;
        }
        if (this.f97241q) {
            float f = this.f97242r;
            RectF rectF = this.f97226b;
            if (f <= 0.0f) {
                canvas.drawOval(rectF, this.f97229e);
                return;
            } else {
                canvas.drawOval(rectF, this.f97229e);
                canvas.drawOval(this.f97232h, this.f97233i);
                return;
            }
        }
        if (!m121141b(this.f97240p)) {
            canvas.drawRect(this.f97226b, this.f97229e);
            if (this.f97242r > 0.0f) {
                canvas.drawRect(this.f97232h, this.f97233i);
                return;
            }
            return;
        }
        float f2 = this.f97239o;
        float f3 = this.f97242r;
        RectF rectF2 = this.f97226b;
        if (f3 <= 0.0f) {
            canvas.drawRoundRect(rectF2, f2, f2, this.f97229e);
            m121145f(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.f97229e);
            canvas.drawRoundRect(this.f97232h, f2, f2, this.f97233i);
            m121145f(canvas);
            m121146g(canvas);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m121145f(Canvas canvas) {
        if (m121140a(this.f97240p) || this.f97239o == 0.0f) {
            return;
        }
        RectF rectF = this.f97226b;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.f97226b.height() + f2;
        float f3 = this.f97239o;
        if (!this.f97240p[0]) {
            this.f97235k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f97235k, this.f97229e);
        }
        if (!this.f97240p[1]) {
            this.f97235k.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.f97235k, this.f97229e);
        }
        if (!this.f97240p[2]) {
            this.f97235k.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.f97235k, this.f97229e);
        }
        if (this.f97240p[3]) {
            return;
        }
        this.f97235k.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.f97235k, this.f97229e);
    }

    /* JADX INFO: renamed from: g */
    public final void m121146g(Canvas canvas) {
        float f;
        float f2;
        if (m121140a(this.f97240p) || this.f97239o == 0.0f) {
            return;
        }
        RectF rectF = this.f97226b;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = f4 + this.f97226b.height();
        float f5 = this.f97239o;
        float f6 = this.f97242r / 2.0f;
        if (this.f97240p[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.f97233i);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.f97233i);
        }
        if (!this.f97240p[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.f97233i);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.f97233i);
            fWidth = fWidth;
        }
        if (this.f97240p[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.f97233i);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.f97233i);
            f2 = fHeight;
        }
        if (this.f97240p[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.f97233i);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.f97233i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f97229e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f97229e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f97231g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f97230f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public ffd0 m121147h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f97243s = colorStateList;
        this.f97233i.setColor(colorStateList.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public ffd0 m121148i(float f) {
        this.f97242r = f;
        this.f97233i.setStrokeWidth(f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f97243s.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public ffd0 m121149j(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            ig3.m135964a("Multiple nonzero corner radii not yet supported.");
            return null;
        }
        if (hashSet.isEmpty()) {
            this.f97239o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                efd0.m116031a("Invalid radius value: ", fFloatValue);
                return null;
            }
            this.f97239o = fFloatValue;
        }
        boolean[] zArr = this.f97240p;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public ffd0 m121150k(boolean z) {
        this.f97241q = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ffd0 m121151l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f97244t != scaleType) {
            this.f97244t = scaleType;
            m121154o();
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public ffd0 m121152m(Shader.TileMode tileMode) {
        if (this.f97236l != tileMode) {
            this.f97236l = tileMode;
            this.f97238n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ffd0 m121153n(Shader.TileMode tileMode) {
        if (this.f97237m != tileMode) {
            this.f97237m = tileMode;
            this.f97238n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m121154o() {
        float fWidth;
        float fHeight;
        int i = C16816a.f97245a[this.f97244t.ordinal()];
        if (i == 1) {
            this.f97232h.set(this.f97225a);
            RectF rectF = this.f97232h;
            float f = this.f97242r;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f97234j.reset();
            this.f97234j.setTranslate((int) (((this.f97232h.width() - this.f97230f) * 0.5f) + 0.5f), (int) (((this.f97232h.height() - this.f97231g) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.f97232h.set(this.f97225a);
            RectF rectF2 = this.f97232h;
            float f2 = this.f97242r;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f97234j.reset();
            float fHeight2 = this.f97230f * this.f97232h.height();
            float fWidth2 = this.f97232h.width() * this.f97231g;
            RectF rectF3 = this.f97232h;
            float fWidth3 = 0.0f;
            if (fHeight2 > fWidth2) {
                fWidth = rectF3.height() / this.f97231g;
                fWidth3 = (this.f97232h.width() - (this.f97230f * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF3.width() / this.f97230f;
                fHeight = (this.f97232h.height() - (this.f97231g * fWidth)) * 0.5f;
            }
            this.f97234j.setScale(fWidth, fWidth);
            Matrix matrix = this.f97234j;
            float f3 = this.f97242r;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.f97234j.reset();
            float fMin = (((float) this.f97230f) > this.f97225a.width() || ((float) this.f97231g) > this.f97225a.height()) ? Math.min(this.f97225a.width() / this.f97230f, this.f97225a.height() / this.f97231g) : 1.0f;
            float fWidth4 = (int) (((this.f97225a.width() - (this.f97230f * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.f97225a.height() - (this.f97231g * fMin)) * 0.5f) + 0.5f);
            this.f97234j.setScale(fMin, fMin);
            this.f97234j.postTranslate(fWidth4, fHeight3);
            this.f97232h.set(this.f97227c);
            this.f97234j.mapRect(this.f97232h);
            RectF rectF4 = this.f97232h;
            float f4 = this.f97242r;
            rectF4.inset(f4 / 2.0f, f4 / 2.0f);
            this.f97234j.setRectToRect(this.f97227c, this.f97232h, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f97232h.set(this.f97227c);
            this.f97234j.setRectToRect(this.f97227c, this.f97225a, Matrix.ScaleToFit.END);
            this.f97234j.mapRect(this.f97232h);
            RectF rectF5 = this.f97232h;
            float f5 = this.f97242r;
            rectF5.inset(f5 / 2.0f, f5 / 2.0f);
            this.f97234j.setRectToRect(this.f97227c, this.f97232h, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.f97232h;
            if (i != 7) {
                rectF6.set(this.f97227c);
                this.f97234j.setRectToRect(this.f97227c, this.f97225a, Matrix.ScaleToFit.CENTER);
                this.f97234j.mapRect(this.f97232h);
                RectF rectF7 = this.f97232h;
                float f6 = this.f97242r;
                rectF7.inset(f6 / 2.0f, f6 / 2.0f);
                this.f97234j.setRectToRect(this.f97227c, this.f97232h, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.f97225a);
                RectF rectF8 = this.f97232h;
                float f7 = this.f97242r;
                rectF8.inset(f7 / 2.0f, f7 / 2.0f);
                this.f97234j.reset();
                this.f97234j.setRectToRect(this.f97227c, this.f97232h, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.f97232h.set(this.f97227c);
            this.f97234j.setRectToRect(this.f97227c, this.f97225a, Matrix.ScaleToFit.START);
            this.f97234j.mapRect(this.f97232h);
            RectF rectF9 = this.f97232h;
            float f8 = this.f97242r;
            rectF9.inset(f8 / 2.0f, f8 / 2.0f);
            this.f97234j.setRectToRect(this.f97227c, this.f97232h, Matrix.ScaleToFit.FILL);
        }
        this.f97226b.set(this.f97232h);
        this.f97238n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f97225a.set(rect);
        m121154o();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f97243s.getColorForState(iArr, 0);
        if (this.f97233i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f97233i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f97229e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f97229e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f97229e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f97229e.setFilterBitmap(z);
        invalidateSelf();
    }
}
