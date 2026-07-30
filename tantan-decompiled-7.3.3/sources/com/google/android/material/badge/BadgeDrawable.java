package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.StyleableRes;
import androidx.annotation.XmlRes;
import com.google.android.material.C2489R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import p153l.kkl0;

/* JADX INFO: loaded from: classes7.dex */
public class BadgeDrawable extends Drawable implements TextDrawableHelper.TextDrawableDelegate {
    private static final int BADGE_NUMBER_NONE = -1;
    public static final int BOTTOM_END = 8388693;
    public static final int BOTTOM_START = 8388691;
    static final String DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX = "+";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;

    @StyleRes
    private static final int DEFAULT_STYLE = C2489R.style.Widget_MaterialComponents_Badge;

    @AttrRes
    private static final int DEFAULT_THEME_ATTR = C2489R.attr.badgeStyle;
    private static final int MAX_CIRCULAR_BADGE_NUMBER_COUNT = 9;
    public static final int TOP_END = 8388661;
    public static final int TOP_START = 8388659;

    @Nullable
    private WeakReference<View> anchorViewRef;

    @NonNull
    private final Rect badgeBounds;
    private float badgeCenterX;
    private float badgeCenterY;
    private final float badgeRadius;
    private final float badgeWidePadding;
    private final float badgeWithTextRadius;

    @NonNull
    private final WeakReference<Context> contextRef;
    private float cornerRadius;

    @Nullable
    private WeakReference<ViewGroup> customBadgeParentRef;
    private float halfBadgeHeight;
    private float halfBadgeWidth;
    private int maxBadgeNumber;

    @NonNull
    private final SavedState savedState;

    @NonNull
    private final MaterialShapeDrawable shapeDrawable;

    @NonNull
    private final TextDrawableHelper textDrawableHelper;

    @Retention(RetentionPolicy.SOURCE)
    public @interface BadgeGravity {
    }

    private BadgeDrawable(@NonNull Context context) {
        this.contextRef = new WeakReference<>(context);
        ThemeEnforcement.checkMaterialTheme(context);
        Resources resources = context.getResources();
        this.badgeBounds = new Rect();
        this.shapeDrawable = new MaterialShapeDrawable();
        this.badgeRadius = resources.getDimensionPixelSize(C2489R.dimen.mtrl_badge_radius);
        this.badgeWidePadding = resources.getDimensionPixelSize(C2489R.dimen.mtrl_badge_long_text_horizontal_padding);
        this.badgeWithTextRadius = resources.getDimensionPixelSize(C2489R.dimen.mtrl_badge_with_text_radius);
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        textDrawableHelper.getTextPaint().setTextAlign(Paint.Align.CENTER);
        this.savedState = new SavedState(context);
        setTextAppearanceResource(C2489R.style.TextAppearance_MaterialComponents_Badge);
    }

    private void calculateCenterAndBounds(@NonNull Context context, @NonNull Rect rect, @NonNull View view) {
        int i = this.savedState.badgeGravity;
        if (i == 8388691 || i == 8388693) {
            this.badgeCenterY = rect.bottom;
        } else {
            this.badgeCenterY = rect.top;
        }
        if (getNumber() <= 9) {
            float f = !hasNumber() ? this.badgeRadius : this.badgeWithTextRadius;
            this.cornerRadius = f;
            this.halfBadgeHeight = f;
            this.halfBadgeWidth = f;
        } else {
            float f2 = this.badgeWithTextRadius;
            this.cornerRadius = f2;
            this.halfBadgeHeight = f2;
            this.halfBadgeWidth = (this.textDrawableHelper.getTextWidth(getBadgeText()) / 2.0f) + this.badgeWidePadding;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(hasNumber() ? C2489R.dimen.mtrl_badge_text_horizontal_edge_offset : C2489R.dimen.mtrl_badge_horizontal_edge_offset);
        int i2 = this.savedState.badgeGravity;
        if (i2 == 8388659 || i2 == 8388691) {
            this.badgeCenterX = kkl0.m150191x(view) == 0 ? (rect.left - this.halfBadgeWidth) + dimensionPixelSize : (rect.right + this.halfBadgeWidth) - dimensionPixelSize;
        } else {
            this.badgeCenterX = kkl0.m150191x(view) == 0 ? (rect.right + this.halfBadgeWidth) - dimensionPixelSize : (rect.left - this.halfBadgeWidth) + dimensionPixelSize;
        }
    }

    @NonNull
    public static BadgeDrawable create(@NonNull Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    @NonNull
    private static BadgeDrawable createFromAttributes(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.loadDefaultStateFromAttributes(context, attributeSet, i, i2);
        return badgeDrawable;
    }

    @NonNull
    public static BadgeDrawable createFromResource(@NonNull Context context, @XmlRes int i) {
        AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i, "badge");
        int styleAttribute = drawableXml.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = DEFAULT_STYLE;
        }
        return createFromAttributes(context, drawableXml, DEFAULT_THEME_ATTR, styleAttribute);
    }

