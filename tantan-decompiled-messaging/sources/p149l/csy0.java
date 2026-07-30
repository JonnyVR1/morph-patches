package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class csy0 extends ggr0 {

    /* JADX INFO: renamed from: c */
    public t1r0 f82435c;

    public csy0(t1r0 t1r0Var) {
        super("internal.registerCallback");
        this.f82435c = t1r0Var;
    }

    @Override // p149l.ggr0
    /* JADX INFO: renamed from: d */
    public final ymr0 mo108642d(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159470g(this.f102530a, 3, list);
        String strZzf = a9x0Var.m95462c(list.get(0)).zzf();
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(1));
        if (!(ymr0VarM95462c instanceof jor0)) {
            ig3.m135964a("Invalid callback type");
            return null;
        }
        ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(2));
        if (!(ymr0VarM95462c2 instanceof ulr0)) {
            ig3.m135964a("Invalid callback params");
            return null;
        }
        ulr0 ulr0Var = (ulr0) ymr0VarM95462c2;
        if (!ulr0Var.zzc("type")) {
            ig3.m135964a("Undefined rule type");
            return null;
        }
        this.f82435c.m186918b(strZzf, ulr0Var.zzc("priority") ? nhw0.m159472i(ulr0Var.zza("priority").zze().doubleValue()) : 1000, (jor0) ymr0VarM95462c, ulr0Var.zza("type").zzf());
        return ymr0.f199051w0;
    }
}
