package p006l;

import com.p1.mobile.putong.data.DoublePair;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pll0 {

    /* JADX INFO: renamed from: a */
    public static double f19192a = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public static boolean m21591a(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f19192a && Math.abs(doublePair.second - doublePair2.second) < f19192a;
    }
}
