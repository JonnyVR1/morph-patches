package com.google.android.libraries.places.internal;

import com.p051p1.mobile.putong.core.data.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.java_websocket.WebSocket;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbmd extends zzbbs {
    private static final Method zzp;
    final zzbdb zzc;
    final List zzd;
    final String zze;
    final String zzf;
    final zzazq zzg;
    final zzazd zzh;
    final long zzi;
    final zzbah zzj;
    final zzbqn zzk;
    final zzbqn zzl;
    private final List zzq;
    private final zzbmc zzr;
    private final zzbmb zzs;
    private static final Logger zzm = Logger.getLogger(zzbmd.class.getName());
    static final long zza = 1800000;
    static final long zzb = 1000;
    private static final zzbqn zzt = zzbqn.zza(zzbjd.zzp);
    private static final zzazq zzn = zzazq.zzb();
    private static final zzazd zzo = zzazd.zza();

    static {
        Method declaredMethod = null;
        try {
            int i = zzbea.f10598a;
            Class cls = Boolean.TYPE;
            declaredMethod = zzbea.class.getDeclaredMethod("getClientInterceptor", cls, cls, cls, cls);
        } catch (ClassNotFoundException e) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        zzp = declaredMethod;
    }

    public zzbmd(String str, zzayl zzaylVar, zzayf zzayfVar, zzbmc zzbmcVar, zzbmb zzbmbVar) {
        zzbqn zzbqnVar = zzt;
        this.zzk = zzbqnVar;
        this.zzl = zzbqnVar;
        this.zzq = new ArrayList();
        this.zzc = zzbdb.zzb();
        this.zzd = new ArrayList();
        this.zzf = "pick_first";
        this.zzg = zzn;
        this.zzh = zzo;
        this.zzi = zza;
        this.zzj = zzbah.zza();
        zzmt.zzc(str, Target.TYPE);
        this.zze = str;
        this.zzr = zzbmcVar;
        this.zzs = zzbmbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbbs
    public final zzbbr zza() {
        zzayp zzaypVar;
        zzbfw zzbfwVarZza = this.zzr.zza();
        zzbij zzbijVar = new zzbij();
        zzbqn zzbqnVarZza = zzbqn.zza(zzbjd.zzp);
        zznc zzncVar = zzbjd.zzr;
        ArrayList arrayList = new ArrayList(this.zzq);
        Method method = zzp;
        zzayp zzaypVar2 = null;
        if (method != null) {
            try {
                Boolean bool = Boolean.TRUE;
                zzaypVar = (zzayp) method.invoke(null, bool, bool, Boolean.FALSE, bool);
            } catch (IllegalAccessException e) {
                zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e);
                zzaypVar = null;
            } catch (InvocationTargetException e2) {
                zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e2);
                zzaypVar = null;
            }
        } else {
            zzaypVar = null;
        }
        if (zzaypVar != null) {
            arrayList.add(0, zzaypVar);
        }
        try {
            zzaypVar2 = (zzayp) zzbeb.class.getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
        } catch (ClassNotFoundException e3) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e3);
        } catch (IllegalAccessException e4) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e4);
        } catch (NoSuchMethodException e5) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e5);
        } catch (InvocationTargetException e6) {
            zzm.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (Throwable) e6);
        }
        if (zzaypVar2 != null) {
            arrayList.add(0, zzaypVar2);
        }
        return new zzbmf(new zzbma(this, zzbfwVarZza, zzbijVar, zzbqnVarZza, zzncVar, arrayList, zzbqt.zza));
    }

    public final int zzb() {
        this.zzs.zza();
        return WebSocket.DEFAULT_WSS_PORT;
    }
}
