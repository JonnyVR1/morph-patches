package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.C2489R;
import p153l.gzi0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialAttributes {
    @Nullable
    public static TypedValue resolve(@NonNull Context context, @AttrRes int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean resolveBoolean(@NonNull Context context, @AttrRes int i, boolean z) {
        TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve == null || typedValueResolve.type != 18) {
            return z;
        }
        return typedValueResolve.data != 0;
    }

    public static boolean resolveBooleanOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        return resolveOrThrow(context, i, str) != 0;
    }

    @Px
    public static int resolveDimension(@NonNull Context context, @AttrRes int i, @DimenRes int i2) {
        TypedValue typedValueResolve = resolve(context, i);
        return (int) ((typedValueResolve == null || typedValueResolve.type != 5) ? context.getResources().getDimension(i2) : typedValueResolve.getDimension(context.getResources().getDisplayMetrics()));
    }

    @Px
    public static int resolveMinimumAccessibleTouchTarget(@NonNull Context context) {
        return resolveDimension(context, C2489R.attr.minTouchTargetSize, C2489R.dimen.mtrl_min_touch_target_size);
    }

    public static int resolveOrThrow(@NonNull Context context, @AttrRes int i, @NonNull String str) {
        TypedValue typedValueResolve = resolve(context, i);
        if (typedValueResolve != null) {
            return typedValueResolve.data;
        }
        gzi0.m133102a("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return 0;
    }

    public static int resolveOrThrow(@NonNull View view, @AttrRes int i) {
        return resolveOrThrow(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
