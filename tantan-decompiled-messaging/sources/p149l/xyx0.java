package p149l;

import com.google.android.gms.internal.measurement.zzkw;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xyx0 implements kyx0 {
    @Override // p149l.kyx0
    /* JADX INFO: renamed from: a */
    public final boolean mo147907a(Object obj) {
        return !((zzkw) obj).zzd();
    }

    @Override // p149l.kyx0
    /* JADX INFO: renamed from: b */
    public final Map<?, ?> mo147908b(Object obj) {
        return (zzkw) obj;
    }

    @Override // p149l.kyx0
    /* JADX INFO: renamed from: c */
    public final Object mo147909c(Object obj, Object obj2) {
        zzkw zzkwVarZzb = (zzkw) obj;
        zzkw zzkwVar = (zzkw) obj2;
        if (!zzkwVar.isEmpty()) {
            if (!zzkwVarZzb.zzd()) {
                zzkwVarZzb = zzkwVarZzb.zzb();
            }
            zzkwVarZzb.zza(zzkwVar);
        }
        return zzkwVarZzb;
    }

    @Override // p149l.kyx0
    /* JADX INFO: renamed from: d */
    public final Object mo147910d(Object obj) {
        ((zzkw) obj).zzc();
        return obj;
    }

    @Override // p149l.kyx0
    /* JADX INFO: renamed from: e */
    public final int mo147911e(int i, Object obj, Object obj2) {
        zzkw zzkwVar = (zzkw) obj;
        if (zzkwVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzkwVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // p149l.kyx0
    public final byx0<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p149l.kyx0
    public final Object zzb(Object obj) {
        return zzkw.zza().zzb();
    }

    @Override // p149l.kyx0
    public final Map<?, ?> zzd(Object obj) {
        return (zzkw) obj;
    }
}
