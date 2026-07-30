package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.g6l0;
import p149l.t2w0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "VideoOptionsParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzfk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfk> CREATOR = new t2w0();

    @SafeParcelable.Field(m12463id = 2)
    public final boolean zza;

    @SafeParcelable.Field(m12463id = 3)
    public final boolean zzb;

    @SafeParcelable.Field(m12463id = 4)
    public final boolean zzc;

    public zzfk(g6l0 g6l0Var) {
        this(g6l0Var.m124599c(), g6l0Var.m124598b(), g6l0Var.m124597a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzc);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfk(@SafeParcelable.Param(m12464id = 2) boolean z, @SafeParcelable.Param(m12464id = 3) boolean z2, @SafeParcelable.Param(m12464id = 4) boolean z3) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = z3;
    }
}
