package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p149l.qkq0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbru implements zzbfw {
    final Executor zza;
    final ScheduledExecutorService zzb;
    final zzbqw zzc;
    final SSLSocketFactory zzd;
    final zzbsz zze;
    private final zzbeo zzf = new zzbeo("keepalive time nanos", Long.MAX_VALUE);
    private boolean zzg;
    private final zzbqn zzh;
    private final zzbqn zzi;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public /* synthetic */ zzbru(zzbqn zzbqnVar, zzbqn zzbqnVar2, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, zzbsz zzbszVar, int i, boolean z, long j, long j2, int i2, boolean z2, int i3, zzbqw zzbqwVar, boolean z3, zzbrt zzbrtVar) {
        this.zzh = zzbqnVar;
        this.zza = zzbqnVar.zzb();
        this.zzi = zzbqnVar2;
        this.zzb = (ScheduledExecutorService) zzbqnVar2.zzb();
        this.zzd = sSLSocketFactory;
        this.zze = zzbszVar;
        this.zzc = zzbqwVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        this.zzh.zzc(this.zza);
        this.zzi.zzc(this.zzb);
    }

    @Override // com.google.android.libraries.places.internal.zzbfw
    public final zzbgf zza(SocketAddress socketAddress, zzbfv zzbfvVar, zzaym zzaymVar) {
        if (this.zzg) {
            qkq0.m175383a("The transport factory is closed.");
            return null;
        }
        return new zzbsf(this, (InetSocketAddress) socketAddress, zzbfvVar.zzg(), null, zzbfvVar.zza(), zzbfvVar.zzb(), new zzbrs(this, this.zzf.zza()));
    }

    @Override // com.google.android.libraries.places.internal.zzbfw
    public final ScheduledExecutorService zzb() {
        return this.zzb;
    }
}
