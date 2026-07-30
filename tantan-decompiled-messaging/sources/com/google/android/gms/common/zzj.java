package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p149l.s050;
import p149l.uyl;
import p149l.y9g0;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public zzj(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public static byte[] zze(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        uyl uylVarZzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.zza && (uylVarZzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(zzf(), (byte[]) s050.m181847P2(uylVarZzd));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final uyl zzd() {
        return s050.m181848Y2(zzf());
    }

    public abstract byte[] zzf();
}
