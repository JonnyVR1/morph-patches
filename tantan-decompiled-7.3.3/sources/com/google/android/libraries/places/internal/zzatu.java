package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.libraries.places.internal.zzato;
import com.google.android.libraries.places.internal.zzatu;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.o4c;
import p153l.vtq0;
import p153l.wpg0;
import p153l.yzv;

/* JADX INFO: loaded from: classes7.dex */
public abstract class zzatu<MessageType extends zzatu<MessageType, BuilderType>, BuilderType extends zzato<MessageType, BuilderType>> extends zzart<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public static final /* synthetic */ int zzd = 0;
    private int zze = -1;
    protected zzawo zzc = zzawo.zzc();

    public static Object zzaA(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            vtq0.m202761a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vtq0.m202761a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static Object zzaB(zzavf zzavfVar, String str, Object[] objArr) {
        return new zzavr(zzavfVar, str, objArr);
    }

    public static void zzaE(Class cls, zzatu zzatuVar) {
        zzatuVar.zzaD();
        zzb.put(cls, zzatuVar);
    }

    public static final boolean zzaG(zzatu zzatuVar, boolean z) {
        byte bByteValue = ((Byte) zzatuVar.zzb(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zZzh = zzavp.zza().zzb(zzatuVar.getClass()).zzh(zzatuVar);
        if (z) {
            zzatuVar.zzb(2, true != zZzh ? null : zzatuVar, null);
        }
        return zZzh;
    }

    public static zzatu zzas(Class cls) {
        Map map = zzb;
        zzatu zzatuVar = (zzatu) map.get(cls);
        if (zzatuVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzatuVar = (zzatu) map.get(cls);
            } catch (ClassNotFoundException e) {
                yzv.m218057a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (zzatuVar != null) {
            return zzatuVar;
        }
        zzatu zzatuVar2 = (zzatu) ((zzatu) zzawx.zze(cls)).zzb(6, null, null);
        if (zzatuVar2 != null) {
            map.put(cls, zzatuVar2);
            return zzatuVar2;
        }
        wpg0.m207458a();
        return null;
    }

    public static zzatz zzau() {
        return zzatv.zzf();
    }

    public static zzatz zzav(zzatz zzatzVar) {
        int size = zzatzVar.size();
        return zzatzVar.zzd(size == 0 ? 10 : size + size);
    }

    public static zzaub zzaw() {
        return zzauu.zzf();
    }

    public static zzauc zzax() {
        return zzavq.zze();
    }

    public static zzauc zzay(zzauc zzaucVar) {
        int size = zzaucVar.size();
        return zzaucVar.zzd(size == 0 ? 10 : size + size);
    }

    private final int zzc(zzavt zzavtVar) {
        return zzavp.zza().zzb(getClass()).zza(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return zzavp.zza().zzb(getClass()).zzg(this, (zzatu) obj);
    }

    public final int hashCode() {
        if (zzaH()) {
            return zzap();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iZzap = zzap();
        this.zza = iZzap;
        return iZzap;
    }

    public final String toString() {
        return zzavh.zza(this, super.toString());
    }

    public final void zzaC() {
        zzavp.zza().zzb(getClass()).zzd(this);
        zzaD();
    }

    public final void zzaD() {
        this.zze &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final void zzaF(int i) {
        this.zze = (this.zze & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final boolean zzaH() {
        return (this.zze & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final /* synthetic */ zzave zzaI() {
        return (zzato) zzb(5, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final /* synthetic */ zzave zzaJ() {
        zzato zzatoVar = (zzato) zzb(5, null, null);
        zzatoVar.zzq(this);
        return zzatoVar;
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final void zzaK(zzasx zzasxVar) throws IOException {
        zzavp.zza().zzb(getClass()).zzj(this, zzasy.zza(zzasxVar));
    }

    @Override // com.google.android.libraries.places.internal.zzavg
    public final /* synthetic */ zzavf zzaL() {
        return (zzatu) zzb(6, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzavg
    public final boolean zzaM() {
        return zzaG(this, true);
    }

    @Override // com.google.android.libraries.places.internal.zzart
    public final int zzak(zzavt zzavtVar) {
        if (zzaH()) {
            int iZza = zzavtVar.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iZza);
            return 0;
        }
        int i = this.zze & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = zzavtVar.zza(this);
        if (iZza2 >= 0) {
            this.zze = (this.zze & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iZza2);
        return 0;
    }

    public final int zzap() {
        return zzavp.zza().zzb(getClass()).zzb(this);
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final int zzaq() {
        if (zzaH()) {
            int iZzc = zzc(null);
            if (iZzc >= 0) {
                return iZzc;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iZzc);
            return 0;
        }
        int i = this.zze & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZzc2 = zzc(null);
        if (iZzc2 >= 0) {
            this.zze = (this.zze & Integer.MIN_VALUE) | iZzc2;
            return iZzc2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iZzc2);
        return 0;
    }

    public final zzato zzar() {
        return (zzato) zzb(5, null, null);
    }

    public final zzatu zzat() {
        return (zzatu) zzb(4, null, null);
    }

    @Override // com.google.android.libraries.places.internal.zzavf
    public final zzavn zzaz() {
        return (zzavn) zzb(7, null, null);
    }

    public abstract Object zzb(int i, Object obj, Object obj2);
}
