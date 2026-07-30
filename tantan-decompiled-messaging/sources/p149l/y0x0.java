package p149l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class y0x0 implements mzw0 {

    /* JADX INFO: renamed from: a */
    public final tzw0 f195365a;

    public y0x0(tzw0 tzw0Var) throws GeneralSecurityException {
        if (mvw0.m156606a(2)) {
            this.f195365a = tzw0Var;
        } else {
            j8w0.m140474a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
