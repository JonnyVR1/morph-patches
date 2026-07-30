package com.google.android.gms.location;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Response;

/* JADX INFO: loaded from: classes6.dex */
public class LocationSettingsResponse extends Response<LocationSettingsResult> {
    public LocationSettingsResponse(@NonNull LocationSettingsResult locationSettingsResult) {
        super(locationSettingsResult);
    }

    @Nullable
    public LocationSettingsStates getLocationSettingsStates() {
        return getResult().getLocationSettingsStates();
    }
}
