package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.GuideBoostMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class qes0 {
    /* JADX INFO: renamed from: a */
    public static bir0 m176264a(bir0 bir0Var, gix0 gix0Var, mpr0 mpr0Var) {
        return m176265b(bir0Var, gix0Var, mpr0Var, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static bir0 m176265b(bir0 bir0Var, gix0 gix0Var, mpr0 mpr0Var, Boolean bool, Boolean bool2) {
        bir0 bir0Var2 = new bir0();
        Iterator<Integer> itM104506s = bir0Var.m104506s();
        while (itM104506s.hasNext()) {
            int iIntValue = itM104506s.next().intValue();
            if (bir0Var.m104505r(iIntValue)) {
                ewr0 ewr0VarMo107102d = mpr0Var.mo107102d(gix0Var, Arrays.asList(bir0Var.m104498g(iIntValue), new glr0(Double.valueOf(iIntValue)), bir0Var));
                if (ewr0VarMo107102d.zzd().equals(bool)) {
                    break;
                }
                if (bool2 == null || ewr0VarMo107102d.zzd().equals(bool2)) {
                    bir0Var2.m104504p(iIntValue, ewr0VarMo107102d);
                }
            }
        }
        return bir0Var2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static ewr0 m176266c(String str, bir0 bir0Var, gix0 gix0Var, List<ewr0> list) {
        String strZzf;
        mpr0 mpr0Var;
        gix0 gix0Var2;
        Double d;
        byte b;
        Double dValueOf = Double.valueOf(-1.0d);
        str.getClass();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1776922004:
                if (str.equals("toString")) {
                    b2 = 0;
                }
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b2 = 1;
                }
                break;
            case -1274492040:
                if (str.equals("filter")) {
                    b2 = 2;
                }
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b2 = 3;
                }
                break;
            case -895859076:
                if (str.equals("splice")) {
                    b = 4;
                    b2 = b;
                }
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b = 5;
                    b2 = b;
                }
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 6;
                    b2 = b;
                }
                break;
            case -277637751:
                if (str.equals("unshift")) {
                    b = 7;
                    b2 = b;
                }
                break;
            case 107868:
                if (str.equals("map")) {
                    b = 8;
                    b2 = b;
                }
                break;
            case 111185:
                if (str.equals(GuideBoostMode.pop)) {
                    b = 9;
                    b2 = b;
                }
                break;
            case 3267882:
                if (str.equals("join")) {
                    b = 10;
                    b2 = b;
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    b = 11;
                    b2 = b;
                }
                break;
            case 3536116:
                if (str.equals("some")) {
                    b = 12;
                    b2 = b;
                }
                break;
            case 3536286:
                if (str.equals("sort")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                    b2 = b;
                }
                break;
            case 96891675:
                if (str.equals("every")) {
                    b = 14;
                    b2 = b;
                }
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b = 15;
                    b2 = b;
                }
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = Tnaf.POW_2_WIDTH;
                    b2 = b;
                }
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b = 17;
                    b2 = b;
                }
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b = 18;
                    b2 = b;
                }
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = 19;
                    b2 = b;
                }
                break;
        }
        ewr0 ewr0Var = null;
        double dM104501j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        switch (b2) {
            case 0:
                tqw0.m192373g("toString", 0, list);
                return new vyr0(bir0Var.toString());
            case 1:
                bir0 bir0Var2 = (bir0) bir0Var.zzc();
                if (!list.isEmpty()) {
                    Iterator<ewr0> it = list.iterator();
                    while (it.hasNext()) {
                        ewr0 ewr0VarM130395c = gix0Var.m130395c(it.next());
                        if (ewr0VarM130395c instanceof rmr0) {
                            wtq0.m207906a("Failed evaluation of arguments");
                            return null;
                        }
                        int iM104501j = bir0Var2.m104501j();
                        if (ewr0VarM130395c instanceof bir0) {
                            bir0 bir0Var3 = (bir0) ewr0VarM130395c;
                            Iterator<Integer> itM104506s = bir0Var3.m104506s();
                            while (itM104506s.hasNext()) {
                                Integer next = itM104506s.next();
                                bir0Var2.m104504p(next.intValue() + iM104501j, bir0Var3.m104498g(next.intValue()));
                            }
                        } else {
                            bir0Var2.m104504p(iM104501j, ewr0VarM130395c);
                        }
                    }
                }
                return bir0Var2;
            case 2:
                tqw0.m192373g("filter", 1, list);
                ewr0 ewr0VarM130395c2 = gix0Var.m130395c(list.get(0));
                if (!(ewr0VarM130395c2 instanceof pxr0)) {
                    wg3.m206174a("Callback should be a method");
                    return null;
                }
                if (bir0Var.m104497f() == 0) {
                    return new bir0();
                }
                bir0 bir0Var4 = (bir0) bir0Var.zzc();
                bir0 bir0VarM176265b = m176265b(bir0Var, gix0Var, (pxr0) ewr0VarM130395c2, null, Boolean.TRUE);
                bir0 bir0Var5 = new bir0();
                Iterator<Integer> itM104506s2 = bir0VarM176265b.m104506s();
                while (itM104506s2.hasNext()) {
                    bir0Var5.m104500i(bir0Var4.m104498g(itM104506s2.next().intValue()));
                }
                return bir0Var5;
            case 3:
                return m176267d(bir0Var, gix0Var, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new bir0();
                }
                int iM192367a = (int) tqw0.m192367a(gix0Var.m130395c(list.get(0)).zze().doubleValue());
                if (iM192367a < 0) {
                    iM192367a = Math.max(0, iM192367a + bir0Var.m104501j());
                } else if (iM192367a > bir0Var.m104501j()) {
                    iM192367a = bir0Var.m104501j();
                }
                int iM104501j2 = bir0Var.m104501j();
                bir0 bir0Var6 = new bir0();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) tqw0.m192367a(gix0Var.m130395c(list.get(1)).zze().doubleValue()));
                    if (iMax > 0) {
                        for (int i = iM192367a; i < Math.min(iM104501j2, iM192367a + iMax); i++) {
                            bir0Var6.m104500i(bir0Var.m104498g(iM192367a));
                            bir0Var.m104503o(iM192367a);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            ewr0 ewr0VarM130395c3 = gix0Var.m130395c(list.get(i2));
                            if (ewr0VarM130395c3 instanceof rmr0) {
                                wg3.m206174a("Failed to parse elements to add");
                                return null;
                            }
                            bir0Var.m104499h((iM192367a + i2) - 2, ewr0VarM130395c3);
                        }
                    }
                } else {
                    while (iM192367a < iM104501j2) {
                        bir0Var6.m104500i(bir0Var.m104498g(iM192367a));
                        bir0Var.m104504p(iM192367a, null);
                        iM192367a++;
                    }
                }
                return bir0Var6;
            case 5:
                tqw0.m192373g("forEach", 1, list);
                ewr0 ewr0VarM130395c4 = gix0Var.m130395c(list.get(0));
                if (!(ewr0VarM130395c4 instanceof pxr0)) {
                    wg3.m206174a("Callback should be a method");
                    return null;
                }
                if (bir0Var.m104497f() == 0) {
                    return ewr0.f96187w0;
                }
                m176264a(bir0Var, gix0Var, (pxr0) ewr0VarM130395c4);
                return ewr0.f96187w0;
            case 6:
                tqw0.m192380n("lastIndexOf", 2, list);
                ewr0 ewr0VarM130395c5 = ewr0.f96187w0;
                if (!list.isEmpty()) {
                    ewr0VarM130395c5 = gix0Var.m130395c(list.get(0));
                }
                double dM104501j2 = bir0Var.m104501j() - 1;
                if (list.size() > 1) {
                    ewr0 ewr0VarM130395c6 = gix0Var.m130395c(list.get(1));
                    dM104501j2 = Double.isNaN(ewr0VarM130395c6.zze().doubleValue()) ? bir0Var.m104501j() - 1 : tqw0.m192367a(ewr0VarM130395c6.zze().doubleValue());
                    if (dM104501j2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dM104501j2 += (double) bir0Var.m104501j();
                    }
                }
                if (dM104501j2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    return new glr0(dValueOf);
                }
                for (int iMin = (int) Math.min(bir0Var.m104501j(), dM104501j2); iMin >= 0; iMin--) {
                    if (bir0Var.m104505r(iMin) && tqw0.m192374h(bir0Var.m104498g(iMin), ewr0VarM130395c5)) {
                        return new glr0(Double.valueOf(iMin));
                    }
                }
                return new glr0(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    bir0 bir0Var7 = new bir0();
                    Iterator<ewr0> it2 = list.iterator();
                    while (it2.hasNext()) {
                        ewr0 ewr0VarM130395c7 = gix0Var.m130395c(it2.next());
                        if (ewr0VarM130395c7 instanceof rmr0) {
                            wtq0.m207906a("Argument evaluation failed");
                            return null;
                        }
                        bir0Var7.m104500i(ewr0VarM130395c7);
                    }
                    int iM104501j3 = bir0Var7.m104501j();
                    Iterator<Integer> itM104506s3 = bir0Var.m104506s();
                    while (itM104506s3.hasNext()) {
                        Integer next2 = itM104506s3.next();
                        bir0Var7.m104504p(next2.intValue() + iM104501j3, bir0Var.m104498g(next2.intValue()));
                    }
                    bir0Var.m104508w();
                    Iterator<Integer> itM104506s4 = bir0Var7.m104506s();
                    while (itM104506s4.hasNext()) {
                        Integer next3 = itM104506s4.next();
                        bir0Var.m104504p(next3.intValue(), bir0Var7.m104498g(next3.intValue()));
                    }
                }
                return new glr0(Double.valueOf(bir0Var.m104501j()));
            case 8:
                tqw0.m192373g("map", 1, list);
                ewr0 ewr0VarM130395c8 = gix0Var.m130395c(list.get(0));
                if (ewr0VarM130395c8 instanceof pxr0) {
                    return bir0Var.m104501j() == 0 ? new bir0() : m176264a(bir0Var, gix0Var, (pxr0) ewr0VarM130395c8);
                }
                wg3.m206174a("Callback should be a method");
                return null;
            case 9:
                tqw0.m192373g(GuideBoostMode.pop, 0, list);
                int iM104501j4 = bir0Var.m104501j();
                if (iM104501j4 == 0) {
                    return ewr0.f96187w0;
                }
                int i3 = iM104501j4 - 1;
                ewr0 ewr0VarM104498g = bir0Var.m104498g(i3);
                bir0Var.m104503o(i3);
                return ewr0VarM104498g;
            case 10:
                tqw0.m192380n("join", 1, list);
                if (bir0Var.m104501j() == 0) {
                    return ewr0.f96186D0;
                }
                if (list.isEmpty()) {
                    strZzf = Constants.SEPARATOR_COMMA;
                } else {
                    ewr0 ewr0VarM130395c9 = gix0Var.m130395c(list.get(0));
                    strZzf = ((ewr0VarM130395c9 instanceof str0) || (ewr0VarM130395c9 instanceof w4s0)) ? "" : ewr0VarM130395c9.zzf();
                }
                return new vyr0(bir0Var.m104502l(strZzf));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<ewr0> it3 = list.iterator();
                    while (it3.hasNext()) {
                        bir0Var.m104500i(gix0Var.m130395c(it3.next()));
                    }
                }
                return new glr0(Double.valueOf(bir0Var.m104501j()));
            case 12:
                tqw0.m192373g("some", 1, list);
                ewr0 ewr0VarM130395c10 = gix0Var.m130395c(list.get(0));
                if (!(ewr0VarM130395c10 instanceof mpr0)) {
                    wg3.m206174a("Callback should be a method");
                    return null;
                }
                if (bir0Var.m104501j() != 0) {
                    mpr0 mpr0Var2 = (mpr0) ewr0VarM130395c10;
                    Iterator<Integer> itM104506s5 = bir0Var.m104506s();
                    while (itM104506s5.hasNext()) {
                        int iIntValue = itM104506s5.next().intValue();
                        if (bir0Var.m104505r(iIntValue) && mpr0Var2.mo107102d(gix0Var, Arrays.asList(bir0Var.m104498g(iIntValue), new glr0(Double.valueOf(iIntValue)), bir0Var)).zzd().booleanValue()) {
                            return ewr0.f96184B0;
                        }
                    }
                }
                return ewr0.f96185C0;
            case 13:
                tqw0.m192380n("sort", 1, list);
                if (bir0Var.m104501j() >= 2) {
                    List<ewr0> listM104507v = bir0Var.m104507v();
                    if (list.isEmpty()) {
                        mpr0Var = null;
                    } else {
                        ewr0 ewr0VarM130395c11 = gix0Var.m130395c(list.get(0));
                        if (!(ewr0VarM130395c11 instanceof mpr0)) {
                            wg3.m206174a("Comparator should be a method");
                            return null;
                        }
                        mpr0Var = (mpr0) ewr0VarM130395c11;
                    }
                    Collections.sort(listM104507v, new ths0(mpr0Var, gix0Var));
                    bir0Var.m104508w();
                    Iterator<ewr0> it4 = listM104507v.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        bir0Var.m104504p(i4, it4.next());
                        i4++;
                    }
                }
                return bir0Var;
            case 14:
                tqw0.m192373g("every", 1, list);
                ewr0 ewr0VarM130395c12 = gix0Var.m130395c(list.get(0));
                if (ewr0VarM130395c12 instanceof pxr0) {
                    return (bir0Var.m104501j() == 0 || m176265b(bir0Var, gix0Var, (pxr0) ewr0VarM130395c12, Boolean.FALSE, Boolean.TRUE).m104501j() == bir0Var.m104501j()) ? ewr0.f96184B0 : ewr0.f96185C0;
                }
                wg3.m206174a("Callback should be a method");
                return null;
            case 15:
                tqw0.m192373g("shift", 0, list);
                if (bir0Var.m104501j() == 0) {
                    return ewr0.f96187w0;
                }
                ewr0 ewr0VarM104498g2 = bir0Var.m104498g(0);
                bir0Var.m104503o(0);
                return ewr0VarM104498g2;
            case 16:
                tqw0.m192380n("slice", 2, list);
                if (list.isEmpty()) {
                    return bir0Var.zzc();
                }
                double dM104501j3 = bir0Var.m104501j();
                double dM192367a = tqw0.m192367a(gix0Var.m130395c(list.get(0)).zze().doubleValue());
                double dMax = dM192367a < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(dM192367a + dM104501j3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM192367a, dM104501j3);
                if (list.size() == 2) {
                    double dM192367a2 = tqw0.m192367a(gix0Var.m130395c(list.get(1)).zze().doubleValue());
                    dM104501j3 = dM192367a2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(dM104501j3 + dM192367a2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM104501j3, dM192367a2);
                }
                bir0 bir0Var8 = new bir0();
                for (int i5 = (int) dMax; i5 < dM104501j3; i5++) {
                    bir0Var8.m104500i(bir0Var.m104498g(i5));
                }
                return bir0Var8;
            case 17:
                return m176267d(bir0Var, gix0Var, list, false);
            case 18:
                tqw0.m192373g("reverse", 0, list);
                int iM104501j5 = bir0Var.m104501j();
                if (iM104501j5 != 0) {
                    int i6 = 0;
                    while (i6 < iM104501j5 / 2) {
                        if (bir0Var.m104505r(i6)) {
                            ewr0 ewr0VarM104498g3 = bir0Var.m104498g(i6);
                            bir0Var.m104504p(i6, ewr0Var);
                            int i7 = (iM104501j5 - 1) - i6;
                            if (bir0Var.m104505r(i7)) {
                                bir0Var.m104504p(i6, bir0Var.m104498g(i7));
                            }
                            bir0Var.m104504p(i7, ewr0VarM104498g3);
                        }
                        i6++;
                        ewr0Var = null;
                    }
                }
                return bir0Var;
            case 19:
                tqw0.m192380n("indexOf", 2, list);
                ewr0 ewr0VarM130395c13 = ewr0.f96187w0;
                if (list.isEmpty()) {
                    gix0Var2 = gix0Var;
                } else {
                    gix0Var2 = gix0Var;
                    ewr0VarM130395c13 = gix0Var2.m130395c(list.get(0));
                }
                if (list.size() > 1) {
                    double dM192367a3 = tqw0.m192367a(gix0Var2.m130395c(list.get(1)).zze().doubleValue());
                    if (dM192367a3 >= bir0Var.m104501j()) {
                        return new glr0(dValueOf);
                    }
                    d = dValueOf;
                    dM104501j = dM192367a3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? ((double) bir0Var.m104501j()) + dM192367a3 : dM192367a3;
                } else {
                    d = dValueOf;
                }
                Iterator<Integer> itM104506s6 = bir0Var.m104506s();
                while (itM104506s6.hasNext()) {
                    int iIntValue2 = itM104506s6.next().intValue();
                    double d2 = iIntValue2;
                    if (d2 >= dM104501j && tqw0.m192374h(bir0Var.m104498g(iIntValue2), ewr0VarM130395c13)) {
                        return new glr0(Double.valueOf(d2));
                    }
                }
                return new glr0(d);
            default:
                wg3.m206174a("Command not supported");
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ewr0 m176267d(bir0 bir0Var, gix0 gix0Var, List<ewr0> list, boolean z) {
        ewr0 ewr0VarMo107102d;
        tqw0.m192377k("reduce", 1, list);
        tqw0.m192380n("reduce", 2, list);
        ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
        if (!(ewr0VarM130395c instanceof mpr0)) {
            wg3.m206174a("Callback should be a method");
            return null;
        }
        if (list.size() == 2) {
            ewr0VarMo107102d = gix0Var.m130395c(list.get(1));
            if (ewr0VarMo107102d instanceof rmr0) {
                wg3.m206174a("Failed to parse initial value");
                return null;
            }
        } else {
            if (bir0Var.m104501j() == 0) {
                wtq0.m207906a("Empty array with no initial value error");
                return null;
            }
            ewr0VarMo107102d = null;
        }
        mpr0 mpr0Var = (mpr0) ewr0VarM130395c;
        int iM104501j = bir0Var.m104501j();
        int i = z ? 0 : iM104501j - 1;
        int i2 = z ? iM104501j - 1 : 0;
        int i3 = z ? 1 : -1;
        if (ewr0VarMo107102d == null) {
            ewr0VarMo107102d = bir0Var.m104498g(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (bir0Var.m104505r(i)) {
                ewr0VarMo107102d = mpr0Var.mo107102d(gix0Var, Arrays.asList(ewr0VarMo107102d, bir0Var.m104498g(i), new glr0(Double.valueOf(i)), bir0Var));
                if (ewr0VarMo107102d instanceof rmr0) {
                    wtq0.m207906a("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return ewr0VarMo107102d;
    }
}
