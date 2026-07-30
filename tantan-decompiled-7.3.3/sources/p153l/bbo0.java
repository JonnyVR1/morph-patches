package p153l;

/* JADX INFO: loaded from: classes5.dex */
public class bbo0 {
    /* JADX INFO: renamed from: a */
    public static void m103305a(boolean z, i6t i6tVar) {
        boolean z2 = i6tVar.act().lifecycle_().f16274a;
        if (z || z2) {
            ((uzl) i6tVar.m138856F3(new k210(9000))).mo73050b0();
            xzl xzlVar = (xzl) i6tVar.m138856F3(new r410(9000));
            if (z) {
                xzlVar.mo170530i0(true);
                nsh0.m164608j("[live][voice]", "positive : " + z2 + " ,静音");
                return;
            }
            xzlVar.mo170530i0(false);
            xzlVar.mo170536n(false);
            nsh0.m164608j("[live][voice]", "positive : " + z2 + " ,取消静音");
        }
    }
}
