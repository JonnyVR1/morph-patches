package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import p149l.shg0;
import p149l.y9g0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbtj extends zzbtl {
    private final Method zzb;
    private final Method zzc;
    private final Method zzd;
    private final Class zze;
    private final Class zzf;

    public zzbtj(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
        this.zzd = method3;
        this.zze = cls;
        this.zzf = cls2;
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final String zza(SSLSocket sSLSocket) {
        try {
            zzbtk zzbtkVar = (zzbtk) Proxy.getInvocationHandler(this.zzc.invoke(null, sSLSocket));
            if (!zzbtkVar.zzb && zzbtkVar.zzc == null) {
                zzbtl.zza.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (zzbtkVar.zzb) {
                return null;
            }
            return zzbtkVar.zzc;
        } catch (IllegalAccessException unused) {
            shg0.m184191a();
            return null;
        } catch (InvocationTargetException unused2) {
            shg0.m184191a();
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final void zzb(SSLSocket sSLSocket, String str, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzbtm zzbtmVar = (zzbtm) list.get(i);
            if (zzbtmVar != zzbtm.HTTP_1_0) {
                arrayList.add(zzbtmVar.toString());
            }
        }
        try {
            this.zzb.invoke(null, sSLSocket, Proxy.newProxyInstance(zzbtl.class.getClassLoader(), new Class[]{this.zze, this.zzf}, new zzbtk(arrayList)));
        } catch (IllegalAccessException e) {
            y9g0.m213537a(e);
        } catch (InvocationTargetException e2) {
            y9g0.m213537a(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final void zzd(SSLSocket sSLSocket) {
        try {
            this.zzd.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            shg0.m184191a();
        } catch (InvocationTargetException e) {
            zzbtl.zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }
}
