package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class x0x0 implements mzw0 {

    /* JADX INFO: renamed from: a */
    public final syw0 f189003a;

    public x0x0(syw0 syw0Var) throws GeneralSecurityException {
        if (mvw0.m156606a(1)) {
            this.f189003a = syw0Var;
        } else {
            j8w0.m140474a("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
    }
}
