package p147v.image;

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
import p149l.b9c0;
import p149l.ffd0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: p */
    public static final Shader.TileMode f209732p = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: q */
    public static final ImageView.ScaleType[] f209733q = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a */
    public final float[] f209734a;

    /* JADX INFO: renamed from: b */
    public Drawable f209735b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f209736c;

    /* JADX INFO: renamed from: d */
    public float f209737d;

    /* JADX INFO: renamed from: e */
    public ColorFilter f209738e;

    /* JADX INFO: renamed from: f */
    public boolean f209739f;

    /* JADX INFO: renamed from: g */
    public Drawable f209740g;

    /* JADX INFO: renamed from: h */
    public boolean f209741h;

    /* JADX INFO: renamed from: i */
    public boolean f209742i;

    /* JADX INFO: renamed from: j */
    public boolean f209743j;

    /* JADX INFO: renamed from: k */
    public int f209744k;

    /* JADX INFO: renamed from: l */
    public int f209745l;

    /* JADX INFO: renamed from: m */
    public ImageView.ScaleType f209746m;

    /* JADX INFO: renamed from: n */
    public Shader.TileMode f209747n;

    /* JADX INFO: renamed from: o */
    public Shader.TileMode f209748o;

    /* JADX INFO: renamed from: v.image.RoundedImageView$a */
    public static /* synthetic */ class C22609a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f209749a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f209749a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f209749a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f209749a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f209749a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f209749a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f209749a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f209749a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f209734a = fArr;
        this.f209736c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f209737d = 0.0f;
        this.f209738e = null;
        this.f209739f = false;
        this.f209741h = false;
        this.f209742i = false;
        this.f209743j = false;
        Shader.TileMode tileMode = f209732p;
        this.f209747n = tileMode;
        this.f209748o = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74290K0, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.f74296L0, -1);
        if (i2 >= 0) {
            setScaleType(f209733q[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74314O0, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74332R0, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74338S0, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74326Q0, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74320P0, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f209734a;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f209734a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f209734a[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74308N0, -1);
        this.f209737d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f209737d = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.f74302M0);
        this.f209736c = colorStateList;
        if (colorStateList == null) {
            this.f209736c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f209743j = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74344T0, false);
        this.f209742i = typedArrayObtainStyledAttributes.getBoolean(b9c0.f74350U0, false);
        int i5 = typedArrayObtainStyledAttributes.getInt(b9c0.f74356V0, -2);
        if (i5 != -2) {
            setTileModeX(m223566b(i5));
            setTileModeY(m223566b(i5));
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(b9c0.f74362W0, -2);
        if (i6 != -2) {
            setTileModeX(m223566b(i6));
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(b9c0.f74368X0, -2);
        if (i7 != -2) {
            setTileModeY(m223566b(i7));
        }
        m223573h();
        m223572g(true);
        if (this.f209743j) {
            super.setBackgroundDrawable(this.f209735b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static Shader.TileMode m223566b(int i) {
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
    public final void m223567a() {
        Drawable drawable = this.f209740g;
        if (drawable == null || !this.f209739f) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f209740g = drawableMutate;
        if (this.f209741h) {
            drawableMutate.setColorFilter(this.f209738e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m223568c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f209745l;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f209745l = 0;
            }
        }
        return ffd0.m121144e(drawable);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m223569d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f209744k;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f209744k = 0;
            }
        }
        return ffd0.m121144e(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m223570e(float f, float f2, float f3, float f4) {
        float[] fArr = this.f209734a;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m223573h();
        m223572g(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public final void m223571f(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ffd0) {
            ffd0 ffd0Var = (ffd0) drawable;
            ffd0Var.m121151l(scaleType).m121148i(this.f209737d).m121147h(this.f209736c).m121150k(this.f209742i).m121152m(this.f209747n).m121153n(this.f209748o);
            float[] fArr = this.f209734a;
            if (fArr != null) {
                ffd0Var.m121149j(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m223567a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m223571f(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m223572g(boolean z) {
        if (this.f209743j) {
            if (z) {
                this.f209735b = ffd0.m121144e(this.f209735b);
            }
            m223571f(this.f209735b, ImageView.ScaleType.FIT_XY);
        }
    }

    @ColorInt
    public int getBorderColor() {
        return this.f209736c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f209736c;
    }

    public float getBorderWidth() {
        return this.f209737d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.f209734a) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f209746m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f209747n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f209748o;
    }

    /* JADX INFO: renamed from: h */
    public final void m223573h() {
        m223571f(this.f209740g, this.f209746m);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f209735b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f209735b = drawable;
        m223572g(true);
        super.setBackgroundDrawable(this.f209735b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.f209745l != i) {
            this.f209745l = i;
            Drawable drawableM223568c = m223568c();
            this.f209735b = drawableM223568c;
            setBackgroundDrawable(drawableM223568c);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f209736c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f209736c = colorStateList;
        m223573h();
        m223572g(false);
        if (this.f209737d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f209737d == f) {
            return;
        }
        this.f209737d = f;
        m223573h();
        m223572g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f209738e != colorFilter) {
            this.f209738e = colorFilter;
            this.f209741h = true;
            this.f209739f = true;
            m223567a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m223570e(f, f, f, f);
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        m223570e(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f209744k = 0;
        this.f209740g = ffd0.m121143d(bitmap);
        m223573h();
        super.setImageDrawable(this.f209740g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f209744k = 0;
        this.f209740g = ffd0.m121144e(drawable);
        m223573h();
        super.setImageDrawable(this.f209740g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.f209744k != i) {
            this.f209744k = i;
            this.f209740g = m223569d();
            m223573h();
            super.setImageDrawable(this.f209740g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f209742i = z;
        m223573h();
        m223572g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f209746m != scaleType) {
            this.f209746m = scaleType;
            switch (C22609a.f209749a[scaleType.ordinal()]) {
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
            m223573h();
            m223572g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f209747n == tileMode) {
            return;
        }
        this.f209747n = tileMode;
        m223573h();
        m223572g(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f209748o == tileMode) {
            return;
        }
        this.f209748o = tileMode;
        m223573h();
        m223572g(false);
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
        this.f209734a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f209736c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f209737d = 0.0f;
        this.f209738e = null;
        this.f209739f = false;
        this.f209741h = false;
        this.f209742i = false;
        this.f209743j = false;
        Shader.TileMode tileMode = f209732p;
        this.f209747n = tileMode;
        this.f209748o = tileMode;
    }
}
