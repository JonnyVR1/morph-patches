package p153l;

import com.p051p1.mobile.putong.data.DoublePair;

/* JADX INFO: loaded from: classes12.dex */
public class tul0 {

    /* JADX INFO: renamed from: a */
    public static double f176198a = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public static boolean m192753a(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f176198a && Math.abs(doublePair.second - doublePair2.second) < f176198a;
    }
}
