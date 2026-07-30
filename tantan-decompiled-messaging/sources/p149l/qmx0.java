package p149l;

import com.google.android.gms.internal.measurement.zzik;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class qmx0 implements Comparator<zzik> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzik zzikVar, zzik zzikVar2) {
        zzik zzikVar3 = zzikVar;
        zzik zzikVar4 = zzikVar2;
        hnx0 hnx0Var = (hnx0) zzikVar3.iterator();
        hnx0 hnx0Var2 = (hnx0) zzikVar4.iterator();
        while (hnx0Var.hasNext() && hnx0Var2.hasNext()) {
            int iCompare = Integer.compare(zzik.zza(hnx0Var.zza()), zzik.zza(hnx0Var2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzikVar3.zzb(), zzikVar4.zzb());
    }
}
