package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum AFi1uSDK {
    SUCCESS,
    FAILURE,
    NA,
    INTERNAL_ERROR;

    @Override // java.lang.Enum
    @NonNull
    public final String toString() {
        return super.toString().toLowerCase(Locale.getDefault());
    }
}
