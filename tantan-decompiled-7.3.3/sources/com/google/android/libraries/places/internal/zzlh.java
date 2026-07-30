package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.PlacesClient;
import p153l.ig4;
import p153l.s26;
import p153l.toi0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzlh implements zzla {
    public static final /* synthetic */ int zza = 0;
    private static final zznx zzb = zznx.zzn(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzc;
    private final zzkt zzd;
    private final AutocompleteSessionToken zze;

    @Nullable
    private zzld zzf;

    @Nullable
    private zzle zzg;

    public zzlh(PlacesClient placesClient, zzkt zzktVar, AutocompleteSessionToken autocompleteSessionToken) {
        this.zzc = placesClient;
        this.zzd = zzktVar;
        this.zze = autocompleteSessionToken;
    }

    @Override // com.google.android.libraries.places.internal.zzla
    public final Task zza(AutocompletePrediction autocompletePrediction) {
        if (zzb.containsAll(this.zzd.zzj())) {
            Place.Builder builder = Place.builder();
            builder.setId(autocompletePrediction.getPlaceId());
            builder.setTypes(autocompletePrediction.getPlaceTypes().isEmpty() ? null : autocompletePrediction.getPlaceTypes());
            return toi0.m192068f(FetchPlaceResponse.newInstance(builder.build()));
        }
        zzle zzleVar = this.zzg;
        if (zzleVar != null) {
            if (zzleVar.zzb().equals(autocompletePrediction.getPlaceId())) {
                Task taskZzc = zzleVar.zzc();
                taskZzc.getClass();
                return taskZzc;
            }
            zzleVar.zza().m139763a();
        }
        final zzkz zzkzVar = new zzkz(new ig4(), autocompletePrediction.getPlaceId());
        this.zzg = zzkzVar;
        PlacesClient placesClient = this.zzc;
        FetchPlaceRequest.Builder builder2 = FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), this.zzd.zzj());
        builder2.setSessionToken(this.zze);
        builder2.setCancellationToken(zzkzVar.zza().m139764b());
        Task taskMo15425j = placesClient.zzb(builder2.build(), 2).mo15425j(new s26() { // from class: com.google.android.libraries.places.internal.zzlb
            @Override // p153l.s26
            public final Object then(Task task) {
                int i = zzlh.zza;
                return zzkzVar.zza().m139764b().mo130138a() ? toi0.m192066d() : task;
            }
        });
        zzkzVar.zzd(taskMo15425j);
        return taskMo15425j;
    }

    @Override // com.google.android.libraries.places.internal.zzla
    public final Task zzb(String str, int i) {
        zzmt.zze(!TextUtils.isEmpty(str));
        zzld zzldVar = this.zzf;
        if (zzldVar != null) {
            if (zzldVar.zzb().equals(str)) {
                Task taskZzc = zzldVar.zzc();
                taskZzc.getClass();
                return taskZzc;
            }
            zzldVar.zza().m139763a();
        }
        final zzky zzkyVar = new zzky(new ig4(), str);
        this.zzf = zzkyVar;
        PlacesClient placesClient = this.zzc;
        FindAutocompletePredictionsRequest.Builder builder = FindAutocompletePredictionsRequest.builder();
        builder.setQuery(str);
        builder.setLocationBias(this.zzd.zzc());
        builder.setLocationRestriction(this.zzd.zzd());
        builder.setCountries(this.zzd.zzi());
        builder.setRegionCode(this.zzd.zzn());
        builder.setInputOffset(Integer.valueOf(i));
        builder.setTypeFilter(this.zzd.zze());
        builder.setTypesFilter(this.zzd.zzk());
        builder.setSessionToken(this.zze);
        builder.setCancellationToken(zzkyVar.zza().m139764b());
        Task taskMo15425j = placesClient.zzd(builder.build(), 2).mo15425j(new s26() { // from class: com.google.android.libraries.places.internal.zzlc
            @Override // p153l.s26
            public final Object then(Task task) {
                int i2 = zzlh.zza;
                return zzkyVar.zza().m139764b().mo130138a() ? toi0.m192066d() : task;
            }
        });
        zzkyVar.zzd(taskMo15425j);
        return taskMo15425j;
    }

    @Override // com.google.android.libraries.places.internal.zzla
    public final void zzc() {
        zzld zzldVar = this.zzf;
        if (zzldVar != null) {
            zzldVar.zza().m139763a();
        }
        zzle zzleVar = this.zzg;
        if (zzleVar != null) {
            zzleVar.zza().m139763a();
        }
        this.zzf = null;
        this.zzg = null;
    }
}
