package p149l;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class cpw0 implements dnw0 {

    /* JADX INFO: renamed from: a */
    public final mow0 f82002a;

    /* JADX INFO: renamed from: b */
    public final i1x0 f82003b;

    /* JADX INFO: renamed from: c */
    public final i1x0 f82004c;

    public /* synthetic */ cpw0(mow0 mow0Var, bpw0 bpw0Var) {
        i1x0 i1x0VarMo139396a;
        this.f82002a = mow0Var;
        if (mow0Var.m155727f()) {
            j1x0 j1x0VarM200459b = vww0.m200458a().m200459b();
            s1x0 s1x0VarM166450a = oww0.m166450a(mow0Var);
            this.f82003b = j1x0VarM200459b.mo139396a(s1x0VarM166450a, "aead", "encrypt");
            i1x0VarMo139396a = j1x0VarM200459b.mo139396a(s1x0VarM166450a, "aead", "decrypt");
        } else {
            i1x0VarMo139396a = oww0.f146092a;
            this.f82003b = i1x0VarMo139396a;
        }
        this.f82004c = i1x0VarMo139396a;
    }

    @Override // p149l.dnw0
    /* JADX INFO: renamed from: a */
    public final byte[] mo108198a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (iow0 iow0Var : this.f82002a.m155726e(bArrCopyOf)) {
                try {
                    byte[] bArrMo108198a = ((dnw0) iow0Var.m137395e()).mo108198a(bArrCopyOfRange, bArr2);
                    iow0Var.m137391a();
                    int length2 = bArrCopyOfRange.length;
                    return bArrMo108198a;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (iow0 iow0Var2 : this.f82002a.m155726e(inw0.f114070a)) {
            try {
                byte[] bArrMo108198a2 = ((dnw0) iow0Var2.m137395e()).mo108198a(bArr, bArr2);
                iow0Var2.m137391a();
                return bArrMo108198a2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        j8w0.m140474a("decryption failed");
        return null;
    }
}
