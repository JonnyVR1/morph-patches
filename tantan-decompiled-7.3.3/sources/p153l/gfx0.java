package p153l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public final class gfx0 implements nfx0 {
    @Override // p153l.nfx0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo130127a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
