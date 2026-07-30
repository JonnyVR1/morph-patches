package com.google.android.libraries.places.internal;

import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzks {
    public abstract zzks zza(List list);

    public abstract zzks zzb(@Nullable String str);

    public abstract zzks zzc(@Nullable String str);

    public abstract zzks zzd(@Nullable LocationBias locationBias);

    public abstract zzks zze(@Nullable LocationRestriction locationRestriction);

    public abstract zzks zzf(AutocompleteActivityMode autocompleteActivityMode);

    public abstract zzks zzg(zzkr zzkrVar);

    public abstract zzks zzh(List list);

    public abstract zzks zzi(int i);

    public abstract zzks zzj(int i);

    public abstract zzks zzk(@Nullable String str);

    @Deprecated
    public abstract zzks zzl(@Nullable TypeFilter typeFilter);

    public abstract zzks zzm(List list);

    public abstract zzkt zzn();

    @Deprecated
    public final zzks zzo(@Nullable String str) {
        return zza(str == null ? zznx.zzl() : zznx.zzm(str));
    }
}
