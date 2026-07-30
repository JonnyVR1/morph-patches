package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.data.GuideBoostMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class k5s0 {
    /* JADX INFO: renamed from: a */
    public static v8r0 m144543a(v8r0 v8r0Var, a9x0 a9x0Var, ggr0 ggr0Var) {
        return m144544b(v8r0Var, a9x0Var, ggr0Var, null, null);
    }

    /* JADX INFO: renamed from: b */
    public static v8r0 m144544b(v8r0 v8r0Var, a9x0 a9x0Var, ggr0 ggr0Var, Boolean bool, Boolean bool2) {
        v8r0 v8r0Var2 = new v8r0();
        Iterator<Integer> itM197502s = v8r0Var.m197502s();
        while (itM197502s.hasNext()) {
            int iIntValue = itM197502s.next().intValue();
            if (v8r0Var.m197501r(iIntValue)) {
                ymr0 ymr0VarMo108642d = ggr0Var.mo108642d(a9x0Var, Arrays.asList(v8r0Var.m197494g(iIntValue), new acr0(Double.valueOf(iIntValue)), v8r0Var));
                if (ymr0VarMo108642d.zzd().equals(bool)) {
                    break;
                }
                if (bool2 == null || ymr0VarMo108642d.zzd().equals(bool2)) {
                    v8r0Var2.m197500p(iIntValue, ymr0VarMo108642d);
                }
            }
        }
        return v8r0Var2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: c */
    public static ymr0 m144545c(String str, v8r0 v8r0Var, a9x0 a9x0Var, List<ymr0> list) {
        String strZzf;
        ggr0 ggr0Var;
        a9x0 a9x0Var2;
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
        ymr0 ymr0Var = null;
        double dM197497j = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        switch (b2) {
            case 0:
                nhw0.m159470g("toString", 0, list);
                return new ppr0(v8r0Var.toString());
            case 1:
                v8r0 v8r0Var2 = (v8r0) v8r0Var.zzc();
                if (!list.isEmpty()) {
                    Iterator<ymr0> it = list.iterator();
                    while (it.hasNext()) {
                        ymr0 ymr0VarM95462c = a9x0Var.m95462c(it.next());
                        if (ymr0VarM95462c instanceof ldr0) {
                            qkq0.m175383a("Failed evaluation of arguments");
                            return null;
                        }
                        int iM197497j = v8r0Var2.m197497j();
                        if (ymr0VarM95462c instanceof v8r0) {
                            v8r0 v8r0Var3 = (v8r0) ymr0VarM95462c;
                            Iterator<Integer> itM197502s = v8r0Var3.m197502s();
                            while (itM197502s.hasNext()) {
                                Integer next = itM197502s.next();
                                v8r0Var2.m197500p(next.intValue() + iM197497j, v8r0Var3.m197494g(next.intValue()));
                            }
                        } else {
                            v8r0Var2.m197500p(iM197497j, ymr0VarM95462c);
                        }
                    }
                }
                return v8r0Var2;
            case 2:
                nhw0.m159470g("filter", 1, list);
                ymr0 ymr0VarM95462c2 = a9x0Var.m95462c(list.get(0));
                if (!(ymr0VarM95462c2 instanceof jor0)) {
                    ig3.m135964a("Callback should be a method");
                    return null;
                }
                if (v8r0Var.m197493f() == 0) {
                    return new v8r0();
                }
                v8r0 v8r0Var4 = (v8r0) v8r0Var.zzc();
                v8r0 v8r0VarM144544b = m144544b(v8r0Var, a9x0Var, (jor0) ymr0VarM95462c2, null, Boolean.TRUE);
                v8r0 v8r0Var5 = new v8r0();
                Iterator<Integer> itM197502s2 = v8r0VarM144544b.m197502s();
                while (itM197502s2.hasNext()) {
                    v8r0Var5.m197496i(v8r0Var4.m197494g(itM197502s2.next().intValue()));
                }
                return v8r0Var5;
            case 3:
                return m144546d(v8r0Var, a9x0Var, list, true);
            case 4:
                if (list.isEmpty()) {
                    return new v8r0();
                }
                int iM159464a = (int) nhw0.m159464a(a9x0Var.m95462c(list.get(0)).zze().doubleValue());
                if (iM159464a < 0) {
                    iM159464a = Math.max(0, iM159464a + v8r0Var.m197497j());
                } else if (iM159464a > v8r0Var.m197497j()) {
                    iM159464a = v8r0Var.m197497j();
                }
                int iM197497j2 = v8r0Var.m197497j();
                v8r0 v8r0Var6 = new v8r0();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) nhw0.m159464a(a9x0Var.m95462c(list.get(1)).zze().doubleValue()));
                    if (iMax > 0) {
                        for (int i = iM159464a; i < Math.min(iM197497j2, iM159464a + iMax); i++) {
                            v8r0Var6.m197496i(v8r0Var.m197494g(iM159464a));
                            v8r0Var.m197499o(iM159464a);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i2 = 2; i2 < list.size(); i2++) {
                            ymr0 ymr0VarM95462c3 = a9x0Var.m95462c(list.get(i2));
                            if (ymr0VarM95462c3 instanceof ldr0) {
                                ig3.m135964a("Failed to parse elements to add");
                                return null;
                            }
                            v8r0Var.m197495h((iM159464a + i2) - 2, ymr0VarM95462c3);
                        }
                    }
                } else {
                    while (iM159464a < iM197497j2) {
                        v8r0Var6.m197496i(v8r0Var.m197494g(iM159464a));
                        v8r0Var.m197500p(iM159464a, null);
                        iM159464a++;
                    }
                }
                return v8r0Var6;
            case 5:
                nhw0.m159470g("forEach", 1, list);
                ymr0 ymr0VarM95462c4 = a9x0Var.m95462c(list.get(0));
                if (!(ymr0VarM95462c4 instanceof jor0)) {
                    ig3.m135964a("Callback should be a method");
                    return null;
                }
                if (v8r0Var.m197493f() == 0) {
                    return ymr0.f199051w0;
                }
                m144543a(v8r0Var, a9x0Var, (jor0) ymr0VarM95462c4);
                return ymr0.f199051w0;
            case 6:
                nhw0.m159477n("lastIndexOf", 2, list);
                ymr0 ymr0VarM95462c5 = ymr0.f199051w0;
                if (!list.isEmpty()) {
                    ymr0VarM95462c5 = a9x0Var.m95462c(list.get(0));
                }
                double dM197497j2 = v8r0Var.m197497j() - 1;
                if (list.size() > 1) {
                    ymr0 ymr0VarM95462c6 = a9x0Var.m95462c(list.get(1));
                    dM197497j2 = Double.isNaN(ymr0VarM95462c6.zze().doubleValue()) ? v8r0Var.m197497j() - 1 : nhw0.m159464a(ymr0VarM95462c6.zze().doubleValue());
                    if (dM197497j2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        dM197497j2 += (double) v8r0Var.m197497j();
                    }
                }
                if (dM197497j2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                    return new acr0(dValueOf);
                }
                for (int iMin = (int) Math.min(v8r0Var.m197497j(), dM197497j2); iMin >= 0; iMin--) {
                    if (v8r0Var.m197501r(iMin) && nhw0.m159471h(v8r0Var.m197494g(iMin), ymr0VarM95462c5)) {
                        return new acr0(Double.valueOf(iMin));
                    }
                }
                return new acr0(dValueOf);
            case 7:
                if (!list.isEmpty()) {
                    v8r0 v8r0Var7 = new v8r0();
                    Iterator<ymr0> it2 = list.iterator();
                    while (it2.hasNext()) {
                        ymr0 ymr0VarM95462c7 = a9x0Var.m95462c(it2.next());
                        if (ymr0VarM95462c7 instanceof ldr0) {
                            qkq0.m175383a("Argument evaluation failed");
                            return null;
                        }
                        v8r0Var7.m197496i(ymr0VarM95462c7);
                    }
                    int iM197497j3 = v8r0Var7.m197497j();
                    Iterator<Integer> itM197502s3 = v8r0Var.m197502s();
                    while (itM197502s3.hasNext()) {
                        Integer next2 = itM197502s3.next();
                        v8r0Var7.m197500p(next2.intValue() + iM197497j3, v8r0Var.m197494g(next2.intValue()));
                    }
                    v8r0Var.m197504w();
                    Iterator<Integer> itM197502s4 = v8r0Var7.m197502s();
                    while (itM197502s4.hasNext()) {
                        Integer next3 = itM197502s4.next();
                        v8r0Var.m197500p(next3.intValue(), v8r0Var7.m197494g(next3.intValue()));
                    }
                }
                return new acr0(Double.valueOf(v8r0Var.m197497j()));
            case 8:
                nhw0.m159470g("map", 1, list);
                ymr0 ymr0VarM95462c8 = a9x0Var.m95462c(list.get(0));
                if (ymr0VarM95462c8 instanceof jor0) {
                    return v8r0Var.m197497j() == 0 ? new v8r0() : m144543a(v8r0Var, a9x0Var, (jor0) ymr0VarM95462c8);
                }
                ig3.m135964a("Callback should be a method");
                return null;
            case 9:
                nhw0.m159470g(GuideBoostMode.pop, 0, list);
                int iM197497j4 = v8r0Var.m197497j();
                if (iM197497j4 == 0) {
                    return ymr0.f199051w0;
                }
                int i3 = iM197497j4 - 1;
                ymr0 ymr0VarM197494g = v8r0Var.m197494g(i3);
                v8r0Var.m197499o(i3);
                return ymr0VarM197494g;
            case 10:
                nhw0.m159477n("join", 1, list);
                if (v8r0Var.m197497j() == 0) {
                    return ymr0.f199050D0;
                }
                if (list.isEmpty()) {
                    strZzf = Constants.SEPARATOR_COMMA;
                } else {
                    ymr0 ymr0VarM95462c9 = a9x0Var.m95462c(list.get(0));
                    strZzf = ((ymr0VarM95462c9 instanceof mkr0) || (ymr0VarM95462c9 instanceof qvr0)) ? "" : ymr0VarM95462c9.zzf();
                }
                return new ppr0(v8r0Var.m197498l(strZzf));
            case 11:
                if (!list.isEmpty()) {
                    Iterator<ymr0> it3 = list.iterator();
                    while (it3.hasNext()) {
                        v8r0Var.m197496i(a9x0Var.m95462c(it3.next()));
                    }
                }
                return new acr0(Double.valueOf(v8r0Var.m197497j()));
            case 12:
                nhw0.m159470g("some", 1, list);
                ymr0 ymr0VarM95462c10 = a9x0Var.m95462c(list.get(0));
                if (!(ymr0VarM95462c10 instanceof ggr0)) {
                    ig3.m135964a("Callback should be a method");
                    return null;
                }
                if (v8r0Var.m197497j() != 0) {
                    ggr0 ggr0Var2 = (ggr0) ymr0VarM95462c10;
                    Iterator<Integer> itM197502s5 = v8r0Var.m197502s();
                    while (itM197502s5.hasNext()) {
                        int iIntValue = itM197502s5.next().intValue();
                        if (v8r0Var.m197501r(iIntValue) && ggr0Var2.mo108642d(a9x0Var, Arrays.asList(v8r0Var.m197494g(iIntValue), new acr0(Double.valueOf(iIntValue)), v8r0Var)).zzd().booleanValue()) {
                            return ymr0.f199048B0;
                        }
                    }
                }
                return ymr0.f199049C0;
            case 13:
                nhw0.m159477n("sort", 1, list);
                if (v8r0Var.m197497j() >= 2) {
                    List<ymr0> listM197503v = v8r0Var.m197503v();
                    if (list.isEmpty()) {
                        ggr0Var = null;
                    } else {
                        ymr0 ymr0VarM95462c11 = a9x0Var.m95462c(list.get(0));
                        if (!(ymr0VarM95462c11 instanceof ggr0)) {
                            ig3.m135964a("Comparator should be a method");
                            return null;
                        }
                        ggr0Var = (ggr0) ymr0VarM95462c11;
                    }
                    Collections.sort(listM197503v, new n8s0(ggr0Var, a9x0Var));
                    v8r0Var.m197504w();
                    Iterator<ymr0> it4 = listM197503v.iterator();
                    int i4 = 0;
                    while (it4.hasNext()) {
                        v8r0Var.m197500p(i4, it4.next());
                        i4++;
                    }
                }
                return v8r0Var;
            case 14:
                nhw0.m159470g("every", 1, list);
                ymr0 ymr0VarM95462c12 = a9x0Var.m95462c(list.get(0));
                if (ymr0VarM95462c12 instanceof jor0) {
                    return (v8r0Var.m197497j() == 0 || m144544b(v8r0Var, a9x0Var, (jor0) ymr0VarM95462c12, Boolean.FALSE, Boolean.TRUE).m197497j() == v8r0Var.m197497j()) ? ymr0.f199048B0 : ymr0.f199049C0;
                }
                ig3.m135964a("Callback should be a method");
                return null;
            case 15:
                nhw0.m159470g("shift", 0, list);
                if (v8r0Var.m197497j() == 0) {
                    return ymr0.f199051w0;
                }
                ymr0 ymr0VarM197494g2 = v8r0Var.m197494g(0);
                v8r0Var.m197499o(0);
                return ymr0VarM197494g2;
            case 16:
                nhw0.m159477n("slice", 2, list);
                if (list.isEmpty()) {
                    return v8r0Var.zzc();
                }
                double dM197497j3 = v8r0Var.m197497j();
                double dM159464a = nhw0.m159464a(a9x0Var.m95462c(list.get(0)).zze().doubleValue());
                double dMax = dM159464a < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(dM159464a + dM197497j3, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM159464a, dM197497j3);
                if (list.size() == 2) {
                    double dM159464a2 = nhw0.m159464a(a9x0Var.m95462c(list.get(1)).zze().doubleValue());
                    dM197497j3 = dM159464a2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(dM197497j3 + dM159464a2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM197497j3, dM159464a2);
                }
                v8r0 v8r0Var8 = new v8r0();
                for (int i5 = (int) dMax; i5 < dM197497j3; i5++) {
                    v8r0Var8.m197496i(v8r0Var.m197494g(i5));
                }
                return v8r0Var8;
            case 17:
                return m144546d(v8r0Var, a9x0Var, list, false);
            case 18:
                nhw0.m159470g("reverse", 0, list);
                int iM197497j5 = v8r0Var.m197497j();
                if (iM197497j5 != 0) {
                    int i6 = 0;
                    while (i6 < iM197497j5 / 2) {
                        if (v8r0Var.m197501r(i6)) {
                            ymr0 ymr0VarM197494g3 = v8r0Var.m197494g(i6);
                            v8r0Var.m197500p(i6, ymr0Var);
                            int i7 = (iM197497j5 - 1) - i6;
                            if (v8r0Var.m197501r(i7)) {
                                v8r0Var.m197500p(i6, v8r0Var.m197494g(i7));
                            }
                            v8r0Var.m197500p(i7, ymr0VarM197494g3);
                        }
                        i6++;
                        ymr0Var = null;
                    }
                }
                return v8r0Var;
            case 19:
                nhw0.m159477n("indexOf", 2, list);
                ymr0 ymr0VarM95462c13 = ymr0.f199051w0;
                if (list.isEmpty()) {
                    a9x0Var2 = a9x0Var;
                } else {
                    a9x0Var2 = a9x0Var;
                    ymr0VarM95462c13 = a9x0Var2.m95462c(list.get(0));
                }
                if (list.size() > 1) {
                    double dM159464a3 = nhw0.m159464a(a9x0Var2.m95462c(list.get(1)).zze().doubleValue());
                    if (dM159464a3 >= v8r0Var.m197497j()) {
                        return new acr0(dValueOf);
                    }
                    d = dValueOf;
                    dM197497j = dM159464a3 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? ((double) v8r0Var.m197497j()) + dM159464a3 : dM159464a3;
                } else {
                    d = dValueOf;
                }
                Iterator<Integer> itM197502s6 = v8r0Var.m197502s();
                while (itM197502s6.hasNext()) {
                    int iIntValue2 = itM197502s6.next().intValue();
                    double d2 = iIntValue2;
                    if (d2 >= dM197497j && nhw0.m159471h(v8r0Var.m197494g(iIntValue2), ymr0VarM95462c13)) {
                        return new acr0(Double.valueOf(d2));
                    }
                }
                return new acr0(d);
            default:
                ig3.m135964a("Command not supported");
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static ymr0 m144546d(v8r0 v8r0Var, a9x0 a9x0Var, List<ymr0> list, boolean z) {
        ymr0 ymr0VarMo108642d;
        nhw0.m159474k("reduce", 1, list);
        nhw0.m159477n("reduce", 2, list);
        ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
        if (!(ymr0VarM95462c instanceof ggr0)) {
            ig3.m135964a("Callback should be a method");
            return null;
        }
        if (list.size() == 2) {
            ymr0VarMo108642d = a9x0Var.m95462c(list.get(1));
            if (ymr0VarMo108642d instanceof ldr0) {
                ig3.m135964a("Failed to parse initial value");
                return null;
            }
        } else {
            if (v8r0Var.m197497j() == 0) {
                qkq0.m175383a("Empty array with no initial value error");
                return null;
            }
            ymr0VarMo108642d = null;
        }
        ggr0 ggr0Var = (ggr0) ymr0VarM95462c;
        int iM197497j = v8r0Var.m197497j();
        int i = z ? 0 : iM197497j - 1;
        int i2 = z ? iM197497j - 1 : 0;
        int i3 = z ? 1 : -1;
        if (ymr0VarMo108642d == null) {
            ymr0VarMo108642d = v8r0Var.m197494g(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (v8r0Var.m197501r(i)) {
                ymr0VarMo108642d = ggr0Var.mo108642d(a9x0Var, Arrays.asList(ymr0VarMo108642d, v8r0Var.m197494g(i), new acr0(Double.valueOf(i)), v8r0Var));
                if (ymr0VarMo108642d instanceof ldr0) {
                    qkq0.m175383a("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return ymr0VarMo108642d;
    }
}
