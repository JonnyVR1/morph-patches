package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzbw extends zzai {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbv();

    public zzbw(@Nullable LocalDate localDate, DayOfWeek dayOfWeek, LocalTime localTime, boolean z) {
        super(localDate, dayOfWeek, localTime, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(getDate(), i);
        parcel.writeParcelable(getDay(), i);
        parcel.writeParcelable(getTime(), i);
        parcel.writeInt(isTruncated() ? 1 : 0);
    }
}
