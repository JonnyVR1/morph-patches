package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.android.gms.location.LocationRequest;
import java.util.Iterator;
import java.util.List;
import p153l.gau0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationRequestInternalCreator")
@SafeParcelable.Reserved({2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1000})
@Deprecated
public final class zzdd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new gau0();

    @SafeParcelable.Field(defaultValueUnchecked = "null", m12517id = 1)
    LocationRequest zza;

    @SafeParcelable.Constructor
    public zzdd(@SafeParcelable.Param(m12518id = 1) LocationRequest locationRequest, @Nullable @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", m12519id = 5) List list, @SafeParcelable.RemovedParam(defaultValue = "false", m12519id = 8) boolean z, @SafeParcelable.RemovedParam(defaultValue = "false", m12519id = 9) boolean z2, @Nullable @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", m12519id = 10) String str, @SafeParcelable.RemovedParam(defaultValue = "false", m12519id = 11) boolean z3, @SafeParcelable.RemovedParam(defaultValue = "false", m12519id = 12) boolean z4, @Nullable @SafeParcelable.RemovedParam(defaultValueUnchecked = "null", m12519id = 13) String str2, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", m12519id = 14) long j) {
        WorkSource workSource;
        LocationRequest.Builder builder = new LocationRequest.Builder(locationRequest);
        if (list != null) {
            if (list.isEmpty()) {
                workSource = null;
            } else {
                workSource = new WorkSource();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ClientIdentity clientIdentity = (ClientIdentity) it.next();
                    WorkSourceUtil.add(workSource, clientIdentity.uid, clientIdentity.packageName);
                }
            }
            builder.zzd(workSource);
        }
        if (z) {
            builder.setGranularity(1);
        }
        if (z2) {
            builder.zzc(2);
        }
        if (str != null) {
            builder.zzb(str);
        } else if (str2 != null) {
            builder.zzb(str2);
        }
        if (z3) {
            builder.zza(true);
        }
        if (z4) {
            builder.setWaitForAccurateLocation(true);
        }
        if (j != Long.MAX_VALUE) {
            builder.setMaxUpdateAgeMillis(j);
        }
        this.zza = builder.build();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public static zzdd m13822g(@Nullable String str, LocationRequest locationRequest) {
        return new zzdd(locationRequest, null, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzdd) {
            return Objects.equal(this.zza, ((zzdd) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
