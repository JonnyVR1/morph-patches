package p153l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class afx0 implements bfx0 {

    /* JADX INFO: renamed from: a */
    public final nfx0 f71072a;

    @Override // p153l.bfx0
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = cfx0.m109658b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f71072a.mo130127a(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
