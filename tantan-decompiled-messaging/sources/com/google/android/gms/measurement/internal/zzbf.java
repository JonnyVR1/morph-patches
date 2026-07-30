package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.z9s0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "EventParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbf> CREATOR = new z9s0();

    @SafeParcelable.Field(m12463id = 2)
    public final String zza;

    @SafeParcelable.Field(m12463id = 3)
    public final zzbe zzb;

    @SafeParcelable.Field(m12463id = 4)
    public final String zzc;

    @SafeParcelable.Field(m12463id = 5)
    public final long zzd;

    public zzbf(zzbf zzbfVar, long j) {
        Preconditions.checkNotNull(zzbfVar);
        this.zza = zzbfVar.zza;
        this.zzb = zzbfVar.zzb;
        this.zzc = zzbfVar.zzc;
        this.zzd = j;
    }

    public final String toString() {
        return "origin=" + this.zzc + ",name=" + this.zza + ",params=" + String.valueOf(this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbf(@SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 3) zzbe zzbeVar, @SafeParcelable.Param(m12464id = 4) String str2, @SafeParcelable.Param(m12464id = 5) long j) {
        this.zza = str;
        this.zzb = zzbeVar;
        this.zzc = str2;
        this.zzd = j;
    }
}
