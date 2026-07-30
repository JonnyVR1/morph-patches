package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import p149l.a0t0;
import p149l.avs0;
import p149l.nqs0;
import p149l.pis0;
import p149l.q2t0;
import p149l.rrr0;

/* JADX INFO: loaded from: classes6.dex */
public class LocationServices {

    @NonNull
    @Deprecated
    public static final Api<Api.ApiOptions.NoOptions> API = pis0.f149685b;

    @NonNull
    @Deprecated
    public static final FusedLocationProviderApi FusedLocationApi = new rrr0();

    @NonNull
    @Deprecated
    public static final GeofencingApi GeofencingApi = new nqs0();

    @NonNull
    @Deprecated
    public static final SettingsApi SettingsApi = new a0t0();

    private LocationServices() {
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Activity activity) {
        return new pis0(activity);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Activity activity) {
        return new avs0(activity);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Activity activity) {
        return new q2t0(activity);
    }

    @NonNull
    public static FusedLocationProviderClient getFusedLocationProviderClient(@NonNull Context context) {
        return new pis0(context);
    }

    @NonNull
    public static GeofencingClient getGeofencingClient(@NonNull Context context) {
        return new avs0(context);
    }

    @NonNull
    public static SettingsClient getSettingsClient(@NonNull Context context) {
        return new q2t0(context);
    }
}
