package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.vvt0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AppSetInfoParcelCreator")
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new vvt0();

    @SafeParcelable.Field(getter = "getId", m12463id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getScope", m12463id = 2)
    private final int zzb;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m12464id = 1) String str, @SafeParcelable.Param(m12464id = 2) int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
