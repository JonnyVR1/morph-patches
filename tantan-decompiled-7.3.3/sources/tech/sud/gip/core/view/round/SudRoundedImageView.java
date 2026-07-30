package tech.sud.gip.core.view.round;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import tech.sud.gip.C22511R;

/* JADX INFO: loaded from: classes3.dex */
public class SudRoundedImageView extends ImageView {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final float DEFAULT_BORDER_WIDTH = 0.0f;
    public static final float DEFAULT_RADIUS = 0.0f;
    public static final Shader.TileMode DEFAULT_TILE_MODE = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] SCALE_TYPES = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public static final String TAG = "RoundedImageView";
    private static final int TILE_MODE_CLAMP = 0;
    private static final int TILE_MODE_MIRROR = 2;
    private static final int TILE_MODE_REPEAT = 1;
    private static final int TILE_MODE_UNDEFINED = -2;
    private boolean isSquare;
    private Drawable mBackgroundDrawable;
    private ColorStateList mBorderColor;
    private float mBorderWidth;
    private ColorFilter mColorFilter;
    private boolean mColorMod;
    private final float[] mCornerRadii;
    private Drawable mDrawable;
    private boolean mHasColorFilter;
    private boolean mIsOval;
    private boolean mMutateBackground;
    private int mResource;
    private ImageView.ScaleType mScaleType;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;

    /* JADX INFO: renamed from: tech.sud.gip.core.view.round.SudRoundedImageView$1 */
    public static /* synthetic */ class C225141 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            $SwitchMap$android$widget$ImageView$ScaleType = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public SudRoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.mCornerRadii = fArr;
        this.mBorderColor = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.mBorderWidth = 0.0f;
        this.mColorFilter = null;
        this.mColorMod = false;
        this.mHasColorFilter = false;
        this.mIsOval = false;
        this.mMutateBackground = false;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        this.mScaleType = scaleType;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C22511R.styleable.fsm_mgp_SudRoundedImageView, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(C22511R.styleable.fsm_mgp_SudRoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(SCALE_TYPES[i2]);
        } else {
            setScaleType(scaleType);
        }
        float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_corner_radius, -1);
        fArr[0] = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_corner_radius_top_left, -1);
        fArr[1] = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_corner_radius_top_right, -1);
        fArr[2] = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_corner_radius_bottom_right, -1);
        fArr[3] = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_corner_radius_bottom_left, -1);
        boolean z = false;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = this.mCornerRadii;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length = this.mCornerRadii.length;
            for (int i4 = 0; i4 < length; i4++) {
                this.mCornerRadii[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_border_width, -1);
        this.mBorderWidth = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.mBorderWidth = 0.0f;
        }
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_border_color);
        this.mBorderColor = colorStateList;
        if (colorStateList == null) {
            this.mBorderColor = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.mMutateBackground = typedArrayObtainStyledAttributes.getBoolean(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_mutate_background, false);
        this.mIsOval = typedArrayObtainStyledAttributes.getBoolean(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_oval, false);
        this.isSquare = typedArrayObtainStyledAttributes.getBoolean(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_square, false);
        int i5 = typedArrayObtainStyledAttributes.getInt(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(parseTileMode(i5));
            setTileModeY(parseTileMode(i5));
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(parseTileMode(i6));
        }
        int i7 = typedArrayObtainStyledAttributes.getInt(C22511R.styleable.fsm_mgp_SudRoundedImageView_sud_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(parseTileMode(i7));
        }
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void applyColorMod() {
        Drawable drawable = this.mDrawable;
        if (drawable == null || !this.mColorMod) {
            return;
        }
        Drawable drawableMutate = drawable.mutate();
        this.mDrawable = drawableMutate;
        if (this.mHasColorFilter) {
            drawableMutate.setColorFilter(this.mColorFilter);
        }
    }

    private static Shader.TileMode parseTileMode(int i) {
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

    private Drawable resolveResource() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.mResource;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception unused) {
                this.mResource = 0;
            }
        }
        return RoundedDrawable.fromDrawable(drawable);
    }

    private void updateAttrs(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof RoundedDrawable) {
            RoundedDrawable roundedDrawable = (RoundedDrawable) drawable;
            roundedDrawable.setScaleType(this.mScaleType).setBorderWidth(this.mBorderWidth).setBorderColor(this.mBorderColor).setOval(this.mIsOval).setTileModeX(this.mTileModeX).setTileModeY(this.mTileModeY);
            float[] fArr = this.mCornerRadii;
            if (fArr != null) {
                roundedDrawable.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]);
            }
            applyColorMod();
            return;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                updateAttrs(layerDrawable.getDrawable(i));
            }
        }
    }

    private void updateBackgroundDrawableAttrs(boolean z) {
        if (this.mMutateBackground) {
            if (z) {
                this.mBackgroundDrawable = RoundedDrawable.fromDrawable(this.mBackgroundDrawable);
            }
            updateAttrs(this.mBackgroundDrawable);
        }
    }

    private void updateDrawableAttrs() {
        updateAttrs(this.mDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.mBorderColor.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.mBorderColor;
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float fMax = 0.0f;
        for (float f : this.mCornerRadii) {
            fMax = Math.max(f, fMax);
        }
        return fMax;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public Shader.TileMode getTileModeX() {
        return this.mTileModeX;
    }

    public Shader.TileMode getTileModeY() {
        return this.mTileModeY;
    }

    public boolean isOval() {
        return this.mIsOval;
    }

    public void mutateBackground(boolean z) {
        if (this.mMutateBackground == z) {
            return;
        }
        this.mMutateBackground = z;
        updateBackgroundDrawableAttrs(true);
        invalidate();
    }

    public boolean mutatesBackground() {
        return this.mMutateBackground;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.isSquare) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.mBackgroundDrawable = drawable;
        updateBackgroundDrawableAttrs(true);
        super.setBackgroundDrawable(this.mBackgroundDrawable);
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.mBorderColor.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        }
        this.mBorderColor = colorStateList;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        if (this.mBorderWidth > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f) {
        if (this.mBorderWidth == f) {
            return;
        }
        this.mBorderWidth = f;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mColorFilter != colorFilter) {
            this.mColorFilter = colorFilter;
            this.mHasColorFilter = true;
            this.mColorMod = true;
            applyColorMod();
            invalidate();
        }
    }

    public void setCornerRadius(float f, float f2, float f3, float f4) {
        float[] fArr = this.mCornerRadii;
        if (fArr[0] == f && fArr[1] == f2 && fArr[2] == f3 && fArr[3] == f4) {
            return;
        }
        fArr[0] = f;
        fArr[1] = f2;
        fArr[3] = f4;
        fArr[2] = f3;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setCornerRadiusDimen(int i, int i2) {
        setCornerRadius(i, getResources().getDimensionPixelSize(i2));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.mResource = 0;
        this.mDrawable = RoundedDrawable.fromBitmap(bitmap);
        updateDrawableAttrs();
        super.setImageDrawable(this.mDrawable);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.mResource = 0;
        this.mDrawable = RoundedDrawable.fromDrawable(drawable);
        updateDrawableAttrs();
        super.setImageDrawable(this.mDrawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (this.mResource != i) {
            this.mResource = i;
            this.mDrawable = resolveResource();
            updateDrawableAttrs();
            super.setImageDrawable(this.mDrawable);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.mIsOval = z;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setRadius(int i) {
        int length = this.mCornerRadii.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mCornerRadii[i2] = i;
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            switch (C225141.$SwitchMap$android$widget$ImageView$ScaleType[scaleType.ordinal()]) {
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
            updateDrawableAttrs();
            updateBackgroundDrawableAttrs(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.mTileModeX == tileMode) {
            return;
        }
        this.mTileModeX = tileMode;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.mTileModeY == tileMode) {
            return;
        }
        this.mTileModeY = tileMode;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public float getCornerRadius(int i) {
        return this.mCornerRadii[i];
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        setCornerRadius(dimension, dimension, dimension, dimension);
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setCornerRadius(int i, float f) {
        float[] fArr = this.mCornerRadii;
        if (fArr[i] == f) {
            return;
        }
        fArr[i] = f;
        updateDrawableAttrs();
        updateBackgroundDrawableAttrs(false);
        invalidate();
    }

    public void setCornerRadius(float f) {
        setCornerRadius(f, f, f, f);
    }

    public SudRoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SudRoundedImageView(Context context) {
        super(context);
        this.mCornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.mBorderColor = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.mBorderWidth = 0.0f;
        this.mColorFilter = null;
        this.mColorMod = false;
        this.mHasColorFilter = false;
        this.mIsOval = false;
        this.mMutateBackground = false;
        this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        Shader.TileMode tileMode = DEFAULT_TILE_MODE;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
    }
}
