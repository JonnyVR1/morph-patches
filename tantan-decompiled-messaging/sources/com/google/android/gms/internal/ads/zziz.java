package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.io.IOException;
import p149l.eqy0;
import p149l.f5v0;
import p149l.g8y0;
import p149l.ggw0;
import p149l.mhr0;
import p149l.ohg0;

/* JADX INFO: loaded from: classes6.dex */
public final class zziz extends zzce {

    @Deprecated
    public static final g8y0 zzd = new g8y0() { // from class: l.vox0
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
    public final mhr0 zzh;
    public final int zzi;

    @Nullable
    public final eqy0 zzj;
    final boolean zzk;

    /* JADX WARN: Illegal instructions before constructor call */
    private zziz(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable String str2, int i3, @Nullable mhr0 mhr0Var, int i4, boolean z) {
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
            String strValueOf = String.valueOf(mhr0Var);
            int i6 = ggw0.f102568a;
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
                    ohg0.m164364a();
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
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th, i2, i, str3, i5, mhr0Var, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public static zziz zzb(Throwable th, String str, int i, @Nullable mhr0 mhr0Var, int i2, boolean z, int i3) {
        if (mhr0Var == null) {
            i2 = 4;
        }
        return new zziz(1, th, null, i3, str, i, mhr0Var, i2, z);
    }

    public static zziz zzc(IOException iOException, int i) {
        return new zziz(0, iOException, i);
    }

    public static zziz zzd(RuntimeException runtimeException, int i) {
        return new zziz(2, runtimeException, i);
    }

    @CheckResult
    public final zziz zza(@Nullable eqy0 eqy0Var) {
        String message = getMessage();
        int i = ggw0.f102568a;
        return new zziz(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, eqy0Var, this.zzc, this.zzk);
    }

    private zziz(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    private zziz(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable mhr0 mhr0Var, int i4, @Nullable eqy0 eqy0Var, long j, boolean z) {
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
        f5v0.m119533d(z2);
        f5v0.m119533d(th != null);
        this.zze = i2;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = mhr0Var;
        this.zzi = i4;
        this.zzj = eqy0Var;
        this.zzk = z;
    }
}
