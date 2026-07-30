package p153l;

import java.io.IOException;
import okio.ByteString;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes2.dex */
public final class cml {

    /* JADX INFO: renamed from: a */
    public static final ByteString f82622a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b */
    public static final String[] f82623b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c */
    public static final String[] f82624c = new String[64];

    /* JADX INFO: renamed from: d */
    public static final String[] f82625d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f82625d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = zlk0.m220255q("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f82624c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = strArr2[i3] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = f82624c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f82624c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f82625d[i];
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m111282a(byte b, byte b2) {
        if (b2 == 0) {
            return "";
        }
        if (b != 2 && b != 3) {
            if (b == 4 || b == 6) {
                return b2 == 1 ? "ACK" : f82625d[b2];
            }
            if (b != 7 && b != 8) {
                String[] strArr = f82624c;
                String str = b2 < strArr.length ? strArr[b2] : f82625d[b2];
                if (b != 5 || (b2 & 4) == 0) {
                    return (b != 0 || (b2 & HttpTokens.SPACE) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
                }
                return str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return f82625d[b2];
    }

    /* JADX INFO: renamed from: b */
    public static String m111283b(boolean z, int i, int i2, byte b, byte b2) {
        String[] strArr = f82623b;
        return zlk0.m220255q("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), b < strArr.length ? strArr[b] : zlk0.m220255q("0x%02x", Byte.valueOf(b)), m111282a(b, b2));
    }

    /* JADX INFO: renamed from: c */
    public static IllegalArgumentException m111284c(String str, Object... objArr) {
        throw new IllegalArgumentException(zlk0.m220255q(str, objArr));
    }

    /* JADX INFO: renamed from: d */
    public static IOException m111285d(String str, Object... objArr) throws IOException {
        throw new IOException(zlk0.m220255q(str, objArr));
    }
}
