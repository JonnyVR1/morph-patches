package p153l;

/* JADX INFO: loaded from: classes12.dex */
public class a0f0 {
    /* JADX INFO: renamed from: a */
    public static String m95344a() {
        int iIntValue = uqb0.f180425y.get().intValue();
        Integer numValueOf = Integer.valueOf(iIntValue != -1 ? iIntValue : j9i0.f118884a);
        String strM213913a = y11.m213913a();
        Integer numValueOf2 = Integer.valueOf(iIntValue != -1 ? iIntValue : y11.m213918g());
        String strM213917f = y11.m213917f();
        Integer numValueOf3 = Integer.valueOf(iIntValue != -1 ? iIntValue : y11.m213920i());
        String strM213919h = y11.m213919h();
        Integer numValueOf4 = Integer.valueOf(iIntValue != -1 ? iIntValue : y11.m213922k());
        String strM213921j = y11.m213921j();
        if (iIntValue == -1) {
            iIntValue = y11.m213924m();
        }
        return String.format("inner version:%s_%s_%s_%s_%s_%s_%s_%s_%s_%s_%s", numValueOf, strM213913a, numValueOf2, strM213917f, numValueOf3, strM213919h, numValueOf4, strM213921j, Integer.valueOf(iIntValue), y11.m213923l(), "\nFeedMLNVersion:");
    }
}
