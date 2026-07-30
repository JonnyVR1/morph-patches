package p149l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class ppr0 implements ymr0, Iterable<ymr0> {

    /* JADX INFO: renamed from: a */
    public final String f150679a;

    public ppr0(String str) {
        if (str != null) {
            this.f150679a = str;
        } else {
            ig3.m135964a("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0176 A[PHI: r4 r8
      0x0176: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:109:0x0174, B:105:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:109:0x0174, B:105:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.ymr0
    /* JADX INFO: renamed from: c */
    public final ymr0 mo95833c(String str, a9x0 a9x0Var, List<ymr0> list) {
        String str2;
        String str3;
        String str4;
        int i;
        ppr0 ppr0Var;
        int i2;
        boolean zIsEmpty;
        int i3;
        a9x0 a9x0Var2;
        String strZzf;
        String str5 = "toLocaleLowerCase";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                dqi0.m113073a("%s is not a String function", new Object[]{str});
                return null;
            }
        }
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1789698943:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals("hasOwnProperty")) {
                    str5 = "toLocaleLowerCase";
                    b = 0;
                } else {
                    str5 = "toLocaleLowerCase";
                }
                break;
            case -1776922004:
                str3 = "charAt";
                str4 = "toString";
                if (str.equals(str4)) {
                    str5 = "toLocaleLowerCase";
                    b = 1;
                } else {
                    str5 = "toLocaleLowerCase";
                }
                break;
            case -1464939364:
                str3 = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    str5 = "toLocaleLowerCase";
                    str4 = "toString";
                    b = 2;
                } else {
                    str4 = "toString";
                }
                break;
            case -1361633751:
                str3 = "charAt";
                if (str.equals(str3)) {
                    b = 3;
                }
                str4 = "toString";
                break;
            case -1354795244:
                if (str.equals("concat")) {
                    b = 4;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    b = 5;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -906336856:
                if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                    b = 6;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    b = 7;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b = 8;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case -399551817:
                if (str.equals("toUpperCase")) {
                    b = 9;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 3568674:
                if (str.equals(str2)) {
                    b = 10;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 103668165:
                if (str.equals("match")) {
                    b = 11;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b = 12;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 109648666:
                if (str.equals("split")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 530542161:
                if (str.equals("substring")) {
                    b = 14;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1094496948:
                if (str.equals("replace")) {
                    b = 15;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                str3 = "charAt";
                str4 = "toString";
                break;
            default:
                str3 = "charAt";
                str4 = "toString";
                break;
        }
        double dDoubleValue = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        switch (b) {
            case 0:
                nhw0.m159470g("hasOwnProperty", 1, list);
                String str6 = this.f150679a;
                ymr0 ymr0VarM95462c = a9x0Var.m95462c(list.get(0));
                if ("length".equals(ymr0VarM95462c.zzf())) {
                    return ymr0.f199048B0;
                }
                double dDoubleValue2 = ymr0VarM95462c.zze().doubleValue();
                return (dDoubleValue2 != Math.floor(dDoubleValue2) || (i = (int) dDoubleValue2) < 0 || i >= str6.length()) ? ymr0.f199049C0 : ymr0.f199048B0;
            case 1:
                nhw0.m159470g(str4, 0, list);
                return this;
            case 2:
                nhw0.m159470g(str5, 0, list);
                return new ppr0(this.f150679a.toLowerCase());
            case 3:
                nhw0.m159477n(str3, 1, list);
                int iM159464a = !list.isEmpty() ? (int) nhw0.m159464a(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) : 0;
                String str7 = this.f150679a;
                return (iM159464a < 0 || iM159464a >= str7.length()) ? ymr0.f199050D0 : new ppr0(String.valueOf(str7.charAt(iM159464a)));
            case 4:
                ppr0Var = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(ppr0Var.f150679a);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(a9x0Var.m95462c(list.get(i4)).zzf());
                    }
                    return new ppr0(sb.toString());
                }
                return ppr0Var;
            case 5:
                nhw0.m159470g("toLowerCase", 0, list);
                return new ppr0(this.f150679a.toLowerCase(Locale.ENGLISH));
            case 6:
                nhw0.m159477n(FirebaseAnalytics.Event.SEARCH, 1, list);
                Matcher matcher = Pattern.compile(!list.isEmpty() ? a9x0Var.m95462c(list.get(0)).zzf() : ymr0.f199051w0.zzf()).matcher(this.f150679a);
                return matcher.find() ? new acr0(Double.valueOf(matcher.start())) : new acr0(Double.valueOf(-1.0d));
            case 7:
                nhw0.m159470g("toLocaleUpperCase", 0, list);
                return new ppr0(this.f150679a.toUpperCase());
            case 8:
                nhw0.m159477n("lastIndexOf", 2, list);
                String str8 = this.f150679a;
                String strZzf2 = list.size() <= 0 ? ymr0.f199051w0.zzf() : a9x0Var.m95462c(list.get(0)).zzf();
                double dDoubleValue3 = list.size() < 2 ? Double.NaN : a9x0Var.m95462c(list.get(1)).zze().doubleValue();
                return new acr0(Double.valueOf(str8.lastIndexOf(strZzf2, (int) (Double.isNaN(dDoubleValue3) ? Double.POSITIVE_INFINITY : nhw0.m159464a(dDoubleValue3)))));
            case 9:
                nhw0.m159470g("toUpperCase", 0, list);
                return new ppr0(this.f150679a.toUpperCase(Locale.ENGLISH));
            case 10:
                nhw0.m159470g("toUpperCase", 0, list);
                return new ppr0(this.f150679a.trim());
            case 11:
                nhw0.m159477n("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : a9x0Var.m95462c(list.get(0)).zzf()).matcher(this.f150679a);
                return matcher2.find() ? new v8r0(new ppr0(matcher2.group())) : ymr0.f199052x0;
            case 12:
                nhw0.m159477n("slice", 2, list);
                String str9 = this.f150679a;
                double dM159464a = nhw0.m159464a(!list.isEmpty() ? a9x0Var.m95462c(list.get(0)).zze().doubleValue() : 0.0d);
                int iMax = (int) (dM159464a < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(((double) str9.length()) + dM159464a, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM159464a, str9.length()));
                double dM159464a2 = nhw0.m159464a(list.size() > 1 ? a9x0Var.m95462c(list.get(1)).zze().doubleValue() : str9.length());
                return new ppr0(str9.substring(iMax, Math.max(0, ((int) (dM159464a2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(((double) str9.length()) + dM159464a2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM159464a2, str9.length()))) - iMax) + iMax));
            case 13:
                nhw0.m159477n("split", 2, list);
                String str10 = this.f150679a;
                if (str10.length() == 0) {
                    return new v8r0(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzf3 = a9x0Var.m95462c(list.get(0)).zzf();
                    long jM159476m = list.size() > 1 ? nhw0.m159476m(a9x0Var.m95462c(list.get(1)).zze().doubleValue()) : 2147483647L;
                    if (jM159476m == 0) {
                        return new v8r0();
                    }
                    String[] strArrSplit = str10.split(Pattern.quote(strZzf3), ((int) jM159476m) + 1);
                    int length = strArrSplit.length;
                    if (!strZzf3.isEmpty() || strArrSplit.length <= 0) {
                        i2 = 0;
                    } else {
                        zIsEmpty = strArrSplit[0].isEmpty();
                        if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                            i2 = zIsEmpty;
                            length = strArrSplit.length - 1;
                            i2 = zIsEmpty;
                        }
                    }
                    i2 = zIsEmpty;
                    if (strArrSplit.length > jM159476m) {
                        length--;
                    }
                    while (i2 < length) {
                        arrayList.add(new ppr0(strArrSplit[i2]));
                        i2++;
                    }
                }
                return new v8r0(arrayList);
            case 14:
                nhw0.m159477n("substring", 2, list);
                String str11 = this.f150679a;
                int iM159464a2 = !list.isEmpty() ? (int) nhw0.m159464a(a9x0Var.m95462c(list.get(0)).zze().doubleValue()) : 0;
                int iM159464a3 = list.size() > 1 ? (int) nhw0.m159464a(a9x0Var.m95462c(list.get(1)).zze().doubleValue()) : str11.length();
                int iMin = Math.min(Math.max(iM159464a2, 0), str11.length());
                int iMin2 = Math.min(Math.max(iM159464a3, 0), str11.length());
                return new ppr0(str11.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                ppr0Var = this;
                nhw0.m159477n("replace", 2, list);
                ymr0 ymr0VarMo108642d = ymr0.f199051w0;
                String strZzf4 = ymr0VarMo108642d.zzf();
                if (!list.isEmpty()) {
                    strZzf4 = a9x0Var.m95462c(list.get(0)).zzf();
                    if (list.size() > 1) {
                        ymr0VarMo108642d = a9x0Var.m95462c(list.get(1));
                    }
                }
                String str12 = ppr0Var.f150679a;
                int iIndexOf = str12.indexOf(strZzf4);
                if (iIndexOf >= 0) {
                    if (ymr0VarMo108642d instanceof ggr0) {
                        i3 = 0;
                        ymr0VarMo108642d = ((ggr0) ymr0VarMo108642d).mo108642d(a9x0Var, Arrays.asList(new ppr0(strZzf4), new acr0(Double.valueOf(iIndexOf)), ppr0Var));
                    } else {
                        i3 = 0;
                    }
                    return new ppr0(str12.substring(i3, iIndexOf) + ymr0VarMo108642d.zzf() + str12.substring(iIndexOf + strZzf4.length()));
                }
                return ppr0Var;
            case 16:
                nhw0.m159477n("indexOf", 2, list);
                String str13 = this.f150679a;
                if (list.size() <= 0) {
                    strZzf = ymr0.f199051w0.zzf();
                    a9x0Var2 = a9x0Var;
                } else {
                    a9x0Var2 = a9x0Var;
                    strZzf = a9x0Var2.m95462c(list.get(0)).zzf();
                }
                if (list.size() >= 2) {
                    dDoubleValue = a9x0Var2.m95462c(list.get(1)).zze().doubleValue();
                }
                return new acr0(Double.valueOf(str13.indexOf(strZzf, (int) nhw0.m159464a(dDoubleValue))));
            default:
                ig3.m135964a("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ppr0) {
            return this.f150679a.equals(((ppr0) obj).f150679a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f150679a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<ymr0> iterator() {
        return new srr0(this);
    }

    public final String toString() {
        return "\"" + this.f150679a + "\"";
    }

    @Override // p149l.ymr0
    public final ymr0 zzc() {
        return new ppr0(this.f150679a);
    }

    @Override // p149l.ymr0
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f150679a.isEmpty());
    }

    @Override // p149l.ymr0
    public final Double zze() {
        if (this.f150679a.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(this.f150679a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // p149l.ymr0
    public final String zzf() {
        return this.f150679a;
    }

    @Override // p149l.ymr0
    public final Iterator<ymr0> zzh() {
        return new btr0(this);
    }
}
