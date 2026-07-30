package p153l;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class zwr0 {

    /* JADX INFO: renamed from: a */
    public long f206370a;

    /* JADX INFO: renamed from: b */
    public final String f206371b;

    /* JADX INFO: renamed from: c */
    public final String f206372c;

    /* JADX INFO: renamed from: d */
    public final long f206373d;

    /* JADX INFO: renamed from: e */
    public final long f206374e;

    /* JADX INFO: renamed from: f */
    public final long f206375f;

    /* JADX INFO: renamed from: g */
    public final long f206376g;

    /* JADX INFO: renamed from: h */
    public final List f206377h;

    /* JADX WARN: Illegal instructions before constructor call */
    public zwr0(String str, kvr0 kvr0Var) {
        String str2 = kvr0Var.f128987b;
        long j = kvr0Var.f128988c;
        long j2 = kvr0Var.f128989d;
        long j3 = kvr0Var.f128990e;
        long j4 = kvr0Var.f128991f;
        List arrayList = kvr0Var.f128993h;
        if (arrayList == null) {
            Map map = kvr0Var.f128992g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new svr0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static zwr0 m221951a(axr0 axr0Var) throws IOException {
        if (cxr0.m113053c(axr0Var) != 538247942) {
            throw new IOException();
        }
        String strM113055f = cxr0.m113055f(axr0Var);
        String strM113055f2 = cxr0.m113055f(axr0Var);
        long jM113054d = cxr0.m113054d(axr0Var);
        long jM113054d2 = cxr0.m113054d(axr0Var);
        long jM113054d3 = cxr0.m113054d(axr0Var);
        long jM113054d4 = cxr0.m113054d(axr0Var);
        int iM113053c = cxr0.m113053c(axr0Var);
        if (iM113053c < 0) {
            p3r0.m170507a("readHeaderList size=", iM113053c);
            return null;
        }
        List arrayList = iM113053c == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iM113053c; i++) {
            arrayList.add(new svr0(cxr0.m113055f(axr0Var).intern(), cxr0.m113055f(axr0Var).intern()));
        }
        return new zwr0(strM113055f, strM113055f2, jM113054d, jM113054d2, jM113054d3, jM113054d4, arrayList);
    }

    public zwr0(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f206371b = str;
        this.f206372c = true == "".equals(str2) ? null : str2;
        this.f206373d = j;
        this.f206374e = j2;
        this.f206375f = j3;
        this.f206376g = j4;
        this.f206377h = list;
    }
}
