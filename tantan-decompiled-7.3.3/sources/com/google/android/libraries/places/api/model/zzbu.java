package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
final class zzbu extends zzag {
    public static final Parcelable.Creator<zzbu> CREATOR = new zzbt();

    public zzbu(LocalDate localDate, boolean z) {
        super(localDate, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDate(), i);
        parcel.writeInt(isExceptional() ? 1 : 0);
    }
}
