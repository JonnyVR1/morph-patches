package p149l;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
public final class r6r0 {
    /* JADX INFO: renamed from: a */
    public static int m178086a(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* JADX INFO: renamed from: b */
    public static int m178087b(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((m178092g(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: c */
    public static int m178088c(ByteBuffer byteBuffer) {
        return (int) ((m178092g(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: d */
    public static long m178089d(byte[] bArr) {
        return m178092g(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* JADX INFO: renamed from: e */
    public static List m178090e(byte[] bArr) {
        long jM178086a = m178086a(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m178094i(m178093h(jM178086a)));
        arrayList.add(m178094i(m178093h(3840L)));
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m178091f(long j, long j2) {
        return j - j2 <= m178093h(3840L) / 1000;
    }

    /* JADX INFO: renamed from: g */
    public static long m178092g(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? HuiYanResultSender.TIMEOUT_MS : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    /* JADX INFO: renamed from: h */
    public static long m178093h(long j) {
        return (j * 1000000000) / 48000;
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m178094i(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
