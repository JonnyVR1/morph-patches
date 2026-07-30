package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* JADX INFO: loaded from: classes7.dex */
final class zzkl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzkm((AutocompleteActivityMode) parcel.readParcelable(zzkt.class.getClassLoader()), zznx.zzj(parcel.readArrayList(Place.Field.class.getClassLoader())), (zzkr) parcel.readParcelable(zzkt.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LocationBias) parcel.readParcelable(zzkt.class.getClassLoader()), (LocationRestriction) parcel.readParcelable(zzkt.class.getClassLoader()), zznx.zzj(parcel.readArrayList(String.class.getClassLoader())), (TypeFilter) parcel.readParcelable(zzkt.class.getClassLoader()), zznx.zzj(parcel.readArrayList(String.class.getClassLoader())), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? parcel.readString() : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzkm[i];
    }
}
