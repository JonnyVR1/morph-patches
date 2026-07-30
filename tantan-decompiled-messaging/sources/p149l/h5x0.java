package p149l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class h5x0 implements j6x0 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f105996d = new g5x0();

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f105997a;

    /* JADX INFO: renamed from: b */
    public final int f105998b;

    /* JADX INFO: renamed from: c */
    public final int f105999c;

    public h5x0(byte[] bArr, int i) throws GeneralSecurityException {
        if (!mvw0.m156606a(2)) {
            j8w0.m140474a("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        o6x0.m162948a(bArr.length);
        this.f105997a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f105996d.get()).getBlockSize();
        this.f105999c = blockSize;
        if (i <= blockSize) {
            this.f105998b = i;
        } else {
            j8w0.m140474a("invalid IV size");
            throw null;
        }
    }

    @Override // p149l.j6x0
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f105998b;
        if (length < i) {
            j8w0.m140474a("ciphertext too short");
            return null;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int i2 = this.f105998b;
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        Cipher cipher = (Cipher) f105996d.get();
        byte[] bArr4 = new byte[this.f105999c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f105998b);
        cipher.init(2, this.f105997a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
            return bArr3;
        }
        j8w0.m140474a("stored output's length does not match input's length");
        return null;
    }
}
