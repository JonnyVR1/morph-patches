package p006l;

import l.r11;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class tre0 {
    /* JADX INFO: renamed from: a */
    public static String m24808a() {
        int iIntValue = ((Integer) qib0.f19833y.get()).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue != -1 ? iIntValue : b1i0.f8659a);
        String strA = r11.a();
        Integer numValueOf2 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.g());
        String strF = r11.f();
        Integer numValueOf3 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.i());
        String strH = r11.h();
        Integer numValueOf4 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.k());
        String strJ = r11.j();
        if (iIntValue == -1) {
            iIntValue = r11.m();
        }
        return String.format("inner version:%s_%s_%s_%s_%s_%s_%s_%s_%s_%s_%s", numValueOf, strA, numValueOf2, strF, numValueOf3, strH, numValueOf4, strJ, Integer.valueOf(iIntValue), r11.l(), "\nFeedMLNVersion:");
    }
}
