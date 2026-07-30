package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public enum TypeFilter implements Parcelable {
    ADDRESS,
    CITIES,
    ESTABLISHMENT,
    GEOCODE,
    REGIONS;


    @RecentlyNonNull
    public static final Parcelable.Creator<TypeFilter> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.api.model.zzck
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            return TypeFilter.valueOf(string);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new TypeFilter[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
