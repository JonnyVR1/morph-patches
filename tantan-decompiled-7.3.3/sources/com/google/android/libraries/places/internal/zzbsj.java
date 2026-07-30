package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p153l.azk0;
import p153l.iig0;

/* JADX INFO: loaded from: classes7.dex */
final class zzbsj extends zzbsk {
    private static final zzbtf zzb;
    private static final zzbtf zzc;
    private static final zzbtf zzd;
    private static final zzbtf zze;
    private static final zzbtf zzf;
    private static final zzbtf zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static final Method zzj;
    private static final Method zzk;
    private static final Method zzl;
    private static final Method zzm;
    private static final Constructor zzn;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Class cls = Boolean.TYPE;
        Constructor<?> constructor = null;
        zzb = new zzbtf(null, "setUseSessionTickets", cls);
        zzc = new zzbtf(null, "setHostname", String.class);
        zzd = new zzbtf(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        zze = new zzbtf(null, "setAlpnProtocols", byte[].class);
        zzf = new zzbtf(byte[].class, "getNpnSelectedProtocol", new Class[0]);
        zzg = new zzbtf(null, "setNpnProtocols", byte[].class);
        try {
            try {
                try {
                    method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                    try {
                        method5 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                        try {
                            method6 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                            try {
                                Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                                method8 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                                try {
                                    method7 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                                } catch (ClassNotFoundException e) {
                                    classNotFoundException = e;
                                    method = method5;
                                    method3 = method6;
                                    method4 = method8;
                                    zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                                    method5 = method;
                                    method6 = method3;
                                    method7 = null;
                                    method8 = method4;
                                } catch (NoSuchMethodException e2) {
                                    noSuchMethodException = e2;
                                    method = method5;
                                    method3 = method6;
                                    method4 = method8;
                                    zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                                    method5 = method;
                                    method6 = method3;
                                    method7 = null;
                                    method8 = method4;
                                }
                            } catch (ClassNotFoundException e3) {
                                classNotFoundException = e3;
                                method4 = null;
                                method = method5;
                                method3 = method6;
                            } catch (NoSuchMethodException e4) {
                                noSuchMethodException = e4;
                                method4 = null;
                                method = method5;
                                method3 = method6;
                            }
                        } catch (ClassNotFoundException e5) {
                            classNotFoundException = e5;
                            method3 = null;
                            method4 = null;
                            method = method5;
                        } catch (NoSuchMethodException e6) {
                            noSuchMethodException = e6;
                            method3 = null;
                            method4 = null;
                            method = method5;
                        }
                    } catch (ClassNotFoundException e7) {
                        classNotFoundException = e7;
                        method = null;
                        method3 = null;
                        method4 = method3;
                        zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = method;
                        method6 = method3;
                        method7 = null;
                        method8 = method4;
                        zzj = method2;
                        zzk = method5;
                        zzl = method6;
                        zzh = method8;
                        zzi = method7;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        zzm = method9;
                        zzn = constructor;
                    } catch (NoSuchMethodException e8) {
                        noSuchMethodException = e8;
                        method = null;
                        method3 = null;
                        method4 = method3;
                        zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = method;
                        method6 = method3;
                        method7 = null;
                        method8 = method4;
                        zzj = method2;
                        zzk = method5;
                        zzl = method6;
                        zzh = method8;
                        zzi = method7;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        zzm = method9;
                        zzn = constructor;
                    }
                } catch (ClassNotFoundException e9) {
                    classNotFoundException = e9;
                    method = null;
                    method2 = null;
                    method3 = null;
                } catch (NoSuchMethodException e10) {
                    noSuchMethodException = e10;
                    method = null;
                    method2 = null;
                    method3 = null;
                }
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e11) {
                e = e11;
                zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            } catch (NoSuchMethodException e12) {
                e = e12;
                zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            }
            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e13) {
            e = e13;
            method9 = null;
        } catch (NoSuchMethodException e14) {
            e = e14;
            method9 = null;
        }
        zzj = method2;
        zzk = method5;
        zzl = method6;
        zzh = method8;
        zzi = method7;
        zzm = method9;
        zzn = constructor;
    }

    public zzbsj(zzbtl zzbtlVar) {
        super(zzbtlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final String zza(SSLSocket sSLSocket) {
        Method method = zzl;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e) {
                iig0.m140070a(e);
                return null;
            } catch (InvocationTargetException e2) {
                if (!(e2.getTargetException() instanceof UnsupportedOperationException)) {
                    iig0.m140070a(e2);
                    return null;
                }
                zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.zza.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzb(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zzbto.zzb);
                }
            } catch (Exception e3) {
                zzbsk.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e3);
            }
        }
        if (this.zza.zzc() != 3) {
            try {
                byte[] bArr2 = (byte[]) zzf.zzb(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, zzbto.zzb);
                }
            } catch (Exception e4) {
                zzbsk.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e4);
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final String zzb(SSLSocket sSLSocket, String str, List list) throws IOException {
        String strZza = zza(sSLSocket);
        return strZza == null ? super.zzb(sSLSocket, str, list) : strZza;
    }

    @Override // com.google.android.libraries.places.internal.zzbsk
    public final void zzc(SSLSocket sSLSocket, String str, List list) {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzbtm) it.next()).toString());
        }
        boolean z = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            zzmt.zzj(zzbjd.zzf(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = zzh;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzb.zza(sSLSocket, Boolean.TRUE);
                            } else {
                                zzi.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = zzm;
                            if (method3 == null || (constructor = zzn) == null) {
                                zzc.zza(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e) {
                    iig0.m140070a(e);
                    return;
                }
            } catch (IllegalAccessException e2) {
                iig0.m140070a(e2);
                return;
            } catch (InstantiationException e3) {
                iig0.m140070a(e3);
                return;
            }
        }
        Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                zzj.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e4) {
                if (!(e4.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e4;
                }
                zzbsk.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = zzk) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {zzbtl.zzg(list)};
        if (this.zza.zzc() == 1) {
            zze.zzb(sSLSocket, objArr);
        }
        if (this.zza.zzc() != 3) {
            zzg.zzb(sSLSocket, objArr);
        } else {
            azk0.m101074a("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
    }
}
