package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbvx implements zzbwq {
    final /* synthetic */ zzbvz zza;
    final /* synthetic */ zzbwq zzb;

    public zzbvx(zzbvz zzbvzVar, zzbwq zzbwqVar) {
        this.zza = zzbvzVar;
        this.zzb = zzbwqVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        zzbvz zzbvzVar = this.zza;
        try {
            try {
                this.zzb.close();
                Unit unit = Unit.INSTANCE;
                zzbvw.zza(zzbvz.zza, zzbvzVar);
            } catch (IOException e) {
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                throw e;
            }
        } catch (Throwable th) {
            zzbvw.zza(zzbvz.zza, zzbvzVar);
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwq, java.io.Flushable
    public final void flush() {
        zzbvz zzbvzVar = this.zza;
        try {
            try {
                this.zzb.flush();
                Unit unit = Unit.INSTANCE;
                zzbvw.zza(zzbvz.zza, zzbvzVar);
            } catch (IOException e) {
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                throw e;
            }
        } catch (Throwable th) {
            zzbvw.zza(zzbvz.zza, zzbvzVar);
            throw th;
        }
    }

    @NotNull
    public final String toString() {
        return "AsyncTimeout.sink(" + this.zzb + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzn(@NotNull zzbwb zzbwbVar, long j) {
        zzbwbVar.getClass();
        zzbvv.zzb(zzbwbVar.zzg(), 0L, j);
        while (true) {
            long j2 = 0;
            if (j <= 0) {
                return;
            }
            zzbwn zzbwnVar = zzbwbVar.zza;
            zzbwnVar.getClass();
            while (j2 < 65536) {
                j2 += (long) (zzbwnVar.zzd - zzbwnVar.zzc);
                if (j2 >= j) {
                    j2 = j;
                    break;
                } else {
                    zzbwnVar = zzbwnVar.zzg;
                    zzbwnVar.getClass();
                }
            }
            zzbvz zzbvzVar = this.zza;
            try {
                this.zzb.zzn(zzbwbVar, j2);
                Unit unit = Unit.INSTANCE;
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                j -= j2;
            } catch (IOException e) {
                throw e;
            } finally {
                zzbvw.zza(zzbvz.zza, zzbvzVar);
            }
        }
    }
}
