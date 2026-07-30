package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.Geofence;
import com.p051p1.mobile.putong.data.User;
import java.util.Locale;
import p153l.hfu0;
import p153l.hnd0;
import p153l.wg3;
import p153l.yrq;
import p153l.za50;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
@SafeParcelable.Class(creator = "ParcelableGeofenceCreator")
@SafeParcelable.Reserved({1000})
public final class zzdh extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzdh> CREATOR = new hfu0();

    @SafeParcelable.Field(getter = "getRequestId", m12517id = 1)
    private final String zza;

    @SafeParcelable.Field(getter = "getExpirationTime", m12517id = 2)
    private final long zzb;

    @SafeParcelable.Field(getter = "getType", m12517id = 3)
    private final short zzc;

    @SafeParcelable.Field(getter = "getLatitude", m12517id = 4)
    private final double zzd;

    @SafeParcelable.Field(getter = "getLongitude", m12517id = 5)
    private final double zze;

    @SafeParcelable.Field(getter = "getRadius", m12517id = 6)
    private final float zzf;

    @SafeParcelable.Field(getter = "getTransitionTypes", m12517id = 7)
    private final int zzg;

    @SafeParcelable.Field(defaultValue = "0", getter = "getNotificationResponsiveness", m12517id = 8)
    private final int zzh;

    @SafeParcelable.Field(defaultValue = User.ID_TEAM_ACCOUNT, getter = "getLoiteringDelay", m12517id = 9)
    private final int zzi;

    @SafeParcelable.Constructor
    public zzdh(@SafeParcelable.Param(m12518id = 1) String str, @SafeParcelable.Param(m12518id = 7) int i, @SafeParcelable.Param(m12518id = 3) short s, @SafeParcelable.Param(m12518id = 4) double d, @SafeParcelable.Param(m12518id = 5) double d2, @SafeParcelable.Param(m12518id = 6) float f, @SafeParcelable.Param(m12518id = 2) long j, @SafeParcelable.Param(m12518id = 8) int i2, @SafeParcelable.Param(m12518id = 9) int i3) {
        if (str == null || str.length() > 100) {
            wg3.m206174a("requestId is null or too long: ".concat(String.valueOf(str)));
            throw null;
        }
        if (f <= 0.0f) {
            hnd0.m136059a("invalid radius: ", f);
            throw null;
        }
        if (d > 90.0d || d < -90.0d) {
            yrq.m217221a("invalid latitude: ", d);
            throw null;
        }
        if (d2 > 180.0d || d2 < -180.0d) {
            yrq.m217221a("invalid longitude: ", d2);
            throw null;
        }
        int i4 = i & 7;
        if (i4 == 0) {
            za50.m219101a("No supported transition specified: ", i);
            throw null;
        }
        this.zzc = s;
        this.zza = str;
        this.zzd = d;
        this.zze = d2;
        this.zzf = f;
        this.zzb = j;
        this.zzg = i4;
        this.zzh = i2;
        this.zzi = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdh) {
            zzdh zzdhVar = (zzdh) obj;
            if (this.zzf == zzdhVar.zzf && this.zzd == zzdhVar.zzd && this.zze == zzdhVar.zze && this.zzc == zzdhVar.zzc) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.zzb;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.zzd;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.zzi;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.zze;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.zzh;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.zzf;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.zza;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.zzg;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.zzd);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.zze);
        return ((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) + 31) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.zzf)) * 31) + this.zzc) * 31) + this.zzg;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s = this.zzc;
        if (s != -1) {
            str = s != 1 ? "UNKNOWN" : "CIRCLE";
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.zza.replaceAll("\\p{C}", "?"), Integer.valueOf(this.zzg), Double.valueOf(this.zzd), Double.valueOf(this.zze), Float.valueOf(this.zzf), Integer.valueOf(this.zzh / 1000), Integer.valueOf(this.zzi), Long.valueOf(this.zzb));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeShort(parcel, 3, this.zzc);
        SafeParcelWriter.writeDouble(parcel, 4, this.zzd);
        SafeParcelWriter.writeDouble(parcel, 5, this.zze);
        SafeParcelWriter.writeFloat(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
