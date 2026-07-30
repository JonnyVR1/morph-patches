package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.xwv0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "RequestConfigurationParcelCreator")
public final class zzff extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzff> CREATOR = new xwv0();

    @SafeParcelable.Field(m12463id = 1)
    public final int zza;

    @SafeParcelable.Field(m12463id = 2)
    public final int zzb;

    public zzff(RequestConfiguration requestConfiguration) {
        this.zza = requestConfiguration.m12225c();
        this.zzb = requestConfiguration.m12226d();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzff(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
