package com.clevertap.android.sdk.displayunits;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public enum CTDisplayUnitType {
    SIMPLE("simple"),
    SIMPLE_WITH_IMAGE("simple-image"),
    CAROUSEL("carousel"),
    CAROUSEL_WITH_IMAGE("carousel-image"),
    MESSAGE_WITH_ICON("message-icon"),
    CUSTOM_KEY_VALUE("custom-key-value");

    public final String type;

    CTDisplayUnitType(String str) {
        this.type = str;
    }

    @Nullable
    public static CTDisplayUnitType type(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "carousel-image":
                return CAROUSEL_WITH_IMAGE;
            case "message-icon":
                return MESSAGE_WITH_ICON;
            case "simple":
                return SIMPLE;
            case "custom-key-value":
                return CUSTOM_KEY_VALUE;
            case "carousel":
                return CAROUSEL;
            case "simple-image":
                return SIMPLE_WITH_IMAGE;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    @NonNull
    public String toString() {
        return this.type;
    }
}
