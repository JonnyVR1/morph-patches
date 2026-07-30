package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import p149l.aav0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LiteSdkVersionsParcelCreator")
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new aav0();

    @SafeParcelable.Field(getter = "getAdsDynamiteVersion", m12463id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getSdkVersionLite", m12463id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getGranularVersion", m12463id = 3)
    private final String zzc;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 240304000, "23.0.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }

    @SafeParcelable.Constructor
    public zzen(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) int i2, @SafeParcelable.Param(m12464id = 3) String str) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
    }
}
