package com.google.android.libraries.places.internal;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbii extends zzbcw {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f10562a = 0;
    private static final boolean zza = zzbas.zza(zzbii.class.getClassLoader());

    @Override // com.google.android.libraries.places.internal.zzbcq
    public final zzbcv zza(URI uri, zzbco zzbcoVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String path = uri.getPath();
        zzmt.zzc(path, "targetPath");
        zzmt.zzl(path.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", path, uri);
        return new zzbih(uri.getAuthority(), path.substring(1), zzbcoVar, zzbjd.zzp, zzna.zzb(), zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbcq
    public final String zzb() {
        return "dns";
    }

    @Override // com.google.android.libraries.places.internal.zzbcw
    public final int zzc() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.zzbcw
    public final Collection zzd() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // com.google.android.libraries.places.internal.zzbcw
    public final boolean zze() {
        return true;
    }
}
