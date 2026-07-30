package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* JADX INFO: loaded from: classes7.dex */
final class zzkm extends zzkk {
    public static final Parcelable.Creator<zzkm> CREATOR = new zzkl();

    public zzkm(AutocompleteActivityMode autocompleteActivityMode, zznx zznxVar, zzkr zzkrVar, @Nullable String str, @Nullable String str2, @Nullable LocationBias locationBias, @Nullable LocationRestriction locationRestriction, zznx zznxVar2, @Nullable TypeFilter typeFilter, zznx zznxVar3, int i, int i2, @Nullable String str3) {
        super(autocompleteActivityMode, zznxVar, zzkrVar, str, str2, locationBias, locationRestriction, zznxVar2, typeFilter, zznxVar3, i, i2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(zzh(), i);
        parcel.writeList(zzj());
        parcel.writeParcelable(zzf(), i);
        if (zzm() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzm());
        }
        if (zzl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzl());
        }
        parcel.writeParcelable(zzc(), i);
        parcel.writeParcelable(zzd(), i);
        parcel.writeList(zzi());
        parcel.writeParcelable(zze(), i);
        parcel.writeList(zzk());
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
        if (zzn() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzn());
        }
    }
}
