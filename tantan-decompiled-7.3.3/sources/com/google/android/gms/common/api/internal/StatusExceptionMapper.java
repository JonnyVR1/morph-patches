package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public interface StatusExceptionMapper {
    @NonNull
    @KeepForSdk
    Exception getException(@NonNull Status status);
}
