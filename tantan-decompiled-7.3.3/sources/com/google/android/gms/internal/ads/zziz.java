package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import p153l.kzy0;
import p153l.lev0;
import p153l.mhy0;
import p153l.mpw0;
import p153l.sqr0;
import p153l.wpg0;

/* JADX INFO: loaded from: classes6.dex */
public final class zziz extends zzce {

    @Deprecated
    public static final mhy0 zzd = new mhy0() { // from class: l.byx0
    };
    private static final String zzl = Integer.toString(1001, 36);
    private static final String zzm = Integer.toString(1002, 36);
    private static final String zzn = Integer.toString(1003, 36);
    private static final String zzo = Integer.toString(1004, 36);
    private static final String zzp = Integer.toString(1005, 36);
    private static final String zzq = Integer.toString(1006, 36);
    public final int zze;

    @Nullable
    public final String zzf;
    public final int zzg;

    @Nullable
    public final sqr0 zzh;
    public final int zzi;

    @Nullable
    public final kzy0 zzj;
    final boolean zzk;

    /* JADX WARN: Illegal instructions before constructor call */
    private zziz(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable sqr0 sqr0Var, int i4, boolean z) {
        String str3;
        int i5;
        String string;
        String str4;
        if (i == 0) {
            str3 = str2;
            i5 = i3;
            string = "Source error";
        } else if (i != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i5 = i3;
        } else {
            String strValueOf = String.valueOf(sqr0Var);
            int i6 = mpw0.f137957a;
            if (i4 == 0) {
                str4 = "NO";
            } else if (i4 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    wpg0.m207458a();
                    throw null;
                }
                str4 = "YES";
            }
            StringBuilder sb = new StringBuilder();
            str3 = str2;
            sb.append(str3);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            sb.append(strValueOf);
            sb.append(", format_supported=");
            sb.append(str4);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str3, i5, sqr0Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public static zziz zzb(Throwable th, String str, int i, @Nullable sqr0 sqr0Var, int i2, boolean z, int i3) {
        if (sqr0Var == null) {
            i2 = 4;
        }
        return new zziz(1, th, null, i3, str, i, sqr0Var, i2, z);
    }

    public static zziz zzc(IOException iOException, int i) {
        return new zziz(0, iOException, i);
    }

    public static zziz zzd(RuntimeException runtimeException, int i) {
        return new zziz(2, runtimeException, i);
    }

    @CheckResult
    public final zziz zza(@Nullable kzy0 kzy0Var) {
        String message = getMessage();
        int i = mpw0.f137957a;
        return new zziz(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, kzy0Var, this.zzc, this.zzk);
    }

    private zziz(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private zziz(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable sqr0 sqr0Var, int i4, @Nullable kzy0 kzy0Var, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        lev0.m153956d(z2);
        lev0.m153956d(th != null);
        this.zze = i2;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = sqr0Var;
        this.zzi = i4;
        this.zzj = kzy0Var;
        this.zzk = z;
    }
}
