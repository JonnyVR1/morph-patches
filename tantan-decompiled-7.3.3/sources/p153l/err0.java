package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class err0 {

    /* JADX INFO: renamed from: a */
    public final String f95535a;

    /* JADX INFO: renamed from: b */
    public final int f95536b;

    /* JADX INFO: renamed from: c */
    public final String f95537c;

    /* JADX INFO: renamed from: d */
    public final Set f95538d;

    public err0(String str, int i, String str2, Set set) {
        this.f95536b = i;
        this.f95535a = str;
        this.f95537c = str2;
        this.f95538d = set;
    }

    /* JADX INFO: renamed from: a */
    public static err0 m122286a(String str, int i) {
        String str2;
        String strTrim = str.trim();
        lev0.m153956d(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i2 = mpw0.f137957a;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < strArrSplit.length; i3++) {
            hashSet.add(strArrSplit[i3]);
        }
        return new err0(str3, i, str2, hashSet);
    }

    /* JADX INFO: renamed from: b */
    public static err0 m122287b() {
        return new err0("", 0, "", Collections.EMPTY_SET);
    }
}
