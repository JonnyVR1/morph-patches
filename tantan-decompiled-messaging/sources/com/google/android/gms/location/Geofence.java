package com.google.android.gms.location;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.location.zzdh;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import p149l.ig3;

/* JADX INFO: loaded from: classes6.dex */
public interface Geofence {
    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1;

    public static final class Builder {
        private double zze;
        private double zzf;
        private float zzg;
        private String zza = null;

        @TransitionTypes
        private int zzb = 0;
        private long zzc = Long.MIN_VALUE;
        private short zzd = -1;
        private int zzh = 0;
        private int zzi = -1;

        @NonNull
        public Geofence build() {
            if (this.zza == null) {
                ig3.m135964a("Request ID not set.");
                return null;
            }
            int i = this.zzb;
            if (i == 0) {
                ig3.m135964a("Transitions types not set.");
                return null;
            }
            if ((i & 4) != 0 && this.zzi < 0) {
                ig3.m135964a("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELL.");
                return null;
            }
            if (this.zzc == Long.MIN_VALUE) {
                ig3.m135964a("Expiration not set.");
                return null;
            }
            if (this.zzd == -1) {
                ig3.m135964a("Geofence region not set.");
                return null;
            }
            if (this.zzh >= 0) {
                return new zzdh(this.zza, this.zzb, (short) 1, this.zze, this.zzf, this.zzg, this.zzc, this.zzh, this.zzi);
            }
            ig3.m135964a("Notification responsiveness should be nonnegative.");
            return null;
        }

        @NonNull
        public Builder setCircularRegion(@FloatRange(from = -90.0d, to = 90.0d) double d, @FloatRange(from = -180.0d, to = 180.0d) double d2, @FloatRange(from = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, fromInclusive = false) float f) {
            Preconditions.checkArgument(d >= -90.0d && d <= 90.0d, "Invalid latitude: " + d);
            Preconditions.checkArgument(d2 >= -180.0d && d2 <= 180.0d, "Invalid longitude: " + d2);
            Preconditions.checkArgument(f > 0.0f, "Invalid radius: " + f);
            this.zzd = (short) 1;
            this.zze = d;
            this.zzf = d2;
            this.zzg = f;
            return this;
        }

        @NonNull
        public Builder setExpirationDuration(long j) {
            if (j < 0) {
                this.zzc = -1L;
                return this;
            }
            this.zzc = DefaultClock.getInstance().elapsedRealtime() + j;
            return this;
        }

        @NonNull
        public Builder setLoiteringDelay(int i) {
            this.zzi = i;
            return this;
        }

        @NonNull
        public Builder setNotificationResponsiveness(@IntRange(from = 0) int i) {
            this.zzh = i;
            return this;
        }

        @NonNull
        public Builder setRequestId(@NonNull String str) {
            this.zza = (String) Preconditions.checkNotNull(str, "Request ID can't be set to null");
            return this;
        }

        @NonNull
        public Builder setTransitionTypes(@TransitionTypes int i) {
            this.zzb = i;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    long getExpirationTime();

    double getLatitude();

    int getLoiteringDelay();

    double getLongitude();

    int getNotificationResponsiveness();

    float getRadius();

    @NonNull
    String getRequestId();

    @TransitionTypes
    int getTransitionTypes();
}
