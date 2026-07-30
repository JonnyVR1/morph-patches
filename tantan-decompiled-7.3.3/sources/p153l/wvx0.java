package p153l;

import com.google.android.gms.internal.measurement.zzik;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class wvx0 implements Comparator<zzik> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zzik zzikVar, zzik zzikVar2) {
        zzik zzikVar3 = zzikVar;
        zzik zzikVar4 = zzikVar2;
        nwx0 nwx0Var = (nwx0) zzikVar3.iterator();
        nwx0 nwx0Var2 = (nwx0) zzikVar4.iterator();
        while (nwx0Var.hasNext() && nwx0Var2.hasNext()) {
            int iCompare = Integer.compare(zzik.zza(nwx0Var.zza()), zzik.zza(nwx0Var2.zza()));
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return Integer.compare(zzikVar3.zzb(), zzikVar4.zzb());
    }
}
