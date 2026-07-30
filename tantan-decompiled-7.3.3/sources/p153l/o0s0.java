package p153l;

import android.util.Base64;

/* JADX INFO: loaded from: classes6.dex */
public final class o0s0 {
    /* JADX INFO: renamed from: a */
    public static String m165547a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m165548b(String str, boolean z) throws IllegalArgumentException {
        byte[] bArrDecode = Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        wg3.m206174a("Unable to decode ".concat(str));
        return null;
    }
}
