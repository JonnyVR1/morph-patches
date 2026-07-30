package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, @NonNull String str, @NonNull Intent intent) {
        super(str, intent);
        this.zza = i;
    }

    public int getConnectionStatusCode() {
        return this.zza;
    }
}
