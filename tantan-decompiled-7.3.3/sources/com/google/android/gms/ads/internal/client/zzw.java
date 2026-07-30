package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.m3z0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AppOpenAdOptionsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzw> CREATOR = new m3z0();

    @SafeParcelable.Field(m12517id = 2)
    public final int zza;

    @SafeParcelable.Constructor
    public zzw(@SafeParcelable.Param(m12518id = 2) int i) {
        this.zza = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, i2);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
