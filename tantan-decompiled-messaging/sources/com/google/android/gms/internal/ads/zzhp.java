package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import p149l.qew0;
import p149l.uax0;

/* JADX INFO: loaded from: classes6.dex */
public class zzhp extends zzgx {
    public final uax0 zzb;
    public final int zzc;

    public zzhp(uax0 uax0Var, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = uax0Var;
        this.zzc = 1;
    }

    public static zzhp zza(IOException iOException, uax0 uax0Var, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !qew0.m174257a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new zzho(iOException, uax0Var) : new zzhp(iOException, uax0Var, i2, i);
    }

    private static int zzb(int i, int i2) {
        if (i == 2000) {
            return i2 != 1 ? 2000 : 2001;
        }
        return i;
    }

    public zzhp(IOException iOException, uax0 uax0Var, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = uax0Var;
        this.zzc = i2;
    }

    public zzhp(String str, uax0 uax0Var, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = uax0Var;
        this.zzc = i2;
    }

    public zzhp(String str, @Nullable IOException iOException, uax0 uax0Var, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = uax0Var;
        this.zzc = i2;
    }
}
