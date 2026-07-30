package p153l;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class jfx0 implements nfx0 {
    @Override // p153l.nfx0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo130127a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
