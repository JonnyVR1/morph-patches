package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.List;
import p149l.hsu0;
import p149l.v9u0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "ClientIdentityCreator")
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new hsu0();

    @SafeParcelable.Field(getter = "getUid", m12463id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "getPid", m12463id = 2)
    private final int zzb;

    @SafeParcelable.Field(getter = "getPackageName", m12463id = 3)
    private final String zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getAttributionTag", m12463id = 4)
    private final String zzd;

    @SafeParcelable.Field(getter = "getClientSdkVersion", m12463id = 5)
    private final int zze;

    @Nullable
    @SafeParcelable.Field(getter = "getListenerId", m12463id = 6)
    private final String zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonator", m12463id = 7)
    private final zzd zzg;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.common.collect.ImmutableList.of()", getter = "getClientFeatures", m12463id = 8)
    private final List zzh;

    static {
        Process.myUid();
        Process.myPid();
    }

    @SafeParcelable.Constructor
    public zzd(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) int i2, @SafeParcelable.Param(m12464id = 3) String str, @Nullable @SafeParcelable.Param(m12464id = 4) String str2, @Nullable @SafeParcelable.Param(m12464id = 6) String str3, @SafeParcelable.Param(m12464id = 5) int i3, @SafeParcelable.Param(m12464id = 8) List list, @Nullable @SafeParcelable.Param(m12464id = 7) zzd zzdVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = str3;
        this.zze = i3;
        this.zzh = zzds.zzj(list);
        this.zzg = zzdVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzd) {
            zzd zzdVar = (zzd) obj;
            if (this.zza == zzdVar.zza && this.zzb == zzdVar.zzb && this.zze == zzdVar.zze && this.zzc.equals(zzdVar.zzc) && v9u0.m197600a(this.zzd, zzdVar.zzd) && v9u0.m197600a(this.zzf, zzdVar.zzf) && v9u0.m197600a(this.zzg, zzdVar.zzg) && this.zzh.equals(zzdVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), this.zzc, this.zzd, this.zzf});
    }

    public final String toString() {
        int length = this.zzc.length() + 18;
        String str = this.zzd;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.zza);
        sb.append("/");
        sb.append(this.zzc);
        if (this.zzd != null) {
            sb.append("[");
            boolean zStartsWith = this.zzd.startsWith(this.zzc);
            String str2 = this.zzd;
            if (zStartsWith) {
                sb.append((CharSequence) str2, this.zzc.length(), this.zzd.length());
            } else {
                sb.append(str2);
            }
            sb.append(Constants.AES_SUFFIX);
        }
        if (this.zzf != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.zzf.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeString(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeTypedList(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
