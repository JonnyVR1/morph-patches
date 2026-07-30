package p149l;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* JADX INFO: loaded from: classes6.dex */
public final class f6x0 implements h6x0 {
    @Override // p149l.h6x0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo95166a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
