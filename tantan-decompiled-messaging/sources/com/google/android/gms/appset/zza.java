package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.nzr0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AppSetIdRequestParamsCreator")
public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zza> CREATOR = new nzr0();

    @Nullable
    @SafeParcelable.Field(getter = "getVersion", m12463id = 1)
    private final String zza;

    @Nullable
    @SafeParcelable.Field(getter = "getClientAppPackageName", m12463id = 2)
    private final String zzb;

    @SafeParcelable.Constructor
    public zza(@Nullable @SafeParcelable.Param(m12464id = 1) String str, @Nullable @SafeParcelable.Param(m12464id = 2) String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
