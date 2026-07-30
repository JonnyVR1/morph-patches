package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleableRes;
import p149l.nu0;
import p149l.qri0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialResources {
    private MaterialResources() {
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        ColorStateList colorStateListM161423a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM161423a = nu0.m161423a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM161423a;
    }

    public static int getDimensionPixelSize(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Nullable
    public static Drawable getDrawable(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        Drawable drawableM161424b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM161424b = nu0.m161424b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM161424b;
    }

    @StyleableRes
    public static int getIndexWithValue(@NonNull TypedArray typedArray, @StyleableRes int i, @StyleableRes int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @Nullable
    public static TextAppearance getTextAppearance(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new TextAppearance(context, resourceId);
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull qri0 qri0Var, @StyleableRes int i) {
        int iM176007n;
        ColorStateList colorStateListM161423a;
        return (!qri0Var.m176011r(i) || (iM176007n = qri0Var.m176007n(i, 0)) == 0 || (colorStateListM161423a = nu0.m161423a(context, iM176007n)) == null) ? qri0Var.m175996c(i) : colorStateListM161423a;
    }
}
