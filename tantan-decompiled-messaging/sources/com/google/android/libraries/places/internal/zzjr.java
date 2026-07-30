package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;

/* JADX INFO: loaded from: classes7.dex */
public interface zzjr {
    void zza(FetchPhotoRequest fetchPhotoRequest, int i);

    void zzb(Task task, long j, long j2, int i);

    void zzc(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, int i);

    void zzd(Task task, long j, long j2, int i);

    void zze(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j, long j2, int i);

    void zzf(Task task, long j, long j2, int i);

    void zzg(SearchByTextRequest searchByTextRequest, int i);

    void zzh(SearchByTextRequest searchByTextRequest, Task task, long j, long j2, int i);

    void zzi(SearchNearbyRequest searchNearbyRequest, int i);

    void zzj(SearchNearbyRequest searchNearbyRequest, Task task, long j, long j2, int i);

    void zzk(FetchPlaceRequest fetchPlaceRequest, int i, int i2);

    void zzl(Task task, long j, long j2, int i, int i2);

    void zzm(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, int i2);

    void zzn(Task task, long j, long j2, int i, int i2);

    void zzo(FetchPlaceRequest fetchPlaceRequest, int i, int i2);
}
