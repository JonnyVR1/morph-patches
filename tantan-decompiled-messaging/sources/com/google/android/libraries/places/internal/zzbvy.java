package com.google.android.libraries.places.internal;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbvy implements zzbws {
    final /* synthetic */ zzbvz zza;
    final /* synthetic */ zzbws zzb;

    public zzbvy(zzbvz zzbvzVar, zzbws zzbwsVar) {
        this.zza = zzbvzVar;
        this.zzb = zzbwsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbws, java.io.Closeable, java.lang.AutoCloseable
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

    @NotNull
    public final String toString() {
        return "AsyncTimeout.source(" + this.zzb + ")";
    }

    @Override // com.google.android.libraries.places.internal.zzbws
    public final long zza(@NotNull zzbwb zzbwbVar, long j) {
        zzbwbVar.getClass();
        zzbvz zzbvzVar = this.zza;
        try {
            try {
                long jZza = this.zzb.zza(zzbwbVar, j);
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                return jZza;
            } catch (IOException e) {
                zzbvw.zza(zzbvz.zza, zzbvzVar);
                throw e;
            }
        } catch (Throwable th) {
            zzbvw.zza(zzbvz.zza, zzbvzVar);
            throw th;
        }
    }
}
