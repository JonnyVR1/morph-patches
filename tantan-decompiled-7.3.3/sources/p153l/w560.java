package p153l;

import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import okio.Utf8;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class w560 {
    /* JADX INFO: renamed from: a */
    public static List<byte[]> m204959a(byte[] bArr) {
        long jM204968j = m204968j(m204964f(bArr));
        long jM204968j2 = m204968j(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m204960b(jM204968j));
        arrayList.add(m204960b(jM204968j2));
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m204960b(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    /* JADX INFO: renamed from: c */
    public static int m204961c(byte[] bArr) {
        return bArr[9] & 255;
    }

    /* JADX INFO: renamed from: d */
    public static long m204962d(byte b, byte b2) {
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

    /* JADX INFO: renamed from: e */
    public static long m204963e(byte[] bArr) {
        return m204962d(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* JADX INFO: renamed from: f */
    public static int m204964f(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    /* JADX INFO: renamed from: g */
    public static int m204965g(ByteBuffer byteBuffer) {
        int iM204966h = m204966h(byteBuffer);
        int i = byteBuffer.get(iM204966h + 26) + 27 + iM204966h;
        return (int) ((m204962d(byteBuffer.get(i), byteBuffer.limit() - i > 1 ? byteBuffer.get(i + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: h */
    public static int m204966h(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        int i = 28;
        int i2 = 28;
        for (int i3 = 0; i3 < b; i3++) {
            i2 += byteBuffer.get(i3 + 27);
        }
        byte b2 = byteBuffer.get(i2 + 26);
        for (int i4 = 0; i4 < b2; i4++) {
            i += byteBuffer.get(i2 + 27 + i4);
        }
        return i2 + i;
    }

    /* JADX INFO: renamed from: i */
    public static int m204967i(ByteBuffer byteBuffer) {
        return (int) ((m204962d(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: j */
    public static long m204968j(long j) {
        return (j * 1000000000) / 48000;
    }
}
