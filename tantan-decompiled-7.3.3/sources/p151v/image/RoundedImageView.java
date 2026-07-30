package p151v.image;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import p153l.hhc0;
import p153l.ind0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: p */
    public static final Shader.TileMode f210654p = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: q */
    public static final ImageView.ScaleType[] f210655q = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a */
    public final float[] f210656a;

    /* JADX INFO: renamed from: b */
    public Drawable f210657b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f210658c;

    /* JADX INFO: renamed from: d */
    public float f210659d;

    /* JADX INFO: renamed from: e */
    public ColorFilter f210660e;

    /* JADX INFO: renamed from: f */
    public boolean f210661f;

    /* JADX INFO: renamed from: g */
    public Drawable f210662g;

    /* JADX INFO: renamed from: h */
    public boolean f210663h;

    /* JADX INFO: renamed from: i */
    public boolean f210664i;

    /* JADX INFO: renamed from: j */
    public boolean f210665j;

    /* JADX INFO: renamed from: k */
    public int f210666k;

    /* JADX INFO: renamed from: l */
    public int f210667l;

    /* JADX INFO: renamed from: m */
    public ImageView.ScaleType f210668m;

    /* JADX INFO: renamed from: n */
    public Shader.TileMode f210669n;

    /* JADX INFO: renamed from: o */
    public Shader.TileMode f210670o;

    /* JADX INFO: renamed from: v.image.RoundedImageView$a */
    public static /* synthetic */ class C22724a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f210671a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f210671a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f210671a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f210671a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f210671a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f210671a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f210671a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f210671a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f210656a = fArr;
        this.f210658c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f210659d = 0.0f;
        this.f210660e = null;
        this.f210661f = false;
        this.f210663h = false;
        this.f210664i = false;
        this.f210665j = false;
        Shader.TileMode tileMode = f210654p;
        this.f210669n = tileMode;
        this.f210670o = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109599K0, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(hhc0.f109605L0, -1);
        if (i2 >= 0) {
            setScaleType(f210655q[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109623O0, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109641R0, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109647S0, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109635Q0, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109629P0, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f210656a;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f210656a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f210656a[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109617N0, -1);
        this.f210659d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f210659d = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(hhc0.f109611M0);
        this.f210658c = colorStateList;
        if (colorStateList == null) {
            this.f210658c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f210665j = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109653T0, false);
        this.f210664i = typedArrayObtainStyledAttributes.getBoolean(hhc0.f109659U0, false);
        int i5 = typedArrayObtainStyledAttributes.getInt(hhc0.f109665V0, -2);
        if (i5 != -2) {
            setTileModeX(m224812b(i5));
            setTileModeY(m224812b(i5));
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(hhc0.f109671W0, -2);
        if (i6 != -2) {
            setTileModeX(m224812b(i6));
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(hhc0.f109677X0, -2);
        if (i7 != -2) {
            setTileModeY(m224812b(i7));
        }
        m224819h();
        m224818g(true);
        if (this.f210665j) {
            super.setBackgroundDrawable(this.f210657b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static Shader.TileMode m224812b(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    /* JADX INFO: renamed from: a */
    public final void m224813a() {
        Drawable drawable = this.f210662g;
        if (drawable == null || !this.f210661f) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f210662g = drawableMutate;
        if (this.f210663h) {
            drawableMutate.setColorFilter(this.f210660e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m224814c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f210667l;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f210667l = 0;
            }
        }
        return ind0.m141097e(drawable);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m224815d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f210666k;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f210666k = 0;
            }
        }
        return ind0.m141097e(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m224816e(float f, float f2, float f3, float f4) {
        float[] fArr = this.f210656a;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m224819h();
        m224818g(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public final void m224817f(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ind0) {
            ind0 ind0Var = (ind0) drawable;
            ind0Var.m141104l(scaleType).m141101i(this.f210659d).m141100h(this.f210658c).m141103k(this.f210664i).m141105m(this.f210669n).m141106n(this.f210670o);
            float[] fArr = this.f210656a;
            if (fArr != null) {
                ind0Var.m141102j(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m224813a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m224817f(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m224818g(boolean z) {
        if (this.f210665j) {
            if (z) {
                this.f210657b = ind0.m141097e(this.f210657b);
            }
            m224817f(this.f210657b, ImageView.ScaleType.FIT_XY);
        }
    }

    @ColorInt
    public int getBorderColor() {
        return this.f210658c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f210658c;
    }

    public float getBorderWidth() {
        return this.f210659d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.f210656a) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f210668m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f210669n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f210670o;
    }

    /* JADX INFO: renamed from: h */
    public final void m224819h() {
        m224817f(this.f210662g, this.f210668m);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f210657b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f210657b = drawable;
        m224818g(true);
        super.setBackgroundDrawable(this.f210657b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.f210667l != i) {
            this.f210667l = i;
            Drawable drawableM224814c = m224814c();
            this.f210657b = drawableM224814c;
            setBackgroundDrawable(drawableM224814c);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f210658c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f210658c = colorStateList;
        m224819h();
        m224818g(false);
        if (this.f210659d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f210659d == f) {
            return;
        }
        this.f210659d = f;
        m224819h();
        m224818g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f210660e != colorFilter) {
            this.f210660e = colorFilter;
            this.f210663h = true;
            this.f210661f = true;
            m224813a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m224816e(f, f, f, f);
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        m224816e(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f210666k = 0;
        this.f210662g = ind0.m141096d(bitmap);
        m224819h();
        super.setImageDrawable(this.f210662g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f210666k = 0;
        this.f210662g = ind0.m141097e(drawable);
        m224819h();
        super.setImageDrawable(this.f210662g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.f210666k != i) {
            this.f210666k = i;
            this.f210662g = m224815d();
            m224819h();
            super.setImageDrawable(this.f210662g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f210664i = z;
        m224819h();
        m224818g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f210668m != scaleType) {
            this.f210668m = scaleType;
            switch (C22724a.f210671a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m224819h();
            m224818g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f210669n == tileMode) {
            return;
        }
        this.f210669n = tileMode;
        m224819h();
        m224818g(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f210670o == tileMode) {
            return;
        }
        this.f210670o = tileMode;
        m224819h();
        m224818g(false);
        invalidate();
    }

    public void setBorderWidth(@DimenRes int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderColor(@ColorInt int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f210656a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f210658c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f210659d = 0.0f;
        this.f210660e = null;
        this.f210661f = false;
        this.f210663h = false;
        this.f210664i = false;
        this.f210665j = false;
        Shader.TileMode tileMode = f210654p;
        this.f210669n = tileMode;
        this.f210670o = tileMode;
    }
}
