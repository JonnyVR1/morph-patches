package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;

/* JADX INFO: loaded from: classes7.dex */
public interface zzev {
    Task zza(FetchPhotoRequest fetchPhotoRequest, int i);

    Task zzb(FetchPlaceRequest fetchPlaceRequest, int i);

    Task zzc(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i);

    Task zzd(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zznx zznxVar, int i);
}
