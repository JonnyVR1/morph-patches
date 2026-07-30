package com.google.android.gms.location;

import android.app.PendingIntent;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface GeofencingApi {
    @NonNull
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    PendingResult<Status> addGeofences(@NonNull GoogleApiClient googleApiClient, @NonNull GeofencingRequest geofencingRequest, @NonNull PendingIntent pendingIntent);

    @NonNull
    @RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @Deprecated
    PendingResult<Status> addGeofences(@NonNull GoogleApiClient googleApiClient, @NonNull List<Geofence> list, @NonNull PendingIntent pendingIntent);

    @NonNull
    PendingResult<Status> removeGeofences(@NonNull GoogleApiClient googleApiClient, @NonNull PendingIntent pendingIntent);

    @NonNull
    PendingResult<Status> removeGeofences(@NonNull GoogleApiClient googleApiClient, @NonNull List<String> list);
}
