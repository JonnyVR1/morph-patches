package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.libraries.places.api.model.TypeFilter;

/* JADX INFO: loaded from: classes7.dex */
public final class zzje {
    private static final zzoa zza;

    static {
        zznz zznzVar = new zznz();
        zznzVar.zza(TypeFilter.ADDRESS, PlaceTypes.ADDRESS);
        zznzVar.zza(TypeFilter.CITIES, PlaceTypes.CITIES);
        zznzVar.zza(TypeFilter.ESTABLISHMENT, PlaceTypes.ESTABLISHMENT);
        zznzVar.zza(TypeFilter.GEOCODE, PlaceTypes.GEOCODE);
        zznzVar.zza(TypeFilter.REGIONS, PlaceTypes.REGIONS);
        zza = zznzVar.zzc();
    }

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
