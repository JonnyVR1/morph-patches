package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
final class zzcc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        return OpeningHours.HoursType.valueOf(string);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OpeningHours.HoursType[i];
    }
}
