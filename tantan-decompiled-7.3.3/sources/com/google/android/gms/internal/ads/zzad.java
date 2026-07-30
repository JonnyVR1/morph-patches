package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import p153l.a8t0;
import p153l.mpw0;
import p153l.pdr0;

/* JADX INFO: loaded from: classes6.dex */
public final class zzad implements Parcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new pdr0();
    public final UUID zza;

    @Nullable
    public final String zzb;
    public final String zzc;

    @Nullable
    public final byte[] zzd;
    private int zze;

    public zzad(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String string = parcel.readString();
        int i = mpw0.f137957a;
        this.zzc = string;
        this.zzd = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzad)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzad zzadVar = (zzad) obj;
        return mpw0.m159408f(this.zzb, zzadVar.zzb) && mpw0.m159408f(this.zzc, zzadVar.zzc) && mpw0.m159408f(this.zza, zzadVar.zza) && Arrays.equals(this.zzd, zzadVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int iHashCode2 = ((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
        this.zze = iHashCode2;
        return iHashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.zza.getMostSignificantBits());
        parcel.writeLong(this.zza.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzad(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = a8t0.m96493e(str2);
        this.zzd = bArr;
    }
}
