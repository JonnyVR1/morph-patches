package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
final class zzau extends zzj {
    public static final Parcelable.Creator<zzau> CREATOR = new zzat();

    public zzau(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(zzb());
        parcel.writeInt(zza());
    }
}
