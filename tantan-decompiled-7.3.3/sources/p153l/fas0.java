package p153l;

import com.google.android.gms.internal.measurement.zzbv;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fas0 extends g6s0 {
    public fas0() {
        this.f102479a.add(zzbv.EQUALS);
        this.f102479a.add(zzbv.GREATER_THAN);
        this.f102479a.add(zzbv.GREATER_THAN_EQUALS);
        this.f102479a.add(zzbv.IDENTITY_EQUALS);
        this.f102479a.add(zzbv.IDENTITY_NOT_EQUALS);
        this.f102479a.add(zzbv.LESS_THAN);
        this.f102479a.add(zzbv.LESS_THAN_EQUALS);
        this.f102479a.add(zzbv.NOT_EQUALS);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m124767c(ewr0 ewr0Var, ewr0 ewr0Var2) {
        ewr0 glr0Var;
        ewr0 glr0Var2;
        while (!ewr0Var.getClass().equals(ewr0Var2.getClass())) {
            if (((ewr0Var instanceof w4s0) || (ewr0Var instanceof str0)) && ((ewr0Var2 instanceof w4s0) || (ewr0Var2 instanceof str0))) {
                return true;
            }
            boolean z = ewr0Var instanceof glr0;
            if (z && (ewr0Var2 instanceof vyr0)) {
                glr0Var2 = new glr0(ewr0Var2.zze());
            } else {
                boolean z2 = ewr0Var instanceof vyr0;
                if (z2 && (ewr0Var2 instanceof glr0)) {
                    glr0Var = new glr0(ewr0Var.zze());
                } else if (ewr0Var instanceof hjr0) {
                    glr0Var = new glr0(ewr0Var.zze());
                } else if (ewr0Var2 instanceof hjr0) {
                    glr0Var2 = new glr0(ewr0Var2.zze());
                } else if ((z2 || z) && (ewr0Var2 instanceof eor0)) {
                    glr0Var2 = new vyr0(ewr0Var2.zzf());
                } else {
                    if (!(ewr0Var instanceof eor0) || (!(ewr0Var2 instanceof vyr0) && !(ewr0Var2 instanceof glr0))) {
                        return false;
                    }
                    glr0Var = new vyr0(ewr0Var.zzf());
                }
                ewr0Var = glr0Var;
            }
            ewr0Var2 = glr0Var2;
        }
        if ((ewr0Var instanceof w4s0) || (ewr0Var instanceof str0)) {
            return true;
        }
        if (ewr0Var instanceof glr0) {
            return (Double.isNaN(ewr0Var.zze().doubleValue()) || Double.isNaN(ewr0Var2.zze().doubleValue()) || ewr0Var.zze().doubleValue() != ewr0Var2.zze().doubleValue()) ? false : true;
        }
        if (ewr0Var instanceof vyr0) {
            return ewr0Var.zzf().equals(ewr0Var2.zzf());
        }
        if (ewr0Var instanceof hjr0) {
            return ewr0Var.zzd().equals(ewr0Var2.zzd());
        }
        return ewr0Var == ewr0Var2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124768d(ewr0 ewr0Var, ewr0 ewr0Var2) {
        if (ewr0Var instanceof eor0) {
            ewr0Var = new vyr0(ewr0Var.zzf());
        }
        if (ewr0Var2 instanceof eor0) {
            ewr0Var2 = new vyr0(ewr0Var2.zzf());
        }
        if ((ewr0Var instanceof vyr0) && (ewr0Var2 instanceof vyr0)) {
            return ewr0Var.zzf().compareTo(ewr0Var2.zzf()) < 0;
        }
        double dDoubleValue = ewr0Var.zze().doubleValue();
        double dDoubleValue2 = ewr0Var2.zze().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && dDoubleValue2 == -0.0d) || ((dDoubleValue == -0.0d && dDoubleValue2 == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m124769e(ewr0 ewr0Var, ewr0 ewr0Var2) {
        if (ewr0Var instanceof eor0) {
            ewr0Var = new vyr0(ewr0Var.zzf());
        }
        if (ewr0Var2 instanceof eor0) {
            ewr0Var2 = new vyr0(ewr0Var2.zzf());
        }
        return (((ewr0Var instanceof vyr0) && (ewr0Var2 instanceof vyr0)) || !(Double.isNaN(ewr0Var.zze().doubleValue()) || Double.isNaN(ewr0Var2.zze().doubleValue()))) && !m124768d(ewr0Var2, ewr0Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    /* JADX WARN: Code duplicated, block: B:18:0x005f  */
    @Override // p153l.g6s0
    /* JADX INFO: renamed from: b */
    public final ewr0 mo110282b(String str, gix0 gix0Var, List<ewr0> list) {
        boolean zM124767c;
        boolean zM192374h;
        tqw0.m192372f(tqw0.m192369c(str), 2, list);
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
        ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(1));
        switch (qds0.f156764a[tqw0.m192369c(str).ordinal()]) {
            case 1:
                zM124767c = m124767c(ewr0VarM130395c, ewr0VarM130395c2);
                return zM124767c ? ewr0.f96184B0 : ewr0.f96185C0;
            case 2:
                zM124767c = m124768d(ewr0VarM130395c2, ewr0VarM130395c);
                if (zM124767c) {
                }
            case 3:
                zM124767c = m124769e(ewr0VarM130395c2, ewr0VarM130395c);
                if (zM124767c) {
                }
            case 4:
                zM124767c = tqw0.m192374h(ewr0VarM130395c, ewr0VarM130395c2);
                if (zM124767c) {
                }
            case 5:
                zM192374h = tqw0.m192374h(ewr0VarM130395c, ewr0VarM130395c2);
                zM124767c = !zM192374h;
                if (zM124767c) {
                }
            case 6:
                zM124767c = m124768d(ewr0VarM130395c, ewr0VarM130395c2);
                if (zM124767c) {
                }
            case 7:
                zM124767c = m124769e(ewr0VarM130395c, ewr0VarM130395c2);
                if (zM124767c) {
                }
            case 8:
                zM192374h = m124767c(ewr0VarM130395c, ewr0VarM130395c2);
                zM124767c = !zM192374h;
                if (zM124767c) {
                }
            default:
                return super.m129267a(str);
        }
    }
}
