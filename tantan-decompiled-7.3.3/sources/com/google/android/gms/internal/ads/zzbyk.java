package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;
import p153l.p3t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AutoClickProtectionConfigurationParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbyk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyk> CREATOR = new p3t0();

    @SafeParcelable.Field(m12517id = 2)
    public final boolean zza;

    @Nullable
    @SafeParcelable.Field(m12517id = 3)
    public final List zzb;

    @SafeParcelable.Constructor
    public zzbyk(@SafeParcelable.Param(m12518id = 2) boolean z, @SafeParcelable.Param(m12518id = 3) List list) {
        this.zza = z;
        this.zzb = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 2, z);
        SafeParcelWriter.writeStringList(parcel, 3, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzbyk() {
        this(false, Collections.EMPTY_LIST);
    }
}
