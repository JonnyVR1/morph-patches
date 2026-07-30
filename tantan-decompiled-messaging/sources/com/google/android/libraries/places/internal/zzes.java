package com.google.android.libraries.places.internal;

import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchResolvedPhotoUriRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.SearchByTextRequest;
import com.google.android.libraries.places.api.net.SearchByTextResponse;
import com.google.android.libraries.places.api.net.SearchNearbyRequest;
import com.google.android.libraries.places.api.net.SearchNearbyResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class zzes implements zzjr {
    private final zzkg zza;
    private final zzkb zzb;
    private final zzjs zzc;

    public zzes(zzkg zzkgVar, zzkb zzkbVar, zzjs zzjsVar) {
        this.zza = zzkgVar;
        this.zzb = zzkbVar;
        this.zzc = zzjsVar;
    }

    @VisibleForTesting
    public static final int zzp(Task task) {
        if (task.mo15377p()) {
            return 2;
        }
        Exception excMo15372k = task.mo15372k();
        excMo15372k.getClass();
        int statusCode = (excMo15372k instanceof ApiException ? (ApiException) excMo15372k : new ApiException(new Status(13, excMo15372k.getMessage()))).getStatusCode();
        if (statusCode != 7) {
            return statusCode != 15 ? 1 : 3;
        }
        return 4;
    }

    private final zzahs zzq() {
        Locale localeZzb = this.zzc.zzb();
        Locale locale = Locale.getDefault();
        zzahs zzahsVarZza = zzahu.zza();
        zzahsVarZza.zze(localeZzb.toString());
        if (!localeZzb.equals(locale)) {
            zzahsVarZza.zzb(locale.toString());
        }
        return zzahsVarZza;
    }

    private final void zzr(zzagi zzagiVar) {
        this.zza.zza(zzkh.zza(zzagiVar));
    }

    private final void zzs(zzaez zzaezVar, int i, int i2) {
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, i, i2);
        zzagbVarZzb.zzn(16);
        zzagbVarZzb.zze(zzaezVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zza(FetchPhotoRequest fetchPhotoRequest, int i) {
        zzahk zzahkVarZza = zzahm.zza();
        zzahkVarZza.zza(2);
        zzahm zzahmVar = (zzahm) zzahkVarZza.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, 2, 1);
        zzagbVarZzb.zzn(5);
        zzagbVarZzb.zzg(zzahmVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzb(Task task, long j, long j2, int i) {
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(15);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), 2, 1);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzc(FetchResolvedPhotoUriRequest fetchResolvedPhotoUriRequest, int i) {
        zzahk zzahkVarZza = zzahm.zza();
        zzahkVarZza.zza(2);
        zzahm zzahmVar = (zzahm) zzahkVarZza.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, 3, 1);
        zzagbVarZzb.zzn(5);
        zzagbVarZzb.zzg(zzahmVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzd(Task task, long j, long j2, int i) {
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(15);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), 3, 1);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zze(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j, long j2, int i) {
        boolean zMo15377p = task.mo15377p();
        zzagu zzaguVarZza = zzagw.zza();
        zzahn zzahnVarZza = zzaho.zza();
        zzahnVarZza.zza(zzjd.zzb(findCurrentPlaceRequest.getPlaceFields()));
        zzaguVarZza.zzb((zzaho) zzahnVarZza.zzt());
        zzaguVarZza.zza((int) (j2 - j));
        zzaguVarZza.zzc(true != zMo15377p ? 1 : 2);
        zzagw zzagwVar = (zzagw) zzaguVarZza.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, 2, 1);
        zzagbVarZzb.zzn(6);
        zzagbVarZzb.zzd(zzagwVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzf(Task task, long j, long j2, int i) {
        int size = task.mo15377p() ? ((FindCurrentPlaceResponse) task.mo15373l()).getPlaceLikelihoods().size() : 0;
        zzaea zzaeaVarZza = zzaeb.zza();
        zzaeaVarZza.zza(size);
        zzaeb zzaebVar = (zzaeb) zzaeaVarZza.zzt();
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(4);
        zzaeuVarZza.zza(zzaebVar);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), 2, 1);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzg(SearchByTextRequest searchByTextRequest, int i) {
        zzaib zzaibVarZza = zzaid.zza();
        zzaibVarZza.zze(searchByTextRequest.isOpenNow());
        zzahn zzahnVarZza = zzaho.zza();
        zzahnVarZza.zza(zzhg.zza(searchByTextRequest.getPlaceFields()));
        zzaibVarZza.zzf((zzaho) zzahnVarZza.zzt());
        SearchByTextRequest.RankPreference rankPreference = searchByTextRequest.getRankPreference();
        zzaibVarZza.zzh(rankPreference == null ? 1 : true != rankPreference.equals(SearchByTextRequest.RankPreference.DISTANCE) ? 3 : 2);
        zzaibVarZza.zzg(searchByTextRequest.isStrictTypeFiltering());
        String includedType = searchByTextRequest.getIncludedType();
        if (includedType != null) {
            zzaibVarZza.zzb(includedType);
        }
        Double minRating = searchByTextRequest.getMinRating();
        if (minRating != null) {
            zzaibVarZza.zzd(minRating.doubleValue());
        }
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaibVarZza.zzc(maxResultCount.intValue());
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : searchByTextRequest.getPriceLevels()) {
            if (num != null) {
                arrayList.add(num);
            }
        }
        zzaibVarZza.zza(arrayList);
        zzahs zzahsVarZzq = zzq();
        zzahsVarZzq.zzh(2);
        zzahsVarZzq.zzf((zzaid) zzaibVarZza.zzt());
        zzahu zzahuVar = (zzahu) zzahsVarZzq.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, 3, 1);
        zzagbVarZzb.zzn(1);
        zzagbVarZzb.zzh(zzahuVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzh(SearchByTextRequest searchByTextRequest, Task task, long j, long j2, int i) {
        int size = task.mo15377p() ? ((SearchByTextResponse) task.mo15373l()).getPlaces().size() : 0;
        Integer maxResultCount = searchByTextRequest.getMaxResultCount();
        zzaiy zzaiyVarZza = zzaiz.zza();
        zzaiyVarZza.zza(maxResultCount != null ? maxResultCount.intValue() : 0);
        zzaiyVarZza.zzb(size);
        zzaiz zzaizVar = (zzaiz) zzaiyVarZza.zzt();
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(10);
        zzaeuVarZza.zze(zzaizVar);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), 3, 1);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzi(SearchNearbyRequest searchNearbyRequest, int i) {
        int i2;
        zzaie zzaieVarZza = zzaig.zza();
        zzahn zzahnVarZza = zzaho.zza();
        zzahnVarZza.zza(zzhg.zza(searchNearbyRequest.getPlaceFields()));
        zzaieVarZza.zzf((zzaho) zzahnVarZza.zzt());
        SearchNearbyRequest.RankPreference rankPreference = searchNearbyRequest.getRankPreference();
        if (rankPreference == null) {
            i2 = 1;
        } else {
            i2 = true != rankPreference.equals(SearchNearbyRequest.RankPreference.DISTANCE) ? 3 : 2;
        }
        zzaieVarZza.zzg(i2);
        List<String> includedTypes = searchNearbyRequest.getIncludedTypes();
        if (includedTypes != null) {
            zzaieVarZza.zzd(includedTypes);
        }
        List<String> excludedTypes = searchNearbyRequest.getExcludedTypes();
        if (excludedTypes != null) {
            zzaieVarZza.zzb(excludedTypes);
        }
        List<String> includedPrimaryTypes = searchNearbyRequest.getIncludedPrimaryTypes();
        if (includedPrimaryTypes != null) {
            zzaieVarZza.zzc(includedPrimaryTypes);
        }
        List<String> excludedPrimaryTypes = searchNearbyRequest.getExcludedPrimaryTypes();
        if (excludedPrimaryTypes != null) {
            zzaieVarZza.zza(excludedPrimaryTypes);
        }
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        if (maxResultCount != null) {
            zzaieVarZza.zze(maxResultCount.intValue());
        }
        zzahs zzahsVarZzq = zzq();
        zzahsVarZzq.zzh(2);
        zzahsVarZzq.zzg((zzaig) zzaieVarZza.zzt());
        zzahu zzahuVar = (zzahu) zzahsVarZzq.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, 3, 1);
        zzagbVarZzb.zzn(1);
        zzagbVarZzb.zzh(zzahuVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzj(SearchNearbyRequest searchNearbyRequest, Task task, long j, long j2, int i) {
        int size = task.mo15377p() ? ((SearchNearbyResponse) task.mo15373l()).getPlaces().size() : 0;
        Integer maxResultCount = searchNearbyRequest.getMaxResultCount();
        zzaiy zzaiyVarZza = zzaiz.zza();
        zzaiyVarZza.zza(maxResultCount != null ? maxResultCount.intValue() : 0);
        zzaiyVarZza.zzb(size);
        zzaiz zzaizVar = (zzaiz) zzaiyVarZza.zzt();
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(10);
        zzaeuVarZza.zze(zzaizVar);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), 3, 1);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzk(FetchPlaceRequest fetchPlaceRequest, int i, int i2) {
        zzago zzagoVarZza = zzagp.zza();
        zzagoVarZza.zza(1);
        zzahn zzahnVarZza = zzaho.zza();
        zzahnVarZza.zza(zzjd.zzb(fetchPlaceRequest.getPlaceFields()));
        zzagoVarZza.zzb((zzaho) zzahnVarZza.zzt());
        zzagp zzagpVar = (zzagp) zzagoVarZza.zzt();
        zzahs zzahsVarZzq = zzq();
        zzahsVarZzq.zzh(5);
        zzahsVarZzq.zzc(zzagpVar);
        zzahu zzahuVar = (zzahu) zzahsVarZzq.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, i, i2);
        zzagbVarZzb.zzn(1);
        zzagbVarZzb.zzh(zzahuVar);
        zzagbVarZzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzagbVarZzb.zzj(sessionToken.toString());
        }
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzl(Task task, long j, long j2, int i, int i2) {
        boolean zMo15377p = task.mo15377p();
        zzaem zzaemVarZza = zzaen.zza();
        zzaemVarZza.zza(1);
        zzaemVarZza.zzb(zMo15377p ? 1 : 0);
        zzaen zzaenVar = (zzaen) zzaemVarZza.zzt();
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(8);
        zzaeuVarZza.zzc(zzaenVar);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzm(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, int i, int i2) {
        zzafd zzafdVarZza = zzafe.zza();
        List<String> typesFilter = findAutocompletePredictionsRequest.getTypesFilter();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        Integer inputOffset = findAutocompletePredictionsRequest.getInputOffset();
        if (!typesFilter.isEmpty()) {
            Iterator<String> it = typesFilter.iterator();
            while (it.hasNext()) {
                zzafdVarZza.zza(it.next());
            }
        } else if (typeFilter != null) {
            zzafdVarZza.zza(zzje.zza(typeFilter));
        }
        if (inputOffset != null) {
            zzafdVarZza.zzb(inputOffset.intValue());
        }
        zzafe zzafeVar = (zzafe) zzafdVarZza.zzt();
        zzafp zzafpVarZza = zzafq.zza();
        if (zzafeVar != null) {
            zzafpVarZza.zza(zzafeVar);
        }
        zzafq zzafqVar = (zzafq) zzafpVarZza.zzt();
        zzahs zzahsVarZzq = zzq();
        zzahsVarZzq.zzh(6);
        zzahsVarZzq.zza(zzafqVar);
        zzahu zzahuVar = (zzahu) zzahsVarZzq.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, i, i2);
        zzagbVarZzb.zzn(1);
        zzagbVarZzb.zzh(zzahuVar);
        zzagbVarZzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzagbVarZzb.zzj(sessionToken.toString());
        }
        zzr((zzagi) zzagbVarZzb.zzt());
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzn(Task task, long j, long j2, int i, int i2) {
        int size = task.mo15377p() ? ((FindAutocompletePredictionsResponse) task.mo15373l()).getAutocompletePredictions().size() : 0;
        zzaeh zzaehVarZza = zzaei.zza();
        zzaehVarZza.zza(size);
        zzaei zzaeiVar = (zzaei) zzaehVarZza.zzt();
        zzaeu zzaeuVarZza = zzaez.zza();
        zzaeuVarZza.zzg(6);
        zzaeuVarZza.zzb(zzaeiVar);
        zzaeuVarZza.zzf(zzp(task));
        zzaeuVarZza.zzd((int) (j2 - j));
        zzs((zzaez) zzaeuVarZza.zzt(), i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzjr
    public final void zzo(FetchPlaceRequest fetchPlaceRequest, int i, int i2) {
        zzago zzagoVarZza = zzagp.zza();
        zzagoVarZza.zza(1);
        zzahn zzahnVarZza = zzaho.zza();
        zzahnVarZza.zza(zzjd.zzb(fetchPlaceRequest.getPlaceFields()));
        zzagoVarZza.zzb((zzaho) zzahnVarZza.zzt());
        zzagp zzagpVar = (zzagp) zzagoVarZza.zzt();
        zzahs zzahsVarZzq = zzq();
        zzahsVarZzq.zzh(5);
        zzahsVarZzq.zzd(zzagpVar);
        zzahu zzahuVar = (zzahu) zzahsVarZzq.zzt();
        zzagb zzagbVarZzb = zzkh.zzb(this.zzb, i, 1);
        zzagbVarZzb.zzn(1);
        zzagbVarZzb.zzh(zzahuVar);
        zzagbVarZzb.zza(this.zzc.zza());
        zzr((zzagi) zzagbVarZzb.zzt());
    }
}
