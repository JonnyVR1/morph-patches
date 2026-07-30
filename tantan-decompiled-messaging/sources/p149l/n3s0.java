package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class n3s0 extends axr0 {
    public n3s0() {
        this.f72232a.add(zzbv.APPLY);
        this.f72232a.add(zzbv.BLOCK);
        this.f72232a.add(zzbv.BREAK);
        this.f72232a.add(zzbv.CASE);
        this.f72232a.add(zzbv.DEFAULT);
        this.f72232a.add(zzbv.CONTINUE);
        this.f72232a.add(zzbv.DEFINE_FUNCTION);
        this.f72232a.add(zzbv.FN);
        this.f72232a.add(zzbv.IF);
        this.f72232a.add(zzbv.QUOTE);
        this.f72232a.add(zzbv.RETURN);
        this.f72232a.add(zzbv.SWITCH);
        this.f72232a.add(zzbv.TERNARY);
    }

    /* JADX INFO: renamed from: c */
    public static ymr0 m157772c(a9x0 a9x0Var, List<ymr0> list) {
        nhw0.m159473j(zzbv.FN, 2, list);
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
        ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(1));
        if (!(ymr0VarM95462c2 instanceof v8r0)) {
            dqi0.m113073a("FN requires an ArrayValue of parameter names found %s", new Object[]{ymr0VarM95462c2.getClass().getCanonicalName()});
            return null;
        }
        List<ymr0> listM197503v = ((v8r0) ymr0VarM95462c2).m197503v();
        List<ymr0> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new jor0(ymr0VarM95462c.zzf(), listM197503v, arrayList, a9x0Var);
    }

    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        switch (f6s0.f96164a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                nhw0.m159469f(zzbv.APPLY, 3, list);
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
                String strZzf = a9x0Var.m95462c(list.get(1)).zzf();
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(2));
                if (!(ymr0VarM95462c2 instanceof v8r0)) {
                    dqi0.m113073a("Function arguments for Apply are not a list found %s", new Object[]{ymr0VarM95462c2.getClass().getCanonicalName()});
                    return null;
                }
                if (!strZzf.isEmpty()) {
                    return ymr0VarM95462c.mo95833c(strZzf, a9x0Var, ((v8r0) ymr0VarM95462c2).m197503v());
                }
                ig3.m135964a("Function name for apply is undefined");
                return null;
            case 2:
                return a9x0Var.m95463d().m95461b(new v8r0(list));
            case 3:
                nhw0.m159469f(zzbv.BREAK, 0, list);
                return ymr0.f199054z0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    ymr0 ymr0VarM95462c3 = a9x0Var.m95462c(list.get(0));
                    if (ymr0VarM95462c3 instanceof v8r0) {
                        return a9x0Var.m95461b((v8r0) ymr0VarM95462c3);
                    }
                }
                return ymr0.f199051w0;
            case 6:
                nhw0.m159469f(zzbv.BREAK, 0, list);
                return ymr0.f199053y0;
            case 7:
                nhw0.m159473j(zzbv.DEFINE_FUNCTION, 2, list);
                jor0 jor0Var = (jor0) m157772c(a9x0Var, list);
                if (jor0Var.m126001b() == null) {
                    a9x0Var.m95467h("", jor0Var);
                    return jor0Var;
                }
                a9x0Var.m95467h(jor0Var.m126001b(), jor0Var);
                return jor0Var;
            case 8:
                return m157772c(a9x0Var, list);
            case 9:
                nhw0.m159473j(zzbv.IF, 2, list);
                ymr0 ymr0VarM95462c4 = a9x0Var.m95462c(list.get(0));
                ymr0 ymr0VarM95462c5 = a9x0Var.m95462c(list.get(1));
                ymr0 ymr0VarM95462c6 = list.size() > 2 ? a9x0Var.m95462c(list.get(2)) : null;
                ymr0 ymr0Var = ymr0.f199051w0;
                ymr0 ymr0VarM95461b = ymr0VarM95462c4.zzd().booleanValue() ? a9x0Var.m95461b((v8r0) ymr0VarM95462c5) : ymr0VarM95462c6 != null ? a9x0Var.m95461b((v8r0) ymr0VarM95462c6) : ymr0Var;
                return ymr0VarM95461b instanceof ldr0 ? ymr0VarM95461b : ymr0Var;
            case 10:
                return new v8r0(list);
            case 11:
                if (list.isEmpty()) {
                    return ymr0.f199047A0;
                }
                nhw0.m159469f(zzbv.RETURN, 1, list);
                return new ldr0(QueryStateVariableAction.OUTPUT_ARG_RETURN, a9x0Var.m95462c(list.get(0)));
            case 12:
                nhw0.m159469f(zzbv.SWITCH, 3, list);
                ymr0 ymr0VarM95462c7 = a9x0Var.m95462c(list.get(0));
                ymr0 ymr0VarM95462c8 = a9x0Var.m95462c(list.get(1));
                ymr0 ymr0VarM95462c9 = a9x0Var.m95462c(list.get(2));
                if (!(ymr0VarM95462c8 instanceof v8r0)) {
                    ig3.m135964a("Malformed SWITCH statement, cases are not a list");
                    return null;
                }
                if (!(ymr0VarM95462c9 instanceof v8r0)) {
                    ig3.m135964a("Malformed SWITCH statement, case statements are not a list");
                    return null;
                }
                v8r0 v8r0Var = (v8r0) ymr0VarM95462c8;
                v8r0 v8r0Var2 = (v8r0) ymr0VarM95462c9;
                boolean z = false;
                for (int i = 0; i < v8r0Var.m197497j(); i++) {
                    if (z || ymr0VarM95462c7.equals(a9x0Var.m95462c(v8r0Var.m197494g(i)))) {
                        ymr0 ymr0VarM95462c10 = a9x0Var.m95462c(v8r0Var2.m197494g(i));
                        if (ymr0VarM95462c10 instanceof ldr0) {
                            if (!((ldr0) ymr0VarM95462c10).m149471b().equals("break")) {
                                return ymr0VarM95462c10;
                            }
                            return ymr0.f199051w0;
                        }
                        z = true;
                    }
                }
                if (v8r0Var.m197497j() + 1 == v8r0Var2.m197497j()) {
                    ymr0 ymr0VarM95462c11 = a9x0Var.m95462c(v8r0Var2.m197494g(v8r0Var.m197497j()));
                    if (ymr0VarM95462c11 instanceof ldr0) {
                        String strM149471b = ((ldr0) ymr0VarM95462c11).m149471b();
                        if (strM149471b.equals(QueryStateVariableAction.OUTPUT_ARG_RETURN) || strM149471b.equals("continue")) {
                            return ymr0VarM95462c11;
                        }
                    }
                }
                return ymr0.f199051w0;
            case 13:
                nhw0.m159469f(zzbv.TERNARY, 3, list);
                return a9x0Var.m95462c(list.get(0)).zzd().booleanValue() ? a9x0Var.m95462c(list.get(1)) : a9x0Var.m95462c(list.get(2));
            default:
                return super.m99518a(str);
        }
    }
}
