package p153l;

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
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes6.dex */
public final class vyr0 implements ewr0, Iterable<ewr0> {

    /* JADX INFO: renamed from: a */
    public final String f186420a;

    public vyr0(String str) {
        if (str != null) {
            this.f186420a = str;
        } else {
            wg3.m206174a("StringValue cannot be null.");
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0176 A[PHI: r4 r8
      0x0176: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:109:0x0174, B:105:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x0176: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v3 java.lang.String) binds: [B:109:0x0174, B:105:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ewr0
    /* JADX INFO: renamed from: c */
    public final ewr0 mo100514c(String str, gix0 gix0Var, List<ewr0> list) {
        String str2;
        String str3;
        String str4;
        int i;
        vyr0 vyr0Var;
        int i2;
        boolean zIsEmpty;
        int i3;
        gix0 gix0Var2;
        String strZzf;
        String str5 = "toLocaleLowerCase";
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || FirebaseAnalytics.Event.SEARCH.equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "trim";
        } else {
            str2 = "trim";
            if (!str2.equals(str)) {
                gzi0.m133102a("%s is not a String function", new Object[]{str});
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
                tqw0.m192373g("hasOwnProperty", 1, list);
                String str6 = this.f186420a;
                ewr0 ewr0VarM130395c = gix0Var.m130395c(list.get(0));
                if ("length".equals(ewr0VarM130395c.zzf())) {
                    return ewr0.f96184B0;
                }
                double dDoubleValue2 = ewr0VarM130395c.zze().doubleValue();
                return (dDoubleValue2 != Math.floor(dDoubleValue2) || (i = (int) dDoubleValue2) < 0 || i >= str6.length()) ? ewr0.f96185C0 : ewr0.f96184B0;
            case 1:
                tqw0.m192373g(str4, 0, list);
                return this;
            case 2:
                tqw0.m192373g(str5, 0, list);
                return new vyr0(this.f186420a.toLowerCase());
            case 3:
                tqw0.m192380n(str3, 1, list);
                int iM192367a = !list.isEmpty() ? (int) tqw0.m192367a(gix0Var.m130395c(list.get(0)).zze().doubleValue()) : 0;
                String str7 = this.f186420a;
                return (iM192367a < 0 || iM192367a >= str7.length()) ? ewr0.f96186D0 : new vyr0(String.valueOf(str7.charAt(iM192367a)));
            case 4:
                vyr0Var = this;
                if (!list.isEmpty()) {
                    StringBuilder sb = new StringBuilder(vyr0Var.f186420a);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(gix0Var.m130395c(list.get(i4)).zzf());
                    }
                    return new vyr0(sb.toString());
                }
                return vyr0Var;
            case 5:
                tqw0.m192373g("toLowerCase", 0, list);
                return new vyr0(this.f186420a.toLowerCase(Locale.ENGLISH));
            case 6:
                tqw0.m192380n(FirebaseAnalytics.Event.SEARCH, 1, list);
                Matcher matcher = Pattern.compile(!list.isEmpty() ? gix0Var.m130395c(list.get(0)).zzf() : ewr0.f96187w0.zzf()).matcher(this.f186420a);
                return matcher.find() ? new glr0(Double.valueOf(matcher.start())) : new glr0(Double.valueOf(-1.0d));
            case 7:
                tqw0.m192373g("toLocaleUpperCase", 0, list);
                return new vyr0(this.f186420a.toUpperCase());
            case 8:
                tqw0.m192380n("lastIndexOf", 2, list);
                String str8 = this.f186420a;
                String strZzf2 = list.size() <= 0 ? ewr0.f96187w0.zzf() : gix0Var.m130395c(list.get(0)).zzf();
                double dDoubleValue3 = list.size() < 2 ? Double.NaN : gix0Var.m130395c(list.get(1)).zze().doubleValue();
                return new glr0(Double.valueOf(str8.lastIndexOf(strZzf2, (int) (Double.isNaN(dDoubleValue3) ? Double.POSITIVE_INFINITY : tqw0.m192367a(dDoubleValue3)))));
            case 9:
                tqw0.m192373g("toUpperCase", 0, list);
                return new vyr0(this.f186420a.toUpperCase(Locale.ENGLISH));
            case 10:
                tqw0.m192373g("toUpperCase", 0, list);
                return new vyr0(this.f186420a.trim());
            case 11:
                tqw0.m192380n("match", 1, list);
                Matcher matcher2 = Pattern.compile(list.size() <= 0 ? "" : gix0Var.m130395c(list.get(0)).zzf()).matcher(this.f186420a);
                return matcher2.find() ? new bir0(new vyr0(matcher2.group())) : ewr0.f96188x0;
            case 12:
                tqw0.m192380n("slice", 2, list);
                String str9 = this.f186420a;
                double dM192367a = tqw0.m192367a(!list.isEmpty() ? gix0Var.m130395c(list.get(0)).zze().doubleValue() : 0.0d);
                int iMax = (int) (dM192367a < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(((double) str9.length()) + dM192367a, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM192367a, str9.length()));
                double dM192367a2 = tqw0.m192367a(list.size() > 1 ? gix0Var.m130395c(list.get(1)).zze().doubleValue() : str9.length());
                return new vyr0(str9.substring(iMax, Math.max(0, ((int) (dM192367a2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? Math.max(((double) str9.length()) + dM192367a2, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) : Math.min(dM192367a2, str9.length()))) - iMax) + iMax));
            case 13:
                tqw0.m192380n("split", 2, list);
                String str10 = this.f186420a;
                if (str10.length() == 0) {
                    return new bir0(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.isEmpty()) {
                    arrayList.add(this);
                } else {
                    String strZzf3 = gix0Var.m130395c(list.get(0)).zzf();
                    long jM192379m = list.size() > 1 ? tqw0.m192379m(gix0Var.m130395c(list.get(1)).zze().doubleValue()) : 2147483647L;
                    if (jM192379m == 0) {
                        return new bir0();
                    }
                    String[] strArrSplit = str10.split(Pattern.quote(strZzf3), ((int) jM192379m) + 1);
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
                    if (strArrSplit.length > jM192379m) {
                        length--;
                    }
                    while (i2 < length) {
                        arrayList.add(new vyr0(strArrSplit[i2]));
                        i2++;
                    }
                }
                return new bir0(arrayList);
            case 14:
                tqw0.m192380n("substring", 2, list);
                String str11 = this.f186420a;
                int iM192367a2 = !list.isEmpty() ? (int) tqw0.m192367a(gix0Var.m130395c(list.get(0)).zze().doubleValue()) : 0;
                int iM192367a3 = list.size() > 1 ? (int) tqw0.m192367a(gix0Var.m130395c(list.get(1)).zze().doubleValue()) : str11.length();
                int iMin = Math.min(Math.max(iM192367a2, 0), str11.length());
                int iMin2 = Math.min(Math.max(iM192367a3, 0), str11.length());
                return new vyr0(str11.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
            case 15:
                vyr0Var = this;
                tqw0.m192380n("replace", 2, list);
                ewr0 ewr0VarMo107102d = ewr0.f96187w0;
                String strZzf4 = ewr0VarMo107102d.zzf();
                if (!list.isEmpty()) {
                    strZzf4 = gix0Var.m130395c(list.get(0)).zzf();
                    if (list.size() > 1) {
                        ewr0VarMo107102d = gix0Var.m130395c(list.get(1));
                    }
                }
                String str12 = vyr0Var.f186420a;
                int iIndexOf = str12.indexOf(strZzf4);
                if (iIndexOf >= 0) {
                    if (ewr0VarMo107102d instanceof mpr0) {
                        i3 = 0;
                        ewr0VarMo107102d = ((mpr0) ewr0VarMo107102d).mo107102d(gix0Var, Arrays.asList(new vyr0(strZzf4), new glr0(Double.valueOf(iIndexOf)), vyr0Var));
                    } else {
                        i3 = 0;
                    }
                    return new vyr0(str12.substring(i3, iIndexOf) + ewr0VarMo107102d.zzf() + str12.substring(iIndexOf + strZzf4.length()));
                }
                return vyr0Var;
            case 16:
                tqw0.m192380n("indexOf", 2, list);
                String str13 = this.f186420a;
                if (list.size() <= 0) {
                    strZzf = ewr0.f96187w0.zzf();
                    gix0Var2 = gix0Var;
                } else {
                    gix0Var2 = gix0Var;
                    strZzf = gix0Var2.m130395c(list.get(0)).zzf();
                }
                if (list.size() >= 2) {
                    dDoubleValue = gix0Var2.m130395c(list.get(1)).zze().doubleValue();
                }
                return new glr0(Double.valueOf(str13.indexOf(strZzf, (int) tqw0.m192367a(dDoubleValue))));
            default:
                wg3.m206174a("Command not supported");
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vyr0) {
            return this.f186420a.equals(((vyr0) obj).f186420a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f186420a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<ewr0> iterator() {
        return new y0s0(this);
    }

    public final String toString() {
        return "\"" + this.f186420a + "\"";
    }

    @Override // p153l.ewr0
    public final ewr0 zzc() {
        return new vyr0(this.f186420a);
    }

    @Override // p153l.ewr0
    public final Boolean zzd() {
        return Boolean.valueOf(!this.f186420a.isEmpty());
    }

    @Override // p153l.ewr0
    public final Double zze() {
        if (this.f186420a.isEmpty()) {
            return Double.valueOf(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
        }
        try {
            return Double.valueOf(this.f186420a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // p153l.ewr0
    public final String zzf() {
        return this.f186420a;
    }

    @Override // p153l.ewr0
    public final Iterator<ewr0> zzh() {
        return new h2s0(this);
    }
}
