package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.bjw0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GassEventParcelCreator")
public final class zzfrw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfrw> CREATOR = new bjw0();

    @SafeParcelable.VersionField(m12520id = 1)
    public final int zza;

    @SafeParcelable.Field(m12517id = 2)
    public final byte[] zzb;

    @SafeParcelable.Constructor
    public zzfrw(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzfrw(byte[] bArr) {
        this(1, bArr);
    }
}
