package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class cjs0 extends g6s0 {
    public cjs0() {
        this.f102479a.add(zzbv.FOR_IN);
        this.f102479a.add(zzbv.FOR_IN_CONST);
        this.f102479a.add(zzbv.FOR_IN_LET);
        this.f102479a.add(zzbv.FOR_LET);
        this.f102479a.add(zzbv.FOR_OF);
        this.f102479a.add(zzbv.FOR_OF_CONST);
        this.f102479a.add(zzbv.FOR_OF_LET);
        this.f102479a.add(zzbv.WHILE);
    }

    /* JADX INFO: renamed from: c */
    public static ewr0 m110279c(gos0 gos0Var, Iterator<ewr0> it, ewr0 ewr0Var) {
        if (it != null) {
            while (it.hasNext()) {
                ewr0 ewr0VarM130394b = gos0Var.mo131183a(it.next()).m130394b((bir0) ewr0Var);
                if (ewr0VarM130394b instanceof rmr0) {
                    rmr0 rmr0Var = (rmr0) ewr0VarM130394b;
                    if ("break".equals(rmr0Var.m182106b())) {
                        return ewr0.f96187w0;
                    }
                    if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var.m182106b())) {
                        return rmr0Var;
                    }
                }
            }
        }
        return ewr0.f96187w0;
    }

    /* JADX INFO: renamed from: d */
    public static ewr0 m110280d(gos0 gos0Var, ewr0 ewr0Var, ewr0 ewr0Var2) {
        return m110279c(gos0Var, ewr0Var.zzh(), ewr0Var2);
    }

    /* JADX INFO: renamed from: e */
    public static ewr0 m110281e(gos0 gos0Var, ewr0 ewr0Var, ewr0 ewr0Var2) {
        if (ewr0Var instanceof Iterable) {
            return m110279c(gos0Var, ((Iterable) ewr0Var).iterator(), ewr0Var2);
        }
        wg3.m206174a("Non-iterable type in for...of loop.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    /* JADX WARN: Code duplicated, block: B:21:0x0094  */
    /* JADX WARN: Code duplicated, block: B:88:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[SYNTHETIC] */
    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        ewr0 ewr0VarM130394b;
        rmr0 rmr0Var;
        switch (ans0.f72379a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                tqw0.m192372f(zzbv.FOR_IN, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_IN must be a string");
                    return null;
                }
                return m110280d(new wrs0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 2:
                tqw0.m192372f(zzbv.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_IN_CONST must be a string");
                    return null;
                }
                return m110280d(new qls0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 3:
                tqw0.m192372f(zzbv.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_IN_LET must be a string");
                    return null;
                }
                return m110280d(new qps0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 4:
                tqw0.m192372f(zzbv.FOR_LET, 4, list);
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
                if (!(ewr0VarM130395c instanceof bir0)) {
                    wg3.m206174a("Initializer variables in FOR_LET must be an ArrayList");
                    return null;
                }
                bir0 bir0Var = (bir0) ewr0VarM130395c;
                ewr0 ewr0Var = list.get(1);
                ewr0 ewr0Var2 = list.get(2);
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(3));
                gix0 gix0VarM130396d = gix0Var.m130396d();
                for (int i = 0; i < bir0Var.m104501j(); i++) {
                    String strZzf = bir0Var.m104498g(i).zzf();
                    gix0VarM130396d.m130400h(strZzf, gix0Var.m130393a(strZzf));
                }
                while (gix0Var.m130395c(ewr0Var).zzd().booleanValue()) {
                    ewr0 ewr0VarM130394b2 = gix0Var.m130394b((bir0) ewr0VarM130395c2);
                    if (ewr0VarM130394b2 instanceof rmr0) {
                        rmr0 rmr0Var2 = (rmr0) ewr0VarM130394b2;
                        if ("break".equals(rmr0Var2.m182106b())) {
                            return ewr0.f96187w0;
                        }
                        if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var2.m182106b())) {
                            return rmr0Var2;
                        }
                    }
                    gix0 gix0VarM130396d2 = gix0Var.m130396d();
                    for (int i2 = 0; i2 < bir0Var.m104501j(); i2++) {
                        String strZzf2 = bir0Var.m104498g(i2).zzf();
                        gix0VarM130396d2.m130400h(strZzf2, gix0VarM130396d.m130393a(strZzf2));
                    }
                    gix0VarM130396d2.m130395c(ewr0Var2);
                    gix0VarM130396d = gix0VarM130396d2;
                }
                return ewr0.f96187w0;
            case 5:
                tqw0.m192372f(zzbv.FOR_OF, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_OF must be a string");
                    return null;
                }
                return m110281e(new wrs0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 6:
                tqw0.m192372f(zzbv.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_OF_CONST must be a string");
                    return null;
                }
                return m110281e(new qls0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 7:
                tqw0.m192372f(zzbv.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof vyr0)) {
                    wg3.m206174a("Variable name in FOR_OF_LET must be a string");
                    return null;
                }
                return m110281e(new qps0(gix0Var, list.get(0).zzf()), gix0Var.m130395c(list.get(1)), gix0Var.m130395c(list.get(2)));
            case 8:
                tqw0.m192372f(zzbv.WHILE, 4, list);
                ewr0 ewr0Var3 = list.get(0);
                ewr0 ewr0Var4 = list.get(1);
                ewr0 ewr0Var5 = list.get(2);
                ewr0 ewr0VarM130395c3 = gix0Var.m130395c(list.get(3));
                if (gix0Var.m130395c(ewr0Var5).zzd().booleanValue()) {
                    ewr0 ewr0VarM130394b3 = gix0Var.m130394b((bir0) ewr0VarM130395c3);
                    if (ewr0VarM130394b3 instanceof rmr0) {
                        rmr0 rmr0Var3 = (rmr0) ewr0VarM130394b3;
                        if (!"break".equals(rmr0Var3.m182106b())) {
                            if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var3.m182106b())) {
                                return rmr0Var3;
                            }
                            while (gix0Var.m130395c(ewr0Var3).zzd().booleanValue()) {
                                ewr0VarM130394b = gix0Var.m130394b((bir0) ewr0VarM130395c3);
                                if (ewr0VarM130394b instanceof rmr0) {
                                    rmr0Var = (rmr0) ewr0VarM130394b;
                                    if (!"break".equals(rmr0Var.m182106b())) {
                                        if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var.m182106b())) {
                                            return rmr0Var;
                                        }
                                    }
                                }
                                gix0Var.m130395c(ewr0Var4);
                            }
                        }
                    } else {
                        while (gix0Var.m130395c(ewr0Var3).zzd().booleanValue()) {
                            ewr0VarM130394b = gix0Var.m130394b((bir0) ewr0VarM130395c3);
                            if (ewr0VarM130394b instanceof rmr0) {
                                rmr0Var = (rmr0) ewr0VarM130394b;
                                if (!"break".equals(rmr0Var.m182106b())) {
                                    if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var.m182106b())) {
                                        return rmr0Var;
                                    }
                                }
                            }
                            gix0Var.m130395c(ewr0Var4);
                        }
                    }
                } else {
                    while (gix0Var.m130395c(ewr0Var3).zzd().booleanValue()) {
                        ewr0VarM130394b = gix0Var.m130394b((bir0) ewr0VarM130395c3);
                        if (ewr0VarM130394b instanceof rmr0) {
                            rmr0Var = (rmr0) ewr0VarM130394b;
                            if (!"break".equals(rmr0Var.m182106b())) {
                                if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(rmr0Var.m182106b())) {
                                    return rmr0Var;
                                }
                            }
                        }
                        gix0Var.m130395c(ewr0Var4);
                    }
                }
                return ewr0.f96187w0;
            default:
                return super.m129267a(str);
        }
    }
}
