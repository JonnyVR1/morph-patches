package p149l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yje0 extends InputStream {
    public int readLine(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        if (i2 <= 0) {
            return 0;
        }
        while (true) {
            int i4 = read();
            if (i4 == -1) {
                break;
            }
            int i5 = i + 1;
            bArr[i] = (byte) i4;
            i3++;
            if (i4 == 10 || i3 == i2) {
                break;
            }
            i = i5;
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
