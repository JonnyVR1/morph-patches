package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

/* JADX INFO: loaded from: classes7.dex */
@KeepForSdk
public class FirebaseExceptionMapper implements StatusExceptionMapper {
    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @NonNull
    public final Exception getException(@NonNull Status status) {
        return status.getStatusCode() == 8 ? new FirebaseException(status.zza()) : new FirebaseApiNotAvailableException(status.zza());
    }
}
