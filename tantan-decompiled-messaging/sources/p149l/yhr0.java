package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class yhr0 {

    /* JADX INFO: renamed from: a */
    public final String f198389a;

    /* JADX INFO: renamed from: b */
    public final int f198390b;

    /* JADX INFO: renamed from: c */
    public final String f198391c;

    /* JADX INFO: renamed from: d */
    public final Set f198392d;

    public yhr0(String str, int i, String str2, Set set) {
        this.f198390b = i;
        this.f198389a = str;
        this.f198391c = str2;
        this.f198392d = set;
    }

    /* JADX INFO: renamed from: a */
    public static yhr0 m214841a(String str, int i) {
        String str2;
        String strTrim = str.trim();
        f5v0.m119533d(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i2 = ggw0.f102568a;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i3 = 1; i3 < strArrSplit.length; i3++) {
            hashSet.add(strArrSplit[i3]);
        }
        return new yhr0(str3, i, str2, hashSet);
    }

    /* JADX INFO: renamed from: b */
    public static yhr0 m214842b() {
        return new yhr0("", 0, "", Collections.EMPTY_SET);
    }
}
