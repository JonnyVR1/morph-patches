package p153l;

import com.google.android.gms.internal.measurement.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class byy0 extends mpr0 {

    /* JADX INFO: renamed from: c */
    public boolean f79081c;

    /* JADX INFO: renamed from: d */
    public boolean f79082d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ rsy0 f79083e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byy0(rsy0 rsy0Var, boolean z, boolean z2) {
        super("log");
        this.f79083e = rsy0Var;
        this.f79081c = z;
        this.f79082d = z2;
    }

    @Override // p153l.mpr0
    /* JADX INFO: renamed from: d */
    public final ewr0 mo107102d(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192377k("log", 1, list);
        if (list.size() == 1) {
            this.f79083e.f164759c.mo204131a(zzs.INFO, gix0Var.m130395c(list.get(0)).zzf(), Collections.EMPTY_LIST, this.f79081c, this.f79082d);
            return ewr0.f96187w0;
        }
        zzs zzsVarZza = zzs.zza(tqw0.m192375i(gix0Var.m130395c(list.get(0)).zze().doubleValue()));
        String strZzf = gix0Var.m130395c(list.get(1)).zzf();
        if (list.size() == 2) {
            this.f79083e.f164759c.mo204131a(zzsVarZza, strZzf, Collections.EMPTY_LIST, this.f79081c, this.f79082d);
            return ewr0.f96187w0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(gix0Var.m130395c(list.get(i)).zzf());
        }
        this.f79083e.f164759c.mo204131a(zzsVarZza, strZzf, arrayList, this.f79081c, this.f79082d);
        return ewr0.f96187w0;
    }
}
