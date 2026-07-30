package p149l;

import com.google.android.gms.internal.measurement.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class voy0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public boolean f182434c;

    /* JADX INFO: renamed from: d */
    public boolean f182435d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ljy0 f182436e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public voy0(ljy0 ljy0Var, boolean z, boolean z2) {
        super("log");
        this.f182436e = ljy0Var;
        this.f182434c = z;
        this.f182435d = z2;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159474k("log", 1, list);
        if (list.size() == 1) {
            this.f182436e.f128427c.mo170940a(zzs.INFO, a9x0Var.m95462c(list.get(0)).zzf(), Collections.EMPTY_LIST, this.f182434c, this.f182435d);
            return ymr0.f199051w0;
        }
        zzs zzsVarZza = zzs.zza(nhw0.m159472i(a9x0Var.m95462c(list.get(0)).zze().doubleValue()));
        String strZzf = a9x0Var.m95462c(list.get(1)).zzf();
        if (list.size() == 2) {
            this.f182436e.f128427c.mo170940a(zzsVarZza, strZzf, Collections.EMPTY_LIST, this.f182434c, this.f182435d);
            return ymr0.f199051w0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(a9x0Var.m95462c(list.get(i)).zzf());
        }
        this.f182436e.f128427c.mo170940a(zzsVarZza, strZzf, arrayList, this.f182434c, this.f182435d);
        return ymr0.f199051w0;
    }
}
