package p149l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public final class j5x0 extends ThreadLocal {
    /* JADX INFO: renamed from: a */
    public static final Cipher m139873a() {
        try {
            return (Cipher) w5x0.f184787b.m201729a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m139873a();
    }
}
