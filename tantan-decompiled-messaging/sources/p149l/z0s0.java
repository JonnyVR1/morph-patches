package p149l;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class z0s0 extends axr0 {
    public z0s0() {
        this.f72232a.add(zzbv.EQUALS);
        this.f72232a.add(zzbv.GREATER_THAN);
        this.f72232a.add(zzbv.GREATER_THAN_EQUALS);
        this.f72232a.add(zzbv.IDENTITY_EQUALS);
        this.f72232a.add(zzbv.IDENTITY_NOT_EQUALS);
        this.f72232a.add(zzbv.LESS_THAN);
        this.f72232a.add(zzbv.LESS_THAN_EQUALS);
        this.f72232a.add(zzbv.NOT_EQUALS);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216757c(ymr0 ymr0Var, ymr0 ymr0Var2) {
        ymr0 acr0Var;
        ymr0 acr0Var2;
        while (!ymr0Var.getClass().equals(ymr0Var2.getClass())) {
            if (((ymr0Var instanceof qvr0) || (ymr0Var instanceof mkr0)) && ((ymr0Var2 instanceof qvr0) || (ymr0Var2 instanceof mkr0))) {
                return true;
            }
            boolean z = ymr0Var instanceof acr0;
            if (z && (ymr0Var2 instanceof ppr0)) {
                acr0Var2 = new acr0(ymr0Var2.zze());
            } else {
                boolean z2 = ymr0Var instanceof ppr0;
                if (z2 && (ymr0Var2 instanceof acr0)) {
                    acr0Var = new acr0(ymr0Var.zze());
                } else if (ymr0Var instanceof bar0) {
                    acr0Var = new acr0(ymr0Var.zze());
                } else if (ymr0Var2 instanceof bar0) {
                    acr0Var2 = new acr0(ymr0Var2.zze());
                } else if ((z2 || z) && (ymr0Var2 instanceof yer0)) {
                    acr0Var2 = new ppr0(ymr0Var2.zzf());
                } else {
                    if (!(ymr0Var instanceof yer0) || (!(ymr0Var2 instanceof ppr0) && !(ymr0Var2 instanceof acr0))) {
                        return false;
                    }
                    acr0Var = new ppr0(ymr0Var.zzf());
                }
                ymr0Var = acr0Var;
            }
            ymr0Var2 = acr0Var2;
        }
        if ((ymr0Var instanceof qvr0) || (ymr0Var instanceof mkr0)) {
            return true;
        }
        if (ymr0Var instanceof acr0) {
            return (Double.isNaN(ymr0Var.zze().doubleValue()) || Double.isNaN(ymr0Var2.zze().doubleValue()) || ymr0Var.zze().doubleValue() != ymr0Var2.zze().doubleValue()) ? false : true;
        }
        if (ymr0Var instanceof ppr0) {
            return ymr0Var.zzf().equals(ymr0Var2.zzf());
        }
        if (ymr0Var instanceof bar0) {
            return ymr0Var.zzd().equals(ymr0Var2.zzd());
        }
        return ymr0Var == ymr0Var2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m216758d(ymr0 ymr0Var, ymr0 ymr0Var2) {
        if (ymr0Var instanceof yer0) {
            ymr0Var = new ppr0(ymr0Var.zzf());
        }
        if (ymr0Var2 instanceof yer0) {
            ymr0Var2 = new ppr0(ymr0Var2.zzf());
        }
        if ((ymr0Var instanceof ppr0) && (ymr0Var2 instanceof ppr0)) {
            return ymr0Var.zzf().compareTo(ymr0Var2.zzf()) < 0;
        }
        double dDoubleValue = ymr0Var.zze().doubleValue();
        double dDoubleValue2 = ymr0Var2.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m216759e(ymr0 ymr0Var, ymr0 ymr0Var2) {
        if (ymr0Var instanceof yer0) {
            ymr0Var = new ppr0(ymr0Var.zzf());
        }
        if (ymr0Var2 instanceof yer0) {
            ymr0Var2 = new ppr0(ymr0Var2.zzf());
        }
        return (((ymr0Var instanceof ppr0) && (ymr0Var2 instanceof ppr0)) || !(Double.isNaN(ymr0Var.zze().doubleValue()) || Double.isNaN(ymr0Var2.zze().doubleValue()))) && !m216758d(ymr0Var2, ymr0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    @Override // p149l.axr0
    /* JADX INFO: renamed from: b */
    public final ymr0 mo99519b(String str, a9x0 a9x0Var, List<ymr0> list) {
        boolean zM216757c;
        boolean zM159471h;
        nhw0.m159469f(nhw0.m159466c(str), 2, list);
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
        ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(1));
        switch (k4s0.f121120a[nhw0.m159466c(str).ordinal()]) {
            case 1:
                zM216757c = m216757c(ymr0VarM95462c, ymr0VarM95462c2);
                return zM216757c ? ymr0.f199048B0 : ymr0.f199049C0;
            case 2:
                zM216757c = m216758d(ymr0VarM95462c2, ymr0VarM95462c);
                if (zM216757c) {
                }
            case 3:
                zM216757c = m216759e(ymr0VarM95462c2, ymr0VarM95462c);
                if (zM216757c) {
                }
            case 4:
                zM216757c = nhw0.m159471h(ymr0VarM95462c, ymr0VarM95462c2);
                if (zM216757c) {
                }
            case 5:
                zM159471h = nhw0.m159471h(ymr0VarM95462c, ymr0VarM95462c2);
                zM216757c = !zM159471h;
                if (zM216757c) {
                }
            case 6:
                zM216757c = m216758d(ymr0VarM95462c, ymr0VarM95462c2);
                if (zM216757c) {
                }
            case 7:
                zM216757c = m216759e(ymr0VarM95462c, ymr0VarM95462c2);
                if (zM216757c) {
                }
            case 8:
                zM159471h = m216757c(ymr0VarM95462c, ymr0VarM95462c2);
                zM216757c = !zM159471h;
                if (zM216757c) {
                }
            default:
                return super.m99518a(str);
        }
    }
}
