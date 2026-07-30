package p149l;

import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class tnr0 {

    /* JADX INFO: renamed from: a */
    public long f171270a;

    /* JADX INFO: renamed from: b */
    public final String f171271b;

    /* JADX INFO: renamed from: c */
    public final String f171272c;

    /* JADX INFO: renamed from: d */
    public final long f171273d;

    /* JADX INFO: renamed from: e */
    public final long f171274e;

    /* JADX INFO: renamed from: f */
    public final long f171275f;

    /* JADX INFO: renamed from: g */
    public final long f171276g;

    /* JADX INFO: renamed from: h */
    public final List f171277h;

    /* JADX WARN: Illegal instructions before constructor call */
    public tnr0(String str, emr0 emr0Var) {
        String str2 = emr0Var.f92237b;
        long j = emr0Var.f92238c;
        long j2 = emr0Var.f92239d;
        long j3 = emr0Var.f92240e;
        long j4 = emr0Var.f92241f;
        List arrayList = emr0Var.f92243h;
        if (arrayList == null) {
            Map map = emr0Var.f92242g;
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new mmr0((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(str, str2, j, j2, j3, j4, arrayList);
    }

    /* JADX INFO: renamed from: a */
    public static tnr0 m189823a(unr0 unr0Var) throws IOException {
        if (wnr0.m204767c(unr0Var) != 538247942) {
            throw new IOException();
        }
        String strM204769f = wnr0.m204769f(unr0Var);
        String strM204769f2 = wnr0.m204769f(unr0Var);
        long jM204768d = wnr0.m204768d(unr0Var);
        long jM204768d2 = wnr0.m204768d(unr0Var);
        long jM204768d3 = wnr0.m204768d(unr0Var);
        long jM204768d4 = wnr0.m204768d(unr0Var);
        int iM204767c = wnr0.m204767c(unr0Var);
        if (iM204767c < 0) {
            juq0.m143339a("readHeaderList size=", iM204767c);
            return null;
        }
        List arrayList = iM204767c == 0 ? Collections.EMPTY_LIST : new ArrayList();
        for (int i = 0; i < iM204767c; i++) {
            arrayList.add(new mmr0(wnr0.m204769f(unr0Var).intern(), wnr0.m204769f(unr0Var).intern()));
        }
        return new tnr0(strM204769f, strM204769f2, jM204768d, jM204768d2, jM204768d3, jM204768d4, arrayList);
    }

    public tnr0(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.f171271b = str;
        this.f171272c = true == "".equals(str2) ? null : str2;
        this.f171273d = j;
        this.f171274e = j2;
        this.f171275f = j3;
        this.f171276g = j4;
        this.f171277h = list;
    }
}
