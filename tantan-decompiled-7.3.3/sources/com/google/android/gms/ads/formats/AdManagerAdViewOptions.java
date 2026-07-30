package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.hns0;
import p153l.ins0;
import p153l.v5t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new v5t0();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m12517id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m12517id = 2)
    private final IBinder zzb;

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(m12518id = 1) boolean z, @Nullable @SafeParcelable.Param(m12518id = 2) IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public boolean m12283F() {
        return this.zza;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final ins0 m12284H() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return hns0.m136273o8(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12283F());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
