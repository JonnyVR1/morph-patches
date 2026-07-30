package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@NonNull T t, @NonNull U u);
}
