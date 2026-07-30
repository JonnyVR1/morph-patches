package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.h950;
import p153l.p1m;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new zzp();

    @SafeParcelable.Field(getter = "getCallingPackage", m12517id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getAllowTestKeys", m12517id = 2)
    private final boolean zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "getIgnoreTestKeysOverride", m12517id = 3)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCallingContextBinder", m12517id = 4, type = "android.os.IBinder")
    private final Context zzd;

    @SafeParcelable.Field(getter = "getIsChimeraPackage", m12517id = 5)
    private final boolean zze;

    @SafeParcelable.Field(getter = "getIncludeHashesInErrorMessage", m12517id = 6)
    private final boolean zzf;

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m12518id = 1) String str, @SafeParcelable.Param(m12518id = 2) boolean z, @SafeParcelable.Param(m12518id = 3) boolean z2, @SafeParcelable.Param(m12518id = 4) IBinder iBinder, @SafeParcelable.Param(m12518id = 5) boolean z3, @SafeParcelable.Param(m12518id = 6) boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = (Context) h950.m134037P2(p1m.AbstractBinderC19271a.m170217O(iBinder));
        this.zze = z3;
        this.zzf = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, l.p1m] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeIBinder(parcel, 4, h950.m134038Y2(this.zzd), false);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zze);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
