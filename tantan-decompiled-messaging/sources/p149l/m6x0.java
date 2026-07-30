package p149l;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes6.dex */
public final class m6x0 implements t1x0 {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f131774a;

    /* JADX INFO: renamed from: b */
    public final String f131775b;

    /* JADX INFO: renamed from: c */
    public final Key f131776c;

    /* JADX INFO: renamed from: d */
    public final int f131777d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public m6x0(String str, Key key) throws GeneralSecurityException {
        int i;
        l6x0 l6x0Var = new l6x0(this);
        this.f131774a = l6x0Var;
        if (!mvw0.m156606a(2)) {
            j8w0.m140474a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
        this.f131775b = str;
        this.f131776c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i = 20;
                    this.f131777d = i;
                    l6x0Var.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i = 28;
                    this.f131777d = i;
                    l6x0Var.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 32;
                    this.f131777d = i;
                    l6x0Var.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 48;
                    this.f131777d = i;
                    l6x0Var.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 64;
                    this.f131777d = i;
                    l6x0Var.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // p149l.t1x0
    /* JADX INFO: renamed from: a */
    public final byte[] mo144641a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.f131777d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f131774a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f131774a.get()).doFinal(), i);
    }
}
