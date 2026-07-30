package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import androidx.annotation.IntRange;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzmt;
import com.google.android.libraries.places.internal.zzok;
import p153l.tg3;

/* JADX INFO: loaded from: classes7.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    @RecentlyNonNull
    public static LocalTime newInstance(@IntRange(from = 0, to = 23) int i, @IntRange(from = 0, to = 59) int i2) {
        try {
            zzo zzoVar = new zzo();
            zzoVar.zza(i);
            zzoVar.zzb(i2);
            LocalTime localTimeZzc = zzoVar.zzc();
            int hours = localTimeZzc.getHours();
            zzmt.zzq(zzok.zzb(0, 23).zzd(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = localTimeZzc.getMinutes();
            zzmt.zzq(zzok.zzb(0, 59).zzd(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return localTimeZzc;
        } catch (IllegalStateException e) {
            tg3.m191013a(e);
            return null;
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(@RecentlyNonNull LocalTime localTime) {
        int hours;
        int hours2;
        zzmt.zzc(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    @IntRange(from = 0, to = 23)
    public abstract int getHours();

    @IntRange(from = 0, to = 59)
    public abstract int getMinutes();
}
