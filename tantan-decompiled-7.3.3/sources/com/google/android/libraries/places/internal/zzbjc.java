package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import p153l.gzi0;
import p153l.p7f;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
final class zzbjc implements zzbbx {
    @Override // com.google.android.libraries.places.internal.zzbbx
    public final /* bridge */ /* synthetic */ Object zza(String str) {
        zzmt.zzf(str.length() > 0, "empty timeout");
        zzmt.zzf(str.length() <= 9, "bad timeout format");
        long j = Long.parseLong(str.substring(0, str.length() - 1));
        char cCharAt = str.charAt(str.length() - 1);
        if (cCharAt == 'H') {
            return Long.valueOf(TimeUnit.HOURS.toNanos(j));
        }
        if (cCharAt == 'M') {
            return Long.valueOf(TimeUnit.MINUTES.toNanos(j));
        }
        if (cCharAt == 'S') {
            return Long.valueOf(TimeUnit.SECONDS.toNanos(j));
        }
        if (cCharAt == 'u') {
            return Long.valueOf(TimeUnit.MICROSECONDS.toNanos(j));
        }
        if (cCharAt == 'm') {
            return Long.valueOf(TimeUnit.MILLISECONDS.toNanos(j));
        }
        if (cCharAt == 'n') {
            return Long.valueOf(j);
        }
        gzi0.m133102a("Invalid timeout unit: %s", new Object[]{Character.valueOf(cCharAt)});
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbbx
    public final /* bridge */ /* synthetic */ String zzb(Object obj) {
        Long l2 = (Long) obj;
        if (l2.longValue() < 0) {
            wg3.m206174a("Timeout too small");
            return null;
        }
        if (l2.longValue() < 100000000) {
            return String.valueOf(l2).concat("n");
        }
        if (l2.longValue() < 100000000000L) {
            return (l2.longValue() / 1000) + "u";
        }
        if (l2.longValue() < 100000000000000L) {
            return (l2.longValue() / 1000000) + "m";
        }
        if (l2.longValue() < 100000000000000000L) {
            return (l2.longValue() / 1000000000) + p7f.LATITUDE_SOUTH;
        }
        if (l2.longValue() < 6000000000000000000L) {
            return (l2.longValue() / 60000000000L) + "M";
        }
        return (l2.longValue() / 3600000000000L) + "H";
    }
}
