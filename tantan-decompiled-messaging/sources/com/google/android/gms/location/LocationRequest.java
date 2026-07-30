package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import com.facebook.AuthenticationTokenClaims;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.WorkSourceUtil;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.data.User;
import org.checkerframework.dataflow.qual.Pure;
import p149l.efd0;
import p149l.i7u0;
import p149l.k250;

/* JADX INFO: loaded from: classes6.dex */
@SafeParcelable.Class(creator = "LocationRequestCreator")
@SafeParcelable.Reserved({4, 5, 1000})
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new zzx();

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;

    @SafeParcelable.Field(defaultValueUnchecked = "Priority.PRIORITY_BALANCED_POWER_ACCURACY", getter = "getPriority", m12463id = 1)
    private int zza;

    @SafeParcelable.Field(defaultValue = "3600000", getter = "getIntervalMillis", m12463id = 2)
    private long zzb;

    @SafeParcelable.Field(defaultValue = "600000", getter = "getMinUpdateIntervalMillis", m12463id = 3)
    private long zzc;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMaxUpdateDelayMillis", m12463id = 8)
    private long zzd;

    @SafeParcelable.Field(defaultValueUnchecked = "Long.MAX_VALUE", getter = "getDurationMillis", m12463id = 10)
    private long zze;

    @SafeParcelable.Field(defaultValueUnchecked = "Integer.MAX_VALUE", getter = "getMaxUpdates", m12463id = 6)
    private int zzf;

    @SafeParcelable.Field(defaultValue = "0", getter = "getMinUpdateDistanceMeters", m12463id = 7)
    private float zzg;

    @SafeParcelable.Field(defaultValue = "false", getter = "isWaitForAccurateLocation", m12463id = 9)
    private boolean zzh;

    @SafeParcelable.Field(defaultValueUnchecked = User.ID_TEAM_ACCOUNT, getter = "getMaxUpdateAgeMillis", m12463id = 11)
    private long zzi;

    @SafeParcelable.Field(defaultValueUnchecked = "Granularity.GRANULARITY_PERMISSION_LEVEL", getter = "getGranularity", m12463id = 12)
    private final int zzj;

    @SafeParcelable.Field(defaultValueUnchecked = "ThrottleBehavior.THROTTLE_BACKGROUND", getter = "getThrottleBehavior", m12463id = 13)
    private final int zzk;

    @Nullable
    @SafeParcelable.Field(getter = "getModuleId", m12463id = 14)
    private final String zzl;

    @SafeParcelable.Field(defaultValue = "false", getter = "isBypass", m12463id = 15)
    private final boolean zzm;

    @SafeParcelable.Field(defaultValueUnchecked = "new android.os.WorkSource()", getter = "getWorkSource", m12463id = 16)
    private final WorkSource zzn;

    @Nullable
    @SafeParcelable.Field(getter = "getImpersonation", m12463id = 17)
    private final com.google.android.gms.internal.location.zzd zzo;

    @SafeParcelable.Constructor
    public LocationRequest(@SafeParcelable.Param(m12464id = 1) int i, @SafeParcelable.Param(m12464id = 2) long j, @SafeParcelable.Param(m12464id = 3) long j2, @SafeParcelable.Param(m12464id = 8) long j3, @SafeParcelable.RemovedParam(defaultValueUnchecked = "Long.MAX_VALUE", m12465id = 5) long j4, @SafeParcelable.Param(m12464id = 10) long j5, @SafeParcelable.Param(m12464id = 6) int i2, @SafeParcelable.Param(m12464id = 7) float f, @SafeParcelable.Param(m12464id = 9) boolean z, @SafeParcelable.Param(m12464id = 11) long j6, @SafeParcelable.Param(m12464id = 12) int i3, @SafeParcelable.Param(m12464id = 13) int i4, @Nullable @SafeParcelable.Param(m12464id = 14) String str, @SafeParcelable.Param(m12464id = 15) boolean z2, @SafeParcelable.Param(m12464id = 16) WorkSource workSource, @Nullable @SafeParcelable.Param(m12464id = 17) com.google.android.gms.internal.location.zzd zzdVar) {
        this.zza = i;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4 == Long.MAX_VALUE ? j5 : Math.min(Math.max(1L, j4 - SystemClock.elapsedRealtime()), j5);
        this.zzf = i2;
        this.zzg = f;
        this.zzh = z;
        this.zzi = j6 != -1 ? j6 : j;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = str;
        this.zzm = z2;
        this.zzn = workSource;
        this.zzo = zzdVar;
    }

    @NonNull
    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    private static String zzf(long j) {
        return j == Long.MAX_VALUE ? "∞" : i7u0.m134923a(j);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzm == locationRequest.zzm && this.zzn.equals(locationRequest.zzn) && Objects.equal(this.zzl, locationRequest.zzl) && Objects.equal(this.zzo, locationRequest.zzo)))) {
                return true;
            }
        }
        return false;
    }

    @Pure
    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    @Pure
    public long getExpirationTime() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.zze;
        long j2 = jElapsedRealtime + j;
        if (((jElapsedRealtime ^ j2) & (j ^ j2)) < 0) {
            return Long.MAX_VALUE;
        }
        return j2;
    }

    @Deprecated
    @Pure
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    @Pure
    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    @Pure
    public long getInterval() {
        return getIntervalMillis();
    }

    @Pure
    public long getIntervalMillis() {
        return this.zzb;
    }

    @Pure
    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    @Pure
    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    @Pure
    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    @Pure
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    @Pure
    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    @Pure
    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    @Pure
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    @Pure
    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    @Pure
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzn);
    }

    @Pure
    public boolean isBatched() {
        long j = this.zzd;
        return j > 0 && (j >> 1) >= this.zzb;
    }

    @Deprecated
    @Pure
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    @Pure
    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationDuration(long j) {
        Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
        this.zze = j;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setExpirationTime(long j) {
        this.zze = Math.max(1L, j - SystemClock.elapsedRealtime());
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setFastestInterval(long j) {
        Preconditions.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
        this.zzc = j;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setInterval(long j) {
        Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
        long j2 = this.zzc;
        long j3 = this.zzb;
        if (j2 == j3 / 6) {
            this.zzc = j / 6;
        }
        if (this.zzi == j3) {
            this.zzi = j;
        }
        this.zzb = j;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setMaxWaitTime(long j) {
        Preconditions.checkArgument(j >= 0, "illegal max wait time: %d", Long.valueOf(j));
        this.zzd = j;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setNumUpdates(int i) {
        if (i > 0) {
            this.zzf = i;
            return this;
        }
        k250.m144273a("invalid numUpdates: ", i);
        return null;
    }

    @NonNull
    @Deprecated
    public LocationRequest setPriority(int i) {
        zzae.zza(i);
        this.zza = i;
        return this;
    }

    @NonNull
    @Deprecated
    public LocationRequest setSmallestDisplacement(float f) {
        if (f >= 0.0f) {
            this.zzg = f;
            return this;
        }
        efd0.m116031a("invalid displacement: ", f);
        return null;
    }

    @NonNull
    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z) {
        this.zzh = z;
        return this;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        if (isPassive()) {
            sb.append(zzae.zzb(this.zza));
        } else {
            sb.append("@");
            boolean zIsBatched = isBatched();
            long j = this.zzb;
            if (zIsBatched) {
                i7u0.m134924b(j, sb);
                sb.append("/");
                i7u0.m134924b(this.zzd, sb);
            } else {
                i7u0.m134924b(j, sb);
            }
            sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb.append(zzae.zzb(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            sb.append(", minUpdateInterval=");
            sb.append(zzf(this.zzc));
        }
        if (this.zzg > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            sb.append(", minUpdateDistance=");
            sb.append(this.zzg);
        }
        boolean zIsPassive = isPassive();
        long j2 = this.zzi;
        if (!zIsPassive ? j2 != this.zzb : j2 != Long.MAX_VALUE) {
            sb.append(", maxUpdateAge=");
            sb.append(zzf(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            sb.append(", duration=");
            i7u0.m134924b(this.zze, sb);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.zzf);
        }
        if (this.zzk != 0) {
            sb.append(", ");
            sb.append(zzai.zza(this.zzk));
        }
        if (this.zzj != 0) {
            sb.append(", ");
            sb.append(zzo.zzb(this.zzj));
        }
        if (this.zzh) {
            sb.append(", waitForAccurateLocation");
        }
        if (this.zzm) {
            sb.append(", bypass");
        }
        if (this.zzl != null) {
            sb.append(", moduleId=");
            sb.append(this.zzl);
        }
        if (!WorkSourceUtil.isEmpty(this.zzn)) {
            sb.append(", ");
            sb.append(this.zzn);
        }
        if (this.zzo != null) {
            sb.append(", impersonation=");
            sb.append(this.zzo);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getPriority());
        SafeParcelWriter.writeLong(parcel, 2, getIntervalMillis());
        SafeParcelWriter.writeLong(parcel, 3, getMinUpdateIntervalMillis());
        SafeParcelWriter.writeInt(parcel, 6, getMaxUpdates());
        SafeParcelWriter.writeFloat(parcel, 7, getMinUpdateDistanceMeters());
        SafeParcelWriter.writeLong(parcel, 8, getMaxUpdateDelayMillis());
        SafeParcelWriter.writeBoolean(parcel, 9, isWaitForAccurateLocation());
        SafeParcelWriter.writeLong(parcel, 10, getDurationMillis());
        SafeParcelWriter.writeLong(parcel, 11, getMaxUpdateAgeMillis());
        SafeParcelWriter.writeInt(parcel, 12, getGranularity());
        SafeParcelWriter.writeInt(parcel, 13, this.zzk);
        SafeParcelWriter.writeString(parcel, 14, this.zzl, false);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzm);
        SafeParcelWriter.writeParcelable(parcel, 16, this.zzn, i, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzo, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Pure
    public final int zza() {
        return this.zzk;
    }

    @NonNull
    @Pure
    public final WorkSource zzb() {
        return this.zzn;
    }

    @Nullable
    @Pure
    public final com.google.android.gms.internal.location.zzd zzc() {
        return this.zzo;
    }

    @Nullable
    @Deprecated
    @Pure
    public final String zzd() {
        return this.zzl;
    }

    @Pure
    public final boolean zze() {
        return this.zzm;
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null);
    }

    public static final class Builder {
        public static final long IMPLICIT_MAX_UPDATE_AGE = -1;
        public static final long IMPLICIT_MIN_UPDATE_INTERVAL = -1;
        private int zza;
        private long zzb;
        private long zzc;
        private long zzd;
        private long zze;
        private int zzf;
        private float zzg;
        private boolean zzh;
        private long zzi;
        private int zzj;
        private int zzk;

        @Nullable
        private String zzl;
        private boolean zzm;

        @Nullable
        private WorkSource zzn;

        @Nullable
        private com.google.android.gms.internal.location.zzd zzo;

        public Builder(@NonNull LocationRequest locationRequest) {
            this.zza = locationRequest.getPriority();
            this.zzb = locationRequest.getIntervalMillis();
            this.zzc = locationRequest.getMinUpdateIntervalMillis();
            this.zzd = locationRequest.getMaxUpdateDelayMillis();
            this.zze = locationRequest.getDurationMillis();
            this.zzf = locationRequest.getMaxUpdates();
            this.zzg = locationRequest.getMinUpdateDistanceMeters();
            this.zzh = locationRequest.isWaitForAccurateLocation();
            this.zzi = locationRequest.getMaxUpdateAgeMillis();
            this.zzj = locationRequest.getGranularity();
            this.zzk = locationRequest.zza();
            this.zzl = locationRequest.zzd();
            this.zzm = locationRequest.zze();
            this.zzn = locationRequest.zzb();
            this.zzo = locationRequest.zzc();
        }

        @NonNull
        public LocationRequest build() {
            int i = this.zza;
            long j = this.zzb;
            long jMin = this.zzc;
            if (jMin == -1) {
                jMin = j;
            } else if (i != 105) {
                jMin = Math.min(jMin, j);
            }
            long jMax = Math.max(this.zzd, this.zzb);
            long j2 = jMin;
            long j3 = this.zze;
            int i2 = this.zzf;
            float f = this.zzg;
            boolean z = this.zzh;
            long j4 = this.zzi;
            if (j4 == -1) {
                j4 = this.zzb;
            }
            return new LocationRequest(i, j, j2, jMax, Long.MAX_VALUE, j3, i2, f, z, j4, this.zzj, this.zzk, this.zzl, this.zzm, new WorkSource(this.zzn), this.zzo);
        }

        @NonNull
        public Builder setDurationMillis(long j) {
            Preconditions.checkArgument(j > 0, "durationMillis must be greater than 0");
            this.zze = j;
            return this;
        }

        @NonNull
        public Builder setGranularity(int i) {
            zzo.zza(i);
            this.zzj = i;
            return this;
        }

        @NonNull
        public Builder setIntervalMillis(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateAgeMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "maxUpdateAgeMillis must be greater than or equal to 0, or IMPLICIT_MAX_UPDATE_AGE");
            this.zzi = j;
            return this;
        }

        @NonNull
        public Builder setMaxUpdateDelayMillis(long j) {
            Preconditions.checkArgument(j >= 0, "maxUpdateDelayMillis must be greater than or equal to 0");
            this.zzd = j;
            return this;
        }

        @NonNull
        public Builder setMaxUpdates(int i) {
            Preconditions.checkArgument(i > 0, "maxUpdates must be greater than 0");
            this.zzf = i;
            return this;
        }

        @NonNull
        public Builder setMinUpdateDistanceMeters(float f) {
            Preconditions.checkArgument(f >= 0.0f, "minUpdateDistanceMeters must be greater than or equal to 0");
            this.zzg = f;
            return this;
        }

        @NonNull
        public Builder setMinUpdateIntervalMillis(long j) {
            boolean z = true;
            if (j != -1 && j < 0) {
                z = false;
            }
            Preconditions.checkArgument(z, "minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL");
            this.zzc = j;
            return this;
        }

        @NonNull
        public Builder setPriority(int i) {
            zzae.zza(i);
            this.zza = i;
            return this;
        }

        @NonNull
        public Builder setWaitForAccurateLocation(boolean z) {
            this.zzh = z;
            return this;
        }

        @NonNull
        @RequiresPermission(anyOf = {"android.permission.WRITE_SECURE_SETTINGS", "android.permission.LOCATION_BYPASS"})
        public final Builder zza(boolean z) {
            this.zzm = z;
            return this;
        }

        @NonNull
        @Deprecated
        public final Builder zzb(@Nullable String str) {
            if (Build.VERSION.SDK_INT < 30) {
                this.zzl = str;
            }
            return this;
        }

        @NonNull
        public final Builder zzc(int i) {
            int i2;
            boolean z = true;
            if (i == 0 || i == 1) {
                i2 = i;
            } else {
                i2 = 2;
                if (i == 2) {
                    i = 2;
                } else {
                    z = false;
                    i2 = i;
                }
            }
            Preconditions.checkArgument(z, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i));
            this.zzk = i2;
            return this;
        }

        @NonNull
        @RequiresPermission("android.permission.UPDATE_DEVICE_STATS")
        public final Builder zzd(@Nullable WorkSource workSource) {
            this.zzn = workSource;
            return this;
        }

        public Builder(long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            this.zzb = j;
            this.zza = 102;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }

        public Builder(int i, long j) {
            Preconditions.checkArgument(j >= 0, "intervalMillis must be greater than or equal to 0");
            zzae.zza(i);
            this.zza = i;
            this.zzb = j;
            this.zzc = -1L;
            this.zzd = 0L;
            this.zze = Long.MAX_VALUE;
            this.zzf = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.zzg = 0.0f;
            this.zzh = true;
            this.zzi = -1L;
            this.zzj = 0;
            this.zzk = 0;
            this.zzl = null;
            this.zzm = false;
            this.zzn = null;
            this.zzo = null;
        }
    }
}
