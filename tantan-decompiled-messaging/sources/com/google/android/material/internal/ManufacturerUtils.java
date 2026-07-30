package com.google.android.material.internal;

import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ManufacturerUtils {
    private ManufacturerUtils() {
    }

    public static boolean isSamsungDevice() {
        return Build.MANUFACTURER.equalsIgnoreCase("samsung");
    }
}
