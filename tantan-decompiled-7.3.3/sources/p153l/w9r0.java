package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class w9r0 {
    /* JADX INFO: renamed from: a */
    public static byte m205623a(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m205624b(byte b) {
        if (b == 0) {
            return Boolean.FALSE;
        }
        if (b != 1) {
            return null;
        }
        return Boolean.TRUE;
    }
}
