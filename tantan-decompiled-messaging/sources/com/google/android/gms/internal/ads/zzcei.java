package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.c3t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "VersionInfoParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzcei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcei> CREATOR = new c3t0();

    @SafeParcelable.Field(m12463id = 2)
    public String zza;

    @SafeParcelable.Field(m12463id = 3)
    public int zzb;

    @SafeParcelable.Field(m12463id = 4)
    public int zzc;

    @SafeParcelable.Field(m12463id = 5)
    public boolean zzd;

    @SafeParcelable.Field(m12463id = 6)
    public boolean zze;

    public zzcei(int i, int i2, boolean z, boolean z2, boolean z3) {
        this("afma-sdk-a-v" + i + "." + i2 + "." + (z ? "0" : "1"), i, i2, z, z3);
    }

    /* JADX INFO: renamed from: F */
    public static zzcei m13558F() {
        return new zzcei(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzcei(int i, int i2, boolean z, boolean z2) {
        this(240304000, i2, true, false, z2);
    }

    @SafeParcelable.Constructor
    public zzcei(@SafeParcelable.Param(m12464id = 2) String str, @SafeParcelable.Param(m12464id = 3) int i, @SafeParcelable.Param(m12464id = 4) int i2, @SafeParcelable.Param(m12464id = 5) boolean z, @SafeParcelable.Param(m12464id = 6) boolean z2) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = z2;
    }
}
