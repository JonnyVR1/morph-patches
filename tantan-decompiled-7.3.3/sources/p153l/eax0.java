package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class eax0 implements s8x0 {

    /* JADX INFO: renamed from: a */
    public final z8x0 f92818a;

    public eax0(z8x0 z8x0Var) throws GeneralSecurityException {
        if (s4x0.m184598a(2)) {
            this.f92818a = z8x0Var;
        } else {
            phw0.m172339a("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            throw null;
        }
    }
}
