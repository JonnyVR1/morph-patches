package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class w9s0 extends axr0 {
    public w9s0() {
        this.f72232a.add(zzbv.FOR_IN);
        this.f72232a.add(zzbv.FOR_IN_CONST);
        this.f72232a.add(zzbv.FOR_IN_LET);
        this.f72232a.add(zzbv.FOR_LET);
        this.f72232a.add(zzbv.FOR_OF);
        this.f72232a.add(zzbv.FOR_OF_CONST);
        this.f72232a.add(zzbv.FOR_OF_LET);
        this.f72232a.add(zzbv.WHILE);
    }

    /* JADX INFO: renamed from: c */
    public static ymr0 m202344c(afs0 afs0Var, Iterator<ymr0> it, ymr0 ymr0Var) {
        if (it != null) {
            while (it.hasNext()) {
                ymr0 ymr0VarM95461b = afs0Var.mo96271a(it.next()).m95461b((v8r0) ymr0Var);
                if (ymr0VarM95461b instanceof ldr0) {
                    ldr0 ldr0Var = (ldr0) ymr0VarM95461b;
                    if ("break".equals(ldr0Var.m149471b())) {
                        return ymr0.f199051w0;
                    }
                    if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var.m149471b())) {
                        return ldr0Var;
                    }
                }
            }
        }
        return ymr0.f199051w0;
    }

    /* JADX INFO: renamed from: d */
    public static ymr0 m202345d(afs0 afs0Var, ymr0 ymr0Var, ymr0 ymr0Var2) {
        return m202344c(afs0Var, ymr0Var.zzh(), ymr0Var2);
    }

    /* JADX INFO: renamed from: e */
    public static ymr0 m202346e(afs0 afs0Var, ymr0 ymr0Var, ymr0 ymr0Var2) {
        if (ymr0Var instanceof Iterable) {
            return m202344c(afs0Var, ((Iterable) ymr0Var).iterator(), ymr0Var2);
        }
        ig3.m135964a("Non-iterable type in for...of loop.");
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
    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        ymr0 ymr0VarM95461b;
        ldr0 ldr0Var;
        switch (uds0.f175960a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                nhw0.m159469f(zzbv.FOR_IN, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_IN must be a string");
                    return null;
                }
                return m202345d(new qis0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 2:
                nhw0.m159469f(zzbv.FOR_IN_CONST, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_IN_CONST must be a string");
                    return null;
                }
                return m202345d(new kcs0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 3:
                nhw0.m159469f(zzbv.FOR_IN_LET, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_IN_LET must be a string");
                    return null;
                }
                return m202345d(new kgs0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 4:
                nhw0.m159469f(zzbv.FOR_LET, 4, list);
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
                if (!(ymr0VarM95462c instanceof v8r0)) {
                    ig3.m135964a("Initializer variables in FOR_LET must be an ArrayList");
                    return null;
                }
                v8r0 v8r0Var = (v8r0) ymr0VarM95462c;
                ymr0 ymr0Var = list.get(1);
                ymr0 ymr0Var2 = list.get(2);
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(3));
                a9x0 a9x0VarM95463d = a9x0Var.m95463d();
                for (int i = 0; i < v8r0Var.m197497j(); i++) {
                    String strZzf = v8r0Var.m197494g(i).zzf();
                    a9x0VarM95463d.m95467h(strZzf, a9x0Var.m95460a(strZzf));
                }
                while (a9x0Var.m95462c(ymr0Var).zzd().booleanValue()) {
                    ymr0 ymr0VarM95461b2 = a9x0Var.m95461b((v8r0) ymr0VarM95462c2);
                    if (ymr0VarM95461b2 instanceof ldr0) {
                        ldr0 ldr0Var2 = (ldr0) ymr0VarM95461b2;
                        if ("break".equals(ldr0Var2.m149471b())) {
                            return ymr0.f199051w0;
                        }
                        if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var2.m149471b())) {
                            return ldr0Var2;
                        }
                    }
                    a9x0 a9x0VarM95463d2 = a9x0Var.m95463d();
                    for (int i2 = 0; i2 < v8r0Var.m197497j(); i2++) {
                        String strZzf2 = v8r0Var.m197494g(i2).zzf();
                        a9x0VarM95463d2.m95467h(strZzf2, a9x0VarM95463d.m95460a(strZzf2));
                    }
                    a9x0VarM95463d2.m95462c(ymr0Var2);
                    a9x0VarM95463d = a9x0VarM95463d2;
                }
                return ymr0.f199051w0;
            case 5:
                nhw0.m159469f(zzbv.FOR_OF, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_OF must be a string");
                    return null;
                }
                return m202346e(new qis0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 6:
                nhw0.m159469f(zzbv.FOR_OF_CONST, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_OF_CONST must be a string");
                    return null;
                }
                return m202346e(new kcs0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 7:
                nhw0.m159469f(zzbv.FOR_OF_LET, 3, list);
                if (!(list.get(0) instanceof ppr0)) {
                    ig3.m135964a("Variable name in FOR_OF_LET must be a string");
                    return null;
                }
                return m202346e(new kgs0(a9x0Var, list.get(0).zzf()), a9x0Var.m95462c(list.get(1)), a9x0Var.m95462c(list.get(2)));
            case 8:
                nhw0.m159469f(zzbv.WHILE, 4, list);
                ymr0 ymr0Var3 = list.get(0);
                ymr0 ymr0Var4 = list.get(1);
                ymr0 ymr0Var5 = list.get(2);
                ymr0 ymr0VarM95462c3 = a9x0Var.m95462c(list.get(3));
                if (a9x0Var.m95462c(ymr0Var5).zzd().booleanValue()) {
                    ymr0 ymr0VarM95461b3 = a9x0Var.m95461b((v8r0) ymr0VarM95462c3);
                    if (ymr0VarM95461b3 instanceof ldr0) {
                        ldr0 ldr0Var3 = (ldr0) ymr0VarM95461b3;
                        if (!"break".equals(ldr0Var3.m149471b())) {
                            if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var3.m149471b())) {
                                return ldr0Var3;
                            }
                            while (a9x0Var.m95462c(ymr0Var3).zzd().booleanValue()) {
                                ymr0VarM95461b = a9x0Var.m95461b((v8r0) ymr0VarM95462c3);
                                if (ymr0VarM95461b instanceof ldr0) {
                                    ldr0Var = (ldr0) ymr0VarM95461b;
                                    if (!"break".equals(ldr0Var.m149471b())) {
                                        if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var.m149471b())) {
                                            return ldr0Var;
                                        }
                                    }
                                }
                                a9x0Var.m95462c(ymr0Var4);
                            }
                        }
                    } else {
                        while (a9x0Var.m95462c(ymr0Var3).zzd().booleanValue()) {
                            ymr0VarM95461b = a9x0Var.m95461b((v8r0) ymr0VarM95462c3);
                            if (ymr0VarM95461b instanceof ldr0) {
                                ldr0Var = (ldr0) ymr0VarM95461b;
                                if (!"break".equals(ldr0Var.m149471b())) {
                                    if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var.m149471b())) {
                                        return ldr0Var;
                                    }
                                }
                            }
                            a9x0Var.m95462c(ymr0Var4);
                        }
                    }
                } else {
                    while (a9x0Var.m95462c(ymr0Var3).zzd().booleanValue()) {
                        ymr0VarM95461b = a9x0Var.m95461b((v8r0) ymr0VarM95462c3);
                        if (ymr0VarM95461b instanceof ldr0) {
                            ldr0Var = (ldr0) ymr0VarM95461b;
                            if (!"break".equals(ldr0Var.m149471b())) {
                                if (QueryStateVariableAction.OUTPUT_ARG_RETURN.equals(ldr0Var.m149471b())) {
                                    return ldr0Var;
                                }
                            }
                        }
                        a9x0Var.m95462c(ymr0Var4);
                    }
                }
                return ymr0.f199051w0;
            default:
                return super.m99518a(str);
        }
    }
}
