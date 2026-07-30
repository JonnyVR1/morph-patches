package com.google.android.libraries.places.internal;

import android.location.Location;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.OpeningHours;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.IsOpenRequest;
import com.google.android.libraries.places.api.net.IsOpenResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p149l.n16;
import p149l.r5g0;
import p149l.sei0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzga implements PlacesClient {
    private final zzev zza;
    private final zzel zzb;
    private final zzeq zzc;
    private final zzjr zzd;
    private final zzdv zze;
    private final zzhc zzf;
    private final zzjs zzg;

    public zzga(zzjs zzjsVar, zzev zzevVar, zzel zzelVar, zzeq zzeqVar, zzjr zzjrVar, zzdv zzdvVar, zzhc zzhcVar) {
        this.zzg = zzjsVar;
        this.zza = zzevVar;
        this.zzb = zzelVar;
        this.zzc = zzeqVar;
        this.zzd = zzjrVar;
        this.zze = zzdvVar;
        this.zzf = zzhcVar;
    }

    private static void zzu(zzef zzefVar, @Nullable zzej zzejVar) {
        zzef.zza(zzefVar, zzef.zzb("Duration"));
        zzea.zza();
        zzea.zza();
        zzef.zza(zzefVar, zzef.zzb("Battery"));
        zzea.zza();
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        return zza(fetchPhotoRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        return zzb(fetchPlaceRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchResolvedPhotoUriResponse> fetchResolvedPhotoUri(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest) {
        return zzc(fetchResolvedPhotoUriRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        return zzd(findAutocompletePredictionsRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        return zze(findCurrentPlaceRequest, null, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<IsOpenResponse> isOpen(IsOpenRequest isOpenRequest) {
        return zzf(isOpenRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<SearchByTextResponse> searchByText(SearchByTextRequest searchByTextRequest) {
        return zzh(searchByTextRequest, 1);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<SearchNearbyResponse> searchNearby(SearchNearbyRequest searchNearbyRequest) {
        return zzi(searchNearbyRequest, 1);
    }

    public final Task zza(final FetchPhotoRequest fetchPhotoRequest, int i) {
        try {
            zzmt.zzc(fetchPhotoRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final int i2 = 1;
            return this.zza.zza(fetchPhotoRequest, 1).mo15369h(new n16(fetchPhotoRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfw
                public final /* synthetic */ FetchPhotoRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzj(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzb(final FetchPlaceRequest fetchPlaceRequest, final int i) {
        try {
            zzmt.zzc(fetchPlaceRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            if (!this.zzg.zzh() || i == 2) {
                return this.zza.zzb(fetchPlaceRequest, i).mo15369h(new n16() { // from class: com.google.android.libraries.places.internal.zzfv
                    @Override // p149l.n16
                    public final Object then(Task task) {
                        return this.zza.zzl(fetchPlaceRequest, i, zzejVarZza, task);
                    }
                }).mo15371j(new zzfr());
            }
            final int i2 = 1;
            return this.zzf.zzg(fetchPlaceRequest, 1).mo15369h(new n16(fetchPlaceRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfu
                public final /* synthetic */ FetchPlaceRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzk(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zzc(final FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, int i) {
        try {
            zzmt.zzc(fetchResolvedPhotoUriRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final int i2 = 1;
            return this.zzf.zzf(fetchResolvedPhotoUriRequest, 1).mo15369h(new n16(fetchResolvedPhotoUriRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzft
                public final /* synthetic */ FetchResolvedPhotoUriRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzo(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task zzd(final FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, final int i) {
        try {
            zzmt.zzc(findAutocompletePredictionsRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            if (!this.zzg.zzh() || i == 2) {
                return this.zza.zzc(findAutocompletePredictionsRequest, i).mo15369h(new n16() { // from class: com.google.android.libraries.places.internal.zzfq
                    @Override // p149l.n16
                    public final Object then(Task task) {
                        return this.zza.zzq(findAutocompletePredictionsRequest, i, zzejVarZza, task);
                    }
                }).mo15371j(new zzfr());
            }
            final int i2 = 1;
            return this.zzf.zze(findAutocompletePredictionsRequest, 1).mo15369h(new n16(findAutocompletePredictionsRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfp
                public final /* synthetic */ FindAutocompletePredictionsRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzp(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    @RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public final Task zze(final FindCurrentPlaceRequest findCurrentPlaceRequest, @Nullable String str, int i) {
        try {
            zzmt.zzc(findCurrentPlaceRequest, "Request must not be null.");
            final long jZza = this.zze.zza();
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final String str2 = null;
            final int i2 = 1;
            final int i3 = 1;
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).mo15379r(new r5g0(findCurrentPlaceRequest, str2, i2) { // from class: com.google.android.libraries.places.internal.zzfn
                public final /* synthetic */ FindCurrentPlaceRequest zzb;

                @Override // p149l.r5g0
                public final Task then(Object obj) {
                    return this.zza.zzg(this.zzb, null, 1, (Location) obj);
                }
            }).mo15369h(new n16(findCurrentPlaceRequest, jZza, i3, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfo
                public final /* synthetic */ FindCurrentPlaceRequest zzb;
                public final /* synthetic */ long zzc;
                public final /* synthetic */ zzej zzd;

                {
                    this.zzd = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzr(this.zzb, this.zzc, 1, this.zzd, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zzf(IsOpenRequest isOpenRequest, int i) {
        List arrayList;
        try {
            zzmt.zzc(isOpenRequest, "Request must not be null.");
            final Place place = isOpenRequest.getPlace();
            String placeId = isOpenRequest.getPlaceId();
            final long utcTimeMillis = isOpenRequest.getUtcTimeMillis();
            final sei0 sei0Var = new sei0();
            if (place == null) {
                int i2 = com.google.android.libraries.places.api.model.zzce.zza;
                arrayList = Arrays.asList(Place.Field.BUSINESS_STATUS, Place.Field.CURRENT_OPENING_HOURS, Place.Field.OPENING_HOURS, Place.Field.UTC_OFFSET);
            } else {
                arrayList = new ArrayList();
                Place.BusinessStatus businessStatus = place.getBusinessStatus();
                if (businessStatus == null || businessStatus == Place.BusinessStatus.OPERATIONAL) {
                    if (businessStatus == null) {
                        arrayList.add(Place.Field.BUSINESS_STATUS);
                    }
                    if (place.getCurrentOpeningHours() == null) {
                        arrayList.add(Place.Field.CURRENT_OPENING_HOURS);
                    }
                    if (place.getOpeningHours() == null) {
                        arrayList.add(Place.Field.OPENING_HOURS);
                    }
                    if (place.getUtcOffsetMinutes() == null) {
                        arrayList.add(Place.Field.UTC_OFFSET);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (place == null) {
                    throw null;
                }
                sei0Var.m183659c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzce.zza(place, utcTimeMillis)));
                return sei0Var.m183657a();
            }
            if (place != null) {
                placeId = place.getId();
            }
            if (placeId == null) {
                throw null;
            }
            FetchPlaceRequest.Builder builder = FetchPlaceRequest.builder(placeId, arrayList);
            builder.setCancellationToken(isOpenRequest.getCancellationToken());
            final FetchPlaceRequest fetchPlaceRequestBuild = builder.build();
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final int i3 = 1;
            return this.zzg.zzh() ? this.zzf.zzg(fetchPlaceRequestBuild, 1).mo15369h(new n16(fetchPlaceRequestBuild, i3, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfx
                public final /* synthetic */ FetchPlaceRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzn(this.zzb, 1, this.zzc, task);
                }
            }).mo15379r(new r5g0() { // from class: com.google.android.libraries.places.internal.zzfy
                @Override // p149l.r5g0
                public final Task then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    sei0 sei0Var2 = sei0Var;
                    long j = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    sei0Var2.m183659c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzce.zza(builder2.build(), j)));
                    return sei0Var2.m183657a();
                }
            }).mo15371j(new zzfr()) : this.zza.zzb(fetchPlaceRequestBuild, 1).mo15369h(new n16(fetchPlaceRequestBuild, i3, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfz
                public final /* synthetic */ FetchPlaceRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzm(this.zzb, 1, this.zzc, task);
                }
            }).mo15379r(new r5g0() { // from class: com.google.android.libraries.places.internal.zzfm
                @Override // p149l.r5g0
                public final Task then(Object obj) {
                    Place place2 = ((FetchPlaceResponse) obj).getPlace();
                    Place.BusinessStatus businessStatus2 = place2.getBusinessStatus();
                    OpeningHours currentOpeningHours = place2.getCurrentOpeningHours();
                    OpeningHours openingHours = place2.getOpeningHours();
                    Integer utcOffsetMinutes = place2.getUtcOffsetMinutes();
                    Place place3 = place;
                    if (place3 != null) {
                        if (utcOffsetMinutes == null) {
                            utcOffsetMinutes = place3.getUtcOffsetMinutes();
                        }
                        if (businessStatus2 == null) {
                            businessStatus2 = place3.getBusinessStatus();
                        }
                        if (currentOpeningHours == null) {
                            currentOpeningHours = place3.getCurrentOpeningHours();
                        }
                        if (openingHours == null) {
                            openingHours = place3.getOpeningHours();
                        }
                    }
                    sei0 sei0Var2 = sei0Var;
                    long j = utcTimeMillis;
                    Place.Builder builder2 = Place.builder();
                    builder2.setBusinessStatus(businessStatus2);
                    builder2.setCurrentOpeningHours(currentOpeningHours);
                    builder2.setOpeningHours(openingHours);
                    builder2.setUtcOffsetMinutes(utcOffsetMinutes);
                    sei0Var2.m183659c(IsOpenResponse.newInstance(com.google.android.libraries.places.api.model.zzce.zza(builder2.build(), j)));
                    return sei0Var2.m183657a();
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ Task zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, String str, int i, Location location) throws Exception {
        zzmt.zzc(location, "Location must not be null.");
        return this.zza.zzd(findCurrentPlaceRequest, location, this.zzc.zza(null), 1);
    }

    public final Task zzh(final SearchByTextRequest searchByTextRequest, int i) {
        try {
            zzmt.zzc(searchByTextRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final int i2 = 1;
            return this.zzf.zzm(searchByTextRequest, 1).mo15369h(new n16(searchByTextRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfl
                public final /* synthetic */ SearchByTextRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzs(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final Task zzi(final SearchNearbyRequest searchNearbyRequest, int i) {
        try {
            zzmt.zzc(searchNearbyRequest, "Request must not be null.");
            zzea.zza();
            final zzej zzejVarZza = zzej.zza();
            final int i2 = 1;
            return this.zzf.zzn(searchNearbyRequest, 1).mo15369h(new n16(searchNearbyRequest, i2, zzejVarZza) { // from class: com.google.android.libraries.places.internal.zzfs
                public final /* synthetic */ SearchNearbyRequest zzb;
                public final /* synthetic */ zzej zzc;

                {
                    this.zzc = zzejVarZza;
                }

                @Override // p149l.n16
                public final Object then(Task task) {
                    return this.zza.zzt(this.zzb, 1, this.zzc, task);
                }
            }).mo15371j(new zzfr());
        } catch (Error | RuntimeException e) {
            zzkd.zzb(e);
            throw e;
        }
    }

    public final /* synthetic */ FetchPhotoResponse zzj(FetchPhotoRequest fetchPhotoRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zza(fetchPhotoRequest, 1);
        zzu(zzef.zzb("FetchPhoto"), zzejVar);
        return (FetchPhotoResponse) task.mo15373l();
    }

    public final /* synthetic */ FetchPlaceResponse zzk(FetchPlaceRequest fetchPlaceRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzk(fetchPlaceRequest, 3, 1);
        zzu(zzef.zzb("GetPlace"), zzejVar);
        return (FetchPlaceResponse) task.mo15373l();
    }

    public final /* synthetic */ FetchPlaceResponse zzl(FetchPlaceRequest fetchPlaceRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzk(fetchPlaceRequest, 2, i);
        zzu(zzef.zzb("FetchPlace"), zzejVar);
        return (FetchPlaceResponse) task.mo15373l();
    }

    public final /* synthetic */ FetchPlaceResponse zzm(FetchPlaceRequest fetchPlaceRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzo(fetchPlaceRequest, 2, 1);
        zzu(zzef.zzb("IsOpenFetchPlace"), zzejVar);
        return (FetchPlaceResponse) task.mo15373l();
    }

    public final /* synthetic */ FetchPlaceResponse zzn(FetchPlaceRequest fetchPlaceRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzo(fetchPlaceRequest, 3, 1);
        zzu(zzef.zzb("IsOpenGetPlace"), zzejVar);
        return (FetchPlaceResponse) task.mo15373l();
    }

    public final /* synthetic */ FetchResolvedPhotoUriResponse zzo(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzc(fetchResolvedPhotoUriRequest, 1);
        zzu(zzef.zzb("GetPhotoMedia"), zzejVar);
        return (FetchResolvedPhotoUriResponse) task.mo15373l();
    }

    public final /* synthetic */ FindAutocompletePredictionsResponse zzp(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzm(findAutocompletePredictionsRequest, 3, 1);
        zzu(zzef.zzb("FindAutocompletePredictionsOnePlatform"), zzejVar);
        return (FindAutocompletePredictionsResponse) task.mo15373l();
    }

    public final /* synthetic */ FindAutocompletePredictionsResponse zzq(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzm(findAutocompletePredictionsRequest, 2, i);
        zzu(zzef.zzb("FindAutocompletePredictions"), zzejVar);
        return (FindAutocompletePredictionsResponse) task.mo15373l();
    }

    public final /* synthetic */ FindCurrentPlaceResponse zzr(FindCurrentPlaceRequest findCurrentPlaceRequest, long j, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zze(findCurrentPlaceRequest, task, j, this.zze.zza(), 1);
        zzu(zzef.zzb("FindCurrentPlace"), zzejVar);
        return (FindCurrentPlaceResponse) task.mo15373l();
    }

    public final /* synthetic */ SearchByTextResponse zzs(SearchByTextRequest searchByTextRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzg(searchByTextRequest, 1);
        zzu(zzef.zzb("SearchByText"), zzejVar);
        return (SearchByTextResponse) task.mo15373l();
    }

    public final /* synthetic */ SearchNearbyResponse zzt(SearchNearbyRequest searchNearbyRequest, int i, zzej zzejVar, Task task) throws Exception {
        this.zzd.zzi(searchNearbyRequest, 1);
        zzu(zzef.zzb("SearchNearby"), zzejVar);
        return (SearchNearbyResponse) task.mo15373l();
    }
}
