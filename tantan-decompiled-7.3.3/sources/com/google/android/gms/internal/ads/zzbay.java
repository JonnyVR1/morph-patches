package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.InputStream;
import p153l.ibs0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "CacheEntryParcelCreator")
@SafeParcelable.Reserved({1})
public final class zzbay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbay> CREATOR = new ibs0();

    @Nullable
    @SafeParcelable.Field(getter = "getContentFileDescriptor", m12517id = 2)
    private ParcelFileDescriptor zza;

    @SafeParcelable.Field(getter = "hasAdditionalMetadataFromReadV2", m12517id = 3)
    private final boolean zzb;

    @SafeParcelable.Field(getter = "isDownloaded", m12517id = 4)
    private final boolean zzc;

    @SafeParcelable.Field(getter = "getCachedBytes", m12517id = 5)
    private final long zzd;

    @SafeParcelable.Field(getter = "isGcacheHit", m12517id = 6)
    private final boolean zze;

    @SafeParcelable.Constructor
    public zzbay(@Nullable @SafeParcelable.Param(m12518id = 2) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(m12518id = 3) boolean z, @SafeParcelable.Param(m12518id = 4) boolean z2, @SafeParcelable.Param(m12518id = 5) long j, @SafeParcelable.Param(m12518id = 6) boolean z3) {
        this.zza = parcelFileDescriptor;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = z3;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized long m13595F() {
        return this.zzd;
    }

    /* JADX INFO: renamed from: H */
    public final synchronized ParcelFileDescriptor m13596H() {
        return this.zza;
    }

    @Nullable
    /* JADX INFO: renamed from: I */
    public final synchronized InputStream m13597I() {
        if (this.zza == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.zza);
        this.zza = null;
        return autoCloseInputStream;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized boolean m13598J() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: h0 */
    public final synchronized boolean m13599h0() {
        return this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, m13596H(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, zzd());
        SafeParcelWriter.writeBoolean(parcel, 4, m13598J());
        SafeParcelWriter.writeLong(parcel, 5, m13595F());
        SafeParcelWriter.writeBoolean(parcel, 6, m13599h0());
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final synchronized boolean zzd() {
        return this.zzb;
    }

    public final synchronized boolean zze() {
        return this.zza != null;
    }

    public zzbay() {
        this(null, false, false, 0L, false);
    }
}
