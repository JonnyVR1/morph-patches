package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import com.meituan.robust.Constants;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xns0 extends axr0 {
    public xns0() {
        this.f72232a.add(zzbv.ASSIGN);
        this.f72232a.add(zzbv.CONST);
        this.f72232a.add(zzbv.CREATE_ARRAY);
        this.f72232a.add(zzbv.CREATE_OBJECT);
        this.f72232a.add(zzbv.EXPRESSION_LIST);
        this.f72232a.add(zzbv.GET);
        this.f72232a.add(zzbv.GET_INDEX);
        this.f72232a.add(zzbv.GET_PROPERTY);
        this.f72232a.add(zzbv.NULL);
        this.f72232a.add(zzbv.SET_PROPERTY);
        this.f72232a.add(zzbv.TYPEOF);
        this.f72232a.add(zzbv.UNDEFINED);
        this.f72232a.add(zzbv.VAR);
    }

    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        String str2;
        int i = 0;
        switch (pms0.f150290a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                nhw0.m159469f(zzbv.ASSIGN, 2, list);
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
                if (!(ymr0VarM95462c instanceof ppr0)) {
                    dqi0.m113073a("Expected string for assign var. got %s", new Object[]{ymr0VarM95462c.getClass().getCanonicalName()});
                    return null;
                }
                if (!a9x0Var.m95466g(ymr0VarM95462c.zzf())) {
                    dqi0.m113073a("Attempting to assign undefined value %s", new Object[]{ymr0VarM95462c.zzf()});
                    return null;
                }
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(1));
                a9x0Var.m95467h(ymr0VarM95462c.zzf(), ymr0VarM95462c2);
                return ymr0VarM95462c2;
            case 2:
                nhw0.m159473j(zzbv.CONST, 2, list);
                if (list.size() % 2 != 0) {
                    dqi0.m113073a("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())});
                    return null;
                }
                while (i < list.size() - 1) {
                    ymr0 ymr0VarM95462c3 = a9x0Var.m95462c(list.get(i));
                    if (!(ymr0VarM95462c3 instanceof ppr0)) {
                        dqi0.m113073a("Expected string for const name. got %s", new Object[]{ymr0VarM95462c3.getClass().getCanonicalName()});
                        return null;
                    }
                    a9x0Var.m95465f(ymr0VarM95462c3.zzf(), a9x0Var.m95462c(list.get(i + 1)));
                    i += 2;
                }
                return ymr0.f199051w0;
            case 3:
                if (list.isEmpty()) {
                    return new v8r0();
                }
                v8r0 v8r0Var = new v8r0();
                Iterator<ymr0> it = list.iterator();
                while (it.hasNext()) {
                    ymr0 ymr0VarM95462c4 = a9x0Var.m95462c(it.next());
                    if (ymr0VarM95462c4 instanceof ldr0) {
                        qkq0.m175383a("Failed to evaluate array element");
                        return null;
                    }
                    v8r0Var.m197500p(i, ymr0VarM95462c4);
                    i++;
                }
                return v8r0Var;
            case 4:
                if (list.isEmpty()) {
                    return new ulr0();
                }
                if (list.size() % 2 != 0) {
                    dqi0.m113073a("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())});
                    return null;
                }
                ulr0 ulr0Var = new ulr0();
                while (i < list.size() - 1) {
                    ymr0 ymr0VarM95462c5 = a9x0Var.m95462c(list.get(i));
                    ymr0 ymr0VarM95462c6 = a9x0Var.m95462c(list.get(i + 1));
                    if ((ymr0VarM95462c5 instanceof ldr0) || (ymr0VarM95462c6 instanceof ldr0)) {
                        qkq0.m175383a("Failed to evaluate map entry");
                        return null;
                    }
                    ulr0Var.mo126000a(ymr0VarM95462c5.zzf(), ymr0VarM95462c6);
                    i += 2;
                }
                return ulr0Var;
            case 5:
                nhw0.m159473j(zzbv.EXPRESSION_LIST, 1, list);
                ymr0 ymr0VarM95462c7 = ymr0.f199051w0;
                while (i < list.size()) {
                    ymr0VarM95462c7 = a9x0Var.m95462c(list.get(i));
                    if (ymr0VarM95462c7 instanceof ldr0) {
                        qkq0.m175383a("ControlValue cannot be in an expression list");
                        return null;
                    }
                    i++;
                }
                return ymr0VarM95462c7;
            case 6:
                nhw0.m159469f(zzbv.GET, 1, list);
                ymr0 ymr0VarM95462c8 = a9x0Var.m95462c(list.get(0));
                if (ymr0VarM95462c8 instanceof ppr0) {
                    return a9x0Var.m95460a(ymr0VarM95462c8.zzf());
                }
                dqi0.m113073a("Expected string for get var. got %s", new Object[]{ymr0VarM95462c8.getClass().getCanonicalName()});
                return null;
            case 7:
            case 8:
                nhw0.m159469f(zzbv.GET_PROPERTY, 2, list);
                ymr0 ymr0VarM95462c9 = a9x0Var.m95462c(list.get(0));
                ymr0 ymr0VarM95462c10 = a9x0Var.m95462c(list.get(1));
                if ((ymr0VarM95462c9 instanceof v8r0) && nhw0.m159475l(ymr0VarM95462c10)) {
                    return ((v8r0) ymr0VarM95462c9).m197494g(ymr0VarM95462c10.zze().intValue());
                }
                if (ymr0VarM95462c9 instanceof yer0) {
                    return ((yer0) ymr0VarM95462c9).zza(ymr0VarM95462c10.zzf());
                }
                if (ymr0VarM95462c9 instanceof ppr0) {
                    if ("length".equals(ymr0VarM95462c10.zzf())) {
                        return new acr0(Double.valueOf(ymr0VarM95462c9.zzf().length()));
                    }
                    if (nhw0.m159475l(ymr0VarM95462c10) && ymr0VarM95462c10.zze().doubleValue() < ymr0VarM95462c9.zzf().length()) {
                        return new ppr0(String.valueOf(ymr0VarM95462c9.zzf().charAt(ymr0VarM95462c10.zze().intValue())));
                    }
                }
                return ymr0.f199051w0;
            case 9:
                nhw0.m159469f(zzbv.NULL, 0, list);
                return ymr0.f199052x0;
            case 10:
                nhw0.m159469f(zzbv.SET_PROPERTY, 3, list);
                ymr0 ymr0VarM95462c11 = a9x0Var.m95462c(list.get(0));
                ymr0 ymr0VarM95462c12 = a9x0Var.m95462c(list.get(1));
                ymr0 ymr0VarM95462c13 = a9x0Var.m95462c(list.get(2));
                if (ymr0VarM95462c11 == ymr0.f199051w0 || ymr0VarM95462c11 == ymr0.f199052x0) {
                    yek0.m214351a("Can't set property %s of %s", new Object[]{ymr0VarM95462c12.zzf(), ymr0VarM95462c11.zzf()});
                    return null;
                }
                if ((ymr0VarM95462c11 instanceof v8r0) && (ymr0VarM95462c12 instanceof acr0)) {
                    ((v8r0) ymr0VarM95462c11).m197500p(ymr0VarM95462c12.zze().intValue(), ymr0VarM95462c13);
                    return ymr0VarM95462c13;
                }
                if (ymr0VarM95462c11 instanceof yer0) {
                    ((yer0) ymr0VarM95462c11).mo126000a(ymr0VarM95462c12.zzf(), ymr0VarM95462c13);
                }
                return ymr0VarM95462c13;
            case 11:
                nhw0.m159469f(zzbv.TYPEOF, 1, list);
                ymr0 ymr0VarM95462c14 = a9x0Var.m95462c(list.get(0));
                if (ymr0VarM95462c14 instanceof qvr0) {
                    str2 = NotificationStatus.undefined;
                } else if (ymr0VarM95462c14 instanceof bar0) {
                    str2 = Constants.BOOLEAN;
                } else if (ymr0VarM95462c14 instanceof acr0) {
                    str2 = "number";
                } else if (ymr0VarM95462c14 instanceof ppr0) {
                    str2 = "string";
                } else if (ymr0VarM95462c14 instanceof jor0) {
                    str2 = "function";
                } else {
                    if ((ymr0VarM95462c14 instanceof rqr0) || (ymr0VarM95462c14 instanceof ldr0)) {
                        dqi0.m113073a("Unsupported value type %s in typeof", new Object[]{ymr0VarM95462c14});
                        return null;
                    }
                    str2 = "object";
                }
                return new ppr0(str2);
            case 12:
                nhw0.m159469f(zzbv.UNDEFINED, 0, list);
                return ymr0.f199051w0;
            case 13:
                nhw0.m159473j(zzbv.VAR, 1, list);
                Iterator<ymr0> it2 = list.iterator();
                while (it2.hasNext()) {
                    ymr0 ymr0VarM95462c15 = a9x0Var.m95462c(it2.next());
                    if (!(ymr0VarM95462c15 instanceof ppr0)) {
                        dqi0.m113073a("Expected string for var name. got %s", new Object[]{ymr0VarM95462c15.getClass().getCanonicalName()});
                        return null;
                    }
                    a9x0Var.m95464e(ymr0VarM95462c15.zzf(), ymr0.f199051w0);
                }
                return ymr0.f199051w0;
            default:
                return super.m99518a(str);
        }
    }
}
