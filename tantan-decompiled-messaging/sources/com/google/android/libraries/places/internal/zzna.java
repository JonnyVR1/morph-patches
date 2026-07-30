package com.google.android.libraries.places.internal;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p149l.shg0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzna {
    private final zznf zza = zznf.zza();
    private boolean zzb;
    private long zzc;

    public static zzna zzb() {
        return new zzna();
    }

    private final long zze() {
        if (this.zzb) {
            return System.nanoTime() - this.zzc;
        }
        return 0L;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long jZze = zze();
        long j = jZze / 86400000000000L;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (j > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (jZze / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (jZze / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (jZze / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (jZze / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = jZze / 1000 > 0 ? TimeUnit.MICROSECONDS : timeUnit2;
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jZze / timeUnit2.convert(1L, timeUnit)));
        switch (zzmz.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = BLiveStormDanmakuGiftResourceType.f44446s;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = Constants.INAPP_DATA_TAG;
                break;
            default:
                shg0.m184191a();
                return null;
        }
        return str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str;
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zze(), TimeUnit.NANOSECONDS);
    }

    public final zzna zzc() {
        this.zzb = false;
        return this;
    }

    public final zzna zzd() {
        zzmt.zzp(!this.zzb, "This stopwatch is already running.");
        this.zzb = true;
        this.zzc = System.nanoTime();
        return this;
    }
}
