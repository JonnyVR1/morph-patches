package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
@SourceDebugExtension
public final class zzbwk implements zzbwc {

    @JvmField
    @NotNull
    public final zzbwq zza;

    @JvmField
    @NotNull
    public final zzbwb zzb;

    @JvmField
    public boolean zzc;

    public zzbwk(@NotNull zzbwq zzbwqVar) {
        zzbwqVar.getClass();
        this.zza = zzbwqVar;
        this.zzb = new zzbwb();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable, com.google.android.libraries.places.internal.zzbwq
    public final void close() throws Throwable {
        Throwable th;
        if (this.zzc) {
            return;
        }
        try {
            zzbwb zzbwbVar = this.zzb;
            th = null;
            if (zzbwbVar.zzg() > 0) {
                this.zza.zzn(zzbwbVar, zzbwbVar.zzg());
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.zza.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.zzc = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwc, com.google.android.libraries.places.internal.zzbwq, java.io.Flushable
    public final void flush() throws IOException {
        if (this.zzc) {
            qkq0.m175383a("closed");
            return;
        }
        zzbwb zzbwbVar = this.zzb;
        if (zzbwbVar.zzg() > 0) {
            this.zza.zzn(zzbwbVar, zzbwbVar.zzg());
        }
        this.zza.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.zzc;
    }

    @NotNull
    public final String toString() {
        return "buffer(" + this.zza + ")";
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@NotNull ByteBuffer byteBuffer) throws IOException {
        byteBuffer.getClass();
        if (this.zzc) {
            qkq0.m175383a("closed");
            return 0;
        }
        int iWrite = this.zzb.write(byteBuffer);
        zza();
        return iWrite;
    }

    @NotNull
    public final zzbwc zza() throws IOException {
        if (this.zzc) {
            qkq0.m175383a("closed");
            return null;
        }
        long jZzf = this.zzb.zzf();
        if (jZzf > 0) {
            this.zza.zzn(this.zzb, jZzf);
        }
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbwq
    public final void zzn(@NotNull zzbwb zzbwbVar, long j) throws IOException {
        zzbwbVar.getClass();
        if (this.zzc) {
            qkq0.m175383a("closed");
        } else {
            this.zzb.zzn(zzbwbVar, j);
            zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    @NotNull
    public final zzbwc zzv(int i) throws IOException {
        if (this.zzc) {
            qkq0.m175383a("closed");
            return null;
        }
        this.zzb.zzm(i);
        zza();
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    @NotNull
    public final zzbwc zzw(int i) throws IOException {
        if (this.zzc) {
            qkq0.m175383a("closed");
            return null;
        }
        this.zzb.zzp(i);
        zza();
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbwc
    @NotNull
    public final zzbwc zzx(@NotNull String str) throws IOException {
        str.getClass();
        if (this.zzc) {
            qkq0.m175383a("closed");
            return null;
        }
        this.zzb.zzs(str);
        zza();
        return this;
    }
}
