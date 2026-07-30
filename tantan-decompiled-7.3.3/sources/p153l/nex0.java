package p153l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes6.dex */
public final class nex0 implements pfx0 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f141694d = new mex0();

    /* JADX INFO: renamed from: a */
    public final SecretKeySpec f141695a;

    /* JADX INFO: renamed from: b */
    public final int f141696b;

    /* JADX INFO: renamed from: c */
    public final int f141697c;

    public nex0(byte[] bArr, int i) throws GeneralSecurityException {
        if (!s4x0.m184598a(2)) {
            phw0.m172339a("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        ufx0.m195878a(bArr.length);
        this.f141695a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f141694d.get()).getBlockSize();
        this.f141697c = blockSize;
        if (i <= blockSize) {
            this.f141696b = i;
        } else {
            phw0.m172339a("invalid IV size");
            throw null;
        }
    }

    @Override // p153l.pfx0
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f141696b;
        if (length < i) {
            phw0.m172339a("ciphertext too short");
            return null;
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        int i2 = this.f141696b;
        int i3 = length - i2;
        byte[] bArr3 = new byte[i3];
        Cipher cipher = (Cipher) f141694d.get();
        byte[] bArr4 = new byte[this.f141697c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f141696b);
        cipher.init(2, this.f141695a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
            return bArr3;
        }
        phw0.m172339a("stored output's length does not match input's length");
        return null;
    }
}
