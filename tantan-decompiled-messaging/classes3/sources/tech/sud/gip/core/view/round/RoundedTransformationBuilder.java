package tech.sud.gip.core.view.round;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.animation.Transformation;
import android.widget.ImageView;
import java.util.Arrays;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class RoundedTransformationBuilder {
    private float[] mCornerRadii = {0.0f, 0.0f, 0.0f, 0.0f};
    private boolean mOval = false;
    private float mBorderWidth = 0.0f;
    private ColorStateList mBorderColor = ColorStateList.valueOf(RoundedDrawable.DEFAULT_BORDER_COLOR);
    private ImageView.ScaleType mScaleType = ImageView.ScaleType.FIT_CENTER;
    private final DisplayMetrics mDisplayMetrics = Resources.getSystem().getDisplayMetrics();

    public RoundedTransformationBuilder borderColor(int i) {
        this.mBorderColor = ColorStateList.valueOf(i);
        return this;
    }

    public RoundedTransformationBuilder borderWidth(float f) {
        this.mBorderWidth = f;
        return this;
    }

    public RoundedTransformationBuilder borderWidthDp(float f) {
        this.mBorderWidth = TypedValue.applyDimension(1, f, this.mDisplayMetrics);
        return this;
    }

    public Transformation build() {
        return new Transformation() { // from class: tech.sud.gip.core.view.round.RoundedTransformationBuilder.1
            public String key() {
                return "r:" + Arrays.toString(RoundedTransformationBuilder.this.mCornerRadii) + "b:" + RoundedTransformationBuilder.this.mBorderWidth + "c:" + RoundedTransformationBuilder.this.mBorderColor + "o:" + RoundedTransformationBuilder.this.mOval;
            }

            public Bitmap transform(Bitmap bitmap) {
                RoundedDrawable scaleType = RoundedDrawable.fromBitmap(bitmap).setScaleType(RoundedTransformationBuilder.this.mScaleType);
                float[] fArr = RoundedTransformationBuilder.this.mCornerRadii;
                Bitmap bitmap2 = scaleType.setCornerRadius(fArr[0], fArr[1], fArr[2], fArr[3]).setBorderWidth(RoundedTransformationBuilder.this.mBorderWidth).setBorderColor(RoundedTransformationBuilder.this.mBorderColor).setOval(RoundedTransformationBuilder.this.mOval).toBitmap();
                if (!bitmap.equals(bitmap2)) {
                    bitmap.recycle();
                }
                return bitmap2;
            }
        };
    }

    public RoundedTransformationBuilder cornerRadius(float f) {
        float[] fArr = this.mCornerRadii;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
        return this;
    }

    public RoundedTransformationBuilder cornerRadiusDp(float f) {
        return cornerRadius(TypedValue.applyDimension(1, f, this.mDisplayMetrics));
    }

    public RoundedTransformationBuilder oval(boolean z) {
        this.mOval = z;
        return this;
    }

    public RoundedTransformationBuilder scaleType(ImageView.ScaleType scaleType) {
        this.mScaleType = scaleType;
        return this;
    }

    public RoundedTransformationBuilder borderColor(ColorStateList colorStateList) {
        this.mBorderColor = colorStateList;
        return this;
    }

    public RoundedTransformationBuilder cornerRadiusDp(int i, float f) {
        return cornerRadius(i, TypedValue.applyDimension(1, f, this.mDisplayMetrics));
    }

    public RoundedTransformationBuilder cornerRadius(int i, float f) {
        this.mCornerRadii[i] = f;
        return this;
    }
}
