package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import java.util.ArrayList;
import java.util.List;
import org.fourthline.cling.model.meta.QueryStateVariableAction;

/* JADX INFO: loaded from: classes6.dex */
public final class tcs0 extends g6s0 {
    public tcs0() {
        this.f102479a.add(zzbv.APPLY);
        this.f102479a.add(zzbv.BLOCK);
        this.f102479a.add(zzbv.BREAK);
        this.f102479a.add(zzbv.CASE);
        this.f102479a.add(zzbv.DEFAULT);
        this.f102479a.add(zzbv.CONTINUE);
        this.f102479a.add(zzbv.DEFINE_FUNCTION);
        this.f102479a.add(zzbv.FN);
        this.f102479a.add(zzbv.IF);
        this.f102479a.add(zzbv.QUOTE);
        this.f102479a.add(zzbv.RETURN);
        this.f102479a.add(zzbv.SWITCH);
        this.f102479a.add(zzbv.TERNARY);
    }

    /* JADX INFO: renamed from: c */
    public static ewr0 m190492c(gix0 gix0Var, List<ewr0> list) {
        tqw0.m192376j(zzbv.FN, 2, list);
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
        ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(1));
        if (!(ewr0VarM130395c2 instanceof bir0)) {
            gzi0.m133102a("FN requires an ArrayValue of parameter names found %s", new Object[]{ewr0VarM130395c2.getClass().getCanonicalName()});
            return null;
        }
        List<ewr0> listM104507v = ((bir0) ewr0VarM130395c2).m104507v();
        List<ewr0> arrayList = new ArrayList<>();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new pxr0(ewr0VarM130395c.zzf(), listM104507v, arrayList, gix0Var);
    }

    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        switch (lfs0.f131896a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                tqw0.m192372f(zzbv.APPLY, 3, list);
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
                String strZzf = gix0Var.m130395c(list.get(1)).zzf();
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(2));
                if (!(ewr0VarM130395c2 instanceof bir0)) {
                    gzi0.m133102a("Function arguments for Apply are not a list found %s", new Object[]{ewr0VarM130395c2.getClass().getCanonicalName()});
                    return null;
                }
                if (!strZzf.isEmpty()) {
                    return ewr0VarM130395c.mo100514c(strZzf, gix0Var, ((bir0) ewr0VarM130395c2).m104507v());
                }
                wg3.m206174a("Function name for apply is undefined");
                return null;
            case 2:
                return gix0Var.m130396d().m130394b(new bir0(list));
            case 3:
                tqw0.m192372f(zzbv.BREAK, 0, list);
                return ewr0.f96190z0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    ewr0 ewr0VarM130395c3 = gix0Var.m130395c(list.get(0));
                    if (ewr0VarM130395c3 instanceof bir0) {
                        return gix0Var.m130394b((bir0) ewr0VarM130395c3);
                    }
                }
                return ewr0.f96187w0;
            case 6:
                tqw0.m192372f(zzbv.BREAK, 0, list);
                return ewr0.f96189y0;
            case 7:
                tqw0.m192376j(zzbv.DEFINE_FUNCTION, 2, list);
                pxr0 pxr0Var = (pxr0) m190492c(gix0Var, list);
                if (pxr0Var.m159380b() == null) {
                    gix0Var.m130400h("", pxr0Var);
                    return pxr0Var;
                }
                gix0Var.m130400h(pxr0Var.m159380b(), pxr0Var);
                return pxr0Var;
            case 8:
                return m190492c(gix0Var, list);
            case 9:
                tqw0.m192376j(zzbv.IF, 2, list);
                ewr0 ewr0VarM130395c4 = gix0Var.m130395c(list.get(0));
                ewr0 ewr0VarM130395c5 = gix0Var.m130395c(list.get(1));
                ewr0 ewr0VarM130395c6 = list.size() > 2 ? gix0Var.m130395c(list.get(2)) : null;
                ewr0 ewr0Var = ewr0.f96187w0;
                ewr0 ewr0VarM130394b = ewr0VarM130395c4.zzd().booleanValue() ? gix0Var.m130394b((bir0) ewr0VarM130395c5) : ewr0VarM130395c6 != null ? gix0Var.m130394b((bir0) ewr0VarM130395c6) : ewr0Var;
                return ewr0VarM130394b instanceof rmr0 ? ewr0VarM130394b : ewr0Var;
            case 10:
                return new bir0(list);
            case 11:
                if (list.isEmpty()) {
                    return ewr0.f96183A0;
                }
                tqw0.m192372f(zzbv.RETURN, 1, list);
                return new rmr0(QueryStateVariableAction.OUTPUT_ARG_RETURN, gix0Var.m130395c(list.get(0)));
            case 12:
                tqw0.m192372f(zzbv.SWITCH, 3, list);
                ewr0 ewr0VarM130395c7 = gix0Var.m130395c(list.get(0));
                ewr0 ewr0VarM130395c8 = gix0Var.m130395c(list.get(1));
                ewr0 ewr0VarM130395c9 = gix0Var.m130395c(list.get(2));
                if (!(ewr0VarM130395c8 instanceof bir0)) {
                    wg3.m206174a("Malformed SWITCH statement, cases are not a list");
                    return null;
                }
                if (!(ewr0VarM130395c9 instanceof bir0)) {
                    wg3.m206174a("Malformed SWITCH statement, case statements are not a list");
                    return null;
                }
                bir0 bir0Var = (bir0) ewr0VarM130395c8;
                bir0 bir0Var2 = (bir0) ewr0VarM130395c9;
                boolean z = false;
                for (int i = 0; i < bir0Var.m104501j(); i++) {
                    if (z || ewr0VarM130395c7.equals(gix0Var.m130395c(bir0Var.m104498g(i)))) {
                        ewr0 ewr0VarM130395c10 = gix0Var.m130395c(bir0Var2.m104498g(i));
                        if (ewr0VarM130395c10 instanceof rmr0) {
                            if (!((rmr0) ewr0VarM130395c10).m182106b().equals("break")) {
                                return ewr0VarM130395c10;
                            }
                            return ewr0.f96187w0;
                        }
                        z = true;
                    }
                }
                if (bir0Var.m104501j() + 1 == bir0Var2.m104501j()) {
                    ewr0 ewr0VarM130395c11 = gix0Var.m130395c(bir0Var2.m104498g(bir0Var.m104501j()));
                    if (ewr0VarM130395c11 instanceof rmr0) {
                        String strM182106b = ((rmr0) ewr0VarM130395c11).m182106b();
                        if (strM182106b.equals(QueryStateVariableAction.OUTPUT_ARG_RETURN) || strM182106b.equals("continue")) {
                            return ewr0VarM130395c11;
                        }
                    }
                }
                return ewr0.f96187w0;
            case 13:
                tqw0.m192372f(zzbv.TERNARY, 3, list);
                return gix0Var.m130395c(list.get(0)).zzd().booleanValue() ? gix0Var.m130395c(list.get(1)) : gix0Var.m130395c(list.get(2));
            default:
                return super.m129267a(str);
        }
    }
}
