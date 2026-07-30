package p153l;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes6.dex */
public final class q4x0 extends ThreadLocal {
    /* JADX INFO: renamed from: a */
    public static final Cipher m175264a() {
        try {
            Cipher cipher = (Cipher) cfx0.f81598b.m109659a("AES/GCM-SIV/NoPadding");
            if (r4x0.m179831e(cipher)) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException e) {
            xpg0.m212648a(e);
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m175264a();
    }
}
