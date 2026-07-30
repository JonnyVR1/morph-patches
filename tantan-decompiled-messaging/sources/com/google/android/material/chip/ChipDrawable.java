package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import com.google.android.gms.common.api.Api;
import com.google.android.material.C2466R;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p149l.ge5;
import p149l.kbe;
import p149l.nu0;
import p149l.ww2;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes7.dex */
public class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback, TextDrawableHelper.TextDrawableDelegate {
    private static final boolean DEBUG = false;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;

    @Nullable
    private Drawable checkedIcon;
    private boolean checkedIconVisible;

    @Nullable
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;

    @Nullable
    private Drawable chipIcon;
    private float chipIconSize;

    @Nullable
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;

    @Nullable
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;

    @Nullable
    private ColorStateList chipSurfaceColor;

    @Nullable
    private Drawable closeIcon;

    @Nullable
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;

    @Nullable
    private Drawable closeIconRipple;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;

    @Nullable
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;

    @Nullable
    private ColorFilter colorFilter;

    @Nullable
    private ColorStateList compatRippleColor;

    @NonNull
    private final Context context;
    private boolean currentChecked;

    @ColorInt
    private int currentChipBackgroundColor;

    @ColorInt
    private int currentChipStrokeColor;

    @ColorInt
    private int currentChipSurfaceColor;

    @ColorInt
    private int currentCompatRippleColor;

    @ColorInt
    private int currentCompositeSurfaceBackgroundColor;

    @ColorInt
    private int currentTextColor;

    @ColorInt
    private int currentTint;

    @Nullable
    private final Paint debugPaint;

    @NonNull
    private WeakReference<Delegate> delegate;
    private final Paint.FontMetrics fontMetrics;
    private boolean hasChipIconTint;

    @Nullable
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private boolean isShapeThemingEnabled;
    private int maxWidth;
    private final PointF pointF;
    private final RectF rectF;

    @Nullable
    private ColorStateList rippleColor;
    private final Path shapePath;
    private boolean shouldDrawText;

    @Nullable
    private MotionSpec showMotionSpec;

    @Nullable
    private CharSequence text;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;
    private float textEndPadding;
    private float textStartPadding;

    @Nullable
    private ColorStateList tint;

    @Nullable
    private PorterDuffColorFilter tintFilter;

    @Nullable
    private PorterDuff.Mode tintMode;
    private TextUtils.TruncateAt truncateAt;
    private boolean useCompatRipple;
    private static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    private static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private ChipDrawable(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        super(context, attributeSet, i, i2);
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference<>(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
            closeIconRippleMask.setTint(-1);
        }
    }

    private void applyChildDrawable(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        kbe.m145279m(drawable, kbe.m145272f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            if (drawable.isStateful()) {
                drawable.setState(getCloseIconState());
            }
            kbe.m145281o(drawable, this.closeIconTint);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            kbe.m145281o(drawable2, this.chipIconTint);
        }
    }

    private void calculateChipIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f = this.chipStartPadding + this.iconStartPadding;
            if (kbe.m145272f(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + this.chipIconSize;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - this.chipIconSize;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.chipIconSize;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void calculateChipTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (kbe.m145272f(this) == 0) {
                rectF.right = rect.right - f;
            } else {
                rectF.left = rect.left + f;
            }
        }
    }

