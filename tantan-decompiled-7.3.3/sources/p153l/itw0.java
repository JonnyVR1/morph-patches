package p153l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* JADX INFO: loaded from: classes6.dex */
public final class itw0 {

    /* JADX INFO: renamed from: a */
    public static final OutputStream f116881a = new gtw0();

    /* JADX INFO: renamed from: a */
    public static InputStream m142129a(InputStream inputStream, long j) {
        return new htw0(inputStream, j);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m142130b(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iHighestOneBit = Integer.highestOneBit(0);
        int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
        int i = 0;
        while (i < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i2 = 0;
            while (i2 < iMin2) {
                int i3 = inputStream.read(bArr, i2, iMin2 - i2);
                if (i3 == -1) {
                    return m142131c(arrayDeque, i);
                }
                i2 += i3;
                i += i3;
            }
            iMin = utw0.m198113c(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return m142131c(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m142131c(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        int length = bArr.length;
        if (length == i) {
            return bArr;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i);
        int i2 = i - length;
        while (i2 > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int iMin = Math.min(i2, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i - i2, iMin);
            i2 -= iMin;
        }
        return bArrCopyOf;
    }
}
