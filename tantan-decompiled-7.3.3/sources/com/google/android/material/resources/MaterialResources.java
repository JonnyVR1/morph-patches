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
import p153l.t0j0;
import p153l.tu0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialResources {
    private MaterialResources() {
    }

    @Nullable
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i) {
        int resourceId;
        ColorStateList colorStateListM192701a;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM192701a = tu0.m192701a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM192701a;
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
        Drawable drawableM192702b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM192702b = tu0.m192702b(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM192702b;
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
    public static ColorStateList getColorStateList(@NonNull Context context, @NonNull t0j0 t0j0Var, @StyleableRes int i) {
        int iM188796n;
        ColorStateList colorStateListM192701a;
        return (!t0j0Var.m188800r(i) || (iM188796n = t0j0Var.m188796n(i, 0)) == 0 || (colorStateListM192701a = tu0.m192701a(context, iM188796n)) == null) ? t0j0Var.m188785c(i) : colorStateListM192701a;
    }
}
