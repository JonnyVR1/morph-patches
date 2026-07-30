package com.google.android.material.color;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.android.material.resources.MaterialAttributes;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p153l.gf5;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;

    @ColorInt
    public static int getColor(@NonNull Context context, @AttrRes int i, @ColorInt int i2) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        return typedValueResolve != null ? typedValueResolve.data : i2;
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        return layer(i, gf5.m130052o(i2, Math.round(Color.alpha(i2) * f)));
    }

    @ColorInt
    public static int getColor(Context context, @AttrRes int i, String str) {
        return MaterialAttributes.resolveOrThrow(context, i, str);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i, @ColorInt int i2) {
        return getColor(view.getContext(), i, i2);
    }

    @ColorInt
    public static int getColor(@NonNull View view, @AttrRes int i) {
        return MaterialAttributes.resolveOrThrow(view, i);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, to = 1.0d) float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    @ColorInt
    public static int layer(@NonNull View view, @AttrRes int i, @AttrRes int i2) {
        return layer(view, i, i2, 1.0f);
    }

    @ColorInt
    public static int layer(@ColorInt int i, @ColorInt int i2) {
        return gf5.m130047j(i2, i);
    }
}
