package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p153l.iig0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbti extends zzbtl {
    private final Method zzb;
    private final Method zzc;

    public /* synthetic */ zzbti(Provider provider, Method method, Method method2, zzbth zzbthVar) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final String zza(SSLSocket sSLSocket) {
        try {
            return (String) this.zzc.invoke(sSLSocket, null);
        } catch (IllegalAccessException e) {
            iig0.m140070a(e);
            return null;
        } catch (InvocationTargetException e2) {
            iig0.m140070a(e2);
            return null;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final void zzb(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbtm zzbtmVar = (zzbtm) it.next();
            if (zzbtmVar != zzbtm.HTTP_1_0) {
                arrayList.add(zzbtmVar.toString());
            }
        }
        try {
            this.zzb.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e) {
            iig0.m140070a(e);
        } catch (InvocationTargetException e2) {
            iig0.m140070a(e2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbtl
    public final int zzc() {
        return 1;
    }
}
