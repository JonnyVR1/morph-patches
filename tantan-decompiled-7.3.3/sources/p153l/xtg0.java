package p153l;

import java.io.DataInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class xtg0 {
    /* JADX INFO: renamed from: a */
    public static long m213079a(DataInputStream dataInputStream) {
        long unsignedByte = 0;
        for (int i = 0; i < 4; i++) {
            unsignedByte |= ((long) dataInputStream.readUnsignedByte()) << (i * 8);
        }
        return unsignedByte;
    }

    /* JADX INFO: renamed from: b */
    public static void m213080b(byte[] bArr, long j, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) (255 & j);
            j >>= 8;
        }
    }
}
