package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public interface SettingsClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<LocationSettingsResponse> checkLocationSettings(@NonNull LocationSettingsRequest locationSettingsRequest);
}
