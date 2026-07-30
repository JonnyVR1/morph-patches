package tech.sud.gip.core.view.round;

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
import java.util.HashSet;
import p153l.hnd0;
import p153l.wg3;

/* JADX INFO: loaded from: classes3.dex */
public class RoundedDrawable extends Drawable {
    public static final int DEFAULT_BORDER_COLOR = -16777216;
    public static final String TAG = "RoundedDrawable";
    private final Bitmap mBitmap;
    private final int mBitmapHeight;
    private final Paint mBitmapPaint;
    private final RectF mBitmapRect;
    private final int mBitmapWidth;
    private ColorStateList mBorderColor;
    private final Paint mBorderPaint;
    private final RectF mBorderRect;
    private float mBorderWidth;
    private float mCornerRadius;
    private final boolean[] mCornersRounded;
    private boolean mOval;
    private boolean mRebuildShader;
    private ImageView.ScaleType mScaleType;
    private final Matrix mShaderMatrix;
    private final RectF mSquareCornersRect;
    private Shader.TileMode mTileModeX;
    private Shader.TileMode mTileModeY;
    private final RectF mBounds = new RectF();
    private final RectF mDrawableRect = new RectF();

    /* JADX INFO: renamed from: tech.sud.gip.core.view.round.RoundedDrawable$1 */
    public static /* synthetic */ class C225121 {
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
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedDrawable(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.mBitmapRect = rectF;
        this.mBorderRect = new RectF();
        this.mShaderMatrix = new Matrix();
        this.mSquareCornersRect = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.mTileModeX = tileMode;
        this.mTileModeY = tileMode;
        this.mRebuildShader = true;
        this.mCornerRadius = 0.0f;
        this.mCornersRounded = new boolean[]{true, true, true, true};
        this.mOval = false;
        this.mBorderWidth = 0.0f;
        this.mBorderColor = ColorStateList.valueOf(DEFAULT_BORDER_COLOR);
        this.mScaleType = ImageView.ScaleType.FIT_CENTER;
        this.mBitmap = bitmap;
        int width = bitmap.getWidth();
        this.mBitmapWidth = width;
        int height = bitmap.getHeight();
        this.mBitmapHeight = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.mBitmapPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.mBorderPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.mBorderColor.getColorForState(getState(), DEFAULT_BORDER_COLOR));
        paint2.setStrokeWidth(this.mBorderWidth);
    }

    private static boolean all(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    private static boolean any(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap drawableToBitmap(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static RoundedDrawable fromBitmap(Bitmap bitmap) {
        if (bitmap != null) {
            return new RoundedDrawable(bitmap);
        }
        return null;
    }

    public static Drawable fromDrawable(Drawable drawable) {
        if (drawable == null || (drawable instanceof RoundedDrawable)) {
            return drawable;
        }
        if (!(drawable instanceof LayerDrawable)) {
            Bitmap bitmapDrawableToBitmap = drawableToBitmap(drawable);
            return bitmapDrawableToBitmap != null ? new RoundedDrawable(bitmapDrawableToBitmap) : drawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        for (int i = 0; i < numberOfLayers; i++) {
            layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), fromDrawable(layerDrawable.getDrawable(i)));
        }
        return layerDrawable;
    }

    private static boolean only(int i, boolean[] zArr) {
        int length = zArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                return true;
            }
            if (zArr[i2] != (i2 == i)) {
                return false;
            }
            i2++;
        }
    }

