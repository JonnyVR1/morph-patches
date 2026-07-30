package p028v.image;

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
import l.b9c0;
import p003l.ffd0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@SuppressLint({"AppCompatCustomView"})
public class RoundedImageView extends ImageView {

    /* JADX INFO: renamed from: p */
    public static final Shader.TileMode f13357p = Shader.TileMode.CLAMP;

    /* JADX INFO: renamed from: q */
    public static final ImageView.ScaleType[] f13358q = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a */
    public final float[] f13359a;

    /* JADX INFO: renamed from: b */
    public Drawable f13360b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f13361c;

    /* JADX INFO: renamed from: d */
    public float f13362d;

    /* JADX INFO: renamed from: e */
    public ColorFilter f13363e;

    /* JADX INFO: renamed from: f */
    public boolean f13364f;

    /* JADX INFO: renamed from: g */
    public Drawable f13365g;

    /* JADX INFO: renamed from: h */
    public boolean f13366h;

    /* JADX INFO: renamed from: i */
    public boolean f13367i;

    /* JADX INFO: renamed from: j */
    public boolean f13368j;

    /* JADX INFO: renamed from: k */
    public int f13369k;

    /* JADX INFO: renamed from: l */
    public int f13370l;

    /* JADX INFO: renamed from: m */
    public ImageView.ScaleType f13371m;

    /* JADX INFO: renamed from: n */
    public Shader.TileMode f13372n;

    /* JADX INFO: renamed from: o */
    public Shader.TileMode f13373o;

    /* JADX INFO: renamed from: v.image.RoundedImageView$a */
    public static /* synthetic */ class C1402a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13374a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f13374a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13374a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13374a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13374a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13374a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13374a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13374a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f13359a = fArr;
        this.f13361c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f13362d = 0.0f;
        this.f13363e = null;
        this.f13364f = false;
        this.f13366h = false;
        this.f13367i = false;
        this.f13368j = false;
        Shader.TileMode tileMode = f13357p;
        this.f13372n = tileMode;
        this.f13373o = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.K0, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(b9c0.L0, -1);
        if (i2 >= 0) {
            setScaleType(f13358q[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.O0, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.R0, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.S0, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.Q0, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.P0, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f13359a;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f13359a.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f13359a[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.N0, -1);
        this.f13362d = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f13362d = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(b9c0.M0);
        this.f13361c = colorStateList;
        if (colorStateList == null) {
            this.f13361c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f13368j = typedArrayObtainStyledAttributes.getBoolean(b9c0.T0, false);
        this.f13367i = typedArrayObtainStyledAttributes.getBoolean(b9c0.U0, false);
        int i5 = typedArrayObtainStyledAttributes.getInt(b9c0.V0, -2);
        if (i5 != -2) {
            setTileModeX(m12069b(i5));
            setTileModeY(m12069b(i5));
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(b9c0.W0, -2);
        if (i6 != -2) {
            setTileModeX(m12069b(i6));
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(b9c0.X0, -2);
        if (i7 != -2) {
            setTileModeY(m12069b(i7));
        }
        m12076h();
        m12075g(true);
        if (this.f13368j) {
            super.setBackgroundDrawable(this.f13360b);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public static Shader.TileMode m12069b(int i) {
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
    public final void m12070a() {
        Drawable drawable = this.f13365g;
        if (drawable == null || !this.f13364f) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.f13365g = drawableMutate;
        if (this.f13366h) {
            drawableMutate.setColorFilter(this.f13363e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m12071c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f13370l;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f13370l = 0;
            }
        }
        return ffd0.m4340e(drawable);
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m12072d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f13369k;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.f13369k = 0;
            }
        }
        return ffd0.m4340e(drawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m12073e(float f, float f2, float f3, float f4) {
        float[] fArr = this.f13359a;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f4 && fArr[3] == f3) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f3;
        fArr[2] = f4;
        m12076h();
        m12075g(false);
        invalidate();
    }

    /* JADX INFO: renamed from: f */
    public final void m12074f(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof ffd0) {
            ffd0 ffd0Var = (ffd0) drawable;
            ffd0Var.m4347l(scaleType).m4344i(this.f13362d).m4343h(this.f13361c).m4346k(this.f13367i).m4348m(this.f13372n).m4349n(this.f13373o);
            float[] fArr = this.f13359a;
            if (fArr != null) {
                ffd0Var.m4345j(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            m12070a();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                m12074f(layerDrawable.getDrawable(i), scaleType);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12075g(boolean z) {
        if (this.f13368j) {
            if (z) {
                this.f13360b = ffd0.m4340e(this.f13360b);
            }
            m12074f(this.f13360b, ImageView.ScaleType.FIT_XY);
        }
    }

    @ColorInt
    public int getBorderColor() {
        return this.f13361c.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f13361c;
    }

    public float getBorderWidth() {
        return this.f13362d;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.f13359a) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f13371m;
    }

    public Shader.TileMode getTileModeX() {
        return this.f13372n;
    }

    public Shader.TileMode getTileModeY() {
        return this.f13373o;
    }

    /* JADX INFO: renamed from: h */
    public final void m12076h() {
        m12074f(this.f13365g, this.f13371m);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f13360b = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f13360b = drawable;
        m12075g(true);
        super.setBackgroundDrawable(this.f13360b);
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        if (this.f13370l != i) {
            this.f13370l = i;
            Drawable drawableM12071c = m12071c();
            this.f13360b = drawableM12071c;
            setBackgroundDrawable(drawableM12071c);
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f13361c.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.f13361c = colorStateList;
        m12076h();
        m12075g(false);
        if (this.f13362d > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.f13362d == f) {
            return;
        }
        this.f13362d = f;
        m12076h();
        m12075g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f13363e != colorFilter) {
            this.f13363e = colorFilter;
            this.f13366h = true;
            this.f13364f = true;
            m12070a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        m12073e(f, f, f, f);
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        float dimension = getResources().getDimension(i);
        m12073e(dimension, dimension, dimension, dimension);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f13369k = 0;
        this.f13365g = ffd0.m4339d(bitmap);
        m12076h();
        super.setImageDrawable(this.f13365g);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f13369k = 0;
        this.f13365g = ffd0.m4340e(drawable);
        m12076h();
        super.setImageDrawable(this.f13365g);
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        if (this.f13369k != i) {
            this.f13369k = i;
            this.f13365g = m12072d();
            m12076h();
            super.setImageDrawable(this.f13365g);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f13367i = z;
        m12076h();
        m12075g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f13371m != scaleType) {
            this.f13371m = scaleType;
            switch (C1402a.f13374a[scaleType.ordinal()]) {
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
            m12076h();
            m12075g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f13372n == tileMode) {
            return;
        }
        this.f13372n = tileMode;
        m12076h();
        m12075g(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f13373o == tileMode) {
            return;
        }
        this.f13373o = tileMode;
        m12076h();
        m12075g(false);
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
        this.f13359a = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f13361c = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f13362d = 0.0f;
        this.f13363e = null;
        this.f13364f = false;
        this.f13366h = false;
        this.f13367i = false;
        this.f13368j = false;
        Shader.TileMode tileMode = f13357p;
        this.f13372n = tileMode;
        this.f13373o = tileMode;
    }
}
