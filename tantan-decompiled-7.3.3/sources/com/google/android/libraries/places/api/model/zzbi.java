package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
final class zzbi extends zzv {
    public static final Parcelable.Creator<zzbi> CREATOR = new zzbh();

    public zzbi(String str, int i, int i2, String str2, @Nullable String str3, @Nullable AuthorAttributions authorAttributions) {
        super(str, i, i2, str2, str3, authorAttributions);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zzb());
        if (zza() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zza());
        }
        parcel.writeParcelable(getAuthorAttributions(), i);
    }
}
