package p149l;

import com.p046p1.mobile.putong.data.DoublePair;

/* JADX INFO: loaded from: classes9.dex */
public class pll0 {

    /* JADX INFO: renamed from: a */
    public static double f150150a = 1.0E-4d;

    /* JADX INFO: renamed from: a */
    public static boolean m170238a(DoublePair doublePair, DoublePair doublePair2) {
        if (doublePair == null && doublePair2 == null) {
            return true;
        }
        return doublePair != null && doublePair2 != null && Math.abs(doublePair.first - doublePair2.first) < f150150a && Math.abs(doublePair.second - doublePair2.second) < f150150a;
    }
}
