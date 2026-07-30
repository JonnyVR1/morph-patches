package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import com.meituan.robust.Constants;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class dxs0 extends g6s0 {
    public dxs0() {
        this.f102479a.add(zzbv.ASSIGN);
        this.f102479a.add(zzbv.CONST);
        this.f102479a.add(zzbv.CREATE_ARRAY);
        this.f102479a.add(zzbv.CREATE_OBJECT);
        this.f102479a.add(zzbv.EXPRESSION_LIST);
        this.f102479a.add(zzbv.GET);
        this.f102479a.add(zzbv.GET_INDEX);
        this.f102479a.add(zzbv.GET_PROPERTY);
        this.f102479a.add(zzbv.NULL);
        this.f102479a.add(zzbv.SET_PROPERTY);
        this.f102479a.add(zzbv.TYPEOF);
        this.f102479a.add(zzbv.UNDEFINED);
        this.f102479a.add(zzbv.VAR);
    }

    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        String str2;
        int i = 0;
        switch (vvs0.f185985a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                tqw0.m192372f(zzbv.ASSIGN, 2, list);
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
                if (!(ewr0VarM130395c instanceof vyr0)) {
                    gzi0.m133102a("Expected string for assign var. got %s", new Object[]{ewr0VarM130395c.getClass().getCanonicalName()});
                    return null;
                }
                if (!gix0Var.m130399g(ewr0VarM130395c.zzf())) {
                    gzi0.m133102a("Attempting to assign undefined value %s", new Object[]{ewr0VarM130395c.zzf()});
                    return null;
                }
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(1));
                gix0Var.m130400h(ewr0VarM130395c.zzf(), ewr0VarM130395c2);
                return ewr0VarM130395c2;
            case 2:
                tqw0.m192376j(zzbv.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    gzi0.m133102a("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())});
                    return null;
                }
                while (i < list.size() - 1) {
                    ewr0 ewr0VarM130395c3 = gix0Var.m130395c(list.get(i));
                    if (!(ewr0VarM130395c3 instanceof vyr0)) {
                        gzi0.m133102a("Expected string for const name. got %s", new Object[]{ewr0VarM130395c3.getClass().getCanonicalName()});
                        return null;
                    }
                    gix0Var.m130398f(ewr0VarM130395c3.zzf(), gix0Var.m130395c(list.get(i + 1)));
                    i += 2;
                }
                return ewr0.f96187w0;
            case 3:
                if (list.isEmpty()) {
                    return new bir0();
                }
                bir0 bir0Var = new bir0();
                Iterator<ewr0> it = list.iterator();
                while (it.hasNext()) {
                    ewr0 ewr0VarM130395c4 = gix0Var.m130395c(it.next());
                    if (ewr0VarM130395c4 instanceof rmr0) {
                        wtq0.m207906a("Failed to evaluate array element");
                        return null;
                    }
                    bir0Var.m104504p(i, ewr0VarM130395c4);
                    i++;
                }
                return bir0Var;
            case 4:
                if (list.isEmpty()) {
                    return new avr0();
                }
                if (list.size() % 2 != 0) {
                    gzi0.m133102a("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())});
                    return null;
                }
                avr0 avr0Var = new avr0();
                while (i < list.size() - 1) {
                    ewr0 ewr0VarM130395c5 = gix0Var.m130395c(list.get(i));
                    ewr0 ewr0VarM130395c6 = gix0Var.m130395c(list.get(i + 1));
                    if ((ewr0VarM130395c5 instanceof rmr0) || (ewr0VarM130395c6 instanceof rmr0)) {
                        wtq0.m207906a("Failed to evaluate map entry");
                        return null;
                    }
                    avr0Var.mo100512a(ewr0VarM130395c5.zzf(), ewr0VarM130395c6);
                    i += 2;
                }
                return avr0Var;
            case 5:
                tqw0.m192376j(zzbv.EXPRESSION_LIST, 1, list);
                ewr0 ewr0VarM130395c7 = ewr0.f96187w0;
                while (i < list.size()) {
                    ewr0VarM130395c7 = gix0Var.m130395c(list.get(i));
                    if (ewr0VarM130395c7 instanceof rmr0) {
                        wtq0.m207906a("ControlValue cannot be in an expression list");
                        return null;
                    }
                    i++;
                }
                return ewr0VarM130395c7;
            case 6:
                tqw0.m192372f(zzbv.GET, 1, list);
                ewr0 ewr0VarM130395c8 = gix0Var.m130395c(list.get(0));
                if (ewr0VarM130395c8 instanceof vyr0) {
                    return gix0Var.m130393a(ewr0VarM130395c8.zzf());
                }
                gzi0.m133102a("Expected string for get var. got %s", new Object[]{ewr0VarM130395c8.getClass().getCanonicalName()});
                return null;
            case 7:
            case 8:
                tqw0.m192372f(zzbv.GET_PROPERTY, 2, list);
                ewr0 ewr0VarM130395c9 = gix0Var.m130395c(list.get(0));
                ewr0 ewr0VarM130395c10 = gix0Var.m130395c(list.get(1));
                if ((ewr0VarM130395c9 instanceof bir0) && tqw0.m192378l(ewr0VarM130395c10)) {
                    return ((bir0) ewr0VarM130395c9).m104498g(ewr0VarM130395c10.zze().intValue());
                }
                if (ewr0VarM130395c9 instanceof eor0) {
                    return ((eor0) ewr0VarM130395c9).zza(ewr0VarM130395c10.zzf());
                }
                if (ewr0VarM130395c9 instanceof vyr0) {
                    if ("length".equals(ewr0VarM130395c10.zzf())) {
                        return new glr0(Double.valueOf(ewr0VarM130395c9.zzf().length()));
                    }
                    if (tqw0.m192378l(ewr0VarM130395c10) && ewr0VarM130395c10.zze().doubleValue() < ewr0VarM130395c9.zzf().length()) {
                        return new vyr0(String.valueOf(ewr0VarM130395c9.zzf().charAt(ewr0VarM130395c10.zze().intValue())));
                    }
                }
                return ewr0.f96187w0;
            case 9:
                tqw0.m192372f(zzbv.NULL, 0, list);
                return ewr0.f96188x0;
            case 10:
                tqw0.m192372f(zzbv.SET_PROPERTY, 3, list);
                ewr0 ewr0VarM130395c11 = gix0Var.m130395c(list.get(0));
                ewr0 ewr0VarM130395c12 = gix0Var.m130395c(list.get(1));
                ewr0 ewr0VarM130395c13 = gix0Var.m130395c(list.get(2));
                if (ewr0VarM130395c11 == ewr0.f96187w0 || ewr0VarM130395c11 == ewr0.f96188x0) {
                    eok0.m121752a("Can't set property %s of %s", new Object[]{ewr0VarM130395c12.zzf(), ewr0VarM130395c11.zzf()});
                    return null;
                }
                if ((ewr0VarM130395c11 instanceof bir0) && (ewr0VarM130395c12 instanceof glr0)) {
                    ((bir0) ewr0VarM130395c11).m104504p(ewr0VarM130395c12.zze().intValue(), ewr0VarM130395c13);
                    return ewr0VarM130395c13;
                }
                if (ewr0VarM130395c11 instanceof eor0) {
                    ((eor0) ewr0VarM130395c11).mo100512a(ewr0VarM130395c12.zzf(), ewr0VarM130395c13);
                }
                return ewr0VarM130395c13;
            case 11:
                tqw0.m192372f(zzbv.TYPEOF, 1, list);
                ewr0 ewr0VarM130395c14 = gix0Var.m130395c(list.get(0));
                if (ewr0VarM130395c14 instanceof w4s0) {
                    str2 = NotificationStatus.undefined;
                } else if (ewr0VarM130395c14 instanceof hjr0) {
                    str2 = Constants.BOOLEAN;
                } else if (ewr0VarM130395c14 instanceof glr0) {
                    str2 = "number";
                } else if (ewr0VarM130395c14 instanceof vyr0) {
                    str2 = "string";
                } else if (ewr0VarM130395c14 instanceof pxr0) {
                    str2 = "function";
                } else {
                    if ((ewr0VarM130395c14 instanceof xzr0) || (ewr0VarM130395c14 instanceof rmr0)) {
                        gzi0.m133102a("Unsupported value type %s in typeof", new Object[]{ewr0VarM130395c14});
                        return null;
                    }
                    str2 = "object";
                }
                return new vyr0(str2);
            case 12:
                tqw0.m192372f(zzbv.UNDEFINED, 0, list);
                return ewr0.f96187w0;
            case 13:
                tqw0.m192376j(zzbv.VAR, 1, list);
                Iterator<ewr0> it2 = list.iterator();
                while (it2.hasNext()) {
                    ewr0 ewr0VarM130395c15 = gix0Var.m130395c(it2.next());
                    if (!(ewr0VarM130395c15 instanceof vyr0)) {
                        gzi0.m133102a("Expected string for var name. got %s", new Object[]{ewr0VarM130395c15.getClass().getCanonicalName()});
                        return null;
                    }
                    gix0Var.m130397e(ewr0VarM130395c15.zzf(), ewr0.f96187w0);
                }
                return ewr0.f96187w0;
            default:
                return super.m129267a(str);
        }
    }
}
