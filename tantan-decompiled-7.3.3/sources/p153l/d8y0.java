package p153l;

import com.google.android.gms.internal.measurement.zzkw;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d8y0 implements q7y0 {
    @Override // p153l.q7y0
    /* JADX INFO: renamed from: a */
    public final boolean mo114983a(Object obj) {
        return !((zzkw) obj).zzd();
    }

    @Override // p153l.q7y0
    /* JADX INFO: renamed from: b */
    public final Map<?, ?> mo114984b(Object obj) {
        return (zzkw) obj;
    }

    @Override // p153l.q7y0
    /* JADX INFO: renamed from: c */
    public final Object mo114985c(Object obj, Object obj2) {
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

    @Override // p153l.q7y0
    /* JADX INFO: renamed from: d */
    public final Object mo114986d(Object obj) {
        ((zzkw) obj).zzc();
        return obj;
    }

    @Override // p153l.q7y0
    /* JADX INFO: renamed from: e */
    public final int mo114987e(int i, Object obj, Object obj2) {
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

    @Override // p153l.q7y0
    public final h7y0<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // p153l.q7y0
    public final Object zzb(Object obj) {
        return zzkw.zza().zzb();
    }

    @Override // p153l.q7y0
    public final Map<?, ?> zzd(Object obj) {
        return (zzkw) obj;
    }
}