    private void calculateCloseIconBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding;
            if (kbe.m145272f(this) == 0) {
                float f2 = rect.right - f;
                rectF.right = f2;
                rectF.left = f2 - this.closeIconSize;
            } else {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + this.closeIconSize;
            }
            float fExactCenterY = rect.exactCenterY();
            float f4 = this.closeIconSize;
            float f5 = fExactCenterY - (f4 / 2.0f);
            rectF.top = f5;
            rectF.bottom = f5 + f4;
        }
    }

    private void calculateCloseIconTouchBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (showsCloseIcon()) {
            float f = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (kbe.m145272f(this) == 0) {
                float f2 = rect.right;
                rectF.right = f2;
                rectF.left = f2 - f;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void calculateTextBounds(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float fCalculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (kbe.m145272f(this) == 0) {
                rectF.left = rect.left + fCalculateChipIconWidth;
                rectF.right = rect.right - fCalculateCloseIconWidth;
            } else {
                rectF.left = rect.left + fCalculateCloseIconWidth;
                rectF.right = rect.right - fCalculateChipIconWidth;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        Paint.FontMetrics fontMetrics = this.fontMetrics;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private boolean canShowCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.checkable;
    }

    @NonNull
    public static ChipDrawable createFromAttributes(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context, attributeSet, i, i2);
        chipDrawable.loadFromAttributes(attributeSet, i, i2);
        return chipDrawable;
    }

    @NonNull
    public static ChipDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i, "chip");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = C2466R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return createFromAttributes(context, drawableXml, C2466R.attr.chipStandaloneStyle, styleAttribute);
    }

    private void drawCheckedIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void drawChipBackground(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawChipIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f, -f2);
        }
    }

    private void drawChipStroke(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.chipStrokeWidth <= 0.0f || this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipStrokeColor);
        this.chipPaint.setStyle(Paint.Style.STROKE);
        if (!this.isShapeThemingEnabled) {
            this.chipPaint.setColorFilter(getTintColorFilter());
        }
        RectF rectF = this.rectF;
        float f = rect.left;
        float f2 = this.chipStrokeWidth;
        rectF.set(f + (f2 / 2.0f), rect.top + (f2 / 2.0f), rect.right - (f2 / 2.0f), rect.bottom - (f2 / 2.0f));
        float f3 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
        canvas.drawRoundRect(this.rectF, f3, f3, this.chipPaint);
    }

    private void drawChipSurface(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.isShapeThemingEnabled) {
            return;
        }
        this.chipPaint.setColor(this.currentChipSurfaceColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
    }

    private void drawCloseIcon(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            RectF rectF = this.rectF;
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.translate(f, f2);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.closeIconRipple.setBounds(this.closeIcon.getBounds());
                this.closeIconRipple.jumpToCurrentState();
                this.closeIconRipple.draw(canvas);
            } else {
                this.closeIcon.draw(canvas);
            }
            canvas.translate(-f, -f2);
        }
    }

    private void drawCompatRipple(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        if (!this.isShapeThemingEnabled) {
            canvas.drawRoundRect(this.rectF, getChipCornerRadius(), getChipCornerRadius(), this.chipPaint);
        } else {
            calculatePathForSize(new RectF(rect), this.shapePath);
            super.drawShape(canvas, this.chipPaint, this.shapePath, getBoundsAsRectF());
        }
    }

    private void drawDebug(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.debugPaint;
        if (paint != null) {
            paint.setColor(ge5.m125678o(RoundedDrawable.DEFAULT_BORDER_COLOR, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.text != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.debugPaint);
            } else {
                canvas2 = canvas;
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas2.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ge5.m125678o(-65536, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas2.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ge5.m125678o(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas2.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.text != null) {
            Paint.Align alignCalculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textDrawableHelper.getTextAppearance() != null) {
                this.textDrawableHelper.getTextPaint().drawableState = getState();
                this.textDrawableHelper.updateTextPaintDrawState(this.context);
            }
            this.textDrawableHelper.getTextPaint().setTextAlign(alignCalculateTextOriginAndAlignment);
            int iSave = 0;
            boolean z = Math.round(this.textDrawableHelper.getTextWidth(getText().toString())) > Math.round(this.rectF.width());
            if (z) {
                iSave = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequenceEllipsize = this.text;
            if (z && this.truncateAt != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.textDrawableHelper.getTextPaint(), this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.pointF;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.textDrawableHelper.getTextPaint());
            if (z) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Nullable
    private ColorFilter getTintColorFilter() {
        ColorFilter colorFilter = this.colorFilter;
        return colorFilter != null ? colorFilter : this.tintFilter;
    }

    private static boolean hasState(@Nullable int[] iArr, @AttrRes int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void loadFromAttributes(@Nullable AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, C2466R.styleable.Chip, i, i2, new int[0]);
        this.isShapeThemingEnabled = typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.Chip_shapeAppearance);
        setChipSurfaceColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_chipSurfaceColor));
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_chipBackgroundColor));
        setChipMinHeight(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipMinHeight, 0.0f));
        if (typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.Chip_chipCornerRadius)) {
            setChipCornerRadius(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipCornerRadius, 0.0f));
        }
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_chipStrokeColor));
        setChipStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipStrokeWidth, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_rippleColor));
        setText(typedArrayObtainStyledAttributes.getText(C2466R.styleable.Chip_android_text));
        setTextAppearance(MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_android_textAppearance));
        int i3 = typedArrayObtainStyledAttributes.getInt(C2466R.styleable.Chip_android_ellipsize, 0);
        if (i3 == 1) {
            setEllipsize(TextUtils.TruncateAt.START);
        } else if (i3 == 2) {
            setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i3 == 3) {
            setEllipsize(TextUtils.TruncateAt.END);
        }
        setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "chipIconVisible") == null) {
            setChipIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_chipIconEnabled, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_chipIcon));
        if (typedArrayObtainStyledAttributes.hasValue(C2466R.styleable.Chip_chipIconTint)) {
            setChipIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_chipIconTint));
        }
        setChipIconSize(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipIconSize, 0.0f));
        setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "closeIconVisible") == null) {
            setCloseIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_closeIconEnabled, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_closeIcon));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_closeIconTint));
        setCloseIconSize(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_closeIconSize, 0.0f));
        setCheckable(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_android_checkable, false));
        setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconEnabled") != null && attributeSet.getAttributeValue(NAMESPACE_APP, "checkedIconVisible") == null) {
            setCheckedIconVisible(typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.Chip_checkedIconEnabled, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_checkedIcon));
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_showMotionSpec));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, typedArrayObtainStyledAttributes, C2466R.styleable.Chip_hideMotionSpec));
        setChipStartPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipStartPadding, 0.0f));
        setIconStartPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_iconStartPadding, 0.0f));
        setIconEndPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_iconEndPadding, 0.0f));
        setTextStartPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_textStartPadding, 0.0f));
        setTextEndPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_textEndPadding, 0.0f));
        setCloseIconStartPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_closeIconStartPadding, 0.0f));
        setCloseIconEndPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_closeIconEndPadding, 0.0f));
        setChipEndPadding(typedArrayObtainStyledAttributes.getDimension(C2466R.styleable.Chip_chipEndPadding, 0.0f));
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(C2466R.styleable.Chip_android_maxWidth, Api.BaseClientBuilder.API_PRIORITY_OTHER));
        typedArrayObtainStyledAttributes.recycle();
    }

    private boolean onStateChange(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.chipSurfaceColor;
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, this.currentChipSurfaceColor) : 0;
        boolean state = true;
        if (this.currentChipSurfaceColor != colorForState) {
            this.currentChipSurfaceColor = colorForState;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.chipBackgroundColor;
        int colorForState2 = colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipBackgroundColor) : 0;
        if (this.currentChipBackgroundColor != colorForState2) {
            this.currentChipBackgroundColor = colorForState2;
            zOnStateChange = true;
        }
        int iLayer = MaterialColors.layer(colorForState, colorForState2);
        if ((this.currentCompositeSurfaceBackgroundColor != iLayer) | (getFillColor() == null)) {
            this.currentCompositeSurfaceBackgroundColor = iLayer;
            setFillColor(ColorStateList.valueOf(iLayer));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipStrokeColor;
        int colorForState3 = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState3) {
            this.currentChipStrokeColor = colorForState3;
            zOnStateChange = true;
        }
        int colorForState4 = (this.compatRippleColor == null || !RippleUtils.shouldDrawRippleCompat(iArr)) ? 0 : this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
        if (this.currentCompatRippleColor != colorForState4) {
            this.currentCompatRippleColor = colorForState4;
            if (this.useCompatRipple) {
                zOnStateChange = true;
            }
        }
        int colorForState5 = (this.textDrawableHelper.getTextAppearance() == null || this.textDrawableHelper.getTextAppearance().textColor == null) ? 0 : this.textDrawableHelper.getTextAppearance().textColor.getColorForState(iArr, this.currentTextColor);
        if (this.currentTextColor != colorForState5) {
            this.currentTextColor = colorForState5;
            zOnStateChange = true;
        }
        boolean z2 = hasState(getState(), R.attr.state_checked) && this.checkable;
        if (this.currentChecked == z2 || this.checkedIcon == null) {
            z = false;
        } else {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.currentChecked = z2;
            if (fCalculateChipIconWidth != calculateChipIconWidth()) {
                zOnStateChange = true;
                z = true;
            } else {
                z = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.tint;
        int colorForState6 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentTint) : 0;
        if (this.currentTint != colorForState6) {
            this.currentTint = colorForState6;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, this.tintMode);
        } else {
            state = zOnStateChange;
        }
        if (isStateful(this.chipIcon)) {
            state |= this.chipIcon.setState(iArr);
        }
        if (isStateful(this.checkedIcon)) {
            state |= this.checkedIcon.setState(iArr);
        }
        if (isStateful(this.closeIcon)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.closeIcon.setState(iArr3);
        }
        if (RippleUtils.USE_FRAMEWORK_RIPPLE && isStateful(this.closeIconRipple)) {
            state |= this.closeIconRipple.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z) {
            onSizeChange();
        }
        return state;
    }

    private void setChipSurfaceColor(@Nullable ColorStateList colorStateList) {
        if (this.chipSurfaceColor != colorStateList) {
            this.chipSurfaceColor = colorStateList;
            onStateChange(getState());
        }
    }

    private boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    private boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    private boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    private void unapplyChildDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void updateCompatRippleColor() {
        this.compatRippleColor = this.useCompatRipple ? RippleUtils.sanitizeRippleDrawableColor(this.rippleColor) : null;
    }

    @TargetApi(21)
    private void updateFrameworkCloseIconRipple() {
        this.closeIconRipple = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(getRippleColor()), this.closeIcon, closeIconRippleMask);
    }

    public float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + this.chipIconSize + this.iconEndPadding;
        }
        return 0.0f;
    }

    public float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    @NonNull
    public Paint.Align calculateTextOriginAndAlignment(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.text != null) {
            float fCalculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (kbe.m145272f(this) == 0) {
                pointF.x = rect.left + fCalculateChipIconWidth;
            } else {
                pointF.x = rect.right - fCalculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - calculateTextCenterFromBaseline();
        }
        return align;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int iSaveLayerAlpha;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.alpha;
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = CanvasCompat.saveLayerAlpha(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        drawChipSurface(canvas2, bounds);
        drawChipBackground(canvas2, bounds);
        if (this.isShapeThemingEnabled) {
            super.draw(canvas2);
        }
        drawChipStroke(canvas2, bounds);
        drawCompatRipple(canvas2, bounds);
        drawChipIcon(canvas2, bounds);
        drawCheckedIcon(canvas2, bounds);
        if (this.shouldDrawText) {
            drawText(canvas2, bounds);
        }
        drawCloseIcon(canvas2, bounds);
        drawDebug(canvas2, bounds);
        if (this.alpha < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.alpha;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    @Nullable
    public Drawable getChipIcon() {
        Drawable drawable = this.chipIcon;
        if (drawable != null) {
            return kbe.m145283q(drawable);
        }
        return null;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(@NonNull RectF rectF) {
        calculateChipTouchBounds(getBounds(), rectF);
    }

    @Nullable
    public Drawable getCloseIcon() {
        Drawable drawable = this.closeIcon;
        if (drawable != null) {
            return kbe.m145283q(drawable);
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(@NonNull RectF rectF) {
        calculateCloseIconTouchBounds(getBounds(), rectF);
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + this.textDrawableHelper.getTextWidth(getText().toString()) + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @Nullable
    public CharSequence getText() {
        return this.text;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    public boolean isShapeThemingEnabled() {
        return this.isShapeThemingEnabled;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor)) {
            return true;
        }
        return (this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textDrawableHelper.getTextAppearance()) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (showsChipIcon()) {
            zOnLayoutDirectionChanged |= kbe.m145279m(this.chipIcon, i);
        }
        if (showsCheckedIcon()) {
            zOnLayoutDirectionChanged |= kbe.m145279m(this.checkedIcon, i);
        }
        if (showsCloseIcon()) {
            zOnLayoutDirectionChanged |= kbe.m145279m(this.closeIcon, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (showsChipIcon()) {
            zOnLevelChange |= this.chipIcon.setLevel(i);
        }
        if (showsCheckedIcon()) {
            zOnLevelChange |= this.checkedIcon.setLevel(i);
        }
        if (showsCloseIcon()) {
            zOnLevelChange |= this.closeIcon.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    public void onSizeChange() {
        Delegate delegate = this.delegate.get();
        if (delegate != null) {
            delegate.onChipDrawableSizeChange();
        }
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        onSizeChange();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            float fCalculateChipIconWidth = calculateChipIconWidth();
            if (!z && this.currentChecked) {
                this.currentChecked = false;
            }
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        setCheckable(this.context.getResources().getBoolean(i));
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        setCheckedIcon(nu0.m161424b(this.context, i));
    }

    public void setCheckedIconVisible(boolean z) {
        if (this.checkedIconVisible != z) {
            boolean zShowsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z;
            boolean zShowsCheckedIcon2 = showsCheckedIcon();
            if (zShowsCheckedIcon != zShowsCheckedIcon2) {
                Drawable drawable = this.checkedIcon;
                if (zShowsCheckedIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        setChipBackgroundColor(nu0.m161423a(this.context, i));
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        if (this.chipCornerRadius != f) {
            this.chipCornerRadius = f;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f));
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i) {
        setChipCornerRadius(this.context.getResources().getDimension(i));
    }

    public void setChipEndPadding(float f) {
        if (this.chipEndPadding != f) {
            this.chipEndPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        setChipEndPadding(this.context.getResources().getDimension(i));
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable chipIcon = getChipIcon();
        if (chipIcon != drawable) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? kbe.m145284r(drawable).mutate() : null;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(@DrawableRes int i) {
        setChipIcon(nu0.m161424b(this.context, i));
    }

    public void setChipIconSize(float f) {
        if (this.chipIconSize != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        setChipIconSize(this.context.getResources().getDimension(i));
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                kbe.m145281o(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int i) {
        setChipIconTint(nu0.m161423a(this.context, i));
    }

    public void setChipIconVisible(boolean z) {
        if (this.chipIconVisible != z) {
            boolean zShowsChipIcon = showsChipIcon();
            this.chipIconVisible = z;
            boolean zShowsChipIcon2 = showsChipIcon();
            if (zShowsChipIcon != zShowsChipIcon2) {
                Drawable drawable = this.chipIcon;
                if (zShowsChipIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipMinHeight(float f) {
        if (this.chipMinHeight != f) {
            this.chipMinHeight = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        setChipMinHeight(this.context.getResources().getDimension(i));
    }

    public void setChipStartPadding(float f) {
        if (this.chipStartPadding != f) {
            this.chipStartPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        setChipStartPadding(this.context.getResources().getDimension(i));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        setChipStrokeColor(nu0.m161423a(this.context, i));
    }

    public void setChipStrokeWidth(float f) {
        if (this.chipStrokeWidth != f) {
            this.chipStrokeWidth = f;
            this.chipPaint.setStrokeWidth(f);
            if (this.isShapeThemingEnabled) {
                super.setStrokeWidth(f);
            }
            invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        setChipStrokeWidth(this.context.getResources().getDimension(i));
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable closeIcon = getCloseIcon();
        if (closeIcon != drawable) {
            float fCalculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? kbe.m145284r(drawable).mutate() : null;
            if (RippleUtils.USE_FRAMEWORK_RIPPLE) {
                updateFrameworkCloseIconRipple();
            }
            float fCalculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (fCalculateCloseIconWidth != fCalculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = ww2.m205821c().m205826h(charSequence);
            invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        if (this.closeIconEndPadding != f) {
            this.closeIconEndPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setCloseIconResource(@DrawableRes int i) {
        setCloseIcon(nu0.m161424b(this.context, i));
    }

    public void setCloseIconSize(float f) {
        if (this.closeIconSize != f) {
            this.closeIconSize = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        setCloseIconSize(this.context.getResources().getDimension(i));
    }

    public void setCloseIconStartPadding(float f) {
        if (this.closeIconStartPadding != f) {
            this.closeIconStartPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i));
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                kbe.m145281o(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        setCloseIconTint(nu0.m161423a(this.context, i));
    }

    public void setCloseIconVisible(boolean z) {
        if (this.closeIconVisible != z) {
            boolean zShowsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z;
            boolean zShowsCloseIcon2 = showsCloseIcon();
            if (zShowsCloseIcon != zShowsCloseIcon2) {
                Drawable drawable = this.closeIcon;
                if (zShowsCloseIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate delegate) {
        this.delegate = new WeakReference<>(delegate);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt) {
        this.truncateAt = truncateAt;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setIconEndPadding(float f) {
        if (this.iconEndPadding != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        setIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setIconStartPadding(float f) {
        if (this.iconStartPadding != f) {
            float fCalculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f;
            float fCalculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (fCalculateChipIconWidth != fCalculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        setIconStartPadding(this.context.getResources().getDimension(i));
    }

    public void setMaxWidth(@Px int i) {
        this.maxWidth = i;
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setRippleColorResource(@ColorRes int i) {
        setRippleColor(nu0.m161423a(this.context, i));
    }

    public void setShouldDrawText(boolean z) {
        this.shouldDrawText = z;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
        onSizeChange();
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(new TextAppearance(this.context, i));
    }

    public void setTextEndPadding(float f) {
        if (this.textEndPadding != f) {
            this.textEndPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        setTextEndPadding(this.context.getResources().getDimension(i));
    }

    public void setTextResource(@StringRes int i) {
        setText(this.context.getResources().getString(i));
    }

    public void setTextStartPadding(float f) {
        if (this.textStartPadding != f) {
            this.textStartPadding = f;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        setTextStartPadding(this.context.getResources().getDimension(i));
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z) {
        if (this.useCompatRipple != z) {
            this.useCompatRipple = z;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z, z2);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z, z2);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setChipIconVisible(@BoolRes int i) {
        setChipIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(this.context.getResources().getBoolean(i));
    }

    private static boolean isStateful(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private static boolean isStateful(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean isStateful(@Nullable TextAppearance textAppearance) {
        ColorStateList colorStateList;
        return (textAppearance == null || (colorStateList = textAppearance.textColor) == null || !colorStateList.isStateful()) ? false : true;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, getCloseIconState());
    }
}
