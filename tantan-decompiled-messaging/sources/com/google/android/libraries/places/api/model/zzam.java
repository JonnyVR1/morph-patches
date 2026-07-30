package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
final class zzam extends zzc {
    public static final Parcelable.Creator<zzam> CREATOR = new zzal();

    public zzam(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(asList());
    }
}
