package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class k6x0 implements t1x0 {

    /* JADX INFO: renamed from: a */
    public final SecretKey f121508a;

    /* JADX INFO: renamed from: b */
    public final byte[] f121509b;

    /* JADX INFO: renamed from: c */
    public final byte[] f121510c;

    public k6x0(byte[] bArr) throws GeneralSecurityException {
        o6x0.m162948a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f121508a = secretKeySpec;
        Cipher cipherM144640b = m144640b();
        cipherM144640b.init(1, secretKeySpec);
        byte[] bArrM200909a = w0x0.m200909a(cipherM144640b.doFinal(new byte[16]));
        this.f121509b = bArrM200909a;
        this.f121510c = w0x0.m200909a(bArrM200909a);
    }

    /* JADX INFO: renamed from: b */
    public static Cipher m144640b() throws GeneralSecurityException {
        if (mvw0.m156606a(1)) {
            return (Cipher) w5x0.f184787b.m201729a("AES/ECB/NoPadding");
        }
        j8w0.m140474a("Can not use AES-CMAC in FIPS-mode.");
        return null;
    }

    @Override // p149l.t1x0
    /* JADX INFO: renamed from: a */
    public final byte[] mo144641a(byte[] bArr, int i) throws GeneralSecurityException {
        byte[] bArrM153182c;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.f121508a;
        Cipher cipherM144640b = m144640b();
        cipherM144640b.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i2 = iMax - 1;
        int i3 = i2 * 16;
        if (iMax * 16 == length) {
            bArrM153182c = m5x0.m153183d(bArr, i3, this.f121509b, 0, 16);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i3, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                ig3.m135964a("x must be smaller than a block.");
                return null;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            bArrM153182c = m5x0.m153182c(bArrCopyOf, this.f121510c);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i4 = 0; i4 < i2; i4++) {
            bArrDoFinal = cipherM144640b.doFinal(m5x0.m153183d(bArrDoFinal, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(cipherM144640b.doFinal(m5x0.m153182c(bArrM153182c, bArrDoFinal)), i);
    }
}
