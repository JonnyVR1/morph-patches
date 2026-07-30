package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzas extends zzh {
    public static final Parcelable.Creator<zzas> CREATOR = new zzar();

    public zzas(String str, @Nullable Integer num, List list, List list2, String str2, String str3, String str4, List list3, List list4, List list5) {
        super(str, num, list, list2, str2, str3, str4, list3, list4, list5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getPlaceId());
        if (getDistanceMeters() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(getDistanceMeters().intValue());
        }
        parcel.writeList(getPlaceTypes());
        parcel.writeList(getTypes());
        parcel.writeString(zza());
        parcel.writeString(zzb());
        parcel.writeString(zzc());
        parcel.writeList(zzd());
        parcel.writeList(zze());
        parcel.writeList(zzf());
    }
}
