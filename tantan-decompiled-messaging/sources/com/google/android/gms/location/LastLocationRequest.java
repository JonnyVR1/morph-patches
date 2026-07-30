package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import org.checkerframework.dataflow.qual.Pure;
import p149l.i7u0;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LastLocationRequestCreator")
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new zzv();

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getMaxUpdateAgeMillis", m12463id = 1)
    private final long zza;

    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.location.Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", m12463id = 2)
    private final int zzb;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", m12463id = 3)
    private final boolean zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", m12463id = 4)
    private final String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", m12463id = 5)
    private final com.google.android.gms.internal.location.zzd zze;

    @SafeParcelable.Constructor
    public LastLocationRequest(@SafeParcelable.Param(m12464id = 1) long j, @SafeParcelable.Param(m12464id = 2) int i, @SafeParcelable.Param(m12464id = 3) boolean z, @Nullable @SafeParcelable.Param(m12464id = 4) String str, @Nullable @SafeParcelable.Param(m12464id = 5) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = j;
        this.zzb = i;
        this.zzc = z;
        this.zzd = str;
        this.zze = zzdVar;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.zza == lastLocationRequest.zza && this.zzb == lastLocationRequest.zzb && this.zzc == lastLocationRequest.zzc && Objects.equal(this.zzd, lastLocationRequest.zzd) && Objects.equal(this.zze, lastLocationRequest.zze);
    }

    @Pure
    public int getGranularity() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zza;
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.zza), Integer.valueOf(this.zzb), Boolean.valueOf(this.zzc));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.zza != Long.MAX_VALUE) {
            sb.append("maxAge=");
            i7u0.m134924b(this.zza, sb);
        }
        if (this.zzb != 0) {
            sb.append(", ");
            sb.append(zzo.zzb(this.zzb));
        }
        if (this.zzc) {
            sb.append(", bypass");
        }
        if (this.zzd != null) {
            sb.append(", moduleId=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(", impersonation=");
            sb.append(this.zze);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeLong(parcel, 1, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 2, getGranularity());
        SafeParcelWriter.writeBoolean(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Nullable
    @Pure
    public final com.google.android.gms.internal.location.zzd zza() {
        return this.zze;
    }

    @Nullable
    @Deprecated
    @Pure
    public final String zzb() {
        return this.zzd;
    }

    @Pure
    public final boolean zzc() {
        return this.zzc;
    }

    public static final class Builder {
        private long zza;
        private int zzb;
        private boolean zzc;

        @Nullable
        private String zzd;

        @Nullable
        private com.google.android.gms.internal.location.zzd zze;

        public Builder(@NonNull LastLocationRequest lastLocationRequest) {
            this.zza = lastLocationRequest.getMaxUpdateAgeMillis();
            this.zzb = lastLocationRequest.getGranularity();
            this.zzc = lastLocationRequest.zzc();
            this.zzd = lastLocationRequest.zzb();
            this.zze = lastLocationRequest.zza();
        }

        @NonNull
        public LastLocationRequest build() {
            return new LastLocationRequest(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzb = i;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j) {
            Preconditions.checkArgument(j > 0, "maxUpdateAgeMillis must be greater than 0");
            this.zza = j;
            return this;
        }

        public Builder() {
            this.zza = Long.MAX_VALUE;
            this.zzb = 0;
            this.zzc = false;
            this.zzd = null;
            this.zze = null;
        }
    }
}
