package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p149l.bes0;
import p149l.ces0;
import p149l.f9x0;
import p149l.sys0;
import p149l.txs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "PublisherAdViewOptionsCreator")
@Deprecated
public final class PublisherAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new f9x0();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m12463id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getAppEventListenerBinder", m12463id = 2, type = "android.os.IBinder")
    private final sys0 zzb;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m12463id = 3)
    private final IBinder zzc;

    @SafeParcelable.Constructor
    public PublisherAdViewOptions(@SafeParcelable.Param(m12464id = 1) boolean z, @Nullable @SafeParcelable.Param(m12464id = 2) IBinder iBinder, @Nullable @SafeParcelable.Param(m12464id = 3) IBinder iBinder2) {
        this.zza = z;
        this.zzb = iBinder != null ? txs0.m190975o8(iBinder) : null;
        this.zzc = iBinder2;
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final sys0 m12231F() {
        return this.zzb;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final ces0 m12232H() {
        IBinder iBinder = this.zzc;
        if (iBinder == null) {
            return null;
        }
        return bes0.m101418o8(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        sys0 sys0Var = this.zzb;
        SafeParcelWriter.writeIBinder(parcel, 2, sys0Var == null ? null : sys0Var.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final boolean zzc() {
        return this.zza;
    }
}
