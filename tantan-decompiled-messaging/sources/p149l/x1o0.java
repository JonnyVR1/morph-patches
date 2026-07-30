package p149l;

/* JADX INFO: loaded from: classes5.dex */
public class x1o0 {
    /* JADX INFO: renamed from: a */
    public static void m206755a(boolean z, h4t h4tVar) {
        boolean z2 = h4tVar.act().lifecycle_().f15555a;
        if (z || z2) {
            ((bxl) h4tVar.m129297F3(new bu00(9000))).mo71867b0();
            exl exlVar = (exl) h4tVar.m129297F3(new jw00(9000));
            if (z) {
                exlVar.mo118678i0(true);
                gkh0.m126627j("[live][voice]", "positive : " + z2 + " ,静音");
                return;
            }
            exlVar.mo118678i0(false);
            exlVar.mo118679n(false);
            gkh0.m126627j("[live][voice]", "positive : " + z2 + " ,取消静音");
        }
    }
}