    private void redrawBitmapForSquareCorners(Canvas canvas) {
        if (all(this.mCornersRounded) || this.mCornerRadius == 0.0f) {
            return;
        }
        RectF rectF = this.mDrawableRect;
        float f = rectF.left;
        float f2 = rectF.top;
        float fWidth = rectF.width() + f;
        float fHeight = this.mDrawableRect.height() + f2;
        float f3 = this.mCornerRadius;
        if (!this.mCornersRounded[0]) {
            this.mSquareCornersRect.set(f, f2, f + f3, f2 + f3);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (!this.mCornersRounded[1]) {
            this.mSquareCornersRect.set(fWidth - f3, f2, fWidth, f3);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (!this.mCornersRounded[2]) {
            this.mSquareCornersRect.set(fWidth - f3, fHeight - f3, fWidth, fHeight);
            canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
        }
        if (this.mCornersRounded[3]) {
            return;
        }
        this.mSquareCornersRect.set(f, fHeight - f3, f3 + f, fHeight);
        canvas.drawRect(this.mSquareCornersRect, this.mBitmapPaint);
    }

    private void redrawBorderForSquareCorners(Canvas canvas) {
        float f;
        float f2;
        if (all(this.mCornersRounded) || this.mCornerRadius == 0.0f) {
            return;
        }
        RectF rectF = this.mDrawableRect;
        float f3 = rectF.left;
        float f4 = rectF.top;
        float fWidth = rectF.width() + f3;
        float fHeight = this.mDrawableRect.height() + f4;
        float f5 = this.mCornerRadius;
        float f6 = this.mBorderWidth / 2.0f;
        if (this.mCornersRounded[0]) {
            f = f4;
        } else {
            f = f4;
            canvas.drawLine(f3 - f6, f4, f3 + f5, f, this.mBorderPaint);
            canvas.drawLine(f3, f - f6, f3, f + f5, this.mBorderPaint);
        }
        if (!this.mCornersRounded[1]) {
            float f7 = f;
            canvas.drawLine((fWidth - f5) - f6, f7, fWidth, f, this.mBorderPaint);
            canvas.drawLine(fWidth, f7 - f6, fWidth, f7 + f5, this.mBorderPaint);
            fWidth = fWidth;
        }
        if (this.mCornersRounded[2]) {
            f2 = fHeight;
        } else {
            canvas.drawLine((fWidth - f5) - f6, fHeight, fWidth + f6, fHeight, this.mBorderPaint);
            float f8 = fWidth;
            canvas.drawLine(f8, fHeight - f5, fWidth, fHeight, this.mBorderPaint);
            f2 = fHeight;
        }
        if (this.mCornersRounded[3]) {
            return;
        }
        canvas.drawLine(f3 - f6, f2, f3 + f5, f2, this.mBorderPaint);
        canvas.drawLine(f3, f2 - f5, f3, f2, this.mBorderPaint);
    }

    private void updateShaderMatrix() {
        float fWidth;
        float fHeight;
        int i = C225121.$SwitchMap$android$widget$ImageView$ScaleType[this.mScaleType.ordinal()];
        if (i == 1) {
            this.mBorderRect.set(this.mBounds);
            RectF rectF = this.mBorderRect;
            float f = this.mBorderWidth / 2.0f;
            rectF.inset(f, f);
            this.mShaderMatrix.reset();
            this.mShaderMatrix.setTranslate((int) (((this.mBorderRect.width() - this.mBitmapWidth) * 0.5f) + 0.5f), (int) (((this.mBorderRect.height() - this.mBitmapHeight) * 0.5f) + 0.5f));
        } else if (i == 2) {
            this.mBorderRect.set(this.mBounds);
            RectF rectF2 = this.mBorderRect;
            float f2 = this.mBorderWidth / 2.0f;
            rectF2.inset(f2, f2);
            this.mShaderMatrix.reset();
            float fHeight2 = this.mBorderRect.height() * this.mBitmapWidth;
            float fWidth2 = this.mBorderRect.width() * this.mBitmapHeight;
            RectF rectF3 = this.mBorderRect;
            float fWidth3 = 0.0f;
            if (fHeight2 > fWidth2) {
                fWidth = rectF3.height() / this.mBitmapHeight;
                fWidth3 = (this.mBorderRect.width() - (this.mBitmapWidth * fWidth)) * 0.5f;
                fHeight = 0.0f;
            } else {
                fWidth = rectF3.width() / this.mBitmapWidth;
                fHeight = (this.mBorderRect.height() - (this.mBitmapHeight * fWidth)) * 0.5f;
            }
            this.mShaderMatrix.setScale(fWidth, fWidth);
            Matrix matrix = this.mShaderMatrix;
            float f3 = this.mBorderWidth / 2.0f;
            matrix.postTranslate(((int) (fWidth3 + 0.5f)) + f3, f3 + ((int) (fHeight + 0.5f)));
        } else if (i == 3) {
            this.mShaderMatrix.reset();
            float fMin = (((float) this.mBitmapWidth) > this.mBounds.width() || ((float) this.mBitmapHeight) > this.mBounds.height()) ? Math.min(this.mBounds.width() / this.mBitmapWidth, this.mBounds.height() / this.mBitmapHeight) : 1.0f;
            float fWidth4 = (int) (((this.mBounds.width() - (this.mBitmapWidth * fMin)) * 0.5f) + 0.5f);
            float fHeight3 = (int) (((this.mBounds.height() - (this.mBitmapHeight * fMin)) * 0.5f) + 0.5f);
            this.mShaderMatrix.setScale(fMin, fMin);
            this.mShaderMatrix.postTranslate(fWidth4, fHeight3);
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF4 = this.mBorderRect;
            float f4 = this.mBorderWidth / 2.0f;
            rectF4.inset(f4, f4);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.END);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF5 = this.mBorderRect;
            float f5 = this.mBorderWidth / 2.0f;
            rectF5.inset(f5, f5);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        } else if (i != 6) {
            RectF rectF6 = this.mBorderRect;
            if (i != 7) {
                rectF6.set(this.mBitmapRect);
                this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.CENTER);
                this.mShaderMatrix.mapRect(this.mBorderRect);
                RectF rectF7 = this.mBorderRect;
                float f6 = this.mBorderWidth / 2.0f;
                rectF7.inset(f6, f6);
                this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
            } else {
                rectF6.set(this.mBounds);
                RectF rectF8 = this.mBorderRect;
                float f7 = this.mBorderWidth / 2.0f;
                rectF8.inset(f7, f7);
                this.mShaderMatrix.reset();
                this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
            }
        } else {
            this.mBorderRect.set(this.mBitmapRect);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBounds, Matrix.ScaleToFit.START);
            this.mShaderMatrix.mapRect(this.mBorderRect);
            RectF rectF9 = this.mBorderRect;
            float f8 = this.mBorderWidth / 2.0f;
            rectF9.inset(f8, f8);
            this.mShaderMatrix.setRectToRect(this.mBitmapRect, this.mBorderRect, Matrix.ScaleToFit.FILL);
        }
        this.mDrawableRect.set(this.mBorderRect);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mRebuildShader) {
            BitmapShader bitmapShader = new BitmapShader(this.mBitmap, this.mTileModeX, this.mTileModeY);
            Shader.TileMode tileMode = this.mTileModeX;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.mTileModeY == tileMode2) {
                bitmapShader.setLocalMatrix(this.mShaderMatrix);
            }
            this.mBitmapPaint.setShader(bitmapShader);
            this.mRebuildShader = false;
        }
        if (this.mOval) {
            float f = this.mBorderWidth;
            RectF rectF = this.mDrawableRect;
            if (f <= 0.0f) {
                canvas.drawOval(rectF, this.mBitmapPaint);
                return;
            } else {
                canvas.drawOval(rectF, this.mBitmapPaint);
                canvas.drawOval(this.mBorderRect, this.mBorderPaint);
                return;
            }
        }
        if (!any(this.mCornersRounded)) {
            canvas.drawRect(this.mDrawableRect, this.mBitmapPaint);
            if (this.mBorderWidth > 0.0f) {
                canvas.drawRect(this.mBorderRect, this.mBorderPaint);
                return;
            }
            return;
        }
        float f2 = this.mCornerRadius;
        float f3 = this.mBorderWidth;
        RectF rectF2 = this.mDrawableRect;
        if (f3 <= 0.0f) {
            canvas.drawRoundRect(rectF2, f2, f2, this.mBitmapPaint);
            redrawBitmapForSquareCorners(canvas);
        } else {
            canvas.drawRoundRect(rectF2, f2, f2, this.mBitmapPaint);
            canvas.drawRoundRect(this.mBorderRect, f2, f2, this.mBorderPaint);
            redrawBitmapForSquareCorners(canvas);
            redrawBorderForSquareCorners(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mBitmapPaint.getAlpha();
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

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mBitmapPaint.getColorFilter();
    }

    public float getCornerRadius(int i) {
        if (this.mCornersRounded[i]) {
            return this.mCornerRadius;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mBitmapHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mBitmapWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ImageView.ScaleType getScaleType() {
        return this.mScaleType;
    }

    public Bitmap getSourceBitmap() {
        return this.mBitmap;
    }

    public Shader.TileMode getTileModeX() {
        return this.mTileModeX;
    }

    public Shader.TileMode getTileModeY() {
        return this.mTileModeY;
    }

    public boolean isOval() {
        return this.mOval;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.mBorderColor.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.mBounds.set(rect);
        updateShaderMatrix();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.mBorderColor.getColorForState(iArr, 0);
        if (this.mBorderPaint.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.mBorderPaint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.mBitmapPaint.setAlpha(i);
        invalidateSelf();
    }

    public RoundedDrawable setBorderColor(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.mBorderColor = colorStateList;
        this.mBorderPaint.setColor(colorStateList.getColorForState(getState(), DEFAULT_BORDER_COLOR));
        return this;
    }

    public RoundedDrawable setBorderWidth(float f) {
        if (this.mBorderWidth != f) {
            this.mBorderWidth = f;
            this.mBorderPaint.setStrokeWidth(f);
            updateShaderMatrix();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mBitmapPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public RoundedDrawable setCornerRadius(float f, float f2, float f3, float f4) {
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
            this.mCornerRadius = 0.0f;
        } else {
            float fFloatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(fFloatValue) || Float.isNaN(fFloatValue) || fFloatValue < 0.0f) {
                hnd0.m136059a("Invalid radius value: ", fFloatValue);
                return null;
            }
            this.mCornerRadius = fFloatValue;
        }
        boolean[] zArr = this.mCornersRounded;
        zArr[0] = f > 0.0f;
        zArr[1] = f2 > 0.0f;
        zArr[2] = f3 > 0.0f;
        zArr[3] = f4 > 0.0f;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.mBitmapPaint.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.mBitmapPaint.setFilterBitmap(z);
        invalidateSelf();
    }

    public RoundedDrawable setOval(boolean z) {
        this.mOval = z;
        return this;
    }

    public RoundedDrawable setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.mScaleType != scaleType) {
            this.mScaleType = scaleType;
            updateShaderMatrix();
        }
        return this;
    }

    public RoundedDrawable setTileModeX(Shader.TileMode tileMode) {
        if (this.mTileModeX != tileMode) {
            this.mTileModeX = tileMode;
            this.mRebuildShader = true;
            invalidateSelf();
        }
        return this;
    }

    public RoundedDrawable setTileModeY(Shader.TileMode tileMode) {
        if (this.mTileModeY != tileMode) {
            this.mTileModeY = tileMode;
            this.mRebuildShader = true;
            invalidateSelf();
        }
        return this;
    }

    public Bitmap toBitmap() {
        return drawableToBitmap(this);
    }

    public float getCornerRadius() {
        return this.mCornerRadius;
    }

    public RoundedDrawable setBorderColor(int i) {
        return setBorderColor(ColorStateList.valueOf(i));
    }

    public RoundedDrawable setCornerRadius(int i, float f) {
        if (f != 0.0f) {
            float f2 = this.mCornerRadius;
            if (f2 != 0.0f && f2 != f) {
                wg3.m206174a("Multiple nonzero corner radii not yet supported.");
                return null;
            }
        }
        if (f == 0.0f) {
            if (only(i, this.mCornersRounded)) {
                this.mCornerRadius = 0.0f;
            }
            this.mCornersRounded[i] = false;
            return this;
        }
        if (this.mCornerRadius == 0.0f) {
            this.mCornerRadius = f;
        }
        this.mCornersRounded[i] = true;
        return this;
    }

    public RoundedDrawable setCornerRadius(float f) {
        setCornerRadius(f, f, f, f);
        return this;
    }
}
