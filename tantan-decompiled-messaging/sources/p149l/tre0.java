package p149l;

/* JADX INFO: loaded from: classes9.dex */
public class tre0 {
    /* JADX INFO: renamed from: a */
    public static String m190411a() {
        int iIntValue = qib0.f154742y.get().intValue();
        Integer numValueOf = Integer.valueOf(iIntValue != -1 ? iIntValue : b1i0.f72600a);
        String strM177417a = r11.m177417a();
        Integer numValueOf2 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.m177422g());
        String strM177421f = r11.m177421f();
        Integer numValueOf3 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.m177424i());
        String strM177423h = r11.m177423h();
        Integer numValueOf4 = Integer.valueOf(iIntValue != -1 ? iIntValue : r11.m177426k());
        String strM177425j = r11.m177425j();
        if (iIntValue == -1) {
            iIntValue = r11.m177428m();
        }
        return String.format("inner version:%s_%s_%s_%s_%s_%s_%s_%s_%s_%s_%s", numValueOf, strM177417a, numValueOf2, strM177421f, numValueOf3, strM177423h, numValueOf4, strM177425j, Integer.valueOf(iIntValue), r11.m177427l(), "\nFeedMLNVersion:");
    }
}
