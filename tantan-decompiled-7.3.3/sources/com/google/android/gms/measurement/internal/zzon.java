package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p153l.bny0;
import p153l.wg3;
import p153l.ymy0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "UserAttributeParcelCreator")
public final class zzon extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzon> CREATOR = new bny0();

    @SafeParcelable.Field(m12517id = 2)
    public final String zza;

    @SafeParcelable.Field(m12517id = 3)
    public final long zzb;

    @Nullable
    @SafeParcelable.Field(m12517id = 4)
    public final Long zzc;

    @Nullable
    @SafeParcelable.Field(m12517id = 6)
    public final String zzd;

    @SafeParcelable.Field(m12517id = 7)
    public final String zze;

    @Nullable
    @SafeParcelable.Field(m12517id = 8)
    public final Double zzf;

    @SafeParcelable.Field(m12517id = 1)
    private final int zzg;

    public zzon(String str, long j, @Nullable Object obj, String str2) {
        Preconditions.checkNotEmpty(str);
        this.zzg = 2;
        this.zza = str;
        this.zzb = j;
        this.zze = str2;
        if (obj == null) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = null;
            return;
        }
        if (obj instanceof Long) {
            this.zzc = (Long) obj;
            this.zzf = null;
            this.zzd = null;
        } else if (obj instanceof String) {
            this.zzc = null;
            this.zzf = null;
            this.zzd = (String) obj;
        } else {
            if (!(obj instanceof Double)) {
                wg3.m206174a("User attribute given of un-supported type");
                throw null;
            }
            this.zzc = null;
            this.zzf = (Double) obj;
            this.zzd = null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public final Object m15413F() {
        Long l2 = this.zzc;
        if (l2 != null) {
            return l2;
        }
        Double d = this.zzf;
        if (d != null) {
            return d;
        }
        String str = this.zzd;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzg);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeLong(parcel, 3, this.zzb);
        SafeParcelWriter.writeLongObject(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeFloatObject(parcel, 5, null, false);
        SafeParcelWriter.writeString(parcel, 6, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 7, this.zze, false);
        SafeParcelWriter.writeDoubleObject(parcel, 8, this.zzf, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzon(ymy0 ymy0Var) {
        this(ymy0Var.f200729c, ymy0Var.f200730d, ymy0Var.f200731e, ymy0Var.f200728b);
    }

    @SafeParcelable.Constructor
    public zzon(@SafeParcelable.Param(m12518id = 1) int i, @SafeParcelable.Param(m12518id = 2) String str, @SafeParcelable.Param(m12518id = 3) long j, @Nullable @SafeParcelable.Param(m12518id = 4) Long l2, @SafeParcelable.Param(m12518id = 5) Float f, @Nullable @SafeParcelable.Param(m12518id = 6) String str2, @SafeParcelable.Param(m12518id = 7) String str3, @Nullable @SafeParcelable.Param(m12518id = 8) Double d) {
        this.zzg = i;
        this.zza = str;
        this.zzb = j;
        this.zzc = l2;
        if (i == 1) {
            this.zzf = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.zzf = d;
        }
        this.zzd = str2;
        this.zze = str3;
    }
}
