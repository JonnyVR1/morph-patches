package p153l;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
class x0r0 {

    /* JADX INFO: renamed from: a */
    private static final boolean f191934a = Log.isLoggable("BCompressed", 3);

    /* JADX INFO: renamed from: a */
    public static byte[] m208891a(w0r0 w0r0Var, byte[] bArr) {
        try {
            byte[] bArrM95548a = a1r0.C15616a.m95548a(bArr);
            if (f191934a) {
                ouq0.m169394n("BCompressed", "decompress " + bArr.length + " to " + bArrM95548a.length + " for " + w0r0Var);
                if (w0r0Var.f186716e == 1) {
                    ouq0.m169394n("BCompressed", "decompress not support upStream");
                    return bArrM95548a;
                }
            }
            return bArrM95548a;
        } catch (Exception e) {
            ouq0.m169394n("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
