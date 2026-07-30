package com.google.android.libraries.places.internal;

import com.p051p1.mobile.putong.data.BannerFrequencyType;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.iig0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbnz implements zzbkj {
    private static final Logger zza = Logger.getLogger(zzbnz.class.getName());
    private static final Constructor zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final RuntimeException zze;
    private static final Object[] zzf;
    private final Object zzg;

    static {
        Throwable th;
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method3 = cls.getMethod("add", Long.TYPE);
            try {
                method4 = cls.getMethod(BannerFrequencyType.sum, null);
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            constructor = null;
                            break;
                        }
                        constructor = constructors[i];
                        if (constructor.getParameterTypes().length == 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                    method = method3;
                    method2 = method4;
                    zza.logp(Level.FINE, "io.grpc.internal.ReflectionLongAdderCounter", "<clinit>", "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                    method3 = method;
                    constructor = null;
                    method4 = method2;
                }
            } catch (Throwable th3) {
                th = th3;
                method2 = null;
                method = method3;
            }
        } catch (Throwable th4) {
            th = th4;
            method = null;
            method2 = null;
        }
        if (th != null || constructor == null) {
            zzb = null;
            zzc = null;
            zzd = null;
            zze = new RuntimeException(th);
        } else {
            zzb = constructor;
            zzc = method3;
            zzd = method4;
            zze = null;
        }
        zzf = new Object[]{1L};
    }

    public zzbnz() {
        RuntimeException runtimeException = zze;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.zzg = zzb.newInstance(null);
        } catch (IllegalAccessException e) {
            iig0.m140070a(e);
            throw null;
        } catch (InstantiationException e2) {
            iig0.m140070a(e2);
            throw null;
        } catch (InvocationTargetException e3) {
            iig0.m140070a(e3);
            throw null;
        }
    }

    public static boolean zzb() {
        return zze == null;
    }

    @Override // com.google.android.libraries.places.internal.zzbkj
    public final void zza(long j) {
        try {
            zzc.invoke(this.zzg, zzf);
        } catch (IllegalAccessException e) {
            iig0.m140070a(e);
        } catch (InvocationTargetException e2) {
            iig0.m140070a(e2);
        }
    }
}
