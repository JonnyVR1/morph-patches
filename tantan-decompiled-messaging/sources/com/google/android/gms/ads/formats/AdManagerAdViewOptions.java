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
import p149l.pws0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "AdManagerAdViewOptionsCreator")
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new pws0();

    @SafeParcelable.Field(getter = "getManualImpressionsEnabled", m12463id = 1)
    private final boolean zza;

    @Nullable
    @SafeParcelable.Field(getter = "getDelayedBannerAdListenerBinder", m12463id = 2)
    private final IBinder zzb;

    @SafeParcelable.Constructor
    public AdManagerAdViewOptions(@SafeParcelable.Param(m12464id = 1) boolean z, @Nullable @SafeParcelable.Param(m12464id = 2) IBinder iBinder) {
        this.zza = z;
        this.zzb = iBinder;
    }

    /* JADX INFO: renamed from: F */
    public boolean m12229F() {
        return this.zza;
    }

    @Nullable
    /* JADX INFO: renamed from: H */
    public final ces0 m12230H() {
        IBinder iBinder = this.zzb;
        if (iBinder == null) {
            return null;
        }
        return bes0.m101418o8(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, m12229F());
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
