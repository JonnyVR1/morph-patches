package p149l;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
class rrq0 {

    /* JADX INFO: renamed from: a */
    private static final boolean f160771a = Log.isLoggable("BCompressed", 3);

    /* JADX INFO: renamed from: a */
    public static byte[] m180567a(qrq0 qrq0Var, byte[] bArr) {
        try {
            byte[] bArrM195115a = urq0.C20491a.m195115a(bArr);
            if (f160771a) {
                ilq0.m137041n("BCompressed", "decompress " + bArr.length + " to " + bArrM195115a.length + " for " + qrq0Var);
                if (qrq0Var.f156032e == 1) {
                    ilq0.m137041n("BCompressed", "decompress not support upStream");
                    return bArrM195115a;
                }
            }
            return bArrM195115a;
        } catch (Exception e) {
            ilq0.m137041n("BCompressed", "decompress error " + e);
            return bArr;
        }
    }
}
