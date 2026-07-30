package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
final class zzbc extends zzp {
    public static final Parcelable.Creator<zzbc> CREATOR = new zzbb();

    public zzbc(int i, int i2) {
        super(i, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}
