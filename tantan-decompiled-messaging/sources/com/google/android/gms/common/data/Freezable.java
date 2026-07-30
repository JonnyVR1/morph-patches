package com.google.android.gms.common.data;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public interface Freezable<T> {
    @NonNull
    T freeze();

    boolean isDataValid();
}
