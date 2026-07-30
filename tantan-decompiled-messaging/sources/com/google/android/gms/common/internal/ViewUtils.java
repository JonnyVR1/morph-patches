package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class ViewUtils {
    private ViewUtils() {
    }

    @Nullable
    @KeepForSdk
    public static String getXmlAttributeString(@NonNull String str, @NonNull String str2, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z, boolean z2, @NonNull String str3) {
        String attributeValue = attributeSet == null ? null : attributeSet.getAttributeValue(str, str2);
        if (attributeValue == null || !attributeValue.startsWith("@string/") || !z) {
            return attributeValue;
        }
        String strSubstring = attributeValue.substring(8);
        String packageName = context.getPackageName();
        TypedValue typedValue = new TypedValue();
        try {
            context.getResources().getValue(packageName + ":string/" + strSubstring, typedValue, true);
        } catch (Resources.NotFoundException unused) {
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            return charSequence.toString();
        }
        typedValue.toString();
        return attributeValue;
    }
}
