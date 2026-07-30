package p149l;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: loaded from: classes6.dex */
public final class g6x0 implements h6x0 {
    @Override // p149l.h6x0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95166a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
