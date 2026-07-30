package p153l;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class iyw0 implements jww0 {

    /* JADX INFO: renamed from: a */
    public final sxw0 f117645a;

    /* JADX INFO: renamed from: b */
    public final oax0 f117646b;

    /* JADX INFO: renamed from: c */
    public final oax0 f117647c;

    public /* synthetic */ iyw0(sxw0 sxw0Var, hyw0 hyw0Var) {
        oax0 oax0VarMo96347a;
        this.f117645a = sxw0Var;
        if (sxw0Var.m188526f()) {
            pax0 pax0VarM102799b = b6x0.m102798a().m102799b();
            yax0 yax0VarM194632a = u5x0.m194632a(sxw0Var);
            this.f117646b = pax0VarM102799b.mo96347a(yax0VarM194632a, "aead", "encrypt");
            oax0VarMo96347a = pax0VarM102799b.mo96347a(yax0VarM194632a, "aead", "decrypt");
        } else {
            oax0VarMo96347a = u5x0.f177682a;
            this.f117646b = oax0VarMo96347a;
        }
        this.f117647c = oax0VarMo96347a;
    }

    @Override // p153l.jww0
    /* JADX INFO: renamed from: a */
    public final byte[] mo95732a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (oxw0 oxw0Var : this.f117645a.m188525e(bArrCopyOf)) {
                try {
                    byte[] bArrMo95732a = ((jww0) oxw0Var.m169742e()).mo95732a(bArrCopyOfRange, bArr2);
                    oxw0Var.m169738a();
                    int length2 = bArrCopyOfRange.length;
                    return bArrMo95732a;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (oxw0 oxw0Var2 : this.f117645a.m188525e(oww0.f149585a)) {
            try {
                byte[] bArrMo95732a2 = ((jww0) oxw0Var2.m169742e()).mo95732a(bArr, bArr2);
                oxw0Var2.m169738a();
                return bArrMo95732a2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        phw0.m172339a("decryption failed");
        return null;
    }
}
