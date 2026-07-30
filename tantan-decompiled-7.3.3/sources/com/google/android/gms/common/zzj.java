package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p153l.gig0;
import p153l.h950;
import p153l.p1m;

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
            gig0.m130323a(e);
            return null;
        }
    }

    public final boolean equals(@Nullable Object obj) {
        p1m p1mVarZzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.zza && (p1mVarZzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(zzf(), (byte[]) h950.m134037P2(p1mVarZzd));
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
    public final p1m zzd() {
        return h950.m134038Y2(zzf());
    }

    public abstract byte[] zzf();
}