    @NonNull
    public static BadgeDrawable createFromSavedState(@NonNull Context context, @NonNull SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.restoreFromSavedState(savedState);
        return badgeDrawable;
    }

    private void drawText(Canvas canvas) {
        Rect rect = new Rect();
        String badgeText = getBadgeText();
        this.textDrawableHelper.getTextPaint().getTextBounds(badgeText, 0, badgeText.length(), rect);
        canvas.drawText(badgeText, this.badgeCenterX, this.badgeCenterY + (rect.height() / 2), this.textDrawableHelper.getTextPaint());
    }

    @NonNull
    private String getBadgeText() {
        if (getNumber() <= this.maxBadgeNumber) {
            return Integer.toString(getNumber());
        }
        Context context = this.contextRef.get();
        return context == null ? "" : context.getString(C2489R.string.mtrl_exceed_max_badge_number_suffix, Integer.valueOf(this.maxBadgeNumber), "+");
    }

    private void loadDefaultStateFromAttributes(Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, C2489R.styleable.Badge, i, i2, new int[0]);
        setMaxCharacterCount(typedArrayObtainStyledAttributes.getInt(C2489R.styleable.Badge_maxCharacterCount, 4));
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.Badge_number)) {
            setNumber(typedArrayObtainStyledAttributes.getInt(C2489R.styleable.Badge_number, 0));
        }
        setBackgroundColor(readColorFromAttributes(context, typedArrayObtainStyledAttributes, C2489R.styleable.Badge_backgroundColor));
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.Badge_badgeTextColor)) {
            setBadgeTextColor(readColorFromAttributes(context, typedArrayObtainStyledAttributes, C2489R.styleable.Badge_badgeTextColor));
        }
        setBadgeGravity(typedArrayObtainStyledAttributes.getInt(C2489R.styleable.Badge_badgeGravity, TOP_END));
        typedArrayObtainStyledAttributes.recycle();
    }

    private static int readColorFromAttributes(Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        return MaterialResources.getColorStateList(context, typedArray, i).getDefaultColor();
    }

    private void restoreFromSavedState(@NonNull SavedState savedState) {
        setMaxCharacterCount(savedState.maxCharacterCount);
        if (savedState.number != -1) {
            setNumber(savedState.number);
        }
        setBackgroundColor(savedState.backgroundColor);
        setBadgeTextColor(savedState.badgeTextColor);
        setBadgeGravity(savedState.badgeGravity);
    }

    private void setTextAppearance(@Nullable TextAppearance textAppearance) {
        Context context;
        if (this.textDrawableHelper.getTextAppearance() == textAppearance || (context = this.contextRef.get()) == null) {
            return;
        }
        this.textDrawableHelper.setTextAppearance(textAppearance, context);
        updateCenterAndBounds();
    }

    private void setTextAppearanceResource(@StyleRes int i) {
        Context context = this.contextRef.get();
        if (context == null) {
            return;
        }
        setTextAppearance(new TextAppearance(context, i));
    }

    private void updateCenterAndBounds() {
        Context context = this.contextRef.get();
        WeakReference<View> weakReference = this.anchorViewRef;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.badgeBounds);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.customBadgeParentRef;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || BadgeUtils.USE_COMPAT_PARENT) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        calculateCenterAndBounds(context, rect2, view);
        BadgeUtils.updateBadgeBounds(this.badgeBounds, this.badgeCenterX, this.badgeCenterY, this.halfBadgeWidth, this.halfBadgeHeight);
        this.shapeDrawable.setCornerSize(this.cornerRadius);
        if (rect.equals(this.badgeBounds)) {
            return;
        }
        this.shapeDrawable.setBounds(this.badgeBounds);
    }

    private void updateMaxBadgeNumber() {
        this.maxBadgeNumber = ((int) Math.pow(10.0d, ((double) getMaxCharacterCount()) - 1.0d)) - 1;
    }

    public void clearNumber() {
        this.savedState.number = -1;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.shapeDrawable.draw(canvas);
        if (hasNumber()) {
            drawText(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.savedState.alpha;
    }

    @ColorInt
    public int getBackgroundColor() {
        return this.shapeDrawable.getFillColor().getDefaultColor();
    }

    public int getBadgeGravity() {
        return this.savedState.badgeGravity;
    }

    @ColorInt
    public int getBadgeTextColor() {
        return this.textDrawableHelper.getTextPaint().getColor();
    }

    @Nullable
    public CharSequence getContentDescription() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        boolean zHasNumber = hasNumber();
        SavedState savedState = this.savedState;
        if (!zHasNumber) {
            return savedState.contentDescriptionNumberless;
        }
        if (savedState.contentDescriptionQuantityStrings <= 0 || (context = this.contextRef.get()) == null) {
            return null;
        }
        return context.getResources().getQuantityString(this.savedState.contentDescriptionQuantityStrings, getNumber(), Integer.valueOf(getNumber()));
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.badgeBounds.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.badgeBounds.width();
    }

    public int getMaxCharacterCount() {
        return this.savedState.maxCharacterCount;
    }

    public int getNumber() {
        if (hasNumber()) {
            return this.savedState.number;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @NonNull
    public SavedState getSavedState() {
        return this.savedState;
    }

    public boolean hasNumber() {
        return this.savedState.number != -1;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onTextSizeChange() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.savedState.alpha = i;
        this.textDrawableHelper.getTextPaint().setAlpha(i);
        invalidateSelf();
    }

    public void setBackgroundColor(@ColorInt int i) {
        this.savedState.backgroundColor = i;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        if (this.shapeDrawable.getFillColor() != colorStateListValueOf) {
            this.shapeDrawable.setFillColor(colorStateListValueOf);
            invalidateSelf();
        }
    }

    public void setBadgeGravity(int i) {
        if (this.savedState.badgeGravity != i) {
            this.savedState.badgeGravity = i;
            WeakReference<View> weakReference = this.anchorViewRef;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.anchorViewRef.get();
            WeakReference<ViewGroup> weakReference2 = this.customBadgeParentRef;
            updateBadgeCoordinates(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void setBadgeTextColor(@ColorInt int i) {
        this.savedState.badgeTextColor = i;
        if (this.textDrawableHelper.getTextPaint().getColor() != i) {
            this.textDrawableHelper.getTextPaint().setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.savedState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(@StringRes int i) {
        this.savedState.contentDescriptionQuantityStrings = i;
    }

    public void setMaxCharacterCount(int i) {
        if (this.savedState.maxCharacterCount != i) {
            this.savedState.maxCharacterCount = i;
            updateMaxBadgeNumber();
            this.textDrawableHelper.setTextWidthDirty(true);
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setNumber(int i) {
        int iMax = Math.max(0, i);
        if (this.savedState.number != iMax) {
            this.savedState.number = iMax;
            this.textDrawableHelper.setTextWidthDirty(true);
            updateCenterAndBounds();
            invalidateSelf();
        }
    }

    public void setVisible(boolean z) {
        setVisible(z, false);
    }

    public void updateBadgeCoordinates(@NonNull View view, @Nullable ViewGroup viewGroup) {
        this.anchorViewRef = new WeakReference<>(view);
        this.customBadgeParentRef = new WeakReference<>(viewGroup);
        updateCenterAndBounds();
        invalidateSelf();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.google.android.material.badge.BadgeDrawable.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NonNull
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        private int alpha;

        @ColorInt
        private int backgroundColor;
        private int badgeGravity;

        @ColorInt
        private int badgeTextColor;

        @Nullable
        private CharSequence contentDescriptionNumberless;

        @PluralsRes
        private int contentDescriptionQuantityStrings;
        private int maxCharacterCount;
        private int number;

        public SavedState(@NonNull Parcel parcel) {
            this.alpha = 255;
            this.number = -1;
            this.backgroundColor = parcel.readInt();
            this.badgeTextColor = parcel.readInt();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.backgroundColor);
            parcel.writeInt(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            parcel.writeString(this.contentDescriptionNumberless.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeInt(this.badgeGravity);
        }

        public SavedState(@NonNull Context context) {
            this.alpha = 255;
            this.number = -1;
            this.badgeTextColor = new TextAppearance(context, C2489R.style.TextAppearance_MaterialComponents_Badge).textColor.getDefaultColor();
            this.contentDescriptionNumberless = context.getString(C2489R.string.mtrl_badge_numberless_content_description);
            this.contentDescriptionQuantityStrings = C2489R.plurals.mtrl_badge_content_description;
        }
    }
}
