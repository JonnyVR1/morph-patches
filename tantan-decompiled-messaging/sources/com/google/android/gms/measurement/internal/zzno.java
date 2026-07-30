package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.w9y0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "TriggerUriParcelCreator")
public final class zzno extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzno> CREATOR = new w9y0();

    @SafeParcelable.Field(m12463id = 1)
    public final String zza;

    @SafeParcelable.Field(m12463id = 2)
    public final long zzb;

    @SafeParcelable.Field(m12463id = 3)
    public final int zzc;

    @SafeParcelable.Constructor
    public zzno(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) long j, @SafeParcelable.Param(m12464id = 3) int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
