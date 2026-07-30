package p153l;

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
public class ind0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public final RectF f115899a = new RectF();

    /* JADX INFO: renamed from: b */
    public final RectF f115900b = new RectF();

    /* JADX INFO: renamed from: c */
    public final RectF f115901c;

    /* JADX INFO: renamed from: d */
    public final Bitmap f115902d;

    /* JADX INFO: renamed from: e */
    public final Paint f115903e;

    /* JADX INFO: renamed from: f */
    public final int f115904f;

    /* JADX INFO: renamed from: g */
    public final int f115905g;

    /* JADX INFO: renamed from: h */
    public final RectF f115906h;

    /* JADX INFO: renamed from: i */
    public final Paint f115907i;

    /* JADX INFO: renamed from: j */
    public final Matrix f115908j;

    /* JADX INFO: renamed from: k */
    public final RectF f115909k;

    /* JADX INFO: renamed from: l */
    public Shader.TileMode f115910l;

    /* JADX INFO: renamed from: m */
    public Shader.TileMode f115911m;

    /* JADX INFO: renamed from: n */
    public boolean f115912n;

    /* JADX INFO: renamed from: o */
    public float f115913o;

    /* JADX INFO: renamed from: p */
    public final boolean[] f115914p;

    /* JADX INFO: renamed from: q */
    public boolean f115915q;

    /* JADX INFO: renamed from: r */
    public float f115916r;

    /* JADX INFO: renamed from: s */
    public ColorStateList f115917s;

    /* JADX INFO: renamed from: t */
    public ImageView.ScaleType f115918t;

    /* JADX INFO: renamed from: l.ind0$a */
    public static /* synthetic */ class C17747a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f115919a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f115919a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f115919a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f115919a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f115919a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f115919a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f115919a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f115919a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public ind0(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f115901c = rectF;
        this.f115906h = new RectF();
        this.f115908j = new Matrix();
        this.f115909k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f115910l = tileMode;
        this.f115911m = tileMode;
        this.f115912n = true;
        this.f115913o = 0.0f;
        this.f115914p = new boolean[]{true, true, true, true};
        this.f115915q = false;
        this.f115916r = 0.0f;
        this.f115917s = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f115918t = ImageView.ScaleType.FIT_CENTER;
        this.f115902d = bitmap;
        int width = bitmap.getWidth();
        this.f115904f = width;
        int height = bitmap.getHeight();
        this.f115905g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f115903e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f115907i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f115917s.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        paint2.setStrokeWidth(this.f115916r);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m141093a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m141094b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m141095c(Drawable drawable) {
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
    public static ind0 m141096d(Bitmap bitmap) {
        if (bitmap != null) {
            return new ind0(bitmap);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static Drawable m141097e(Drawable drawable) {
        if (drawable == null || (drawable instanceof ind0)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapM141095c = m141095c(drawable);
            return bitmapM141095c != null ? new ind0(bitmapM141095c) : drawable;
        }
        Drawable.ConstantState constantState = drawable.mutate().getConstantState();
        if (constantState != null) {
            drawable = constantState.newDrawable();
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m141097e(layerDrawable.getDrawable(i)));
        }
        return layerDrawable;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f115912n) {
            BitmapShader bitmapShader = new BitmapShader(this.f115902d, this.f115910l, this.f115911m);
            Shader.TileMode tileMode = this.f115910l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f115911m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f115908j);
            }
            this.f115903e.setShader(bitmapShader);
            this.f115912n = false;
        }
        if (this.f115915q) {
            float f = this.f115916r;
            RectF rectF = this.f115900b;
            if (f <= 0.0f) {
                canvas.drawOval(rectF, this.f115903e);
                return;
            } else {
                canvas.drawOval(rectF, this.f115903e);
                canvas.drawOval(this.f115906h, this.f115907i);
                return;
            }
        }
        if (!m141094b(this.f115914p)) {
            canvas.drawRect(this.f115900b, this.f115903e);
            if (this.f115916r > 0.0f) {
                canvas.drawRect(this.f115906h, this.f115907i);
                return;
            }
            return;
        }
        float f2 = this.f115913o;
        float f3 = this.f115916r;
        RectF rectF2 = this.f115900b;
        if (f3 <= 0.0f) {
            canvas.drawRoundRect(rectF2, f2, f2, this.f115903e);
            m141098f(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.f115903e);
            canvas.drawRoundRect(this.f115906h, f2, f2, this.f115907i);
            m141098f(canvas);
            m141099g(canvas);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m141098f(Canvas canvas) {
        if (m141093a(this.f115914p) || this.f115913o == 0.0f) {
            return;
        }
        RectF rectF = this.f115900b;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.f115900b.height() + f2;
        float f3 = this.f115913o;
        if (!this.f115914p[0]) {
            this.f115909k.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.f115909k, this.f115903e);
        }
        if (!this.f115914p[1]) {
            this.f115909k.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.f115909k, this.f115903e);
        }
        if (!this.f115914p[2]) {
            this.f115909k.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.f115909k, this.f115903e);
        }
        if (this.f115914p[3]) {
            return;
        }
        this.f115909k.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.f115909k, this.f115903e);
    }

    /* JADX INFO: renamed from: g */
    public final void m141099g(Canvas canvas) {
        float f;
        float f2;
        if (m141093a(this.f115914p) || this.f115913o == 0.0f) {
            return;
        }
        RectF rectF = this.f115900b;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = f4 + this.f115900b.height();
        float f5 = this.f115913o;
        float f6 = this.f115916r / 2.0f;
        if (this.f115914p[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.f115907i);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.f115907i);
        }
        if (!this.f115914p[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.f115907i);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.f115907i);
            fWidth = fWidth;
        }
        if (this.f115914p[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.f115907i);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.f115907i);
            f2 = fHeight;
        }
        if (this.f115914p[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.f115907i);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.f115907i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f115903e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f115903e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f115905g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f115904f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public ind0 m141100h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f115917s = colorStateList;
        this.f115907i.setColor(colorStateList.getColorForState(getState(), RoundedDrawable.DEFAULT_BORDER_COLOR));
        return this;
    }

    /* JADX INFO: renamed from: i */
    public ind0 m141101i(float f) {
        this.f115916r = f;
        this.f115907i.setStrokeWidth(f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f115917s.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public ind0 m141102j(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            wg3.m206174a("Multiple nonzero corner radii not yet supported.");
            return null;
        }
        if (hashSet.isEmpty()) {
            this.f115913o = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                hnd0.m136059a("Invalid radius value: ", fFloatValue);
                return null;
            }
            this.f115913o = fFloatValue;
        }
        boolean[] zArr = this.f115914p;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public ind0 m141103k(boolean z) {
        this.f115915q = z;
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ind0 m141104l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f115918t != scaleType) {
            this.f115918t = scaleType;
            m141107o();
        }
        return this;
    }

    /* JADX INFO: renamed from: m */
    public ind0 m141105m(Shader.TileMode tileMode) {
        if (this.f115910l != tileMode) {
            this.f115910l = tileMode;
            this.f115912n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public ind0 m141106n(Shader.TileMode tileMode) {
        if (this.f115911m != tileMode) {
            this.f115911m = tileMode;
            this.f115912n = true;
            invalidateSelf();
        }
        return this;
    }

    /* JADX INFO: renamed from: o */
    public final void m141107o() {
        float fWidth;
        float fHeight;
        int i = C17747a.f115919a[this.f115918t.ordinal()];
        if (i == 1) {
            this.f115906h.set(this.f115899a);
            RectF rectF = this.f115906h;
            float f = this.f115916r;
            rectF.inset(f / 2.0f, f / 2.0f);
            this.f115908j.reset();
            this.f115908j.setTranslate((int) (((this.f115906h.width() - this.f115904f) * 0.5f) + 0.5f), (int) (((this.f115906h.height() - this.f115905g) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.f115906h.set(this.f115899a);
            RectF rectF2 = this.f115906h;
            float f2 = this.f115916r;
            rectF2.inset(f2 / 2.0f, f2 / 2.0f);
            this.f115908j.reset();
            float fHeight2 = this.f115904f * this.f115906h.height();
            float fWidth2 = this.f115906h.width() * this.f115905g;
            RectF rectF3 = this.f115906h;
            float fWidth3 = 0.0f;
            if (fHeight2 > fWidth2) {
                fWidth = rectF3.height() / this.f115905g;
                fWidth3 = (this.f115906h.width() - (this.f115904f * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF3.width() / this.f115904f;
                fHeight = (this.f115906h.height() - (this.f115905g * fWidth)) * 0.5f;
            }
            this.f115908j.setScale(fWidth, fWidth);
            Matrix matrix = this.f115908j;
            float f3 = this.f115916r;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + (f3 / 2.0f), ((int) (fHeight + 0.5f)) + (f3 / 2.0f));
        } else if (i == 3) {
            this.f115908j.reset();
            float fMin = (((float) this.f115904f) > this.f115899a.width() || ((float) this.f115905g) > this.f115899a.height()) ? Math.min(this.f115899a.width() / this.f115904f, this.f115899a.height() / this.f115905g) : 1.0f;
            float fWidth4 = (int) (((this.f115899a.width() - (this.f115904f * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.f115899a.height() - (this.f115905g * fMin)) * 0.5f) + 0.5f);
            this.f115908j.setScale(fMin, fMin);
            this.f115908j.postTranslate(fWidth4, fHeight3);
            this.f115906h.set(this.f115901c);
            this.f115908j.mapRect(this.f115906h);
            RectF rectF4 = this.f115906h;
            float f4 = this.f115916r;
            rectF4.inset(f4 / 2.0f, f4 / 2.0f);
            this.f115908j.setRectToRect(this.f115901c, this.f115906h, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f115906h.set(this.f115901c);
            this.f115908j.setRectToRect(this.f115901c, this.f115899a, Matrix.ScaleToFit.END);
            this.f115908j.mapRect(this.f115906h);
            RectF rectF5 = this.f115906h;
            float f5 = this.f115916r;
            rectF5.inset(f5 / 2.0f, f5 / 2.0f);
            this.f115908j.setRectToRect(this.f115901c, this.f115906h, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.f115906h;
            if (i != 7) {
                rectF6.set(this.f115901c);
                this.f115908j.setRectToRect(this.f115901c, this.f115899a, Matrix.ScaleToFit.CENTER);
                this.f115908j.mapRect(this.f115906h);
                RectF rectF7 = this.f115906h;
                float f6 = this.f115916r;
                rectF7.inset(f6 / 2.0f, f6 / 2.0f);
                this.f115908j.setRectToRect(this.f115901c, this.f115906h, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.f115899a);
                RectF rectF8 = this.f115906h;
                float f7 = this.f115916r;
                rectF8.inset(f7 / 2.0f, f7 / 2.0f);
                this.f115908j.reset();
                this.f115908j.setRectToRect(this.f115901c, this.f115906h, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.f115906h.set(this.f115901c);
            this.f115908j.setRectToRect(this.f115901c, this.f115899a, Matrix.ScaleToFit.START);
            this.f115908j.mapRect(this.f115906h);
            RectF rectF9 = this.f115906h;
            float f8 = this.f115916r;
            rectF9.inset(f8 / 2.0f, f8 / 2.0f);
            this.f115908j.setRectToRect(this.f115901c, this.f115906h, Matrix.ScaleToFit.FILL);
        }
        this.f115900b.set(this.f115906h);
        this.f115912n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f115899a.set(rect);
        m141107o();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f115917s.getColorForState(iArr, 0);
        if (this.f115907i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f115907i.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f115903e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f115903e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f115903e.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f115903e.setFilterBitmap(z);
        invalidateSelf();
    }
}
