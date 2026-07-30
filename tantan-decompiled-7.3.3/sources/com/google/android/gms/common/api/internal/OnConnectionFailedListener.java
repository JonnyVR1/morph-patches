package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public interface OnConnectionFailedListener {
    @ShowFirstParty
    @KeepForSdk
    void onConnectionFailed(@NonNull ConnectionResult connectionResult);
}
