package p153l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes6.dex */
public final class sfx0 implements zax0 {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f167778a;

    /* JADX INFO: renamed from: b */
    public final String f167779b;

    /* JADX INFO: renamed from: c */
    public final Key f167780c;

    /* JADX INFO: renamed from: d */
    public final int f167781d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public sfx0(String str, Key key) throws GeneralSecurityException {
        int i;
        rfx0 rfx0Var = new rfx0(this);
        this.f167778a = rfx0Var;
        if (!s4x0.m184598a(2)) {
            phw0.m172339a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f167779b = str;
        this.f167780c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i = 20;
                    this.f167781d = i;
                    rfx0Var.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i = 28;
                    this.f167781d = i;
                    rfx0Var.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 32;
                    this.f167781d = i;
                    rfx0Var.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 48;
                    this.f167781d = i;
                    rfx0Var.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 64;
                    this.f167781d = i;
                    rfx0Var.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // p153l.zax0
    /* JADX INFO: renamed from: a */
    public final byte[] mo176427a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.f167781d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f167778a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f167778a.get()).doFinal(), i);
    }
}
