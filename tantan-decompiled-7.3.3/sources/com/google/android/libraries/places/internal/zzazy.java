package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: loaded from: classes7.dex */
public final class zzazy {
    private SocketAddress zza;
    private InetSocketAddress zzb;
    private String zzc;
    private String zzd;

    public /* synthetic */ zzazy(zzazx zzazxVar) {
    }

    public final zzazy zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzazy zzb(SocketAddress socketAddress) {
        zzmt.zzc(socketAddress, "proxyAddress");
        this.zza = socketAddress;
        return this;
    }

    public final zzazy zzc(InetSocketAddress inetSocketAddress) {
        zzmt.zzc(inetSocketAddress, "targetAddress");
        this.zzb = inetSocketAddress;
        return this;
    }

    public final zzazy zzd(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbaa zze() {
        return new zzbaa(this.zza, this.zzb, this.zzc, this.zzd, null);
    }

    private zzazy() {
        throw null;
    }
}
