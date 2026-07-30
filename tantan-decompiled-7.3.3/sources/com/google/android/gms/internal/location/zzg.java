package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.fix0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.Reserved({1000})
public final class zzg extends AbstractSafeParcelable implements Result {

    @SafeParcelable.Field(getter = "getStatus", m12517id = 1)
    private final Status zzb;
    public static final zzg zza = new zzg(Status.RESULT_SUCCESS);
    public static final Parcelable.Creator<zzg> CREATOR = new fix0();

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(m12518id = 1) Status status) {
        this.zzb = status;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzb, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
