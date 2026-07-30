package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.epw0;
import p153l.pcs0;
import p153l.v8w0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ExceptionParcelCreator")
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new pcs0();

    @SafeParcelable.Field(m12517id = 1)
    public final String zza;

    @SafeParcelable.Field(m12517id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbb(@Nullable @SafeParcelable.Param(m12518id = 1) String str, @SafeParcelable.Param(m12518id = 2) int i) {
        this.zza = str == null ? "" : str;
        this.zzb = i;
    }

    /* JADX INFO: renamed from: H */
    public static zzbb m12398H(Throwable th) {
        zze zzeVarM200324a = v8w0.m200324a(th);
        return new zzbb(epw0.m121875d(th.getMessage()) ? zzeVarM200324a.zzb : th.getMessage(), zzeVarM200324a.zza);
    }

    /* JADX INFO: renamed from: F */
    public final zzba m12399F() {
        return new zzba(this.zza, this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
