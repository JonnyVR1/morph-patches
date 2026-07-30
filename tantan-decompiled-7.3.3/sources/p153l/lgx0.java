package p153l;

import com.google.android.gms.internal.ads.zzgyl;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class lgx0 implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgyl zzgylVar = (zzgyl) obj;
        zzgyl zzgylVar2 = (zzgyl) obj2;
        ngx0 it = zzgylVar.iterator();
        ngx0 it2 = zzgylVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzgylVar.zzd()).compareTo(Integer.valueOf(zzgylVar2.zzd()));
    }
}
