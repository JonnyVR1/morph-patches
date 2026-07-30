package p149l;

import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class w0x0 {
    /* JADX INFO: renamed from: a */
    public static byte[] m200909a(byte[] bArr) {
        if (bArr.length != 16) {
            ig3.m135964a("value must be a block.");
            return null;
        }
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            byte b = bArr[i];
            byte b2 = (byte) ((b + b) & 254);
            bArr2[i] = b2;
            if (i < 15) {
                bArr2[i] = (byte) (((bArr[i2] >> 7) & 1) | b2);
            }
            i = i2;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA)) ^ bArr2[15]);
        return bArr2;
    }
}
