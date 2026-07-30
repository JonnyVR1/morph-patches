package p149l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.KeyAgreement;

/* JADX INFO: loaded from: classes6.dex */
public final class b6x0 implements h6x0 {
    @Override // p149l.h6x0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95166a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
