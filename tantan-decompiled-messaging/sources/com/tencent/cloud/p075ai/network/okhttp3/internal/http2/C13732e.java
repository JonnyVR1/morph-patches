package com.tencent.cloud.p075ai.network.okhttp3.internal.http2;

import com.tencent.cloud.p075ai.network.okhttp3.internal.C13706c;
import com.tencent.cloud.p075ai.network.okio.ByteString;
import java.io.IOException;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okhttp3.internal.http2.e */
/* JADX INFO: loaded from: classes13.dex */
public final class C13732e {

    /* JADX INFO: renamed from: a */
    public static final ByteString f56649a = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b */
    public static final String[] f56650b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c */
    public static final String[] f56651c = new String[64];

    /* JADX INFO: renamed from: d */
    public static final String[] f56652d = new String[256];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = f56652d;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = C13706c.m81605a("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = f56651c;
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
            String[] strArr3 = f56651c;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            strArr3[i7 | 8] = strArr3[i6] + '|' + strArr3[i5] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f56651c;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = f56652d[i];
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX INFO: renamed from: a */
    public static String m81732a(boolean z, int i, int i2, byte b, byte b2) {
        String strReplace;
        String[] strArr = f56650b;
        String strM81605a = b < strArr.length ? strArr[b] : C13706c.m81605a("0x%02x", Byte.valueOf(b));
        if (b2 == 0) {
            strReplace = "";
        } else if (b == 2 || b == 3) {
            strReplace = f56652d[b2];
        } else if (b == 4 || b == 6) {
            strReplace = b2 == 1 ? "ACK" : f56652d[b2];
        } else if (b == 7 || b == 8) {
            strReplace = f56652d[b2];
        } else {
            String[] strArr2 = f56651c;
            String str = b2 < strArr2.length ? strArr2[b2] : f56652d[b2];
            if (b != 5 || (b2 & 4) == 0) {
                strReplace = (b != 0 || (b2 & HttpTokens.SPACE) == 0) ? str : str.replace("PRIORITY", "COMPRESSED");
            } else {
                strReplace = str.replace("HEADERS", "PUSH_PROMISE");
            }
        }
        return C13706c.m81605a("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM81605a, strReplace);
    }

    /* JADX INFO: renamed from: b */
    public static IOException m81733b(String str, Object... objArr) throws IOException {
        throw new IOException(C13706c.m81605a(str, objArr));
    }

    /* JADX INFO: renamed from: a */
    public static IllegalArgumentException m81731a(String str, Object... objArr) {
        throw new IllegalArgumentException(C13706c.m81605a(str, objArr));
    }
}
