package p153l;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public final class dax0 implements s8x0 {

    /* JADX INFO: renamed from: a */
    public final y7x0 f85943a;

    public dax0(y7x0 y7x0Var) throws GeneralSecurityException {
        if (s4x0.m184598a(1)) {
            this.f85943a = y7x0Var;
        } else {
            phw0.m172339a("Can not use AES-CMAC in FIPS-mode.");
            throw null;
        }
    }
}
