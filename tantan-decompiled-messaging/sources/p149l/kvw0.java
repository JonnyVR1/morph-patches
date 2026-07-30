package p149l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public final class kvw0 extends ThreadLocal {
    /* JADX INFO: renamed from: a */
    public static final Cipher m147395a() {
        try {
            Cipher cipher = (Cipher) w5x0.f184787b.m201729a("AES/GCM-SIV/NoPadding");
            if (lvw0.m151920e(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            phg0.m168968a(e);
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m147395a();
    }
}
