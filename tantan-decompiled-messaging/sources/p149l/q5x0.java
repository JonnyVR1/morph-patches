package p149l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class q5x0 implements v5x0 {

    /* JADX INFO: renamed from: a */
    public final h6x0 f152832a;

    @Override // p149l.v5x0
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = w5x0.m201728b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.f152832a.mo95166a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.f152832a.mo95166a(str, null);
    }
}
