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
import p153l.lix0;
import p153l.y7t0;
import p153l.z6t0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new lix0();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m12517id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", m12517id = 2, type = "android.os.IBinder")
    private final y7t0 zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m12517id = 3)
    private final IBinder zzc;

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(m12518id = 1) boolean z, @Nullable @SafeParcelable.Param(m12518id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(m12518id = 3) IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? z6t0.m218810o8(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final y7t0 m12285F() {
        return this.zzb;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final ins0 m12286H() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return hns0.m136273o8(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        y7t0 y7t0Var = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, y7t0Var == null ? null : y7t0Var.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
