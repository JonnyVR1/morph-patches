package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import p153l.g4t0;
import p153l.g9t0;
import p153l.tzs0;
import p153l.vrs0;
import p153l.wbt0;
import p153l.x0s0;

/* JADX INFO: loaded from: classes6.dex */
public class LocationServices {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = vrs0.f185520b;

    @NonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new x0s0();

    @NonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi = new tzs0();

    @NonNull
    @Deprecated
    public static final SettingsApi SettingsApi = new g9t0();

    private LocationServices() {
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new vrs0(activity);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new g4t0(activity);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new wbt0(activity);
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new vrs0(context);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new g4t0(context);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new wbt0(context);
    }
}
